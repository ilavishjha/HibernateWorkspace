package in.co.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;

public class TestUpdateMerge {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto1 = (UserDTO) session.get(UserDTO.class, 1);

		session.close();

		dto1.setName("cc");

		Session session2 = sf.openSession();

		Transaction tx = session2.beginTransaction();

		session2.merge(dto1);

		// session2.update(dto1);

		tx.commit();

		session2.close();

	}

}
