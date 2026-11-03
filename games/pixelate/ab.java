/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static Sprite[] field_c;
    static SceneWidget field_a;
    static int field_b;
    static ResourceArchive field_f;
    static String field_e;
    static String field_d;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (!param0) {
          field_f = null;
          field_c = null;
          return;
        }
        ab.clearSharedReferences(true);
        field_f = null;
        field_c = null;
    }

    static {
        field_z = "ab.A(";
        field_e = "Lost";
        field_d = "OVER <%0>";
    }
}
