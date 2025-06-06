package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuimianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuimianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuimianView;


/**
 * 会面
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface HuimianService extends IService<HuimianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuimianVO> selectListVO(Wrapper<HuimianEntity> wrapper);
   	
   	HuimianVO selectVO(@Param("ew") Wrapper<HuimianEntity> wrapper);
   	
   	List<HuimianView> selectListView(Wrapper<HuimianEntity> wrapper);
   	
   	HuimianView selectView(@Param("ew") Wrapper<HuimianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuimianEntity> wrapper);
   	
}

