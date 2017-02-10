package online.zhaopei.myproject.controller;

import java.util.List;

import online.zhaopei.myproject.domain.City;
import online.zhaopei.myproject.domain.UserTest;
import online.zhaopei.myproject.service.CityService;
import online.zhaopei.myproject.service.UserTestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@Autowired
	private UserTestService userService;

	@RequestMapping("/city/getCity")
	public List<City> getCity() {
		PageHelper.startPage(1, 3);
		return this.cityService.findByState("CA");
	}

	@RequestMapping("/user/getUsers")
	public List<UserTest> getAllUsers() {
		PageHelper.startPage(1, 3);
		return this.userService.getAllUsers();
	}
}
