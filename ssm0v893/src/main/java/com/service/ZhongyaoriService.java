package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongyaoriEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongyaoriVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongyaoriView;


/**
 * 重要日
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface ZhongyaoriService extends IService<ZhongyaoriEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongyaoriVO> selectListVO(Wrapper<ZhongyaoriEntity> wrapper);
   	
   	ZhongyaoriVO selectVO(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
   	
   	List<ZhongyaoriView> selectListView(Wrapper<ZhongyaoriEntity> wrapper);
   	
   	ZhongyaoriView selectView(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongyaoriEntity> wrapper);
   	
}

