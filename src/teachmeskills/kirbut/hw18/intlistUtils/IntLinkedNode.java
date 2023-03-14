package teachmeskills.kirbut.hw18.intlistUtils;

public class IntLinkedNode {
    private int element;
    private IntLinkedNode nextNode;

    public IntLinkedNode(int element) {
        this.element = element;
    }

    public IntLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "[" + element + "] --> ";
    }
}
