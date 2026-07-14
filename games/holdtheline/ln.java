/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ln extends hl {
    static jn field_k;
    long field_i;
    ln field_n;
    static String field_j;
    static String field_m;
    ln field_l;

    final static float a(int param0, float param1) {
        if (param0 != -29407) {
            return -0.6477053165435791f;
        }
        if (param1 > 0.0f) {
            return 1.0f;
        }
        if (param1 < 0.0f) {
            return -1.0f;
        }
        return 0.0f;
    }

    final static e a(int param0, byte param1) {
        e[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        e[] var5 = null;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param1 < -50) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        var5 = wg.a(4);
        var2 = var5;
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (param0 == var5[var3].field_f) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 0) {
            return;
        }
        field_j = null;
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != 0) {
            float discarded$0 = ln.a(11, 0.5669122934341431f);
        }
        return tl.field_w.a(param0, false, "");
    }

    final void a(byte param0) {
        if (((ln) this).field_l == null) {
            return;
        }
        if (param0 != -42) {
            field_j = null;
        }
        ((ln) this).field_l.field_n = ((ln) this).field_n;
        ((ln) this).field_n.field_l = ((ln) this).field_l;
        ((ln) this).field_n = null;
        ((ln) this).field_l = null;
    }

    final static void a(int param0) {
        int var2 = HoldTheLine.field_D;
        if (param0 < 92) {
            float discarded$0 = ln.a(11, -0.14343492686748505f);
        }
        if (!ii.a((byte) -118)) {
            if (null != cc.field_w) {
                if (cc.field_w.field_a) {
                    ij.c(4);
                    r.field_a.a((n) (Object) new rf(r.field_a, sk.field_a), false);
                }
            }
            return;
        }
        boolean discarded$9 = r.field_a.a(ab.field_lb, di.field_r, true, false);
        r.field_a.g((byte) -59);
        while (qh.c(-44)) {
            boolean discarded$10 = r.field_a.a(aa.field_n, pk.field_M, (byte) 117);
        }
    }

    protected ln() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Achieved";
        field_m = "DNF";
    }
}
