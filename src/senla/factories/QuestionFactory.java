package senla.factories;

import senla.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {

    public static List<Question> questions = new ArrayList<>();

    public static Question getSimpleQuestion(String value){
        Question question = new Question(value,null,false);
        questions.add(question);
        return question;
    }
    public static Question getSimpleQuestion(String value, int generalization){
        Question question = getSimpleQuestion(value);
        question.setGeneralization(generalization);
        return question;
    }
    public static Question getFinalQuestion(String value){
        Question question = new Question(value,null,true);
        questions.add(question);
        return question;
    }
}
