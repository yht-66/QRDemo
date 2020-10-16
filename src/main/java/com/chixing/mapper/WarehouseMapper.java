package com.chixing.mapper;

import com.chixing.pojo.Warehouse;
import com.chixing.pojo.WarehouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int countByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int deleteByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insert(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int insertSelective(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    List<Warehouse> selectByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);
}