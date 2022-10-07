package kodalamaIo.repos;

import java.util.ArrayList;
import java.util.List;

import kodalamaIo.entities.Category;

public class HibernateCategoryRepos implements CategoryRepos {
	List<Category> categories = new ArrayList<Category>();
	

	@Override
	public Category add(Category category) {
		System.out.println("Hibernate ile eklendi: " + category.getCategoryName());
		return category;
	}

	@Override
	public Category update(Category category) {
		System.out.println("Hibernate ile g�ncellendi: " + category.getCategoryName());
		return category;
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile silindi: " + category.getCategoryName());

	}

	@Override
	public List<Category> getAllCategories() {
		categories.add(new Category(1,"Java"));
		System.out.println("Hibernate ile t�m kategoriler getirildi");
		return categories;
	}

}
