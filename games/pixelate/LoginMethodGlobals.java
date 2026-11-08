/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethodGlobals {
    static LoginMethod field_c;
    static String[] field_e;
    static String field_d;
    static long field_g;
    static String field_a;
    static String field_f;
    static int field_b;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        if (!param0) {
          field_e = null;
          field_c = null;
          return;
        }
        field_c = (LoginMethod) null;
        field_e = null;
        field_c = null;
    }

    static {
        field_z = "cd.A(";
        field_d = "Player";
        field_c = new LoginMethod("");
        field_f = "Who can join";
        field_a = "Password is valid";
    }
}
