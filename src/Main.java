public class Main {
    public static void main(String[] args) {
        TaskPool obj = TaskPool.getInstance();
        obj.execute();

        TaskPool obj2 = TaskPool.getInstance();
        obj2.execute();
    }
}