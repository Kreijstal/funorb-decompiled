/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static boolean field_f;
    static Sprite field_c;
    static int[][] field_g;
    static String field_b;
    static IntrusiveDeque field_h;
    static int[] field_i;
    static boolean field_e;
    static long field_a;
    static FrameTimer field_d;
    private static String field_z;

    public static void clearStatics(int param0) {
        field_g = (int[][]) null;
        field_h = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_i = null;
    }

    static {
        field_z = "oe.A(";
        field_b = "Game options changed (<%0>)";
        field_a = 0L;
    }
}
