package com.tatus.lib.model;

import java.util.Date;


public class BusStop {
    static enum BusStopType {
        a,
        b
    }
    
    private int busStopId;
    private float latitude;
    private float longitude;
    private String name;
    private String street;
    private String district;
    private BusStopType type;
    private Date dateUpdated;
    private Date dateCreated;
    
    public BusStop() {
        
    }

    public BusStop(int busStopId, float latitude, float longitude, String name, String street, String district, BusStopType type, Date dateUpdated, Date dateCreated) {
        this.busStopId = busStopId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.street = street;
        this.district = district;
        this.type = type;
        this.dateUpdated = dateUpdated;
        this.dateCreated = dateCreated;
    }

       public int getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(int busStopId) {
        this.busStopId = busStopId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public BusStopType getType() {
        return type;
    }

    public void setType(BusStopType type) {
        this.type = type;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "BusStop{" + "busStopId=" + busStopId + ", latitude=" + latitude + ", longitude=" + longitude + ", name=" + name + ", street=" + street + ", district=" + district + ", type=" + type + ", dateUpdated=" + dateUpdated + ", dateCreated=" + dateCreated + '}';
    }

   
    
    
    
    

    
}
