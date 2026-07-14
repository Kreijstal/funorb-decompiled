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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Pixelate.field_H ? 1 : 0;
          var6 = 8 + (param5 + param1 + 8) - -487;
          ki.field_k.a(3, ui.field_i.field_nb - 6, param0, 256, -6 + var6);
          var7 = ki.field_k.field_nb - 5;
          oc.field_U.a(var7 + -param2, param2, 5, 256, 487 + param1 - -param5);
          nf.field_d.a(0, param2, param1, 256, -rh.field_y.field_K + -param1 + oc.field_U.field_K);
          var7 = var7 - (2 + param2);
          rh.field_y.a(0, param2, param1 + nf.field_d.field_K, 256, rh.field_y.field_K);
          l.field_p.a(5, 2, (byte) 118, 487 + (param1 + param5), 5, -5 + var7, param5);
          if (null != td.field_b) {
            td.field_b.a(l.field_p.field_K, (byte) 100, l.field_p.field_S, l.field_p.field_D, l.field_p.field_nb);
            break L0;
          } else {
            break L0;
          }
        }
        var8 = -var6 + (ui.field_i.field_K - param1);
        var9 = var8 / 2;
        var10 = var9 - (-param4 + -param1);
        var11 = 0;
        var12 = 0;
        L1: while (true) {
          if (var12 >= 6) {
            return;
          } else {
            L2: {
              if ((var12 ^ -1) <= -6) {
                break L2;
              } else {
                if (null != fm.field_f[var12]) {
                  break L2;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
            var13 = (ui.field_i.field_nb + -4) * var11 / (qm.field_F + 1) + 3;
            var11++;
            var7 = -var13 + (-2 + (3 + var11 * (2 + (ui.field_i.field_nb + -6)) / (1 + qm.field_F)));
            if (5 <= var12) {
              gh.field_u.a(var13, var7, var6, 256, var8);
              var12++;
              continue L1;
            } else {
              fm.field_f[var12].a(var13, var7, var6, 256, var8);
              jo.field_n[var12].a(0, var7, param1, 256, -param1 + var9);
              fm.field_h[var12].a(param3, var7 + (-param3 + -param3), var9, 256, param4);
              hk.field_e[var12].a(param3, -param3 + (-param3 + var7), var10, param0 + 253, var8 - (param1 - -var10));
              var12++;
              continue L1;
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 != 29731) {
            int discarded$0 = eh.a(92, -16, -63);
        }
        field_c = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static tf[] a(String param0, String param1, byte param2, fm param3) {
        int var4 = param3.a(115, param1);
        int var5 = param3.a((byte) -113, param0, var4);
        if (param2 != 47) {
            field_g = null;
        }
        return ff.a(param3, var4, var5, param2 + -50);
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
        return new java.net.Socket(((eh) this).field_b, ((eh) this).field_e);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -1 + param1 & param0 >> -510336929;
        if (param2 != -510336929) {
            return 68;
        }
        return var3 + (param0 + (param0 >>> -482133665)) % param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_g = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
