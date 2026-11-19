/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DecodedSpritePalette {
    static int field_a;
    static int field_c;
    static int[] palette;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          palette = (int[]) null;
          palette = null;
          return;
        }
        palette = null;
    }

    static {
        field_z = "ic.A(";
    }
}
