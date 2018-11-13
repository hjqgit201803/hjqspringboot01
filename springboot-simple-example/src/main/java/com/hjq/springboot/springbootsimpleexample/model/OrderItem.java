package com.hjq.springboot.springbootsimpleexample.model;

public class OrderItem {

    private long id;

    private long orderId;

    private long goodsId;

    private long crateTime;

    private float orderGoodsNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public long getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(long crateTime) {
        this.crateTime = crateTime;
    }

    public float getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(float orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }
}
