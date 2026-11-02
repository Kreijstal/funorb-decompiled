/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja {
    static String field_c;
    static Sprite[] field_d;
    static String field_b;
    static UiComponent field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        if (param0 == 6220) {
          field_c = null;
          field_b = null;
          return;
        }
        field_d = (Sprite[]) null;
        field_c = null;
        field_b = null;
    }

    static {
        field_z = "fja.A(";
        field_c = "Members' Benefits";
        field_b = "Please remove <%0> from your friend list first.";
    }
}
