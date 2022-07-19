import java.util.*;

public class CustomerServiceImplementation implements CustomerImplementation{
    private PriorityQueue<CustomerDTO> customerPreferenceQueue = new PriorityQueue<>(5, new CustomerDTO());
    private Map<String, PriorityQueue<CustomerDTO>> priorityQueueMap = new HashMap<>();
    private  Queue<Customer> fifo = new PriorityQueue<>();

    public PriorityQueue<CustomerDTO> getCustomerPreferenceQueue() {
        return customerPreferenceQueue;
    }

    public void setCustomerPreferenceQueue(PriorityQueue<CustomerDTO> customerPreferenceQueue) {
        this.customerPreferenceQueue = customerPreferenceQueue;
    }

    public Map<String, PriorityQueue<CustomerDTO>> getPriorityQueueMap() {
        return priorityQueueMap;
    }

    public void setPriorityQueueMap(Map<String, PriorityQueue<CustomerDTO>> priorityQueueMap) {
        this.priorityQueueMap = priorityQueueMap;
    }

    public Queue<Customer> getFifo() {
        return fifo;
    }

    public void setFifo(Queue<Customer> fifo) {
        this.fifo = fifo;
    }

    @Override
    public void addToQueue(Customer customer, CustomerDTO customerDTO){
        fifo.add(customer);
        customer.getCart().forEach(product -> {
            customerDTO.setQuantity(product.getQuantity());
            if(priorityQueueMap.containsKey(product.getName())){
                priorityQueueMap.get(product.getName()).add(customerDTO);
            }
            customerPreferenceQueue.add(customerDTO);
            priorityQueueMap.put(product.getName(), customerPreferenceQueue);
        });
        System.out.println("You have added "+ customer.getName()+" to the FIFO QUEUE ");
    }

    @Override
    public void buyProduct(Queue<Customer> fifo,
                           Map<String, PriorityQueue<CustomerDTO>> priorityQueueMap) {
                //we peeking through the queue without removing to know who the first person is...

                assert fifo.peek() != null;
                fifo.peek().getCart().forEach(product1 -> {
                CustomerDTO removedCustomer;
                //if the priorityQueue is not empty continue to perform the next comment..
                // for each product in the person's cart get the MappedQueue and sell the product...
                while(priorityQueueMap.get(product1.getName()).poll()!=null) {
                //print out the customers removed and their product name...
                        removedCustomer = priorityQueueMap.get(product1.getName()).poll();
                        System.out.println("You have attended to " + removedCustomer
                                .getName() + "from the " + product1.getName() + " queue");
            }
        });
    }
}
