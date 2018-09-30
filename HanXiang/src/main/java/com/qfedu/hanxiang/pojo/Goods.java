package com.qfedu.hanxiang.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String goodname;

    private String goodno;

    private Date pubtime;

    private Integer tagprice;

    private String descible;

    private Double discount;

    private String color;

    private String sportitem;

    private String brand;

    private String goodsize;

    private String goodtype;

    private String goodtypedetail;

    private Integer flag;

    private String pic;

    private String comment;

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

    public String getSportitem() {
        return sportitem;
    }

    public void setSportitem(String sportitem) {
        this.sportitem = sportitem == null ? null : sportitem.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getGoodsize() {
        return goodsize;
    }

    public void setGoodsize(String goodsize) {
        this.goodsize = goodsize == null ? null : goodsize.trim();
    }

    public String getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(String goodtype) {
        this.goodtype = goodtype == null ? null : goodtype.trim();
    }

    public String getGoodtypedetail() {
        return goodtypedetail;
    }

    public void setGoodtypedetail(String goodtypedetail) {
        this.goodtypedetail = goodtypedetail == null ? null : goodtypedetail.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}