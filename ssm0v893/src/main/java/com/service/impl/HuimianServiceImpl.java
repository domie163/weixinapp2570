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


import com.dao.HuimianDao;
import com.entity.HuimianEntity;
import com.service.HuimianService;
import com.entity.vo.HuimianVO;
import com.entity.view.HuimianView;

@Service("huimianService")
public class HuimianServiceImpl extends ServiceImpl<HuimianDao, HuimianEntity> implements HuimianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuimianEntity> page = this.selectPage(
                new Query<HuimianEntity>(params).getPage(),
                new EntityWrapper<HuimianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuimianEntity> wrapper) {
		  Page<HuimianView> page =new Query<HuimianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuimianVO> selectListVO(Wrapper<HuimianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuimianVO selectVO(Wrapper<HuimianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuimianView> selectListView(Wrapper<HuimianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuimianView selectView(Wrapper<HuimianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
