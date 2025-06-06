package com.dao;

import com.entity.HuimianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuimianVO;
import com.entity.view.HuimianView;


/**
 * 会面
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface HuimianDao extends BaseMapper<HuimianEntity> {
	
	List<HuimianVO> selectListVO(@Param("ew") Wrapper<HuimianEntity> wrapper);
	
	HuimianVO selectVO(@Param("ew") Wrapper<HuimianEntity> wrapper);
	
	List<HuimianView> selectListView(@Param("ew") Wrapper<HuimianEntity> wrapper);

	List<HuimianView> selectListView(Pagination page,@Param("ew") Wrapper<HuimianEntity> wrapper);
	
	HuimianView selectView(@Param("ew") Wrapper<HuimianEntity> wrapper);
	
}
