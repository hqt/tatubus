package com.tatus.lib.model;

import java.util.Date;


public class BusRoute {
    private int busRouteId;
    private int code;
    private String name;
    private Date dateUpdated;
    private Date dateCreated;

    public BusRoute() {
        
    }
    
    public BusRoute(int busRouteId, int code, String name, Date dateUpdated, Date dateCreated) {
        this.busRouteId = busRouteId;
        this.code = code;
        this.name = name;
        this.dateUpdated = dateUpdated;
        this.dateCreated = dateCreated;
    }

    public int getBusRouteId() {
        return busRouteId;
    }

    public void setBusRouteId(int busRouteId) {
        this.busRouteId = busRouteId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "BusRoute{" + "busRouteId=" + busRouteId + ", code=" + code + ", name=" + name + ", dateUpdated=" + dateUpdated + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
    

}
