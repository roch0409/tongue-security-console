package com.km.team.tongue.security.console.beans.pojo;

import java.io.Serializable;
import java.util.Date;

public class PushMessage implements Serializable {
    private String id;

    private String attach;

    private String configid;

    private String content;

    private Date createtime;

    private String dealopinion;

    private String dealperson;

    private String dealpersonid;

    private String dealremark;

    private Date dealtime;

    private String deviceid;

    private String devicetag;

    private String indexcode;

    private String logid;

    private String objecttype;

    private String orgid;

    private String orgname;

    private String state;

    private String subtitle;

    private String title;

    private String warnlevel;

    private String warntype;

    private String warntypeid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    public String getConfigid() {
        return configid;
    }

    public void setConfigid(String configid) {
        this.configid = configid == null ? null : configid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDealopinion() {
        return dealopinion;
    }

    public void setDealopinion(String dealopinion) {
        this.dealopinion = dealopinion == null ? null : dealopinion.trim();
    }

    public String getDealperson() {
        return dealperson;
    }

    public void setDealperson(String dealperson) {
        this.dealperson = dealperson == null ? null : dealperson.trim();
    }

    public String getDealpersonid() {
        return dealpersonid;
    }

    public void setDealpersonid(String dealpersonid) {
        this.dealpersonid = dealpersonid == null ? null : dealpersonid.trim();
    }

    public String getDealremark() {
        return dealremark;
    }

    public void setDealremark(String dealremark) {
        this.dealremark = dealremark == null ? null : dealremark.trim();
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getDevicetag() {
        return devicetag;
    }

    public void setDevicetag(String devicetag) {
        this.devicetag = devicetag == null ? null : devicetag.trim();
    }

    public String getIndexcode() {
        return indexcode;
    }

    public void setIndexcode(String indexcode) {
        this.indexcode = indexcode == null ? null : indexcode.trim();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype == null ? null : objecttype.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getWarnlevel() {
        return warnlevel;
    }

    public void setWarnlevel(String warnlevel) {
        this.warnlevel = warnlevel == null ? null : warnlevel.trim();
    }

    public String getWarntype() {
        return warntype;
    }

    public void setWarntype(String warntype) {
        this.warntype = warntype == null ? null : warntype.trim();
    }

    public String getWarntypeid() {
        return warntypeid;
    }

    public void setWarntypeid(String warntypeid) {
        this.warntypeid = warntypeid == null ? null : warntypeid.trim();
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
        PushMessage other = (PushMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAttach() == null ? other.getAttach() == null : this.getAttach().equals(other.getAttach()))
            && (this.getConfigid() == null ? other.getConfigid() == null : this.getConfigid().equals(other.getConfigid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getDealopinion() == null ? other.getDealopinion() == null : this.getDealopinion().equals(other.getDealopinion()))
            && (this.getDealperson() == null ? other.getDealperson() == null : this.getDealperson().equals(other.getDealperson()))
            && (this.getDealpersonid() == null ? other.getDealpersonid() == null : this.getDealpersonid().equals(other.getDealpersonid()))
            && (this.getDealremark() == null ? other.getDealremark() == null : this.getDealremark().equals(other.getDealremark()))
            && (this.getDealtime() == null ? other.getDealtime() == null : this.getDealtime().equals(other.getDealtime()))
            && (this.getDeviceid() == null ? other.getDeviceid() == null : this.getDeviceid().equals(other.getDeviceid()))
            && (this.getDevicetag() == null ? other.getDevicetag() == null : this.getDevicetag().equals(other.getDevicetag()))
            && (this.getIndexcode() == null ? other.getIndexcode() == null : this.getIndexcode().equals(other.getIndexcode()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getObjecttype() == null ? other.getObjecttype() == null : this.getObjecttype().equals(other.getObjecttype()))
            && (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getOrgname() == null ? other.getOrgname() == null : this.getOrgname().equals(other.getOrgname()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getWarnlevel() == null ? other.getWarnlevel() == null : this.getWarnlevel().equals(other.getWarnlevel()))
            && (this.getWarntype() == null ? other.getWarntype() == null : this.getWarntype().equals(other.getWarntype()))
            && (this.getWarntypeid() == null ? other.getWarntypeid() == null : this.getWarntypeid().equals(other.getWarntypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAttach() == null) ? 0 : getAttach().hashCode());
        result = prime * result + ((getConfigid() == null) ? 0 : getConfigid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDealopinion() == null) ? 0 : getDealopinion().hashCode());
        result = prime * result + ((getDealperson() == null) ? 0 : getDealperson().hashCode());
        result = prime * result + ((getDealpersonid() == null) ? 0 : getDealpersonid().hashCode());
        result = prime * result + ((getDealremark() == null) ? 0 : getDealremark().hashCode());
        result = prime * result + ((getDealtime() == null) ? 0 : getDealtime().hashCode());
        result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
        result = prime * result + ((getDevicetag() == null) ? 0 : getDevicetag().hashCode());
        result = prime * result + ((getIndexcode() == null) ? 0 : getIndexcode().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getObjecttype() == null) ? 0 : getObjecttype().hashCode());
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getOrgname() == null) ? 0 : getOrgname().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getWarnlevel() == null) ? 0 : getWarnlevel().hashCode());
        result = prime * result + ((getWarntype() == null) ? 0 : getWarntype().hashCode());
        result = prime * result + ((getWarntypeid() == null) ? 0 : getWarntypeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attach=").append(attach);
        sb.append(", configid=").append(configid);
        sb.append(", content=").append(content);
        sb.append(", createtime=").append(createtime);
        sb.append(", dealopinion=").append(dealopinion);
        sb.append(", dealperson=").append(dealperson);
        sb.append(", dealpersonid=").append(dealpersonid);
        sb.append(", dealremark=").append(dealremark);
        sb.append(", dealtime=").append(dealtime);
        sb.append(", deviceid=").append(deviceid);
        sb.append(", devicetag=").append(devicetag);
        sb.append(", indexcode=").append(indexcode);
        sb.append(", logid=").append(logid);
        sb.append(", objecttype=").append(objecttype);
        sb.append(", orgid=").append(orgid);
        sb.append(", orgname=").append(orgname);
        sb.append(", state=").append(state);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", title=").append(title);
        sb.append(", warnlevel=").append(warnlevel);
        sb.append(", warntype=").append(warntype);
        sb.append(", warntypeid=").append(warntypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}