package ShopGear.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopGear.Dao.CategoryDao;
import ShopGear.Mapper.CategoryMapper;
import ShopGear.Model.CategoryModel;
@Service
public class CategoryServiceImpl extends BaseService implements ICategoryService{
	@Autowired
	CategoryDao _categoryDao;
	public List<CategoryModel> getAllCategory() {
		List<CategoryModel> listCategory=new ArrayList<CategoryModel>();
		listCategory=_jdbcTemplate.query(_categoryDao.sqlAllCategory(),new CategoryMapper());
		return listCategory;
	}
	

}