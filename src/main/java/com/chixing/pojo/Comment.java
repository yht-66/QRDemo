package com.chixing.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Date commentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_writing
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String commentWriting;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.tickets_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer ticketsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.others1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String others1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_id
     *
     * @return the value of comment.comment_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_id
     *
     * @param commentId the value for comment.comment_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_id
     *
     * @return the value of comment.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_id
     *
     * @param userId the value for comment.user_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_time
     *
     * @return the value of comment.comment_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_time
     *
     * @param commentTime the value for comment.comment_time
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_writing
     *
     * @return the value of comment.comment_writing
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getCommentWriting() {
        return commentWriting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_writing
     *
     * @param commentWriting the value for comment.comment_writing
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setCommentWriting(String commentWriting) {
        this.commentWriting = commentWriting == null ? null : commentWriting.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.tickets_id
     *
     * @return the value of comment.tickets_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getTicketsId() {
        return ticketsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.tickets_id
     *
     * @param ticketsId the value for comment.tickets_id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTicketsId(Integer ticketsId) {
        this.ticketsId = ticketsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.status
     *
     * @return the value of comment.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.status
     *
     * @param status the value for comment.status
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.others1
     *
     * @return the value of comment.others1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOthers1() {
        return others1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.others1
     *
     * @param others1 the value for comment.others1
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOthers1(String others1) {
        this.others1 = others1 == null ? null : others1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.other2
     *
     * @return the value of comment.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.other2
     *
     * @param other2 the value for comment.other2
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", userId=").append(userId);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", commentWriting=").append(commentWriting);
        sb.append(", ticketsId=").append(ticketsId);
        sb.append(", status=").append(status);
        sb.append(", others1=").append(others1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}