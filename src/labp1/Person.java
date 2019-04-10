/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labp1;

/**
 *
 * @author Fu yuanqing
 */
public class Person {
    private String name;
    //private String name;
    private  int age;
    //private String val=age+"";

    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
        //return "";
    }
    public int getAge(){
        return age;
        //return 0;
    }

    public String reverseName(){
        String reverse = new StringBuffer(name).reverse().toString();
        return reverse;
        //return "";
    }

}
