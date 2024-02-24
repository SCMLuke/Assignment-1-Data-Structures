public class DataStructure {

    private Node head;

    public DataStructure() {
        this.head = head;
    }

    // Add a new value to the end of the list.
    public void append(int newValue) {
        Node node = new Node(newValue);
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = node;
    }

    // Add a new value to the beginning of the list.
    public void prepend(int newValue) {
        Node node = new Node(newValue);
        node.nextNode = head;
        head = node;
    }

    // Get the size of the list.
    public int size() {
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.nextNode;
        }
        return size;
    }

    // Get the value at the beginning of the list.
    public Node getHead() {
        return head;
    }

    // Get the value at the end of the list.
    public Node getTail() {
        Node currentNode = head;
        while (currentNode != null && currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    // Returns the Node at the given index.
    public Node at(int index) {
        if (index < 0) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode == null) {
                return null;
            }
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    // Remove the last element from the list.
    public int pop() {
        if (head == null) {
            return -1;
        }
        if (head.nextNode == null) {
            int value = head.value;
            head = null;
            return value;
        }
        Node currentNode = head;
        while (currentNode.nextNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        int value = currentNode.nextNode.value;
        currentNode.nextNode = null;
        return value;
    }

    // Check if passed in value is on the list.
    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    // Find the current value in the list.
    public Integer find(int searchValue) {
        int index = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == searchValue) {
                return index;
            }
            currentNode = currentNode.nextNode;
            index++;
        }
        return null;
    }
}
