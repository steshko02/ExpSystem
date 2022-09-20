package senla.factories;

import senla.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {

    public static List<Question> questions = new ArrayList<>();

    public static Question getSimpleQuestion(String value, Integer priority){
        Question question = new Question(value,priority,false);
        questions.add(question);
        return question;
    }

    public static Question getFinalQuestion(String value, Integer priority){
        Question question = new Question(value,priority,true);
        questions.add(question);
        return question;
    }
}
