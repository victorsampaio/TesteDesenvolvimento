/**
 * 
 */
package br.com.testedesenvolvimento.dao;

import br.com.testedesenvolvimento.model.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * @author VictorSampaio
 * 
 */
public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				// Create the SessionFactory from standard (hibernate.cfg.xml)
				// config file.
				AnnotationConfiguration ac = new AnnotationConfiguration();
				ac.addAnnotatedClass(Filiais.class);
				sessionFactory = ac.configure().buildSessionFactory();
			} catch (Throwable ex) {
				// Log the exception.
				System.err.println("Initial SessionFactory creation failed."
						+ ex);
				throw new ExceptionInInitializerError(ex);
			}
			return sessionFactory;
		} else {
			return sessionFactory;
		}

	}
}
