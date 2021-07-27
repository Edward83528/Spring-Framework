package lab3.ex2;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class ProductDaoImpl extends NamedParameterJdbcDaoSupport implements
		ProductDao {
	
	private ProductRowMapper productRowMapper;

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		SqlParameterSource namedParameters = new MapSqlParameterSource("productId", id);
		return (Product) this.getNamedParameterJdbcTemplate().
				queryForObject("select * from product where id = :productId", 
						namedParameters, this.productRowMapper);
	}

	public ProductRowMapper getProductRowMapper() {
		return productRowMapper;
	}

	public void setProductRowMapper(ProductRowMapper productRowMapper) {
		this.productRowMapper = productRowMapper;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)this.getJdbcTemplate().query("select * from product", productRowMapper);
	}

	@Override
	public int insert(Product product) {
		// TODO Auto-generated method stub
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource params = new MapSqlParameterSource("name",product.getName()).
													 addValue("desc", product.getDescription());
		this.getNamedParameterJdbcTemplate().update("insert into product (`name`,`desc`) values (:name, :desc)", 
														params, keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		SqlParameterSource params = new MapSqlParameterSource("id", product.getProductId())
												.addValue("name", product.getName())
												.addValue("desc", product.getDescription());
		this.getNamedParameterJdbcTemplate().
			update("update product set product.name=:name, product.desc=:desc where id=:id", params);
		
	}

}
