package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.Country;

public class CountryManager extends PersistentEntityManager<Country> {

    public CountryManager() {
        super(Country.class);
    }

}
