package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongzuorichengzhuanfaDao;
import com.entity.GongzuorichengzhuanfaEntity;
import com.service.GongzuorichengzhuanfaService;
import com.entity.vo.GongzuorichengzhuanfaVO;
import com.entity.view.GongzuorichengzhuanfaView;

@Service("gongzuorichengzhuanfaService")
public class GongzuorichengzhuanfaServiceImpl extends ServiceImpl<GongzuorichengzhuanfaDao, GongzuorichengzhuanfaEntity> implements GongzuorichengzhuanfaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuorichengzhuanfaEntity> page = this.selectPage(
                new Query<GongzuorichengzhuanfaEntity>(params).getPage(),
                new EntityWrapper<GongzuorichengzhuanfaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuorichengzhuanfaEntity> wrapper) {
		  Page<GongzuorichengzhuanfaView> page =new Query<GongzuorichengzhuanfaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuorichengzhuanfaVO> selectListVO(Wrapper<GongzuorichengzhuanfaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuorichengzhuanfaVO selectVO(Wrapper<GongzuorichengzhuanfaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuorichengzhuanfaView> selectListView(Wrapper<GongzuorichengzhuanfaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuorichengzhuanfaView selectView(Wrapper<GongzuorichengzhuanfaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
