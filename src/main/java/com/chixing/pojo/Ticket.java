package com.chixing.pojo;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer ticketId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.seat_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer seatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.host_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer hostId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.venues_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer venuesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_type
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String ticketType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_price
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Float ticketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_grade
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String ticketGrade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.com_per_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer comPerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.is_sale
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer isSale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.start_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.stop_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Date stopTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.concert_name
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String concertName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_id
     *
     * @return the value of ticket.ticket_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getTicketId() {
        return ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_id
     *
     * @param ticketId the value for ticket.ticket_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.order_id
     *
     * @return the value of ticket.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.order_id
     *
     * @param orderId the value for ticket.order_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.seat_id
     *
     * @return the value of ticket.seat_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getSeatId() {
        return seatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.seat_id
     *
     * @param seatId the value for ticket.seat_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.host_id
     *
     * @return the value of ticket.host_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getHostId() {
        return hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.host_id
     *
     * @param hostId the value for ticket.host_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.venues_id
     *
     * @return the value of ticket.venues_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getVenuesId() {
        return venuesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.venues_id
     *
     * @param venuesId the value for ticket.venues_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setVenuesId(Integer venuesId) {
        this.venuesId = venuesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_type
     *
     * @return the value of ticket.ticket_type
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_type
     *
     * @param ticketType the value for ticket.ticket_type
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_price
     *
     * @return the value of ticket.ticket_price
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Float getTicketPrice() {
        return ticketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_price
     *
     * @param ticketPrice the value for ticket.ticket_price
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketPrice(Float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_grade
     *
     * @return the value of ticket.ticket_grade
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getTicketGrade() {
        return ticketGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_grade
     *
     * @param ticketGrade the value for ticket.ticket_grade
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketGrade(String ticketGrade) {
        this.ticketGrade = ticketGrade == null ? null : ticketGrade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.com_per_id
     *
     * @return the value of ticket.com_per_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getComPerId() {
        return comPerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.com_per_id
     *
     * @param comPerId the value for ticket.com_per_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setComPerId(Integer comPerId) {
        this.comPerId = comPerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.is_sale
     *
     * @return the value of ticket.is_sale
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getIsSale() {
        return isSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.is_sale
     *
     * @param isSale the value for ticket.is_sale
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setIsSale(Integer isSale) {
        this.isSale = isSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.start_time
     *
     * @return the value of ticket.start_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.start_time
     *
     * @param startTime the value for ticket.start_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.stop_time
     *
     * @return the value of ticket.stop_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Date getStopTime() {
        return stopTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.stop_time
     *
     * @param stopTime the value for ticket.stop_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.status
     *
     * @return the value of ticket.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.status
     *
     * @param status the value for ticket.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.other1
     *
     * @return the value of ticket.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.other1
     *
     * @param other1 the value for ticket.other1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.other2
     *
     * @return the value of ticket.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.other2
     *
     * @param other2 the value for ticket.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.concert_name
     *
     * @return the value of ticket.concert_name
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getConcertName() {
        return concertName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.concert_name
     *
     * @param concertName the value for ticket.concert_name
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setConcertName(String concertName) {
        this.concertName = concertName == null ? null : concertName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ticketId=").append(ticketId);
        sb.append(", orderId=").append(orderId);
        sb.append(", seatId=").append(seatId);
        sb.append(", hostId=").append(hostId);
        sb.append(", venuesId=").append(venuesId);
        sb.append(", ticketType=").append(ticketType);
        sb.append(", ticketPrice=").append(ticketPrice);
        sb.append(", ticketGrade=").append(ticketGrade);
        sb.append(", comPerId=").append(comPerId);
        sb.append(", isSale=").append(isSale);
        sb.append(", startTime=").append(startTime);
        sb.append(", stopTime=").append(stopTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", concertName=").append(concertName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}