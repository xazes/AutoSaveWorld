/* DO NOT EDIT */
/* This file was generated from team_members.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

public enum MembersRecoverError {
    // union team.MembersRecoverError (team_members.stone)
    /**
     * No matching user found. The provided team_member_id, email, or
     * external_id does not exist on this team.
     */
    USER_NOT_FOUND,
    /**
     * The user is not recoverable.
     */
    USER_UNRECOVERABLE,
    /**
     * The user is not a member of the team.
     */
    USER_NOT_IN_TEAM,
    /**
     * Team is full. The organization has no available licenses.
     */
    TEAM_LICENSE_LIMIT,
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    OTHER; // *catch_all

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<MembersRecoverError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MembersRecoverError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case USER_NOT_FOUND: {
                    g.writeString("user_not_found");
                    break;
                }
                case USER_UNRECOVERABLE: {
                    g.writeString("user_unrecoverable");
                    break;
                }
                case USER_NOT_IN_TEAM: {
                    g.writeString("user_not_in_team");
                    break;
                }
                case TEAM_LICENSE_LIMIT: {
                    g.writeString("team_license_limit");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public MembersRecoverError deserialize(JsonParser p) throws IOException, JsonParseException {
            MembersRecoverError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("user_not_found".equals(tag)) {
                value = MembersRecoverError.USER_NOT_FOUND;
            }
            else if ("user_unrecoverable".equals(tag)) {
                value = MembersRecoverError.USER_UNRECOVERABLE;
            }
            else if ("user_not_in_team".equals(tag)) {
                value = MembersRecoverError.USER_NOT_IN_TEAM;
            }
            else if ("team_license_limit".equals(tag)) {
                value = MembersRecoverError.TEAM_LICENSE_LIMIT;
            }
            else {
                value = MembersRecoverError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}