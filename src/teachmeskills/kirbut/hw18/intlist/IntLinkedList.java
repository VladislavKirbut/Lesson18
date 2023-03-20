package teachmeskills.kirbut.hw18.intlist;

public class IntLinkedList implements IntList {
    private static class IntLinkedNode {
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

    private IntLinkedNode getNode(int index) {
        if (index < 0)
            throw new IllegalArgumentException("You entered a negative index!");

        int counter = 0;
        IntLinkedNode node = headNode;

        while (node != null) {
            if (counter == index)
                return node;

            node = node.getNextNode();
            counter++;
        }

        throw new IllegalArgumentException("This index doesn't exist.");
    }

    @Override
    public int get(int index) {
        IntLinkedNode node = getNode(index);
        return node.getElement();
    }

    @Override
    public int set(int index, int element) {
        IntLinkedNode node = getNode(index);
        int previousElement = node.getElement();
        node.setElement(element);

        return previousElement;
    }

    @Override
    public int size() {
        int countOfNode = 0;

        IntLinkedNode node = headNode;

        while (node != null) {
            countOfNode++;
            node = node.getNextNode();
        }

        return countOfNode;
    }

    @Override
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

    @Override
    public int remove(int index) {
        if (headNode == null) throw new IllegalArgumentException("This list is empty.");

        int removedElement;

        if (index == 0) {
            removedElement = headNode.getElement();
            headNode = headNode.getNextNode();
        } else {
            IntLinkedNode previousNode = getNode(index - 1);
            IntLinkedNode node = previousNode.getNextNode();

            if (node == null)
                throw new IllegalArgumentException("This index doesn't exist.");

            removedElement = node.getElement();
            previousNode.setNextNode(node.getNextNode());
        }

        return removedElement;
    }

    @Override
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
    @Override
    public String toString() {
        StringBuilder elementsString = new StringBuilder();

        IntLinkedNode node = headNode;

        while (true) {
            if (node == null) {
                break;
            } else if (node.getNextNode() != null) {
                elementsString.append(node).append("-->");
            } else {
                elementsString.append(node);
            }
            node = node.getNextNode();
        }

        return elementsString.toString();
    }
}
