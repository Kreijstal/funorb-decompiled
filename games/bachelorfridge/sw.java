/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends td {
    static kv field_p;

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        mna var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        aga var9 = null;
        int var10 = 0;
        aga var11 = null;
        Object stackIn_3_0 = null;
        mna stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        mna stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var11 = ((sw) this).field_h.a(68, param0);
            var4 = new mna(((sw) this).field_g, new nq(var11));
            var4.field_q = ((sw) this).field_i;
            int[][] discarded$1 = var4.a(((sw) this).field_i, (byte) 106, var11, param0);
            var5 = var11.field_x;
            if (param1 == 3) {
              L1: {
                var6 = var11.field_J;
                var7 = var5;
                var8 = var6;
                if (((sw) this).field_i == 2) {
                  var7--;
                  break L1;
                } else {
                  if (4 == ((sw) this).field_i) {
                    var7++;
                    break L1;
                  } else {
                    if (1 != ((sw) this).field_i) {
                      if (3 == ((sw) this).field_i) {
                        var8++;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      var8--;
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var9 = param0.field_a[var7][var8].field_l;
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.i(107)) {
                    var4.field_o.a((bw) (Object) new iv(new nq(var9), false, 1, 0, 29), true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_17_0 = (mna) var4;
              stackIn_18_0 = stackOut_17_0;
              break L0;
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("sw.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_18_0;
    }

    sw(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
            ((sw) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sw.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(param2);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= param2) {
                stackOut_4_0 = (StringBuilder) param0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("sw.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 4 + 44 + param2 + 44 + 32 + 41);
        }
        return stackIn_5_0;
    }

    public static void c() {
        field_p = null;
    }

    static {
    }
}
