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
        String[][] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[][] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_l = (kv[][]) null;
                break L1;
              }
            }
            var2_int = param1.e((byte) 117);
            var3 = param1.e((byte) 95);
            var4 = new String[var2_int][var3];
            var5 = 0;
            L2: while (true) {
              if (var5 >= var2_int) {
                stackOut_9_0 = (String[][]) (var4);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var3) {
                    var5++;
                    continue L2;
                  } else {
                    var4[var5][var6] = param1.h((byte) 120);
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("qs.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              i.field_h = new js(16);
              var1_int = 0;
              if (!param0) {
                break L1;
              } else {
                field_l = (kv[][]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (nm.field_C.length <= var1_int) {
                break L0;
              } else {
                i.field_h.a((long)nm.field_C[var1_int].toLowerCase().hashCode(), (byte) 127, new ji(var1_int));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qs.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -5232) {
            return;
        }
        field_m = null;
        field_l = (kv[][]) null;
    }

    final static void c(int param0) {
        String[][] discarded$0 = null;
        int var2 = BachelorFridge.field_y;
        if ((lfa.field_q ^ -1) < -1) {
            lfa.field_q = lfa.field_q - 1;
        } else {
            if (-1 > (ld.field_p ^ -1)) {
                ld.field_p = ld.field_p - 1;
            } else {
                if (!((dja.field_m ^ -1) >= -1)) {
                    dja.field_m = dja.field_m - 1;
                }
            }
        }
        if ((lfa.field_q ^ -1) < -1) {
            pm.f(param0 + 11100);
        }
        if ((ld.field_p ^ -1) < -1) {
            dna.c(ld.field_p, false);
        }
        if (!((dja.field_m ^ -1) >= -1)) {
            dna.c(dja.field_m, false);
        }
        if (param0 != -10901) {
            lu var3 = (lu) null;
            discarded$0 = qs.a(false, (lu) null);
        }
    }

    static {
    }
}
