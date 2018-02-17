
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
		Organism offspring = new PartialCooperator();
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
