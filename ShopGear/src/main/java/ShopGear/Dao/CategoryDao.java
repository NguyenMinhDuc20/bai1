package ShopGear.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao {
	public String sqlAllCategory() {
		String sql="SELECT * FROM category";
		return sql;
	}
}
