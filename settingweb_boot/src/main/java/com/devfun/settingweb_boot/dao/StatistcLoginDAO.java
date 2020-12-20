package com.devfun.settingweb_boot.dao;

import java.util.List;
import java.util.Map;

import com.devfun.settingweb_boot.vo.StatistcLoginVO;

public interface StatistcLoginDAO {
	List<Map<String, StatistcLoginVO>> selectStasticByLogin() throws Exception;
	
}