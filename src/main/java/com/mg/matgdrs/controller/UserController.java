package com.mg.matgdrs.controller;

import com.mg.matgdrs.dto.UserDTO;
import com.mg.matgdrs.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService pUserService) {
        userService = pUserService;
    }

    @GetMapping
    public List<UserDTO> getAll() { return userService.getAll(); }

    @GetMapping("/{id}")
    public UserDTO get(@PathVariable("id") String id) { return userService.get(id); }

    @PostMapping
    public UserDTO create(@RequestBody UserDTO userDTO) { return userService.create(userDTO); }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO userDTO)  { return userService.update(userDTO); }

    @DeleteMapping("/{id}")
    public long delete(@PathVariable("id") String id)  {
        return userService.delete(id);
    }
}