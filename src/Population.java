import java.util.Map;

public class Population {
	// Field
	private Map<String, Integer> counts;
	
	// Constructor
	public Population(Map<String, Integer> counts) throws IllegalArgumentException {
		this.counts = counts;
	}
	
	// Methods
	public void update() {
		for (String key : counts.keySet()) {
			if (key == "Cooperate") {
				//Cooperator c = new Cooperator();
				
		} else if (key == "Defector") {
			
		} else if (key == "Partial Cooperator") {
			
		}
		}
	} // update
	
	public double calculateCooperationMean() {
		int organismNum = counts.get("Cooperator") + counts.get("Defector") + counts.get("Partial Cooperator");
		return (counts.get("Cooperator") * 1.0 + counts.get("Partial Cooperator") * 0.5) / organismNum;
	} // calculateCooperationMean
	
	public Map<String, Integer> getPopulationCounts() {
		return counts;
	} // getPopulationCounts
} // class Population
