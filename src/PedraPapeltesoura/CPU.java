package PedraPapeltesoura;

import java.util.concurrent.ThreadLocalRandom;

public class CPU {
    int n;

    int escholha(){
        n = ThreadLocalRandom.current().nextInt(1, 4);
        return n;
    }
}
