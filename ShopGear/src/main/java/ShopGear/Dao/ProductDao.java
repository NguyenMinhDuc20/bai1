package ShopGear.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	//trả danh sách các product kiểu ProducModel
	public StringBuffer sqlGetAllProduct() {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT * FROM product ");
		return sql;
	}
	public StringBuffer sqlHome() {
		StringBuffer sql=sqlGetAllProduct();
		
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 8 ");
		return sql;
	}
	public StringBuffer sqlGetProductById(long id) {
		StringBuffer sql=sqlGetAllProduct();
		sql.append(" WHERE id_product = "+id+ " ");
		return sql;
	}
	public StringBuffer sqlGetProductByIdCate(int id,boolean related) {
		StringBuffer sql=sqlGetAllProduct();
		sql.append(" WHERE id_category = "+id+ " ");
		if(related) {
			sql.append("ORDER BY RAND() ");
			sql.append(" LIMIT 4 ");
		}
		return sql;
	}
	
	
	
	
	public StringBuffer SqlProductsPaginate(int id,boolean related,int start, int totalPage) {
		StringBuffer sql =sqlGetProductByIdCate(id,related);
		sql.append("LIMIT " + start + ", "+ totalPage);
		return sql;
	}
	
	
	
}
