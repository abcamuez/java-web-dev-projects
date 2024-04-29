package org.launchcode;

public class MultipleChoiceQuestion {
    private List<String> options;

    public MultipleChoiceQuestion(String questionText, List<String> options, Object answer){
        super(questionText, answer)
        this.optiions = options;
    }
}
