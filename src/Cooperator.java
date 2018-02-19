<<<<<<< HEAD
import java.util.Random;

=======
>>>>>>> 5d17d8927b6c78373298426b83617bd04a4808ba
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
<<<<<<< HEAD
	
	public boolean cooperates(Random rg) {
=======

	public boolean cooperates() {
>>>>>>> 5d17d8927b6c78373298426b83617bd04a4808ba
		return true;
	} //cooperates

} // class Cooperator
