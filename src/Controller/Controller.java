package Controller;

import App.Cafe;

import java.util.Scanner;

public class Controller
{
    protected Scanner scanner;
    protected Cafe cafe;

    Controller(){
        this.scanner = new Scanner(System.in);
        this.cafe = Cafe.get();
    }
}
