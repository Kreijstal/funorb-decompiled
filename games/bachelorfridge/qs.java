/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends pu {
    static int field_o;
    static kv[][] field_l;
    static sna field_m;
    static int field_n;

    final static String[][] a(boolean param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[][] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.e((byte) 117);
            var3 = param1.e((byte) 95);
            var4 = new String[var2_int][var3];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackOut_7_0 = (String[][]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var3) {
                    var5++;
                    continue L1;
                  } else {
                    var4[var5][var6] = param1.h((byte) 120);
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("qs.D(").append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            i.field_h = new js(16);
            var1_int = 0;
            L1: while (true) {
              if (nm.field_C.length <= var1_int) {
                break L0;
              } else {
                i.field_h.a((long)nm.field_C[var1_int].toLowerCase().hashCode(), (byte) 127, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "qs.B(" + false + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_l = null;
    }

    final static void c(int param0) {
        int var2 = BachelorFridge.field_y;
        if (lfa.field_q > 0) {
            lfa.field_q = lfa.field_q - 1;
        } else {
            if (ld.field_p > 0) {
                ld.field_p = ld.field_p - 1;
            } else {
                if (!(dja.field_m <= 0)) {
                    dja.field_m = dja.field_m - 1;
                }
            }
        }
        if (lfa.field_q > 0) {
            pm.f(199);
        }
        if (ld.field_p > 0) {
            dna.c(ld.field_p, false);
        }
        if (!(dja.field_m <= 0)) {
            dna.c(dja.field_m, false);
        }
    }

    static {
    }
}
