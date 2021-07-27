package lab3.ex1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex1/beans-config.xml");
		// 請在下方寫作一段程式碼，取得pooledDataSource的實體，
		// 並印出任意屬性值，以測試資料庫是否連通。
		DataSource ds = (DataSource)context.getBean("pooledDataSource");
		try {
			Connection c1 = ds.getConnection();
			new Thread(){
				public void run(){
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						try {
							c1.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			}.start();
			Connection c2 = ds.getConnection();
			Connection c3 = ds.getConnection();
			Connection c4 = ds.getConnection();
			Connection c5 = ds.getConnection();
			Connection c6 = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Bye Bye!!!");

		
	}

}
