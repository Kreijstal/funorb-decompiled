/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends td {
    static java.math.BigInteger field_p;

    final static boolean c(int param0) {
        fka var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fka var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (fka) (Object) fd.field_z.b((byte) 90);
            var1 = var4;
            if (var1 != null) {
              if (param0 <= -38) {
                var2 = 0;
                L1: while (true) {
                  if (var1.field_k <= var2) {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    L2: {
                      if (var4.field_i[var2] != null) {
                        if (var4.field_i[var2].field_f == 0) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var4.field_j[var2] != null) {
                        if (0 != var4.field_j[var2].field_f) {
                          break L3;
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "tg.B(" + param0 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        jl var4 = null;
        jl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((tg) this).field_h.a(param1 ^ 104, param0);
              var4 = new jl(((tg) this).field_g, new nq(var3));
              if (param1 == 3) {
                break L1;
              } else {
                boolean discarded$2 = tg.c(-1);
                break L1;
              }
            }
            var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 28), true);
            stackOut_2_0 = (jl) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("tg.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_3_0;
    }

    public static void b(int param0) {
        field_p = null;
    }

    tg(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
