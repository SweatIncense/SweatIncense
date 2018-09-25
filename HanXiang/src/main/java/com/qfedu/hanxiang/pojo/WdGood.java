package com.qfedu.hanxiang.pojo;

import java.util.Date;

public class WdGood {
    private Integer id;

    private String goodname;

    private String goodno;

    private Date pubtime;

    private Integer tagprice;

    private String descible;

    private Double discount;

    private String color;

    private String sex;

    private Integer stid;

    private Integer bid;

    private Integer gsid;

    private Integer gtid;

    private Integer gtdid;

    private Integer flag;

    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public String getGoodno() {
        return goodno;
    }

    public void setGoodno(String goodno) {
        this.goodno = goodno == null ? null : goodno.trim();
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public Integer getTagprice() {
        return tagprice;
    }

    public void setTagprice(Integer tagprice) {
        this.tagprice = tagprice;
    }

    public String getDescible() {
        return descible;
    }

    public void setDescible(String descible) {
        this.descible = descible == null ? null : descible.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public Integer getGtdid() {
        return gtdid;
    }

    public void setGtdid(Integer gtdid) {
        this.gtdid = gtdid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}