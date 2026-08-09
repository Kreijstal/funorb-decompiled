/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kaa extends pu {
    static kv[] field_l;
    static int field_m;

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = vv.field_e;
        synchronized (var1_ref) {
          L0: {
            if (gha.field_q != jaa.field_s) {
              gf.field_k = aq.field_a[gha.field_q];
              dla.field_j = dla.field_i[gha.field_q];
              gha.field_q = param0 & 1 + gha.field_q;
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d(byte param0) {
        if (param0 <= 106) {
            return;
        }
        field_l = null;
    }

    final static String c(int param0) {
        String var1;
        String var2;
        L0: {
          var1 = "";
          if (ola.field_e != null) {
            var1 = ola.field_e.a(1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var1.length() == 0) {
            var1 = uaa.d((byte) -82);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 <= 14) {
          L2: {
            var2 = (String) null;
            kaa.a((String) null, (byte) -3);
            if (-1 == (var1.length() ^ -1)) {
              var1 = qfa.field_t;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (-1 == (var1.length() ^ -1)) {
              var1 = qfa.field_t;
              break L3;
            } else {
              break L3;
            }
          }
          return var1;
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 63) {
                break L1;
              } else {
                kaa.d((byte) -125);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param0.length() <= var2_int) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (ml.a(-130697146, (char) var3)) {
                    break L3;
                  } else {
                    if (!ula.a((char) var3, 48)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("kaa.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
    }
}
