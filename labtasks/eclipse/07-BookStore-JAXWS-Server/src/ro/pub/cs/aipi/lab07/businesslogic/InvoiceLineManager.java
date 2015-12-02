package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.InvoiceLine;

public class InvoiceLineManager extends PersistentEntityManager<InvoiceLine> {
	
	public InvoiceLineManager() {
		super(InvoiceLine.class);
	}

}
