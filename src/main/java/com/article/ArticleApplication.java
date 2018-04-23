package com.article;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by polovnev on 03.01.18.
 */
@SpringBootApplication
@EnableCaching
@ComponentScan("com.article")
@EnableAutoConfiguration(exclude = FreeMarkerAutoConfiguration.class)
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class);
    }
    
}
