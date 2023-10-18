# 基于XML的Bean装配

## 1.设值注入

1.创建Spring web项目Spring2_1。

2.创建cn.edu.lntu.dao包。

3.在dao包下创建接口AccountDao，并添加方法public void add();。

4.在dao包下创建AccountDao实现类AccountDaoImp。

5.创建cn.edu.lntu.service包。

6.在service包下创建接口AccountService，并添加方法public void addAccount();。

7.在service包下创建AccountService实现类AccountServiceImp。在类中定义AccountDao类型的数据成员accountDao，并为其生成set方法（在类内空白区域右键-》Source-》Generate Getters and Setters...-》在弹出的窗口中勾选复选框accountDao，点击OK按钮）。

8.配置Bean。Spring工厂完成AccountServiceImp类中的accountDao成员实例化工作，通过配置信息

<==property== ==name==="accountDao" ==ref==="accountDaoInstance"></property>

告诉工厂对accountDao成员（name="accountDao"），使用accountDaoInstance对应的Bean类cn.edu.lntu.dao.AccountDaoImp来实例化（<bean id="accountDaoInstance" class="cn.edu.lntu.dao.AccountDaoImp"/>）。

9.在cn.edu.lntu包下创建主类TestDI_1。如图首先将包的呈显现方式设置为层级Hierarchical-》右键包文件夹cn.edu.lntu-》New-》Class。

![image-20230724141655349](C:\Users\Administrator\Documents\WPSDrive\335771498\WPS云盘\教学\JAVA高级\2023秋\assets\image-20230724141655349.png)

## 2.构造注入

1.继续项目Spring2_1，在cn.edu.lntu.service包下创建实现类AccountServiceImp2。在类中定义AccountDao类型的数据成员accountDao，并创建实现类的构造函数（在类内空白区域右键-》Source-》Generate Constuctor using Fields...-》在弹出的窗口中勾选复选框accountDao，点击OK按钮）。

2.配置Bean。Spring工厂完成AccountServiceImp2类中的accountDao成员实例化工作，通过配置信息

<==constructor-arg== ==ref==="accountDaoInstance"></constructor-arg>

告诉工厂在实例化AccountServiceImp2时，同时使用accountDaoInstance对应的Bean类cn.edu.lntu.dao.AccountDaoImp来实例出一个Dao对象，并将该对象通过AccountServiceImp2的构造函数传递给accountDao成员。因为构造函数只有一个形参，<constructor-arg>标签可以省略name属性，如果有多个形参，需要加入name属性以加以区分。

3.在cn.edu.lntu包下创建主类TestDI_2。