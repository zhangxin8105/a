package com.springapp.model.database;

import java.util.Date;

public class Userid {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userid.id
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userid.uid
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userid.param
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    private String param;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userid.day
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    private Date day;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userid.id
     *
     * @return the value of userid.id
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userid.id
     *
     * @param id the value for userid.id
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userid.uid
     *
     * @return the value of userid.uid
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userid.uid
     *
     * @param uid the value for userid.uid
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userid.param
     *
     * @return the value of userid.param
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public String getParam() {
        return param;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userid.param
     *
     * @param param the value for userid.param
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userid.day
     *
     * @return the value of userid.day
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public Date getDay() {
        return day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userid.day
     *
     * @param day the value for userid.day
     *
     * @mbggenerated Thu Sep 03 08:56:17 CST 2015
     */
    public void setDay(Date day) {
        this.day = day;
    }
}