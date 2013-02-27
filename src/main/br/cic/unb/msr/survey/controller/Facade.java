package br.cic.unb.msr.survey.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import br.cic.unb.msr.survey.model.Review;

@Name("facade")
@AutoCreate
public class Facade {

	@In
	private EntityManager entityManager;
	
	public List<Review> pendentReviews(Long userId) {
		return entityManager.createQuery("FROM Review r where r.user.id = :pId").setParameter("pId", userId).getResultList();
	}
}
