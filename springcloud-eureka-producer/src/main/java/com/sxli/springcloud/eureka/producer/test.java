package com.sxli.springcloud.eureka.producer;

public class test {

    private  static void fun1(User user){
        user.setName("1");
        System.out.println("fun1-"+user.getName());
        fun2(user);
    }

    private  static void fun2(User user){
        user.setName("2");
        System.out.println("fun2-"+user.getName());
    }


    public static void main(String[] args) {
        User us = new User();
        us.setName("0");
        fun1(us);
        System.out.println("main-"+us.getName());
    }

    public static class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
