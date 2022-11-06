package pro.sky.java.ds_3_0.task2_2;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class QueueStore {

    private static final List<String> NANES = List.of(
            "Петр Яшин",
            "Илья Петров",
            "Николай Сергеев",
            "Олег Трофимов",
            "Дарья Симонова",
            "Иван Строганов",
            "Мария Николаева",
            "Елена Агутина",
            "Сергей Долгов",
            "Алена Сенина"
    );

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();

        randomFilling(queue1);
        randomFilling(queue2);

        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        addBuyer("Семен Добавкин", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        removeBuyer(queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
    }

    private static void addBuyer(String name, Queue<String> queue1, Queue<String> queue2) {

        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Очередь 1 и очередь 2 заполнены, нужно позвать Галю");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void removeBuyer(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    public static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NANES.get(RANDOM.nextInt(NANES.size())));
        }
    }
}
