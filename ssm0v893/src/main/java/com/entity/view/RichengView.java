package com.entity.view;

import com.entity.RichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@TableName("richeng")
public class RichengView  extends RichengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RichengView(){
	}
 
 	public RichengView(RichengEntity richengEntity){
 	try {
			BeanUtils.copyProperties(this, richengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
