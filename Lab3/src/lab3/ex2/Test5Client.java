package lab3.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
	    // �b�U���[�J�{���X
		Product p = new Product();
		p.setProductId(3);
		p.setName("Zebra");
		p.setDescription("This is a zebra");
		
		productDao.update(p);
	}

}
