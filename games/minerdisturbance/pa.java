/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_d;
    static int field_c;
    static rc[] field_a;
    static int[][] field_b;

    final static ed a(byte param0) {
        if (!(ic.field_l != mc.field_t)) {
            throw new IllegalStateException();
        }
        if (param0 >= -19) {
            return null;
        }
        if (!(kd.field_p != ic.field_l)) {
            ic.field_l = mc.field_t;
            return vk.field_g;
        }
        return null;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 3) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, String param1, float param2) {
        bj.field_c = param1;
        oe.field_d = param2;
        if (!param0) {
            Object var4 = null;
            pa.a(false, (String) null, -0.23309962451457977f);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rc[3];
    }
}
