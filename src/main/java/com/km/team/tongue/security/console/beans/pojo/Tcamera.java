package com.km.team.tongue.security.console.beans.pojo;

import java.io.Serializable;

public class Tcamera implements Serializable {
    private String camId;

    private String camName;

    private String camOrgId;

    private String camOrgName;

    private String orgIndexcode;

    private String orgPath;

    private Integer platformId;

    private String ocxId;

    private String deviceIndexcode;

    private String playType;

    private String playVal;

    private String defStream;

    private Integer cameratype;

    private Integer pixel;

    private Integer ptztype;

    private String sound;

    private Integer camState;

    private String camImg;

    private Integer isCascade;

    private String cascadeCode;

    private String creatTime;

    private String updateTime;

    private String synchTime;

    private String accessType;

    private Integer channelNo;

    private String deviceSerial;

    private Integer isEncrypt;

    private String verifyCode;

    private static final long serialVersionUID = 1L;

    public String getCamId() {
        return camId;
    }

    public void setCamId(String camId) {
        this.camId = camId == null ? null : camId.trim();
    }

    public String getCamName() {
        return camName;
    }

    public void setCamName(String camName) {
        this.camName = camName == null ? null : camName.trim();
    }

    public String getCamOrgId() {
        return camOrgId;
    }

    public void setCamOrgId(String camOrgId) {
        this.camOrgId = camOrgId == null ? null : camOrgId.trim();
    }

    public String getCamOrgName() {
        return camOrgName;
    }

    public void setCamOrgName(String camOrgName) {
        this.camOrgName = camOrgName == null ? null : camOrgName.trim();
    }

    public String getOrgIndexcode() {
        return orgIndexcode;
    }

