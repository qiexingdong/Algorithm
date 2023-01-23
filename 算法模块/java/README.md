# 目录
- [重写equals方法](#重写equals方法)
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
