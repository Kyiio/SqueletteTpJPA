package fr.univaix.iut.progbd.dao.jpa;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import fr.univaix.iut.progbd.dao.DAO;

public class DAOGeneriqueJPA<T, ID> implements DAO<T, ID> {

	private Class<T> entityClass;
	private String entityName = "";

	protected EntityManager entityManager;

	public DAOGeneriqueJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
		this.entityClass = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);

		Annotation[] annotations = entityClass.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof Entity) {
				entityName = ((Entity) annotation).name();
				break;
			}
		}

		if (entityName.equals("")) {
			entityName = entityClass.getSimpleName();
		}
	}

	@Override
	public boolean delete(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
