/**
 * 
 */
package br.com.testedesenvolvimento.dao;

import java.util.List;

import br.com.testedesenvolvimento.model.Filiais;

/**
 * @author VictorSampaio
 *
 */
public interface FiliaisDao {
	public interface LivroDao {
		 
		public void save(Filiais filiais);
		public Filiais getFiliais(long id);
		public List<filiais> list();
		public void remove(Filiais filiais);
		public void update(Filiais filiais);
		 
		}
}
