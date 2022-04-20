package com.demo.talent;


import java.util.Date;

import com.demo.talent.domain.Level;
import com.demo.talent.domain.Repository;
import com.demo.talent.domain.Talent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TalentApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(TalentApplication.class, args);

		Repository repository = applicationContext.getBean(Repository.class);

		Talent talent = new Talent();
		talent.setRecentActivityDate(new Date());
		talent.setLevel(Level.고수);

		repository.save(talent);

		System.out.println(talent.check잠수() == false);

	}

}
