/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link GroupDeleteError}
 * error.
 *
 * <p> This exception is raised by {@link DbxTeamTeamRequests#groupsDelete}.
 * </p>
 */
public class GroupDeleteErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/groups/delete

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxTeamTeamRequests#groupsDelete}.
     */
    public final GroupDeleteError errorValue;

    public GroupDeleteErrorException(String routeName, String requestId, LocalizedText userMessage, GroupDeleteError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}