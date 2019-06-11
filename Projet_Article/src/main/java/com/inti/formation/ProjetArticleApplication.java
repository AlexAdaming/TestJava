package com.inti.formation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.inti.formation.metier.ArticleMetier;
import com.inti.formation.models.Article;

@SpringBootApplication
public class ProjetArticleApplication implements CommandLineRunner {

	@Autowired
	private ArticleMetier metier;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetArticleApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Date d1 = new Date(2000, 1, 1);
		Date d2 = new Date(2000, 2, 2);
		Date d3 = new Date(2000, 3, 3);
		Article a1 = new Article(1, "Lettre A", "aaaa aaaaaa aaaaaaaa aaaaaa aaaaa aaaaaaa", "http://aaa.com", d1);
		Article a2 = new Article(2, "Lettre B", "bbbb bbbbbb bbbbbbbb bbbbbb bbbbb bbbbbbb", "http://bbb.com", d2);
		Article a3 = new Article(3, "Lettre C", "cccc cccccc cccccccc cccccc ccccc ccccccc", "http://ccc.com", d3);
		
//		metier.add(a1);
//		metier.add(a2);
//		metier.add(a3);
		
//		a1.setUrl("https://aaa.com");
//		metier.update(a1);
		
//		metier.delete(1);
		
		System.out.println(metier.findOne(2));
		
		List<Article> articles = metier.findAll();
		for (Article article : articles) {
			System.out.println(article);
		}


		
	}
	
}
