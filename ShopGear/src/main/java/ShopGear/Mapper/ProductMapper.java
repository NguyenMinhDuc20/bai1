package ShopGear.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ShopGear.Model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel>{

	public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductModel product=new ProductModel();
		product.setId_product(rs.getLong("id_product"));
		product.setId_category(rs.getInt("id_category"));
		product.setName(rs.getString("name"));
		product.setImg(rs.getString("img"));
		product.setPrice(rs.getDouble("price"));
		product.setSale(rs.getInt("sale"));
		product.setDetails(rs.getString("details"));
		product.setCreate_date(rs.getDate("create_date"));
		return product;
	}

}
