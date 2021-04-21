package com.odianyun.qrcode.controller;

import com.odianyun.qrcode.model.QrCodePO;
import com.odianyun.qrcode.service.QrCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * IndexController
 *
 * @author luozhuowei
 * @date 2021/4/20
 */
@Controller
public class IndexController {

    @Resource
    private QrCodeService qrCodeService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/generate")
    @ResponseBody
    public QrCodePO generate(@RequestParam String qrCode) {
        QrCodePO qrCodePO = new QrCodePO();
        qrCodePO.setQrcode(qrCode);
        qrCodePO.setIsDeleted(0L);
        qrCodePO.setCreateTime(new Date());
        qrCodeService.saveQrCode(qrCodePO);
        return qrCodePO;
    }

}
