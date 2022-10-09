# 数组

* 数组是相同类型的数据按顺序组成的一种引用数据类型。
* Java中的数据类型包括基本数据类型和引用数据类型。其中，引用数据类型包括类、接口和数组。
* 官网地址：https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

## 一维数组

1. 数组声明
* 语法格式：数据类型[] 数组名； 数据类型 数组名[]；
```java
int[] myIntArray; 
int myIntArray[];
char[] ch; 
String[] strArray;
```

2. 数组创建
* 语法格式一：先声明后创建
    数据类型[] 数组名； int[] arr;
    数组名 = new 数据类型[数组长度]； arr = new int[10];

* 语法格式二：声明的同时创建
    数据类型[] 数组名 = new 数据类型[数组长度]；
    int[] arr = new int[10];

3. 数组在内存中会被分配连续的内存空间
* 数组名指向数组的第一个元素。当数据类型为int时，默认值为0.

4. 数组的初始化
* 声明数组的同时给数组赋值被称为数组的初始化。
    int[] arr = {1,2,3,4,5,6,7,8,9,10};

5. 数组元素的引用
* 语法格式：数组名[下标]
* 下标从0开始

6. 数组长度
* arr.length;

7. 使用Scanner类从键盘接收数据
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
sc.nextInt();
```

## 增强型for循环

```java
int[] arr = {1,2,3,4,5};
for(int n:arr){
    System.out.println(n);
}

```

## 对变量a、b的值进行交换

```java
int a=3, b=5;
int temp;
temp=a;a=b;b=temp;
```

## 冒泡排序

1. 对一组整数按照从小到大的顺序进行排序。
```java
int a = {34,53,12,32,56,17};
int temp;
for(int i = 0; i <a.length-1; i++){
    for(int j = 0; j<a.length-i-1; j++){
        if(a[j]>a[j+1]){
            temp=a[j];a[j]=a[j+1];a[j+1]=temp;
        }
    }
}
```

## 二维数组

1. 二维数组的声明和创建
* 语法格式：数据类型[][] 数组名； 数据类型 数组名[][]；数据类型[] 数组名[]；

2. 在创建二维数组时，可以只指定行数，不指定列数。但是不能只指定列数，不指定行数。

3. 空指针异常
```java
float[][] floatArray = new float[3][];
// 下面的语句会报空指针异常
System.out.println(floatArray[0][0]);
// 在只指定行数，不指定列数的二维数组中，每一行都相当于一个一维数组。
// 我们可以使用下面的语句创建
floatArray[0] = new float[3];
floatArray[1] = new float[4];
floatArray[2] = new float[5];
```

4. 二维数组的创始化
```java
int[][] num = {{1,2,3}, {4,5,6}, {7, 8, 9}};
// num.length返回的是行数；num[0].length返回的是列数；不同行的列数可以不同。
```