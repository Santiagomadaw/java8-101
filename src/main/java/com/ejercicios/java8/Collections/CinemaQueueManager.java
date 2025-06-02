package com.ejercicios.java8.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CinemaQueueManager {
    private Queue<Client> queue;

    public CinemaQueueManager() {
        this.queue = new LinkedList<>();
    }

    public void addClient(Client client) {
        queue.add(client);
    }

    public Client serveNextClient() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getQueueSize() {
        return queue.size();
    }

    public Client peekNextClient() {
        return queue.peek();
    }

    public void clearQueue() {
        queue.clear();
    }

    public List<Client> getClientsInQueue() {
        return new ArrayList<>(queue);
    }

}
