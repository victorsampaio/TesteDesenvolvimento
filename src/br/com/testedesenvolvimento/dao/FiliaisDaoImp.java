/**
 * 
 */
package br.com.testedesenvolvimento.dao;
import br.com.testedesenvolvimento.model.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * @author VictorSampaio
 *
 */
public abstract class FiliaisDaoImp implements FiliaisDao{
	
	public void save(Filiais filiais) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(filiais);
		t.commit();
		} 
	
	public Filiais getFiliais(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Filiais) session.load(Filiais.class, id);
		
	}
	
	public List<filiais> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Filiais").list();
		t.commit();
		return lista;
		}
	
	public void remove(Filiais filiais) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(filiais);
		t.commit();
		}
		public void update(Filiais filiais) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(filiais);
		t.commit();
		}
		
		

}
