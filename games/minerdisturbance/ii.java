/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_c;
    static ta field_b;
    static int field_a;

    final static sa a(ji param0, boolean param1) {
        if (param1) {
            ii.a((byte) -103);
        }
        return mg.a(1963987425, rc.a(param0, 100, 96));
    }

    final static String b(byte param0) {
        if (ic.field_l == ci.field_e) {
            return qf.field_r;
        }
        int var1 = -48 / ((param0 - 15) / 47);
        return ch.field_g;
    }

    public static void a(byte param0) {
        if (param0 < 101) {
            field_c = null;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        ea var1 = new ea(540, 140);
        vb.a(var1, 127);
        dj.a();
        eh.d();
        mn.field_x = 0;
        oj.o(param0 + -1236579268);
        ea var2 = var1.c();
        if (param0 != 140) {
            return;
        }
        for (var3 = 0; var3 < 15; var3++) {
            var2.e(-2, -2, 16777215);
            eh.a(4, 4, 0, 0, 540, 140);
        }
        lc.field_u.g();
        var1.d(0, 0);
        tk.b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Taking a hard hat with you will soften the bumps and bruises you get from falling rocks. You'll never need to worry about cave-ins again.";
        field_b = new ta();
    }
}
