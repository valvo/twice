package de.convamo.hibernate.twice;

import de.convamo.hibernate.twice.entity.Metadata;
import de.convamo.hibernate.twice.service.MetadataService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class TwiceApplication {

    private static final Logger LOGGER = LogManager.getLogger(TwiceApplication.class);



	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TwiceApplication.class, args);
        LOGGER.info("TwiceApplication - Beans:");
/*		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			LOGGER.info(beanName);
		}*/
        MetadataService metadataService = (MetadataService) ctx.getBean("metadataService");

        metadataService.doItAll();
/*
        Metadata metadata1 = metadataService.saveAndRead();
		metadata1.setTitle("its another title");
        Metadata metadata2 = metadataService.readMetadata();
		LOGGER.info("metadata1.toString():" + metadata1.toString());
        LOGGER.info("metadata2.toString():" + metadata2.toString());
*/
	}
}
