/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class eh {
    static String[] field_g;
    int field_e;
    static tf[] field_c;
    static fm field_a;
    String field_b;
    static String field_d;
    static vg field_f;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 8 + (param5 + param1 + 8) - -487;
              ki.field_k.a(3, ui.field_i.field_nb - 6, param0, 256, -6 + var6_int);
              var7 = ki.field_k.field_nb - 5;
              oc.field_U.a(var7 + -param2, param2, 5, 256, 487 + param1 - -param5);
              nf.field_d.a(0, param2, param1, 256, -rh.field_y.field_K + -param1 + oc.field_U.field_K);
              var7 = var7 - (2 + param2);
              rh.field_y.a(0, param2, param1 + nf.field_d.field_K, 256, rh.field_y.field_K);
              l.field_p.a(5, 2, (byte) 118, 487 + (param1 + param5), 5, -5 + var7, param5);
              if (null != td.field_b) {
                td.field_b.a(l.field_p.field_K, (byte) 100, l.field_p.field_S, l.field_p.field_D, l.field_p.field_nb);
                break L1;
              } else {
                break L1;
              }
            }
            var8 = -var6_int + (ui.field_i.field_K - param1);
            var9 = var8 / 2;
            var10 = var9 - (-param4 + -param1);
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if ((var12 ^ -1) <= -6) {
                      break L4;
                    } else {
                      if (null == fm.field_f[var12]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var13 = (ui.field_i.field_nb + -4) * var11 / (qm.field_F + 1) + 3;
                  var11++;
                  var7 = -var13 + (-2 + (3 + var11 * (2 + (ui.field_i.field_nb + -6)) / (1 + qm.field_F)));
                  if (5 <= var12) {
                    gh.field_u.a(var13, var7, var6_int, 256, var8);
                    break L3;
                  } else {
                    fm.field_f[var12].a(var13, var7, var6_int, 256, var8);
                    jo.field_n[var12].a(0, var7, param1, 256, -param1 + var9);
                    fm.field_h[var12].a(param3, var7 + (-param3 + -param3), var9, 256, param4);
                    hk.field_e[var12].a(param3, -param3 + (-param3 + var7), var10, param0 + 253, var8 - (param1 - -var10));
                    break L3;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var6), "eh.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void d(int param0) {
        int discarded$0 = 0;
        if (param0 != 29731) {
            discarded$0 = eh.a(92, -16, -63);
        }
        field_c = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static tf[] a(String param0, String param1, byte param2, fm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param3.a(115, param1);
              var5 = param3.a((byte) -113, param0, var4_int);
              if (param2 == 47) {
                break L1;
              } else {
                field_g = (String[]) null;
                break L1;
              }
            }
            stackOut_2_0 = ff.a(param3, var4_int, var5, param2 + -50);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("eh.O(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void c(int param0) {
        ao.b(param0 + 94);
        if (param0 != 5) {
            eh.c(-107);
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != -2) {
            eh.c(-110);
        }
        return new java.net.Socket(this.field_b, this.field_e);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -1 + param1 & param0 >> -510336929;
        if (param2 != -510336929) {
            return 68;
        }
        return var3 + (param0 + (param0 >>> -482133665)) % param1;
    }

    static {
        field_d = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_g = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
