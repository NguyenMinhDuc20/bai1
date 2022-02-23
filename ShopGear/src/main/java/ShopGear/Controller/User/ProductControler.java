package ShopGear.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopGear.Service.IProductService;

@Controller
public class ProductControler extends Common{
	@Autowired
	private IProductService product;
	@RequestMapping(value= "detail/{id_product}/{id_category}")
	public ModelAndView Product(@PathVariable long id_product,@PathVariable int id_category) {
		_mvShare.addObject("productById",product.getProductById(id_product));
		_mvShare.addObject("productsRealted", _product.getProductByCate(id_category,true));
		_mvShare.setViewName("user/detail_product/body");
		return _mvShare;
		
	}
	
}