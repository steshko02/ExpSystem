package senla;

import senla.factories.QuestionFactory;
import senla.model.BinaryTreeV2;
import senla.model.Node;
import senla.model.Question;

import java.util.*;

import static senla.factories.QuestionFactory.questions;


public class Main {


    public static void main(String[] args) {

        Question question1 = QuestionFactory.getSimpleQuestion("это живое?",200);
        Question question3 = QuestionFactory.getSimpleQuestion("это растение?",100);
        Question question2 = QuestionFactory.getSimpleQuestion("это чел?",300);

        Question question5 = QuestionFactory.getSimpleQuestion("это дерево?", 140);
        Question question4 = QuestionFactory.getSimpleQuestion("это цветок?",120);


        Question question7 = QuestionFactory.getSimpleQuestion("это девушка?", 350);

        Question question6 = QuestionFactory.getSimpleQuestion("это животное?", 250);

        Question question9 = QuestionFactory.getSimpleQuestion("это насекомое?", 220);
        Question question8 = QuestionFactory.getSimpleQuestion("это птица?", 270);
        Question question10 = QuestionFactory.getFinalQuestion("это голубь?", 285);
        Question question11 = QuestionFactory.getSimpleQuestion("оно маленькое?", 210);



        BinaryTreeV2 binaryTree = new BinaryTreeV2();
        question1.createLeftNode(question3).createRightNode(question2);
        question3.createLeftNode(question5).createRightNode(question4);
//        question2.createLeftNode()
        binaryTree.insertNode(question1);
//придумать алгоритм генерации нормального приоритета


//        binaryTree.insertNode(question1);
//        binaryTree.insertNode(question2);
//        binaryTree.insertNode(question3);
//        binaryTree.insertNode(question5);
//        binaryTree.insertNode(question4);
//        binaryTree.insertNode(question6);
//        binaryTree.insertNode(question7);
//        binaryTree.insertNode(question8);
//        binaryTree.insertNode(question9);
//        binaryTree.insertNode(question10);
//        binaryTree.insertNode(question11);

        binaryTree.printTree();


        int i = 0;

        int YN;

        Question node = null;

        Scanner in = new Scanner(System.in);
        while (true){

            if(i==0) {
                node = (Question) binaryTree.getRootNode();
            }

            Node finalNode = node;
            System.out.println(questions.stream().filter(x->(x.getGeneralization()== finalNode.getValue())).findFirst().get().getContext());

            System.out.println("ДА(1) или НЕТ(0)?");

            YN = in.nextInt();
            if(YN==0){
                node= (Question) node.getLeft();
            }else {
                node= (Question) node.getRight();
            }

            if(questions.stream().filter(x->(x.getGeneralization()== finalNode.getValue())).findFirst().get().getLastQuestion()==true){
                System.out.println("The end!!!");
                break;
            }

            i++;
        }
    }
}
