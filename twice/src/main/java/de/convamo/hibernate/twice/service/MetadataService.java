package de.convamo.hibernate.twice.service;

import de.convamo.hibernate.twice.entity.Metadata;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by valeriusv on 29.02.16.
 */
@Component("metadataService")
@Transactional
public class MetadataService {
    private static final Logger LOGGER = LogManager.getLogger(MetadataService.class);
    private final MetadataRepository metadataRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public MetadataService(MetadataRepository metadataRepository) {
        this.metadataRepository = metadataRepository;
    }



    public Metadata saveAndRead() {
        LOGGER.info("Aufruf saveAndRead");
        Metadata metadata = new Metadata();
        metadata.setId(1L);
        metadata.setTitle("hello, this is an metadata");
        return metadataRepository.save(metadata);
    }

    public Metadata readMetadata() {
        return metadataRepository.findOne(1L);
    }

    public void doItAll() {
        Metadata metadata1 = saveAndRead();
        metadata1.setTitle("yeah, another title");
        entityManager.detach(metadata1);
        Metadata metadata2 = readMetadata();
        LOGGER.info("metadata1.toString():" + metadata1.toString());
        LOGGER.info("metadata2.toString():" + metadata2.toString());

    }
}
