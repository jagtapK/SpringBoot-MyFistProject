package com.spring.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Hii")
public class MyController {

    @GetMapping("/getName")
    public ResponseEntity<List<String>> getName()
    {
        String name = "John";
        String name1 = "Alice";
        String name2 = "Shailaja";
        String name3 = "Riya";
        String name4 = "Sham";
        String name5 = "Siya";

        List<String> nameList = Arrays.asList(name, name1, name2, name3, name4, name5);

        //Names starts with 'S' using StreamAPI(Lambda)
        List<String> names = nameList.stream().filter(a -> a.startsWith("S")).toList();

        //Print all names in UpperCase
        List<String> n = nameList.stream().map(String::toUpperCase).toList();

        return new ResponseEntity<>(n , HttpStatus.OK);

    }
    @GetMapping("/getNumbers")
    public ResponseEntity<List<Integer>> getNumbers(){

        int num1 = 10;
        int num2 = 20;
        int num3 = 32;
        int num4 = 23;
        int num5 = 3;
        List<Integer> num = Arrays.asList(num1, num2, num3, num4, num5);

        //Print Odd Numbers
        List<Integer> number = num.stream().filter(n -> n%2 == 1).toList();

        // Print Numbers > 20
        List<Integer> n = num.stream().filter(r -> r > 20).toList();

        //Square All Numbers
        List<Integer> list = num.stream().map(k -> k * k).toList();

        return new ResponseEntity<>(list, HttpStatus.OK);

    }

    @GetMapping("/getChar")
    public ResponseEntity<List<Character>> getChar()
    {
        List<Character> chars = Arrays.asList('K','A','J','A','L');

        return new ResponseEntity<>(chars, HttpStatus.OK);

    }

}
