
package findthespouse;

import java.util.ArrayList;

public class Person {
    
    public String name;
    public int gender; // male => 1, female => 0
    public Person father;
    public Person mother;
    public Person wife;
    public ArrayList<Person> siblings;
    public ArrayList<Person> children ;
    
    
    public Person(String name, int gender, Person father, Person mother){
        this.name = name;
        this.father = father;
        this.gender = gender;
        this.mother = mother;
        this.wife = null;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
    }
    
    public boolean isFemale(){
        return gender == 0;
    }
    
    public boolean isMale(){
        return gender == 1;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getGender(){
        return this.gender;
    }
    
    public void getSpouseCandidates(){
        
        for(Person s : this.father.siblings){
            if(s.getGender() == 0){
                for(Person x : s.children){
                    if(x.getGender() != this.getGender()){
                        System.out.println("Name : " + x.getName());
                    }
                }
            }
        }
        for(Person s : this.mother.siblings){
            if(s.getGender() == 1){
                for(Person x : s.children){
                    if(x.getGender() != this.getGender()){
                        System.out.println("Name : " + x.getName());
                    }
                }
            }
        }
    }
    
    public void addSibilings(Person person){
        this.siblings.add(person);
    }
    
    public void addChildren(Person person){
        this.children.add(person);
    }
    
    public void confirmMarriage(Person women){
        this.wife = women;
    }
}
