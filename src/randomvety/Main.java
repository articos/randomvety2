package randomvety;

import dto.Sentences;
import util.SentencesUtil;
import util.SentencesUtilImpl;

public class Main {

    public static void main(String[] args) {

        SentencesUtilImpl sentencesUtil = new SentencesUtilImpl();

        Sentences sentences = new Sentences();

        sentencesUtil.generateSentence(sentences, 5);


    }
}
