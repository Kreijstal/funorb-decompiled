/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg implements ir {
    private int field_e;
    static String field_c;
    private int field_d;
    private hc field_a;
    static long field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_c = null;
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                wg.a(false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3.field_g) {
                  break L3;
                } else {
                  if (param3.e(28660)) {
                    break L3;
                  } else {
                    stackOut_5_0 = 2188450;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            var6_int = stackIn_7_0;
            int discarded$1 = ((wg) this).field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_f + "</u>", param3.field_p + param2, param3.field_h + param4, param3.field_q, param3.field_n, var6_int, -1, ((wg) this).field_e, ((wg) this).field_d, ((wg) this).field_a.field_I + ((wg) this).field_a.field_D);
            if (param3.e(param1 + 36252)) {
              L4: {
                var7 = ((wg) this).field_a.a(param3.field_f);
                var8 = ((wg) this).field_a.field_D + ((wg) this).field_a.field_I;
                var9 = param3.field_p + param2;
                var10 = param3.field_h + param4;
                if (((wg) this).field_e != 2) {
                  if (1 != ((wg) this).field_e) {
                    break L4;
                  } else {
                    var9 = var9 + (-var7 + param3.field_q >> 1);
                    break L4;
                  }
                } else {
                  var9 = var9 + (-var7 + param3.field_q);
                  break L4;
                }
              }
              L5: {
                if (((wg) this).field_d != 2) {
                  if (1 == ((wg) this).field_d) {
                    var10 = var10 + (-var8 + param3.field_n >> 1);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var10 = var10 + (param3.field_n + -var8);
                  break L5;
                }
              }
              co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ')');
        }
    }

    public wg() {
        ((wg) this).field_a = qo.field_b;
        ((wg) this).field_d = 1;
        ((wg) this).field_e = 1;
    }

    wg(hc param0, int param1, int param2) {
        try {
            ((wg) this).field_d = param2;
            ((wg) this).field_e = param1;
            ((wg) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "gun_overheat";
    }
}
