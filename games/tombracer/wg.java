/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends tu {
    static String[] field_j;
    static qda field_l;
    static String[] field_m;
    static String field_k;
    static int field_i;

    final void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        try {
            int discarded$6 = 108;
            nba.a(((wg) this).field_f, param3);
            if (param0 != 15) {
                Object var8 = null;
                ((wg) this).a((hca) null, (la) null, true);
            }
            super.a(param0, param1, param2, param3, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, int[] param1) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = new StringBuilder("[");
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (var3 >= param1.length) {
                stackOut_7_0 = String.valueOf(']');
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  if (var3 != 0) {
                    StringBuilder discarded$4 = var2.append(',');
                    break L2;
                  } else {
                    break L2;
                  }
                }
                StringBuilder discarded$5 = var5.append("0x").append(Integer.toHexString(param1[var3]));
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("wg.R(").append(0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, hca param1, la param2) {
        try {
            qra.a(param2, 100, ((wg) this).field_f);
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wg.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_j = null;
        field_m = null;
        field_l = null;
    }

    wg(ff param0) {
        super(param0);
    }

    final void a(hca param0, la param1, boolean param2) {
        try {
            if (param2) {
                Object var5 = null;
                ((wg) this).a((hca) null, (la) null, false);
            }
            int discarded$0 = 108;
            caa.a(((wg) this).field_f, param1);
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wg.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = jua.field_d;
            L1: while (true) {
              if (mba.field_g.length <= var3_int) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var5 = bla.field_H[var3_int];
                  if (var5 >= 0) {
                    var6 = ro.a((byte) -116, mba.field_g[var3_int], true);
                    var4 = var4 + mha.field_C;
                    var7 = -(var6 >> 1) + ega.field_c;
                    if (!rea.a(param2, var6 - -(nja.field_L << 1), -nja.field_L + var7, param1, (pqa.field_p << 1) + nt.field_d, false, var4)) {
                      var4 = var4 + ((pqa.field_p << 1) + mha.field_C + nt.field_d);
                      break L2;
                    } else {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var4 = var4 + f.field_b;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wg.T(" + 1541709953 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
