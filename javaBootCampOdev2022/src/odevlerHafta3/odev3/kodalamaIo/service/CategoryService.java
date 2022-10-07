package kodalamaIo.service;

import java.util.List;

import kodalamaIo.core.log.BaseLogger;
import kodalamaIo.core.valid.CategoryValid;
import kodalamaIo.entities.Category;
import kodalamaIo.repos.CategoryRepos;

public class CategoryService {
	private CategoryRepos categoryRepos;
	private CategoryValid categoryValid;
	private List<Category> categories;
	private List<BaseLogger> loggers;

	public CategoryService(CategoryRepos categoryRepos, CategoryValid categoryValid, List<BaseLogger> loggers) {
		this.categoryRepos = categoryRepos;
		this.categoryValid = categoryValid;
		this.loggers = loggers;
	}

	public List<Category> getAllCategories() {

		return categories = categoryRepos.getAllCategories();
	}
	
	public Category add(Category category) throws Exception {
		categoryValid.checkCategoryName(getAllCategories(), category.getCategoryName());
		categoryRepos.add(category);
		for(BaseLogger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		return category;
	}
	
	public Category update(Category category)throws Exception {
		categoryValid.checkCategoryName(getAllCategories(), category.getCategoryName());
		categoryRepos.update(category);
		for(BaseLogger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		return category;
	}
	
	public void delete(Category category) {
		for(BaseLogger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		categoryRepos.delete(category);
	}

}
