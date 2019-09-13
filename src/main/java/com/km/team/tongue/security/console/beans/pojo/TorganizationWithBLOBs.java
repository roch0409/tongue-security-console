package com.km.team.tongue.security.console.beans.pojo;

import java.io.Serializable;

public class TorganizationWithBLOBs extends Torganization implements Serializable {
    private String orgSimpleText;

    private String orgText;

    private static final long serialVersionUID = 1L;

    public String getOrgSimpleText() {
        return orgSimpleText;
    }

    public void setOrgSimpleText(String orgSimpleText) {
        this.orgSimpleText = orgSimpleText == null ? null : orgSimpleText.trim();
    }

    public String getOrgText() {
        return orgText;
    }

    public void setOrgText(String orgText) {
        this.orgText = orgText == null ? null : orgText.trim();
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
        TorganizationWithBLOBs other = (TorganizationWithBLOBs) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgType() == null ? other.getOrgType() == null : this.getOrgType().equals(other.getOrgType()))
            && (this.getIsEnable() == null ? other.getIsEnable() == null : this.getIsEnable().equals(other.getIsEnable()))
            && (this.getOrgState() == null ? other.getOrgState() == null : this.getOrgState().equals(other.getOrgState()))
            && (this.getIndexcode() == null ? other.getIndexcode() == null : this.getIndexcode().equals(other.getIndexcode()))
            && (this.getOrgPid() == null ? other.getOrgPid() == null : this.getOrgPid().equals(other.getOrgPid()))
            && (this.getRegionlevel() == null ? other.getRegionlevel() == null : this.getRegionlevel().equals(other.getRegionlevel()))
            && (this.getRegionPath() == null ? other.getRegionPath() == null : this.getRegionPath().equals(other.getRegionPath()))
            && (this.getControlunitid() == null ? other.getControlunitid() == null : this.getControlunitid().equals(other.getControlunitid()))
            && (this.getControlunitname() == null ? other.getControlunitname() == null : this.getControlunitname().equals(other.getControlunitname()))
            && (this.getPlatformId() == null ? other.getPlatformId() == null : this.getPlatformId().equals(other.getPlatformId()))
            && (this.getPlatformName() == null ? other.getPlatformName() == null : this.getPlatformName().equals(other.getPlatformName()))
            && (this.getViewLevel() == null ? other.getViewLevel() == null : this.getViewLevel().equals(other.getViewLevel()))
            && (this.getViewNum() == null ? other.getViewNum() == null : this.getViewNum().equals(other.getViewNum()))
            && (this.getViewLastTime() == null ? other.getViewLastTime() == null : this.getViewLastTime().equals(other.getViewLastTime()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getOrgLng() == null ? other.getOrgLng() == null : this.getOrgLng().equals(other.getOrgLng()))
            && (this.getOrgLat() == null ? other.getOrgLat() == null : this.getOrgLat().equals(other.getOrgLat()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDamsIndexCode() == null ? other.getDamsIndexCode() == null : this.getDamsIndexCode().equals(other.getDamsIndexCode()))
            && (this.getDamsVersion() == null ? other.getDamsVersion() == null : this.getDamsVersion().equals(other.getDamsVersion()))
            && (this.getCreaterId() == null ? other.getCreaterId() == null : this.getCreaterId().equals(other.getCreaterId()))
            && (this.getCreaterName() == null ? other.getCreaterName() == null : this.getCreaterName().equals(other.getCreaterName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSynchTime() == null ? other.getSynchTime() == null : this.getSynchTime().equals(other.getSynchTime()))
            && (this.getYyzzImg() == null ? other.getYyzzImg() == null : this.getYyzzImg().equals(other.getYyzzImg()))
            && (this.getLhdjImg() == null ? other.getLhdjImg() == null : this.getLhdjImg().equals(other.getLhdjImg()))
            && (this.getGylyImg() == null ? other.getGylyImg() == null : this.getGylyImg().equals(other.getGylyImg()))
            && (this.getiId() == null ? other.getiId() == null : this.getiId().equals(other.getiId()))
            && (this.getJgryImg() == null ? other.getJgryImg() == null : this.getJgryImg().equals(other.getJgryImg()))
            && (this.getWsxkImg() == null ? other.getWsxkImg() == null : this.getWsxkImg().equals(other.getWsxkImg()))
            && (this.getYjyaImg() == null ? other.getYjyaImg() == null : this.getYjyaImg().equals(other.getYjyaImg()))
            && (this.getRecommended() == null ? other.getRecommended() == null : this.getRecommended().equals(other.getRecommended()))
            && (this.getRecommendReason() == null ? other.getRecommendReason() == null : this.getRecommendReason().equals(other.getRecommendReason()))
            && (this.getOrgSimpleText() == null ? other.getOrgSimpleText() == null : this.getOrgSimpleText().equals(other.getOrgSimpleText()))
            && (this.getOrgText() == null ? other.getOrgText() == null : this.getOrgText().equals(other.getOrgText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgType() == null) ? 0 : getOrgType().hashCode());
        result = prime * result + ((getIsEnable() == null) ? 0 : getIsEnable().hashCode());
        result = prime * result + ((getOrgState() == null) ? 0 : getOrgState().hashCode());
        result = prime * result + ((getIndexcode() == null) ? 0 : getIndexcode().hashCode());
        result = prime * result + ((getOrgPid() == null) ? 0 : getOrgPid().hashCode());
        result = prime * result + ((getRegionlevel() == null) ? 0 : getRegionlevel().hashCode());
        result = prime * result + ((getRegionPath() == null) ? 0 : getRegionPath().hashCode());
        result = prime * result + ((getControlunitid() == null) ? 0 : getControlunitid().hashCode());
        result = prime * result + ((getControlunitname() == null) ? 0 : getControlunitname().hashCode());
        result = prime * result + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        result = prime * result + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        result = prime * result + ((getViewLevel() == null) ? 0 : getViewLevel().hashCode());
        result = prime * result + ((getViewNum() == null) ? 0 : getViewNum().hashCode());
        result = prime * result + ((getViewLastTime() == null) ? 0 : getViewLastTime().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getOrgLng() == null) ? 0 : getOrgLng().hashCode());
        result = prime * result + ((getOrgLat() == null) ? 0 : getOrgLat().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDamsIndexCode() == null) ? 0 : getDamsIndexCode().hashCode());
        result = prime * result + ((getDamsVersion() == null) ? 0 : getDamsVersion().hashCode());
        result = prime * result + ((getCreaterId() == null) ? 0 : getCreaterId().hashCode());
        result = prime * result + ((getCreaterName() == null) ? 0 : getCreaterName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSynchTime() == null) ? 0 : getSynchTime().hashCode());
        result = prime * result + ((getYyzzImg() == null) ? 0 : getYyzzImg().hashCode());
        result = prime * result + ((getLhdjImg() == null) ? 0 : getLhdjImg().hashCode());
        result = prime * result + ((getGylyImg() == null) ? 0 : getGylyImg().hashCode());
        result = prime * result + ((getiId() == null) ? 0 : getiId().hashCode());
        result = prime * result + ((getJgryImg() == null) ? 0 : getJgryImg().hashCode());
        result = prime * result + ((getWsxkImg() == null) ? 0 : getWsxkImg().hashCode());
        result = prime * result + ((getYjyaImg() == null) ? 0 : getYjyaImg().hashCode());
        result = prime * result + ((getRecommended() == null) ? 0 : getRecommended().hashCode());
        result = prime * result + ((getRecommendReason() == null) ? 0 : getRecommendReason().hashCode());
        result = prime * result + ((getOrgSimpleText() == null) ? 0 : getOrgSimpleText().hashCode());
        result = prime * result + ((getOrgText() == null) ? 0 : getOrgText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgSimpleText=").append(orgSimpleText);
        sb.append(", orgText=").append(orgText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}