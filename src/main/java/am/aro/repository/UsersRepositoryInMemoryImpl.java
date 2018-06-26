package am.aro.repository;

import am.aro.fake.FakeStorage;
import am.aro.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    public UsersRepositoryInMemoryImpl() {

    }

    public  List<User> findAll(){
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for(User user:FakeStorage.storage().users()){
            if(user.getName().equals(name)&& user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}