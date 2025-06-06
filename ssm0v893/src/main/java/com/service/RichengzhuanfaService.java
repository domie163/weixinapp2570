package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichengzhuanfaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichengzhuanfaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichengzhuanfaView;


/**
 * 日程转发
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface RichengzhuanfaService extends IService<RichengzhuanfaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichengzhuanfaVO> selectListVO(Wrapper<RichengzhuanfaEntity> wrapper);
   	
   	RichengzhuanfaVO selectVO(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
   	
   	List<RichengzhuanfaView> selectListView(Wrapper<RichengzhuanfaEntity> wrapper);
   	
   	RichengzhuanfaView selectView(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichengzhuanfaEntity> wrapper);
   	
}

