package com.baibaoxiang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DayTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DayTotalExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDayReadNumIsNull() {
            addCriterion("day_read_num is null");
            return (Criteria) this;
        }

        public Criteria andDayReadNumIsNotNull() {
            addCriterion("day_read_num is not null");
            return (Criteria) this;
        }

        public Criteria andDayReadNumEqualTo(Integer value) {
            addCriterion("day_read_num =", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumNotEqualTo(Integer value) {
            addCriterion("day_read_num <>", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumGreaterThan(Integer value) {
            addCriterion("day_read_num >", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_read_num >=", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumLessThan(Integer value) {
            addCriterion("day_read_num <", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumLessThanOrEqualTo(Integer value) {
            addCriterion("day_read_num <=", value, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumIn(List<Integer> values) {
            addCriterion("day_read_num in", values, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumNotIn(List<Integer> values) {
            addCriterion("day_read_num not in", values, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumBetween(Integer value1, Integer value2) {
            addCriterion("day_read_num between", value1, value2, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayReadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_read_num not between", value1, value2, "dayReadNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumIsNull() {
            addCriterion("day_like_num is null");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumIsNotNull() {
            addCriterion("day_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumEqualTo(Integer value) {
            addCriterion("day_like_num =", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumNotEqualTo(Integer value) {
            addCriterion("day_like_num <>", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumGreaterThan(Integer value) {
            addCriterion("day_like_num >", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_like_num >=", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumLessThan(Integer value) {
            addCriterion("day_like_num <", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("day_like_num <=", value, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumIn(List<Integer> values) {
            addCriterion("day_like_num in", values, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumNotIn(List<Integer> values) {
            addCriterion("day_like_num not in", values, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("day_like_num between", value1, value2, "dayLikeNum");
            return (Criteria) this;
        }

        public Criteria andDayLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_like_num not between", value1, value2, "dayLikeNum");
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