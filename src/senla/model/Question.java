package senla.model;

import java.util.Objects;

public class Question extends Node{

    private  String context;

    private  Integer generalization;

    private  Boolean lastQuestion;

    public Question() {

    }

    public Integer getGeneralizationForLeftObj(){
        int next = (int) (generalization*0.5+generalization/100*5);
        return next;
    }
    public Integer getGeneralizationForRightObj(){
        int next = (int) (generalization*1.5-generalization/100*5);
        return next;
    }
    public Boolean getLastQuestion() {
        return lastQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(context, question.context) && Objects.equals(generalization, question.generalization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, generalization);
    }

    public void setLastQuestion(Boolean lastQuestion) {
        this.lastQuestion = lastQuestion;
    }

    public Question(String context, Integer generalization, Boolean lastQuestion) {
        super(generalization);
        this.context = context;
        this.generalization = generalization;
        this.lastQuestion = lastQuestion;
    }
    public String getContext() {
        return context;
    }

    public Integer getGeneralization() {
        return generalization;
    }

    public void setGeneralization(Integer generalization) {
        this.setValue(generalization);
        this.generalization = generalization;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getValue() {
        return this.generalization;
    }

    public void setValue(final int value) {
        super.setValue(value);
        this.generalization = value;
    }
    public Node getLeft() {
        return this.left;
    }

    public void setLeft(final Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(final Node right) {
        this.right = right;
    }

    public Question createLeftNode(Node node){
        node.setValue(getGeneralizationForLeftObj());
        this.setLeft(node);
        return  this;
    }
    public Question createRightNode(Node node){
        node.setValue(getGeneralizationForRightObj());
        this.setRight(node);
        return  this;
    }

}
