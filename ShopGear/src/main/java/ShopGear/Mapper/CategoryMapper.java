package ShopGear.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ShopGear.Model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel>{

	public CategoryModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategoryModel category=new CategoryModel();
		category.setId_category(rs.getInt("id_category"));
		category.setName(rs.getString("name"));
		return category;
	}

}
