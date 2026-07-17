/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int field_a;
    static float[][] field_b;
    static int[] field_c;

    final static boolean a() {
        if (ci.field_a == null) {
            return false;
        }
        if (!ci.field_a.c(-1)) {
            return false;
        }
        return true;
    }

    public static void b() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[][]{new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2]};
    }
}
