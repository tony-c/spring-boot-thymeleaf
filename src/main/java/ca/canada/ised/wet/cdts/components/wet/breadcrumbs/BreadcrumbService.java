package ca.canada.ised.wet.cdts.components.wet.breadcrumbs;

import java.util.List;

/**
 * The Interface BreadcrumbService gives access to building and retrieving
 * breadcrumbs.
 */
public interface BreadcrumbService {

	/**
	 * Gets the bread crumb list.
	 *
	 * @return the bread crumb list
	 */
	List<BreadCrumb> getBreadCrumbList();

	/**
	 * Builds the bread crumbs.
	 *
	 * @param currentView
	 *            the current view
	 * @param requestURL
	 *            the request url
	 */
	void buildBreadCrumbs(String currentView, String requestURL);
}