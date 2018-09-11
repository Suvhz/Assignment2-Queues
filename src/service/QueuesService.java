package service;

import java.util.LinkedList;

public interface QueuesService {
	public boolean offer(String params);
	public String poll();
	public String peek();
	public LinkedList<String> getAll();
	public boolean remove(String params);
}
