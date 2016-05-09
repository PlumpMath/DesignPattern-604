
public class ClosingState extends LiftState {
	@Override
	public void open() {
		super.context.setState(super.context.OpenState);
		super.context.getState().open();	
	}
	
	@Override
	public void stop() {
		super.context.setState(super.context.stopState);
		super.context.getState().stop();
	}
	
	@Override
	public void run() {
		super.context.setState(super.context.runState);
		super.context.getState().run();
	}
	
	@Override
	public void close() {
		System.out.println("lift close!!!!");
		
	}
}
