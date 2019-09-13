package com.km.team.tongue.security.console.beans.pojo;

import java.util.ArrayList;
import java.util.List;

public class TcameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcameraExample() {
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

        public Criteria andCamIdIsNull() {
            addCriterion("cam_id is null");
            return (Criteria) this;
        }

        public Criteria andCamIdIsNotNull() {
            addCriterion("cam_id is not null");
            return (Criteria) this;
        }

        public Criteria andCamIdEqualTo(String value) {
            addCriterion("cam_id =", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotEqualTo(String value) {
            addCriterion("cam_id <>", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdGreaterThan(String value) {
            addCriterion("cam_id >", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdGreaterThanOrEqualTo(String value) {
            addCriterion("cam_id >=", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdLessThan(String value) {
            addCriterion("cam_id <", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdLessThanOrEqualTo(String value) {
            addCriterion("cam_id <=", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdLike(String value) {
            addCriterion("cam_id like", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotLike(String value) {
            addCriterion("cam_id not like", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdIn(List<String> values) {
            addCriterion("cam_id in", values, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotIn(List<String> values) {
            addCriterion("cam_id not in", values, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdBetween(String value1, String value2) {
            addCriterion("cam_id between", value1, value2, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotBetween(String value1, String value2) {
            addCriterion("cam_id not between", value1, value2, "camId");
            return (Criteria) this;
        }

        public Criteria andCamNameIsNull() {
            addCriterion("cam_name is null");
            return (Criteria) this;
        }

        public Criteria andCamNameIsNotNull() {
            addCriterion("cam_name is not null");
            return (Criteria) this;
        }

        public Criteria andCamNameEqualTo(String value) {
            addCriterion("cam_name =", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotEqualTo(String value) {
            addCriterion("cam_name <>", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameGreaterThan(String value) {
            addCriterion("cam_name >", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameGreaterThanOrEqualTo(String value) {
            addCriterion("cam_name >=", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLessThan(String value) {
            addCriterion("cam_name <", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLessThanOrEqualTo(String value) {
            addCriterion("cam_name <=", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLike(String value) {
            addCriterion("cam_name like", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotLike(String value) {
            addCriterion("cam_name not like", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameIn(List<String> values) {
            addCriterion("cam_name in", values, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotIn(List<String> values) {
            addCriterion("cam_name not in", values, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameBetween(String value1, String value2) {
            addCriterion("cam_name between", value1, value2, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotBetween(String value1, String value2) {
            addCriterion("cam_name not between", value1, value2, "camName");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdIsNull() {
            addCriterion("cam_org_id is null");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdIsNotNull() {
            addCriterion("cam_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdEqualTo(String value) {
            addCriterion("cam_org_id =", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdNotEqualTo(String value) {
            addCriterion("cam_org_id <>", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdGreaterThan(String value) {
            addCriterion("cam_org_id >", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("cam_org_id >=", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdLessThan(String value) {
            addCriterion("cam_org_id <", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdLessThanOrEqualTo(String value) {
            addCriterion("cam_org_id <=", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdLike(String value) {
            addCriterion("cam_org_id like", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdNotLike(String value) {
            addCriterion("cam_org_id not like", value, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdIn(List<String> values) {
            addCriterion("cam_org_id in", values, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdNotIn(List<String> values) {
            addCriterion("cam_org_id not in", values, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdBetween(String value1, String value2) {
            addCriterion("cam_org_id between", value1, value2, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgIdNotBetween(String value1, String value2) {
            addCriterion("cam_org_id not between", value1, value2, "camOrgId");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameIsNull() {
            addCriterion("cam_org_name is null");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameIsNotNull() {
            addCriterion("cam_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameEqualTo(String value) {
            addCriterion("cam_org_name =", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameNotEqualTo(String value) {
            addCriterion("cam_org_name <>", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameGreaterThan(String value) {
            addCriterion("cam_org_name >", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cam_org_name >=", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameLessThan(String value) {
            addCriterion("cam_org_name <", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameLessThanOrEqualTo(String value) {
            addCriterion("cam_org_name <=", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameLike(String value) {
            addCriterion("cam_org_name like", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameNotLike(String value) {
            addCriterion("cam_org_name not like", value, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameIn(List<String> values) {
            addCriterion("cam_org_name in", values, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameNotIn(List<String> values) {
            addCriterion("cam_org_name not in", values, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameBetween(String value1, String value2) {
            addCriterion("cam_org_name between", value1, value2, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andCamOrgNameNotBetween(String value1, String value2) {
            addCriterion("cam_org_name not between", value1, value2, "camOrgName");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeIsNull() {
            addCriterion("org_indexCode is null");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeIsNotNull() {
            addCriterion("org_indexCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeEqualTo(String value) {
            addCriterion("org_indexCode =", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeNotEqualTo(String value) {
            addCriterion("org_indexCode <>", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeGreaterThan(String value) {
            addCriterion("org_indexCode >", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_indexCode >=", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeLessThan(String value) {
            addCriterion("org_indexCode <", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeLessThanOrEqualTo(String value) {
            addCriterion("org_indexCode <=", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeLike(String value) {
            addCriterion("org_indexCode like", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeNotLike(String value) {
            addCriterion("org_indexCode not like", value, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeIn(List<String> values) {
            addCriterion("org_indexCode in", values, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeNotIn(List<String> values) {
            addCriterion("org_indexCode not in", values, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeBetween(String value1, String value2) {
            addCriterion("org_indexCode between", value1, value2, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgIndexcodeNotBetween(String value1, String value2) {
            addCriterion("org_indexCode not between", value1, value2, "orgIndexcode");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNull() {
            addCriterion("org_path is null");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNotNull() {
            addCriterion("org_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPathEqualTo(String value) {
            addCriterion("org_path =", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotEqualTo(String value) {
            addCriterion("org_path <>", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThan(String value) {
            addCriterion("org_path >", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThanOrEqualTo(String value) {
            addCriterion("org_path >=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThan(String value) {
            addCriterion("org_path <", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThanOrEqualTo(String value) {
            addCriterion("org_path <=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLike(String value) {
            addCriterion("org_path like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotLike(String value) {
            addCriterion("org_path not like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathIn(List<String> values) {
            addCriterion("org_path in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotIn(List<String> values) {
            addCriterion("org_path not in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathBetween(String value1, String value2) {
            addCriterion("org_path between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotBetween(String value1, String value2) {
            addCriterion("org_path not between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(Integer value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(Integer value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(Integer value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(Integer value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<Integer> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<Integer> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andOcxIdIsNull() {
            addCriterion("ocx_id is null");
            return (Criteria) this;
        }

        public Criteria andOcxIdIsNotNull() {
            addCriterion("ocx_id is not null");
            return (Criteria) this;
        }

        public Criteria andOcxIdEqualTo(String value) {
            addCriterion("ocx_id =", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdNotEqualTo(String value) {
            addCriterion("ocx_id <>", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdGreaterThan(String value) {
            addCriterion("ocx_id >", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdGreaterThanOrEqualTo(String value) {
            addCriterion("ocx_id >=", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdLessThan(String value) {
            addCriterion("ocx_id <", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdLessThanOrEqualTo(String value) {
            addCriterion("ocx_id <=", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdLike(String value) {
            addCriterion("ocx_id like", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdNotLike(String value) {
            addCriterion("ocx_id not like", value, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdIn(List<String> values) {
            addCriterion("ocx_id in", values, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdNotIn(List<String> values) {
            addCriterion("ocx_id not in", values, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdBetween(String value1, String value2) {
            addCriterion("ocx_id between", value1, value2, "ocxId");
            return (Criteria) this;
        }

        public Criteria andOcxIdNotBetween(String value1, String value2) {
            addCriterion("ocx_id not between", value1, value2, "ocxId");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeIsNull() {
            addCriterion("device_indexCode is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeIsNotNull() {
            addCriterion("device_indexCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeEqualTo(String value) {
            addCriterion("device_indexCode =", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeNotEqualTo(String value) {
            addCriterion("device_indexCode <>", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeGreaterThan(String value) {
            addCriterion("device_indexCode >", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_indexCode >=", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeLessThan(String value) {
            addCriterion("device_indexCode <", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeLessThanOrEqualTo(String value) {
            addCriterion("device_indexCode <=", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeLike(String value) {
            addCriterion("device_indexCode like", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeNotLike(String value) {
            addCriterion("device_indexCode not like", value, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeIn(List<String> values) {
            addCriterion("device_indexCode in", values, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeNotIn(List<String> values) {
            addCriterion("device_indexCode not in", values, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeBetween(String value1, String value2) {
            addCriterion("device_indexCode between", value1, value2, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andDeviceIndexcodeNotBetween(String value1, String value2) {
            addCriterion("device_indexCode not between", value1, value2, "deviceIndexcode");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNull() {
            addCriterion("play_type is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("play_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("play_type =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("play_type <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("play_type >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("play_type >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("play_type <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("play_type <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("play_type like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("play_type not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("play_type in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("play_type not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("play_type between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("play_type not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayValIsNull() {
            addCriterion("play_val is null");
            return (Criteria) this;
        }

        public Criteria andPlayValIsNotNull() {
            addCriterion("play_val is not null");
            return (Criteria) this;
        }

        public Criteria andPlayValEqualTo(String value) {
            addCriterion("play_val =", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValNotEqualTo(String value) {
            addCriterion("play_val <>", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValGreaterThan(String value) {
            addCriterion("play_val >", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValGreaterThanOrEqualTo(String value) {
            addCriterion("play_val >=", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValLessThan(String value) {
            addCriterion("play_val <", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValLessThanOrEqualTo(String value) {
            addCriterion("play_val <=", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValLike(String value) {
            addCriterion("play_val like", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValNotLike(String value) {
            addCriterion("play_val not like", value, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValIn(List<String> values) {
            addCriterion("play_val in", values, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValNotIn(List<String> values) {
            addCriterion("play_val not in", values, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValBetween(String value1, String value2) {
            addCriterion("play_val between", value1, value2, "playVal");
            return (Criteria) this;
        }

        public Criteria andPlayValNotBetween(String value1, String value2) {
            addCriterion("play_val not between", value1, value2, "playVal");
            return (Criteria) this;
        }

        public Criteria andDefStreamIsNull() {
            addCriterion("def_stream is null");
            return (Criteria) this;
        }

        public Criteria andDefStreamIsNotNull() {
            addCriterion("def_stream is not null");
            return (Criteria) this;
        }

        public Criteria andDefStreamEqualTo(String value) {
            addCriterion("def_stream =", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamNotEqualTo(String value) {
            addCriterion("def_stream <>", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamGreaterThan(String value) {
            addCriterion("def_stream >", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamGreaterThanOrEqualTo(String value) {
            addCriterion("def_stream >=", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamLessThan(String value) {
            addCriterion("def_stream <", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamLessThanOrEqualTo(String value) {
            addCriterion("def_stream <=", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamLike(String value) {
            addCriterion("def_stream like", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamNotLike(String value) {
            addCriterion("def_stream not like", value, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamIn(List<String> values) {
            addCriterion("def_stream in", values, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamNotIn(List<String> values) {
            addCriterion("def_stream not in", values, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamBetween(String value1, String value2) {
            addCriterion("def_stream between", value1, value2, "defStream");
            return (Criteria) this;
        }

        public Criteria andDefStreamNotBetween(String value1, String value2) {
            addCriterion("def_stream not between", value1, value2, "defStream");
            return (Criteria) this;
        }

        public Criteria andCameratypeIsNull() {
            addCriterion("cameraType is null");
            return (Criteria) this;
        }

        public Criteria andCameratypeIsNotNull() {
            addCriterion("cameraType is not null");
            return (Criteria) this;
        }

        public Criteria andCameratypeEqualTo(Integer value) {
            addCriterion("cameraType =", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotEqualTo(Integer value) {
            addCriterion("cameraType <>", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeGreaterThan(Integer value) {
            addCriterion("cameraType >", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cameraType >=", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeLessThan(Integer value) {
            addCriterion("cameraType <", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeLessThanOrEqualTo(Integer value) {
            addCriterion("cameraType <=", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeIn(List<Integer> values) {
            addCriterion("cameraType in", values, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotIn(List<Integer> values) {
            addCriterion("cameraType not in", values, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeBetween(Integer value1, Integer value2) {
            addCriterion("cameraType between", value1, value2, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cameraType not between", value1, value2, "cameratype");
            return (Criteria) this;
        }

        public Criteria andPixelIsNull() {
            addCriterion("pixel is null");
            return (Criteria) this;
        }

        public Criteria andPixelIsNotNull() {
            addCriterion("pixel is not null");
            return (Criteria) this;
        }

        public Criteria andPixelEqualTo(Integer value) {
            addCriterion("pixel =", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelNotEqualTo(Integer value) {
            addCriterion("pixel <>", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelGreaterThan(Integer value) {
            addCriterion("pixel >", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pixel >=", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelLessThan(Integer value) {
            addCriterion("pixel <", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelLessThanOrEqualTo(Integer value) {
            addCriterion("pixel <=", value, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelIn(List<Integer> values) {
            addCriterion("pixel in", values, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelNotIn(List<Integer> values) {
            addCriterion("pixel not in", values, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelBetween(Integer value1, Integer value2) {
            addCriterion("pixel between", value1, value2, "pixel");
            return (Criteria) this;
        }

        public Criteria andPixelNotBetween(Integer value1, Integer value2) {
            addCriterion("pixel not between", value1, value2, "pixel");
            return (Criteria) this;
        }

        public Criteria andPtztypeIsNull() {
            addCriterion("ptzType is null");
            return (Criteria) this;
        }

        public Criteria andPtztypeIsNotNull() {
            addCriterion("ptzType is not null");
            return (Criteria) this;
        }

        public Criteria andPtztypeEqualTo(Integer value) {
            addCriterion("ptzType =", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotEqualTo(Integer value) {
            addCriterion("ptzType <>", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeGreaterThan(Integer value) {
            addCriterion("ptzType >", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptzType >=", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeLessThan(Integer value) {
            addCriterion("ptzType <", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeLessThanOrEqualTo(Integer value) {
            addCriterion("ptzType <=", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeIn(List<Integer> values) {
            addCriterion("ptzType in", values, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotIn(List<Integer> values) {
            addCriterion("ptzType not in", values, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeBetween(Integer value1, Integer value2) {
            addCriterion("ptzType between", value1, value2, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ptzType not between", value1, value2, "ptztype");
            return (Criteria) this;
        }

        public Criteria andSoundIsNull() {
            addCriterion("sound is null");
            return (Criteria) this;
        }

        public Criteria andSoundIsNotNull() {
            addCriterion("sound is not null");
            return (Criteria) this;
        }

        public Criteria andSoundEqualTo(String value) {
            addCriterion("sound =", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundNotEqualTo(String value) {
            addCriterion("sound <>", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundGreaterThan(String value) {
            addCriterion("sound >", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundGreaterThanOrEqualTo(String value) {
            addCriterion("sound >=", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundLessThan(String value) {
            addCriterion("sound <", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundLessThanOrEqualTo(String value) {
            addCriterion("sound <=", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundLike(String value) {
            addCriterion("sound like", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundNotLike(String value) {
            addCriterion("sound not like", value, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundIn(List<String> values) {
            addCriterion("sound in", values, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundNotIn(List<String> values) {
            addCriterion("sound not in", values, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundBetween(String value1, String value2) {
            addCriterion("sound between", value1, value2, "sound");
            return (Criteria) this;
        }

        public Criteria andSoundNotBetween(String value1, String value2) {
            addCriterion("sound not between", value1, value2, "sound");
            return (Criteria) this;
        }

        public Criteria andCamStateIsNull() {
            addCriterion("cam_state is null");
            return (Criteria) this;
        }

        public Criteria andCamStateIsNotNull() {
            addCriterion("cam_state is not null");
            return (Criteria) this;
        }

        public Criteria andCamStateEqualTo(Integer value) {
            addCriterion("cam_state =", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateNotEqualTo(Integer value) {
            addCriterion("cam_state <>", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateGreaterThan(Integer value) {
            addCriterion("cam_state >", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cam_state >=", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateLessThan(Integer value) {
            addCriterion("cam_state <", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateLessThanOrEqualTo(Integer value) {
            addCriterion("cam_state <=", value, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateIn(List<Integer> values) {
            addCriterion("cam_state in", values, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateNotIn(List<Integer> values) {
            addCriterion("cam_state not in", values, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateBetween(Integer value1, Integer value2) {
            addCriterion("cam_state between", value1, value2, "camState");
            return (Criteria) this;
        }

        public Criteria andCamStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cam_state not between", value1, value2, "camState");
            return (Criteria) this;
        }

        public Criteria andCamImgIsNull() {
            addCriterion("cam_img is null");
            return (Criteria) this;
        }

        public Criteria andCamImgIsNotNull() {
            addCriterion("cam_img is not null");
            return (Criteria) this;
        }

        public Criteria andCamImgEqualTo(String value) {
            addCriterion("cam_img =", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgNotEqualTo(String value) {
            addCriterion("cam_img <>", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgGreaterThan(String value) {
            addCriterion("cam_img >", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgGreaterThanOrEqualTo(String value) {
            addCriterion("cam_img >=", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgLessThan(String value) {
            addCriterion("cam_img <", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgLessThanOrEqualTo(String value) {
            addCriterion("cam_img <=", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgLike(String value) {
            addCriterion("cam_img like", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgNotLike(String value) {
            addCriterion("cam_img not like", value, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgIn(List<String> values) {
            addCriterion("cam_img in", values, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgNotIn(List<String> values) {
            addCriterion("cam_img not in", values, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgBetween(String value1, String value2) {
            addCriterion("cam_img between", value1, value2, "camImg");
            return (Criteria) this;
        }

        public Criteria andCamImgNotBetween(String value1, String value2) {
            addCriterion("cam_img not between", value1, value2, "camImg");
            return (Criteria) this;
        }

        public Criteria andIsCascadeIsNull() {
            addCriterion("is_cascade is null");
            return (Criteria) this;
        }

        public Criteria andIsCascadeIsNotNull() {
            addCriterion("is_cascade is not null");
            return (Criteria) this;
        }

        public Criteria andIsCascadeEqualTo(Integer value) {
            addCriterion("is_cascade =", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeNotEqualTo(Integer value) {
            addCriterion("is_cascade <>", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeGreaterThan(Integer value) {
            addCriterion("is_cascade >", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_cascade >=", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeLessThan(Integer value) {
            addCriterion("is_cascade <", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeLessThanOrEqualTo(Integer value) {
            addCriterion("is_cascade <=", value, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeIn(List<Integer> values) {
            addCriterion("is_cascade in", values, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeNotIn(List<Integer> values) {
            addCriterion("is_cascade not in", values, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeBetween(Integer value1, Integer value2) {
            addCriterion("is_cascade between", value1, value2, "isCascade");
            return (Criteria) this;
        }

        public Criteria andIsCascadeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_cascade not between", value1, value2, "isCascade");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIsNull() {
            addCriterion("cascade_code is null");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIsNotNull() {
            addCriterion("cascade_code is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeEqualTo(String value) {
            addCriterion("cascade_code =", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotEqualTo(String value) {
            addCriterion("cascade_code <>", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeGreaterThan(String value) {
            addCriterion("cascade_code >", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cascade_code >=", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLessThan(String value) {
            addCriterion("cascade_code <", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLessThanOrEqualTo(String value) {
            addCriterion("cascade_code <=", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLike(String value) {
            addCriterion("cascade_code like", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotLike(String value) {
            addCriterion("cascade_code not like", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIn(List<String> values) {
            addCriterion("cascade_code in", values, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotIn(List<String> values) {
            addCriterion("cascade_code not in", values, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeBetween(String value1, String value2) {
            addCriterion("cascade_code between", value1, value2, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotBetween(String value1, String value2) {
            addCriterion("cascade_code not between", value1, value2, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(String value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(String value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(String value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(String value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(String value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLike(String value) {
            addCriterion("creat_time like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotLike(String value) {
            addCriterion("creat_time not like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<String> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<String> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(String value1, String value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(String value1, String value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeIsNull() {
            addCriterion("synch_time is null");
            return (Criteria) this;
        }

        public Criteria andSynchTimeIsNotNull() {
            addCriterion("synch_time is not null");
            return (Criteria) this;
        }

        public Criteria andSynchTimeEqualTo(String value) {
            addCriterion("synch_time =", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeNotEqualTo(String value) {
            addCriterion("synch_time <>", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeGreaterThan(String value) {
            addCriterion("synch_time >", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeGreaterThanOrEqualTo(String value) {
            addCriterion("synch_time >=", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeLessThan(String value) {
            addCriterion("synch_time <", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeLessThanOrEqualTo(String value) {
            addCriterion("synch_time <=", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeLike(String value) {
            addCriterion("synch_time like", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeNotLike(String value) {
            addCriterion("synch_time not like", value, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeIn(List<String> values) {
            addCriterion("synch_time in", values, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeNotIn(List<String> values) {
            addCriterion("synch_time not in", values, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeBetween(String value1, String value2) {
            addCriterion("synch_time between", value1, value2, "synchTime");
            return (Criteria) this;
        }

        public Criteria andSynchTimeNotBetween(String value1, String value2) {
            addCriterion("synch_time not between", value1, value2, "synchTime");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("access_type =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("access_type <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("access_type >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("access_type >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("access_type <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("access_type <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("access_type like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("access_type not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("access_type in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("access_type not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("access_type between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("access_type not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNull() {
            addCriterion("channel_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("channel_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(Integer value) {
            addCriterion("channel_no =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(Integer value) {
            addCriterion("channel_no <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(Integer value) {
            addCriterion("channel_no >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_no >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(Integer value) {
            addCriterion("channel_no <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(Integer value) {
            addCriterion("channel_no <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<Integer> values) {
            addCriterion("channel_no in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<Integer> values) {
            addCriterion("channel_no not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(Integer value1, Integer value2) {
            addCriterion("channel_no between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_no not between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNull() {
            addCriterion("device_serial is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNotNull() {
            addCriterion("device_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialEqualTo(String value) {
            addCriterion("device_serial =", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotEqualTo(String value) {
            addCriterion("device_serial <>", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThan(String value) {
            addCriterion("device_serial >", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThanOrEqualTo(String value) {
            addCriterion("device_serial >=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThan(String value) {
            addCriterion("device_serial <", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThanOrEqualTo(String value) {
            addCriterion("device_serial <=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLike(String value) {
            addCriterion("device_serial like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotLike(String value) {
            addCriterion("device_serial not like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIn(List<String> values) {
            addCriterion("device_serial in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotIn(List<String> values) {
            addCriterion("device_serial not in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialBetween(String value1, String value2) {
            addCriterion("device_serial between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotBetween(String value1, String value2) {
            addCriterion("device_serial not between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIsNull() {
            addCriterion("is_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIsNotNull() {
            addCriterion("is_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptEqualTo(Integer value) {
            addCriterion("is_encrypt =", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotEqualTo(Integer value) {
            addCriterion("is_encrypt <>", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptGreaterThan(Integer value) {
            addCriterion("is_encrypt >", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_encrypt >=", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptLessThan(Integer value) {
            addCriterion("is_encrypt <", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptLessThanOrEqualTo(Integer value) {
            addCriterion("is_encrypt <=", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIn(List<Integer> values) {
            addCriterion("is_encrypt in", values, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotIn(List<Integer> values) {
            addCriterion("is_encrypt not in", values, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptBetween(Integer value1, Integer value2) {
            addCriterion("is_encrypt between", value1, value2, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotBetween(Integer value1, Integer value2) {
            addCriterion("is_encrypt not between", value1, value2, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("verify_code is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("verify_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("verify_code =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("verify_code <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("verify_code >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verify_code >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("verify_code <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("verify_code <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("verify_code like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("verify_code not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("verify_code in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("verify_code not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("verify_code between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("verify_code not between", value1, value2, "verifyCode");
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