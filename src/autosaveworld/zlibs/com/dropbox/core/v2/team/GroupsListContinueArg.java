/* DO NOT EDIT */
/* This file was generated from team_groups.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.StructSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

class GroupsListContinueArg {
    // struct team.GroupsListContinueArg (team_groups.stone)

    protected final String cursor;

    /**
     *
     * @param cursor  Indicates from what point to get the next set of groups.
     *     Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public GroupsListContinueArg(String cursor) {
        if (cursor == null) {
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        this.cursor = cursor;
    }

    /**
     * Indicates from what point to get the next set of groups.
     *
     * @return value for this field, never {@code null}.
     */
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            cursor
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            GroupsListContinueArg other = (GroupsListContinueArg) obj;
            return (this.cursor == other.cursor) || (this.cursor.equals(other.cursor));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends StructSerializer<GroupsListContinueArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GroupsListContinueArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("cursor");
            StoneSerializers.string().serialize(value.cursor, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public GroupsListContinueArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            GroupsListContinueArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_cursor = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("cursor".equals(field)) {
                        f_cursor = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_cursor == null) {
                    throw new JsonParseException(p, "Required field \"cursor\" missing.");
                }
                value = new GroupsListContinueArg(f_cursor);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}