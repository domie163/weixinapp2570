package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会面
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@TableName("huimian")
public class HuimianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuimianEntity() {
		
	}
	
	public HuimianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会面编号
	 */
					
	private String huimianbianhao;
	
	/**
	 * 工作名称
	 */
					
	private String gongzuomingcheng;
	
	/**
	 * 工作内容
	 */
					
	private String gongzuoneirong;
	
	/**
	 * 工作地点
	 */
					
	private String gongzuodidian;
	
	/**
	 * 工作时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gongzuoshijian;
	
	/**
	 * 会面时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date huimianshijian;
	
	/**
	 * 会面地点
	 */
					
	private String huimiandidian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会面编号
	 */
	public void setHuimianbianhao(String huimianbianhao) {
		this.huimianbianhao = huimianbianhao;
	}
	/**
	 * 获取：会面编号
	 */
	public String getHuimianbianhao() {
		return huimianbianhao;
	}
	/**
	 * 设置：工作名称
	 */
	public void setGongzuomingcheng(String gongzuomingcheng) {
		this.gongzuomingcheng = gongzuomingcheng;
	}
	/**
	 * 获取：工作名称
	 */
	public String getGongzuomingcheng() {
		return gongzuomingcheng;
	}
	/**
	 * 设置：工作内容
	 */
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
	/**
	 * 设置：工作地点
	 */
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
	/**
	 * 设置：工作时间
	 */
	public void setGongzuoshijian(Date gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	/**
	 * 获取：工作时间
	 */
	public Date getGongzuoshijian() {
		return gongzuoshijian;
	}
	/**
	 * 设置：会面时间
	 */
	public void setHuimianshijian(Date huimianshijian) {
		this.huimianshijian = huimianshijian;
	}
	/**
	 * 获取：会面时间
	 */
	public Date getHuimianshijian() {
		return huimianshijian;
	}
	/**
	 * 设置：会面地点
	 */
	public void setHuimiandidian(String huimiandidian) {
		this.huimiandidian = huimiandidian;
	}
	/**
	 * 获取：会面地点
	 */
	public String getHuimiandidian() {
		return huimiandidian;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
