package com.entity.view;

import com.entity.ZhongyaoriEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 重要日
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@TableName("zhongyaori")
public class ZhongyaoriView  extends ZhongyaoriEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongyaoriView(){
	}
 
 	public ZhongyaoriView(ZhongyaoriEntity zhongyaoriEntity){
 	try {
			BeanUtils.copyProperties(this, zhongyaoriEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
