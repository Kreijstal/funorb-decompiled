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
        Object stackIn_3_0 = null;
        vha stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        vha stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = ((wh) this).field_h.a(77, param0);
            var4 = new vha(((wh) this).field_g, new nq(var8));
            if (param1 == 3) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= 7) {
                  stackOut_10_0 = (vha) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    var6 = param0.field_S[var8.field_D].field_b[var5];
                    if (var6 != null) {
                      var4.field_o.a((bw) (Object) new iv(new nq(var6), false, 1, 0, var6.field_y), true);
                      var4.field_o.a((bw) (Object) new ks(new nq(var6)), true);
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("wh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_11_0;
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
