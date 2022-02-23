package ShopGear.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopGear.Dto.PaginatesDto;
import ShopGear.Service.PaginateServiceImpl;

@Controller
public class CategoryController extends Common {
	
	@Autowired
	private PaginateServiceImpl paginateService;
	
	private int totalProductsPage = 8;
	@RequestMapping(value = { "/category/{id}" })
	public ModelAndView Category(@PathVariable int id) {
		boolean related=false;
		_mvShare.setViewName("user/home/index");
		_mvShare.addObject("products", _product.getProductByCate(id,related));
		int totalData = _product.getProductByCate(id, related).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage,1);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", _product.GetDataProductsPaginate(id,related ,paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Category(@PathVariable int id, @PathVariable int currentPage) {
		boolean related=false;
		_mvShare.setViewName("user/home/index");
		_mvShare.addObject("products", _product.getProductByCate(id,related));
		int totalData = _product.getProductByCate(id, related).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage,currentPage);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", _product.GetDataProductsPaginate(id,related ,paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
}
