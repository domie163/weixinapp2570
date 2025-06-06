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


import com.dao.RichengzhuanfaDao;
import com.entity.RichengzhuanfaEntity;
import com.service.RichengzhuanfaService;
import com.entity.vo.RichengzhuanfaVO;
import com.entity.view.RichengzhuanfaView;

@Service("richengzhuanfaService")
public class RichengzhuanfaServiceImpl extends ServiceImpl<RichengzhuanfaDao, RichengzhuanfaEntity> implements RichengzhuanfaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichengzhuanfaEntity> page = this.selectPage(
                new Query<RichengzhuanfaEntity>(params).getPage(),
                new EntityWrapper<RichengzhuanfaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichengzhuanfaEntity> wrapper) {
		  Page<RichengzhuanfaView> page =new Query<RichengzhuanfaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichengzhuanfaVO> selectListVO(Wrapper<RichengzhuanfaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichengzhuanfaVO selectVO(Wrapper<RichengzhuanfaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichengzhuanfaView> selectListView(Wrapper<RichengzhuanfaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichengzhuanfaView selectView(Wrapper<RichengzhuanfaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
