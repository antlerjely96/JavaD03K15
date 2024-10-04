package Human;

import Animal.Animal;

public class Human extends Animal {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        input();
        this.id = id;
    }

    private void input(){

    }
}
