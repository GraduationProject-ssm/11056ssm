package com.entity.view;

import com.entity.XiaoshuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小说信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
@TableName("xiaoshuoxinxi")
public class XiaoshuoxinxiView  extends XiaoshuoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshuoxinxiView(){
	}
 
 	public XiaoshuoxinxiView(XiaoshuoxinxiEntity xiaoshuoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshuoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
