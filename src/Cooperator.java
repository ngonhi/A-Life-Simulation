
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
		Organism offspring = new Cooperator();
		this.decrementEnergy();
		
		return offspring;
	} //reproduce
	
	public double getCooperationProbability() {
		return cooperProb;
	} //getCooperationProbability
	
	public boolean cooperates() {
		return true;
	} //cooperates
	
}
