
public class OpeningState extends LiftState {
	@Override
	public void open() {
		System.out.println("lift open!!!!");
	}
	
	@Override
	public void stop() {
		super.context.setState(super.context.stopState);
		super.context.getState().stop();
	}
	
	@Override
	public void run() {
		
		
	}
	
	@Override
	public void close() {
		super.context.setState(super.context.closeState);
		super.context.getState().close();
	}
}
