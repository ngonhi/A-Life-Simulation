
public abstract class Organism {
	// Fields
	protected int energy;

	// Constructor
	public Organism() {
		energy = 0;
	}

	// Methods
	public void update() {
		if (energy > 10) {
			this.reproduce();
		} else {
			this.incrementEnergy();
		}
	} // update

	public int getEnergy() {
		return energy;
	} //getEnergy

	public void incrementEnergy() {
		energy++;
	} // incrementEnergy

	public void decrementEnergy() {
		if (energy > 0)
			energy--;
		else
			energy = 0;
	} // decrementEnergy

	public abstract String getType();		

	public abstract Organism reproduce();

	public abstract double getCooperationProbability();

	public abstract boolean cooperates();

} // class Organism
