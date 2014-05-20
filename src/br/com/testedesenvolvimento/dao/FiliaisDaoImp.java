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

}
