import java.util.HashMap;
import java.util.Map;

public class ALifeSim {
	// Main method
	public static void main (String[] args) {
		int iterations = Integer.parseInt(args[0]);
		int cooperators = Integer.parseInt(args[1]);
		int defectors = Integer.parseInt(args[2]);
		int partialCooperators = Integer.parseInt(args[3]);
		Map<String, Integer> counts= new HashMap<String, Integer>();
		counts.put("Cooperators", cooperators);
		counts.put("Defectors", defectors);
		counts.put("Partial Cooperators", partialCooperators);
		Population pop = new Population(counts);
		
		
		// Report
		System.out.println("After " + iterations + "ticks:");
		System.out.println("Cooperators = " + cooperators);
		System.out.println("Defectors   = " + defectors);
		System.out.println("Partial     = " + partialCooperators);
		System.out.println("\nMean Cooperation Probability = " + pop.calculateCooperationMean());
	} // main
} // class ALifeSim
