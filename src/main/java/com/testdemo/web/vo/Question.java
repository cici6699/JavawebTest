package com.testdemo.web.vo;

import java.sql.Timestamp;

/**.
 * Question映射类
 * @author liuzixi
 * @since 2018年8月23日
 */
public class Question {
    /**.
     * 题目编号
     */
    private int qustionId;
    /**.
     * 题目内容
     */
    private String content;
    /**.
     * 用户输入的答案
     */
    private String answer;
    /**.
     * 题目类型id
     */
    private int typeId;
    /**.
     * 数据库中存好的正确答案
     */
    private String rightAnswer;
    /**.
     * 用户编号
     */
    private int userId;
    /**.
     * 答案信息（正确与否）
     */
    private String answerInfo;
    /**.
     * 创建时间
     */
    private Timestamp createTime;

    public int getQustionId() {
        return qustionId;
    }
    public void setQustionId(int qustionId) {
        this.qustionId = qustionId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public String getRightAnswer() {
        return rightAnswer;
    }
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getAnswerInfo() {
        return answerInfo;
    }
    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }
    public Timestamp getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
