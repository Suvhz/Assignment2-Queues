package serviceImpl;

import java.util.LinkedList;
import service.QueuesService;

public class QueuesServiceImpl implements QueuesService{
	LinkedList<String> queues = new LinkedList<>();
	@Override
	public boolean offer(String params) {
			
		return queues.offer(params);
	}

	@Override
	public String poll() {
		return queues.poll();
	}

	@Override
	public String peek() {
		return queues.peek();
	}

	@Override
	public LinkedList<String> getAll() {
		if(!queues.isEmpty()) {
			return queues;
		}
		return null;
	}

	@Override
	public boolean remove(String params) {
		return queues.remove(params);
		
	}
	

}
