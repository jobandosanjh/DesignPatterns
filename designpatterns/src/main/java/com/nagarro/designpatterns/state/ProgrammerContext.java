package com.nagarro.designpatterns.state;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class ProgrammerContext {

	private State state;

	public ProgrammerContext(final State state) {
		this.state = state;
	}

	public void program() {
		state.program();
	}

	public void setState(final State state) {
		this.state = state;
	}

	public State getState() {
		return this.state;
	}

	public static void main(final String[] args) {
		final ProgrammerContext context = new ProgrammerContext(
				new ActiveState());
		final Map<Integer, State> map = new HashMap<>();
		map.put(0, new ActiveState());
		map.put(1, new LazyState());
		map.put(2, new SleepingState());
		map.put(3, new StressState());
		final Random random = new Random();
		context.setState(map.get(random.nextInt(4) + 0));
		context.program();
	}

}
