package com.example.SofiaKnightsWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class SofiaKnightsWebApplication {

	@Configuration
	public class DatabaseConfig {
		@Bean

		public DataSource dataSource(){
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/sofiaknightsdb ");
			dataSource.setUsername( "root" );
			dataSource.setPassword( "nadya" );
			return dataSource;
		}
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}


	public static void main(String[] args) {
		SpringApplication.run(SofiaKnightsWebApplication.class, args);
	}
}
