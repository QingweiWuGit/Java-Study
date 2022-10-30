* 基本数据类型不具备类的特征，比如拥有属性和方法
* 包装类的存在是为了解决这一问题
![](./images/map.png) 

# 包装类常用方法

* 数值型的包装类继承Number父类，字符型和布尔型的包装类继承Object父类
* 静态方法即可以通过类名调用，也可以通过对象名调用
* 官方文档地址：https://docs.oracle.com/javase/8/docs/api/


# 基本数据类型和包装类之间的转换

* 装箱：基本数据类型 -> 包装类
* 拆箱：包装类 -> 基本数据类型

```java
// 1. 自动装箱
int i1 = 1; 
Integer i2 = i1;
// 2. 手动装箱
Integer i3 = new Integer(i1);

// 1. 自动拆箱
int i4 = i2;
// 2. 手动拆箱
int i5 = i2.intValue();

// 转换成其它的基本数据类型
double d1 = i2.doubleValue();
```

# 基本数据类型和字符串之间的转换
```java
// 基本数据类型 -> 字符串
int i1 = 2;
String s1 = Integer.toString(i1);

// 字符串 -> 基本数据类型
// 1. 包装类的parse方法
int i2 = Integer.parseInt(s1);
// 2. 使用valueOf()方法：先转换成包装类，再自动拆箱转换成基本数据类型
int i3 = Integer.valueOf(s1);
```

## 其它

1. 包装类对象的初始值都是null。

2. 思考一下下面代码的输出结果
```java
// TODO Auto-generated method stub
Integer one=new Integer(100);
Integer two=new Integer(100);
System.out.println("one==two的结果："+(one==two));//1. 因为两个对象之间的引用地址不一样，所以返回为false。

Integer three=100;//自动装箱
//Integer three=Integer.valueOf(100);
System.out.println("three==100的结果："+(three==100));//2 自动拆箱，比较的是拆箱之后的数值。返回为true。

//Integer four=100;
Integer four=Integer.valueOf(100);
System.out.println("three==four的结果："+(three==four));//3 返回为true。传入的参数小于127，大于-128，则会调用对象池的缓存区保存变量three，而不是再去new一个对象。所以它们指向的空间是一样的。

Integer five=200;
System.out.println("five==200的结果："+(five==200));//4 true

Integer six=200;
System.out.println("five==six的结果："+(five==six));//5 false，因为不在缓存区

Double d1=Double.valueOf(100);
System.out.println("d1==100的结果："+(d1==100)); // 返回为true

Double d2=Double.valueOf(100);
System.out.println("d1==d2的结果："+(d1==d2)); // 返回为false
```