package kodalamaIo.repos;

import java.util.List;

import kodalamaIo.entities.Category;

public interface CategoryRepos {
	Category add(Category category);
	Category update(Category category);
	void delete(Category category);
	List<Category>getAllCategories();

}
