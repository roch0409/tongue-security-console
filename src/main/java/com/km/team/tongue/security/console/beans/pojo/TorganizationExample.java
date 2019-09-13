package com.km.team.tongue.security.console.beans.pojo;

import java.util.ArrayList;
import java.util.List;

public class TorganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TorganizationExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Integer value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Integer value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Integer value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Integer value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Integer> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Integer> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Integer value1, Integer value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Integer value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Integer value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Integer value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Integer value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Integer> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Integer> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Integer value1, Integer value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andOrgStateIsNull() {
            addCriterion("org_state is null");
            return (Criteria) this;
        }

        public Criteria andOrgStateIsNotNull() {
            addCriterion("org_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStateEqualTo(String value) {
            addCriterion("org_state =", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotEqualTo(String value) {
            addCriterion("org_state <>", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateGreaterThan(String value) {
            addCriterion("org_state >", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateGreaterThanOrEqualTo(String value) {
            addCriterion("org_state >=", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateLessThan(String value) {
            addCriterion("org_state <", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateLessThanOrEqualTo(String value) {
            addCriterion("org_state <=", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateLike(String value) {
            addCriterion("org_state like", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotLike(String value) {
            addCriterion("org_state not like", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateIn(List<String> values) {
            addCriterion("org_state in", values, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotIn(List<String> values) {
            addCriterion("org_state not in", values, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateBetween(String value1, String value2) {
            addCriterion("org_state between", value1, value2, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotBetween(String value1, String value2) {
            addCriterion("org_state not between", value1, value2, "orgState");
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

        public Criteria andOrgPidIsNull() {
            addCriterion("org_pid is null");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNotNull() {
            addCriterion("org_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPidEqualTo(String value) {
            addCriterion("org_pid =", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotEqualTo(String value) {
            addCriterion("org_pid <>", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThan(String value) {
            addCriterion("org_pid >", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThanOrEqualTo(String value) {
            addCriterion("org_pid >=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThan(String value) {
            addCriterion("org_pid <", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThanOrEqualTo(String value) {
            addCriterion("org_pid <=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLike(String value) {
            addCriterion("org_pid like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotLike(String value) {
            addCriterion("org_pid not like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidIn(List<String> values) {
            addCriterion("org_pid in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotIn(List<String> values) {
            addCriterion("org_pid not in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidBetween(String value1, String value2) {
            addCriterion("org_pid between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotBetween(String value1, String value2) {
            addCriterion("org_pid not between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andRegionlevelIsNull() {
            addCriterion("regionLevel is null");
            return (Criteria) this;
        }

        public Criteria andRegionlevelIsNotNull() {
            addCriterion("regionLevel is not null");
            return (Criteria) this;
        }

        public Criteria andRegionlevelEqualTo(Integer value) {
            addCriterion("regionLevel =", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelNotEqualTo(Integer value) {
            addCriterion("regionLevel <>", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelGreaterThan(Integer value) {
            addCriterion("regionLevel >", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("regionLevel >=", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelLessThan(Integer value) {
            addCriterion("regionLevel <", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelLessThanOrEqualTo(Integer value) {
            addCriterion("regionLevel <=", value, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelIn(List<Integer> values) {
            addCriterion("regionLevel in", values, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelNotIn(List<Integer> values) {
            addCriterion("regionLevel not in", values, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelBetween(Integer value1, Integer value2) {
            addCriterion("regionLevel between", value1, value2, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("regionLevel not between", value1, value2, "regionlevel");
            return (Criteria) this;
        }

        public Criteria andRegionPathIsNull() {
            addCriterion("region_path is null");
            return (Criteria) this;
        }

        public Criteria andRegionPathIsNotNull() {
            addCriterion("region_path is not null");
            return (Criteria) this;
        }

        public Criteria andRegionPathEqualTo(String value) {
            addCriterion("region_path =", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathNotEqualTo(String value) {
            addCriterion("region_path <>", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathGreaterThan(String value) {
            addCriterion("region_path >", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathGreaterThanOrEqualTo(String value) {
            addCriterion("region_path >=", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathLessThan(String value) {
            addCriterion("region_path <", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathLessThanOrEqualTo(String value) {
            addCriterion("region_path <=", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathLike(String value) {
            addCriterion("region_path like", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathNotLike(String value) {
            addCriterion("region_path not like", value, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathIn(List<String> values) {
            addCriterion("region_path in", values, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathNotIn(List<String> values) {
            addCriterion("region_path not in", values, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathBetween(String value1, String value2) {
            addCriterion("region_path between", value1, value2, "regionPath");
            return (Criteria) this;
        }

        public Criteria andRegionPathNotBetween(String value1, String value2) {
            addCriterion("region_path not between", value1, value2, "regionPath");
            return (Criteria) this;
        }

        public Criteria andControlunitidIsNull() {
            addCriterion("controlUnitId is null");
            return (Criteria) this;
        }

        public Criteria andControlunitidIsNotNull() {
            addCriterion("controlUnitId is not null");
            return (Criteria) this;
        }

        public Criteria andControlunitidEqualTo(String value) {
            addCriterion("controlUnitId =", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidNotEqualTo(String value) {
            addCriterion("controlUnitId <>", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidGreaterThan(String value) {
            addCriterion("controlUnitId >", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidGreaterThanOrEqualTo(String value) {
            addCriterion("controlUnitId >=", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidLessThan(String value) {
            addCriterion("controlUnitId <", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidLessThanOrEqualTo(String value) {
            addCriterion("controlUnitId <=", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidLike(String value) {
            addCriterion("controlUnitId like", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidNotLike(String value) {
            addCriterion("controlUnitId not like", value, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidIn(List<String> values) {
            addCriterion("controlUnitId in", values, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidNotIn(List<String> values) {
            addCriterion("controlUnitId not in", values, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidBetween(String value1, String value2) {
            addCriterion("controlUnitId between", value1, value2, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitidNotBetween(String value1, String value2) {
            addCriterion("controlUnitId not between", value1, value2, "controlunitid");
            return (Criteria) this;
        }

        public Criteria andControlunitnameIsNull() {
            addCriterion("controlUnitName is null");
            return (Criteria) this;
        }

        public Criteria andControlunitnameIsNotNull() {
            addCriterion("controlUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andControlunitnameEqualTo(String value) {
            addCriterion("controlUnitName =", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameNotEqualTo(String value) {
            addCriterion("controlUnitName <>", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameGreaterThan(String value) {
            addCriterion("controlUnitName >", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("controlUnitName >=", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameLessThan(String value) {
            addCriterion("controlUnitName <", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameLessThanOrEqualTo(String value) {
            addCriterion("controlUnitName <=", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameLike(String value) {
            addCriterion("controlUnitName like", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameNotLike(String value) {
            addCriterion("controlUnitName not like", value, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameIn(List<String> values) {
            addCriterion("controlUnitName in", values, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameNotIn(List<String> values) {
            addCriterion("controlUnitName not in", values, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameBetween(String value1, String value2) {
            addCriterion("controlUnitName between", value1, value2, "controlunitname");
            return (Criteria) this;
        }

        public Criteria andControlunitnameNotBetween(String value1, String value2) {
            addCriterion("controlUnitName not between", value1, value2, "controlunitname");
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

        public Criteria andPlatformNameIsNull() {
            addCriterion("platform_name is null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNotNull() {
            addCriterion("platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameEqualTo(String value) {
            addCriterion("platform_name =", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotEqualTo(String value) {
            addCriterion("platform_name <>", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThan(String value) {
            addCriterion("platform_name >", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("platform_name >=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThan(String value) {
            addCriterion("platform_name <", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("platform_name <=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLike(String value) {
            addCriterion("platform_name like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotLike(String value) {
            addCriterion("platform_name not like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIn(List<String> values) {
            addCriterion("platform_name in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotIn(List<String> values) {
            addCriterion("platform_name not in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameBetween(String value1, String value2) {
            addCriterion("platform_name between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotBetween(String value1, String value2) {
            addCriterion("platform_name not between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andViewLevelIsNull() {
            addCriterion("view_level is null");
            return (Criteria) this;
        }

        public Criteria andViewLevelIsNotNull() {
            addCriterion("view_level is not null");
            return (Criteria) this;
        }

        public Criteria andViewLevelEqualTo(String value) {
            addCriterion("view_level =", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelNotEqualTo(String value) {
            addCriterion("view_level <>", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelGreaterThan(String value) {
            addCriterion("view_level >", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelGreaterThanOrEqualTo(String value) {
            addCriterion("view_level >=", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelLessThan(String value) {
            addCriterion("view_level <", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelLessThanOrEqualTo(String value) {
            addCriterion("view_level <=", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelLike(String value) {
            addCriterion("view_level like", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelNotLike(String value) {
            addCriterion("view_level not like", value, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelIn(List<String> values) {
            addCriterion("view_level in", values, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelNotIn(List<String> values) {
            addCriterion("view_level not in", values, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelBetween(String value1, String value2) {
            addCriterion("view_level between", value1, value2, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewLevelNotBetween(String value1, String value2) {
            addCriterion("view_level not between", value1, value2, "viewLevel");
            return (Criteria) this;
        }

        public Criteria andViewNumIsNull() {
            addCriterion("view_num is null");
            return (Criteria) this;
        }

        public Criteria andViewNumIsNotNull() {
            addCriterion("view_num is not null");
            return (Criteria) this;
        }

        public Criteria andViewNumEqualTo(Integer value) {
            addCriterion("view_num =", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotEqualTo(Integer value) {
            addCriterion("view_num <>", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumGreaterThan(Integer value) {
            addCriterion("view_num >", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_num >=", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumLessThan(Integer value) {
            addCriterion("view_num <", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumLessThanOrEqualTo(Integer value) {
            addCriterion("view_num <=", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumIn(List<Integer> values) {
            addCriterion("view_num in", values, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotIn(List<Integer> values) {
            addCriterion("view_num not in", values, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumBetween(Integer value1, Integer value2) {
            addCriterion("view_num between", value1, value2, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotBetween(Integer value1, Integer value2) {
            addCriterion("view_num not between", value1, value2, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeIsNull() {
            addCriterion("view_last_time is null");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeIsNotNull() {
            addCriterion("view_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeEqualTo(String value) {
            addCriterion("view_last_time =", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeNotEqualTo(String value) {
            addCriterion("view_last_time <>", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeGreaterThan(String value) {
            addCriterion("view_last_time >", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("view_last_time >=", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeLessThan(String value) {
            addCriterion("view_last_time <", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeLessThanOrEqualTo(String value) {
            addCriterion("view_last_time <=", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeLike(String value) {
            addCriterion("view_last_time like", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeNotLike(String value) {
            addCriterion("view_last_time not like", value, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeIn(List<String> values) {
            addCriterion("view_last_time in", values, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeNotIn(List<String> values) {
            addCriterion("view_last_time not in", values, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeBetween(String value1, String value2) {
            addCriterion("view_last_time between", value1, value2, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andViewLastTimeNotBetween(String value1, String value2) {
            addCriterion("view_last_time not between", value1, value2, "viewLastTime");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLngIsNull() {
            addCriterion("org_lng is null");
            return (Criteria) this;
        }

        public Criteria andOrgLngIsNotNull() {
            addCriterion("org_lng is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLngEqualTo(String value) {
            addCriterion("org_lng =", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngNotEqualTo(String value) {
            addCriterion("org_lng <>", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngGreaterThan(String value) {
            addCriterion("org_lng >", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngGreaterThanOrEqualTo(String value) {
            addCriterion("org_lng >=", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngLessThan(String value) {
            addCriterion("org_lng <", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngLessThanOrEqualTo(String value) {
            addCriterion("org_lng <=", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngLike(String value) {
            addCriterion("org_lng like", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngNotLike(String value) {
            addCriterion("org_lng not like", value, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngIn(List<String> values) {
            addCriterion("org_lng in", values, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngNotIn(List<String> values) {
            addCriterion("org_lng not in", values, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngBetween(String value1, String value2) {
            addCriterion("org_lng between", value1, value2, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLngNotBetween(String value1, String value2) {
            addCriterion("org_lng not between", value1, value2, "orgLng");
            return (Criteria) this;
        }

        public Criteria andOrgLatIsNull() {
            addCriterion("org_lat is null");
            return (Criteria) this;
        }

        public Criteria andOrgLatIsNotNull() {
            addCriterion("org_lat is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLatEqualTo(String value) {
            addCriterion("org_lat =", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatNotEqualTo(String value) {
            addCriterion("org_lat <>", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatGreaterThan(String value) {
            addCriterion("org_lat >", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatGreaterThanOrEqualTo(String value) {
            addCriterion("org_lat >=", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatLessThan(String value) {
            addCriterion("org_lat <", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatLessThanOrEqualTo(String value) {
            addCriterion("org_lat <=", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatLike(String value) {
            addCriterion("org_lat like", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatNotLike(String value) {
            addCriterion("org_lat not like", value, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatIn(List<String> values) {
            addCriterion("org_lat in", values, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatNotIn(List<String> values) {
            addCriterion("org_lat not in", values, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatBetween(String value1, String value2) {
            addCriterion("org_lat between", value1, value2, "orgLat");
            return (Criteria) this;
        }

        public Criteria andOrgLatNotBetween(String value1, String value2) {
            addCriterion("org_lat not between", value1, value2, "orgLat");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeIsNull() {
            addCriterion("dams_index_code is null");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeIsNotNull() {
            addCriterion("dams_index_code is not null");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeEqualTo(String value) {
            addCriterion("dams_index_code =", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeNotEqualTo(String value) {
            addCriterion("dams_index_code <>", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeGreaterThan(String value) {
            addCriterion("dams_index_code >", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dams_index_code >=", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeLessThan(String value) {
            addCriterion("dams_index_code <", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("dams_index_code <=", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeLike(String value) {
            addCriterion("dams_index_code like", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeNotLike(String value) {
            addCriterion("dams_index_code not like", value, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeIn(List<String> values) {
            addCriterion("dams_index_code in", values, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeNotIn(List<String> values) {
            addCriterion("dams_index_code not in", values, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeBetween(String value1, String value2) {
            addCriterion("dams_index_code between", value1, value2, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsIndexCodeNotBetween(String value1, String value2) {
            addCriterion("dams_index_code not between", value1, value2, "damsIndexCode");
            return (Criteria) this;
        }

        public Criteria andDamsVersionIsNull() {
            addCriterion("dams_version is null");
            return (Criteria) this;
        }

        public Criteria andDamsVersionIsNotNull() {
            addCriterion("dams_version is not null");
            return (Criteria) this;
        }

        public Criteria andDamsVersionEqualTo(Long value) {
            addCriterion("dams_version =", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionNotEqualTo(Long value) {
            addCriterion("dams_version <>", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionGreaterThan(Long value) {
            addCriterion("dams_version >", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("dams_version >=", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionLessThan(Long value) {
            addCriterion("dams_version <", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionLessThanOrEqualTo(Long value) {
            addCriterion("dams_version <=", value, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionIn(List<Long> values) {
            addCriterion("dams_version in", values, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionNotIn(List<Long> values) {
            addCriterion("dams_version not in", values, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionBetween(Long value1, Long value2) {
            addCriterion("dams_version between", value1, value2, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andDamsVersionNotBetween(Long value1, Long value2) {
            addCriterion("dams_version not between", value1, value2, "damsVersion");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(String value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(String value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(String value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(String value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(String value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLike(String value) {
            addCriterion("creater_id like", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotLike(String value) {
            addCriterion("creater_id not like", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<String> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<String> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(String value1, String value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(String value1, String value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNull() {
            addCriterion("creater_name is null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNotNull() {
            addCriterion("creater_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameEqualTo(String value) {
            addCriterion("creater_name =", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotEqualTo(String value) {
            addCriterion("creater_name <>", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThan(String value) {
            addCriterion("creater_name >", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("creater_name >=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThan(String value) {
            addCriterion("creater_name <", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThanOrEqualTo(String value) {
            addCriterion("creater_name <=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLike(String value) {
            addCriterion("creater_name like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotLike(String value) {
            addCriterion("creater_name not like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIn(List<String> values) {
            addCriterion("creater_name in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotIn(List<String> values) {
            addCriterion("creater_name not in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameBetween(String value1, String value2) {
            addCriterion("creater_name between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotBetween(String value1, String value2) {
            addCriterion("creater_name not between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andYyzzImgIsNull() {
            addCriterion("yyzz_img is null");
            return (Criteria) this;
        }

        public Criteria andYyzzImgIsNotNull() {
            addCriterion("yyzz_img is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzImgEqualTo(String value) {
            addCriterion("yyzz_img =", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgNotEqualTo(String value) {
            addCriterion("yyzz_img <>", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgGreaterThan(String value) {
            addCriterion("yyzz_img >", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgGreaterThanOrEqualTo(String value) {
            addCriterion("yyzz_img >=", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgLessThan(String value) {
            addCriterion("yyzz_img <", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgLessThanOrEqualTo(String value) {
            addCriterion("yyzz_img <=", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgLike(String value) {
            addCriterion("yyzz_img like", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgNotLike(String value) {
            addCriterion("yyzz_img not like", value, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgIn(List<String> values) {
            addCriterion("yyzz_img in", values, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgNotIn(List<String> values) {
            addCriterion("yyzz_img not in", values, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgBetween(String value1, String value2) {
            addCriterion("yyzz_img between", value1, value2, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andYyzzImgNotBetween(String value1, String value2) {
            addCriterion("yyzz_img not between", value1, value2, "yyzzImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgIsNull() {
            addCriterion("lhdj_img is null");
            return (Criteria) this;
        }

        public Criteria andLhdjImgIsNotNull() {
            addCriterion("lhdj_img is not null");
            return (Criteria) this;
        }

        public Criteria andLhdjImgEqualTo(String value) {
            addCriterion("lhdj_img =", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgNotEqualTo(String value) {
            addCriterion("lhdj_img <>", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgGreaterThan(String value) {
            addCriterion("lhdj_img >", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgGreaterThanOrEqualTo(String value) {
            addCriterion("lhdj_img >=", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgLessThan(String value) {
            addCriterion("lhdj_img <", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgLessThanOrEqualTo(String value) {
            addCriterion("lhdj_img <=", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgLike(String value) {
            addCriterion("lhdj_img like", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgNotLike(String value) {
            addCriterion("lhdj_img not like", value, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgIn(List<String> values) {
            addCriterion("lhdj_img in", values, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgNotIn(List<String> values) {
            addCriterion("lhdj_img not in", values, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgBetween(String value1, String value2) {
            addCriterion("lhdj_img between", value1, value2, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andLhdjImgNotBetween(String value1, String value2) {
            addCriterion("lhdj_img not between", value1, value2, "lhdjImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgIsNull() {
            addCriterion("gyly_img is null");
            return (Criteria) this;
        }

        public Criteria andGylyImgIsNotNull() {
            addCriterion("gyly_img is not null");
            return (Criteria) this;
        }

        public Criteria andGylyImgEqualTo(String value) {
            addCriterion("gyly_img =", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgNotEqualTo(String value) {
            addCriterion("gyly_img <>", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgGreaterThan(String value) {
            addCriterion("gyly_img >", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgGreaterThanOrEqualTo(String value) {
            addCriterion("gyly_img >=", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgLessThan(String value) {
            addCriterion("gyly_img <", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgLessThanOrEqualTo(String value) {
            addCriterion("gyly_img <=", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgLike(String value) {
            addCriterion("gyly_img like", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgNotLike(String value) {
            addCriterion("gyly_img not like", value, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgIn(List<String> values) {
            addCriterion("gyly_img in", values, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgNotIn(List<String> values) {
            addCriterion("gyly_img not in", values, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgBetween(String value1, String value2) {
            addCriterion("gyly_img between", value1, value2, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andGylyImgNotBetween(String value1, String value2) {
            addCriterion("gyly_img not between", value1, value2, "gylyImg");
            return (Criteria) this;
        }

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(String value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(String value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(String value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(String value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(String value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(String value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLike(String value) {
            addCriterion("i_id like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotLike(String value) {
            addCriterion("i_id not like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<String> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<String> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(String value1, String value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(String value1, String value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andJgryImgIsNull() {
            addCriterion("jgry_img is null");
            return (Criteria) this;
        }

        public Criteria andJgryImgIsNotNull() {
            addCriterion("jgry_img is not null");
            return (Criteria) this;
        }

        public Criteria andJgryImgEqualTo(String value) {
            addCriterion("jgry_img =", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgNotEqualTo(String value) {
            addCriterion("jgry_img <>", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgGreaterThan(String value) {
            addCriterion("jgry_img >", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgGreaterThanOrEqualTo(String value) {
            addCriterion("jgry_img >=", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgLessThan(String value) {
            addCriterion("jgry_img <", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgLessThanOrEqualTo(String value) {
            addCriterion("jgry_img <=", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgLike(String value) {
            addCriterion("jgry_img like", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgNotLike(String value) {
            addCriterion("jgry_img not like", value, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgIn(List<String> values) {
            addCriterion("jgry_img in", values, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgNotIn(List<String> values) {
            addCriterion("jgry_img not in", values, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgBetween(String value1, String value2) {
            addCriterion("jgry_img between", value1, value2, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andJgryImgNotBetween(String value1, String value2) {
            addCriterion("jgry_img not between", value1, value2, "jgryImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgIsNull() {
            addCriterion("wsxk_img is null");
            return (Criteria) this;
        }

        public Criteria andWsxkImgIsNotNull() {
            addCriterion("wsxk_img is not null");
            return (Criteria) this;
        }

        public Criteria andWsxkImgEqualTo(String value) {
            addCriterion("wsxk_img =", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgNotEqualTo(String value) {
            addCriterion("wsxk_img <>", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgGreaterThan(String value) {
            addCriterion("wsxk_img >", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgGreaterThanOrEqualTo(String value) {
            addCriterion("wsxk_img >=", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgLessThan(String value) {
            addCriterion("wsxk_img <", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgLessThanOrEqualTo(String value) {
            addCriterion("wsxk_img <=", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgLike(String value) {
            addCriterion("wsxk_img like", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgNotLike(String value) {
            addCriterion("wsxk_img not like", value, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgIn(List<String> values) {
            addCriterion("wsxk_img in", values, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgNotIn(List<String> values) {
            addCriterion("wsxk_img not in", values, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgBetween(String value1, String value2) {
            addCriterion("wsxk_img between", value1, value2, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andWsxkImgNotBetween(String value1, String value2) {
            addCriterion("wsxk_img not between", value1, value2, "wsxkImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgIsNull() {
            addCriterion("yjya_img is null");
            return (Criteria) this;
        }

        public Criteria andYjyaImgIsNotNull() {
            addCriterion("yjya_img is not null");
            return (Criteria) this;
        }

        public Criteria andYjyaImgEqualTo(String value) {
            addCriterion("yjya_img =", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgNotEqualTo(String value) {
            addCriterion("yjya_img <>", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgGreaterThan(String value) {
            addCriterion("yjya_img >", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgGreaterThanOrEqualTo(String value) {
            addCriterion("yjya_img >=", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgLessThan(String value) {
            addCriterion("yjya_img <", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgLessThanOrEqualTo(String value) {
            addCriterion("yjya_img <=", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgLike(String value) {
            addCriterion("yjya_img like", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgNotLike(String value) {
            addCriterion("yjya_img not like", value, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgIn(List<String> values) {
            addCriterion("yjya_img in", values, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgNotIn(List<String> values) {
            addCriterion("yjya_img not in", values, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgBetween(String value1, String value2) {
            addCriterion("yjya_img between", value1, value2, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andYjyaImgNotBetween(String value1, String value2) {
            addCriterion("yjya_img not between", value1, value2, "yjyaImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Integer value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Integer value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Integer value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Integer value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Integer value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Integer> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Integer> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Integer value1, Integer value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Integer value1, Integer value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNull() {
            addCriterion("recommend_reason is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNotNull() {
            addCriterion("recommend_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonEqualTo(String value) {
            addCriterion("recommend_reason =", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotEqualTo(String value) {
            addCriterion("recommend_reason <>", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThan(String value) {
            addCriterion("recommend_reason >", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reason >=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThan(String value) {
            addCriterion("recommend_reason <", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThanOrEqualTo(String value) {
            addCriterion("recommend_reason <=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLike(String value) {
            addCriterion("recommend_reason like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotLike(String value) {
            addCriterion("recommend_reason not like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIn(List<String> values) {
            addCriterion("recommend_reason in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotIn(List<String> values) {
            addCriterion("recommend_reason not in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonBetween(String value1, String value2) {
            addCriterion("recommend_reason between", value1, value2, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotBetween(String value1, String value2) {
            addCriterion("recommend_reason not between", value1, value2, "recommendReason");
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