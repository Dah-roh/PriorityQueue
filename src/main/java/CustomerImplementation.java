import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public interface CustomerImplementation {

    void addToQueue(Customer customer, CustomerDTO customerDTO);

    void buyProduct(Queue<Customer> customerQueue,
                    Map<String, PriorityQueue<CustomerDTO>> priorityQueueMap1);
}
