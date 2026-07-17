/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    int field_e;
    pa field_b;
    int field_g;
    fo field_c;
    int field_a;
    int field_d;
    static int[] field_f;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 25613) {
            fo.a(-119);
        }
    }

    final static void b() {
        nl.field_o = -1;
        ht.field_g = false;
        ok.field_o = 0;
        we.field_c = -1;
        qj.field_s = null;
    }

    final void a(byte param0, int param1, int param2, fo param3, int param4, pa param5, int param6) {
        ((fo) this).field_b = param5;
        ((fo) this).field_d = param6;
        ((fo) this).field_g = param4;
        ((fo) this).field_e = param1;
        if (param0 != 46) {
            return;
        }
        try {
            ((fo) this).field_c = param3;
            ((fo) this).field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "fo.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
