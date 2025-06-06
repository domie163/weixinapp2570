package com.dao;

import com.entity.ZhongyaoriEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongyaoriVO;
import com.entity.view.ZhongyaoriView;


/**
 * 重要日
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface ZhongyaoriDao extends BaseMapper<ZhongyaoriEntity> {
	
	List<ZhongyaoriVO> selectListVO(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
	
	ZhongyaoriVO selectVO(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
	
	List<ZhongyaoriView> selectListView(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);

	List<ZhongyaoriView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
	
	ZhongyaoriView selectView(@Param("ew") Wrapper<ZhongyaoriEntity> wrapper);
	
}
