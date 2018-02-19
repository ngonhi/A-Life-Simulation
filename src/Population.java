
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Population {

	// Field
	private ArrayList<Organism> population;
	private int size;

	// Constructor
	public Population(Map<String, Integer> counts) throws IllegalArgumentException {
		size = counts.get("Cooperator") + counts.get("Defector") + counts.get("Partial Cooperator");

		population = new ArrayList<Organism>(size);

		for (int i = 0; i < counts.get("Cooperator"); i++) {
			population.add(new Cooperator());
		}

		for (int j = 0; j < counts.get("Defector"); j++) {
			population.add(new Defector());
		}

		for (int k = 0; k < counts.get("Partial Cooperator"); k++) {
			population.add(new PartialCooperator());
		}
	}

	// Methods
	/** 
	 * Loops through all organisms to
	 * 1. Update them
	 * 2. Check their cooperation
	 * 3. Check their reproduction
	 */
	public void update(Random rg) {
		// Iterating through all the organisms
		for (int i = 0; i < size; i++){
			Organism o = population.get(i);

			// Update all organisms
			o.update();

			// Check cooperations
			if (o.cooperates(rg) && o.getEnergy() >= 1) {
				o.decrementEnergy(); // Organism loses energy
				for(int j = 0; j < 8; j++) { // 8 random organisms gain 1 energy point
					Organism receiver = population.get(rg.nextInt(size));
					while (receiver == o)
						receiver = population.get(rg.nextInt(size));
					receiver.incrementEnergy();
				} // for j
			} // if

			// Reproduction
			if (o.getEnergy() >= 10) {
				Organism offspring = o.reproduce();

				// Replaces a random organism in the population
				int index = rg.nextInt(size);
				population.remove(index);
				population.add(index, offspring);
			}
		} // for i	
	} // update

	/**
	 * Calculates the mean cooperation probability of all the organisms in the population
	 * @return double
	 */
	public double calculateCooperationMean() {
		double total = 0.0;

		for (int i = 0; i < size; i++) {
			total += population.get(i).getCooperationProbability();
		}
		return total/size;
	} // calculateCooperationMean

	/**
	 * Returns the counts of all the organisms in the population
	 * @return counts, Map<String, Integer>
	 */
	public Map<String, Integer> getPopulationCounts() {
		int cooperator = 0;
		int defector = 0;
		int partialCooperator = 0;

		// Calculating the number of organisms of each type
		for (int i = 0; i < size; i++) {
			if (population.get(i) instanceof Cooperator)
				cooperator++;
			else if (population.get(i) instanceof Defector)
				defector++;
			else if (population.get(i) instanceof PartialCooperator)
				partialCooperator++;
		}

		Map<String,Integer> counts = new HashMap<>();
		counts.put("Cooperator", cooperator);
		counts.put("Defector", defector);
		counts.put("Partial Cooperator", partialCooperator);

		return counts;
	} // getPopulationCounts

} // class Population
