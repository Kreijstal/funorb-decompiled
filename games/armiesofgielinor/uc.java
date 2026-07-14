/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static int[][] field_d;
    static boolean field_a;
    static je field_b;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != -39) {
            field_b = null;
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        bc.a(2858);
    }

    final static void a(dq param0, int param1) {
        if (param1 != 4) {
            field_b = null;
            ds.field_c = param0;
            return;
        }
        ds.field_c = param0;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        fh.field_e = param0;
        if (param3) {
            uc.a(29);
            q.field_B = param4;
            return;
        }
        q.field_B = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_d = new int[][]{new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9], new int[9]};
        field_c = "You can only use Revolt on enemy villages or towers.";
    }
}
