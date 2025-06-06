package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhongyaorizhuanfaEntity;
import com.entity.view.ZhongyaorizhuanfaView;

import com.service.ZhongyaorizhuanfaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 重要日转发
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@RestController
@RequestMapping("/zhongyaorizhuanfa")
public class ZhongyaorizhuanfaController {
    @Autowired
    private ZhongyaorizhuanfaService zhongyaorizhuanfaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongyaorizhuanfaEntity zhongyaorizhuanfa, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhongyaorizhuanfa.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongyaorizhuanfaEntity> ew = new EntityWrapper<ZhongyaorizhuanfaEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = zhongyaorizhuanfaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongyaorizhuanfa), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongyaorizhuanfaEntity zhongyaorizhuanfa, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhongyaorizhuanfa.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongyaorizhuanfaEntity> ew = new EntityWrapper<ZhongyaorizhuanfaEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = zhongyaorizhuanfaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongyaorizhuanfa), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongyaorizhuanfaEntity zhongyaorizhuanfa){
       	EntityWrapper<ZhongyaorizhuanfaEntity> ew = new EntityWrapper<ZhongyaorizhuanfaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongyaorizhuanfa, "zhongyaorizhuanfa")); 
        return R.ok().put("data", zhongyaorizhuanfaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongyaorizhuanfaEntity zhongyaorizhuanfa){
        EntityWrapper< ZhongyaorizhuanfaEntity> ew = new EntityWrapper< ZhongyaorizhuanfaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongyaorizhuanfa, "zhongyaorizhuanfa")); 
		ZhongyaorizhuanfaView zhongyaorizhuanfaView =  zhongyaorizhuanfaService.selectView(ew);
		return R.ok("查询重要日转发成功").put("data", zhongyaorizhuanfaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongyaorizhuanfaEntity zhongyaorizhuanfa = zhongyaorizhuanfaService.selectById(id);
        return R.ok().put("data", zhongyaorizhuanfa);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongyaorizhuanfaEntity zhongyaorizhuanfa = zhongyaorizhuanfaService.selectById(id);
        return R.ok().put("data", zhongyaorizhuanfa);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongyaorizhuanfaEntity zhongyaorizhuanfa, HttpServletRequest request){
    	zhongyaorizhuanfa.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongyaorizhuanfa);

        zhongyaorizhuanfaService.insert(zhongyaorizhuanfa);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongyaorizhuanfaEntity zhongyaorizhuanfa, HttpServletRequest request){
    	zhongyaorizhuanfa.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongyaorizhuanfa);
    	zhongyaorizhuanfa.setUserid((Long)request.getSession().getAttribute("userId"));

        zhongyaorizhuanfaService.insert(zhongyaorizhuanfa);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhongyaorizhuanfaEntity zhongyaorizhuanfa, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongyaorizhuanfa);
        zhongyaorizhuanfaService.updateById(zhongyaorizhuanfa);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongyaorizhuanfaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhongyaorizhuanfaEntity> wrapper = new EntityWrapper<ZhongyaorizhuanfaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhongyaorizhuanfaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
