package org.nkpractice;

import java.util.function.Function;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            System.out.println("i * i = " + (i * i));
            Predicate<Integer> isEven = n -> n % 2 == 0;
            System.out.println("Is i even? " + isEven.test(i));
            Function<String ,Integer> ft = (s)-> s.length();
            System.out.println(ft.apply("nk"));

            
        }
        System.out.println("Goodbye!");
        System.out.println("Goodbye-Test-Git-Fetch--> fetch->update+merge!");
         System.out.println("Goodbye_test-Git-Remote->Fetch->Merge");
        System.out.println("Goodbye_test-Git-Remote->Pull");
    }
}
