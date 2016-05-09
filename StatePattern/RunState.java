
public class RunState extends LiftState {
	@Override
	public void open() {
		
	}
	
	@Override
	public void stop() {
		super.context.setState(super.context.stopState);
		super.context.getState().stop();
	}
	
	@Override
	public void run() {
		System.out.println("lift running!!!!");
		
	}
	
	@Override
	public void close() {
		
		
	}
}