    public void setOrgIndexcode(String orgIndexcode) {
        this.orgIndexcode = orgIndexcode == null ? null : orgIndexcode.trim();
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getOcxId() {
        return ocxId;
    }

    public void setOcxId(String ocxId) {
        this.ocxId = ocxId == null ? null : ocxId.trim();
    }

    public String getDeviceIndexcode() {
        return deviceIndexcode;
    }

    public void setDeviceIndexcode(String deviceIndexcode) {
        this.deviceIndexcode = deviceIndexcode == null ? null : deviceIndexcode.trim();
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType == null ? null : playType.trim();
    }

    public String getPlayVal() {
        return playVal;
    }

    public void setPlayVal(String playVal) {
        this.playVal = playVal == null ? null : playVal.trim();
    }

    public String getDefStream() {
        return defStream;
    }

    public void setDefStream(String defStream) {
        this.defStream = defStream == null ? null : defStream.trim();
    }

    public Integer getCameratype() {
        return cameratype;
    }

    public void setCameratype(Integer cameratype) {
        this.cameratype = cameratype;
    }

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    public Integer getPtztype() {
        return ptztype;
    }

    public void setPtztype(Integer ptztype) {
        this.ptztype = ptztype;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound == null ? null : sound.trim();
    }

    public Integer getCamState() {
        return camState;
    }

    public void setCamState(Integer camState) {
        this.camState = camState;
    }

    public String getCamImg() {
        return camImg;
    }

    public void setCamImg(String camImg) {
        this.camImg = camImg == null ? null : camImg.trim();
    }

    public Integer getIsCascade() {
        return isCascade;
    }

    public void setIsCascade(Integer isCascade) {
        this.isCascade = isCascade;
    }

    public String getCascadeCode() {
        return cascadeCode;
    }

    public void setCascadeCode(String cascadeCode) {
        this.cascadeCode = cascadeCode == null ? null : cascadeCode.trim();
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getSynchTime() {
        return synchTime;
    }

    public void setSynchTime(String synchTime) {
        this.synchTime = synchTime == null ? null : synchTime.trim();
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public Integer getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Integer channelNo) {
        this.channelNo = channelNo;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial == null ? null : deviceSerial.trim();
    }

    public Integer getIsEncrypt() {
        return isEncrypt;
    }

    public void setIsEncrypt(Integer isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
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
        Tcamera other = (Tcamera) that;
        return (this.getCamId() == null ? other.getCamId() == null : this.getCamId().equals(other.getCamId()))
            && (this.getCamName() == null ? other.getCamName() == null : this.getCamName().equals(other.getCamName()))
            && (this.getCamOrgId() == null ? other.getCamOrgId() == null : this.getCamOrgId().equals(other.getCamOrgId()))
            && (this.getCamOrgName() == null ? other.getCamOrgName() == null : this.getCamOrgName().equals(other.getCamOrgName()))
            && (this.getOrgIndexcode() == null ? other.getOrgIndexcode() == null : this.getOrgIndexcode().equals(other.getOrgIndexcode()))
            && (this.getOrgPath() == null ? other.getOrgPath() == null : this.getOrgPath().equals(other.getOrgPath()))
            && (this.getPlatformId() == null ? other.getPlatformId() == null : this.getPlatformId().equals(other.getPlatformId()))
            && (this.getOcxId() == null ? other.getOcxId() == null : this.getOcxId().equals(other.getOcxId()))
            && (this.getDeviceIndexcode() == null ? other.getDeviceIndexcode() == null : this.getDeviceIndexcode().equals(other.getDeviceIndexcode()))
            && (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()))
            && (this.getPlayVal() == null ? other.getPlayVal() == null : this.getPlayVal().equals(other.getPlayVal()))
            && (this.getDefStream() == null ? other.getDefStream() == null : this.getDefStream().equals(other.getDefStream()))
            && (this.getCameratype() == null ? other.getCameratype() == null : this.getCameratype().equals(other.getCameratype()))
            && (this.getPixel() == null ? other.getPixel() == null : this.getPixel().equals(other.getPixel()))
            && (this.getPtztype() == null ? other.getPtztype() == null : this.getPtztype().equals(other.getPtztype()))
            && (this.getSound() == null ? other.getSound() == null : this.getSound().equals(other.getSound()))
            && (this.getCamState() == null ? other.getCamState() == null : this.getCamState().equals(other.getCamState()))
            && (this.getCamImg() == null ? other.getCamImg() == null : this.getCamImg().equals(other.getCamImg()))
            && (this.getIsCascade() == null ? other.getIsCascade() == null : this.getIsCascade().equals(other.getIsCascade()))
            && (this.getCascadeCode() == null ? other.getCascadeCode() == null : this.getCascadeCode().equals(other.getCascadeCode()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSynchTime() == null ? other.getSynchTime() == null : this.getSynchTime().equals(other.getSynchTime()))
            && (this.getAccessType() == null ? other.getAccessType() == null : this.getAccessType().equals(other.getAccessType()))
            && (this.getChannelNo() == null ? other.getChannelNo() == null : this.getChannelNo().equals(other.getChannelNo()))
            && (this.getDeviceSerial() == null ? other.getDeviceSerial() == null : this.getDeviceSerial().equals(other.getDeviceSerial()))
            && (this.getIsEncrypt() == null ? other.getIsEncrypt() == null : this.getIsEncrypt().equals(other.getIsEncrypt()))
            && (this.getVerifyCode() == null ? other.getVerifyCode() == null : this.getVerifyCode().equals(other.getVerifyCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCamId() == null) ? 0 : getCamId().hashCode());
        result = prime * result + ((getCamName() == null) ? 0 : getCamName().hashCode());
        result = prime * result + ((getCamOrgId() == null) ? 0 : getCamOrgId().hashCode());
        result = prime * result + ((getCamOrgName() == null) ? 0 : getCamOrgName().hashCode());
        result = prime * result + ((getOrgIndexcode() == null) ? 0 : getOrgIndexcode().hashCode());
        result = prime * result + ((getOrgPath() == null) ? 0 : getOrgPath().hashCode());
        result = prime * result + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        result = prime * result + ((getOcxId() == null) ? 0 : getOcxId().hashCode());
        result = prime * result + ((getDeviceIndexcode() == null) ? 0 : getDeviceIndexcode().hashCode());
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        result = prime * result + ((getPlayVal() == null) ? 0 : getPlayVal().hashCode());
        result = prime * result + ((getDefStream() == null) ? 0 : getDefStream().hashCode());
        result = prime * result + ((getCameratype() == null) ? 0 : getCameratype().hashCode());
        result = prime * result + ((getPixel() == null) ? 0 : getPixel().hashCode());
        result = prime * result + ((getPtztype() == null) ? 0 : getPtztype().hashCode());
        result = prime * result + ((getSound() == null) ? 0 : getSound().hashCode());
        result = prime * result + ((getCamState() == null) ? 0 : getCamState().hashCode());
        result = prime * result + ((getCamImg() == null) ? 0 : getCamImg().hashCode());
        result = prime * result + ((getIsCascade() == null) ? 0 : getIsCascade().hashCode());
        result = prime * result + ((getCascadeCode() == null) ? 0 : getCascadeCode().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSynchTime() == null) ? 0 : getSynchTime().hashCode());
        result = prime * result + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        result = prime * result + ((getChannelNo() == null) ? 0 : getChannelNo().hashCode());
        result = prime * result + ((getDeviceSerial() == null) ? 0 : getDeviceSerial().hashCode());
        result = prime * result + ((getIsEncrypt() == null) ? 0 : getIsEncrypt().hashCode());
        result = prime * result + ((getVerifyCode() == null) ? 0 : getVerifyCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", camId=").append(camId);
        sb.append(", camName=").append(camName);
        sb.append(", camOrgId=").append(camOrgId);
        sb.append(", camOrgName=").append(camOrgName);
        sb.append(", orgIndexcode=").append(orgIndexcode);
        sb.append(", orgPath=").append(orgPath);
        sb.append(", platformId=").append(platformId);
        sb.append(", ocxId=").append(ocxId);
        sb.append(", deviceIndexcode=").append(deviceIndexcode);
        sb.append(", playType=").append(playType);
        sb.append(", playVal=").append(playVal);
        sb.append(", defStream=").append(defStream);
        sb.append(", cameratype=").append(cameratype);
        sb.append(", pixel=").append(pixel);
        sb.append(", ptztype=").append(ptztype);
        sb.append(", sound=").append(sound);
        sb.append(", camState=").append(camState);
        sb.append(", camImg=").append(camImg);
        sb.append(", isCascade=").append(isCascade);
        sb.append(", cascadeCode=").append(cascadeCode);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", synchTime=").append(synchTime);
        sb.append(", accessType=").append(accessType);
        sb.append(", channelNo=").append(channelNo);
        sb.append(", deviceSerial=").append(deviceSerial);
        sb.append(", isEncrypt=").append(isEncrypt);
        sb.append(", verifyCode=").append(verifyCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}