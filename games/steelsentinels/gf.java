/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static fm field_b;
    static mi field_d;
    static dm field_a;
    static wk[] field_c;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.field_G;
        ha.field_T = null;
        nf.field_c = null;
        wh.field_d = 0;
        var2 = ih.field_n;
        ih.field_n = lh.field_B;
        ne.field_N.field_f = ne.field_N.field_f + 1;
        if (param0 == 51) {
          ne.field_N.field_t = 2;
        } else {
          if (param0 != 50) {
            ne.field_N.field_t = 1;
          } else {
            ne.field_N.field_t = 5;
          }
        }
        if (param1 != 16777215) {
          return 29;
        }
        lh.field_B = var2;
        if (2 <= ne.field_N.field_f &&
          param0 == 51) {
          return 2;
        }
        if (2 <= ne.field_N.field_f &&
          50 == param0) {
          return 5;
        }
        if (4 <= ne.field_N.field_f) {
          return 1;
        }
        return -1;
    }

    final static void a(int param0) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        wk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var9 = null;
        int var1_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var5 = SteelSentinels.field_G;
        try {
          jk.a((byte) 6);
          le.field_K = 77;
          bc.a(49, 9, 56, 0, fa.field_b, 16711680, 255);
          bc.a(83, 1, 63, 56, fa.field_b, 16711680, 255);
          ta.field_e = pf.field_b;
          rf.a(ea.field_m, 320, 8, 8, 8, 8, hk.field_Tb, 16777215, 0, pl.field_U, 1146810, 240, 2, param0 - 94, wc.field_d);
          im.a(hk.field_Tb, 0, 8, -13782, ea.field_m, 16777215, 8, 8, 2, 240, pl.field_U, 1146810, wc.field_d, 320, 8);
          eb.field_s = new wk[9];
          for (var1_int = 0; var1_int < 9; var1_int++) {
            eb.field_s[var1_int] = pl.field_T[var1_int].g();
            if (var1_int < 3) {
              sf.a(10, 43, 50, eb.field_s[var1_int], 0, 122);
            } else {
              if (var1_int >= 6) {
                sf.a(10, 27, 34, eb.field_s[var1_int], 0, -68);
              } else {
                sf.a(10, 35, 42, eb.field_s[var1_int], 0, param0 ^ 81);
              }
            }
          }
          var1_intLifetime1 = aj.field_r[0].field_B;
          aj.field_r[1] = new wk(var1_intLifetime1, var1_intLifetime1);
          aj.field_r[2] = new wk(var1_intLifetime1, var1_intLifetime1);
          var9 = aj.field_r[0].field_E;
          for (var3_int = 0; var9.length > var3_int; var3_int++) {
            if (var9[var3_int] == 16711680) {
              aj.field_r[1].field_E[var3_int] = 45056;
              aj.field_r[2].field_E[var3_int] = 8388608;
              var9[var3_int] = 33023;
            }
          }
          rh.field_v[21] = aj.field_r[0].g();
          rh.field_v[22] = aj.field_r[1].g();
          rh.field_v[23] = aj.field_r[2].g();
          rh.field_v[24] = aj.field_r[2].g();
          var3 = b.field_q[0];
          b.field_q[0] = aj.field_r[0].g();
          b.field_q[0].d();
          var3.a(0, 0);
          for (var4 = 0; var4 < var3.field_E.length; var4++) {
            if ((65280 & var3.field_E[var4]) != 0) {
              var3.field_E[var4] = 8454016;
            } else {
              if ((255 & var3.field_E[var4]) != 0) {
                var3.field_E[var4] = 32768;
              }
            }
          }
          b.field_q[1] = aj.field_r[1].g();
          b.field_q[1].d();
          var3.a(0, 0);
          for (var4Lifetime1 = 0; var4Lifetime1 < var3.field_E.length; var4Lifetime1++) {
            if (var3.field_E[var4Lifetime1] == 8454016) {
              var3.field_E[var4Lifetime1] = 16711680;
            } else {
              if (var3.field_E[var4Lifetime1] == 32768) {
                var3.field_E[var4Lifetime1] = 8388608;
              }
            }
          }
          b.field_q[2] = aj.field_r[2].g();
          b.field_q[2].d();
          var3.a(0, param0);
          for (var4Lifetime2 = 0; var4Lifetime2 < 3; var4Lifetime2++) {
            rh.field_v[21 + var4Lifetime2].d();
            b.field_q[var4Lifetime2].a(0, 0);
          }
          rh.field_v[24].d();
          si.field_E[1].c(0, 0, 4 * var1_intLifetime1, var1_intLifetime1 * 4);
          sb.field_bb.b((byte) 122);
          ff.field_rb = new wk[20];
          for (var4Lifetime3 = 0; 20 > var4Lifetime3; var4Lifetime3++) {
            ff.field_rb[var4Lifetime3] = new wk(20, 20);
            ff.field_rb[var4Lifetime3].d();
            hb.field_j[var4Lifetime3].b(0, 0);
          }
          sb.field_bb.b((byte) 125);
          ve.a((byte) 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "gf.A(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 > -86) {
          return;
        }
        nc.field_q = false;
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 > -77) {
          return;
        }
        field_c = null;
        field_e = null;
    }

    static {
        field_b = new fm(4, 1, 1, 1);
        field_e = "Q";
    }
}
