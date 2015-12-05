package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.PublishingHouse;

public class PublishingHouseManager extends PersistentEntityManager<PublishingHouse> {

    public PublishingHouseManager() {
        super(PublishingHouse.class);
    }

}
