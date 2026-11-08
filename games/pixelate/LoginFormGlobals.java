/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginFormGlobals {
    static int field_f;
    static LoginForm field_b;
    static SceneWidget field_d;
    static int field_c;
    static int field_a;
    static String field_e;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -107) {
          field_d = (SceneWidget) null;
        }
    }

    static {
        field_z = "nf.A(";
        field_f = 360;
        field_e = "Send private message to <%0>";
    }
}
