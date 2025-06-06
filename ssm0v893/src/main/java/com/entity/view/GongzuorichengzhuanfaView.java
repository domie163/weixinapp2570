package com.entity.view;

import com.entity.GongzuorichengzhuanfaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作日程转发
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@TableName("gongzuorichengzhuanfa")
public class GongzuorichengzhuanfaView  extends GongzuorichengzhuanfaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuorichengzhuanfaView(){
	}
 
 	public GongzuorichengzhuanfaView(GongzuorichengzhuanfaEntity gongzuorichengzhuanfaEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuorichengzhuanfaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
