package com.test.test05.hirehouseoop.view;

import com.test.test05.hirehouseoop.model.House;
import com.test.test05.hirehouseoop.service.HouseService;
import com.test.test05.hirehouseoop.untility.Utility;

import javax.sound.midi.Soundbank;

/**
 * 出租系统界面
 */
public class HouseUI {
    private boolean loop = true;
    private String key;
    private String flag;
    private HouseService service = new HouseService(10);


    public void menu() {
        do {
            System.out.println("======房屋出租系统======");
            System.out.println("\t\t\t1 增添房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请选择(1——6)");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    inputHouse();//增
                    break;
                case "2":
                    lookHouse();//查
                    break;
                case "3":
                    deleteHouse();//删
                    break;
                case "4":
                    changeHouse();//改
                    break;
                case "5":
                    checkHouse();
                    break;
                case "6":
                    exit();
                    break;
                default:
                    System.out.println("您输入的不正确");
            }
        } while (loop);
    }

    //增加
    public void inputHouse() {
        if (!service.Decide()) {
            System.out.println("系统已满，信息添加失败");
            return;
        }
        System.out.println("输入房主：");
        String owner = Utility.readString(4);
        System.out.println("输入电话：");
        int tele = Utility.readInt(11);
        System.out.println("输入地址：");
        String address = Utility.readString(20);
        System.out.println("输入月租：");
        int salary = Utility.readInt(6);
        System.out.println("输入状态：");
        String state = Utility.readString(3);
        House house = new House(0, owner, tele, address, salary, state);
        service.Input(house);
        System.out.println("信息添加成功！");
    }

    //查询
    public void lookHouse() {
        House[] houses = service.Check();
        System.out.println("请输入要查找的id值");
        int id = Utility.readInt(1);
        if (service.Look(id)) {
            System.out.println(houses[--id]);
        } else {
            System.out.println("id值不存在");
        }
    }

    //删除
    public void deleteHouse() {
        System.out.println("请输入要删除的id号(输入-1取消):");
        int deleteId = Utility.readInt(1);
        if (deleteId == -1) {
            return;
        }
        char confirm = Utility.readConfirmSelection();
        if (confirm == 'Y') {
            if (service.Delete(deleteId)) {
                System.out.println("数据删除成功");
            } else {
                System.out.println("你输入的id号不存在，数据删除错误");
            }
            return;
        } else {
            return;
        }
    }

    //改变信息
    public void changeHouse() {
        House[] houses = service.Check();
        System.out.println("请输入需要修改房屋的id值(-1退出):");
        int idChange = Utility.readInt(1);
        if (idChange == -1) {
            return;
        }

        if (service.Change(idChange)) {
            System.out.println("输入房主(" + houses[idChange - 1].getOwner() + "):");
            String owner = Utility.readString(4);
            System.out.println("输入电话(" + houses[idChange - 1].getTele() + "):");
            int tele = Utility.readInt(11);
            System.out.println("输入地址(" + houses[idChange - 1].getAddress() + "):");
            String address = Utility.readString(20);
            System.out.println("输入月租(" + houses[idChange - 1].getSalary() + "):");
            int salary = Utility.readInt(6);
            System.out.println("输入状态(" + houses[idChange - 1].getState() + "):");
            String state = Utility.readString(3);
            House house = new House(idChange, owner, tele, address, salary, state);
            service.Change(idChange, house);
            System.out.println("信息已成功修改");
        } else {
            System.out.println("你输入的id值有错误");
            return;
        }
    }

    //检查列表
    public void checkHouse() {
        House[] houses = service.Check();
        System.out.println("-------房屋列表-------");
        for (int i = 0; i < houses.length && houses[i] != null; i++) {
            System.out.println(houses[i]);
        }
        System.out.println("------房屋列表完成------");
    }

    //退出
    public void exit() {
        while (true) {
            System.out.println("您是否要退出(y/n):");
            flag = Utility.readString(1);
            if (flag.equals("y") || flag.equals("n"))
                break;
        }
        if (flag.equals("y")) {
            loop = false;
        }
    }
}
