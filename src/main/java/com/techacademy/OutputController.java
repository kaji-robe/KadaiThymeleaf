//リンクURL式
//
//メソッド名: postOutput
//処理内容: 入力画面から入力値を受け取って、出力画面を表示する

package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("valIn") String valIn, Model model) {
        //フォームから送信されてきた値をModelに登録
        model.addAttribute("valIn", valIn);
        //output.htmlに画面遷移
        return "output";
    }




}
