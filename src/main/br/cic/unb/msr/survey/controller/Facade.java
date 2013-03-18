package br.cic.unb.msr.survey.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import br.cic.unb.msr.survey.model.BugCategory;
import br.cic.unb.msr.survey.model.Review;

@Name("facade")
@AutoCreate
public class Facade {

	@In
	private EntityManager entityManager;
	
	public List<Review> pendentReviews(Long userId) {
		return entityManager.createQuery("FROM Review r where r.reviewed = 'FALSE' and r.user.id = :pId").setParameter("pId", userId).getResultList();
	}
	
	public List<BugCategory> listCategories() {
		return entityManager.createQuery("FROM BugCategory c").getResultList();
	}
	
	public void updateReview(Review review) {
		entityManager.merge(review);
		entityManager.flush();
	}
	
	public BugCategory findCategoryById(Long id) {
		return entityManager.find(BugCategory.class, id);
	}
}
