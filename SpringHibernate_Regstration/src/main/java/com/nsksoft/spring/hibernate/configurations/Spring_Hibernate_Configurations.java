package com.nsksoft.spring.hibernate.configurations;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.constants.Hibernate_Constants;
import com.nsksoft.spring.hibernate.reposotires.MyRepo;
import com.nsksoft.spring.hibernate.reposotires.RepositoryImpl;
import com.nsksoft.spring.hibernate.services.ServicesImpl;
import com.nsksoft.spring.hibernate.services.SpringServices;

@Configuration
public class Spring_Hibernate_Configurations {

	@Bean
	public DataSource addDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(Hibernate_Constants.driver_class_name);
		dmds.setUrl(Hibernate_Constants.url);
		dmds.setUsername(Hibernate_Constants.user_name);
		dmds.setPassword(Hibernate_Constants.password);

		return dmds;
	}

	@Bean
	public SessionFactory addSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

		Properties prop = new Properties();
		prop.put("hibernate.dialect", Hibernate_Constants.dialect);
		prop.put("hibernate.show_sql", Hibernate_Constants.show_sql);
		prop.put("hibernate.hbm2ddl.auto", Hibernate_Constants.hbm2ddl_auto);

		builder.addProperties(prop);

		builder.addAnnotatedClasses(User.class);

		return builder.buildSessionFactory();
	}

	@Bean
	public MyRepo addReposotory() {
		MyRepo r = new RepositoryImpl();

		return r;

	}

	@Bean
	public SpringServices addService() {

		SpringServices ss = new ServicesImpl();

		return ss;
	}

	@Bean
	public HibernateTransactionManager addHibernateTransaction_manager(SessionFactory factory) {

		HibernateTransactionManager manger = new HibernateTransactionManager(factory);
		return manger;

	}

}
