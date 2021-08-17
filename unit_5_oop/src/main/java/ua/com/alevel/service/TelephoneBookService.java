package ua.com.alevel.service;

import ua.com.alevel.dao.TelephoneBookDao;
import ua.com.alevel.entity.TelephoneBookEntity;

public class TelephoneBookService {

    private TelephoneBookDao dao = new TelephoneBookDao();

    public void create(TelephoneBookEntity telephoneBookEntity) {
        dao.create(telephoneBookEntity);
    }

    public void update(TelephoneBookEntity telephoneBookEntity) {
        dao.update(telephoneBookEntity);
    }

    public void delete(String id) {
        dao.delete(id);
    }

    public TelephoneBookEntity[] findAll() {
        return dao.findAll();
    }

    public TelephoneBookEntity findById(String id) {
        return dao.findById(id);
    }
}
