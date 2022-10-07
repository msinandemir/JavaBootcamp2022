package kodalamaIo.core.valid;

import java.util.List;

import kodalamaIo.entities.Category;

public class CategoryValid {
	private List<Category> categories;


	public void checkCategoryName(List<Category> categories, String newCategoryName) throws Exception {
		this.categories = categories;

		for (Category category : categories) {
			if (category.getCategoryName().equals(newCategoryName)) {
				throw new Exception("Ekelemeye çalýþtýðýnýz kategori daha önce eklenmiþ");
			}
		}
	}

}
