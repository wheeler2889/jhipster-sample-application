package com.mycompany.myapp.repository;

import com.mycompany.myapp.model.TodoList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository
  extends PagingAndSortingRepository<TodoList, Long> {}
