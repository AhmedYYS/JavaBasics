package com.sparta.ay;
//Written by Ahmed
public class App 
{
    public static void main( String[] args )
    {
        int timeOfDay = 25;
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message = "";
        if (timeOfDay >= 5 && timeOfDay <= 11) {
            message = ("Good Morning");
        } else if (timeOfDay >=12 && timeOfDay <= 15) {
            message = ("Good Afternoon");
        } else if (timeOfDay >= 16 && timeOfDay <= 20){
            message = ("Good Evening");
        } else if (timeOfDay >= 21 && timeOfDay <= 23){
            message = ("Good Night");
        } else if (timeOfDay >= 0 && timeOfDay <= 4) {
            message = ("Good Night");
        } else
            message = null;

        return message;
    }
}
