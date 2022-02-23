package ShopGear.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ShopGear.Service.ICategoryService;
import ShopGear.Service.IProductService;

@Controller
public class Common {
	@Autowired 
	IProductService _product;
	@Autowired
	ICategoryService _category;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init () {
		_mvShare.addObject("categorys",_category.getAllCategory());
		return _mvShare;
	}
}

