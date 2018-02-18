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
	public void update() {

		for (int i = 0; i < size; i++) {
			Organism o = population.get(i);
			
			// Update all organisms
			o.update();
			
			// Check cooperations
			if (o.cooperates() && o.getEnergy() >= 1) {
				o.decrementEnergy();
				for(int j = 0; j < 8; j++) {
					Organism receiver = population.get(new Random().nextInt(size));
					while (receiver == o)
						receiver = population.get(new Random().nextInt(size));
					receiver.incrementEnergy();
				} // for j
			} // if
			
			// Reproduce
			if (o.getEnergy() >= 10) {
				Organism offspring = o.reproduce();
				
				// Replace a random organism in the population
				int index = new Random().nextInt(size);
				population.remove(index);
				population.add(index,  offspring);
				
				o.energy -= 10;
			}
		} // for i	
	} // update
	
	public double calculateCooperationMean() {
		double total = 0.0;
		for (int i = 0; i < size; i++) {
			total += population.get(i).getCooperationProbability();
		}
		return total/size;
	} // calculateCooperationMean
	
	public Map<String, Integer> getPopulationCounts() {
		int cooperator = 0;
		int defector = 0;
		int partialCooperator = 0;
		
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
