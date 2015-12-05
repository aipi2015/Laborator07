package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.SupplyOrderLine;

public class SupplyOrderLineManager extends PersistentEntityManager<SupplyOrderLine> {

    public SupplyOrderLineManager() {
        super(SupplyOrderLine.class);
    }

}
