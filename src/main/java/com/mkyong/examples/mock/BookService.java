package com.mkyong.examples.mock;

import java.util.List;

public interface BookService {
    List<Book> findBookByAuthor(String author);
}
