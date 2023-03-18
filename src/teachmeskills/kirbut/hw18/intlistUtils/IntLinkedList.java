package teachmeskills.kirbut.hw18.intlistUtils;

public class IntLinkedList {
    private class IntLinkedNode {
        private int element;
        private IntLinkedNode nextNode;

        public IntLinkedNode(int element, IntLinkedNode nextNode) {
            this.element = element;
            this.nextNode = nextNode;
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
            return "[" + element + "]";
        }
    }

    private IntLinkedNode headNode;

    public IntLinkedList() {
        this.headNode = null;
    }

/*    @Override*/
    public int size() {
        int countOfNode = 0;

        IntLinkedNode node = headNode;

        while (node != null) {
            countOfNode++;
            node = node.getNextNode();
        }

        return countOfNode;
    }

    /*@Override*/
    public int get(int index) {
        if (index < 0)
            throw new IllegalArgumentException("You entered a negative index!");

        int numberOfElement = 0;
        IntLinkedNode node = headNode;

        while (node != null) {
            if (numberOfElement == index)
                return node.getElement();

            node = node.getNextNode();
            numberOfElement++;
        }

        throw new IllegalArgumentException("This index doesn't exist.");
    }

/*    @Override*/
    public void add(int element) {
        if (headNode == null) {
            headNode = new IntLinkedNode(element, null);
            return;
        }

        IntLinkedNode node = headNode;

        while (node.getNextNode() != null)
            node = node.getNextNode();

        node.setNextNode(new IntLinkedNode(element, null));
    }

    /*@Override*/
    public int lastIndexOf(int element) {

        IntLinkedNode node = headNode;
        int index = -1;
        int counter = 0;

        while (node != null) {
            if (node.getElement() == element) {
                index = counter;
            }

            node = node.getNextNode();
            counter++;
        }

        return index;
    }
}
