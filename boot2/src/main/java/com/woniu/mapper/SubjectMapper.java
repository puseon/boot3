package com.woniu.mapper;

import com.woniu.entity.Subject;
import com.woniu.entity.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper { 
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int countByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int deleteByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int deleteByPrimaryKey(Integer subjectid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int insert(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int insertSelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    List<Subject> selectByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    Subject selectByPrimaryKey(Integer subjectid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int updateByPrimaryKeySelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Fri Apr 12 15:20:44 CST 2019
     */
    int updateByPrimaryKey(Subject record);
}