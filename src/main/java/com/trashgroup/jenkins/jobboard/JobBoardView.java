package com.trashgroup.jenkins.jobboard;

import hudson.Extension;
import hudson.model.TopLevelItem;
import hudson.model.AbstractProject;
import hudson.model.ListView;
import hudson.model.ViewDescriptor;
import hudson.util.FormValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.bind.JavaScriptMethod;

public class JobBoardView extends ListView {

	/**
	 * @param name
	 *            Name of the view
	 */
	@DataBoundConstructor
	public JobBoardView(String name) {
		super(name);
	}

	@Extension
	public static final class Descriptor extends ViewDescriptor {
		public Descriptor() {
			super(JobBoardView.class);
		}

		@Override
		public String getDisplayName() {
			return "Job Board View";
		}

	}

}
