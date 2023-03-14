package teachmeskills.kirbut.hw18.intlistUtils;

public class IntLinkedList {
    private IntLinkedNode headNode;

    public IntLinkedList() {
        this.headNode = null;
    }

    public void add(int element) {
        if (headNode == null) {
            headNode = new IntLinkedNode(element);
            return;
        }

        IntLinkedNode node = headNode;

        while (node.getNextNode() != null)
            node = node.getNextNode();

        node.setNextNode(new IntLinkedNode(element));
    }

    @Override
    public String toString() {
        return "" + headNode;
    }
}
