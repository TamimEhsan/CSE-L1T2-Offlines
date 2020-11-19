package com.tamimehsan.controller;

import com.tamimehsan.Car;
import com.tamimehsan.IO.Console;
import com.tamimehsan.data.Database;
import com.tamimehsan.IO.MyColor;


public class DeleteCarMenu {
    public void deleteCars(){
        System.out.println( "╔══════════════════════════════════════╗" + "\n" +
                            "║     "+ MyColor.ANSI_YELLOW +"Main Menu > Delete Car"+ MyColor.ANSI_RESET +"           ║" + "\n" +
                            "╠══════════════════════════════════════╣" + "\n" +
                            "║   Enter the reg number of the car    ║" + "\n" +
                            "╚══════════════════════════════════════╝");

        String regNumber = Console.getInstance().getInput();
        Car car = Database.getInstance().searchCarByRegistrationNumber(regNumber);
        if( car == null ){
            Console.getInstance().printError("Given information about the car is not found in the database");
        }else{
            Database.getInstance().deleteCar(car);
            Console.getInstance().printSuccess( MyColor.ANSI_GREEN, "Success:The car was deleted from the database");
        }
    }
}
