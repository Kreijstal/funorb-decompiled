/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_b;
    static volatile int field_a;

    final static void a(byte param0, boolean param1, String param2) {
        pc.field_f = param1 ? true : false;
        s.field_K = true;
        int var3 = 4 % ((param0 - 32) / 48);
        ki.field_c = new dh(vg.field_Z, fd.field_k, param2, rk.field_f, pc.field_f);
        vg.field_Z.c((fj) (Object) ki.field_c, 0);
    }

    final static void a(bj param0, int param1, int param2) {
        lf.field_k.a((rk) (Object) param0, (byte) 67);
        if (param1 != -1) {
            return;
        }
        lf.a(param2, 102, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 53) {
            r.a(-122);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "C";
        field_a = -1;
    }
}
