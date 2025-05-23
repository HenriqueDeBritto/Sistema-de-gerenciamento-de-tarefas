package br.com.henriqueprado.todolist.repository;

import br.com.henriqueprado.todolist.entiny.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
