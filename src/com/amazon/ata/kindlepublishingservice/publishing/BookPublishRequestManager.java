package com.amazon.ata.kindlepublishingservice.publishing;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.LinkedList;
import java.util.Queue;

@Singleton
public class BookPublishRequestManager {
    private final Queue<BookPublishRequest> bookPublishRequests;

    @Inject
    public BookPublishRequestManager(LinkedList<BookPublishRequest> linkedList) {
        this.bookPublishRequests = linkedList;
    }

    public void addBookPublishRequest(BookPublishRequest request) {
        this.bookPublishRequests.offer(request);
    }

    // poll will automatically return null if the queue is empty;
    public BookPublishRequest getBookPublishRequestToProcess() {
        return this.bookPublishRequests.poll();
    }
}
