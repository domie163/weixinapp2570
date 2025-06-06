package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongyaorizhuanfaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongyaorizhuanfaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongyaorizhuanfaView;


/**
 * 重要日转发
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface ZhongyaorizhuanfaService extends IService<ZhongyaorizhuanfaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongyaorizhuanfaVO> selectListVO(Wrapper<ZhongyaorizhuanfaEntity> wrapper);
   	
   	ZhongyaorizhuanfaVO selectVO(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
   	
   	List<ZhongyaorizhuanfaView> selectListView(Wrapper<ZhongyaorizhuanfaEntity> wrapper);
   	
   	ZhongyaorizhuanfaView selectView(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongyaorizhuanfaEntity> wrapper);
   	
}

