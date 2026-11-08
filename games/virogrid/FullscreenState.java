/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenState {
    static int field_c;
    static PcmSample field_d;
    static int field_a;
    static FullscreenFocusCanvas field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 < 45) {
          field_a = 19;
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_z = "ih.A(";
    }
}
