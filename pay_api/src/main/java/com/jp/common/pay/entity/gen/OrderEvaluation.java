package com.jp.common.pay.entity.gen;

import java.io.Serializable;
import java.util.Date;

public class OrderEvaluation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.order_number
     *
     * @mbggenerated
     */
    private String orderNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.product_id
     *
     * @mbggenerated
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.evaluation_star
     *
     * @mbggenerated
     */
    private String evaluationStar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.evaluation_content
     *
     * @mbggenerated
     */
    private String evaluationContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jp_order_evaluation.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jp_order_evaluation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.id
     *
     * @return the value of jp_order_evaluation.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.id
     *
     * @param id the value for jp_order_evaluation.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.user_id
     *
     * @return the value of jp_order_evaluation.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.user_id
     *
     * @param userId the value for jp_order_evaluation.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.order_number
     *
     * @return the value of jp_order_evaluation.order_number
     *
     * @mbggenerated
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.order_number
     *
     * @param orderNumber the value for jp_order_evaluation.order_number
     *
     * @mbggenerated
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.product_id
     *
     * @return the value of jp_order_evaluation.product_id
     *
     * @mbggenerated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.product_id
     *
     * @param productId the value for jp_order_evaluation.product_id
     *
     * @mbggenerated
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.evaluation_star
     *
     * @return the value of jp_order_evaluation.evaluation_star
     *
     * @mbggenerated
     */
    public String getEvaluationStar() {
        return evaluationStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.evaluation_star
     *
     * @param evaluationStar the value for jp_order_evaluation.evaluation_star
     *
     * @mbggenerated
     */
    public void setEvaluationStar(String evaluationStar) {
        this.evaluationStar = evaluationStar == null ? null : evaluationStar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.evaluation_content
     *
     * @return the value of jp_order_evaluation.evaluation_content
     *
     * @mbggenerated
     */
    public String getEvaluationContent() {
        return evaluationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.evaluation_content
     *
     * @param evaluationContent the value for jp_order_evaluation.evaluation_content
     *
     * @mbggenerated
     */
    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jp_order_evaluation.create_time
     *
     * @return the value of jp_order_evaluation.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jp_order_evaluation.create_time
     *
     * @param createTime the value for jp_order_evaluation.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}