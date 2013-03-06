package IUT.BoBot.SmartCells;

public class AuRevoirCellTest {

	/**
	 * @param args
	 */
	public String ask(String question) {
		if(question.contains("AuRevoir"))
		  return "Aurevoir!";
		else
		  return null;
	}

}