package cz.expertkom.ju.task;

import java.util.Date;

public abstract class Item {

	public Item() {
		this.created = new Date();
	}
	
	public Item(Date created) {
		super();
		this.created = created;
	}

	private final Date created;

	public Date getCreated() {
		return created;
	}

	
}
