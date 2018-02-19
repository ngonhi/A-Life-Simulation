import java.util.Random;

public class Defector extends Organism{
	// Fields
	private double cooperProb;
	private String type;

	// Constructor
	public Defector() {
		super();
		cooperProb = 0.0;
		type = "Defector";
	}

	// Methods
	public String getType() {
		return type;
	} //getType

	public Organism reproduce() {
		this.energy -= 10;
		return new Defector();
	} //reproduce

	public double getCooperationProbability() {
		return cooperProb;
	} //getCooperationProbability

	public boolean cooperates(Random rg) {
		return false;
	} //cooperates

} // class Defector
