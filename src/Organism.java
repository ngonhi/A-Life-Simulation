
public abstract class Organism {
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
	
	public abstract String getType();		
	
	public abstract Organism reproduce();
	
	public abstract double getCooperationProbability();
	
	public abstract boolean cooperates();
	
} // class Organism
