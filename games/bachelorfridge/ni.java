/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends pv {
    static ss field_l;
    static String field_k;
    static kv field_j;

    ni(jfa param0) {
        try {
            ((ni) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ni.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static ai[] a(byte param0, pf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ai[] var4 = null;
        int var5 = 0;
        ai var6_ref_ai = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_6_0 = null;
        ai[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ai[] stackOut_13_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.d(8, (byte) -65);
            if (var2_int <= 0) {
              var3 = param1.d(12, (byte) 45);
              if (param0 == 41) {
                var4 = new ai[var3];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var3) {
                    stackOut_13_0 = (ai[]) var4;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    L2: {
                      if (!fa.a((byte) -75, param1)) {
                        var6 = param1.d(nia.a(-1 + var5, false), (byte) 64);
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_ai = new ai();
                        int discarded$12 = param1.d(24, (byte) -105);
                        int discarded$13 = param1.d(24, (byte) 50);
                        var6_ref_ai.field_b = param1.d(24, (byte) -123);
                        int discarded$14 = param1.d(9, (byte) 69);
                        int discarded$15 = param1.d(12, (byte) -64);
                        int discarded$16 = param1.d(12, (byte) 58);
                        int discarded$17 = param1.d(12, (byte) -116);
                        var4[var5] = var6_ref_ai;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (ai[]) (Object) stackIn_6_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("ni.E(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    private final int c(boolean param0) {
        if (!param0) {
            boolean discarded$0 = ((ni) this).b(true);
        }
        return 50;
    }

    final boolean b(boolean param0) {
        int fieldTemp$0 = ((ni) this).field_g + 1;
        ((ni) this).field_g = ((ni) this).field_g + 1;
        if (!(fieldTemp$0 <= this.c(param0))) {
            ((ni) this).field_f.field_p = 2048;
            ((ni) this).field_f.field_k = ((ni) this).field_f.b(true);
            return true;
        }
        if (!(((ni) this).field_g != 1)) {
            ((ni) this).field_f.field_v.a((byte) 66, ((ni) this).field_f.field_g.field_o.field_b, 0);
        }
        if (((ni) this).field_g >= 40) {
        }
        return false;
    }

    public static void b(int param0) {
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -48) {
            ni.b(113);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "to over <%0> great games";
    }
}
