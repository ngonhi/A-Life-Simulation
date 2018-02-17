
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
		Organism offspring = new Defector();
		this.decrementEnergy();

		return offspring;
	} //reproduce

	public double getCooperationProbability() {
		return cooperProb;
	} //getCooperationProbability

	public boolean cooperates() {
		return false;
	} //cooperates
}
