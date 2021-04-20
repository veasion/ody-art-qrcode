package com.odianyun.qrcode.service;

import com.odianyun.qrcode.mapper.QrCodeMapper;
import com.odianyun.qrcode.model.QrCodePO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * QrCodeServiceImpl
 *
 * @author luozhuowei
 * @date 2021/4/20
 */
@Service
public class QrCodeServiceImpl implements QrCodeService {

    @Resource
    private QrCodeMapper qrCodeMapper;

    @Override
    public void saveQrCode(QrCodePO qrCodePO) {
        qrCodeMapper.insert(qrCodePO);
    }
}
