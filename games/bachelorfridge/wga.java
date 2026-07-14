/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wga extends bca {
    static int field_s;
    static boolean[] field_q;
    static kv field_r;

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_r = null;
            return (at) (Object) new lb(param1, (wga) this);
        }
        return (at) (Object) new lb(param1, (wga) this);
    }

    wga(lu param0) {
        super(param0);
        ((wga) this).field_k = param0.e((byte) 99);
        ((wga) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((wga) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    wga(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 63 % ((param0 - 30) / 59);
        field_q = null;
    }

    final void a(op param0, int param1) {
        int var3 = 123 / ((param1 - 12) / 35);
        ((wga) this).a(param0, (byte) -2);
    }

    final static du[] d(int param0) {
        if (param0 != 0) {
          return null;
        } else {
          return new du[]{fh.field_i, sl.field_j, bj.field_k, uj.field_u, uca.field_b, wn.field_j, tj.field_d, mj.field_l, tl.field_r, h.field_p, hea.field_p, ed.field_d, jq.field_l, mda.field_a};
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new boolean[112];
        field_s = 0;
    }
}
