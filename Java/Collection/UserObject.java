package Collection;

import java.util.ArrayList;

public class UserObject {

    public static void main(String[] args) {
        ArrayList<user> li = new ArrayList<>();
        li.add(new user(1,"pratik"));
        li.add(new user(1,"pratik"));
        li.add(new user(1,"pratik"));
        li.add(new user(1,"pratik"));
        li.add(new user(1,"pratik"));

        li.forEach(user -> System.out.println("id  : "+ user.getId() + "  Name  : "+ user.getName() ));
    }
}

class user{

    private int id;
    private String name;

    user(int id,String name) {
        this.id = id;
        this.name = name;
    }
        public int getId(){
            return id;
        }

    public String getName(){
        return name;
    }

    public void Setname(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}