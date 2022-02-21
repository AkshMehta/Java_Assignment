class User{
    private String name;
    private String email_id;
    private String phone_no;

    public void setName(String name){ //Setter Method
        this.name = name;
    }
    public void setEmail(String email_id){ //Setter Method
        this.email_id = email_id;
    }
    public void setPhone(String phone){ //Setter Method
        this.phone_no = phone;
    }

    public String getName(){ //Getter Method 
        return name;
    }
    public String getEmail(){ //Getter Method
        return email_id;
    }
    public String getPhone(){ //Getter Method
        return phone_no;
    }
}


public class Question2 {
    public static void main(String[] args) { 
        User us = new User();
        us.setName("Aksh Mehta");
        us.setEmail("akshmehta2000@gmail.com");
        us.setPhone("8756972341");

        System.out.println("Name : "+us.getName()+ "\nEmail : "+us.getEmail()+ "\nPhone Number : "+us.getPhone());
    }
}