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


import com.dao.GongzuorichengDao;
import com.entity.GongzuorichengEntity;
import com.service.GongzuorichengService;
import com.entity.vo.GongzuorichengVO;
import com.entity.view.GongzuorichengView;

@Service("gongzuorichengService")
public class GongzuorichengServiceImpl extends ServiceImpl<GongzuorichengDao, GongzuorichengEntity> implements GongzuorichengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuorichengEntity> page = this.selectPage(
                new Query<GongzuorichengEntity>(params).getPage(),
                new EntityWrapper<GongzuorichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuorichengEntity> wrapper) {
		  Page<GongzuorichengView> page =new Query<GongzuorichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuorichengVO> selectListVO(Wrapper<GongzuorichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuorichengVO selectVO(Wrapper<GongzuorichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuorichengView> selectListView(Wrapper<GongzuorichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuorichengView selectView(Wrapper<GongzuorichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
