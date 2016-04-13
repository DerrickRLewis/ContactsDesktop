package sample;



/**
 * Created by admin on 4/12/16.
 */
public class Contact {

    String name;
    String phone;
    String email;

    public Contact(Object[] objects ) {
    return;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
       this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + phone+ email;
    }
}