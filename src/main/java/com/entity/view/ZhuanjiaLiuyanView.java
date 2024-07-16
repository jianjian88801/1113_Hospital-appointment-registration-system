package com.entity.view;

import com.entity.ZhuanjiaLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 专家留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuanjia_liuyan")
public class ZhuanjiaLiuyanView extends ZhuanjiaLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 huiyuan
			/**
			* 会员姓名
			*/
			private String huiyuanName;
			/**
			* 会员手机号
			*/
			private String huiyuanPhone;
			/**
			* 会员身份证号
			*/
			private String huiyuanIdNumber;
			/**
			* 会员头像
			*/
			private String huiyuanPhoto;
			/**
			* 电子邮箱
			*/
			private String huiyuanEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 会员介绍
			*/
			private String huiyuanContent;

		//级联表 zhuanjia
			/**
			* 专家姓名
			*/
			private String zhuanjiaName;
			/**
			* 专家手机号
			*/
			private String zhuanjiaPhone;
			/**
			* 专家身份证号
			*/
			private String zhuanjiaIdNumber;
			/**
			* 专家头像
			*/
			private String zhuanjiaPhoto;
			/**
			* 科室
			*/
			private Integer keshiTypes;
				/**
				* 科室的值
				*/
				private String keshiValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;
			/**
			* 挂号费
			*/
			private Double guahaoMoney;
			/**
			* 电子邮箱
			*/
			private String zhuanjiaEmail;
			/**
			* 专家介绍
			*/
			private String zhuanjiaContent;
			/**
			* 逻辑删除
			*/
			private Integer zhuanjiaDelete;

	public ZhuanjiaLiuyanView() {

	}

	public ZhuanjiaLiuyanView(ZhuanjiaLiuyanEntity zhuanjiaLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhuanjiaLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set huiyuan

					/**
					* 获取： 会员姓名
					*/
					public String getHuiyuanName() {
						return huiyuanName;
					}
					/**
					* 设置： 会员姓名
					*/
					public void setHuiyuanName(String huiyuanName) {
						this.huiyuanName = huiyuanName;
					}

					/**
					* 获取： 会员手机号
					*/
					public String getHuiyuanPhone() {
						return huiyuanPhone;
					}
					/**
					* 设置： 会员手机号
					*/
					public void setHuiyuanPhone(String huiyuanPhone) {
						this.huiyuanPhone = huiyuanPhone;
					}

					/**
					* 获取： 会员身份证号
					*/
					public String getHuiyuanIdNumber() {
						return huiyuanIdNumber;
					}
					/**
					* 设置： 会员身份证号
					*/
					public void setHuiyuanIdNumber(String huiyuanIdNumber) {
						this.huiyuanIdNumber = huiyuanIdNumber;
					}

					/**
					* 获取： 会员头像
					*/
					public String getHuiyuanPhoto() {
						return huiyuanPhoto;
					}
					/**
					* 设置： 会员头像
					*/
					public void setHuiyuanPhoto(String huiyuanPhoto) {
						this.huiyuanPhoto = huiyuanPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getHuiyuanEmail() {
						return huiyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setHuiyuanEmail(String huiyuanEmail) {
						this.huiyuanEmail = huiyuanEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 会员介绍
					*/
					public String getHuiyuanContent() {
						return huiyuanContent;
					}
					/**
					* 设置： 会员介绍
					*/
					public void setHuiyuanContent(String huiyuanContent) {
						this.huiyuanContent = huiyuanContent;
					}





				//级联表的get和set zhuanjia

					/**
					* 获取： 专家姓名
					*/
					public String getZhuanjiaName() {
						return zhuanjiaName;
					}
					/**
					* 设置： 专家姓名
					*/
					public void setZhuanjiaName(String zhuanjiaName) {
						this.zhuanjiaName = zhuanjiaName;
					}

					/**
					* 获取： 专家手机号
					*/
					public String getZhuanjiaPhone() {
						return zhuanjiaPhone;
					}
					/**
					* 设置： 专家手机号
					*/
					public void setZhuanjiaPhone(String zhuanjiaPhone) {
						this.zhuanjiaPhone = zhuanjiaPhone;
					}

					/**
					* 获取： 专家身份证号
					*/
					public String getZhuanjiaIdNumber() {
						return zhuanjiaIdNumber;
					}
					/**
					* 设置： 专家身份证号
					*/
					public void setZhuanjiaIdNumber(String zhuanjiaIdNumber) {
						this.zhuanjiaIdNumber = zhuanjiaIdNumber;
					}

					/**
					* 获取： 专家头像
					*/
					public String getZhuanjiaPhoto() {
						return zhuanjiaPhoto;
					}
					/**
					* 设置： 专家头像
					*/
					public void setZhuanjiaPhoto(String zhuanjiaPhoto) {
						this.zhuanjiaPhoto = zhuanjiaPhoto;
					}

					/**
					* 获取： 科室
					*/
					public Integer getKeshiTypes() {
						return keshiTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setKeshiTypes(Integer keshiTypes) {
						this.keshiTypes = keshiTypes;
					}


						/**
						* 获取： 科室的值
						*/
						public String getKeshiValue() {
							return keshiValue;
						}
						/**
						* 设置： 科室的值
						*/
						public void setKeshiValue(String keshiValue) {
							this.keshiValue = keshiValue;
						}

					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}

					/**
					* 获取： 挂号费
					*/
					public Double getGuahaoMoney() {
						return guahaoMoney;
					}
					/**
					* 设置： 挂号费
					*/
					public void setGuahaoMoney(Double guahaoMoney) {
						this.guahaoMoney = guahaoMoney;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getZhuanjiaEmail() {
						return zhuanjiaEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setZhuanjiaEmail(String zhuanjiaEmail) {
						this.zhuanjiaEmail = zhuanjiaEmail;
					}

					/**
					* 获取： 专家介绍
					*/
					public String getZhuanjiaContent() {
						return zhuanjiaContent;
					}
					/**
					* 设置： 专家介绍
					*/
					public void setZhuanjiaContent(String zhuanjiaContent) {
						this.zhuanjiaContent = zhuanjiaContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getZhuanjiaDelete() {
						return zhuanjiaDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setZhuanjiaDelete(Integer zhuanjiaDelete) {
						this.zhuanjiaDelete = zhuanjiaDelete;
					}










}
