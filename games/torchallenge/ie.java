/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static sl field_d;
    static int[][][] field_b;
    static qe[] field_e;
    static String field_c;
    static String field_g;
    static ka[][] field_f;
    static sf field_a;

    final static void b(byte param0) {
        kd var1 = (kd) (Object) rf.field_db.d((byte) -112);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        qg.a(var1.field_j, var1.field_p, var1.field_s);
        qg.f(var1.field_l, var1.field_i, var1.field_n, var1.field_q);
        if (param0 != -9) {
            field_c = null;
        }
        var1.field_j = null;
        mc.field_k.a((da) (Object) var1, param0 + -26);
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 != 33) {
            boolean discarded$0 = ie.a((byte) 0, 'K');
        }
        field_d = null;
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (!(!ea.a(param1, -124))) {
            return true;
        }
        char[] var6 = eb.field_r;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
                return true;
            }
        }
        var2 = ne.field_a;
        var3 = 0;
        if (param0 != 82) {
            boolean discarded$0 = ie.a((byte) 53, '￈');
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            if (param1 == var4) {
                return true;
            }
            var3++;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[][][]{new int[7][], new int[7][], new int[7][]};
        field_g = null;
        field_c = "Loading sound effects";
        field_e = new qe[5];
    }
}
