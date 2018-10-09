package com.zx.entity;

public class tb_goods_type {
   private int typeId;
   private String typeName;
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
}
public String getTypeName() {
	return typeName;
}
public void setTypeName(String typeName) {
	this.typeName = typeName;
}
public tb_goods_type(int typeId, String typeName) {
	super();
	this.typeId = typeId;
	this.typeName = typeName;
}
public tb_goods_type() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "tb_goods_type [typeId=" + typeId + ", typeName=" + typeName + "]";
}
   
}
