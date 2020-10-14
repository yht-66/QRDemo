package com.chixing.pojo;

import java.io.Serializable;
import java.util.Date;

public class MyOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.ticket_num
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer ticketNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.order_money
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Float orderMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.order_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_order.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table my_order
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.order_id
     *
     * @return the value of my_order.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.order_id
     *
     * @param orderId the value for my_order.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.user_id
     *
     * @return the value of my_order.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.user_id
     *
     * @param userId the value for my_order.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.ticket_num
     *
     * @return the value of my_order.ticket_num
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getTicketNum() {
        return ticketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.ticket_num
     *
     * @param ticketNum the value for my_order.ticket_num
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.order_money
     *
     * @return the value of my_order.order_money
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Float getOrderMoney() {
        return orderMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.order_money
     *
     * @param orderMoney the value for my_order.order_money
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOrderMoney(Float orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.order_time
     *
     * @return the value of my_order.order_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.order_time
     *
     * @param orderTime the value for my_order.order_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.status
     *
     * @return the value of my_order.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.status
     *
     * @param status the value for my_order.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.other1
     *
     * @return the value of my_order.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.other1
     *
     * @param other1 the value for my_order.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_order.other2
     *
     * @return the value of my_order.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_order.other2
     *
     * @param other2 the value for my_order.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_order
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}