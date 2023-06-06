package com.mtopgul.springmongodbdoc.bootstrap;

import com.mtopgul.springmongodbdoc.model.UserModel;
import com.mtopgul.springmongodbdoc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 16:08
 */
//@Configuration
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) {
        for (int i = 1; i <= 3; i++) {
            UserModel userModel = new UserModel();
            userModel.setFirstName("Muhammed-" + i);
            userModel.setLastName("Topgul-" + i);
            userModel.setEmail("mymail@mail.com-" + i);
            userModel.setPrice(i * 1.1);
            userRepository.saveData(userModel);
        }
    }
}
