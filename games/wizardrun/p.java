/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends og implements wa {
    static int field_W;
    private int field_X;
    static int field_V;
    private dk field_T;
    static int field_U;

    p(String param0, ce param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(boolean param0, String param1) {
        int var4 = wizardrun.field_H;
        int var2 = param1.charAt(0);
        int var3 = 1;
        if (param0) {
            field_W = 38;
        }
        while (var3 < param1.length()) {
            if (!(param1.charAt(var3) == var2)) {
                return false;
            }
            var3++;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        if (param0 != 10000536) {
            return;
        }
        super.a(param0 + 0, param1, param2, param3);
        ((p) this).field_X = -param2 + (pg.field_n + -((p) this).field_o);
    }

    final void a(int param0, dk param1) {
        if (param0 != 0) {
            return;
        }
        ((p) this).field_T = param1;
    }

    final void i(byte param0) {
        super.i((byte) -73);
        if (param0 > -59) {
            Object var3 = null;
            ((p) this).a(-16, (dk) null);
        }
        if (!(null == ((p) this).field_T)) {
            ((p) this).field_T.a((byte) -115);
        }
    }

    public final dk a(byte param0) {
        int var2 = -2 % ((62 - param0) / 36);
        return ((p) this).field_T;
    }

    final static void a(byte param0, String param1, boolean param2, float param3) {
        if (!(ea.field_e != null)) {
            ea.field_e = new hk(u.field_A, bh.field_a);
            u.field_A.b((ub) (Object) ea.field_e, (byte) 126);
        }
        int var4 = 25 % ((param0 - -75) / 34);
        ea.field_e.a(param1, param3, 2113632, param2);
        ed.d();
        od.a(-117, true);
    }

    final static uf[] l(byte param0) {
        if (param0 != 100) {
            return null;
        }
        return new uf[]{hd.field_C, jf.field_e, ra.field_j};
    }

    final String c(boolean param0) {
        if (!((p) this).field_v) {
            return null;
        }
        if (null == ((p) this).field_p) {
            return null;
        }
        if (param0) {
            dk discarded$0 = ((p) this).a((byte) -27);
        }
        og.a(pg.field_n + -((p) this).field_X + ((p) this).field_r, fi.field_B, -91);
        return ((p) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 0;
        field_U = 0;
        field_W = -1;
    }
}
