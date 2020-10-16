package com.chixing.service;

import com.chixing.mapper.RegisterMapper;
import com.chixing.pojo.Register;
import com.guanweiming.common.utils.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class RegisterService {
    private RegisterMapper registerMapper;
    public Result<Register> addUser(String tel, String password) {
        Register record = new Register();
        record.setTel(tel);
//        List<Register> list = registerMapper.selectByExample(tel,password);
//        if (!CollectionUtils.isEmpty(list)) {
//            return Result.createByErrorMessage("用户已经存在，无法添加");
//        }
        record.setPassword(password);

        int resultCount = registerMapper.insertSelective(record);
        return resultCount == 0 ? Result.createByErrorMessage("添加失败") : Result.createBySuccess(record);
        }
}
