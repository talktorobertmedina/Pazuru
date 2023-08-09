package app.task;

/**
 * Class for implementing a task. This task is used by task manager to execute tasks.
 */
public interface Taskable {
	public boolean canDo();
	public void action();
	public void undo();
	public void redo();
	public float notifyProgress();
}
