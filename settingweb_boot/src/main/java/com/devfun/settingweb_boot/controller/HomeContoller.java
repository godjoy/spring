package com.devfun.settingweb_boot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfun.settingweb_boot.dao.StatistcDAO;
import com.devfun.settingweb_boot.dao.StatistcLoginDAO;
import com.devfun.settingweb_boot.dao.StatistcOrganDAO;
import com.devfun.settingweb_boot.vo.StatistcLoginVO;
import com.devfun.settingweb_boot.vo.StatistcOrganVO;
import com.devfun.settingweb_boot.vo.StatistcVO;

@RestController
@MapperScan(basePackages="com.devfun.settingweb_boot.dao")
public class HomeContoller {
	@Autowired
	private StatistcDAO statistcDAO;
	@Autowired
	private StatistcLoginDAO statistcLoginDAO;
	@Autowired
	private StatistcOrganDAO statistcOrganDAO;
	
	@RequestMapping("/getStatistc")
	public List<StatistcVO> statistc(@RequestParam(value="yearMonth", defaultValue = "")String yearMonth) throws Exception {
		String param = yearMonth;
		final List<StatistcVO> resultList = statistcDAO.selectStasticByMonth(param);
		resultList.get(0).setTotalCnt(resultList.size());
		return resultList;
	}
	
	@RequestMapping("/getStatistc/login")
	public List<Map<String, StatistcLoginVO>> statistcLogin() throws Exception {
		final List<Map<String, StatistcLoginVO>> resultList = statistcLoginDAO.selectStasticByLogin();
		return resultList;
	}
	
	@RequestMapping("/getStatistc/organ")
	public List<StatistcOrganVO> statistcOrgan(@RequestParam(value="yearMonth", defaultValue = "")String yearMonth) throws Exception {
		String param = yearMonth;
		final List<StatistcOrganVO> resultList = statistcOrganDAO.selectStatistcByOrgan(param);
		return resultList;
	}
	
}
