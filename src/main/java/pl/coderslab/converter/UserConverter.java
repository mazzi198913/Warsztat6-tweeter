package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

public class UserConverter implements Converter<String, User> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User convert(String s) {
        Long id = Long.parseLong(s);
        User byId = userRepository.findOne(id);
        return byId;
    }
}

