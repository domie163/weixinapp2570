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


import com.dao.ZhongyaoriDao;
import com.entity.ZhongyaoriEntity;
import com.service.ZhongyaoriService;
import com.entity.vo.ZhongyaoriVO;
import com.entity.view.ZhongyaoriView;

@Service("zhongyaoriService")
public class ZhongyaoriServiceImpl extends ServiceImpl<ZhongyaoriDao, ZhongyaoriEntity> implements ZhongyaoriService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongyaoriEntity> page = this.selectPage(
                new Query<ZhongyaoriEntity>(params).getPage(),
                new EntityWrapper<ZhongyaoriEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongyaoriEntity> wrapper) {
		  Page<ZhongyaoriView> page =new Query<ZhongyaoriView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongyaoriVO> selectListVO(Wrapper<ZhongyaoriEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongyaoriVO selectVO(Wrapper<ZhongyaoriEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongyaoriView> selectListView(Wrapper<ZhongyaoriEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongyaoriView selectView(Wrapper<ZhongyaoriEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
