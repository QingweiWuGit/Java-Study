# 封装的实现

* 封装是指将类中的某些信息隐藏在类内部，不允许外部程序直接访问。但是用户可以通过该类提供的方法来实现对隐藏信息的操作和访问。
* 隐藏对象的信息，留出访问的接口

1. 封装的实现

* 修改属性的可见性：通过关键字private
* 创建getter/setter方法，设为public，用于属性的读写
* 在getter/setter方法中加入属性控制语句，对属性值的合法性进行判断

2. 用private修饰的属性，只能使用get方法来调用

3. 引用数据类型的应用 -- 方法参数

* 如应用的是基本数据类型的变量，则传递的是数据的值；如果是引用s数据类型的变量，则传递的是对象的引用

4. 使用包进行类管理 -- 创建包
* Java同一个包中不允许存放同名类
* 包的命名一般是：域名倒序+模块+功能
* 域名全部小写
* package语句必须放在程序代码的第一行
* 建议每个包内存储信息功能单一

5. 导入包
```java
// 加载com.imooc.animal包下所有类
import com.imooc.animal.*;
// 加载指定包下某个特定的类
import com.imooc.animal.Cat;
// 在程序代码中直接加载包名.类名的方式引入类
com.imooc.animal.CatTest test = new com.imooc.animal.CatTest();
// 如果有两个同名的类，建议使用全路径.类名
// 在加载类时，要使用类的当前路径，而不能加载它的上级路径
```


# static关键字

* static表示静态信息
* static修饰的属性和方法应该用静态的方式来访问
* 同一个类中，static修饰的属性，不管生成多少个实例，都共用同一个内存空间
* 静态属性在类加载时产生，销毁时释放

```java
// 静态成员要使用类名.属性名的方式来进行修改
// 但是在访问时，可以通过类名.属性名或者对象.属性名两种方式进行访问
```

* static不能用来修饰类。类只能由public,abstract和final来修饰
* 不能用static来修饰方法内的局部变量
* 可以在类的方法中使用this.属性名来调用静态属性
* 在类的静态方法中，不能直接引用其它的非静态方法，只能引用静态方法和属性，也不能使用关键字this
* 如果一定要调用类中的非静态成员，可以先将类实例化，然后再调用对象.属性
* 非静态方法可以通过类名.成员名或者成员名或者this.成员访问类内静态方法/静态成员；使用this.静态成员/静态方法时会提示警告，但不影响运行。

* 在类的方法中，普通代码块是顺序执行的
* 类中的普通代码块，又被称为构造代码块。它会在对象创造的时候被调用，它的顺序优于其它的方法，包括构造方法。如果一个类中有多个构造代码块，它会根据顺序来执行
* 在构造代码块前添加static的代码块又被称为静态代码块。静态代码块会先于构造代码块来执行。如果一个类中存在多个静态代码块，它们也会顺序执行
* 如果创建了多个实例，静态代码块会执行一次，构造代码块会执行多次
* 在静态代码块中，只能给静态成员赋值，不能给非静态成员赋值
* 在普通代码块中定义的变量，只能在普通代码块中使用
