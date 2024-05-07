
public class MyLinkedListLoopTest {
    public static void main(String[] args) {
        MyLinkedListLoop lists = new MyLinkedListLoop();
        lists.pushToHead(5);
        lists.pushToHead(10);
        lists.pushToHead(3);
        lists.pushToHead(8);
        lists.pushToHead(7);
        lists.pushToHead(9);
    
       lists.print();
    
       // Зацикливаем список (соединяем хвост с нодой со значением 3)
       NodeTreeHw end = lists.head;
       NodeTreeHw cycle = null;
       while(end.getNext() != null) {
            if(end.getData()==3) cycle = end;
            end = end.getNext();
       }
       end.setNext(cycle);
    
       System.out.println("Queue = "+lists.detectLoop());
       System.out.println("Алгоритм Флойда = "+lists.detectLoop2());
    }
}
