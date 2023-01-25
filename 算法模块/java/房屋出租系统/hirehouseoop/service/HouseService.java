package com.test.test05.hirehouseoop.service;

import com.test.test05.hirehouseoop.model.House;
import jdk.jfr.Name;

/**
 * 出租系统的业务层
 */
public class HouseService {
    private House[] houses;
    private int housesNum = 0;//设置houses[]中的下标值
    //等同于houses[]中的房屋个数
    private int id = 1;//设置列表中id值

    //构造器
    public HouseService(int num) {
        houses = new House[num];
    }

    public House[] Check() {
        return houses;
    }

    //判断是否能添加房屋信息
    public boolean Decide() {
        if (id > houses.length)
            return false;
        return true;
    }

    //添加房屋信息
    public void Input(House hou) {
        hou.setNum(id++);//设置id
        houses[housesNum++] = hou;//添加房屋信息
        //这两行代码顺序可以互换
    }

    //删除信息
    public boolean Delete(int deleteId) {
        int index = -1;
        for (int i = 0; i < housesNum; i++) {
            if (houses[i].getNum() == deleteId) {
                index = i;
            }
        }
        if (index == -1) {
            return false;//判断列表中是否存在该信息
        } else {
            for (int i = index; i < housesNum - 1; i++) {
                houses[i] = houses[i + 1];
                houses[i].setNum((houses[i + 1].getNum() - 1));
                //改变id值
            }
            houses[housesNum--] = null;
            id--;
            return true;
        }

    }

    //查询信息
    public boolean Look(int id) {
        for (int i = 0; i < housesNum; i++) {
            if (houses[i].getNum() == id) {
                return true;
            }
        }
        return false;
    }

    //判断是否能改变信息
    public boolean Change(int id) {
        for (int i = 0; i < housesNum; i++) {
            if (houses[i].getNum() == id) {
                return true;
            }
        }
        return false;
    }

    //改变信息
    public void Change(int id, House house) {
        houses[--id] = house;
    }
}
