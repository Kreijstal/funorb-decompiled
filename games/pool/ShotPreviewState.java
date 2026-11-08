/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShotPreviewState {
    static int field_b;
    static Ball[] field_a;
    static String month;
    private static String field_z;

    public static void releaseStatics(int param0) {
        month = null;
        field_a = null;
        if (param0 != -24420) {
          field_b = 0;
        }
    }

    static {
        field_z = "pc.A(";
        month = "Month";
    }
}
