/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends td {
    static jla[] field_p;
    static String field_q;

    eg(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 > -71) {
            eg.c((byte) -75);
        }
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        fia var5 = null;
        aga var6 = null;
        aga var7 = null;
        ew stackIn_4_0 = null;
        fia stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fia stackOut_11_0 = null;
        ew stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var6 = this.field_h.a(param1 ^ 48, param0);
              var7 = var6;
              var4 = this.field_j.a(79, param0);
              if (var4 == null) {
                break L1;
              } else {
                if (var4.i(-127)) {
                  break L1;
                } else {
                  L2: {
                    var5 = new fia(this.field_g, new nq(var7));
                    var5.field_o.a(new iv(new nq(var4), false, 1, 0, 32), true);
                    if (param1 == 3) {
                      break L2;
                    } else {
                      field_p = (jla[]) null;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var4.field_o.field_b == 1) {
                        break L4;
                      } else {
                        if (var4.field_o.field_b != 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param0.field_T.field_u[var6.field_D] = true;
                    break L3;
                  }
                  stackOut_11_0 = (fia) (var5);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_3_0 = new ew(new nq(var7));
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("eg.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii) ((Object) stackIn_4_0);
        } else {
          return (ii) ((Object) stackIn_12_0);
        }
    }

    static {
        field_p = new jla[16];
        field_q = "Drawn";
    }
}
