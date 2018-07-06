package com.myy.pojo;

import java.util.ArrayList;
import java.util.List;

public class MasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MasterExample() {
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

        public Criteria andMasteridIsNull() {
            addCriterion("masterId is null");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNotNull() {
            addCriterion("masterId is not null");
            return (Criteria) this;
        }

        public Criteria andMasteridEqualTo(String value) {
            addCriterion("masterId =", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotEqualTo(String value) {
            addCriterion("masterId <>", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThan(String value) {
            addCriterion("masterId >", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThanOrEqualTo(String value) {
            addCriterion("masterId >=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThan(String value) {
            addCriterion("masterId <", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThanOrEqualTo(String value) {
            addCriterion("masterId <=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLike(String value) {
            addCriterion("masterId like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotLike(String value) {
            addCriterion("masterId not like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridIn(List<String> values) {
            addCriterion("masterId in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotIn(List<String> values) {
            addCriterion("masterId not in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridBetween(String value1, String value2) {
            addCriterion("masterId between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotBetween(String value1, String value2) {
            addCriterion("masterId not between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMastrnameIsNull() {
            addCriterion("mastrName is null");
            return (Criteria) this;
        }

        public Criteria andMastrnameIsNotNull() {
            addCriterion("mastrName is not null");
            return (Criteria) this;
        }

        public Criteria andMastrnameEqualTo(String value) {
            addCriterion("mastrName =", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameNotEqualTo(String value) {
            addCriterion("mastrName <>", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameGreaterThan(String value) {
            addCriterion("mastrName >", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameGreaterThanOrEqualTo(String value) {
            addCriterion("mastrName >=", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameLessThan(String value) {
            addCriterion("mastrName <", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameLessThanOrEqualTo(String value) {
            addCriterion("mastrName <=", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameLike(String value) {
            addCriterion("mastrName like", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameNotLike(String value) {
            addCriterion("mastrName not like", value, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameIn(List<String> values) {
            addCriterion("mastrName in", values, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameNotIn(List<String> values) {
            addCriterion("mastrName not in", values, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameBetween(String value1, String value2) {
            addCriterion("mastrName between", value1, value2, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastrnameNotBetween(String value1, String value2) {
            addCriterion("mastrName not between", value1, value2, "mastrname");
            return (Criteria) this;
        }

        public Criteria andMastermoneyIsNull() {
            addCriterion("masterMoney is null");
            return (Criteria) this;
        }

        public Criteria andMastermoneyIsNotNull() {
            addCriterion("masterMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMastermoneyEqualTo(Double value) {
            addCriterion("masterMoney =", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyNotEqualTo(Double value) {
            addCriterion("masterMoney <>", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyGreaterThan(Double value) {
            addCriterion("masterMoney >", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("masterMoney >=", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyLessThan(Double value) {
            addCriterion("masterMoney <", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyLessThanOrEqualTo(Double value) {
            addCriterion("masterMoney <=", value, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyIn(List<Double> values) {
            addCriterion("masterMoney in", values, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyNotIn(List<Double> values) {
            addCriterion("masterMoney not in", values, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyBetween(Double value1, Double value2) {
            addCriterion("masterMoney between", value1, value2, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMastermoneyNotBetween(Double value1, Double value2) {
            addCriterion("masterMoney not between", value1, value2, "mastermoney");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordIsNull() {
            addCriterion("masterPassword is null");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordIsNotNull() {
            addCriterion("masterPassword is not null");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordEqualTo(String value) {
            addCriterion("masterPassword =", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordNotEqualTo(String value) {
            addCriterion("masterPassword <>", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordGreaterThan(String value) {
            addCriterion("masterPassword >", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("masterPassword >=", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordLessThan(String value) {
            addCriterion("masterPassword <", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordLessThanOrEqualTo(String value) {
            addCriterion("masterPassword <=", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordLike(String value) {
            addCriterion("masterPassword like", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordNotLike(String value) {
            addCriterion("masterPassword not like", value, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordIn(List<String> values) {
            addCriterion("masterPassword in", values, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordNotIn(List<String> values) {
            addCriterion("masterPassword not in", values, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordBetween(String value1, String value2) {
            addCriterion("masterPassword between", value1, value2, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterpasswordNotBetween(String value1, String value2) {
            addCriterion("masterPassword not between", value1, value2, "masterpassword");
            return (Criteria) this;
        }

        public Criteria andMasterphoneIsNull() {
            addCriterion("masterPhone is null");
            return (Criteria) this;
        }

        public Criteria andMasterphoneIsNotNull() {
            addCriterion("masterPhone is not null");
            return (Criteria) this;
        }

        public Criteria andMasterphoneEqualTo(String value) {
            addCriterion("masterPhone =", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneNotEqualTo(String value) {
            addCriterion("masterPhone <>", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneGreaterThan(String value) {
            addCriterion("masterPhone >", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneGreaterThanOrEqualTo(String value) {
            addCriterion("masterPhone >=", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneLessThan(String value) {
            addCriterion("masterPhone <", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneLessThanOrEqualTo(String value) {
            addCriterion("masterPhone <=", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneLike(String value) {
            addCriterion("masterPhone like", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneNotLike(String value) {
            addCriterion("masterPhone not like", value, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneIn(List<String> values) {
            addCriterion("masterPhone in", values, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneNotIn(List<String> values) {
            addCriterion("masterPhone not in", values, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneBetween(String value1, String value2) {
            addCriterion("masterPhone between", value1, value2, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasterphoneNotBetween(String value1, String value2) {
            addCriterion("masterPhone not between", value1, value2, "masterphone");
            return (Criteria) this;
        }

        public Criteria andMasteremailIsNull() {
            addCriterion("masterEmail is null");
            return (Criteria) this;
        }

        public Criteria andMasteremailIsNotNull() {
            addCriterion("masterEmail is not null");
            return (Criteria) this;
        }

        public Criteria andMasteremailEqualTo(String value) {
            addCriterion("masterEmail =", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailNotEqualTo(String value) {
            addCriterion("masterEmail <>", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailGreaterThan(String value) {
            addCriterion("masterEmail >", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailGreaterThanOrEqualTo(String value) {
            addCriterion("masterEmail >=", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailLessThan(String value) {
            addCriterion("masterEmail <", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailLessThanOrEqualTo(String value) {
            addCriterion("masterEmail <=", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailLike(String value) {
            addCriterion("masterEmail like", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailNotLike(String value) {
            addCriterion("masterEmail not like", value, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailIn(List<String> values) {
            addCriterion("masterEmail in", values, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailNotIn(List<String> values) {
            addCriterion("masterEmail not in", values, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailBetween(String value1, String value2) {
            addCriterion("masterEmail between", value1, value2, "masteremail");
            return (Criteria) this;
        }

        public Criteria andMasteremailNotBetween(String value1, String value2) {
            addCriterion("masterEmail not between", value1, value2, "masteremail");
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