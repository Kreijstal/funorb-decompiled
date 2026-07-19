/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int[][] field_a;
    static String field_b;
    static String field_d;
    static int field_c;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = (int[][]) null;
        if (param0 != 84) {
            bi.a((byte) 127);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "not completed";
        field_a = new int[][]{new int[]{-14277033, -15585213, -13919072}, new int[]{-12792366, -14277033, -6178359}, new int[]{-14268072, -9864870, -11182489}, new int[]{-14141416, -8812229, -8820409}, new int[]{-11252113, -8820409, -9864870}, new int[]{-10927218, -12507818, -8570810}, new int[]{-12381421, -13948885, -15198440}};
        field_c = 0;
    }
}
