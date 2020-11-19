package com.tamimehsan.controller;

import com.tamimehsan.IO.Console;
import com.tamimehsan.IO.MyColor;



public class MainMenu {

    public boolean showOption(){
        System.out.println( "╔══════════════════════════════════╗" + "\n" +
                            "║             "+ MyColor.ANSI_YELLOW +"Main Menu"+ MyColor.ANSI_RESET +"            ║" + "\n" +
                            "╠══════════════════════════════════╣" + "\n" +
                            "║         Choose what to do:       ║" + "\n" +
                            "║          (1) Search Cars         ║" + "\n" +
                            "║          (2) Add Car             ║" + "\n" +
                            "║          (3) Delete Car          ║" + "\n" +
                            "║          (4) Exit System         ║" + "\n" +
                            "╚══════════════════════════════════╝");
        int options = Console.getInstance().getOption();
        switch(options){
            case 1:
                new SearchMenu().SearchOptionController();
                break;
            case 2:
                new AddCarMenu().addCars();
                break;
            case 3:
                new DeleteCarMenu().deleteCars();
                break;
            case 4:
                Console.getInstance().printSuccess(MyColor.ANSI_CYAN,"✋Thank you for staying with us");
                return false;
            default:
                Console.getInstance().printError("Unknown option");
                break;
        }
        return true;
    }
}
