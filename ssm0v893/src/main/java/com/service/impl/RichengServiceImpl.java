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


import com.dao.RichengDao;
import com.entity.RichengEntity;
import com.service.RichengService;
import com.entity.vo.RichengVO;
import com.entity.view.RichengView;

@Service("richengService")
public class RichengServiceImpl extends ServiceImpl<RichengDao, RichengEntity> implements RichengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichengEntity> page = this.selectPage(
                new Query<RichengEntity>(params).getPage(),
                new EntityWrapper<RichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichengEntity> wrapper) {
		  Page<RichengView> page =new Query<RichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichengVO> selectListVO(Wrapper<RichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichengVO selectVO(Wrapper<RichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichengView> selectListView(Wrapper<RichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichengView selectView(Wrapper<RichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
