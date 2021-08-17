package ua.com.alevel.db;

import ua.com.alevel.entity.TelephoneBookEntity;

import java.util.Arrays;
import java.util.UUID;

public class TelephoneBookDB {

    private TelephoneBookEntity[] telephoneBookEntities = new TelephoneBookEntity[0];

    public void create(TelephoneBookEntity telephoneBookEntity) {
        telephoneBookEntity.setId(generateId());
        TelephoneBookEntity[] tempArray = new TelephoneBookEntity[telephoneBookEntities.length];
        for (int i = 0; i < telephoneBookEntities.length; i++) {
            tempArray[i] = telephoneBookEntities[i];
        }

        telephoneBookEntities = new TelephoneBookEntity[telephoneBookEntities.length + 1];
        for (int i = 0; i < tempArray.length; i++) {
            telephoneBookEntities[i] = tempArray[i];
        }
        telephoneBookEntities[telephoneBookEntities.length - 1] = telephoneBookEntity;
    }

    public void update(TelephoneBookEntity telephoneBookEntity) {

        TelephoneBookEntity current = Arrays.stream(telephoneBookEntities).filter(u -> u.getId().equals(telephoneBookEntity.getId())).findFirst().get();
        current.setName(telephoneBookEntity.getName());
        current.setTelephoneNumber(telephoneBookEntity.getTelephoneNumber());
    }

    public void delete(String id) {

        if (id != null) {
            int indexOfId = -1;

            for (int i = 0; i < telephoneBookEntities.length; i++) {
                if (telephoneBookEntities[i].getId().equals(id)) {
                    indexOfId = i;
                    break;
                }
            }

        if (indexOfId > -1) {
        TelephoneBookEntity[] newArray = new TelephoneBookEntity[telephoneBookEntities.length - 1];
            for (int i = 0; i < indexOfId; i++) {
                newArray[i] = telephoneBookEntities[i];
            }
            for (int i = indexOfId + 1; i < telephoneBookEntities.length; i++) {
                newArray[i - 1] = telephoneBookEntities[i];
            }
            telephoneBookEntities = newArray;
        }
    }
}

    public TelephoneBookEntity findById(String id) {
        return Arrays.stream(telephoneBookEntities).filter(u -> u.getId().equals(id)).findFirst().get();
    }

    public TelephoneBookEntity[] findAll() {
        return Arrays.copyOf(telephoneBookEntities, telephoneBookEntities.length);
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        if (Arrays.stream(telephoneBookEntities).anyMatch(telephoneBookEntity -> telephoneBookEntity.getId().equals(id))) {
            return generateId();
        }
        return id;
    }
}

