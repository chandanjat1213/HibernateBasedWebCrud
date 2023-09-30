package pp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmpDao {

	Session session = new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	
	public int addEmp(Emp e)
	{
		int i = (int) session.save(e);
		tx.commit();
		return i;
	}
	
	public List<Emp> showEmp()
	{
		 Query qr = session.createQuery("from Emp");
		 List<Emp> al = qr.list();
		 return al;
	}
	
	/*public void delete(int id)
	{
		Emp e = session.get(Emp.class, id);
		if(e != null)
		{
			session.delete(e);
			tx.commit();
		}
	}*/
	
	 public static int delete(int id)
	 {
	    	Session session = new Configuration().configure().buildSessionFactory().openSession();
	    	Transaction tx = session.beginTransaction();
	    	 
	    	Query qr = session.createQuery("delete from Emp where id=:id");
	    	qr.setParameter("id", id);
	        int i = qr.executeUpdate();
	    	tx.commit();
	    	session.close();
	    	return i;
	 }
	
	public void update(Emp e)
	{
		session.update(e);
		tx.commit();
	}
}
