/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewModeNoticeGlobals {
    static String field_d;
    static TypeCode field_c;
    static boolean field_b;
    static long field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != -94) {
          ViewModeNoticeGlobals.releaseStatics((byte) -8);
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_z = "ud.A(";
        field_d = "to return to the normal view.";
        field_c = new TypeCode(9, 0, 4, 1);
    }
}
