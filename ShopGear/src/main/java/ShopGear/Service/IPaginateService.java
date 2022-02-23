package ShopGear.Service;

import org.springframework.stereotype.Service;

import ShopGear.Dto.PaginatesDto;

@Service
public interface IPaginateService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}