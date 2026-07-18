/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends td {
    gh(int param0, aga param1) {
        super(param0, param1);
    }

    final static hk[] c() {
        return new hk[]{se.field_u, er.field_x, uka.field_k};
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        kk var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        Object stackIn_3_0 = null;
        op stackIn_6_0 = null;
        kk stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        op stackOut_4_0 = null;
        kk stackOut_14_0 = null;
        op stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var9 = ((gh) this).field_h.a(32, param0);
            var4 = new kk(((gh) this).field_g, new nq(var9));
            var5 = 0;
            if (param1 == 3) {
              stackOut_4_0 = (op) param0;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                if (stackIn_6_0.field_z <= var5) {
                  stackOut_14_0 = (kk) var4;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_B) {
                      var5++;
                      stackOut_5_0 = (op) param0;
                      stackIn_6_0 = stackOut_5_0;
                      continue L1;
                    } else {
                      L3: {
                        if (null != param0.field_a[var5][var6].field_l) {
                          var7 = param0.field_a[var5][var6].field_l;
                          var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 18), true);
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("gh.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_15_0;
    }

    static {
    }
}
