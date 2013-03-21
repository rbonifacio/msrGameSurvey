package br.cic.unb.msr.survey.action;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;
import org.jboss.seam.annotations.datamodel.DataModelSelection;

import br.cic.unb.msr.survey.controller.Facade;
import br.cic.unb.msr.survey.model.BugCategory;
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
	@Out(required=false, scope=ScopeType.CONVERSATION)
	private Review selectedReview;
	
	private Long selectedCategoryId;
	
	@Out(required=false, scope=ScopeType.CONVERSATION)
	private Review submittedReview;

	@Factory("reviews")
	public void retrievePendentReviews() {
		reviews = facade.pendentReviews(loggedUser.getId());
	}
	
	
	public String browseToConcludedReviews() {
		return "concludedReviews";
	}
	
	public String browseToPendentReviews() {
		return "pendentReviews";
	}
	public String reviewBugReport() {
		submittedReview = selectedReview;
		
		selectedCategoryId = submittedReview.getCategory() == null ? null : submittedReview.getCategory().getId();
		return "reviewBugReport";
	}
	
	public List<Review> concludedReviews() {
		return facade.concludedReviews(loggedUser.getId());
	}
	
	public List<SelectItem> listCategories() {
		List<BugCategory> categories = facade.listCategories();
		List<SelectItem> items = new ArrayList<SelectItem>();
		for (BugCategory c: categories) {
			SelectItem item = new SelectItem();
			item.setLabel(c.getCategory());
			item.setValue(c.getId()); //this is not the best option, but works without a big effort.
			items.add(item);
		}
		return items; 
	}
	
	public String review() {
		BugCategory c = facade.findCategoryById(selectedCategoryId);
		submittedReview.setCategory(c);
		submittedReview.setReviewed(true);
		facade.updateReview(submittedReview);
		reviews = facade.pendentReviews(loggedUser.getId());
		return "pendentReviews";
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

	public void setSelectedCategoryId(Long selectedCategoryId) {
		this.selectedCategoryId = selectedCategoryId;
	}

	public Long getSelectedCategoryId() {
		return selectedCategoryId;
	}
	
}
