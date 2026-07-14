/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends bca {
    nq field_r;
    static String field_q;

    pg(lu param0) {
        super(param0);
        ((pg) this).field_k = param0.e((byte) 123);
        ((pg) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((pg) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((pg) this).field_r = qi.a(param0, (byte) 68);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new nr(param1, (pg) this);
    }

    final static void e(int param0) {
        fja.field_a.a(18, 31407, tv.field_o.field_sb - (eaa.field_c ? 2 + (rj.field_j - -2 + 40) : 0), 0, 0);
        oca.field_n.a(18, param0 ^ 31407, rj.field_j + 42, tv.field_o.field_sb - (rj.field_j - -2 + 40), param0);
        qba.field_m.a((byte) -58, tv.field_o.field_p + -20, 0, 20, tv.field_o.field_sb, rj.field_j, 2);
    }

    pg(int param0, nq param1, nq param2) {
        super(param0, param1);
        ((pg) this).field_r = param2;
    }

    final void a(op param0, int param1) {
        int var3 = 56 / ((param1 - 12) / 35);
        ((pg) this).a(param0, (byte) -2);
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != 0) {
            pg.e(1);
        }
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -95, param1);
        er.a(((pg) this).field_r, 127, param1);
        if (param0 >= -12) {
            ((pg) this).field_r = null;
        }
    }

    static {
    }
}
