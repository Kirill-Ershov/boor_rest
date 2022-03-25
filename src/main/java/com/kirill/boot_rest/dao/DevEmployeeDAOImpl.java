package com.kirill.boot_rest.dao;

import com.kirill.boot_rest.entity.DevEmployee;
//import org.hibernate.Query;
//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DevEmployeeDAOImpl implements DevEmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<DevEmployee> getAllEmployees() {
        Query query = entityManager.createQuery("from DevEmployee", DevEmployee.class);
        List<DevEmployee> devEmployees = query.getResultList();
        return devEmployees;
    }

    @Override
    public void saveEmployee(DevEmployee devEmployee) {
        DevEmployee devEmployee1 = entityManager.merge(devEmployee);
        devEmployee.setId(devEmployee1.getId());
    }

    @Override
    public DevEmployee getEmployee(int id) {
        DevEmployee devEmployee = entityManager.find(DevEmployee.class, id);
        return devEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from DevEmployee where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
