package com.chixing.mapper;

import com.chixing.pojo.Ticket;
import com.chixing.pojo.TicketExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int countByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByPrimaryKey(Integer ticketId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insert(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insertSelective(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    List<Ticket> selectByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    Ticket selectByPrimaryKey(Integer ticketId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Ticket record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKeySelective(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKey(Ticket record);
}