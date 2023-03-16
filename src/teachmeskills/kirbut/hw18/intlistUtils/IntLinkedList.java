package teachmeskills.kirbut.hw18.intlistUtils;

public class IntLinkedList {
    private IntLinkedNode headNode;

    public IntLinkedList() {
        this.headNode = null;
    }

/*    @Override*/
    public int size() {
        int countOfNode = 0;

        if (headNode == null) {
            return countOfNode;
        }

        IntLinkedNode node = headNode;
        countOfNode++;

        while (node.getNextNode() != null) {
            countOfNode++;
            node = node.getNextNode();
        }

        return countOfNode;
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
