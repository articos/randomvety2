package util;

import dto.Sentences;

import java.util.Random;

public class SentencesUtilImpl implements SentencesUtil{


    @Override
    public void generateSentence(Sentences sentences, int times) {

        Random random = new Random();


        for (int i = 0; i < (times-1); i++) {
            int randomFinal = random.nextInt(sentences.numberOfWords());
            System.out.println(sentences.getPrivlastky(randomFinal));
        }

    }
}
