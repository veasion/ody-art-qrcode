package com.odianyun.qrcode.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.odianyun.qrcode.model.QrCodePO;
import java.util.List;

@Mapper
public interface QrCodeMapper {

    /**
     * 新增
     */
    int insert(QrCodePO obj);

    /**
     * 批量新增
     */
    int insertAll(List<QrCodePO> list);

    /**
     * 修改不为空字段
     */
    int update(QrCodePO obj);

    /**
     * 修改全部字段
     */
    int updateAll(QrCodePO obj);

    /**
     * 删除
     */
    int deleteById(Long id);

    /**
     * 根据id查询
     */
    QrCodePO queryById(Long id);

    /**
     * 查询list
     */
    List<QrCodePO> queryList();

}
