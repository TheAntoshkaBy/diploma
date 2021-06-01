package com.epam.validator;

import com.epam.dao.BookDAO;
import com.epam.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookValidator {

    @Autowired
    private BookDAO bookDAO;

    public boolean isExist(long bookId) {
        Book book = bookDAO.getBookByIdWithoutException(bookId);
        if (book == null) {
            return false;
        } else {
            return true;
        }
    }

}
