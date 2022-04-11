public class Pen {
    /**
     * intance variables
     */
    private String penName;

    private int id;

    /**
     * Constructor
     */
    Pen(String newPenName){
        this.penName = newPenName;
        System.out.println("The New Pen Name is = " + this.penName);
    }

    /**
     * Overload Constructor
     * 
     */
    Pen(int newId){
        this.id = newId;
        System.out.println("The New ID is = " + this.id);
    }
}
