package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuorichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuorichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorichengView;


/**
 * 工作日程
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface GongzuorichengService extends IService<GongzuorichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuorichengVO> selectListVO(Wrapper<GongzuorichengEntity> wrapper);
   	
   	GongzuorichengVO selectVO(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
   	
   	List<GongzuorichengView> selectListView(Wrapper<GongzuorichengEntity> wrapper);
   	
   	GongzuorichengView selectView(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuorichengEntity> wrapper);
   	
}

