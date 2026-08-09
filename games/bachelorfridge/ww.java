/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ww extends td {
    static boolean field_p;

    final static lr a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6;
        int var10;
        eaa var11;
        eaa var12;
        int var7;
        int var8;
        lr var9;
        var10 = BachelorFridge.field_y;
        var11 = new eaa();
        var12 = var11;
        var6 = 0;
        L0: while (true) {
          if (var6 >= rn.field_u) {
            var6 = var12.g(0);
            var7 = kla.a(var6, vj.field_o, -2147483648);
            var8 = param0;
            var9 = (lr) ((Object) var12.b((byte) 90));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (var8 >= var7) {
                    break L2;
                  } else {
                    var8++;
                    var9 = (lr) ((Object) var12.c(param0 ^ 0));
                    continue L1;
                  }
                }
              }
              return var9;
            }
          } else {
            if (rs.field_g[var6].a(param4, param1, param2, param3, param0 ^ -2581)) {
              if (rs.field_g[var6].a(param0 + 0, param2)) {
                var11.a(rs.field_g[var6], true);
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
        aga var3 = null;
        RuntimeException var3_ref = null;
        ku var4 = null;
        ku stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(46, param0);
              var4 = new ku(this.field_g, new nq(var3));
              if (param1 == 3) {
                break L1;
              } else {
                field_p = false;
                break L1;
              }
            }
            var4.field_o.a(new tfa(), true);
            stackIn_3_0 = (ku) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ww.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_3_0);
    }

    ww(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_p = false;
    }
}
