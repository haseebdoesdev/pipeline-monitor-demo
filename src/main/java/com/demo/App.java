package com.demo;

public class App {

    public String getMessage() {
        return "Hello from Pipeline Monitor!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}
