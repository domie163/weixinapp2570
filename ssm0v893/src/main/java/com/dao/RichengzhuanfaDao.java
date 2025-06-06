package com.dao;

import com.entity.RichengzhuanfaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichengzhuanfaVO;
import com.entity.view.RichengzhuanfaView;


/**
 * 日程转发
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
public interface RichengzhuanfaDao extends BaseMapper<RichengzhuanfaEntity> {
	
	List<RichengzhuanfaVO> selectListVO(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
	
	RichengzhuanfaVO selectVO(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
	
	List<RichengzhuanfaView> selectListView(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);

	List<RichengzhuanfaView> selectListView(Pagination page,@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
	
	RichengzhuanfaView selectView(@Param("ew") Wrapper<RichengzhuanfaEntity> wrapper);
	
}
