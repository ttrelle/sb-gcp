package de.codecentric.gcp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "pois")
public class PointOfInterest {

	@Id private String id;
	
	private String name;
	
	@Field("desc") private String description;
	
	private GeoJsonPoint location;
}
