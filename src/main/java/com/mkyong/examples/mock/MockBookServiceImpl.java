package com.mkyong.examples.mock;

import java.util.List;
import java.util.ArrayList;

public class MockBookServiceImpl implements BookService {

    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> books = new ArrayList<>();

        if ("mkyong".equals(author)) {
            books.add(new Book("mkyong in action"));
            books.add(new Book("abc in action"));
            books.add(new Book("bot"));
        }

        return books;
    }

    //implements other methods...


}
