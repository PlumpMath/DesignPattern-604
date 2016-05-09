
public class Context {
	public final static OpeningState OpenState = new OpeningState();
	public final static RunState runState = new RunState();
	public final static StopState stopState = new StopState();
	public final static ClosingState closeState = new ClosingState();
	private LiftState liftState;
	
	public void setState(LiftState state) {
		this.liftState = state;
		this.liftState.setContext(this);
	}
	
	public LiftState getState() {
		return this.liftState;
	}
	
	
	public void open() {
		this.liftState.open();
	}
	
	public void close() {
		this.liftState.close();
	}
	
	public void stop() {
		this.liftState.stop();
	}
	
	public void run() {
		this.liftState.run();
	}
}
