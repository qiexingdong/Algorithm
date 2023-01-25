package com.test.test05.hirehouseoop.model;

/**
 * 每个房屋的信息
 */
public class House {
    private int num;
    private String owner;
    private int tele;
    private String address;
    private int salary;
    private String state;


    public House(int num, String owner, int tele, String address, int salary, String state) {
        this.num = num;
        this.owner = owner;
        this.tele = tele;
        this.address = address;
        this.salary = salary;
        this.state = state;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return num + "\t\t" +
                owner + "\t\t" +
                tele + "\t\t" +
                address + "\t\t" +
                salary + "\t\t" +
                state;
    }
}
