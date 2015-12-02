package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.Category;

public class CategoryManager extends PersistentEntityManager<Category> {

	public CategoryManager() {
		super(Category.class);
	}

}
