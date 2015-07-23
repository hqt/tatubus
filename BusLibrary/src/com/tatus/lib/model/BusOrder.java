package com.tatus.lib.model;

import java.util.Date;


public class BusOrder {
    private int busOrderId;
    private int busRouteId;
    private int busStopId;
    private int order;
    private Date dateUpdated;
    private Date dateCreated;

    public BusOrder() {
    }

    public BusOrder(int busOrderId, int busRouteId, int busStopId, int order, Date dateUpdated, Date dateCreated) {
        this.busOrderId = busOrderId;
        this.busRouteId = busRouteId;
        this.busStopId = busStopId;
        this.order = order;
        this.dateUpdated = dateUpdated;
        this.dateCreated = dateCreated;
    }

    public int getBusOrderId() {
        return busOrderId;
    }

    public void setBusOrderId(int busOrderId) {
        this.busOrderId = busOrderId;
    }

    public int getBusRouteId() {
        return busRouteId;
    }

    public void setBusRouteId(int busRouteId) {
        this.busRouteId = busRouteId;
    }

    public int getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(int busStopId) {
        this.busStopId = busStopId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
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
        return "BusOrder{" + "busOrderId=" + busOrderId + ", busRouteId=" + busRouteId + ", busStopId=" + busStopId + ", order=" + order + ", dateUpdated=" + dateUpdated + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
}
