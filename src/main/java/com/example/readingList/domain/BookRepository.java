package com.example.readingList.domain;

import com.example.readingList.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
