package com.company;

public class Node {
    private Node parent;
    private Node left_child;
    private Node right_child;
    private double posX;
    //private double posY;
    private double value;

    public Node(double posX, double value){
        this.posX = posX;
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeft_child(Node left_child) {
        this.left_child = left_child;
    }

    public void setRight_child(Node right_child) {
        this.right_child = right_child;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosX() {
        return posX;
    }

    public double getValue() {
        return value;
    }

    public Node getLeft_child() {
        return left_child;
    }

    public Node getRight_child() {
        return right_child;
    }

    public Node getParent() {
        return parent;
    }


}
