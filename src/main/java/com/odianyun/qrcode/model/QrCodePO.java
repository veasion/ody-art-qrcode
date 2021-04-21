package com.odianyun.qrcode.model;

import java.io.Serializable;
import java.util.Date;

public class QrCodePO implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;
    private String qrcode;
    private String ip;
    private String styleJson;
    private Long isDeleted;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStyleJson() {
        return styleJson;
    }

    public void setStyleJson(String styleJson) {
        this.styleJson = styleJson;
    }

    public Long getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
