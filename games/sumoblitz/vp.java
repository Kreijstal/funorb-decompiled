/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    static String discardText;
    static qn field_e;
    static double[] field_d;
    static int[] field_c;
    static int field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        discardText = null;
        if (param0 < -95) {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        discardText = (String) null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    static {
        field_z = "vp.A(";
        field_d = new double[]{1.0, 1.5, 2.0, 1.5, 0.5, 1.25, 5.0};
        discardText = "Discard";
    }
}
