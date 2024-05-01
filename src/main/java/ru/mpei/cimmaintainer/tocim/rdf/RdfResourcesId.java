package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@Getter
@AllArgsConstructor
public class RdfResourcesId {
    private final String Id;
     public RdfResourcesId(){
         this.Id = generateString(8) +
                 "-" +
                 generateString(4) +
                 "-" +
                 generateString(4) +
                 "-" +
                 generateString(4) +
                 "-" +
                 generateString(12);
     }

    @Override
    public String toString() {
        return  Id;
    }
    private String generateString(int len){
         String data = "abcdefghijklmnopqrstuvwxyz0123456789";
         StringBuilder result = new StringBuilder();
         Random random = new Random();
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(data.length());
            result.append(data.charAt(index));
        }
        return result.toString();
    }
}
