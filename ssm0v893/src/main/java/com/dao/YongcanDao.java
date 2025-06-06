package com.dao;

import com.entity.YongcanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongcanVO;
import com.entity.view.YongcanView;


/**
 * 用餐
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface YongcanDao extends BaseMapper<YongcanEntity> {
	
	List<YongcanVO> selectListVO(@Param("ew") Wrapper<YongcanEntity> wrapper);
	
	YongcanVO selectVO(@Param("ew") Wrapper<YongcanEntity> wrapper);
	
	List<YongcanView> selectListView(@Param("ew") Wrapper<YongcanEntity> wrapper);

	List<YongcanView> selectListView(Pagination page,@Param("ew") Wrapper<YongcanEntity> wrapper);
	
	YongcanView selectView(@Param("ew") Wrapper<YongcanEntity> wrapper);
	
}
