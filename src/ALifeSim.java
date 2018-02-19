import java.util.HashMap;
import java.util.Map;

public class ALifeSim {
	// Main method
	public static void main (String[] args) {
		int iterations = Integer.parseInt(args[0]);

		Map<String, Integer> counts = new HashMap<>();
		counts.put("Cooperator", Integer.parseInt(args[1]));
		counts.put("Defector", Integer.parseInt(args[2]));
		counts.put("Partial Cooperator", Integer.parseInt(args[3]));
		
		// Repeats tick
		Population pop = new Population(counts);
		for (int i = 0; i < iterations; i++) {
			pop.update();
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
