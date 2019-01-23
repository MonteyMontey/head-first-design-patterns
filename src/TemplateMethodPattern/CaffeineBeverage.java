package TemplateMethodPattern;

public abstract class CaffeineBeverage {

    // template method, contains algorithm that is used for tea and coffee but differs int the exact preparation
    // final = cannot be overwritten by a subclass
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook(); // hooks are free to override but don't have to
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    void hook(){

    }
}

/* The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
* Template Metod lets subclasses redefine certain steps of an algorithm without changing the algorithms structure*/