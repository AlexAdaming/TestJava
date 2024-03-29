package com.inti.formation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.inti.formation.models.Article;

@Repository("adao")
public interface IArticleRepository extends JpaRepository<Article, Integer>{

}
