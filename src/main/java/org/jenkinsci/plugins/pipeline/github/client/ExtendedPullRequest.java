package org.jenkinsci.plugins.pipeline.github.client;

import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.User;

import java.io.Serial;

/**
 * @author Aaron Whiteside
 */
public class ExtendedPullRequest extends PullRequest {
    @Serial
    private static final long serialVersionUID = 4674327177035503955L;

    private User closedBy;
    private boolean locked;
    private boolean draft;
    private String mergeCommitSha;
    private Boolean maintainerCanModify;

    public User getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(final User closedBy) {
        this.closedBy = closedBy;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(final boolean locked) {
        this.locked = locked;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(final boolean draft) {
        this.draft = draft;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(final String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public Boolean isMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(final Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public String getBranchReference(){
        return this.getHead().getRef();
    }
}
