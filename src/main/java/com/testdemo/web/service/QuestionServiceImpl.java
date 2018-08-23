package com.testdemo.web.service;

import com.testdemo.web.dao.QuestionDao;
import com.testdemo.web.vo.Question;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**.
 * 功能概要：QuestionService实现类
 * @author liuzixi
 * @since 2018年8月23日
 */
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao dao;

    @Override
    public List<Question> findByTypeId(int id) {
        return dao.findByTypeId(id);
    }

    @Override
    public Question findByQuestionId(int questionId) {
        return dao.findByQuestionId(questionId);
    }
}
