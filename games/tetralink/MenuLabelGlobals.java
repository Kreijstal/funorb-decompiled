/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuLabelGlobals {
    static int field_e;
    static GraphicsSettings field_d;
    static Archive field_b;
    static boolean field_a;
    static String[] field_c;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        if (param0 > 9) {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        MenuLabelGlobals.releaseStatics((byte) 81);
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_z = "cd.A(";
        field_a = true;
    }
}
