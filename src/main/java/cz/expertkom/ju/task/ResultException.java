package cz.expertkom.ju.task;

public class ResultException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String reason;

	public ResultException(String string) {
		this.reason = string;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
