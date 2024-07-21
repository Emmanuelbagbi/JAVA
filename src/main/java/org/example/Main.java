package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            StringBuilder tableRow = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                tableRow.append("*");
            }
            System.out.println(tableRow.toString());
        }
    }
}