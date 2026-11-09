/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps {
    static int field_a;
    static TextureFormat LUMINANCE_ALPHA;
    static String scoreText;
    static float[] field_d;
    static int[] field_e;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 != 28) {
          return;
        }
        field_d = null;
        field_e = null;
        scoreText = null;
        LUMINANCE_ALPHA = null;
    }

    static {
        field_z = "ps.A(";
        scoreText = "score: ";
        field_a = 0;
        field_d = new float[4];
        LUMINANCE_ALPHA = new TextureFormat(2);
        field_e = new int[]{10, 10, 10, 4, 5, 6, 7, 8, 10, 50, 11, 15, 10, 5, 50000, 16, 17, 18, 19, 20, 1000000, 1000000, 23, 24, 25, 26, 27, 28};
    }
}
