package com.moneypackageoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class moneyPackage {
    Scanner scanner = new Scanner(System.in);
    String key = "";
    //零钱通明细
    String details = "============零钱通明细============";
    //收益入账
    double money = 0;
    double balance = 0;
    Date date = null;//date表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
    //消费
    String place = "";
    //退出
    String flag = "";
    boolean loop = true;
    public void check(){
        System.out.println(details);
        return;
    }
    public void menu(){
        do {
            System.out.println("======oop零钱通账单======");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择(1——4)");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.check();
                    break;
                case "2":
                    this.input();
                    break;
                case "3":
                   this.output();
                   break;
                case "4":
                    this.exit();
                default:
                    System.out.println("您输入的不正确");
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }
    public void input(){
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //要判定收益的范围？
        if (money <= 0) {
            System.out.println("请输入大于0的金额");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date)
                + "\t" + balance;
    }
    public void output(){
        System.out.println("消费出账金额：");
        money = scanner.nextDouble();
        //要判定消费的范围？
        if (money <= 0 || money > balance) {
            System.out.println("出帐金额范围应该在0 —— " +
                    balance + "中");
            return;
        }
        balance -= money;
        System.out.println("输入消费地点：");
        place = scanner.next();
        date = new Date();
        details += "\n" + place + "\t-" + money + "\t" +
                sdf.format(date) + "\t" + balance;
    }
    public void exit(){
        while (true) {
            System.out.println("是否要退出（y/n）：");
            flag = scanner.next();
            if ("y".equals(flag) || "n".equals(flag))
                break;
        }
        if ("y".equals(flag)) {
            loop = false;
        }
    }
}
