package ShopGear.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import ShopGear.Model.ProductModel;
@Service
public interface IProductService {
	List<ProductModel> getAllProduct();
	ProductModel getProductById(long id);
	List<ProductModel> getProductByCate(int id,boolean related);
	public List<ProductModel> GetDataProductsPaginate( int id,boolean related,int start, int totalPage);
}
