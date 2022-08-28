package command;

import tasklist.TaskList;
import utility.Storage;
import utility.Ui;

public class ListCommand extends Command {
    public ListCommand() {
        super("list");
    }


    public void execute(TaskList tasks, Ui ui, Storage storage) {
        String listOfTasks = tasks.listTask();
        ui.list(listOfTasks);
    }
}