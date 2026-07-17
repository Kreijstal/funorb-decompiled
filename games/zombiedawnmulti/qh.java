/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh {
    dc field_c;
    static int field_e;
    static String field_d;
    static String field_b;
    static boolean field_a;
    static af[] field_f;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        if (param3 != -74) {
          return;
        } else {
          var7 = 5;
          ((qh) this).field_c.a(9736, param0, param1, var7, var6, param4, param2);
          dp.field_b.a(jk.field_f, 0, pa.field_O.field_zb, 0, -3344);
          bi.field_f.a(18, 2 + jk.field_f, -80 + pa.field_O.field_zb + -qa.field_o + -4, 0, -3344);
          jb.field_c.a(18, jk.field_f + 2, qa.field_o + 82, -80 + (pa.field_O.field_zb - (qa.field_o + 2)), param3 ^ 3398);
          eg.field_B.a(param3 + 74, qa.field_o, pa.field_O.field_z + (-jk.field_f + -22), pa.field_O.field_zb, 2, 0, 2 + (jk.field_f - -20), 20);
          gl.field_L.a(2, (byte) 123, qa.field_o, 20);
          return;
        }
    }

    final static void a(int param0, int param1, rp param2, int param3, int param4, int param5) {
        ef var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        ve var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var6 = qp.field_w;
              var7 = param2.field_t[param0];
              var8 = cr.a(param0, param1 ^ 30026);
              ol.field_n.c(param4, param3, param5);
              dj.field_p.a(param4 - -71, param3 + 17, param5);
              if (param5 >= 255) {
                em.field_X.a(param4 + 22, param3 - -77, 150 - -(on.a(wf.field_m * 128, -18924) >> 11), 65535);
                break L1;
              } else {
                em.field_X.a(22 + param4, param3 + 77, param5);
                break L1;
              }
            }
            L2: {
              if (hh.field_h != null) {
                break L2;
              } else {
                hh.field_h = new ja(12, 32);
                g.c(hh.field_h);
                oo.a(0, 0, 12, 16, 65280, 16776960);
                oo.a(0, 16, 12, 17, 16776960, 16711680);
                g.d();
                break L2;
              }
            }
            L3: {
              if (param1 == -29990) {
                break L3;
              } else {
                qh.a(-92);
                break L3;
              }
            }
            L4: {
              hh.field_h.c(param4 + 80, 36 + param3, param5);
              var9 = var7 * 31 / var8;
              oo.f(param4 + 80, param3 + 36, 12, 31 - var9, 1, param5);
              wa.field_b[-44 + param0 + 26].c(18 + param4, param3 - -44, param5);
              int discarded$1 = ((fm) (Object) var6).a(gh.field_f[param0], param4 - -4, -7 + param3, 54, 90, 16777215, 1, param5, 1, 1, ((fm) (Object) var6).field_C - -((fm) (Object) var6).field_r);
              var10 = new Random();
              if (var7 < var8) {
                break L4;
              } else {
                if (hp.a((byte) -98, var10, 7) == 0) {
                  var11 = new ve(85 + param4, param3 - -18, 8, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                  var11.field_k = 39 * param4 + (wf.field_m - -(param3 * 17));
                  var12 = 200 * param5 >> 8;
                  var13 = 128 * var12;
                  var14 = var12 * 64;
                  var13 = var13 >> 8;
                  var15 = 255 * var12;
                  var14 = var14 >> 8;
                  var13 = var13 << 16;
                  var15 = var15 >> 8;
                  var14 = var14 << 8;
                  var11.a(var15 | (var13 | var14), 85 + param4, true, 18 + param3, 16777215, -1963);
                  break L4;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6_ref;
            stackOut_12_1 = new StringBuilder().append("qh.C(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        if (param0 != -22) {
            Object var2 = null;
            qh.a(-33, -32, (rp) null, 92, -111, -115);
        }
    }

    qh(String param0, cj param1) {
        String[] var3 = null;
        cj[] var4 = null;
        try {
            var3 = new String[]{param0, of.field_p, tm.field_e};
            var4 = new cj[]{param1, pa.field_O, (cj) (Object) gl.field_L};
            ((qh) this).field_c = new dc(0L, kf.field_i, var3, aa.field_l, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> has withdrawn the request to join.";
        field_a = true;
        field_d = "Remove name";
    }
}
