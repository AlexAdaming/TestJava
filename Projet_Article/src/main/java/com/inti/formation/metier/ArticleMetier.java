package com.inti.formation.metier;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.imetier.IArticleMetier;
import com.inti.formation.models.Article;
import com.inti.formation.repository.IArticleRepository;

@Service
public class ArticleMetier implements IArticleMetier {

//	--------------
	@Autowired
	@Qualifier("adao")
	private IArticleRepository dao;
		
	public IArticleRepository getDao() {
		return dao;
	}
	public void setDao(IArticleRepository dao) {
		this.dao = dao;
	}
//	--------------

	@Override
	public Article add(Article p) {
		return dao.save(p);
	}

	@Override
	public Article update(Article p) {
		return dao.save(p);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public Article findOne(Integer id) {
		return dao.getOne(id);
	}

	@Override
	public List<Article> findAll() {
		return dao.findAll();
	}

}
