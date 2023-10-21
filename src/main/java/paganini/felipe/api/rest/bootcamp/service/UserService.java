package paganini.felipe.api.rest.bootcamp.service;

import paganini.felipe.api.rest.bootcamp.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
