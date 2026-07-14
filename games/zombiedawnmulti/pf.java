/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static cj[] field_d;
    static int field_c;
    static ja[][] field_e;
    static ri field_a;
    static ul field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 != 6345) {
            pf.a(-125);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static ri[] a(int param0, ul param1, int param2, int param3) {
        if (!ud.a(param0, param1, param3, (byte) -42)) {
            return null;
        }
        if (param2 > -50) {
            return null;
        }
        return bc.a(2);
    }

    final static void a(int param0) {
        rm.field_a.setLength(0);
        va.field_a = 0;
        int var1 = -16 % ((param0 - -23) / 36);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 100;
        field_e = new ja[5][];
    }
}
