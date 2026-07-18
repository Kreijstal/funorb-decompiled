/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class mc implements j {
    private int field_h;
    private eg field_b;
    static sl field_k;
    private int field_n;
    private int field_e;
    private int field_c;
    static String field_o;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    private int field_d;
    private int field_l;
    static int[][][] field_g;
    private int field_m;

    final static void a(int param0, int param1) {
        int var2 = 64 / ((24 - param1) / 57);
        int discarded$0 = lh.e(0);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        hl.field_e = false;
        if (param0 > 86) {
          jh.field_a = null;
          if (!eb.field_m) {
            var1 = uk.field_H;
            if (0 < var1) {
              if (var1 == 1) {
                jh.field_a = cl.field_A;
                jh.field_a = qa.a(119, new CharSequence[3]);
                da.field_c.o(77);
                ba.c((byte) 15);
                return;
              } else {
                jh.field_a = ni.a(new String[1], 0, gh.field_r);
                jh.field_a = qa.a(119, new CharSequence[3]);
                da.field_c.o(77);
                ba.c((byte) 15);
                return;
              }
            } else {
              da.field_c.o(77);
              ba.c((byte) 15);
              return;
            }
          } else {
            da.field_c.m(13);
            return;
          }
        } else {
          return;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var3 = null;
            var4 = null;
            if (param1 == -1) {
              L1: {
                if (null == ah.field_g) {
                  break L1;
                } else {
                  if (ah.field_g.equals((Object) (Object) param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) ah.field_g;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                if (e.field_i == null) {
                  break L2;
                } else {
                  if (!e.field_i.equals((Object) (Object) param2.getParameter("session"))) {
                    var4 = (Object) (Object) e.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_10_0 = rk.a((String) var4, -1, (String) var3, -1, param0);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("mc.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hc var11 = null;
        ee stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
            L1: {
              if (param0 instanceof hc) {
                stackOut_2_0 = (ee) param0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ee) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (hc) (Object) stackIn_3_0;
              if (var11 != null) {
                param4 = param4 & var11.field_F;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param4) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              qg.f(param0.field_m + param2, param0.field_i + param1, param0.field_p, param0.field_l, ((mc) this).field_f);
              var8 = ((mc) this).field_h + param0.field_m + param2;
              if (param3 == 97) {
                break L4;
              } else {
                field_o = null;
                break L4;
              }
            }
            L5: {
              var9 = param1 + (param0.field_i + ((mc) this).field_a);
              qg.a(var8, var9, ((mc) this).field_n, ((mc) this).field_j, 5592405);
              qg.f(var8, var9, ((mc) this).field_n, ((mc) this).field_j, var7);
              if (var11.field_D) {
                qg.d(var8, var9, ((mc) this).field_n + var8, var9 - -((mc) this).field_j, 1);
                qg.d(var8 + ((mc) this).field_n, var9, var8, ((mc) this).field_j + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((mc) this).field_b == null) {
                break L6;
              } else {
                var10 = ((mc) this).field_n + ((mc) this).field_h - -((mc) this).field_c;
                int discarded$1 = ((mc) this).field_b.a(param0.field_v, param0.field_m + (param2 - -var10), ((mc) this).field_d + (param1 - -param0.field_i), -((mc) this).field_c + (-var10 + param0.field_p), -(((mc) this).field_c << 1) + param0.field_l, ((mc) this).field_m, ((mc) this).field_l, ((mc) this).field_i, ((mc) this).field_e, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("mc.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_g = null;
        field_k = null;
    }

    mc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((mc) this).field_e = 1;
        ((mc) this).field_i = 1;
        try {
            ((mc) this).field_l = param4;
            ((mc) this).field_c = param1;
            ((mc) this).field_f = param9;
            ((mc) this).field_d = param2;
            ((mc) this).field_h = param5;
            ((mc) this).field_n = param8;
            ((mc) this).field_m = param3;
            ((mc) this).field_j = param7;
            ((mc) this).field_b = param0;
            ((mc) this).field_a = param6;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new sl();
        field_g = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
