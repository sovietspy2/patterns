package creational.prototype;

import java.math.BigDecimal;

public class Tree {

    public Tree(Tree tree) {
        this.x = tree.x;
        this.y = tree.y;
        this.name = tree.name;
        this.style = tree.style;
        this.rotation = tree.rotation;
        this.costInUSD = tree.costInUSD;
    }
    public Tree(int x, int y, String name, String style, int rotation, BigDecimal costInUSD) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.style = style;
        this.rotation = rotation;
        this.costInUSD = costInUSD;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public BigDecimal getCostInUSD() {
        return costInUSD;
    }

    public void setCostInUSD(BigDecimal costInUSD) {
        this.costInUSD = costInUSD;
    }

    private int x;
    private int y;
    private String name;
    private String style;
    private int rotation;
    private BigDecimal costInUSD;

    public Tree clone(int x, int y) {
        var newTree = new Tree(this);
        newTree.x = x;
        newTree.y = y;
        return newTree;
    }
}
