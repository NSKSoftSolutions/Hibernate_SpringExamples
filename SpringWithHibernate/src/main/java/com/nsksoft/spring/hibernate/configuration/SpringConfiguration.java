package com.nsksoft.spring.hibernate.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.nsksoft.spring.hibernate.bean.Brand;
import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.ItemList;
import com.nsksoft.spring.hibernate.bean.Likes;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.constants.Constant;
import com.nsksoft.spring.hibernate.repositry.SpringRepositry;
import com.nsksoft.spring.hibernate.service.ServiceImpl;

@Configuration
public class SpringConfiguration {
	Logger logger = Logger.getLogger(SpringConfiguration.class.getName());

	@Bean
	public DataSource addDataSource() {
		logger.info("Came inside the addDataSource and adding the Connection Properties");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(Constant.Driver_class_Name);
		dataSource.setUrl(Constant.URL);
		dataSource.setUsername(Constant.user_name);
		dataSource.setPassword(Constant.password);
		logger.info("returning the datasource object");
		return dataSource;
	}

	@Bean
	public SessionFactory addSessionFactory(DataSource dataSource) {
		logger.info("Sessionfactory Object is Created adding the Hibernate properties and Mapping files");
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		Properties prop = new Properties();
		prop.put("hibernate.dialect", Constant.hibernate_dialect);
		prop.put("hibernate.hbm2ddl.auto", Constant.hibernate_hbm2ddl_auto);
		prop.put("hibernate.show_sql", Constant.hibernate_show_sql);

		builder.addProperties(prop);
		builder.addAnnotatedClasses(User.class,Profile.class,Likes.class,Brand.class,Category.class,ItemList.class);
		logger.info("returning the sessionFactory");
		return builder.buildSessionFactory();

	}

	@Bean
	public HibernateTransactionManager add_transaction_manger(SessionFactory factory) {

		HibernateTransactionManager manager = new HibernateTransactionManager(factory);
		return manager;
	}

	@Bean
	public ServiceImpl addservice() {
		ServiceImpl s = new ServiceImpl();
		return s;
	}

	@Bean
	public SpringRepositry addrepo() {
		SpringRepositry repo = new SpringRepositry();
		logger.info("returning the Respositry");
		return repo;
	}

}
