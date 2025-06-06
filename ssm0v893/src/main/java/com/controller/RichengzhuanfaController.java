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

import com.entity.RichengzhuanfaEntity;
import com.entity.view.RichengzhuanfaView;

import com.service.RichengzhuanfaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 日程转发
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 10:34:43
 */
@RestController
@RequestMapping("/richengzhuanfa")
public class RichengzhuanfaController {
    @Autowired
    private RichengzhuanfaService richengzhuanfaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RichengzhuanfaEntity richengzhuanfa, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			richengzhuanfa.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RichengzhuanfaEntity> ew = new EntityWrapper<RichengzhuanfaEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);
		PageUtils page = richengzhuanfaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, richengzhuanfa), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RichengzhuanfaEntity richengzhuanfa, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shijianend,
		HttpServletRequest request){
        EntityWrapper<RichengzhuanfaEntity> ew = new EntityWrapper<RichengzhuanfaEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);
		PageUtils page = richengzhuanfaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, richengzhuanfa), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RichengzhuanfaEntity richengzhuanfa){
       	EntityWrapper<RichengzhuanfaEntity> ew = new EntityWrapper<RichengzhuanfaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( richengzhuanfa, "richengzhuanfa")); 
        return R.ok().put("data", richengzhuanfaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RichengzhuanfaEntity richengzhuanfa){
        EntityWrapper< RichengzhuanfaEntity> ew = new EntityWrapper< RichengzhuanfaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( richengzhuanfa, "richengzhuanfa")); 
		RichengzhuanfaView richengzhuanfaView =  richengzhuanfaService.selectView(ew);
		return R.ok("查询日程转发成功").put("data", richengzhuanfaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RichengzhuanfaEntity richengzhuanfa = richengzhuanfaService.selectById(id);
        return R.ok().put("data", richengzhuanfa);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RichengzhuanfaEntity richengzhuanfa = richengzhuanfaService.selectById(id);
        return R.ok().put("data", richengzhuanfa);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RichengzhuanfaEntity richengzhuanfa, HttpServletRequest request){
    	richengzhuanfa.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(richengzhuanfa);

        richengzhuanfaService.insert(richengzhuanfa);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RichengzhuanfaEntity richengzhuanfa, HttpServletRequest request){
    	richengzhuanfa.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(richengzhuanfa);

        richengzhuanfaService.insert(richengzhuanfa);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RichengzhuanfaEntity richengzhuanfa, HttpServletRequest request){
        //ValidatorUtils.validateEntity(richengzhuanfa);
        richengzhuanfaService.updateById(richengzhuanfa);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        richengzhuanfaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RichengzhuanfaEntity> wrapper = new EntityWrapper<RichengzhuanfaEntity>();
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

		int count = richengzhuanfaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
