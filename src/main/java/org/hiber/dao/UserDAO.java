package org.hiber.dao;

import org.hiber.entity.UserDataEntity;

import java.util.List;

public class UserDAO implements CommonDAO<UserDataEntity> {
    @Override
    public List<UserDataEntity> findAll() {
        return null;
    }

    @Override
    public List<UserDataEntity> findAll(String email) {
        return null;
    }

    @Override
    public UserDataEntity get(long id) {
        return null;
    }

    @Override
    public void update(UserDataEntity olj) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void add(UserDataEntity obj) {

    }
}
