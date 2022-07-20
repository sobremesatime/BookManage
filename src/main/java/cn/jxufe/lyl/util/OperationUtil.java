package cn.jxufe.lyl.util;

import java.util.Scanner;

public class OperationUtil {
    public static boolean isContinue(String operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否继续" + operation + "(y/n)?");
        String selection = scanner.nextLine();
        scanner.close();
        if (Character.toLowerCase(selection.charAt(0)) == 'y') {
            return true;
        }
        return false;
    }
}
