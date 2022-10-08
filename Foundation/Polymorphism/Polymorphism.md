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

## 为什么要有接口？

* 因为Java只支持单继承，当我们需要一个类型中需要兼容多种类型特征或者多个不同类型可以具备相同特征时，我们可以使用接口来实现行为的关联。
* 例如，我们可以定义一个接口，玩游戏。然后手机和电脑类都可以继承这个接口。

## 定义接口并测试
* 接口由关键字interface来定义，类实现接口需要用到关键字implements。
* 我们可以在接口中定义方法，不需要书写方法体。实现接口的类必须书写接口中的方法。
* 可以在继承父类的基础上实现接口。
	```java
	public class FourthPhone extends FatherClass implements Interface
	```
* 实现接口的类可以通过转换变成接口类。这样生成的对象只能调用接口中的方法。
	```java
	Iphone ip = new FourthPhone()
	```

## 接口成员 -- 抽象方法&常量

	（1）接口前的权限只能为public或者默认权限。
	（2）语法
	```java
	[权限] interface 接口名 [extends 父接口 1，父接口 2 ...]
	```
	（3）接口中的方法可以不填public，但是在具体实现时，也会根据public权限来实现。可以在实现接口的类中测试。
	（4）接口中的方法默认添加abstract关键字。
	（5）继承接口的实现类要实现接口中的所有方法，否则要将实现类定义为抽象类。
	（6）接口中可以包含常量，默认情况下系统会自动加上关键字public static final。
	（7）当一个类实现多接口，且其中同时具有相同方法时，实现类需要重写该方法，否则会变异错误。
	（8）接口中的常量定义必须初始化。


## 接口成员 -- 默认方法&静态方法

（1）当不想实现接口中的全部方法时，我们可以在接口中定义默认方法。默认方法可以书写方法体。
```java
default void connection(){
	System.out.println("我是接口中的默认方法");
}
```

（2）除了默认方法以外，我们还可以使用静态方法。静态方法也不要求一定重写。
```java
static void stop(){
	System.out.println("我是接口中的静态方法");
}
```

（3）当调用静态方法和默认方法时，我们可以通过实例调用默认方法。但是调用静态方法只能通过类名来调用。

（4）默认方法和静态方法在jdk1.8以后新增的。

（5）默认方法能够在实现类中重写，并且通过接口的引用调用；静态方法不能在实现类中重写。


## 接口应用的常见问题

1. 当父类实现接口，子类继承父类后，是否也需要实现接口里的全部方法？

（1）如果父类未实现接口中的全部方法，则父类需要设置为抽象类。那么当子类在继承父类时，也需要实现相关未实现的方法，否则应该继续设置为抽象类。
（2）如果父类已经全部实现了接口中的方法，子类如无必要，无需重新实现接口中的方法。

2. 接口是否只能在同一个包里创建？可以单独创建一个接口包吗？如果单独创建了接口包，怎么实现跨包的使用呢？

（1）接口可以在不同包中创建，可以根据业务设计需要单独创建接口包。
（2）跨包调用接口时，需要将接口设置为public访问权限，然后根据类跨包调用的方式调用即可，即import 包名.* 或者import 包名.接口名

3. 分析下面这段代码
```java
interface IPhone{
	void testOne();
}
class Camera implements IPhone{
	@Override
	public void testOne(){
		System.out.println("我是父类实现的testOne");
	}
	public void add(){
		System.out.println("我是父类实现的add");
	}
}
class Test{
	public void test(){
		IPhone ip2 = new Camera();
	}
}
\\IPhone，Camera是IPhone的实现类
```
	
4. IPhone作为接口，不能直接实例化对象，只能设置接口的引用指向具体的接口实现类。接口的灵活性在于“规定一个类必须做什么，而不管你如何做“。

（1）当使用接口引用指向实现类时，不能直接调用实现类独有的方法，需要进行强制类型转换才可以调用。

5. 一个Java文件中可以存在几个接口？

（1）一个java文件可以存在多个类，多个接口，但是只能存在一个public修饰的类或接口，且此时文件名需要与public修饰的类或者接口同名。

6. 接口及其中成员默认修饰符都是什么？通常情况下如何访问？

（1）文件中接口的默认修饰符是包内可见。
（2）接口中常量的默认修饰符是public static final，这三个关键字缺少那个都不影响应用。可通过接口名.常量名访问
（3）接口中抽象方法的默认修饰符是public abstract。在实现类中实现抽象方法后，可以通过接口引用或者实现类引用访问相关方法。

7. 接口中的默认方法和静态方法如何区分？

（1）默认方法在实现类中需要通过接口引用进行访问；可以在实现类中进行重写与加载，重写时需要去掉关键字default，重载的方
法无法通过接口引用进行访问；重写方法中，可以通过接口名.super.默认方法的方式调用接口中原有的默认方法。

（2）静态方法在实现类中需要通过接口名进行访问；实现类无法继承（即直接引用）接口中的静态方法；实现类无法重写静态方法，
可以存在相同格式静态方法，但二者独立存在。
	



## 如何解决多接口中重名默认方法的方案

1. 实现类继承多个接口，多个接口里面有重名的方法时，我们可以在实现类中重写一个同名的方法，不要Override修饰。

2. 当我们继承父类和多个接口，且它们中有同名方法，我们在子类中不重写此方法时，子类的实例此方法输出的是父类的方法。子类也可以重写此方法。


## 如何解决多接口中重名常量处理的方案

1. 和重名方法的规则不一样的时候，即使子类同时继承单父类和多接口，它也不能识别此中的常量。我们只能在子类中重新定义该常量。

## 接口的继承

```java

public interface IFather{
	void say();
}

public interface ISon extends IFather{
	void run();
}

public class Demo implements ISon{
	@Override
	public void say(){
		//TODO
	}
	public void run(){
		//TODO
	}
}
```

1. 子接口可以继承多个父接口。

2. 如果多个父接口有同名方法，则继承的子接口也需重写这个方法。

## 接口和抽象类的比较



## UML中类关系表示

# 内部类

1. 什么是内部类

2. 成员内部类

3. 静态内部类

4. 方法内部类

5. 匿名内部类

6. 接口中的内部类应用

7. 常见内部类的比较

8. 常见问题



