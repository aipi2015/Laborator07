package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.SupplyOrderHeader;

public class SupplyOrderHeaderManager extends PersistentEntityManager<SupplyOrderHeader> {

	public SupplyOrderHeaderManager() {
		super(SupplyOrderHeader.class);
	}

}
