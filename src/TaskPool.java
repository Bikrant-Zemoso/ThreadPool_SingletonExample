import java.util.ArrayList;
import java.util.List;

public class TaskPool {
    private static TaskPool instance;
    private static List<Task> taskList = new ArrayList<>();

    private TaskPool(){};

    public static TaskPool getInstance() {
        if(instance == null){
            instance = new TaskPool();
        }
        for (int i = 0; i < 5; i++) {
            Task task = new Task();
            taskList.add(task);
        }
        return instance;
    }

    public void execute() {
        int index = (int)(Math.random() * taskList.size());
        System.out.println("Executing task is :" + taskList.get(index));
    }
}
