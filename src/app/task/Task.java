package app.task;

/**
 * Class for implementing a task. This task is used by task manager to execute tasks.
 */
public abstract class Task {
	
	public abstract boolean canDo();
	public abstract void action();
	public abstract void undo();
	public abstract void redo();
}
