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


import com.dao.ZhongyaorizhuanfaDao;
import com.entity.ZhongyaorizhuanfaEntity;
import com.service.ZhongyaorizhuanfaService;
import com.entity.vo.ZhongyaorizhuanfaVO;
import com.entity.view.ZhongyaorizhuanfaView;

@Service("zhongyaorizhuanfaService")
public class ZhongyaorizhuanfaServiceImpl extends ServiceImpl<ZhongyaorizhuanfaDao, ZhongyaorizhuanfaEntity> implements ZhongyaorizhuanfaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongyaorizhuanfaEntity> page = this.selectPage(
                new Query<ZhongyaorizhuanfaEntity>(params).getPage(),
                new EntityWrapper<ZhongyaorizhuanfaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongyaorizhuanfaEntity> wrapper) {
		  Page<ZhongyaorizhuanfaView> page =new Query<ZhongyaorizhuanfaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongyaorizhuanfaVO> selectListVO(Wrapper<ZhongyaorizhuanfaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongyaorizhuanfaVO selectVO(Wrapper<ZhongyaorizhuanfaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongyaorizhuanfaView> selectListView(Wrapper<ZhongyaorizhuanfaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongyaorizhuanfaView selectView(Wrapper<ZhongyaorizhuanfaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
