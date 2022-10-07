# Java多态



## 什么是多态

* 多态意味着允许不同类的对象对同一消息做出不同的反应。
* 多态分为编译时多态和运行时多态。
* 编译时多态又称为设计时多态，主要通过方法的重载来实现的。
* 运行时多态是程序运行时动态决定调用哪个方法，也是我们常指的多态。
* 必要条件：（1）满足继承关系；（2）父类引用指向子类对象。
* static修饰的方法只能被子类使用，不能重写。但是在子类中，可以出现用static修饰的同名方法。

## 多态的实现

1. 子类通过关键字extends继承父类

2. 向上转型（向上类型转换）：将子类型转换为父类型
    （1）隐式/自动类型转换：将小类型转换成大类型。
    （2）不需要显示指定，即不需要加上前面的小括号和父类类型名。
    （3）不能获取子类特有的方法。
    （4）向上转型和动态绑定机制（识别对象转型前的类型，从而自动调用该类的方法）：调用时才知道使用的是那个类中的方法
![](./images/dynamic%20binding.png) 
    （5）向上转型多适用于有多个同父子类共同应用的场景，此时，可以借由父类引用，根据实际需要，转为特定的子类对象实现多态。

3. 向下转型：将父类型转换为子类型
    （1）强制类型转换：是从大类型到小类型。
    （2）父类型的引用必须指向转型的子类的对象，即指向谁才能转换为谁。不然会编译出错。
    （3）通过instanceof运算符来解决引用对象的类型，避免类型转换的安全性问题，提高代码的强壮性。
    ```java
    Animal two=new Cat();
    Cat cat=(Cat)two;
    if(two instanceof Cat){
        Cat temp=(Cat)two;
        System.out.println("two可以转换为Cat类型");
    }
    // two可以向下转换成Cat()，但是不能向下转换成Dog()
    if(two instanceof Dog){
        Dog temp2=(Dog)two;
        System.out.println("two可以转换为Dog类型");
    }
    ```
    （4）同为子类的两个兄弟类型之间不可以强制转换。
    （5）子类型先向上转换成父类性，然后再向下转换成子类型，还能使用原先的方法。
    （6）在向下转型前需要先进行向上转型，向下转型通常也会与instanceof一起使用。
    （7）向下转型时，不允许转为非原始类型。

## 类型转换案例

```java
public class Master {
	/*喂宠物
	 * 喂猫咪：吃完东西后，主人会带着去玩线球
	 * 喂狗狗：吃完东西后，主人会带着狗狗去睡觉
	 * 养兔子、养鹦鹉、养乌龟。。。。
	 */
	//方案1：编写方法，传入不同类型的动物，调用各自的方法
//	public void feed(Cat cat){
//		cat.eat();
//		cat.playBall();
//	}
//	
//	public void feed(Dog dog){
//		dog.eat();
//		dog.sleep();
//	}
	//方案2：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    // 向上转型
	public void feed(Animal obj){
		obj.eat();
		if(obj instanceof Cat){
            // 向下转型
			Cat temp=(Cat)obj;
			temp.playBall();
		}else if(obj instanceof Dog){
			Dog temp=(Dog)obj;
			temp.sleep();
		}
	}
	
	/*
	 * 饲养何种宠物
	 * 空闲时间多：养狗狗
	 * 空闲时间不多:养猫咪
	 */
	//方案1：
//	public Dog hasManyTime(){
//		System.out.println("主人休闲时间比较充足，适合养狗狗");
//		return new Dog();
//	}
//	public Cat hasLittleTime(){
//		System.out.println("主人平时比较忙碌，适合养猫咪");
//		return new Cat();
//	}
	//方案2：
	public Animal raise(boolean isManyTime){
		if(isManyTime){
			System.out.println("主人休闲时间比较充足，适合养狗狗");
			return new Dog();
		}else{
			System.out.println("主人平时比较忙碌，适合养猫咪");
			return new Cat();
		}
	}
}
```

```java
public class MasterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master=new Master();
		Cat one=new Cat();
		Dog two=new Dog();
		master.feed(one);
		master.feed(two);
		System.out.println("=============");
		boolean isManyTime=false;
		Animal temp=master.raise(isManyTime);
//		if(isManyTime){
//			temp=master.hasManyTime();
//		}else{
//			temp=master.hasLittleTime();
//		}
		System.out.println(temp);
	}

}
```


# 抽象类

* 即使代码编写时不会报错，但是也要考虑代码的实际意义。

* 由abstract修饰的类被成为抽象类。
    ```java
    public abstract class Animal{}
    ```

* 抽象类不允许实例化，但是可以通过向上转移指向它的子类的实例化。

* abstract不可以和class互换

* 应用场景：某个父类只是知道其子类应该包含怎样的方法，但无法准确知道这些子类如何实现这些方法时，可以将父类设置为抽象类。

1. 抽象方法
（1）抽象方法没有方法体。
（2）抽象方法必须在抽象类里。
（3）抽象方法必须在子类中被实现，除非子类是抽象类。

2. 抽象类&抽象方法
（1）abstract定义抽象类。
（2）抽象类不能直接实例化，只能被继承，可以通过向上转型完成对象实例。
（3）abstract定义抽象方法，不需要具体实现。
（4）包含抽象方法的类是抽象类。
（5）抽象类中可以没有抽象方法。
（6）子类如果没有重写父类所有的抽象方法，则也需要定义为抽象类。
（7）abstract不能与final、static、private共存。
（8）抽象方法在子类实现访问权限必须大于等于父类方法。


# 接口


# 内部类



