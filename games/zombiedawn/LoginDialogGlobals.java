/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginDialogGlobals {
    static int field_c;
    static LoginPanel field_a;
    static int field_b;
    static int field_e;
    static ExceptionWrapper field_d;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 < 75) {
          return;
        }
        field_d = null;
    }

    static {
        field_z = "he.A(";
        field_c = 0;
        field_e = 0;
        field_b = 0;
    }
}
