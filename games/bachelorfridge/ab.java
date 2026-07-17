/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends td {
    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        oga var5 = null;
        aga var6 = null;
        ew stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        oga stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oga stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        ew stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var6 = ((ab) this).field_h.a(29, param0);
              var4 = ((ab) this).field_j.a(18, param0);
              if (var4 == null) {
                break L1;
              } else {
                if (var4.i(75)) {
                  break L1;
                } else {
                  var5 = new oga(((ab) this).field_g, new nq(var6), ((ab) this).field_j);
                  var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, 0, 37), true);
                  if (param1 == 3) {
                    var5.field_o.a((bw) (Object) new rla(new nq(var4), var6.field_D), true);
                    stackOut_8_0 = (oga) var5;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (ii) (Object) stackIn_7_0;
                  }
                }
              }
            }
            stackOut_3_0 = new ew(new nq(var6));
            stackIn_4_0 = stackOut_3_0;
            return (ii) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ab.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_9_0;
    }

    ab(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            ((ab) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ab.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
