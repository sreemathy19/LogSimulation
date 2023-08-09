package com.example.logsimulation;
import org.apache.log4j.Logger;
import java.util.Scanner;


public class LogSimulator {
    static Scanner sc=new Scanner(System.in);
    static Boolean t=true;
    private static final Logger admin = Logger.getLogger("admin");
    private static final Logger security = Logger.getLogger("security");
    static int a;
    static String who;
    static String whom;
    static String total_string;
    public static void main(String[] args) {
        while(t) {
            System.out.println("\na)tenant b)user c)role d)password e)quit");
            char module = sc.next().charAt(0);
            switch(module){
                case 'a':
                    System.out.println("\n1.create s 2.create f 3.update s 4.update f 5.delete s 6.delete f");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("new user:");
                            whom = sc.next();
                            total_string = who + " created " + whom + " successfully";
                            admin.info(total_string);
                            break;
                        case 2:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("new user:");
                            whom = sc.next();
                            total_string = who + " creating " + whom + " failed";
                            admin.error(total_string);
                            break;
                        case 3:
                            System.out.println("updated user:");
                            who = sc.next();
                            System.out.println("updated user:");
                            whom = sc.next();
                            total_string = who + " updated " + whom + " successfully";
                            admin.info(total_string);
                            break;
                        case 4:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("updated user:");
                            whom = sc.next();
                            total_string = who + " updating " + whom + " failed";
                            admin.error(total_string);
                            break;
                        case 5:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("user(to be deleted):");
                            whom = sc.next();
                            total_string = who + " deleted " + whom + " successfully";
                            admin.info(total_string);
                            break;
                    }
                    break;
                case 'b':
                    System.out.println("\n1.create s 2.create f 3.update s 4.update f 5.delete s 6.delete f");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("new user:");
                            whom = sc.next();
                            total_string = "[tenant] " +  who + " created " + whom + " successfully";
                            admin.info(total_string);
                            break;
                        case 2:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("new user:");
                            whom = sc.next();
                            total_string = "[tenant] " + who + " creating " + whom + " failed";
                            admin.error(total_string);
                            break;
                        case 3:
                            System.out.println("updated user:");
                            who = sc.next();
                            System.out.println("updated user:");
                            whom = sc.next();
                            total_string = "[tenant] " + who + " updated " + whom + " successfully";
                            admin.info(total_string);
                            break;
                        case 4:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("updated user:");
                            whom = sc.next();
                            total_string = "[tenant] " + who + " updating " + whom + " failed";
                            admin.error(total_string);
                            break;
                        case 5:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("user(to be deleted):");
                            whom = sc.next();
                            total_string = "[tenant] "+ who + " deleted " + whom + " successfully";
                            admin.info(total_string);
                            break;
                        case 6:
                            System.out.println("user:");
                            who = sc.next();
                            System.out.println("user(to be deleted):");
                            whom = sc.next();
                            total_string = "[tenant] " +who + " deleting " + whom + " failed";
                            admin.error(total_string);
                            break;
                    }
                    break;
                case 'd':
                    System.out.println("\n1.change s 2.change f");
                    a = sc.nextInt();
                    switch(a) {
                        case 1:
                            System.out.println("user:");
                            who = sc.next();
                            total_string = who + "'s password change success";
                            security.info(total_string);
                            break;
                        case 2:
                            System.out.println("user:");
                            who = sc.next();
                            total_string = who + "'s password change failed";
                            security.error(total_string);
                            break;
                    }
                    break;
                case 'e':
                    t = false;
            }
        }
    }
}
