package br.cic.unb.msr.survey.action;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;
import org.jboss.seam.annotations.datamodel.DataModelSelection;

import br.cic.unb.msr.survey.controller.Facade;
import br.cic.unb.msr.survey.model.Review;
import br.cic.unb.msr.survey.model.User;

@Name("reviewAction")
@Scope(ScopeType.CONVERSATION)
public class ReviewAction {
	
	@In(scope=ScopeType.SESSION)
	private User loggedUser;
	
	@In
	private Facade facade; 
	
	@DataModel
	private List<Review> reviews;
	
	@DataModelSelection
	@Out(required=false)
	private Review selectedReview;

	@Factory("reviews")
	public void retrievePendentReviews() {
		reviews = facade.pendentReviews(loggedUser.getId());
	}

	public User getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Review getSelectedReview() {
		return selectedReview;
	}

	public void setSelectedReview(Review selectedReview) {
		this.selectedReview = selectedReview;
	}
	
	
}
