package com.devfun.settingweb_boot.dao;

import java.util.List;

import com.devfun.settingweb_boot.vo.StatistcVO;

public interface StatistcDAO {
	List<StatistcVO> selectStasticByMonth(String param) throws Exception;
}