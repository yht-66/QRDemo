package com.chixing.mapper;

import com.chixing.pojo.Seat;
import com.chixing.pojo.SeatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int countByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insert(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insertSelective(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    List<Seat> selectByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    Seat selectByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKeySelective(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKey(Seat record);
}