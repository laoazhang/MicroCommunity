package com.java110.dto.account;

import com.java110.dto.PageDto;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 开户行数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class AccountBankDto extends PageDto implements Serializable {

    private String personName;
private String bankCode;
private String bankId;
private String bankName;
private String shopId;
private String personTel;


    private Date createTime;

    private String statusCd = "0";


    public String getPersonName() {
        return personName;
    }
public void setPersonName(String personName) {
        this.personName = personName;
    }
public String getBankCode() {
        return bankCode;
    }
public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
public String getBankId() {
        return bankId;
    }
public void setBankId(String bankId) {
        this.bankId = bankId;
    }
public String getBankName() {
        return bankName;
    }
public void setBankName(String bankName) {
        this.bankName = bankName;
    }
public String getShopId() {
        return shopId;
    }
public void setShopId(String shopId) {
        this.shopId = shopId;
    }
public String getPersonTel() {
        return personTel;
    }
public void setPersonTel(String personTel) {
        this.personTel = personTel;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }
}
