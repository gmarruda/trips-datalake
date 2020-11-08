package br.com.iwe.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "trips")
public class Trip {

	@DynamoDBHashKey(attributeName = "country")
	private String country;

	@DynamoDBIndexRangeKey(attributeName = "city", localSecondaryIndexName = "cityIndex")
	private String city;

	@DynamoDBRangeKey(attributeName = "dateTrip")
	private String dateTrip;
	
	@DynamoDBIndexRangeKey(attributeName = "reason", localSecondaryIndexName = "reasonIndex")
	private String reason;

	public Trip(String country, String city, String dateTrip, String reason) {
		super();
		this.country = country;
		this.city = city;
		this.dateTrip = dateTrip;
		this.reason = reason;
	}

	public Trip() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDateTrip() {
		return dateTrip;
	}

	public void setDateTrip(String dateTrip) {
		this.dateTrip = dateTrip;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
