package com.odianyun.qrcode.controller;

import com.odianyun.qrcode.model.QrCodePO;
import com.odianyun.qrcode.service.QrCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/generate")
    @ResponseBody
    public QrCodePO generate(@RequestParam String qrCode, HttpServletRequest request) {
        QrCodePO qrCodePO = new QrCodePO();
        qrCodePO.setQrcode(qrCode);
        qrCodePO.setIsDeleted(0L);
        qrCodePO.setCreateTime(new Date());
        qrCodePO.setIp(getIpAddress(request));
        qrCodeService.saveQrCode(qrCodePO);
        return qrCodePO;
    }

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip == null || ip.length() == 0) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
