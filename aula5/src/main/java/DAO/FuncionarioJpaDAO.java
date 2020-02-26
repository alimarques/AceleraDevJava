package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.Funcionario;

public class FuncionarioJpaDAO {

    private static FuncionarioJpaDAO instance;
    protected EntityManager entityManager;

    public static FuncionarioJpaDAO getInstance(){
        if(instance == null) {
            instance = new FuncionarioJpaDAO();
        }
        return instance;
    }

    private FuncionarioJpaDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Sales");
        if(entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }


    public Funcionario getByMatricula(final int matricula) {
        return entityManager.find(Funcionario.class, matricula);
    }

    @SuppressWarnings("unchecked")
    public List<Funcionario> findAll(){
        return entityManager
                .createQuery("FROM" + Funcionario.class.getName())
                .getResultList();
    }

    public void merge(Funcionario funcionario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }


}