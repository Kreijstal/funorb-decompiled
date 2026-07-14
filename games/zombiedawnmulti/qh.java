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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Random var16 = null;
        ve var17 = null;
        Random var18 = null;
        ve var19 = null;
        var6 = qp.field_w;
        var7 = param2.field_t[param0];
        var8 = cr.a(param0, param1 ^ 30026);
        ol.field_n.c(param4, param3, param5);
        dj.field_p.a(param4 - -71, param3 + 17, param5);
        if (param5 >= 255) {
          em.field_X.a(param4 + 22, param3 - -77, 150 - -(on.a(wf.field_m * 128, -18924) >> 1492253547), 65535);
          if (hh.field_h != null) {
            L0: {
              if (param1 == -29990) {
                break L0;
              } else {
                qh.a(-92);
                break L0;
              }
            }
            hh.field_h.c(param4 + 80, 36 + param3, param5);
            var9 = var7 * 31 / var8;
            oo.f(param4 + 80, param3 + 36, 12, 31 - var9, 1, param5);
            wa.field_b[-44 + param0 + 26].c(18 + param4, param3 - -44, param5);
            int discarded$3 = ((fm) (Object) var6).a(gh.field_f[param0], param4 - -4, -7 + param3, 54, 90, 16777215, 1, param5, 1, 1, ((fm) (Object) var6).field_C - -((fm) (Object) var6).field_r);
            var18 = new Random();
            if (var7 >= var8) {
              if (-1 != (hp.a((byte) -98, var18, 7) ^ -1)) {
                return;
              } else {
                var19 = new ve(85 + param4, param3 - -18, 8, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var19.field_k = 39 * param4 + (wf.field_m - -(param3 * 17));
                var12 = 200 * param5 >> 777040968;
                var13 = 128 * var12;
                var14 = var12 * 64;
                var13 = var13 >> 8;
                var15 = 255 * var12;
                var14 = var14 >> 8;
                var13 = var13 << 16;
                var15 = var15 >> 8;
                var14 = var14 << 8;
                var19.a(var15 | (var13 | var14), 85 + param4, true, 18 + param3, 16777215, -1963);
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              hh.field_h = new ja(12, 32);
              g.c(hh.field_h);
              oo.a(0, 0, 12, 16, 65280, 16776960);
              oo.a(0, 16, 12, 17, 16776960, 16711680);
              g.d();
              if (param1 == -29990) {
                break L1;
              } else {
                qh.a(-92);
                break L1;
              }
            }
            hh.field_h.c(param4 + 80, 36 + param3, param5);
            var9 = var7 * 31 / var8;
            oo.f(param4 + 80, param3 + 36, 12, 31 - var9, 1, param5);
            wa.field_b[-44 + param0 + 26].c(18 + param4, param3 - -44, param5);
            int discarded$4 = ((fm) (Object) var6).a(gh.field_f[param0], param4 - -4, -7 + param3, 54, 90, 16777215, 1, param5, 1, 1, ((fm) (Object) var6).field_C - -((fm) (Object) var6).field_r);
            var18 = new Random();
            if (var7 >= var8) {
              if (-1 != (hp.a((byte) -98, var18, 7) ^ -1)) {
                return;
              } else {
                var19 = new ve(85 + param4, param3 - -18, 8, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var19.field_k = 39 * param4 + (wf.field_m - -(param3 * 17));
                var12 = 200 * param5 >> 777040968;
                var13 = 128 * var12;
                var14 = var12 * 64;
                var13 = var13 >> 8;
                var15 = 255 * var12;
                var14 = var14 >> 8;
                var13 = var13 << 16;
                var15 = var15 >> 8;
                var14 = var14 << 8;
                var19.a(var15 | (var13 | var14), 85 + param4, true, 18 + param3, 16777215, -1963);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: {
            em.field_X.a(22 + param4, param3 + 77, param5);
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
          hh.field_h.c(param4 + 80, 36 + param3, param5);
          var9 = var7 * 31 / var8;
          oo.f(param4 + 80, param3 + 36, 12, 31 - var9, 1, param5);
          wa.field_b[-44 + param0 + 26].c(18 + param4, param3 - -44, param5);
          int discarded$5 = ((fm) (Object) var6).a(gh.field_f[param0], param4 - -4, -7 + param3, 54, 90, 16777215, 1, param5, 1, 1, ((fm) (Object) var6).field_C - -((fm) (Object) var6).field_r);
          var16 = new Random();
          if (var7 >= var8) {
            if (-1 != (hp.a((byte) -98, var16, 7) ^ -1)) {
              return;
            } else {
              var17 = new ve(85 + param4, param3 - -18, 8, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
              var17.field_k = 39 * param4 + (wf.field_m - -(param3 * 17));
              var12 = 200 * param5 >> 777040968;
              var13 = 128 * var12;
              var14 = var12 * 64;
              var13 = var13 >> 8;
              var15 = 255 * var12;
              var14 = var14 >> 8;
              var13 = var13 << 16;
              var15 = var15 >> 8;
              var14 = var14 << 8;
              var17.a(var15 | (var13 | var14), 85 + param4, true, 18 + param3, 16777215, -1963);
              return;
            }
          } else {
            return;
          }
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
        String[] var3 = new String[]{param0, of.field_p, tm.field_e};
        cj[] var4 = new cj[]{param1, pa.field_O, (cj) (Object) gl.field_L};
        ((qh) this).field_c = new dc(0L, kf.field_i, var3, aa.field_l, var4, 0);
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
