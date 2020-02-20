package comjdbc;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmployeeRepo {
	static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public void addEmployee(Employee emp, Laptop lap,Laptop lap2,Laptop lap3) {
		// Physical connection to perform db operations
		Session session = sessionFactory.openSession();

		// Manual transactions
		Transaction tx = session.beginTransaction();
		session.save(lap);
		session.save(lap2);
		session.save(lap3);
		session.save(emp);
		
//		session.get(Employee.class, 1);
		
		//

		tx.commit();
		session.close();
		
	}
	public Employee fetchEmployee(Employee emp,int id) {
		Session session = sessionFactory.openSession();

		// Manual transactions
		Transaction tx = session.beginTransaction();
		//session.save(emp);
		
		emp=(Employee) session.get(Employee.class, id);

		tx.commit();
		session.close();
		
		return emp;
	}

	@Override
	protected void finalize(){
		HibernateUtil.closeSessionFactory();
	}
}