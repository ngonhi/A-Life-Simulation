import java.util.Random;

public class Cooperator extends Organism{
	// Fields
	private double cooperProb;
	private String type;

	// Constructor 
	public Cooperator() {
		super();
		cooperProb = 1.0;
		type = "Cooperate";
	}

	// Methods
	public String getType() {
		return type;
	} //getType

	public Organism reproduce() {
		this.energy -= 10;
		return new Cooperator();
	} //reproduce

	public double getCooperationProbability() {
		return cooperProb;
	} //getCooperationProbability

	public boolean cooperates(Random rg) {
		return true;
	} //cooperates

} // class Cooperator
