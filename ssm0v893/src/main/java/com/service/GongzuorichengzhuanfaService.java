package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuorichengzhuanfaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuorichengzhuanfaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorichengzhuanfaView;


/**
 * 工作日程转发
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface GongzuorichengzhuanfaService extends IService<GongzuorichengzhuanfaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuorichengzhuanfaVO> selectListVO(Wrapper<GongzuorichengzhuanfaEntity> wrapper);
   	
   	GongzuorichengzhuanfaVO selectVO(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
   	
   	List<GongzuorichengzhuanfaView> selectListView(Wrapper<GongzuorichengzhuanfaEntity> wrapper);
   	
   	GongzuorichengzhuanfaView selectView(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuorichengzhuanfaEntity> wrapper);
   	
}

