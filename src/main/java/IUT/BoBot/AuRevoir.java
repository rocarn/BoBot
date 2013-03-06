package IUT.BoBot;

public class AuRevoir implements SmartCell {

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
