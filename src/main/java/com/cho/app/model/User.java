package com.cho.app.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String uuid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.status
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.name
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.pwd
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String pwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.group_uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String groupUuid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.insert_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String insertUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.insert_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private Date insertTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.update_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private String updateUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.update_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.uuid
	 * @return  the value of user.uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.uuid
	 * @param uuid  the value for user.uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.status
	 * @return  the value of user.status
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.status
	 * @param status  the value for user.status
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.name
	 * @return  the value of user.name
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.name
	 * @param name  the value for user.name
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.pwd
	 * @return  the value of user.pwd
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.pwd
	 * @param pwd  the value for user.pwd
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.group_uuid
	 * @return  the value of user.group_uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getGroupUuid() {
		return groupUuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.group_uuid
	 * @param groupUuid  the value for user.group_uuid
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setGroupUuid(String groupUuid) {
		this.groupUuid = groupUuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.insert_user
	 * @return  the value of user.insert_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getInsertUser() {
		return insertUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.insert_user
	 * @param insertUser  the value for user.insert_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.insert_time
	 * @return  the value of user.insert_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public Date getInsertTime() {
		return insertTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.insert_time
	 * @param insertTime  the value for user.insert_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.update_user
	 * @return  the value of user.update_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.update_user
	 * @param updateUser  the value for user.update_user
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.update_time
	 * @return  the value of user.update_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.update_time
	 * @param updateTime  the value for user.update_time
	 * @mbg.generated  Mon Feb 03 16:29:56 JST 2020
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}