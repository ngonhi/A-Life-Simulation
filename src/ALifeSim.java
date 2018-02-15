import java.util.Map;

public class ALifeSim {
	// Main method
	public static void main (String[] args) {
		int iterations = Integer.parseInt(args[0]);
		int cooperators = Integer.parseInt(args[1]);
		int defectors = Integer.parseInt(args[2]);
		int partialCooperators = Integer.parseInt(args[3]);
		Map<String, Integer> population = new Map<String, Integer>();
		population.put("Cooperators", cooperators);
		population.put("Defectors", defectors);
		population.put("Partial Cooperators", partialCooperators);
		Population pop = Population(population);
		
		
		// Report
		System.out.println("After " + iterations + "ticks:");
		System.out.println("Cooperators = " + cooperators);
		System.out.println("Defectors   = " + defectors);
		System.out.println("Partial     = " + partialCooperators);
		System.out.println("\nMean Cooperation Probability = " + pop.calculateCooperationMean());
	} // main
} // class ALifeSim
