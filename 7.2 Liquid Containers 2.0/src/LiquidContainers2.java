/* import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args)  { */
        /* Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container); */


import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan, new Container(), new Container());
        ui.start();
    }

}
