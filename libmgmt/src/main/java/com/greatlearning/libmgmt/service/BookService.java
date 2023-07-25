package com.greatlearning.libmgmt.service;

import java.util.List;

import com.greatlearning.libmgmt.entity.Book;

public interface BookService {
	List<Book> listAll();
	void save(Book book);
	Book findById(int bookId);

}
