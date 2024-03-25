package Controller;

import App.Cafe;

import java.util.Scanner;

public class Controller
{
    protected static Scanner scanner;
    protected static Cafe cafe;

    static {
        cafe = Cafe.get();
        scanner = new Scanner(System.in);
    }
}
