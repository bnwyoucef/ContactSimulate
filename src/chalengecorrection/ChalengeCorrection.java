/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalengecorrection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BOUNOUA
 */
public class ChalengeCorrection {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<contact> contacts;
    public static Scanner scanner;
    public static int id = 0;
    
    public static void main(String[] args) {
        
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("welcome to my contact application!");
        showInitialoption();
        
    }

    private static void showInitialoption() {
        System.out.println("1. Manage contacts\n2. Messages\n3. Quit");
           
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                ManageContacts();
                break;
            case 2:
                ManageMessages();
                break;
            default:
                break;
        
        
        }
    }

    private static void ManageContacts() {
        System.out.println("1. show all contacts\n2. add a new contact\n3. search dor a contact\n4. delete a contact"
                + "\n5. Go back to the previous menu");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                showContacts();
                break;
            case 2:
                addContacts();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                showInitialoption();
                break;
        }
    }

    private static void showContacts() {
        for(contact c:contacts){
            c.getDetails();
        }
        showInitialoption();
    }

    private static void addContacts() {
        System.out.println("adding contact\nenter the name:");
        String name = scanner.next();
        System.out.println("enter the phone number");
        String number = scanner.next();
        if("".equals(name) || "".equals(number)){
            System.out.println("oops somthing wrong!\ntry again");
            addContacts();
        }
        else{
            contact c = new contact(name,number);
            contacts.add(c);
        }
        showContacts();
    }

    private static void searchContact() {
        System.out.println("searching contact\nenter the name:");
        String name = scanner.next();
       
        if(name.equals("")){
            System.out.println("please enter a name:");
            searchContact();
        }
        else{
             boolean trouve = false;
            for(contact c :contacts){
                if(c.getName().equals(name)){
                    trouve = true;
                    c.getDetails();
                }
            }
            if(!trouve){
            System.out.println("not found!");
            }
        }
        
    }

    private static void deleteContact() {
        System.out.println("delete a conatact:\nenter the name:");
        String name = scanner.next();
        
        if(name.equals("")){
            System.out.println("enter a name please!");
            deleteContact();
        }
        else{
            boolean trouve = false;
            for(contact c:contacts){
                if(c.getName().equals(name)){
                    trouve = true;
                    contacts.remove(c);
                }
            }
            if(!trouve){
            System.out.println("not found!");
            }
        }
    }

    private static void ManageMessages() {
        System.out.println("1. show all the messages\n2. send a message\n3. Go back to the previous Menu");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                showAllMessages();
                break;
            case 2:
                sendMessage();
                break;
            case 3:
                    showInitialoption();
                break;
        }
    }

    private static void showAllMessages() {
        ArrayList<Message> allsms = new ArrayList<>();
        for(contact c:contacts){
            allsms.addAll(c.getMessages());
        }
        if(allsms.size()>0){
        for(Message m:allsms){
            m.getDetails();
            System.out.println("**********************");
        }
        }
        else{
            System.out.print("no message");
        }
        
    }

    private static void sendMessage() {
        System.out.println("enter the contact name:");
        String name = scanner.next();
        if(name.equals("")){
            System.out.println("enter a name please!");
            sendMessage();
        }
        else{
            boolean trouve = false;
            for(contact c:contacts){
                if(c.getName().equals(name)){
                    trouve = true;
                }
            }
            if(trouve){
                System.out.println("what you want to say");
                String text = scanner.next();
                if(text.equals("")){
                    System.out.println("enter a message please!");
                    sendMessage();
                }
                else{
                    id++;
                    Message message = new Message(text, name, id);
                    for(contact c:contacts){
                        if(c.getName().equals(name)){
                            ArrayList<Message> newMessage = c.getMessages();
                            c.setMessages(newMessage);
                        }
                    }
                }
            }
            else{
                System.out.println("contact not found");
            }
        
        
        }
        showInitialoption();
    }
    
}
