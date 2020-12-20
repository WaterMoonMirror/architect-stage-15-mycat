package com.example.xademo.db132.dao;

import com.example.xademo.db132.model.XA132;
import com.example.xademo.db132.model.XA132Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XA132Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    long countByExample(XA132Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int deleteByExample(XA132Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int insert(XA132 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int insertSelective(XA132 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    List<XA132> selectByExample(XA132Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    XA132 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") XA132 record, @Param("example") XA132Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int updateByExample(@Param("record") XA132 record, @Param("example") XA132Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int updateByPrimaryKeySelective(XA132 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_132
     *
     * @mbg.generated Wed Oct 02 17:02:36 CST 2019
     */
    int updateByPrimaryKey(XA132 record);
}