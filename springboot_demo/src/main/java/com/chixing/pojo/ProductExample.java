package com.chixing.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
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
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNumIsNull() {
            addCriterion("pro_num is null");
            return (Criteria) this;
        }

        public Criteria andProNumIsNotNull() {
            addCriterion("pro_num is not null");
            return (Criteria) this;
        }

        public Criteria andProNumEqualTo(Long value) {
            addCriterion("pro_num =", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotEqualTo(Long value) {
            addCriterion("pro_num <>", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThan(Long value) {
            addCriterion("pro_num >", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_num >=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThan(Long value) {
            addCriterion("pro_num <", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThanOrEqualTo(Long value) {
            addCriterion("pro_num <=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumIn(List<Long> values) {
            addCriterion("pro_num in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotIn(List<Long> values) {
            addCriterion("pro_num not in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumBetween(Long value1, Long value2) {
            addCriterion("pro_num between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotBetween(Long value1, Long value2) {
            addCriterion("pro_num not between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProSizeIsNull() {
            addCriterion("pro_size is null");
            return (Criteria) this;
        }

        public Criteria andProSizeIsNotNull() {
            addCriterion("pro_size is not null");
            return (Criteria) this;
        }

        public Criteria andProSizeEqualTo(Float value) {
            addCriterion("pro_size =", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotEqualTo(Float value) {
            addCriterion("pro_size <>", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeGreaterThan(Float value) {
            addCriterion("pro_size >", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("pro_size >=", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeLessThan(Float value) {
            addCriterion("pro_size <", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeLessThanOrEqualTo(Float value) {
            addCriterion("pro_size <=", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeIn(List<Float> values) {
            addCriterion("pro_size in", values, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotIn(List<Float> values) {
            addCriterion("pro_size not in", values, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeBetween(Float value1, Float value2) {
            addCriterion("pro_size between", value1, value2, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotBetween(Float value1, Float value2) {
            addCriterion("pro_size not between", value1, value2, "proSize");
            return (Criteria) this;
        }

        public Criteria andProColorIsNull() {
            addCriterion("pro_color is null");
            return (Criteria) this;
        }

        public Criteria andProColorIsNotNull() {
            addCriterion("pro_color is not null");
            return (Criteria) this;
        }

        public Criteria andProColorEqualTo(String value) {
            addCriterion("pro_color =", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorNotEqualTo(String value) {
            addCriterion("pro_color <>", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorGreaterThan(String value) {
            addCriterion("pro_color >", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorGreaterThanOrEqualTo(String value) {
            addCriterion("pro_color >=", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorLessThan(String value) {
            addCriterion("pro_color <", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorLessThanOrEqualTo(String value) {
            addCriterion("pro_color <=", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorLike(String value) {
            addCriterion("pro_color like", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorNotLike(String value) {
            addCriterion("pro_color not like", value, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorIn(List<String> values) {
            addCriterion("pro_color in", values, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorNotIn(List<String> values) {
            addCriterion("pro_color not in", values, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorBetween(String value1, String value2) {
            addCriterion("pro_color between", value1, value2, "proColor");
            return (Criteria) this;
        }

        public Criteria andProColorNotBetween(String value1, String value2) {
            addCriterion("pro_color not between", value1, value2, "proColor");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Float value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Float value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Float value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Float value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Float value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Float> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Float> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Float value1, Float value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Float value1, Float value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNull() {
            addCriterion("pro_address is null");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNotNull() {
            addCriterion("pro_address is not null");
            return (Criteria) this;
        }

        public Criteria andProAddressEqualTo(String value) {
            addCriterion("pro_address =", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotEqualTo(String value) {
            addCriterion("pro_address <>", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThan(String value) {
            addCriterion("pro_address >", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_address >=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThan(String value) {
            addCriterion("pro_address <", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThanOrEqualTo(String value) {
            addCriterion("pro_address <=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLike(String value) {
            addCriterion("pro_address like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotLike(String value) {
            addCriterion("pro_address not like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressIn(List<String> values) {
            addCriterion("pro_address in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotIn(List<String> values) {
            addCriterion("pro_address not in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressBetween(String value1, String value2) {
            addCriterion("pro_address between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotBetween(String value1, String value2) {
            addCriterion("pro_address not between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProDateIsNull() {
            addCriterion("pro_date is null");
            return (Criteria) this;
        }

        public Criteria andProDateIsNotNull() {
            addCriterion("pro_date is not null");
            return (Criteria) this;
        }

        public Criteria andProDateEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date =", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date <>", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_date >", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date >=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThan(Date value) {
            addCriterionForJDBCDate("pro_date <", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date <=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateIn(List<Date> values) {
            addCriterionForJDBCDate("pro_date in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_date not in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_date between", value1, value2, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_date not between", value1, value2, "proDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbggenerated do_not_delete_during_merge Fri Sep 18 15:09:08 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbggenerated Fri Sep 18 15:09:08 CST 2020
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