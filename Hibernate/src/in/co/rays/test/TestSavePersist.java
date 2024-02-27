package in.co.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;

public class TestSavePersist {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setName("pranav");
		
		dto.setLoginId("pranav@gmail.com");
		dto.setPassword("123");
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		int i = (int) session.save(dto);

		System.out.println("i => " + i);

		// session.persist(dto);

		// session.saveOrUpdate(dto);

		tx.commit();

		session.close();

	}
}
