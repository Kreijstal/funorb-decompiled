/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends td {
    static oa field_p;
    static long field_q;

    final ii a(op param0, int param1) {
        vha var4 = null;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        aga var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = ((wh) this).field_h.a(77, param0);
        var4 = new vha(((wh) this).field_g, new nq(var8));
        if (param1 == 3) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= 7) {
              return (ii) (Object) var4;
            } else {
              var6 = param0.field_S[var8.field_D].field_b[var5];
              if (var6 != null) {
                var4.field_o.a((bw) (Object) new iv(new nq(var6), false, 1, 0, var6.field_y), true);
                var4.field_o.a((bw) (Object) new ks(new nq(var6)), true);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    wh(int param0, aga param1) {
        super(param0, param1);
    }

    public static void b(int param0) {
        if (param0 != 0) {
            wh.b(-93);
        }
        field_p = null;
    }

    static {
    }
}
