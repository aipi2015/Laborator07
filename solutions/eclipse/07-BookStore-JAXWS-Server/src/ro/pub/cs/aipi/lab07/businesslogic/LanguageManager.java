package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.Language;

public class LanguageManager extends PersistentEntityManager<Language> {
	
	public LanguageManager() {
		super(Language.class);
	}

}
