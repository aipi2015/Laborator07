package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.InvoiceHeader;

public class InvoiceHeaderManager extends PersistentEntityManager<InvoiceHeader> {
	
	public InvoiceHeaderManager() {
		super(InvoiceHeader.class);
	}

}
