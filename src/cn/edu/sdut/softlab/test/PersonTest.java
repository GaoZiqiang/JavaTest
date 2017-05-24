package cn.edu.sdut.softlab.test;

import cn.edu.sdut.softlab.person.Person;

public class PersonTest {

	public static void main(String args[]) {
		
		Person personC = null;
		Person person = new Person();
		Person personA = new Person();
		Person personB = new Person();
		
		//打印测试各个对象的值
		System.out.println("三个对象的值：");
		System.out.println("person的值:" + personC);
		System.out.println("personA的值:" + personC);
		System.out.println("personB的值:" + personC);
		
		// 打印测试String常量
		System.out.println("三个对象的String常量：（意味着已经开辟内存空间）");
		System.out.println("person的String常量:" + person.toString());
		System.out.println("personA的String常量:" + personA.toString());
		System.out.println("personB的String常量:" + personB.toString());
		
		// 打印测试Class类型
		System.out.println("三个对象的类型：");
		System.out.println("person的Class:" + person.getClass());
		System.out.println("personA的Class:" + personA.getClass());
		System.out.println("personB的Class:" + personB.getClass());
		System.out.println("personB:" + personC.getClass());
		
		System.out.println("personC的值:" + personC);
		System.out.println("personC的String常量:" + personC.toString());
		System.out.println("personC的Class类型:" + personC.getClass());
		//System.out.println(username);

	}

}
