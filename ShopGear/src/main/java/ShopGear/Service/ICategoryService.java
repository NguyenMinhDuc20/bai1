package ShopGear.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import ShopGear.Model.CategoryModel;
@Service
public interface ICategoryService {
	public List<CategoryModel> getAllCategory();
	
}
