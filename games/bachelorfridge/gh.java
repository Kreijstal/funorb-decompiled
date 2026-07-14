/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends td {
    gh(int param0, aga param1) {
        super(param0, param1);
    }

    final static hk[] c(byte param0) {
        if (param0 != -67) {
            return null;
        }
        return new hk[]{se.field_u, er.field_x, uka.field_k};
    }

    final ii a(op param0, int param1) {
        kk var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        var8 = BachelorFridge.field_y;
        var9 = ((gh) this).field_h.a(32, param0);
        var4 = new kk(((gh) this).field_g, new nq(var9));
        var5 = 0;
        if (param1 == 3) {
          L0: while (true) {
            if (param0.field_z <= var5) {
              return (ii) (Object) var4;
            } else {
              var6 = 0;
              L1: while (true) {
                if (var6 >= param0.field_B) {
                  var5++;
                  continue L0;
                } else {
                  if (null != param0.field_a[var5][var6].field_l) {
                    var7 = param0.field_a[var5][var6].field_l;
                    var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 18), true);
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
