package org.launchcode;
import java.util.List;

public class CheckBoxQuestion extends Question{

    private List<String> option;

    public CheckBoxQuestion(String questionText, List <String> options, List <String> answer) {
        super(questionText, answer);
        this.options = options;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public void displayOptions() {

    }
}
