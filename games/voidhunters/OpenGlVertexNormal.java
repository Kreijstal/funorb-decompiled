/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexNormal {
    int y;
    static int field_i;
    static String field_b;
    static ToolkitSprite[] field_d;
    static int field_g;
    int contributionCount;
    int z;
    int x;
    static String field_e;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 == 2) {
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
        OpenGlVertexNormal.clearSharedReferences(-124);
        field_e = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_z = "mmb.A(";
        field_b = "You were disconnected after <%0> minutes for being idle";
        field_i = 512;
        field_g = 2;
        field_e = "Passwords must be between 5 and 20 letters and numbers";
    }
}
