package com.testdemo.web.dao;

import com.testdemo.web.vo.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**.
 * 功能概要：Question的Dao类.
 * @author liuzixi
 * @since 2018年8月23日
 */

public interface QuestionDao {
    /**.
     * 功能概要：通过题目类型id获取对应的题目列表
     * @param typeId 题目类型id
     * @return typeId类型的所有题目
     */
    List<Question> findByTypeId(@Param("typeId") int typeId);

    /**.
     * 功能概要：通过题目id获取对应的题目
     * @param questionId 题目id
     * @return questionId对应的题目
     */
    Question findByQuestionId(@Param("questionId") int questionId);

}
