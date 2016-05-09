public class StatePattern {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context iCtx = new Context();
		iCtx.setState(Context.closeState);
		iCtx.open();
		iCtx.close();
		iCtx.run();
		iCtx.stop();
	}
}
