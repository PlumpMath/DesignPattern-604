
public class StopState extends LiftState{
	@Override
	public void open() {
		super.context.setState(super.context.OpenState);
		super.context.getState().open();	
	}
	
	@Override
	public void stop() {
		System.out.println("lift stop!!!!");
	}
	
	@Override
	public void run() {
		super.context.setState(super.context.runState);
		super.context.getState().run();
	}
	
	@Override
	public void close() {
		super.context.setState(super.context.closeState);
		super.context.getState().close();			
		
	}
}
