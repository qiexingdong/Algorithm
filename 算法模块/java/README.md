# 目录
- [重写equals方法](#重写equals方法)
- [冒泡排序](#冒泡排序)
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


### 
``` java

```
