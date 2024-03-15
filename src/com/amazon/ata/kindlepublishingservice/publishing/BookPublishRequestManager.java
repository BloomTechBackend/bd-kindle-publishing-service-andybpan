package com.amazon.ata.kindlepublishingservice.publishing;

import dagger.Module;

import java.util.LinkedList;
import java.util.Queue;

public class BookPublishRequestManager {
    private final Queue<BookPublishRequest> bookPublishRequests;

    public BookPublishRequestManager() {
        this.bookPublishRequests = new LinkedList<>();
    }

    public void addBookPublishRequestToProcess(BookPublishRequest request) {
        this.bookPublishRequests.offer(request);
    }

    // poll will automatically return null if the queue is empty;
    public BookPublishRequest getBookPublishRequest(BookPublishRequest request) {
        return this.bookPublishRequests.poll();
    }
}
