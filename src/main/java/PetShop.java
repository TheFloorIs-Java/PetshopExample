
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PetShop {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(PetShop.class);
        logger.info("info text");

//Generics (like 'E') are the same thing as saying Object
        List<String> pets;
        pets = new ArrayList<>();
        pets = new LinkedList<>();

        pets.add("Fido");
        pets.add("Snowball");
//        List<Integer> pets = new List<>();

    }
}
