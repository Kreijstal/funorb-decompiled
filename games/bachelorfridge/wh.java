/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends td {
    static oa field_p;
    static long field_q;

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        vha var4 = null;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        aga var8 = null;
        ii stackIn_3_0 = null;
        vha stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = this.field_h.a(77, param0);
            var4 = new vha(this.field_g, new nq(var8));
            if (param1 == 3) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= 7) {
                  stackIn_11_0 = (vha) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var6 = param0.field_S[var8.field_D].field_b[var5];
                    if (var6 != null) {
                      var4.field_o.a(new iv(new nq(var6), false, 1, 0, var6.field_y), true);
                      var4.field_o.a(new ks(new nq(var6)), true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("wh.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_11_0);
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
