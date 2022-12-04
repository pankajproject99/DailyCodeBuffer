package com.example.user.service;

import com.example.user.VO.Department;
import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.User;
import com.example.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepo.save(user);
    }


    public ResponseTemplateVO findUser(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepo.findByUserId(userId);

        Department department = restTemplate.
                getForObject("http://localhost:9001/departments/" + user.getDepartmentId(),
                        Department.class);

        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
