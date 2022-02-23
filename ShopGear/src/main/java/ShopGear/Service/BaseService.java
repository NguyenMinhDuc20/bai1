package ShopGear.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseService {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

}
