package com.km.team.tongue.security.console.beans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PushMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNull() {
            addCriterion("configId is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("configId is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(String value) {
            addCriterion("configId =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(String value) {
            addCriterion("configId <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(String value) {
            addCriterion("configId >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(String value) {
            addCriterion("configId >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(String value) {
            addCriterion("configId <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(String value) {
            addCriterion("configId <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLike(String value) {
            addCriterion("configId like", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotLike(String value) {
            addCriterion("configId not like", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<String> values) {
            addCriterion("configId in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<String> values) {
            addCriterion("configId not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(String value1, String value2) {
            addCriterion("configId between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(String value1, String value2) {
            addCriterion("configId not between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDealopinionIsNull() {
            addCriterion("dealOpinion is null");
            return (Criteria) this;
        }

        public Criteria andDealopinionIsNotNull() {
            addCriterion("dealOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andDealopinionEqualTo(String value) {
            addCriterion("dealOpinion =", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionNotEqualTo(String value) {
            addCriterion("dealOpinion <>", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionGreaterThan(String value) {
            addCriterion("dealOpinion >", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionGreaterThanOrEqualTo(String value) {
            addCriterion("dealOpinion >=", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionLessThan(String value) {
            addCriterion("dealOpinion <", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionLessThanOrEqualTo(String value) {
            addCriterion("dealOpinion <=", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionLike(String value) {
            addCriterion("dealOpinion like", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionNotLike(String value) {
            addCriterion("dealOpinion not like", value, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionIn(List<String> values) {
            addCriterion("dealOpinion in", values, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionNotIn(List<String> values) {
            addCriterion("dealOpinion not in", values, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionBetween(String value1, String value2) {
            addCriterion("dealOpinion between", value1, value2, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealopinionNotBetween(String value1, String value2) {
            addCriterion("dealOpinion not between", value1, value2, "dealopinion");
            return (Criteria) this;
        }

        public Criteria andDealpersonIsNull() {
            addCriterion("dealPerson is null");
            return (Criteria) this;
        }

        public Criteria andDealpersonIsNotNull() {
            addCriterion("dealPerson is not null");
            return (Criteria) this;
        }

        public Criteria andDealpersonEqualTo(String value) {
            addCriterion("dealPerson =", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotEqualTo(String value) {
            addCriterion("dealPerson <>", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonGreaterThan(String value) {
            addCriterion("dealPerson >", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonGreaterThanOrEqualTo(String value) {
            addCriterion("dealPerson >=", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLessThan(String value) {
            addCriterion("dealPerson <", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLessThanOrEqualTo(String value) {
            addCriterion("dealPerson <=", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLike(String value) {
            addCriterion("dealPerson like", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotLike(String value) {
            addCriterion("dealPerson not like", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonIn(List<String> values) {
            addCriterion("dealPerson in", values, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotIn(List<String> values) {
            addCriterion("dealPerson not in", values, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonBetween(String value1, String value2) {
            addCriterion("dealPerson between", value1, value2, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotBetween(String value1, String value2) {
            addCriterion("dealPerson not between", value1, value2, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonidIsNull() {
            addCriterion("dealPersonId is null");
            return (Criteria) this;
        }

        public Criteria andDealpersonidIsNotNull() {
            addCriterion("dealPersonId is not null");
            return (Criteria) this;
        }

        public Criteria andDealpersonidEqualTo(String value) {
            addCriterion("dealPersonId =", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidNotEqualTo(String value) {
            addCriterion("dealPersonId <>", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidGreaterThan(String value) {
            addCriterion("dealPersonId >", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidGreaterThanOrEqualTo(String value) {
            addCriterion("dealPersonId >=", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidLessThan(String value) {
            addCriterion("dealPersonId <", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidLessThanOrEqualTo(String value) {
            addCriterion("dealPersonId <=", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidLike(String value) {
            addCriterion("dealPersonId like", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidNotLike(String value) {
            addCriterion("dealPersonId not like", value, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidIn(List<String> values) {
            addCriterion("dealPersonId in", values, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidNotIn(List<String> values) {
            addCriterion("dealPersonId not in", values, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidBetween(String value1, String value2) {
            addCriterion("dealPersonId between", value1, value2, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealpersonidNotBetween(String value1, String value2) {
            addCriterion("dealPersonId not between", value1, value2, "dealpersonid");
            return (Criteria) this;
        }

        public Criteria andDealremarkIsNull() {
            addCriterion("dealRemark is null");
            return (Criteria) this;
        }

        public Criteria andDealremarkIsNotNull() {
            addCriterion("dealRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDealremarkEqualTo(String value) {
            addCriterion("dealRemark =", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkNotEqualTo(String value) {
            addCriterion("dealRemark <>", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkGreaterThan(String value) {
            addCriterion("dealRemark >", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkGreaterThanOrEqualTo(String value) {
            addCriterion("dealRemark >=", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkLessThan(String value) {
            addCriterion("dealRemark <", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkLessThanOrEqualTo(String value) {
            addCriterion("dealRemark <=", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkLike(String value) {
            addCriterion("dealRemark like", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkNotLike(String value) {
            addCriterion("dealRemark not like", value, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkIn(List<String> values) {
            addCriterion("dealRemark in", values, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkNotIn(List<String> values) {
            addCriterion("dealRemark not in", values, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkBetween(String value1, String value2) {
            addCriterion("dealRemark between", value1, value2, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealremarkNotBetween(String value1, String value2) {
            addCriterion("dealRemark not between", value1, value2, "dealremark");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealTime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealTime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Date value) {
            addCriterion("dealTime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Date value) {
            addCriterion("dealTime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Date value) {
            addCriterion("dealTime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealTime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Date value) {
            addCriterion("dealTime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Date value) {
            addCriterion("dealTime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Date> values) {
            addCriterion("dealTime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Date> values) {
            addCriterion("dealTime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Date value1, Date value2) {
            addCriterion("dealTime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Date value1, Date value2) {
            addCriterion("dealTime not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceId =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceId <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceId >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceId >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceId <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceId <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceId like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceId not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceId in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceId not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceId between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceId not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDevicetagIsNull() {
            addCriterion("deviceTag is null");
            return (Criteria) this;
        }

        public Criteria andDevicetagIsNotNull() {
            addCriterion("deviceTag is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetagEqualTo(String value) {
            addCriterion("deviceTag =", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagNotEqualTo(String value) {
            addCriterion("deviceTag <>", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagGreaterThan(String value) {
            addCriterion("deviceTag >", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTag >=", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagLessThan(String value) {
            addCriterion("deviceTag <", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagLessThanOrEqualTo(String value) {
            addCriterion("deviceTag <=", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagLike(String value) {
            addCriterion("deviceTag like", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagNotLike(String value) {
            addCriterion("deviceTag not like", value, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagIn(List<String> values) {
            addCriterion("deviceTag in", values, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagNotIn(List<String> values) {
            addCriterion("deviceTag not in", values, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagBetween(String value1, String value2) {
            addCriterion("deviceTag between", value1, value2, "devicetag");
            return (Criteria) this;
        }

        public Criteria andDevicetagNotBetween(String value1, String value2) {
            addCriterion("deviceTag not between", value1, value2, "devicetag");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIsNull() {
            addCriterion("indexCode is null");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIsNotNull() {
            addCriterion("indexCode is not null");
            return (Criteria) this;
        }

        public Criteria andIndexcodeEqualTo(String value) {
            addCriterion("indexCode =", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotEqualTo(String value) {
            addCriterion("indexCode <>", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeGreaterThan(String value) {
            addCriterion("indexCode >", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("indexCode >=", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLessThan(String value) {
            addCriterion("indexCode <", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLessThanOrEqualTo(String value) {
            addCriterion("indexCode <=", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLike(String value) {
            addCriterion("indexCode like", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotLike(String value) {
            addCriterion("indexCode not like", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIn(List<String> values) {
            addCriterion("indexCode in", values, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotIn(List<String> values) {
            addCriterion("indexCode not in", values, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeBetween(String value1, String value2) {
            addCriterion("indexCode between", value1, value2, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotBetween(String value1, String value2) {
            addCriterion("indexCode not between", value1, value2, "indexcode");
            return (Criteria) this;
        }

        public Criteria andLogidIsNull() {
            addCriterion("logId is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logId is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(String value) {
            addCriterion("logId =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(String value) {
            addCriterion("logId <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(String value) {
            addCriterion("logId >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(String value) {
            addCriterion("logId >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(String value) {
            addCriterion("logId <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(String value) {
            addCriterion("logId <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLike(String value) {
            addCriterion("logId like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotLike(String value) {
            addCriterion("logId not like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<String> values) {
            addCriterion("logId in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<String> values) {
            addCriterion("logId not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(String value1, String value2) {
            addCriterion("logId between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(String value1, String value2) {
            addCriterion("logId not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIsNull() {
            addCriterion("objectType is null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIsNotNull() {
            addCriterion("objectType is not null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeEqualTo(String value) {
            addCriterion("objectType =", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotEqualTo(String value) {
            addCriterion("objectType <>", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThan(String value) {
            addCriterion("objectType >", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("objectType >=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThan(String value) {
            addCriterion("objectType <", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThanOrEqualTo(String value) {
            addCriterion("objectType <=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLike(String value) {
            addCriterion("objectType like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotLike(String value) {
            addCriterion("objectType not like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIn(List<String> values) {
            addCriterion("objectType in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotIn(List<String> values) {
            addCriterion("objectType not in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeBetween(String value1, String value2) {
            addCriterion("objectType between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotBetween(String value1, String value2) {
            addCriterion("objectType not between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgId like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgId not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgName =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgName <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgName >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgName >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgName <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgName <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgName like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgName not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgName in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgName not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgName between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgName not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subTitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subTitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subTitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subTitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subTitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subTitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subTitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subTitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subTitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subTitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subTitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subTitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subTitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIsNull() {
            addCriterion("warnLevel is null");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIsNotNull() {
            addCriterion("warnLevel is not null");
            return (Criteria) this;
        }

        public Criteria andWarnlevelEqualTo(String value) {
            addCriterion("warnLevel =", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotEqualTo(String value) {
            addCriterion("warnLevel <>", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelGreaterThan(String value) {
            addCriterion("warnLevel >", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelGreaterThanOrEqualTo(String value) {
            addCriterion("warnLevel >=", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLessThan(String value) {
            addCriterion("warnLevel <", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLessThanOrEqualTo(String value) {
            addCriterion("warnLevel <=", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLike(String value) {
            addCriterion("warnLevel like", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotLike(String value) {
            addCriterion("warnLevel not like", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIn(List<String> values) {
            addCriterion("warnLevel in", values, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotIn(List<String> values) {
            addCriterion("warnLevel not in", values, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelBetween(String value1, String value2) {
            addCriterion("warnLevel between", value1, value2, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotBetween(String value1, String value2) {
            addCriterion("warnLevel not between", value1, value2, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarntypeIsNull() {
            addCriterion("warnType is null");
            return (Criteria) this;
        }

        public Criteria andWarntypeIsNotNull() {
            addCriterion("warnType is not null");
            return (Criteria) this;
        }

        public Criteria andWarntypeEqualTo(String value) {
            addCriterion("warnType =", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeNotEqualTo(String value) {
            addCriterion("warnType <>", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeGreaterThan(String value) {
            addCriterion("warnType >", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeGreaterThanOrEqualTo(String value) {
            addCriterion("warnType >=", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeLessThan(String value) {
            addCriterion("warnType <", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeLessThanOrEqualTo(String value) {
            addCriterion("warnType <=", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeLike(String value) {
            addCriterion("warnType like", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeNotLike(String value) {
            addCriterion("warnType not like", value, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeIn(List<String> values) {
            addCriterion("warnType in", values, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeNotIn(List<String> values) {
            addCriterion("warnType not in", values, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeBetween(String value1, String value2) {
            addCriterion("warnType between", value1, value2, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeNotBetween(String value1, String value2) {
            addCriterion("warnType not between", value1, value2, "warntype");
            return (Criteria) this;
        }

        public Criteria andWarntypeidIsNull() {
            addCriterion("warnTypeId is null");
            return (Criteria) this;
        }

        public Criteria andWarntypeidIsNotNull() {
            addCriterion("warnTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andWarntypeidEqualTo(String value) {
            addCriterion("warnTypeId =", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidNotEqualTo(String value) {
            addCriterion("warnTypeId <>", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidGreaterThan(String value) {
            addCriterion("warnTypeId >", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidGreaterThanOrEqualTo(String value) {
            addCriterion("warnTypeId >=", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidLessThan(String value) {
            addCriterion("warnTypeId <", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidLessThanOrEqualTo(String value) {
            addCriterion("warnTypeId <=", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidLike(String value) {
            addCriterion("warnTypeId like", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidNotLike(String value) {
            addCriterion("warnTypeId not like", value, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidIn(List<String> values) {
            addCriterion("warnTypeId in", values, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidNotIn(List<String> values) {
            addCriterion("warnTypeId not in", values, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidBetween(String value1, String value2) {
            addCriterion("warnTypeId between", value1, value2, "warntypeid");
            return (Criteria) this;
        }

        public Criteria andWarntypeidNotBetween(String value1, String value2) {
            addCriterion("warnTypeId not between", value1, value2, "warntypeid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}