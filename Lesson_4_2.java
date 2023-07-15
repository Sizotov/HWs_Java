
/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Lesson_4_2 {
    public static void main(String[] args) {
            MyLinkedList list = new MyLinkedList();
            list.enqueue("4");
            list.enqueue("6");
            System.out.println(list.size);
            list.enqueue("3");
            list.enqueue("9");
            System.out.println(list.size);
            System.out.println(list.first());
            /*System.out.println(list.dequeue());
            */
        }
    }
