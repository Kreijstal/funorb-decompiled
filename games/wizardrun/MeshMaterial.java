/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshMaterial {
    static int field_f;
    static int field_e;
    int color;
    static String field_d;
    static GameApplet field_c;
    static String field_g;
    static String field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_g = null;
        field_a = null;
        if (param0 > -68) {
          return;
        }
        field_d = null;
    }

    static {
        field_z = "ca.A(";
        field_f = 5;
        field_d = "Connection lost. <%0>";
        field_g = "Please try again in a few minutes.";
        field_c = null;
        field_a = "Accept";
    }
}
