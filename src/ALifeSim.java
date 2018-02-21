import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ALifeSim {
	// longSeeds = {1, 2, 345663467, 8658, 9590000, 10, 24, 56, 24165120, 7456859}
	private final static long longSeed = 7456859;

	// Main method
	public static void main (String[] args) {
		int iterations = Integer.parseInt(args[0]);

		Map<String, Integer> counts = new HashMap<>();
		counts.put("Cooperator", Integer.parseInt(args[1]));
		counts.put("Defector", Integer.parseInt(args[2]));
		counts.put("Partial Cooperator", Integer.parseInt(args[3]));

		// Creates random generator
		Random rg = new Random(longSeed);    

		// Repeats tick
		Population pop = new Population(counts);
		for (int i = 0; i < iterations; i++) {
			pop.update(rg);
		}

		// Updates counts
		counts = pop.getPopulationCounts();

		// Reports
		System.out.println("After " + iterations + " ticks:");
		System.out.println("Cooperators = " + counts.get("Cooperator"));
		System.out.println("Defectors   = " + counts.get("Defector"));
		System.out.println("Partial     = " + counts.get("Partial Cooperator"));
		System.out.println("\nMean Cooperation Probability = " + pop.calculateCooperationMean());
	} // main
} // class ALifeSim
