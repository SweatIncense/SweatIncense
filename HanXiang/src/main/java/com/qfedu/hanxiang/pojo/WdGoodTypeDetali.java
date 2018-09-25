package com.qfedu.hanxiang.pojo;

public class WdGoodTypeDetali {
    private Integer id;

    private String gtdname;

    private Integer gtid;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGtdname() {
        return gtdname;
    }

    public void setGtdname(String gtdname) {
        this.gtdname = gtdname == null ? null : gtdname.trim();
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}