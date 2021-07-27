package lab5.ex2;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;



public class ProductDaoHibernateImpl extends HibernateDaoSupport implements
		ProductDao {

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return (Product) this.getHibernateTemplate().execute(
					new HibernateCallback() {
						@Override
						public Object doInHibernate(Session session) throws HibernateException {
							// TODO Auto-generated method stub
							return session.createCriteria(Product.class)
									.add(Expression.eq("id", id))
									.uniqueResult();
						}						
					}
				);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)this.getHibernateTemplate().find("from Product p");
	}

	@Override
	@Transactional
	public void save(Product product) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(product);
	}
	

}