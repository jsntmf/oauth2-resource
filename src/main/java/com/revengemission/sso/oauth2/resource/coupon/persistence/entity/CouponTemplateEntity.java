package com.revengemission.sso.oauth2.resource.coupon.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CouponTemplateEntity implements Serializable {
    private Long id;

    private String templateName;

    private String couponName;

    private String coverImageUrl;

    private Integer couponType;

    private Integer fullLimit;

    private BigDecimal faceValue;

    private Integer scopeOfApplicationType;

    private String scopeOfApplication;

    private Integer validityPeriodType;

    private Date beginTime;

    private Date endTime;

    private Integer validPeriodHours;

    private Integer maximumQuantity;

    private Integer maximumPerUser;

    private Integer quantityIssued;

    private int version;

    private int recordStatus;

    private int sortPriority;

    private String remark;

    private Date dateCreated;

    private Date lastModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl == null ? null : coverImageUrl.trim();
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getFullLimit() {
        return fullLimit;
    }

    public void setFullLimit(Integer fullLimit) {
        this.fullLimit = fullLimit;
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    public Integer getScopeOfApplicationType() {
        return scopeOfApplicationType;
    }

    public void setScopeOfApplicationType(Integer scopeOfApplicationType) {
        this.scopeOfApplicationType = scopeOfApplicationType;
    }

    public String getScopeOfApplication() {
        return scopeOfApplication;
    }

    public void setScopeOfApplication(String scopeOfApplication) {
        this.scopeOfApplication = scopeOfApplication == null ? null : scopeOfApplication.trim();
    }

    public Integer getValidityPeriodType() {
        return validityPeriodType;
    }

    public void setValidityPeriodType(Integer validityPeriodType) {
        this.validityPeriodType = validityPeriodType;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getValidPeriodHours() {
        return validPeriodHours;
    }

    public void setValidPeriodHours(Integer validPeriodHours) {
        this.validPeriodHours = validPeriodHours;
    }

    public Integer getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(Integer maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public Integer getMaximumPerUser() {
        return maximumPerUser;
    }

    public void setMaximumPerUser(Integer maximumPerUser) {
        this.maximumPerUser = maximumPerUser;
    }

    public Integer getQuantityIssued() {
        return quantityIssued;
    }

    public void setQuantityIssued(Integer quantityIssued) {
        this.quantityIssued = quantityIssued;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }

    public int getSortPriority() {
        return sortPriority;
    }

    public void setSortPriority(int sortPriority) {
        this.sortPriority = sortPriority;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
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
        CouponTemplateEntity other = (CouponTemplateEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTemplateName() == null ? other.getTemplateName() == null : this.getTemplateName().equals(other.getTemplateName()))
            && (this.getCouponName() == null ? other.getCouponName() == null : this.getCouponName().equals(other.getCouponName()))
            && (this.getCoverImageUrl() == null ? other.getCoverImageUrl() == null : this.getCoverImageUrl().equals(other.getCoverImageUrl()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getFullLimit() == null ? other.getFullLimit() == null : this.getFullLimit().equals(other.getFullLimit()))
            && (this.getFaceValue() == null ? other.getFaceValue() == null : this.getFaceValue().equals(other.getFaceValue()))
            && (this.getScopeOfApplicationType() == null ? other.getScopeOfApplicationType() == null : this.getScopeOfApplicationType().equals(other.getScopeOfApplicationType()))
            && (this.getScopeOfApplication() == null ? other.getScopeOfApplication() == null : this.getScopeOfApplication().equals(other.getScopeOfApplication()))
            && (this.getValidityPeriodType() == null ? other.getValidityPeriodType() == null : this.getValidityPeriodType().equals(other.getValidityPeriodType()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getValidPeriodHours() == null ? other.getValidPeriodHours() == null : this.getValidPeriodHours().equals(other.getValidPeriodHours()))
            && (this.getMaximumQuantity() == null ? other.getMaximumQuantity() == null : this.getMaximumQuantity().equals(other.getMaximumQuantity()))
            && (this.getMaximumPerUser() == null ? other.getMaximumPerUser() == null : this.getMaximumPerUser().equals(other.getMaximumPerUser()))
            && (this.getQuantityIssued() == null ? other.getQuantityIssued() == null : this.getQuantityIssued().equals(other.getQuantityIssued()))
            && (this.getVersion() == other.getVersion())
            && (this.getRecordStatus() == other.getRecordStatus())
            && (this.getSortPriority() == other.getSortPriority())
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDateCreated() == null ? other.getDateCreated() == null : this.getDateCreated().equals(other.getDateCreated()))
            && (this.getLastModified() == null ? other.getLastModified() == null : this.getLastModified().equals(other.getLastModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getCouponName() == null) ? 0 : getCouponName().hashCode());
        result = prime * result + ((getCoverImageUrl() == null) ? 0 : getCoverImageUrl().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getFullLimit() == null) ? 0 : getFullLimit().hashCode());
        result = prime * result + ((getFaceValue() == null) ? 0 : getFaceValue().hashCode());
        result = prime * result + ((getScopeOfApplicationType() == null) ? 0 : getScopeOfApplicationType().hashCode());
        result = prime * result + ((getScopeOfApplication() == null) ? 0 : getScopeOfApplication().hashCode());
        result = prime * result + ((getValidityPeriodType() == null) ? 0 : getValidityPeriodType().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getValidPeriodHours() == null) ? 0 : getValidPeriodHours().hashCode());
        result = prime * result + ((getMaximumQuantity() == null) ? 0 : getMaximumQuantity().hashCode());
        result = prime * result + ((getMaximumPerUser() == null) ? 0 : getMaximumPerUser().hashCode());
        result = prime * result + ((getQuantityIssued() == null) ? 0 : getQuantityIssued().hashCode());
        result = prime * result + getVersion();
        result = prime * result + getRecordStatus();
        result = prime * result + getSortPriority();
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        result = prime * result + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateName=").append(templateName);
        sb.append(", couponName=").append(couponName);
        sb.append(", coverImageUrl=").append(coverImageUrl);
        sb.append(", couponType=").append(couponType);
        sb.append(", fullLimit=").append(fullLimit);
        sb.append(", faceValue=").append(faceValue);
        sb.append(", scopeOfApplicationType=").append(scopeOfApplicationType);
        sb.append(", scopeOfApplication=").append(scopeOfApplication);
        sb.append(", validityPeriodType=").append(validityPeriodType);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", validPeriodHours=").append(validPeriodHours);
        sb.append(", maximumQuantity=").append(maximumQuantity);
        sb.append(", maximumPerUser=").append(maximumPerUser);
        sb.append(", quantityIssued=").append(quantityIssued);
        sb.append(", version=").append(version);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", sortPriority=").append(sortPriority);
        sb.append(", remark=").append(remark);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", lastModified=").append(lastModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}