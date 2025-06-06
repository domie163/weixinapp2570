package com.dao;

import com.entity.GongzuorichengzhuanfaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuorichengzhuanfaVO;
import com.entity.view.GongzuorichengzhuanfaView;


/**
 * 工作日程转发
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface GongzuorichengzhuanfaDao extends BaseMapper<GongzuorichengzhuanfaEntity> {
	
	List<GongzuorichengzhuanfaVO> selectListVO(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
	
	GongzuorichengzhuanfaVO selectVO(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
	
	List<GongzuorichengzhuanfaView> selectListView(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);

	List<GongzuorichengzhuanfaView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
	
	GongzuorichengzhuanfaView selectView(@Param("ew") Wrapper<GongzuorichengzhuanfaEntity> wrapper);
	
}
