/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ww extends td {
    static boolean field_p;

    final static lr a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lr var9 = null;
        int var10 = 0;
        eaa var11 = null;
        eaa var12 = null;
        var10 = BachelorFridge.field_y;
        var11 = new eaa();
        var12 = var11;
        var6 = 0;
        L0: while (true) {
          if (var6 >= rn.field_u) {
            var6 = var12.g(0);
            var7 = kla.a(var6, vj.field_o, -2147483648);
            var8 = param0;
            var9 = (lr) (Object) var12.b((byte) 90);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (var8 >= var7) {
                    break L2;
                  } else {
                    var8++;
                    var9 = (lr) (Object) var12.c(param0 ^ 0);
                    continue L1;
                  }
                }
              }
              return var9;
            }
          } else {
            if (rs.field_g[var6].a(param4, param1, param2, param3, param0 ^ -2581)) {
              if (rs.field_g[var6].a(param0 + 0, param2)) {
                var11.a((bw) (Object) rs.field_g[var6], true);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = ((ww) this).field_h.a(46, param0);
        ku var4 = new ku(((ww) this).field_g, new nq(var3));
        if (param1 != 3) {
            field_p = false;
        }
        var4.field_o.a((bw) (Object) new tfa(), true);
        return (ii) (Object) var4;
    }

    ww(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
    }
}
