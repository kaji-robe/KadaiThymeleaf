//リンクURL式
//
//メソッド名: postOutput
//処理内容: 入力画面から入力値を受け取って、出力画面を表示する

package com.techacademy;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class OutputController {


    @GetMapping("/input")
    public String getInput() {
        //input.htmlに画面遷移
        return "input";
    }


    @PostMapping("/confirm")
    public String postOutput(@RequestParam("val") String val, Model model) {
        //フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        //output.htmlに画面遷移
        return "confirm";
    }


}
