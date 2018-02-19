import java.util.Random;


public class PartialCooperator extends Organism{
	// Fields
	private double cooperProb;
	private String type;

	// Constructor
	public PartialCooperator() {
		super();
		cooperProb = 0.5;
		type = "PartialCooperator";
	}

	// Methods
	public String getType() {
		return type;
	} //getType

	public Organism reproduce() {
		this.energy -= 10;
		return new PartialCooperator();
	} //reproduce

	public double getCooperationProbability() {
		return cooperProb;
	} //getCooperationProbability

	// Organism of type PartialCooperator cooperates 50% of the time
	public boolean cooperates(Random rg) {
		return (rg.nextInt(100) < 50);
	} //cooperates

} // class PartialCooperator
