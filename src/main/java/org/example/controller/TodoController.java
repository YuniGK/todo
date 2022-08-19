package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin//CROS 해결하는 방법
@AllArgsConstructor
@RestController
/* @Controller에 @ResponseBody가 추가된 기능
RestController의 주 용도는 Json 형태로 객체 데이터를 반환
최근에는 데이터 응답을 제공하는 REST API를 개발할 때 주로 사용하며 객체를 ResponseEntity로 감싸서 반환 */
@RequestMapping("/")//우리가 특정 URL을 보내면 어떠헥 처리할 것인지 정의한다.
public class TodoController {
    private final TodoService service;

    //POST 아이템 추가
    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("Create");

        return null;
    }

    //GET 전체 조회
    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("Read One");

        return null;
    }

    //GET 부분 조회
    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        System.out.println("Read All");

        return null;
    }

    //PATH 수정
    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(){
        System.out.println("Update");

        return null;
    }

    //DELETE 부분 삭제
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(){
        System.out.println("Deltet One");

        return null;
    }

    //DELETE 전체 삭제
    public ResponseEntity<?> deleteAll(){
        System.out.println("Delete All");

        return null;
    }
}
