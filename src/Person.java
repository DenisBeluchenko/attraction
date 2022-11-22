public class Person {
    protected String name;
    protected int tickets;

    public Person(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }
    public  void spentTickets(){
        tickets--;
    }
}

