package dsd_manual;

class Node { //Класс - структура элемента списка
    public int value;
    public Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class DSD_manual{ //главный класс
    public static void main(String[]args){
        //создание несвязанных узлов (конструктор)
        Node node0 = new Node(0, null); //голова списка
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        // связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //вывод списка
        Node ref = node0;
        while (ref != null){
            System.out.print("" + ref.value);
            ref = ref.next;
        }
    }
}