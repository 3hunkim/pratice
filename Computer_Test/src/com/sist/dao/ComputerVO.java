package com.sist.dao;

public class ComputerVO {
	private int com_no; // ����
	private int cate_no; // ī�װ�
	private String com_title; // ��ǰ��
	private String com_spec; // ����
	private String image; // �̹���
	private String delivery; // ��� ���
	private int quantity; // ����
	private String cost; // ����
	private int changespec_cost; // �߰� ���
	private int total_cost; 
	private String gift; // ����ǰ
	private int sell_cnt;
	private int stock_cnt;
	public int getCom_no() {
		return com_no;
	}
	public void setCom_no(int com_no) {
		this.com_no = com_no;
	}
	public int getCate_no() {
		return cate_no;
	}
	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}
	public String getCom_title() {
		return com_title;
	}
	public void setCom_title(String com_title) {
		this.com_title = com_title;
	}
	public String getCom_spec() {
		return com_spec;
	}
	public void setCom_spec(String com_spec) {
		this.com_spec = com_spec;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public int getChangespec_cost() {
		return changespec_cost;
	}
	public void setChangespec_cost(int changespec_cost) {
		this.changespec_cost = changespec_cost;
	}
	public int getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public int getSell_cnt() {
		return sell_cnt;
	}
	public void setSell_cnt(int sell_cnt) {
		this.sell_cnt = sell_cnt;
	}
	public int getStock_cnt() {
		return stock_cnt;
	}
	public void setStock_cnt(int stock_cnt) {
		this.stock_cnt = stock_cnt;
	}
	
}
