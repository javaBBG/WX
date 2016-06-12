/*
 *Project: wechat-robot
 *File: me.biezhi.weixin.Jiang.java <2016年6月6日>
 ****************************************************************
 * 版权所有@2016 国裕网络科技  保留所有权利.
 ***************************************************************/
package me.biezhi.weixin;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author liujie 
 * @Date 2016年6月6日 下午8:24:01
 * @version 1.0
 */
public class Jiang {
	
	/*Da("1","大"),
	Xiao("2","小"),
	Dan("3","单"),
	XiaoDan("4","小单"),
	DaDan("5","大单"),
	SHUANG("6","双"),
	XiaoShuang("7","小双"),
	DaShuang("8","大双"),
	DianShu("9","点数"),
	ShunZi("10","顺子"),
	BaoZi("11","豹子"),
	G_Da("01","改大"),
	G_XiaO("02","改小"),
	G_Dan("03","改单"),
	G_XiaoDan("04","改小单"),
	G_DaDan("05","改大单"),
	G_SHUANG("06","改双"),
	G_XiaoShuang("07","改小双"),
	G_DaShuang("08","改大双"),
	G_DianShu("09","改点数"),
	G_ShunZi("010","改顺子"),
	G_BaoZi("011","改豹子"),
	QuXiao("-1","取"),
	Cha("0","查")
	;*/
	private String index;
	private String name;
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Jiang(String index, String name) {
		this.index = index;
		this.name = name;
	}
	
	public static Map<String, String> map = new HashMap<String, String>();
	static{
		map.put("大", null);
		map.put("小", null);
		map.put("单", null);
		map.put("小单", null);
		map.put("大单", null);
		map.put("双", null);
		map.put("小双", null);
		map.put("大双", null);
		map.put("点数", null);
		map.put("顺", null);
		map.put("豹", null);
		map.put("改大", null);
		map.put("改小", null);
		map.put("改单", null);
		map.put("改小单", null);
		map.put("改大单", null);
		map.put("改双", null);
		map.put("改小双", null);
		map.put("改大双", null);
		map.put("改点数", null);
		map.put("改顺", null);
		map.put("改豹", null);
		map.put("取", null);
		map.put("查", null);
		map.put("回", null);
		
		map.put("4特", null);//点数4的倍数
		map.put("5特", null);
		map.put("6特", null);
		map.put("7特", null);
		map.put("8特", null);
		map.put("9特", null);
		map.put("10特", null);
		map.put("11特", null);
		map.put("12特", null);
		map.put("13特", null);
		map.put("14特", null);
		map.put("15特", null);
		map.put("16特", null);
		map.put("17特", null);
		
		//哈大，哈小，哈大单，哈小单，哈单，哈双，哈豹
		map.put("哈大", null);
		map.put("哈小", null);
		map.put("哈单", null);
		map.put("哈大单", null);
		map.put("哈小单", null);
		map.put("哈双", null);
		map.put("哈大双", null);
		map.put("哈小双", null);
		map.put("哈豹", null);
	}
}
