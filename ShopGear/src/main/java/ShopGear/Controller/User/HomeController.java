package ShopGear.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends Common{

	
	@RequestMapping(value= {"/","/trang-chu"})
	public ModelAndView Home() {
		_mvShare.addObject("products", _product.getAllProduct());
		_mvShare.setViewName("user/home/index");
			
		return _mvShare;
		
	}

}
