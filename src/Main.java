import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClients();
        for (Person person:people){
            queue.offer(person);
        }
        while (!queue.isEmpty()){
            Person person=queue.poll();
            System.out.println("Посетитель "+person.getName()+" прокатился");
            person.spentTickets();
            if(person.getTickets()>0)
            {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Denis", 3));
        ans.add(new Person("Igor", 2));
        ans.add(new Person("Tom", 1));
        ans.add(new Person("Lisa", 1));
        ans.add(new Person("Sem", 1));
        return ans;
    }
}

