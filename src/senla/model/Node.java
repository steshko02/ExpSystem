package senla.model;

public  class Node<T>{
     Integer value; // ключ узла
     Node left; // Левый узел потомок
     Node right; // Правый узел потомок
    public Node(Integer value) {
        this.value = value;
    }

    public Node() {

    }

    public void printNode() { // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение :" + value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(final int value) {
        this.value = value;
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

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + left +
                ", rightChild=" + right +
                '}';
    }
}

