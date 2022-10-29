package Generics.homework33;

import java.util.List;

public class AnimalPlay{
    //按任务要求实现该类
    public void playGame(List<? extends Animal> animalList){
        animalList.forEach(animal -> {
            animal.playGame();
        });
    }
}