/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends td {
    gh(int param0, aga param1) {
        super(param0, param1);
    }

    final static hk[] c(byte param0) {
        if (param0 != -67) {
            return (hk[]) null;
        }
        return new hk[]{se.field_u, er.field_x, uka.field_k};
    }

    final ii a(op param0, int param1) {
        kk var4 = null;
        int var5 = 0;
        int var8 = 0;
        aga var9 = null;
        ii stackIn_3_0 = null;
        op stackIn_6_0 = null;
        kk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        aga var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var9 = this.field_h.a(32, param0);
            var4 = new kk(this.field_g, new nq(var9));
            var5 = 0;
            if (param1 == 3) {
              stackIn_6_0 = (op) (param0);
              L1: while (true) {
                if (stackIn_6_0.field_z <= var5) {
                  stackIn_15_0 = (kk) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_B) {
                      var5++;
                      stackIn_6_0 = (op) (param0);
                      continue L1;
                    } else {
                      L3: {
                        if (null != param0.field_a[var5][var6].field_l) {
                          var7 = param0.field_a[var5][var6].field_l;
                          var4.field_o.a(new iv(new nq(var7), false, 1, 0, 18), true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("gh.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_15_0);
        }
    }

    static {
    }
}
