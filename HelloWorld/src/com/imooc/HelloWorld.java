package com.imooc;

/**
 * [用记事本或其他编辑器编写Java程序]
 * 1.使用记事本编辑源文件:                    myProgram.java
 * 2.使用javac命令讲源文件编译为字节码文件      myProgram.class(和平台无关，均为这个文件，实现了Java的跨平台)
 * 3.由解释器(interpreter)将字节码文件运行在各个平台
 *
 * 写完myProgram.java则用
 * >>>javac myProgram.java
 * 编译成字节码文件
 *
 * 运行java程序
 * java myProgram
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Good Job!");

        /*
        * [变量]
        * 可把变量看做盒子，数据或数据集可存放在盒子中
        * [描述变量]
        * 在Java中，我们通过三元素描述变量:
        *   1.变量类型;2.变量名;3.变量值
        *   sd
        * 在Java中,我们可以根据所需保存的数据的格式,将其保存在置顶类型的变量空间中,并且通过变量名快速定位
        * */

        /*
        * [变量命名]
        * 首字符可为字母,下划线,美元符号
        * 习惯:
        *   1.驼峰命名法:第一个单词首字母小写,其后单词的首字母大写:eg myAge
        *   2.变量命名表达数据作用
        *   3.Java表示服严格区分大小写
        * */
        int $a;int _a;int a;    //这样写虽然无语法错误但是没表达数据作用
        int numAvg;int numavg;  //这是两个不同的变量,因其大小写不一样

        /*
        * [数据类型]
        * Java是一种强类型语言,即在Java中存储的数据都有类型,而且必须在编译时就确定其类型
        *
        * 分为:
        *   基本数据类型:
        *       1.数值型:整数类型(byte,short,int,long);浮点类型(float,double)
        *       2.字符串型(char)
        *       3.布尔类型(boolean)
        *
        *   引用数据类型:
        *       1.类(class)
        *       2.接口(interface)
        *       3.数组(array)
        * */
        //数值
        int numOne=1;
        //字符串
        char str='s'; //字符型只能存储单个字符,并且要用单引号
        //布尔类型
        boolean judge=false;

        //float和double,String和char String是类还是数组?

        /*
        * [自动类型转换]
        *                char
        *                 ↓
        * byte → short → int → long
        *                 : \    .
        *                 :  \  .
        *                 ↓   ↙↘
        *                float  double
        * 虚线会有精度损失
        * */

        byte byNum=2;
        int sum=byNum+3;
        System.out.println(sum);

        /*
        * [强制类型转换]
        * 语法: (数据类型) 数值
        * 强制类型转换会造成数据的丢失
        * */
        long numLong=333;
        int numInt=(int)numLong+3;
        System.out.println(numInt);

        /*
        * [常量]
        * 可以理解为一种特殊的变量,它的值被设定后在程序运行过程中不允许改变
        * [语法]
        * final String LOVE="Imooc"
        * */
        final String WORD="Imooc";

    }
}
