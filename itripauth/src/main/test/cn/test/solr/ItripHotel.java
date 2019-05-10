package cn.test.solr;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class ItripHotel implements Serializable {
    @Field
    private int id;
    @Field
    private String hotelName;
    @Field
    private String address;

    public String[] getKeyword() {
        return keyword;
    }

    public void setKeyword(String[] keyword) {
        this.keyword = keyword;
    }

    @Field
    private String[] keyword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
