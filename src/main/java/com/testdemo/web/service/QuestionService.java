package com.testdemo.web.service;

import com.testdemo.web.vo.Question;

import java.util.List;

/**.
 * 功能概要：QuestionService的接口类
 * @author liuzixi
 * @since 2018年8月23日
 */
public interface QuestionService {
    /**.
     * @param id typeid
     * @return 题目列表
     */
    public List<Question> findByTypeId(int id);

    /**.
     * 通过题目id查找题目
     * @param questionId 题目id
     * @return 对应的题目
     */
    Question findByQuestionId(int questionId);
}
