# 目录
- [重写equals方法](#重写equals方法)
- [冒泡排序](#冒泡排序)
- [空心菱形](#空心菱形)
- [数组扩容](#数组扩容)
- [java输入](#java输入)
- [](#)
***
### 重写equals方法
``` java
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Doctor))
            return false;//判断obj是不是Doctor的子类
        Doctor doctor = (Doctor) obj;
        return age == doctor.age && gender == doctor.gender && sal == doctor.sal && name.equals(doctor.name) && job.equals(doctor.job);
    }
```
### 冒泡排序
``` java
public class hello{
 public static void main(String args[]){
    int arr[] = {50,68,12,3,87,95,3,6};
    int temp = 0;
    for(int i = 0;i<arr.length-1;i++){
      for(int j = 0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int i = 0;i<arr.length;i++)
      System.out.print(arr[i]+"\t");
 }
}
```
### 空心菱形
``` java
public class switch01{ 	
public static void main(String[] args){
                                int num = 10;
		for(int i = 1;i<=num;i++){
			for(int k = 1;k<=num-i;k++){
         	   System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(j==1||j==2*i-1){
               System.out.print("*");
           		}else{
           			System.out.print(" ");
           		}
			}
			 System.out.print("\n");
		}
       	for(int i=num-1;i>=1;i--){
			for(int k = 1;k<=num-i;k++){
         	   System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
          		if(j==1||j==2*i-1){
               System.out.print("*");
           		}
           		else{
           		System.out.print(" ");
           		}
			}
			 System.out.print("\n");
		}
	}
}
```

### 数组扩容
``` java
Scanner myscanner = new Scanner(System.in);
        int arr[]= {1,2,3};
        do{
        int arrnew[]= new int[arr.length+1];
        for(int i = 0 ; i < arr.length ; i++)
        	arrnew[i]=arr[i];
        System.out.println("请输入新添加的数");
        int num = myscanner.nextInt();
        arrnew[arrnew.length-1]=num;
        arr = arrnew;
        for(int i = 0 ; i < arr.length; i++)
        	System.out.print(arr[i]+"\t");
        System.out.println("是否还要再添加？ y/n");
        char key = myscanner.next().charAt(0);
        if(key=='n')	
        break;	
    	}while(true);
		System.out.println("你退出了循环");
```
### java输入
``` java
import java.util.Scanner;
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        String b = scanner1.next();
        char c = scanner1.next().charAt(0);
```
### 
``` java

```
