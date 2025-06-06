package com.dao;

import com.entity.ZhongyaorizhuanfaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongyaorizhuanfaVO;
import com.entity.view.ZhongyaorizhuanfaView;


/**
 * 重要日转发
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface ZhongyaorizhuanfaDao extends BaseMapper<ZhongyaorizhuanfaEntity> {
	
	List<ZhongyaorizhuanfaVO> selectListVO(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
	
	ZhongyaorizhuanfaVO selectVO(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
	
	List<ZhongyaorizhuanfaView> selectListView(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);

	List<ZhongyaorizhuanfaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
	
	ZhongyaorizhuanfaView selectView(@Param("ew") Wrapper<ZhongyaorizhuanfaEntity> wrapper);
	
}
