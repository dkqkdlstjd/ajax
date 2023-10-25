package com.example.ajaxEX.controller;

import com.example.ajaxEX.dto.AjaxDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01(){
        System.out.println("AjaxController.ex01");
        //ajax로 호출하게 되면 화면변환으로 넘어가기 보다는 ajax 명령어로 간다.
        return "index";
    }

    @PostMapping("/ex02")
    public @ResponseBody String ex02() {
        System.out.println("AjaxController.ex02");
        return "안녕하세요"; // 리턴값이 그대로 출력됨
    }

    @GetMapping("/ex03")
    public @ResponseBody String ex03(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1="+param1+",param2="+param2);
        return "ex03메서드 호출 완료"; // 리턴값이 그대로 출력됨
    }

    @PostMapping("/ex04")
    public @ResponseBody String ex04(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1="+param1+",param2="+param2);
        return "ex04메서드 호출 완료"; // 리턴값이 그대로 출력됨
    }

    @GetMapping("/ex05")
    public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    @PostMapping("/ex06")
    public @ResponseBody AjaxDTO ex06(@ModelAttribute AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    @PostMapping("/ex07")
    public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    private List<AjaxDTO> DtoList(){
        List<AjaxDTO> dtoList =new ArrayList<>();
        dtoList.add(new AjaxDTO("data1","data11"));
        dtoList.add(new AjaxDTO("data2","data22"));
        return dtoList;
    }
    @PostMapping("/ex08")
    public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDTO> dtoList=DtoList();
        dtoList.add(ajaxDTO);
        return dtoList;
    }


    //ResponseEntity: data 및 코드 같이 가능
    @PostMapping("/ex09")
    public ResponseEntity ex09(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return new ResponseEntity<>(ajaxDTO,HttpStatus.OK);

    }
    //ResponseEntity: data 및 코드 같이 가능
    @PostMapping("/ex10")
    public ResponseEntity ex10(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDTO> dtoList=DtoList();
        dtoList.add(ajaxDTO);
        return new ResponseEntity<>(dtoList,HttpStatus.OK);

    }


}
