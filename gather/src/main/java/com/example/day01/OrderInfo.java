package com.example.day01;

public class OrderInfo {
    String orderInfo;
    String user_id;

    public String getOrderInfo() {
        return orderInfo;
    }

    public OrderInfo(String orderInfo, String user_id) {
        this.orderInfo = orderInfo;
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderInfo='" + orderInfo + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("比较方法");

        //确保对象的类型是一致的
        if((obj!=null)&&(getClass()== obj.getClass())){


            OrderInfo orderInfo1= (OrderInfo) obj;
            if((orderInfo1.getOrderInfo()==this.orderInfo)&&(orderInfo1.getUser_id()==this.user_id)){
                System.out.println("检验为true");
                return true;
            }else{
                return false;
            }

        }else{
            return  super.equals(obj);
        }


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
