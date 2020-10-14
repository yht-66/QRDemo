package com.chixing.mapper;

import com.chixing.pojo.Register;
import com.chixing.pojo.RegisterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int countByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insert(Register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insertSelective(Register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    List<Register> selectByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    Register selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKeySelective(Register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByPrimaryKey(Register record);
}