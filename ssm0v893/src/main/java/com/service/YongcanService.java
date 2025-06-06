package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongcanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongcanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongcanView;


/**
 * 用餐
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface YongcanService extends IService<YongcanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongcanVO> selectListVO(Wrapper<YongcanEntity> wrapper);
   	
   	YongcanVO selectVO(@Param("ew") Wrapper<YongcanEntity> wrapper);
   	
   	List<YongcanView> selectListView(Wrapper<YongcanEntity> wrapper);
   	
   	YongcanView selectView(@Param("ew") Wrapper<YongcanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongcanEntity> wrapper);
   	
}

