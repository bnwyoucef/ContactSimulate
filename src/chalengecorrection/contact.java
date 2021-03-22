/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalengecorrection;

import java.util.ArrayList;

/**
 *
 * @author BOUNOUA
 */
public class contact {
    
    private String name;
    private String number;
    private ArrayList<Message> messages;
    
    public void getDetails(){
        System.out.println("name: "+name +"\nphone number: "+number+"\nmessages:"+messages);
    }

    public contact(String name, String number, ArrayList<Message> messages) {
        this.name = name;
        this.number = number;
        this.messages = messages;
    }

    public contact(String name, String number) {
        this.name = name;
        this.number = number;
        this.messages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    
    
    
    
    
    
}
