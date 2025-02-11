import models.Animal;
import models.Enclos;
import models.TypeAnimal;
import services.ServiceAnimalier;

public class App {

     public static void main(String[] args) throws Exception {

        Animal chien1 = new Animal("Rex1", TypeAnimal.CHIEN);
        Animal chien2 = new Animal("Rex2", TypeAnimal.CHIEN);
        Animal chien3 = new Animal("Rex3", TypeAnimal.CHIEN);

        Animal chat1 = new Animal("Chaussette1", TypeAnimal.CHAT);
        Animal chat2 = new Animal("Chaussette1", TypeAnimal.CHAT);
        Animal chat3 = new Animal("Chaussette1", TypeAnimal.CHAT);

        Animal girafe1 = new Animal("LongCou1", TypeAnimal.GIRAFE);
        Animal girafe2 = new Animal("LongCou2", TypeAnimal.GIRAFE);
        Animal girafe3 = new Animal("LongCou3", TypeAnimal.GIRAFE);

        // ...

        Enclos enclos1 = new Enclos();
        enclos1.addAnimal(chien1);
        enclos1.addAnimal(girafe2);
        Enclos enclos2 = new Enclos();

        // ...

        ServiceAnimalier service = new ServiceAnimalier();
        service.indexerEnclos(enclos1);
        service.indexerEnclos(enclos2);

        // ...

        System.out.println("Il y a au total : " + service.getNbTotalAnimaux() + " animaux");

    }
}
