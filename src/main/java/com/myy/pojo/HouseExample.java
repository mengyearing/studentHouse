package com.myy.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HouseExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(String value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(String value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(String value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(String value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(String value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(String value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLike(String value) {
            addCriterion("houseId like", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotLike(String value) {
            addCriterion("houseId not like", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<String> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<String> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(String value1, String value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(String value1, String value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseusernameIsNull() {
            addCriterion("houseUsername is null");
            return (Criteria) this;
        }

        public Criteria andHouseusernameIsNotNull() {
            addCriterion("houseUsername is not null");
            return (Criteria) this;
        }

        public Criteria andHouseusernameEqualTo(String value) {
            addCriterion("houseUsername =", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameNotEqualTo(String value) {
            addCriterion("houseUsername <>", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameGreaterThan(String value) {
            addCriterion("houseUsername >", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameGreaterThanOrEqualTo(String value) {
            addCriterion("houseUsername >=", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameLessThan(String value) {
            addCriterion("houseUsername <", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameLessThanOrEqualTo(String value) {
            addCriterion("houseUsername <=", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameLike(String value) {
            addCriterion("houseUsername like", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameNotLike(String value) {
            addCriterion("houseUsername not like", value, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameIn(List<String> values) {
            addCriterion("houseUsername in", values, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameNotIn(List<String> values) {
            addCriterion("houseUsername not in", values, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameBetween(String value1, String value2) {
            addCriterion("houseUsername between", value1, value2, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseusernameNotBetween(String value1, String value2) {
            addCriterion("houseUsername not between", value1, value2, "houseusername");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNull() {
            addCriterion("houseAdd is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNotNull() {
            addCriterion("houseAdd is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddEqualTo(String value) {
            addCriterion("houseAdd =", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotEqualTo(String value) {
            addCriterion("houseAdd <>", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThan(String value) {
            addCriterion("houseAdd >", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThanOrEqualTo(String value) {
            addCriterion("houseAdd >=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThan(String value) {
            addCriterion("houseAdd <", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThanOrEqualTo(String value) {
            addCriterion("houseAdd <=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLike(String value) {
            addCriterion("houseAdd like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotLike(String value) {
            addCriterion("houseAdd not like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddIn(List<String> values) {
            addCriterion("houseAdd in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotIn(List<String> values) {
            addCriterion("houseAdd not in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddBetween(String value1, String value2) {
            addCriterion("houseAdd between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotBetween(String value1, String value2) {
            addCriterion("houseAdd not between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseinfoIsNull() {
            addCriterion("houseInfo is null");
            return (Criteria) this;
        }

        public Criteria andHouseinfoIsNotNull() {
            addCriterion("houseInfo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseinfoEqualTo(String value) {
            addCriterion("houseInfo =", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoNotEqualTo(String value) {
            addCriterion("houseInfo <>", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoGreaterThan(String value) {
            addCriterion("houseInfo >", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoGreaterThanOrEqualTo(String value) {
            addCriterion("houseInfo >=", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoLessThan(String value) {
            addCriterion("houseInfo <", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoLessThanOrEqualTo(String value) {
            addCriterion("houseInfo <=", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoLike(String value) {
            addCriterion("houseInfo like", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoNotLike(String value) {
            addCriterion("houseInfo not like", value, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoIn(List<String> values) {
            addCriterion("houseInfo in", values, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoNotIn(List<String> values) {
            addCriterion("houseInfo not in", values, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoBetween(String value1, String value2) {
            addCriterion("houseInfo between", value1, value2, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHouseinfoNotBetween(String value1, String value2) {
            addCriterion("houseInfo not between", value1, value2, "houseinfo");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNull() {
            addCriterion("housePrice is null");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNotNull() {
            addCriterion("housePrice is not null");
            return (Criteria) this;
        }

        public Criteria andHousepriceEqualTo(Double value) {
            addCriterion("housePrice =", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotEqualTo(Double value) {
            addCriterion("housePrice <>", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThan(Double value) {
            addCriterion("housePrice >", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("housePrice >=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThan(Double value) {
            addCriterion("housePrice <", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThanOrEqualTo(Double value) {
            addCriterion("housePrice <=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceIn(List<Double> values) {
            addCriterion("housePrice in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotIn(List<Double> values) {
            addCriterion("housePrice not in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceBetween(Double value1, Double value2) {
            addCriterion("housePrice between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotBetween(Double value1, Double value2) {
            addCriterion("housePrice not between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNull() {
            addCriterion("houseType is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNotNull() {
            addCriterion("houseType is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeEqualTo(String value) {
            addCriterion("houseType =", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotEqualTo(String value) {
            addCriterion("houseType <>", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThan(String value) {
            addCriterion("houseType >", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("houseType >=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThan(String value) {
            addCriterion("houseType <", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThanOrEqualTo(String value) {
            addCriterion("houseType <=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLike(String value) {
            addCriterion("houseType like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotLike(String value) {
            addCriterion("houseType not like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeIn(List<String> values) {
            addCriterion("houseType in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotIn(List<String> values) {
            addCriterion("houseType not in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeBetween(String value1, String value2) {
            addCriterion("houseType between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotBetween(String value1, String value2) {
            addCriterion("houseType not between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousehostnameIsNull() {
            addCriterion("houseHostname is null");
            return (Criteria) this;
        }

        public Criteria andHousehostnameIsNotNull() {
            addCriterion("houseHostname is not null");
            return (Criteria) this;
        }

        public Criteria andHousehostnameEqualTo(String value) {
            addCriterion("houseHostname =", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameNotEqualTo(String value) {
            addCriterion("houseHostname <>", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameGreaterThan(String value) {
            addCriterion("houseHostname >", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameGreaterThanOrEqualTo(String value) {
            addCriterion("houseHostname >=", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameLessThan(String value) {
            addCriterion("houseHostname <", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameLessThanOrEqualTo(String value) {
            addCriterion("houseHostname <=", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameLike(String value) {
            addCriterion("houseHostname like", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameNotLike(String value) {
            addCriterion("houseHostname not like", value, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameIn(List<String> values) {
            addCriterion("houseHostname in", values, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameNotIn(List<String> values) {
            addCriterion("houseHostname not in", values, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameBetween(String value1, String value2) {
            addCriterion("houseHostname between", value1, value2, "househostname");
            return (Criteria) this;
        }

        public Criteria andHousehostnameNotBetween(String value1, String value2) {
            addCriterion("houseHostname not between", value1, value2, "househostname");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNull() {
            addCriterion("houseHold is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNotNull() {
            addCriterion("houseHold is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdEqualTo(String value) {
            addCriterion("houseHold =", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotEqualTo(String value) {
            addCriterion("houseHold <>", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThan(String value) {
            addCriterion("houseHold >", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThanOrEqualTo(String value) {
            addCriterion("houseHold >=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThan(String value) {
            addCriterion("houseHold <", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThanOrEqualTo(String value) {
            addCriterion("houseHold <=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLike(String value) {
            addCriterion("houseHold like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotLike(String value) {
            addCriterion("houseHold not like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdIn(List<String> values) {
            addCriterion("houseHold in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotIn(List<String> values) {
            addCriterion("houseHold not in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdBetween(String value1, String value2) {
            addCriterion("houseHold between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotBetween(String value1, String value2) {
            addCriterion("houseHold not between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andHousehostidIsNull() {
            addCriterion("houseHostId is null");
            return (Criteria) this;
        }

        public Criteria andHousehostidIsNotNull() {
            addCriterion("houseHostId is not null");
            return (Criteria) this;
        }

        public Criteria andHousehostidEqualTo(String value) {
            addCriterion("houseHostId =", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidNotEqualTo(String value) {
            addCriterion("houseHostId <>", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidGreaterThan(String value) {
            addCriterion("houseHostId >", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidGreaterThanOrEqualTo(String value) {
            addCriterion("houseHostId >=", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidLessThan(String value) {
            addCriterion("houseHostId <", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidLessThanOrEqualTo(String value) {
            addCriterion("houseHostId <=", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidLike(String value) {
            addCriterion("houseHostId like", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidNotLike(String value) {
            addCriterion("houseHostId not like", value, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidIn(List<String> values) {
            addCriterion("houseHostId in", values, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidNotIn(List<String> values) {
            addCriterion("houseHostId not in", values, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidBetween(String value1, String value2) {
            addCriterion("houseHostId between", value1, value2, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousehostidNotBetween(String value1, String value2) {
            addCriterion("houseHostId not between", value1, value2, "househostid");
            return (Criteria) this;
        }

        public Criteria andHousestatementIsNull() {
            addCriterion("houseStatement is null");
            return (Criteria) this;
        }

        public Criteria andHousestatementIsNotNull() {
            addCriterion("houseStatement is not null");
            return (Criteria) this;
        }

        public Criteria andHousestatementEqualTo(Integer value) {
            addCriterion("houseStatement =", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementNotEqualTo(Integer value) {
            addCriterion("houseStatement <>", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementGreaterThan(Integer value) {
            addCriterion("houseStatement >", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseStatement >=", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementLessThan(Integer value) {
            addCriterion("houseStatement <", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementLessThanOrEqualTo(Integer value) {
            addCriterion("houseStatement <=", value, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementIn(List<Integer> values) {
            addCriterion("houseStatement in", values, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementNotIn(List<Integer> values) {
            addCriterion("houseStatement not in", values, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementBetween(Integer value1, Integer value2) {
            addCriterion("houseStatement between", value1, value2, "housestatement");
            return (Criteria) this;
        }

        public Criteria andHousestatementNotBetween(Integer value1, Integer value2) {
            addCriterion("houseStatement not between", value1, value2, "housestatement");
            return (Criteria) this;
        }
    }

    /**
     */
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