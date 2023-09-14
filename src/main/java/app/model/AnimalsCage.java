package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal1;
    private Animal animal2;

    @Autowired
    @Qualifier("timerBeans")
    public Timer timer;

    // вот это поставил тесты проходит, о все таки не понял как
    public Timer getTimer() {
        return timer;
    }

    @Autowired
    public AnimalsCage(@Qualifier("meowBeans") Animal animal1,
                       @Qualifier("gufBeans") Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
