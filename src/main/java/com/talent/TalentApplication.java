package com.talent;

import com.talent.domain.Level;
import com.talent.domain.Repository;
import com.talent.domain.Talent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TalentApplication {

	static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(TalentApplication.class, args);

		Repository repository = applicationContext.getBean(Repository.class);

		Talent talent = new Talent();
		talent.setTalentName("피아노");
		talent.setLevel(Level.High);

		repository.save(talent);

		System.out.println("talent : id=" + talent.getId() + " , talentName=" + talent.getTalentName() + " , level="
				+ talent.getLevel());

	}

}
