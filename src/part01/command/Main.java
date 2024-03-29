package part01.command;

import part01.command.fx.Button;
import part01.command.fx.Command;

public class Main {
    public static void main() {
        /**
         * Task 01: Implement the Command Pattern
         * Add and View Customer Records
         */

        System.out.println("Add and View Customer Records");
        Command addCommand = () -> add();
        Button addButton = new Button(addCommand);
        addButton.onCLick();

        Command viewCommand = () -> view();
        Button viewButton = new Button(viewCommand);
        viewButton.onCLick();

        /**
         * Task 02: Implement the Canvas Example
         * 
         * 
         */

        System.out.println("Canvas Example");
        Command resizeCommand = () -> System.out.println("Resize the canvas");
        Command colorBlackAndWhiteCommand = () -> System.out.println("Color Black and White");
        Command drawCommand = () -> System.out.println("Draw the canvas");

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(resizeCommand);
        compositeCommand.add(colorBlackAndWhiteCommand);
        compositeCommand.add(drawCommand);

        Button canvasButton = new Button(compositeCommand);
        canvasButton.onCLick();

    }

    static void add() {
        System.out.println("Add Customer Records!");
    }

    static void view() {
        System.out.println("View Customer Records!");
    }
}
