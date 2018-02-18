import java.util.HashMap;
import java.util.Map;

public class ALifeSim {
	// Main method
	public static void main (String[] args) {
		int iterations = Integer.parseInt(args[0]);
//		int cooperators = Integer.parseInt(args[1]);
//		int defectors = Integer.parseInt(args[2]);
//		int partialCooperators = Integer.parseInt(args[3]);
		
		Map<String, Integer> counts= new HashMap<>();
		counts.put("Cooperator", Integer.parseInt(args[1]));
		counts.put("Defector", Integer.parseInt(args[2]));
		counts.put("Partial Cooperator", Integer.parseInt(args[3]));
		
		// Iterate
		Population pop = new Population(counts);
		for (int i = 0; i < iterations; i++) {
			pop.update();
		}
		
		// Update counts
		counts = pop.getPopulationCounts();
		
		// Report
		System.out.println("After " + iterations + "ticks:");
		System.out.println("Cooperators = " + counts.get("Cooperator"));
		System.out.println("Defectors   = " + counts.get("Defector"));
		System.out.println("Partial     = " + counts.get("Partial Cooperator"));
		System.out.println("\nMean Cooperation Probability = " + pop.calculateCooperationMean());
	} // main
} // class ALifeSim
