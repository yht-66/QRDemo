package com.chixing.pojo;

import java.util.ArrayList;
import java.util.List;

public class VenuesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public VenuesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
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

        public Criteria andVenuesIdIsNull() {
            addCriterion("venues_id is null");
            return (Criteria) this;
        }

        public Criteria andVenuesIdIsNotNull() {
            addCriterion("venues_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesIdEqualTo(Integer value) {
            addCriterion("venues_id =", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotEqualTo(Integer value) {
            addCriterion("venues_id <>", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdGreaterThan(Integer value) {
            addCriterion("venues_id >", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("venues_id >=", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdLessThan(Integer value) {
            addCriterion("venues_id <", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("venues_id <=", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdIn(List<Integer> values) {
            addCriterion("venues_id in", values, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotIn(List<Integer> values) {
            addCriterion("venues_id not in", values, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdBetween(Integer value1, Integer value2) {
            addCriterion("venues_id between", value1, value2, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("venues_id not between", value1, value2, "venuesId");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Integer value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Integer value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Integer value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Integer value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Integer> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Integer> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Integer value1, Integer value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIsNull() {
            addCriterion("venues_name is null");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIsNotNull() {
            addCriterion("venues_name is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesNameEqualTo(String value) {
            addCriterion("venues_name =", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotEqualTo(String value) {
            addCriterion("venues_name <>", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameGreaterThan(String value) {
            addCriterion("venues_name >", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameGreaterThanOrEqualTo(String value) {
            addCriterion("venues_name >=", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLessThan(String value) {
            addCriterion("venues_name <", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLessThanOrEqualTo(String value) {
            addCriterion("venues_name <=", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLike(String value) {
            addCriterion("venues_name like", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotLike(String value) {
            addCriterion("venues_name not like", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIn(List<String> values) {
            addCriterion("venues_name in", values, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotIn(List<String> values) {
            addCriterion("venues_name not in", values, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameBetween(String value1, String value2) {
            addCriterion("venues_name between", value1, value2, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotBetween(String value1, String value2) {
            addCriterion("venues_name not between", value1, value2, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressIsNull() {
            addCriterion("venues_address is null");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressIsNotNull() {
            addCriterion("venues_address is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressEqualTo(String value) {
            addCriterion("venues_address =", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressNotEqualTo(String value) {
            addCriterion("venues_address <>", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressGreaterThan(String value) {
            addCriterion("venues_address >", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressGreaterThanOrEqualTo(String value) {
            addCriterion("venues_address >=", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressLessThan(String value) {
            addCriterion("venues_address <", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressLessThanOrEqualTo(String value) {
            addCriterion("venues_address <=", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressLike(String value) {
            addCriterion("venues_address like", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressNotLike(String value) {
            addCriterion("venues_address not like", value, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressIn(List<String> values) {
            addCriterion("venues_address in", values, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressNotIn(List<String> values) {
            addCriterion("venues_address not in", values, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressBetween(String value1, String value2) {
            addCriterion("venues_address between", value1, value2, "venuesAddress");
            return (Criteria) this;
        }

        public Criteria andVenuesAddressNotBetween(String value1, String value2) {
            addCriterion("venues_address not between", value1, value2, "venuesAddress");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNull() {
            addCriterion("others1 is null");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNotNull() {
            addCriterion("others1 is not null");
            return (Criteria) this;
        }

        public Criteria andOthers1EqualTo(String value) {
            addCriterion("others1 =", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotEqualTo(String value) {
            addCriterion("others1 <>", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThan(String value) {
            addCriterion("others1 >", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThanOrEqualTo(String value) {
            addCriterion("others1 >=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThan(String value) {
            addCriterion("others1 <", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThanOrEqualTo(String value) {
            addCriterion("others1 <=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Like(String value) {
            addCriterion("others1 like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotLike(String value) {
            addCriterion("others1 not like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1In(List<String> values) {
            addCriterion("others1 in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotIn(List<String> values) {
            addCriterion("others1 not in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Between(String value1, String value2) {
            addCriterion("others1 between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotBetween(String value1, String value2) {
            addCriterion("others1 not between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther3IsNull() {
            addCriterion("other3 is null");
            return (Criteria) this;
        }

        public Criteria andOther3IsNotNull() {
            addCriterion("other3 is not null");
            return (Criteria) this;
        }

        public Criteria andOther3EqualTo(String value) {
            addCriterion("other3 =", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotEqualTo(String value) {
            addCriterion("other3 <>", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThan(String value) {
            addCriterion("other3 >", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThanOrEqualTo(String value) {
            addCriterion("other3 >=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThan(String value) {
            addCriterion("other3 <", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThanOrEqualTo(String value) {
            addCriterion("other3 <=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Like(String value) {
            addCriterion("other3 like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotLike(String value) {
            addCriterion("other3 not like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3In(List<String> values) {
            addCriterion("other3 in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotIn(List<String> values) {
            addCriterion("other3 not in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Between(String value1, String value2) {
            addCriterion("other3 between", value1, value2, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotBetween(String value1, String value2) {
            addCriterion("other3 not between", value1, value2, "other3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated do_not_delete_during_merge Wed Oct 14 20:25:15 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
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