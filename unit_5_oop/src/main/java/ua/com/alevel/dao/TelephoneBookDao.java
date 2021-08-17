package ua.com.alevel.dao;

import ua.com.alevel.db.TelephoneBookDB;
import ua.com.alevel.entity.TelephoneBookEntity;

public class TelephoneBookDao {

    private TelephoneBookDB db = new TelephoneBookDB();

    public void create(TelephoneBookEntity telephoneBookEntity) {
        db.create(telephoneBookEntity);
    }

    public void update(TelephoneBookEntity telephoneBookEntity) {
        db.update(telephoneBookEntity);
    }

    public void delete(String id) {
        db.delete(id);
    }

    public TelephoneBookEntity[] findAll() {
        return db.findAll();
    }

    public TelephoneBookEntity findById(String id) {
        return db.findById(id);
    }
}
