package com.myy.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("studentId like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("studentId not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentusernameIsNull() {
            addCriterion("studentUsername is null");
            return (Criteria) this;
        }

        public Criteria andStudentusernameIsNotNull() {
            addCriterion("studentUsername is not null");
            return (Criteria) this;
        }

        public Criteria andStudentusernameEqualTo(String value) {
            addCriterion("studentUsername =", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameNotEqualTo(String value) {
            addCriterion("studentUsername <>", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameGreaterThan(String value) {
            addCriterion("studentUsername >", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameGreaterThanOrEqualTo(String value) {
            addCriterion("studentUsername >=", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameLessThan(String value) {
            addCriterion("studentUsername <", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameLessThanOrEqualTo(String value) {
            addCriterion("studentUsername <=", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameLike(String value) {
            addCriterion("studentUsername like", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameNotLike(String value) {
            addCriterion("studentUsername not like", value, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameIn(List<String> values) {
            addCriterion("studentUsername in", values, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameNotIn(List<String> values) {
            addCriterion("studentUsername not in", values, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameBetween(String value1, String value2) {
            addCriterion("studentUsername between", value1, value2, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentusernameNotBetween(String value1, String value2) {
            addCriterion("studentUsername not between", value1, value2, "studentusername");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNull() {
            addCriterion("studentPassword is null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNotNull() {
            addCriterion("studentPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordEqualTo(String value) {
            addCriterion("studentPassword =", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotEqualTo(String value) {
            addCriterion("studentPassword <>", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThan(String value) {
            addCriterion("studentPassword >", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("studentPassword >=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThan(String value) {
            addCriterion("studentPassword <", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThanOrEqualTo(String value) {
            addCriterion("studentPassword <=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLike(String value) {
            addCriterion("studentPassword like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotLike(String value) {
            addCriterion("studentPassword not like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIn(List<String> values) {
            addCriterion("studentPassword in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotIn(List<String> values) {
            addCriterion("studentPassword not in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordBetween(String value1, String value2) {
            addCriterion("studentPassword between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotBetween(String value1, String value2) {
            addCriterion("studentPassword not between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNull() {
            addCriterion("studentPhone is null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNotNull() {
            addCriterion("studentPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneEqualTo(String value) {
            addCriterion("studentPhone =", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotEqualTo(String value) {
            addCriterion("studentPhone <>", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThan(String value) {
            addCriterion("studentPhone >", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("studentPhone >=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThan(String value) {
            addCriterion("studentPhone <", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThanOrEqualTo(String value) {
            addCriterion("studentPhone <=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLike(String value) {
            addCriterion("studentPhone like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotLike(String value) {
            addCriterion("studentPhone not like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIn(List<String> values) {
            addCriterion("studentPhone in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotIn(List<String> values) {
            addCriterion("studentPhone not in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneBetween(String value1, String value2) {
            addCriterion("studentPhone between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotBetween(String value1, String value2) {
            addCriterion("studentPhone not between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNull() {
            addCriterion("studentSex is null");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNotNull() {
            addCriterion("studentSex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsexEqualTo(String value) {
            addCriterion("studentSex =", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotEqualTo(String value) {
            addCriterion("studentSex <>", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThan(String value) {
            addCriterion("studentSex >", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThanOrEqualTo(String value) {
            addCriterion("studentSex >=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThan(String value) {
            addCriterion("studentSex <", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThanOrEqualTo(String value) {
            addCriterion("studentSex <=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLike(String value) {
            addCriterion("studentSex like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotLike(String value) {
            addCriterion("studentSex not like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexIn(List<String> values) {
            addCriterion("studentSex in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotIn(List<String> values) {
            addCriterion("studentSex not in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexBetween(String value1, String value2) {
            addCriterion("studentSex between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotBetween(String value1, String value2) {
            addCriterion("studentSex not between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentemailIsNull() {
            addCriterion("studentEmail is null");
            return (Criteria) this;
        }

        public Criteria andStudentemailIsNotNull() {
            addCriterion("studentEmail is not null");
            return (Criteria) this;
        }

        public Criteria andStudentemailEqualTo(String value) {
            addCriterion("studentEmail =", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotEqualTo(String value) {
            addCriterion("studentEmail <>", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailGreaterThan(String value) {
            addCriterion("studentEmail >", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailGreaterThanOrEqualTo(String value) {
            addCriterion("studentEmail >=", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLessThan(String value) {
            addCriterion("studentEmail <", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLessThanOrEqualTo(String value) {
            addCriterion("studentEmail <=", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLike(String value) {
            addCriterion("studentEmail like", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotLike(String value) {
            addCriterion("studentEmail not like", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailIn(List<String> values) {
            addCriterion("studentEmail in", values, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotIn(List<String> values) {
            addCriterion("studentEmail not in", values, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailBetween(String value1, String value2) {
            addCriterion("studentEmail between", value1, value2, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotBetween(String value1, String value2) {
            addCriterion("studentEmail not between", value1, value2, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedIsNull() {
            addCriterion("studentchecked is null");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedIsNotNull() {
            addCriterion("studentchecked is not null");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedEqualTo(String value) {
            addCriterion("studentchecked =", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedNotEqualTo(String value) {
            addCriterion("studentchecked <>", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedGreaterThan(String value) {
            addCriterion("studentchecked >", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedGreaterThanOrEqualTo(String value) {
            addCriterion("studentchecked >=", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedLessThan(String value) {
            addCriterion("studentchecked <", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedLessThanOrEqualTo(String value) {
            addCriterion("studentchecked <=", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedLike(String value) {
            addCriterion("studentchecked like", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedNotLike(String value) {
            addCriterion("studentchecked not like", value, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedIn(List<String> values) {
            addCriterion("studentchecked in", values, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedNotIn(List<String> values) {
            addCriterion("studentchecked not in", values, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedBetween(String value1, String value2) {
            addCriterion("studentchecked between", value1, value2, "studentchecked");
            return (Criteria) this;
        }

        public Criteria andStudentcheckedNotBetween(String value1, String value2) {
            addCriterion("studentchecked not between", value1, value2, "studentchecked");
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