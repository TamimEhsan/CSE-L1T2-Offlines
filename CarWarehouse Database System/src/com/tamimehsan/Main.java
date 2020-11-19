package com.tamimehsan;

import com.tamimehsan.IO.Console;
import com.tamimehsan.IO.MyColor;
import com.tamimehsan.controller.MainMenu;
import com.tamimehsan.data.Database;


public class Main {

    public static void main(String[] args) {
        
        boolean success = Database.getInstance().readData();
        boolean gameLoop = true;
        while(gameLoop){
            gameLoop =  new MainMenu().showOption();
            clearScreen();
        }
        Console.getInstance().closeScanner();
        Database.getInstance().writeData();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
