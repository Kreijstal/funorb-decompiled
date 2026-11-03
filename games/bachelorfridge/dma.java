/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dma {
    static volatile int field_c;
    static boolean field_a;
    static BufferedSocket field_b;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
    }

    static {
        field_z = "dma.A(";
        field_c = 0;
    }
}
