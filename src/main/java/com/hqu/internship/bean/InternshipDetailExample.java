package com.hqu.internship.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InternshipDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InternshipDetailExample() {
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

        public Criteria andInternshipIdIsNull() {
            addCriterion("internship_id is null");
            return (Criteria) this;
        }

        public Criteria andInternshipIdIsNotNull() {
            addCriterion("internship_id is not null");
            return (Criteria) this;
        }

        public Criteria andInternshipIdEqualTo(Integer value) {
            addCriterion("internship_id =", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdNotEqualTo(Integer value) {
            addCriterion("internship_id <>", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdGreaterThan(Integer value) {
            addCriterion("internship_id >", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("internship_id >=", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdLessThan(Integer value) {
            addCriterion("internship_id <", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdLessThanOrEqualTo(Integer value) {
            addCriterion("internship_id <=", value, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdIn(List<Integer> values) {
            addCriterion("internship_id in", values, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdNotIn(List<Integer> values) {
            addCriterion("internship_id not in", values, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdBetween(Integer value1, Integer value2) {
            addCriterion("internship_id between", value1, value2, "internshipId");
            return (Criteria) this;
        }

        public Criteria andInternshipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("internship_id not between", value1, value2, "internshipId");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNull() {
            addCriterion("need_num is null");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNotNull() {
            addCriterion("need_num is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNumEqualTo(Integer value) {
            addCriterion("need_num =", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotEqualTo(Integer value) {
            addCriterion("need_num <>", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThan(Integer value) {
            addCriterion("need_num >", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_num >=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThan(Integer value) {
            addCriterion("need_num <", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThanOrEqualTo(Integer value) {
            addCriterion("need_num <=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumIn(List<Integer> values) {
            addCriterion("need_num in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotIn(List<Integer> values) {
            addCriterion("need_num not in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumBetween(Integer value1, Integer value2) {
            addCriterion("need_num between", value1, value2, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("need_num not between", value1, value2, "needNum");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeIsNull() {
            addCriterion("exp_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeIsNotNull() {
            addCriterion("exp_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeEqualTo(Date value) {
            addCriterion("exp_end_time =", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeNotEqualTo(Date value) {
            addCriterion("exp_end_time <>", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeGreaterThan(Date value) {
            addCriterion("exp_end_time >", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_end_time >=", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeLessThan(Date value) {
            addCriterion("exp_end_time <", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_end_time <=", value, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeIn(List<Date> values) {
            addCriterion("exp_end_time in", values, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeNotIn(List<Date> values) {
            addCriterion("exp_end_time not in", values, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeBetween(Date value1, Date value2) {
            addCriterion("exp_end_time between", value1, value2, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andExpEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_end_time not between", value1, value2, "expEndTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNull() {
            addCriterion("apply_end_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNotNull() {
            addCriterion("apply_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeEqualTo(Date value) {
            addCriterion("apply_end_time =", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotEqualTo(Date value) {
            addCriterion("apply_end_time <>", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThan(Date value) {
            addCriterion("apply_end_time >", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_end_time >=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThan(Date value) {
            addCriterion("apply_end_time <", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_end_time <=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIn(List<Date> values) {
            addCriterion("apply_end_time in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotIn(List<Date> values) {
            addCriterion("apply_end_time not in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeBetween(Date value1, Date value2) {
            addCriterion("apply_end_time between", value1, value2, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_end_time not between", value1, value2, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeIsNull() {
            addCriterion("exp_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeIsNotNull() {
            addCriterion("exp_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeEqualTo(Date value) {
            addCriterion("exp_modify_time =", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeNotEqualTo(Date value) {
            addCriterion("exp_modify_time <>", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeGreaterThan(Date value) {
            addCriterion("exp_modify_time >", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_modify_time >=", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeLessThan(Date value) {
            addCriterion("exp_modify_time <", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_modify_time <=", value, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeIn(List<Date> values) {
            addCriterion("exp_modify_time in", values, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeNotIn(List<Date> values) {
            addCriterion("exp_modify_time not in", values, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeBetween(Date value1, Date value2) {
            addCriterion("exp_modify_time between", value1, value2, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_modify_time not between", value1, value2, "expModifyTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeIsNull() {
            addCriterion("exp_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeIsNotNull() {
            addCriterion("exp_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeEqualTo(Date value) {
            addCriterion("exp_begin_time =", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeNotEqualTo(Date value) {
            addCriterion("exp_begin_time <>", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeGreaterThan(Date value) {
            addCriterion("exp_begin_time >", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_begin_time >=", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeLessThan(Date value) {
            addCriterion("exp_begin_time <", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_begin_time <=", value, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeIn(List<Date> values) {
            addCriterion("exp_begin_time in", values, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeNotIn(List<Date> values) {
            addCriterion("exp_begin_time not in", values, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeBetween(Date value1, Date value2) {
            addCriterion("exp_begin_time between", value1, value2, "expBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_begin_time not between", value1, value2, "expBeginTime");
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