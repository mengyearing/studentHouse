package com.myy.pojo;

import java.util.ArrayList;
import java.util.List;

public class MeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MeetingExample() {
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

        public Criteria andMeetidIsNull() {
            addCriterion("meetId is null");
            return (Criteria) this;
        }

        public Criteria andMeetidIsNotNull() {
            addCriterion("meetId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetidEqualTo(String value) {
            addCriterion("meetId =", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotEqualTo(String value) {
            addCriterion("meetId <>", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidGreaterThan(String value) {
            addCriterion("meetId >", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidGreaterThanOrEqualTo(String value) {
            addCriterion("meetId >=", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidLessThan(String value) {
            addCriterion("meetId <", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidLessThanOrEqualTo(String value) {
            addCriterion("meetId <=", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidLike(String value) {
            addCriterion("meetId like", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotLike(String value) {
            addCriterion("meetId not like", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidIn(List<String> values) {
            addCriterion("meetId in", values, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotIn(List<String> values) {
            addCriterion("meetId not in", values, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidBetween(String value1, String value2) {
            addCriterion("meetId between", value1, value2, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotBetween(String value1, String value2) {
            addCriterion("meetId not between", value1, value2, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidIsNull() {
            addCriterion("meetStuentId is null");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidIsNotNull() {
            addCriterion("meetStuentId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidEqualTo(String value) {
            addCriterion("meetStuentId =", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidNotEqualTo(String value) {
            addCriterion("meetStuentId <>", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidGreaterThan(String value) {
            addCriterion("meetStuentId >", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidGreaterThanOrEqualTo(String value) {
            addCriterion("meetStuentId >=", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidLessThan(String value) {
            addCriterion("meetStuentId <", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidLessThanOrEqualTo(String value) {
            addCriterion("meetStuentId <=", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidLike(String value) {
            addCriterion("meetStuentId like", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidNotLike(String value) {
            addCriterion("meetStuentId not like", value, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidIn(List<String> values) {
            addCriterion("meetStuentId in", values, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidNotIn(List<String> values) {
            addCriterion("meetStuentId not in", values, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidBetween(String value1, String value2) {
            addCriterion("meetStuentId between", value1, value2, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetstuentidNotBetween(String value1, String value2) {
            addCriterion("meetStuentId not between", value1, value2, "meetstuentid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridIsNull() {
            addCriterion("meetMasterId is null");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridIsNotNull() {
            addCriterion("meetMasterId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridEqualTo(String value) {
            addCriterion("meetMasterId =", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridNotEqualTo(String value) {
            addCriterion("meetMasterId <>", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridGreaterThan(String value) {
            addCriterion("meetMasterId >", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridGreaterThanOrEqualTo(String value) {
            addCriterion("meetMasterId >=", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridLessThan(String value) {
            addCriterion("meetMasterId <", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridLessThanOrEqualTo(String value) {
            addCriterion("meetMasterId <=", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridLike(String value) {
            addCriterion("meetMasterId like", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridNotLike(String value) {
            addCriterion("meetMasterId not like", value, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridIn(List<String> values) {
            addCriterion("meetMasterId in", values, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridNotIn(List<String> values) {
            addCriterion("meetMasterId not in", values, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridBetween(String value1, String value2) {
            addCriterion("meetMasterId between", value1, value2, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeetmasteridNotBetween(String value1, String value2) {
            addCriterion("meetMasterId not between", value1, value2, "meetmasterid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidIsNull() {
            addCriterion("meetHouseId is null");
            return (Criteria) this;
        }

        public Criteria andMeethouseidIsNotNull() {
            addCriterion("meetHouseId is not null");
            return (Criteria) this;
        }

        public Criteria andMeethouseidEqualTo(String value) {
            addCriterion("meetHouseId =", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidNotEqualTo(String value) {
            addCriterion("meetHouseId <>", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidGreaterThan(String value) {
            addCriterion("meetHouseId >", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseId >=", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidLessThan(String value) {
            addCriterion("meetHouseId <", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidLessThanOrEqualTo(String value) {
            addCriterion("meetHouseId <=", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidLike(String value) {
            addCriterion("meetHouseId like", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidNotLike(String value) {
            addCriterion("meetHouseId not like", value, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidIn(List<String> values) {
            addCriterion("meetHouseId in", values, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidNotIn(List<String> values) {
            addCriterion("meetHouseId not in", values, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidBetween(String value1, String value2) {
            addCriterion("meetHouseId between", value1, value2, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeethouseidNotBetween(String value1, String value2) {
            addCriterion("meetHouseId not between", value1, value2, "meethouseid");
            return (Criteria) this;
        }

        public Criteria andMeettimeIsNull() {
            addCriterion("meetTime is null");
            return (Criteria) this;
        }

        public Criteria andMeettimeIsNotNull() {
            addCriterion("meetTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeettimeEqualTo(String value) {
            addCriterion("meetTime =", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotEqualTo(String value) {
            addCriterion("meetTime <>", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeGreaterThan(String value) {
            addCriterion("meetTime >", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeGreaterThanOrEqualTo(String value) {
            addCriterion("meetTime >=", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLessThan(String value) {
            addCriterion("meetTime <", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLessThanOrEqualTo(String value) {
            addCriterion("meetTime <=", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLike(String value) {
            addCriterion("meetTime like", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotLike(String value) {
            addCriterion("meetTime not like", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeIn(List<String> values) {
            addCriterion("meetTime in", values, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotIn(List<String> values) {
            addCriterion("meetTime not in", values, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeBetween(String value1, String value2) {
            addCriterion("meetTime between", value1, value2, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotBetween(String value1, String value2) {
            addCriterion("meetTime not between", value1, value2, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddIsNull() {
            addCriterion("meetHouseAdd is null");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddIsNotNull() {
            addCriterion("meetHouseAdd is not null");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddEqualTo(String value) {
            addCriterion("meetHouseAdd =", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddNotEqualTo(String value) {
            addCriterion("meetHouseAdd <>", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddGreaterThan(String value) {
            addCriterion("meetHouseAdd >", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseAdd >=", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddLessThan(String value) {
            addCriterion("meetHouseAdd <", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddLessThanOrEqualTo(String value) {
            addCriterion("meetHouseAdd <=", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddLike(String value) {
            addCriterion("meetHouseAdd like", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddNotLike(String value) {
            addCriterion("meetHouseAdd not like", value, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddIn(List<String> values) {
            addCriterion("meetHouseAdd in", values, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddNotIn(List<String> values) {
            addCriterion("meetHouseAdd not in", values, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddBetween(String value1, String value2) {
            addCriterion("meetHouseAdd between", value1, value2, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseaddNotBetween(String value1, String value2) {
            addCriterion("meetHouseAdd not between", value1, value2, "meethouseadd");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdIsNull() {
            addCriterion("meetHouseHold is null");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdIsNotNull() {
            addCriterion("meetHouseHold is not null");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdEqualTo(String value) {
            addCriterion("meetHouseHold =", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdNotEqualTo(String value) {
            addCriterion("meetHouseHold <>", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdGreaterThan(String value) {
            addCriterion("meetHouseHold >", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseHold >=", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdLessThan(String value) {
            addCriterion("meetHouseHold <", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdLessThanOrEqualTo(String value) {
            addCriterion("meetHouseHold <=", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdLike(String value) {
            addCriterion("meetHouseHold like", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdNotLike(String value) {
            addCriterion("meetHouseHold not like", value, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdIn(List<String> values) {
            addCriterion("meetHouseHold in", values, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdNotIn(List<String> values) {
            addCriterion("meetHouseHold not in", values, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdBetween(String value1, String value2) {
            addCriterion("meetHouseHold between", value1, value2, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethouseholdNotBetween(String value1, String value2) {
            addCriterion("meetHouseHold not between", value1, value2, "meethousehold");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeIsNull() {
            addCriterion("meetHouseType is null");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeIsNotNull() {
            addCriterion("meetHouseType is not null");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeEqualTo(String value) {
            addCriterion("meetHouseType =", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeNotEqualTo(String value) {
            addCriterion("meetHouseType <>", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeGreaterThan(String value) {
            addCriterion("meetHouseType >", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseType >=", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeLessThan(String value) {
            addCriterion("meetHouseType <", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeLessThanOrEqualTo(String value) {
            addCriterion("meetHouseType <=", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeLike(String value) {
            addCriterion("meetHouseType like", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeNotLike(String value) {
            addCriterion("meetHouseType not like", value, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeIn(List<String> values) {
            addCriterion("meetHouseType in", values, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeNotIn(List<String> values) {
            addCriterion("meetHouseType not in", values, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeBetween(String value1, String value2) {
            addCriterion("meetHouseType between", value1, value2, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousetypeNotBetween(String value1, String value2) {
            addCriterion("meetHouseType not between", value1, value2, "meethousetype");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameIsNull() {
            addCriterion("meetHouseMasterName is null");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameIsNotNull() {
            addCriterion("meetHouseMasterName is not null");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameEqualTo(String value) {
            addCriterion("meetHouseMasterName =", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameNotEqualTo(String value) {
            addCriterion("meetHouseMasterName <>", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameGreaterThan(String value) {
            addCriterion("meetHouseMasterName >", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseMasterName >=", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameLessThan(String value) {
            addCriterion("meetHouseMasterName <", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameLessThanOrEqualTo(String value) {
            addCriterion("meetHouseMasterName <=", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameLike(String value) {
            addCriterion("meetHouseMasterName like", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameNotLike(String value) {
            addCriterion("meetHouseMasterName not like", value, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameIn(List<String> values) {
            addCriterion("meetHouseMasterName in", values, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameNotIn(List<String> values) {
            addCriterion("meetHouseMasterName not in", values, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameBetween(String value1, String value2) {
            addCriterion("meetHouseMasterName between", value1, value2, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeethousemasternameNotBetween(String value1, String value2) {
            addCriterion("meetHouseMasterName not between", value1, value2, "meethousemastername");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameIsNull() {
            addCriterion("meetStudentName is null");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameIsNotNull() {
            addCriterion("meetStudentName is not null");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameEqualTo(String value) {
            addCriterion("meetStudentName =", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameNotEqualTo(String value) {
            addCriterion("meetStudentName <>", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameGreaterThan(String value) {
            addCriterion("meetStudentName >", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("meetStudentName >=", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameLessThan(String value) {
            addCriterion("meetStudentName <", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameLessThanOrEqualTo(String value) {
            addCriterion("meetStudentName <=", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameLike(String value) {
            addCriterion("meetStudentName like", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameNotLike(String value) {
            addCriterion("meetStudentName not like", value, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameIn(List<String> values) {
            addCriterion("meetStudentName in", values, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameNotIn(List<String> values) {
            addCriterion("meetStudentName not in", values, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameBetween(String value1, String value2) {
            addCriterion("meetStudentName between", value1, value2, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeetstudentnameNotBetween(String value1, String value2) {
            addCriterion("meetStudentName not between", value1, value2, "meetstudentname");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceIsNull() {
            addCriterion("meetHousePrice is null");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceIsNotNull() {
            addCriterion("meetHousePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceEqualTo(Double value) {
            addCriterion("meetHousePrice =", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceNotEqualTo(Double value) {
            addCriterion("meetHousePrice <>", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceGreaterThan(Double value) {
            addCriterion("meetHousePrice >", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("meetHousePrice >=", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceLessThan(Double value) {
            addCriterion("meetHousePrice <", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceLessThanOrEqualTo(Double value) {
            addCriterion("meetHousePrice <=", value, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceIn(List<Double> values) {
            addCriterion("meetHousePrice in", values, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceNotIn(List<Double> values) {
            addCriterion("meetHousePrice not in", values, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceBetween(Double value1, Double value2) {
            addCriterion("meetHousePrice between", value1, value2, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethousepriceNotBetween(Double value1, Double value2) {
            addCriterion("meetHousePrice not between", value1, value2, "meethouseprice");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoIsNull() {
            addCriterion("meetHouseInfo is null");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoIsNotNull() {
            addCriterion("meetHouseInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoEqualTo(String value) {
            addCriterion("meetHouseInfo =", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoNotEqualTo(String value) {
            addCriterion("meetHouseInfo <>", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoGreaterThan(String value) {
            addCriterion("meetHouseInfo >", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoGreaterThanOrEqualTo(String value) {
            addCriterion("meetHouseInfo >=", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoLessThan(String value) {
            addCriterion("meetHouseInfo <", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoLessThanOrEqualTo(String value) {
            addCriterion("meetHouseInfo <=", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoLike(String value) {
            addCriterion("meetHouseInfo like", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoNotLike(String value) {
            addCriterion("meetHouseInfo not like", value, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoIn(List<String> values) {
            addCriterion("meetHouseInfo in", values, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoNotIn(List<String> values) {
            addCriterion("meetHouseInfo not in", values, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoBetween(String value1, String value2) {
            addCriterion("meetHouseInfo between", value1, value2, "meethouseinfo");
            return (Criteria) this;
        }

        public Criteria andMeethouseinfoNotBetween(String value1, String value2) {
            addCriterion("meetHouseInfo not between", value1, value2, "meethouseinfo");
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