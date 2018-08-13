/**  
 * <p>Title: TestController.java</p>  
 * <p>Description: </p>    
 * @author dongbao  
 * @date 2018年8月13日
*/  
package com.demo.test;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

/**  
 * <p>Title: TestController.java</p>  
 * <p>Description: </p>    
 * @author dongbao  
 * @date 2018年8月13日
*/
public class TestController extends Controller{
	/**
	 * 测试
	 */
	public void test() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", "200");
		jsonObject.put("data", "");
		jsonObject.put("msg", "网络联通");
		renderJson(jsonObject);
	}
	
	public void testselect() {
		List<Record> find = Db.find("select * from blog");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", "1");
		jsonObject.put("data", find);
		jsonObject.put("msg", "成功");
		renderJson(jsonObject);
	}
}
