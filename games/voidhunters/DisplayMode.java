/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayMode {
    int width;
    int bitDepth;
    static long[] field_b;
    int height;
    int refreshRate;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        if (param0 >= -87) {
          DisplayMode.clearSharedReferences((byte) 2);
        }
    }

    static {
        field_z = "fm.A(";
        field_b = new long[32];
    }
}
