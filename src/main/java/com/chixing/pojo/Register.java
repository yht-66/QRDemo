package com.chixing.pojo;

import java.io.Serializable;

public class Register implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register.id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register.tel
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register.password
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.id
     *
     * @return the value of register.id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.id
     *
     * @param id the value for register.id
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.tel
     *
     * @return the value of register.tel
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.tel
     *
     * @param tel the value for register.tel
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.password
     *
     * @return the value of register.password
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.password
     *
     * @param password the value for register.password
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Wed Oct 14 20:25:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tel=").append(tel);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}