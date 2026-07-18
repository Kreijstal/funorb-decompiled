/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static java.math.BigInteger field_j;
    db field_h;
    int field_i;
    String field_c;
    String field_b;
    String field_f;
    static dl[] field_g;
    static ko field_a;
    static sj field_e;
    static f[] field_d;

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) tm.field_b;
        synchronized (var1) {
          L0: {
            gg.field_c = uc.field_b;
            aq.field_s = aq.field_s + 1;
            qh.field_i = fq.field_C;
            bm.field_h = tn.field_s;
            ij.field_h = wl.field_m;
            wl.field_m = false;
            pj.field_v = th.field_y;
            to.field_a = kk.field_g;
            dp.field_h = sb.field_I;
            th.field_y = 0;
            var2 = 1;
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    private lm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = new sj(4, 1, 1, 1);
    }
}
