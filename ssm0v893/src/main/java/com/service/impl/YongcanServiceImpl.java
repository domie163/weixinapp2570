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


import com.dao.YongcanDao;
import com.entity.YongcanEntity;
import com.service.YongcanService;
import com.entity.vo.YongcanVO;
import com.entity.view.YongcanView;

@Service("yongcanService")
public class YongcanServiceImpl extends ServiceImpl<YongcanDao, YongcanEntity> implements YongcanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongcanEntity> page = this.selectPage(
                new Query<YongcanEntity>(params).getPage(),
                new EntityWrapper<YongcanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongcanEntity> wrapper) {
		  Page<YongcanView> page =new Query<YongcanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongcanVO> selectListVO(Wrapper<YongcanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongcanVO selectVO(Wrapper<YongcanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongcanView> selectListView(Wrapper<YongcanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongcanView selectView(Wrapper<YongcanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
