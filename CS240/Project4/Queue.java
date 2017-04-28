///////////////////////////////////////////////////////////////////////////////
public interface Queue<T>
{
	public boolean enqueue(T anEntry);
	public T dequeue();
	public boolean isEmpty();
}
///////////////////////////////////////////////////////////////////////////////