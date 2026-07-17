/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vaa {
    static long field_b;
    static int[][] field_a;

    final static boolean a(int[] param0, int param1, int param2) {
        return (param0[param1 >> 5] & 1 << (param1 & 31)) != 0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
    }
}
