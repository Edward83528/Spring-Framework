package lab2.ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Task2Client {

	public static void main(String[] args) {
		// -- Lab Ex1 Task2-1 Start -- //
		Resource resource = new ClassPathResource("lab2/ex1/beans-config.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		Product p = (Product) bf.getBean("productA");
		System.out.println(p);
		// -- Lab Ex1 Task2-1 End -- //
        // -- Lab Ex1 Task2-3 Start -- //
        // -- Lab Ex1 Task2-3 End -- //		
	}

}
