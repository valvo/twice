package de.convamo.hibernate.twice.service;

import de.convamo.hibernate.twice.entity.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;

/**
 * Created by valeriusv on 29.02.16.
 */

interface MetadataRepository extends CrudRepository<Metadata, Long>,JpaRepository<Metadata,Long> {

}
