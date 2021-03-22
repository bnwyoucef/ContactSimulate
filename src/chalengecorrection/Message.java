/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalengecorrection;

/**
 *
 * @author BOUNOUA
 */
public class Message {
    
    private String text;
    private String recipient;
    private int id;
    
    public void getDetails(){
        System.out.println("contact name: "+ recipient 
        +"text: " + text + "id: " + id);
    }

    public Message(String text, String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
