import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Student sander = new Student("Sander", new ArrayList<String>(Arrays.asList("Math", "Danish", "Programming")));
        Student jack = new Student("Jack", new ArrayList<String>(Arrays.asList("Programming", "Music", "Java 1.0")));
        Student tobias = new Student("Tobias", new ArrayList<String>(Arrays.asList("Math", "Danish")));

        persons.add(sander);
        persons.add(jack);
        persons.add(tobias);

        Teacher claus = new Teacher("Claus", new ArrayList<String>(Arrays.asList("Math", "Music")));
        Teacher daniel = new Teacher("Daniel", new ArrayList<String>(Arrays.asList("Programming", "Java 1.0")));
        Teacher sine = new Teacher("Sine", new ArrayList<String>(Collections.singletonList("Danish")));

        persons.add(claus);
        persons.add(daniel);
        persons.add(sine);


        for (Person p: persons) {
            boolean isPossible = p.addCourse("Java 1.0");

            if(!isPossible) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                }
                else if (p instanceof Teacher){
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }

        }

    }
}