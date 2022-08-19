package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.service.TodoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin//CROS 해결하는 방법
@AllArgsConstructor
@RestController
/* @Controller에 @ResponseBody가 추가된 기능
RestController의 주 용도는 Json 형태로 객체 데이터를 반환
최근에는 데이터 응답을 제공하는 REST API를 개발할 때 주로 사용하며 객체를 ResponseEntity로 감싸서 반환 */
@RequestMapping("/")//우리가 특정 URL을 보내면 어떠헥 처리할 것인지 정의한다.
public class TodoController {
    private final TodoService service;
}
