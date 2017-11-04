package cz.expertkom.ju.task;

public class Car extends Item implements Nameable {
	
	private String jmeno;

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getName() {
		return this.jmeno;
	}

}
