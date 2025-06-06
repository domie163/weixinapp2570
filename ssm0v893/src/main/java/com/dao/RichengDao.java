package com.dao;

import com.entity.RichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichengVO;
import com.entity.view.RichengView;


/**
 * 日程
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface RichengDao extends BaseMapper<RichengEntity> {
	
	List<RichengVO> selectListVO(@Param("ew") Wrapper<RichengEntity> wrapper);
	
	RichengVO selectVO(@Param("ew") Wrapper<RichengEntity> wrapper);
	
	List<RichengView> selectListView(@Param("ew") Wrapper<RichengEntity> wrapper);

	List<RichengView> selectListView(Pagination page,@Param("ew") Wrapper<RichengEntity> wrapper);
	
	RichengView selectView(@Param("ew") Wrapper<RichengEntity> wrapper);
	
}
