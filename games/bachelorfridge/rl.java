/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends td {
    static int field_q;
    static kv field_r;
    static lu field_p;

    final ii a(op param0, int param1) {
        aga var3 = null;
        me var4 = null;
        wia var5 = null;
        aga var6 = null;
        iv var7 = null;
        var3 = ((rl) this).field_h.a(param1 + 47, param0);
        if (param1 != 3) {
          return null;
        } else {
          L0: {
            var4 = new me(((rl) this).field_g, new nq(var3));
            var4.field_u = ((rl) this).field_n;
            var4.field_r = ((rl) this).field_k;
            var5 = param0.field_a[((rl) this).field_k][((rl) this).field_n];
            var6 = var5.field_l;
            if (var6 == null) {
              break L0;
            } else {
              var7 = new iv(new nq(var6), false, 1, 200, 0);
              var4.field_o.a((bw) (Object) var7, true);
              break L0;
            }
          }
          return (ii) (Object) var4;
        }
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
            rl.b(-128);
            field_p = null;
            return;
        }
        field_p = null;
    }

    rl(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((rl) this).field_k = param2;
        ((rl) this).field_n = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 100;
        field_r = new kv(540, 140);
    }
}
