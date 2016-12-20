/* DO NOT EDIT */
/* This file was generated from team_groups.stone */

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

public enum GroupsGetInfoError {
    // union team.GroupsGetInfoError (team_groups.stone)
    /**
     * The group is not on your team.
     */
    GROUP_NOT_ON_TEAM,
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
    static class Serializer extends UnionSerializer<GroupsGetInfoError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GroupsGetInfoError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case GROUP_NOT_ON_TEAM: {
                    g.writeString("group_not_on_team");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public GroupsGetInfoError deserialize(JsonParser p) throws IOException, JsonParseException {
            GroupsGetInfoError value;
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
            else if ("group_not_on_team".equals(tag)) {
                value = GroupsGetInfoError.GROUP_NOT_ON_TEAM;
            }
            else {
                value = GroupsGetInfoError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}