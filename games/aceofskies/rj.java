/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static boolean[] field_c;
    static ResourceArchive field_b;
    static String field_a;
    private static String field_z;

    public static void a(boolean param0) {
        if (param0) {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        rj.a(true);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_z = "rj.A(";
        field_c = new boolean[]{true, true, false};
        field_a = "Members";
    }
}
