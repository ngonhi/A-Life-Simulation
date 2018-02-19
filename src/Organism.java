import java.util.Random;

public abstract class Organism {
	// Fields
	protected int energy;

	// Constructor
	public Organism() {
		energy = 0;
	}

	// Methods
	/**
	 *  Updates the given organism. Organism gains one new energy point.
	 */
	public void update() {
		this.incrementEnergy();
	} // update

	/**
	 * Returns the current energy of this organism.
	 * @return energy, int
	 */
	public int getEnergy() {
		return energy;
	} //getEnergy

	/**
	 * Increments this organism’s energy by 1.
	 */
	public void incrementEnergy() {
		energy++;
	} // incrementEnergy

	/**
	 * Decrements this organism’s energy by 1.
	 * The organism's energy can never go below 0.
	 */
	public void decrementEnergy() {
		if (energy > 0)
			energy--;
		else
			energy = 0;
	} // decrementEnergy

	/**
	 * Returns the type of this Organism as a string.
	 * @return type, String
	 */
	public abstract String getType();		

	/**
	 * Creates an offspring organism and returns it. 
	 * Decreases organism’s energy by 10.
	 * @return Organism
	 */
	public abstract Organism reproduce();

	/**
	 * Returns the cooperation probability of this organism.
	 * @return cooperProb, double
	 */
	public abstract double getCooperationProbability();

	/**
	 * Returns whether or not the organism cooperates.
	 * @return true if the organism cooperates, else false, boolean
	 */
	public abstract boolean cooperates(Random rg);
} // class Organism
