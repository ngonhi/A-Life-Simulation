
public class Organism {
	// Fields
	public int energy;
	public int coopProb;
	
	// Constructor
	public Organism() {
		
	}
	
	// Methods
	public void update() {
		
	} // update
	
	public int getEnergy() {
		return energy;
	} //getEnergy
	
	public void incrementEnergy() {
		energy++;
	} // incrementEnergy
	
	public void decrementEnergy() {
		energy--;
	} // decrementEnergy
	
	public abstract String getType() {
		
	} // getType
	
	public abstract Organism reproduce() {
		
	} // reproduce
	
	public abstract double getCooperationProbability() {
		
	} // getCooperationProbability
	
	public abstract boolean cooperates() {
		
	} // cooperates
	
} // class Organism
