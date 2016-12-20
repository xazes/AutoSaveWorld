/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link GroupsGetInfoError}
 * error.
 *
 * <p> This exception is raised by {@link DbxTeamTeamRequests#groupsGetInfo}.
 * </p>
 */
public class GroupsGetInfoErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/groups/get_info

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxTeamTeamRequests#groupsGetInfo}.
     */
    public final GroupsGetInfoError errorValue;

    public GroupsGetInfoErrorException(String routeName, String requestId, LocalizedText userMessage, GroupsGetInfoError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}