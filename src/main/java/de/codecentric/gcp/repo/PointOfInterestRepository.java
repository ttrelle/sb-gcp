package de.codecentric.gcp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import de.codecentric.gcp.domain.PointOfInterest;

/**
 * This MongoDB repo is exposed via Spring Data REST.
 * @author tobias.trelle@codecentric.de
 */
@RestResource(path="/pois")
public interface PointOfInterestRepository extends MongoRepository<PointOfInterest, String> {
	// only std crud ops
}
