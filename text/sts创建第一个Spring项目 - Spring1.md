# 创建第一个Spring项目

1.创建Spring Web项目。菜单File-》New-》Spring Legacy Project-》输入Project Name，并选择Simple Spring Web Maven，点击Finish按钮。

2.创建cn.edu.lntu包。右键src/main/java源代码文件夹-》New-》Package-》在name文本框输入cn.edu.lntu，点击Finish按钮。

3.按照书中P223代码在包中创建PersonService接口。右键cn.edu.lntu包文件夹-》New-》Interface-》在name文本框输入PersonService，点击Finish按钮。

4.创建接口的实现类Person。右键cn.edu.lntu包文件夹-》New-》Class-》在name文本框输入Person-》点击Add按钮，输入PersonService，筛选出对应的接口后，点击OK按钮-》点击Finish按钮。

5.配置Bean。展开src/main/resources源代码文件夹-》展开spring文件夹-》双击打开application-config.xml（此文件对应于书中的applicationContext.xml文件，不同的项目搭建工具给配置文件起名也不同），输入<bean id="person" class="cn.edu.lntu.Person"></bean>。

注：class属性值包含有包名，手动输入容易出错，推荐粘贴赋值。具体方法：打开Person.java文件-》双击类名Person，保证Person单词被选中-》右键-》Copy qualified Name-》粘接到class属性值位置。

6.编写主程序类TestBean。右键cn.edu.lntu包文件夹-》New-》Class-》在name文本框输入TestBean-》勾选复选框public static void main(String[] args)-》点击Finish按钮。

注：ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/application-config.xml");此语句与书中代码不同。

注：为了避免因网络原因造成从国外中央仓库下载构件异常导致的项目错误，需要选择从国内镜像仓库中下载构建。具体方法将settings.xml文件复制到本地仓库(C:\Users\Administrator\.m2)文件夹下，与repository文件夹同级。



