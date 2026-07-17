/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rn extends ck {
    static rf field_v;
    static String field_s;
    static String field_t;
    static int field_u;
    static int[] field_D;
    static String field_B;
    static String[] field_r;
    int field_p;
    static int field_q;
    static String field_A;
    int field_x;
    static int[] field_w;
    static gh field_C;
    static kg field_y;
    static int[] field_o;
    static String field_z;

    final static String a(String param0, int param1, String param2) {
        RuntimeException var4 = null;
        kj var5 = null;
        int var6 = 0;
        ah var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var8 = (CharSequence) (Object) param2;
            if (!fa.a(true, var8)) {
              stackOut_2_0 = en.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (2 == qc.field_P) {
                int discarded$2 = -41;
                var7 = da.a(param0);
                if (var7 == null) {
                  stackOut_9_0 = db.a(ui.field_W, -42, new String[1]);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var7.b(4);
                  var7.e(480);
                  cc.field_gc = cc.field_gc - 1;
                  var5 = mm.field_g;
                  var5.a(param1, (byte) -117);
                  var5.field_p = var5.field_p + 1;
                  var6 = var5.field_p;
                  var5.a((byte) 124, 3);
                  var5.a(param2, -121);
                  var5.b((byte) 116, var5.field_p + -var6);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = ql.field_Zb;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rn.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 1 + 41);
        }
        return (String) (Object) stackIn_12_0;
    }

    public static void d(int param0) {
        field_D = null;
        field_t = null;
        field_w = null;
        field_o = null;
        field_A = null;
        field_C = null;
        field_r = null;
        field_s = null;
        field_y = null;
        field_v = null;
        field_B = null;
        if (param0 != 3) {
          rn.d(-70);
          field_z = null;
          return;
        } else {
          field_z = null;
          return;
        }
    }

    final static boolean a() {
        if (rb.field_h == null) {
            return false;
        }
        if (!field_v.b(122)) {
            return false;
        }
        return true;
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!dl.f(22759)) {
                se.field_c.a(127, se.a((byte) 32, oh.field_f, pi.field_c), se.a((byte) 32, oa.field_S, rj.field_j));
                if (param0 == 90) {
                  L2: {
                    if (se.field_c.c(0)) {
                      var1_int = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var2 = 0;
                    if (var1_int == 0) {
                      break L3;
                    } else {
                      if (se.field_c.field_e < 0) {
                        break L3;
                      } else {
                        var2 = cb.field_c[se.field_c.field_e];
                        if (2 != var2) {
                          break L3;
                        } else {
                          gf.c(-95);
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = var2;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_7_0 = -55;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                se.field_c.a(true);
                if (se.field_c.c(0)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "rn.B(" + param0 + 41);
        }
        return stackIn_17_0;
    }

    private rn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to SteelSentinelsText.text_benefits."};
        field_B = "Discard Progress";
        field_A = "Join";
        field_D = new int[4];
        field_w = new int[8192];
        field_t = "Loading sound effects";
        field_o = new int[]{108, -1, 34, 4, 14, 9, 16, -1, -1, -1, -1};
        field_z = "OVER <%0>";
        field_s = "To Customer Support";
    }
}
