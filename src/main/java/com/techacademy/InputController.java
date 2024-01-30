//リンクURL式
//
//メソッド名: getInput
//処理内容: 入力画面の初期表示をする


package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

   @GetMapping("/input")
    public String getInput() {
    //input.htmlに画面遷移
    return "input";
}

   @GetMapping("/input")
    public String getInput(@RequestParam("valIn") String valIn, Model model) {
    // パスパラメータで受け取った値をModelに登録
    model.addAttribute("valIn", valIn);
    // input.htmlに画面遷移
    return "input";
        }
    }

