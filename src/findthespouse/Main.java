
package findthespouse;


public class Main {
    
    public static void main(String[] args){
        Person godFather = new Person("GOd Father", 1, null, null);
        Person godMother = new Person("God Mother", 0, null, null);
        
        Person sonOfGodFather = new Person("Luffy", 1, godFather, godMother);
        
        Person godFatherSib1 = new Person("GOd Father sib 1", 0, null, null);
        godFather.addSibilings(godFatherSib1);
        
        godFatherSib1.addChildren(new Person("Robin", 0, godFatherSib1, null));
        Person godFatherSib2 = new Person("GOd Father sib 2", 0, null, null);
        godFather.addSibilings(godFatherSib2);
        godFatherSib2.addChildren(new Person("Nami", 0, godFatherSib2, null));

        Person godMotherSib1 = new Person("God Mother sib 1", 1, null, null);
        godMother.addSibilings(godMotherSib1);
        godMotherSib1.addChildren(new Person("Vivi", 0, godMotherSib1, null));
        Person godMotherSib2 = new Person("God Mother sib 2", 1, null, null);
        godMother.addSibilings(godMotherSib2);
        godMotherSib2.addChildren(new Person("Hancok", 0, godMotherSib2, null));
        
        sonOfGodFather.getSpouseCandidates();
        
    }
}
