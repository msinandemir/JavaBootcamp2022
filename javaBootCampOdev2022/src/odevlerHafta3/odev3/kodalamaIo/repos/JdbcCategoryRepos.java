package kodalamaIo.repos;

import java.util.ArrayList;
import java.util.List;

import kodalamaIo.entities.Category;

public class JdbcCategoryRepos implements CategoryRepos{

	List<Category>categories = new ArrayList<Category>();
	@Override
	public Category add(Category category) {
		System.out.println("Jdbc ile eklendi: " + category.getCategoryName());
		return category;
	}

	@Override
	public Category update(Category category) {
		System.out.println("Jdbc ile güncellendi: " + category.getCategoryName());
		return category;
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile silindi: " + category.getCategoryName());
	}

	@Override
	public List<Category> getAllCategories() {
		categories.add(new Category(1,"Java"));
		System.out.println("Jdbc ile tüm kategoriler getirildi");
		return categories;
	}

}
