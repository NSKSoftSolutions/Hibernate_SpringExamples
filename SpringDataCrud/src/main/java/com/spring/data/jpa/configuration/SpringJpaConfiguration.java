package com.spring.data.jpa.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nsksoft.spring.hibernate.constants.Hibernate_Constants;


@Configuration
@EnableJpaRepositories(basePackages = {
		"com.spring.data.jpa.repos" }, entityManagerFactoryRef = "entityManagerFactory")
@ComponentScan(basePackages = { "com.spring.data.jpa.servicesss" })
@EnableTransactionManagement
public class SpringJpaConfiguration {

	@Bean
	public DataSource addDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(Hibernate_Constants.driver_class_name);
		dmds.setUrl(Hibernate_Constants.url);
		dmds.setUsername(Hibernate_Constants.user_name);
		dmds.setPassword(Hibernate_Constants.password);

		return dmds;
	}

	@Bean("entityManagerFactory")
	public EntityManagerFactory localcontainerentitymanagerbean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(addDataSource());
		bean.setJpaVendorAdapter(hibernatevendor_adapter());
		Properties prop = new Properties();
		prop.put("hibernate.dialect", Hibernate_Constants.hibernate_dialect);
		prop.put("hibernate.show_sql", Hibernate_Constants.hibernate_show_sql);
		prop.put("hibernate.hbm2ddl.auto", Hibernate_Constants.hibernate_hbm2ddl_auto);
		bean.setJpaProperties(prop);
		bean.setPackagesToScan("com.spring.data.jpa.bean");

		return (EntityManagerFactory) bean.getObject().createEntityManager();
	}

	@Bean
	public HibernateJpaVendorAdapter hibernatevendor_adapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		return adapter;

	}

	@Bean(name="jpaTransactionManager")
	public JpaTransactionManager jpatransactionManger() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		return jpaTransactionManager;
	}

	@Bean
    public PlatformTransactionManager dbTransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(localcontainerentitymanagerbean());
        return transactionManager;
    }
	
	
}
