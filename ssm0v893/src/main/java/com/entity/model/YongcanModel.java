package com.entity.model;

import com.entity.YongcanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用餐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public class YongcanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gongzuoshijian;
		
	/**
	 * 用餐时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yongcanshijian;
		
	/**
	 * 用餐地点
	 */
	
	private String yongcandidian;
		
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
	 * 设置：用餐时间
	 */
	 
	public void setYongcanshijian(Date yongcanshijian) {
		this.yongcanshijian = yongcanshijian;
	}
	
	/**
	 * 获取：用餐时间
	 */
	public Date getYongcanshijian() {
		return yongcanshijian;
	}
				
	
	/**
	 * 设置：用餐地点
	 */
	 
	public void setYongcandidian(String yongcandidian) {
		this.yongcandidian = yongcandidian;
	}
	
	/**
	 * 获取：用餐地点
	 */
	public String getYongcandidian() {
		return yongcandidian;
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
