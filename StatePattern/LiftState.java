
public abstract class LiftState {
	protected Context  context;
	
	public void setContext(Context ctx) {
		context = ctx;
	}
		
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
}
