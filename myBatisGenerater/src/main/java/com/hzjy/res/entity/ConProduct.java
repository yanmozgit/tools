package com.hzjy.res.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ConProduct implements Serializable {
    private BigDecimal id;

    private Date createTime;

    private String dataSource;

    private String offerDesc;

    private String offerId;

    private String offerName;

    private String offerUnitCode;

    private Long offerValidate;

    private Double originPrice;

    private Double price;

    private String remark1;

    private String remark2;

    private Date updateTime;

    private Long chargeType;

    private String createUser;

    private Date discountDateBengin;

    private Date discountDateEnd;

    private Double discountPrice;

    private Long enableState;

    private String examineDesc;

    private Long examineState;

    private Long hotelType;

    private Long releaseState;

    private BigDecimal remark3;

    private BigDecimal remark4;

    private String updateUser;

    private Long userType;

    private String examineUser;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getOfferDesc() {
        return offerDesc;
    }

    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferUnitCode() {
        return offerUnitCode;
    }

    public void setOfferUnitCode(String offerUnitCode) {
        this.offerUnitCode = offerUnitCode;
    }

    public Long getOfferValidate() {
        return offerValidate;
    }

    public void setOfferValidate(Long offerValidate) {
        this.offerValidate = offerValidate;
    }

    public Double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getChargeType() {
        return chargeType;
    }

    public void setChargeType(Long chargeType) {
        this.chargeType = chargeType;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getDiscountDateBengin() {
        return discountDateBengin;
    }

    public void setDiscountDateBengin(Date discountDateBengin) {
        this.discountDateBengin = discountDateBengin;
    }

    public Date getDiscountDateEnd() {
        return discountDateEnd;
    }

    public void setDiscountDateEnd(Date discountDateEnd) {
        this.discountDateEnd = discountDateEnd;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getEnableState() {
        return enableState;
    }

    public void setEnableState(Long enableState) {
        this.enableState = enableState;
    }

    public String getExamineDesc() {
        return examineDesc;
    }

    public void setExamineDesc(String examineDesc) {
        this.examineDesc = examineDesc;
    }

    public Long getExamineState() {
        return examineState;
    }

    public void setExamineState(Long examineState) {
        this.examineState = examineState;
    }

    public Long getHotelType() {
        return hotelType;
    }

    public void setHotelType(Long hotelType) {
        this.hotelType = hotelType;
    }

    public Long getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Long releaseState) {
        this.releaseState = releaseState;
    }

    public BigDecimal getRemark3() {
        return remark3;
    }

    public void setRemark3(BigDecimal remark3) {
        this.remark3 = remark3;
    }

    public BigDecimal getRemark4() {
        return remark4;
    }

    public void setRemark4(BigDecimal remark4) {
        this.remark4 = remark4;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Long getUserType() {
        return userType;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

    public String getExamineUser() {
        return examineUser;
    }

    public void setExamineUser(String examineUser) {
        this.examineUser = examineUser;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConProduct other = (ConProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
            && (this.getOfferDesc() == null ? other.getOfferDesc() == null : this.getOfferDesc().equals(other.getOfferDesc()))
            && (this.getOfferId() == null ? other.getOfferId() == null : this.getOfferId().equals(other.getOfferId()))
            && (this.getOfferName() == null ? other.getOfferName() == null : this.getOfferName().equals(other.getOfferName()))
            && (this.getOfferUnitCode() == null ? other.getOfferUnitCode() == null : this.getOfferUnitCode().equals(other.getOfferUnitCode()))
            && (this.getOfferValidate() == null ? other.getOfferValidate() == null : this.getOfferValidate().equals(other.getOfferValidate()))
            && (this.getOriginPrice() == null ? other.getOriginPrice() == null : this.getOriginPrice().equals(other.getOriginPrice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getChargeType() == null ? other.getChargeType() == null : this.getChargeType().equals(other.getChargeType()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getDiscountDateBengin() == null ? other.getDiscountDateBengin() == null : this.getDiscountDateBengin().equals(other.getDiscountDateBengin()))
            && (this.getDiscountDateEnd() == null ? other.getDiscountDateEnd() == null : this.getDiscountDateEnd().equals(other.getDiscountDateEnd()))
            && (this.getDiscountPrice() == null ? other.getDiscountPrice() == null : this.getDiscountPrice().equals(other.getDiscountPrice()))
            && (this.getEnableState() == null ? other.getEnableState() == null : this.getEnableState().equals(other.getEnableState()))
            && (this.getExamineDesc() == null ? other.getExamineDesc() == null : this.getExamineDesc().equals(other.getExamineDesc()))
            && (this.getExamineState() == null ? other.getExamineState() == null : this.getExamineState().equals(other.getExamineState()))
            && (this.getHotelType() == null ? other.getHotelType() == null : this.getHotelType().equals(other.getHotelType()))
            && (this.getReleaseState() == null ? other.getReleaseState() == null : this.getReleaseState().equals(other.getReleaseState()))
            && (this.getRemark3() == null ? other.getRemark3() == null : this.getRemark3().equals(other.getRemark3()))
            && (this.getRemark4() == null ? other.getRemark4() == null : this.getRemark4().equals(other.getRemark4()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getExamineUser() == null ? other.getExamineUser() == null : this.getExamineUser().equals(other.getExamineUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getOfferDesc() == null) ? 0 : getOfferDesc().hashCode());
        result = prime * result + ((getOfferId() == null) ? 0 : getOfferId().hashCode());
        result = prime * result + ((getOfferName() == null) ? 0 : getOfferName().hashCode());
        result = prime * result + ((getOfferUnitCode() == null) ? 0 : getOfferUnitCode().hashCode());
        result = prime * result + ((getOfferValidate() == null) ? 0 : getOfferValidate().hashCode());
        result = prime * result + ((getOriginPrice() == null) ? 0 : getOriginPrice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getChargeType() == null) ? 0 : getChargeType().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getDiscountDateBengin() == null) ? 0 : getDiscountDateBengin().hashCode());
        result = prime * result + ((getDiscountDateEnd() == null) ? 0 : getDiscountDateEnd().hashCode());
        result = prime * result + ((getDiscountPrice() == null) ? 0 : getDiscountPrice().hashCode());
        result = prime * result + ((getEnableState() == null) ? 0 : getEnableState().hashCode());
        result = prime * result + ((getExamineDesc() == null) ? 0 : getExamineDesc().hashCode());
        result = prime * result + ((getExamineState() == null) ? 0 : getExamineState().hashCode());
        result = prime * result + ((getHotelType() == null) ? 0 : getHotelType().hashCode());
        result = prime * result + ((getReleaseState() == null) ? 0 : getReleaseState().hashCode());
        result = prime * result + ((getRemark3() == null) ? 0 : getRemark3().hashCode());
        result = prime * result + ((getRemark4() == null) ? 0 : getRemark4().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getExamineUser() == null) ? 0 : getExamineUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", offerDesc=").append(offerDesc);
        sb.append(", offerId=").append(offerId);
        sb.append(", offerName=").append(offerName);
        sb.append(", offerUnitCode=").append(offerUnitCode);
        sb.append(", offerValidate=").append(offerValidate);
        sb.append(", originPrice=").append(originPrice);
        sb.append(", price=").append(price);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", createUser=").append(createUser);
        sb.append(", discountDateBengin=").append(discountDateBengin);
        sb.append(", discountDateEnd=").append(discountDateEnd);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", enableState=").append(enableState);
        sb.append(", examineDesc=").append(examineDesc);
        sb.append(", examineState=").append(examineState);
        sb.append(", hotelType=").append(hotelType);
        sb.append(", releaseState=").append(releaseState);
        sb.append(", remark3=").append(remark3);
        sb.append(", remark4=").append(remark4);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", userType=").append(userType);
        sb.append(", examineUser=").append(examineUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}