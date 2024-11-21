package org.jenkinsci.plugins.pipeline.github;

import groovy.lang.GroovyObjectSupport;
import org.eclipse.egit.github.core.CommitFile;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.Whitelisted;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Groovy wrapper over a {@link CommitFile}.
 *
 * @author Aaron Whiteside
 * @see CommitFile
 */
public class CommitFileGroovyObject extends GroovyObjectSupport implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final CommitFile file;

    CommitFileGroovyObject(final CommitFile file) {
        this.file = Objects.requireNonNull(file, "file cannot be null");
    }

    @Whitelisted
    public int getAdditions() {
        return file.getAdditions();
    }

    @Whitelisted
    public int getChanges() {
        return file.getChanges();
    }

    @Whitelisted
    public int getDeletions() {
        return file.getDeletions();
    }

    @Whitelisted
    public String getBlobUrl() {
        return file.getBlobUrl();
    }

    @Whitelisted
    public String getFilename() {
        return file.getFilename();
    }

    @Whitelisted
    public String getPatch() {
        return file.getPatch();
    }

    @Whitelisted
    public String getRawUrl() {
        return file.getRawUrl();
    }

    @Whitelisted
    public String getSha() {
        return file.getSha();
    }

    @Whitelisted
    public String getStatus() {
        return file.getStatus();
    }
}
