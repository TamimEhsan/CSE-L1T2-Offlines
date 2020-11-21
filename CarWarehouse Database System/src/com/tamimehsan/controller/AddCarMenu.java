package com.tamimehsan.controller;

import com.tamimehsan.IO.Console;
import com.tamimehsan.data.Database;
import com.tamimehsan.IO.MyColor;


public class AddCarMenu {

    public void view(){
        System.out.println( "╔════════════════════════════════╗" + "\n" +
                            "║   "+ MyColor.ANSI_YELLOW +"Main Menu > Add Car"+ MyColor.ANSI_RESET +"          ║" + "\n" +
                            "╠════════════════════════════════╣" + "\n" +
                            "║   Input New Car Information    ║" + "\n" +
                            "╚════════════════════════════════╝");

        String newCar = Console.getInstance().getInput("Enter New Car Info: ");
        boolean status = Database.getInstance().addCar(newCar);
        if( status){
            Console.getInstance().printSuccess(MyColor.ANSI_GREEN,"\uD83D\uDCD9Success: New Car Added to the database");
        }else{
            Console.getInstance().printError("Car with this registration number exists already");
        }

    }

}
