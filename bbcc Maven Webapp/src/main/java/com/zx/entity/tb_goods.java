package com.zx.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class tb_goods {
   private int goodsId;
   private String goodsName;
   private int typeId;
   private String goodsDesc;
   private int goodsUnitPrice;
   private String goodsImageName;
   private int sellCount;
   private String goodsDate;
   /*@DateTimeFormat(pattern="yyyy-MM-dd")*/
   
   private tb_goods_type tb_goods_type;
   

public String getGoodsDate() {
	return goodsDate;
}
public void setGoodsDate(String goodsDate) {
	this.goodsDate = goodsDate;
}
public tb_goods_type getTb_goods_type() {
	return tb_goods_type;
}
public void setTb_goods_type(tb_goods_type tb_goods_type) {
	this.tb_goods_type = tb_goods_type;
}
public int getGoodsId() {
	return goodsId;
}
public void setGoodsId(int goodsId) {
	this.goodsId = goodsId;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
}
public String getGoodsDesc() {
	return goodsDesc;
}
public void setGoodsDesc(String goodsDesc) {
	this.goodsDesc = goodsDesc;
}
public int getGoodsUnitPrice() {
	return goodsUnitPrice;
}
public void setGoodsUnitPrice(int goodsUnitPrice) {
	this.goodsUnitPrice = goodsUnitPrice;
}
public String getGoodsImageName() {
	return goodsImageName;
}
public void setGoodsImageName(String goodsImageName) {
	this.goodsImageName = goodsImageName;
}
public int getSellCount() {
	return sellCount;
}
public void setSellCount(int sellCount) {
	this.sellCount = sellCount;
}

@Override
public String toString() {
	return "tb_goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", typeId=" + typeId + ", goodsDesc="
			+ goodsDesc + ", goodsUnitPrice=" + goodsUnitPrice + ", goodsImageName=" + goodsImageName + ", sellCount="
			+ sellCount + ", goodsDate=" + goodsDate + ", tb_goods_type=" + tb_goods_type + "]";
}
public tb_goods(int goodsId, String goodsName, int typeId, String goodsDesc, int goodsUnitPrice, String goodsImageName,
		int sellCount, String goodsDate, com.zx.entity.tb_goods_type tb_goods_type) {
	super();
	this.goodsId = goodsId;
	this.goodsName = goodsName;
	this.typeId = typeId;
	this.goodsDesc = goodsDesc;
	this.goodsUnitPrice = goodsUnitPrice;
	this.goodsImageName = goodsImageName;
	this.sellCount = sellCount;
	this.goodsDate = goodsDate;
	this.tb_goods_type = tb_goods_type;
}
public tb_goods() {
	super();
	// TODO Auto-generated constructor stub
}

   
}
