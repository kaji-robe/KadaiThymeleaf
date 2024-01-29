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

    @GetMapping("/{val2}")
    public String getInput(@PathVariable String val2, Model model) {
     // パスパラメータで受け取った値をModelに登録
        model.addAttribute("val2", val2);
     // input.htmlに画面遷移
        return "input";
        }



}


