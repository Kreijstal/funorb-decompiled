/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends id {
    static int field_F;
    private int field_G;
    static int field_H;
    static double field_J;
    private int field_I;

    final static int a(boolean param0, hf param1, int param2, hf param3, String param4, int param5, byte param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        k stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        k stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var14 = param1.c((byte) 99);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param3.c((byte) 99);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (ki.field_h == null &&
            !ee.a(false, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (vo.field_l == ud.field_cb) {
            ma.field_a.field_j = 0;
            dd.field_d = null;
            if (param4 == null) {
              pm.field_R.field_j = 0;
              pm.field_R.b(125, c.field_c.nextInt());
              pm.field_R.b(-114, c.field_c.nextInt());
              stackIn_15_0 = pm.field_R;
              stackIn_15_1 = -16171;
              if (param1.a((byte) 105)) {
                stackIn_16_2 = var14;
              } else {
                stackIn_16_2 = "";
              }
              ((k) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_16_2);
              stackIn_18_0 = pm.field_R;
              stackIn_18_1 = -16171;
              if (param3.a((byte) 57)) {
                stackIn_19_2 = var8;
              } else {
                stackIn_19_2 = "";
              }
              ((k) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_19_2);
              ma.field_a.a(-99, 16);
              ma.field_a.field_j = ma.field_a.field_j + 1;
              var9 = ma.field_a.field_j;
              hd.a(gn.field_L, (byte) 110, tp.field_v, pm.field_R, ma.field_a);
              ma.field_a.e(param6 + 173, -var9 + ma.field_a.field_j);
            } else {
              var9 = 0;
              pm.field_R.field_j = 0;
              if (param0) {
                var9 = var9 | 1;
              }
              pm.field_R.b(-11, c.field_c.nextInt());
              pm.field_R.b(90, c.field_c.nextInt());
              pm.field_R.b(-16171, var14);
              pm.field_R.b(-16171, var8);
              var15 = (CharSequence) ((Object) param4);
              pm.field_R.b(-16171, nq.a(-50, var15));
              pm.field_R.a(param5, (byte) -91);
              pm.field_R.a(param6 ^ 37, param2);
              pm.field_R.a(param6 ^ 19, var9);
              ma.field_a.a(120, 18);
              ma.field_a.field_j = ma.field_a.field_j + 2;
              var10 = ma.field_a.field_j;
              var11_ref_StringLifetime4 = wg.a(0, jl.b(param6 + 92));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              ma.field_a.a(var11_ref_StringLifetime4, (byte) 105);
              hd.a(gn.field_L, (byte) -123, tp.field_v, pm.field_R, ma.field_a);
              ma.field_a.b(false, ma.field_a.field_j - var10);
            }
            cb.a(-1, false);
            vo.field_l = mf.field_c;
          }
          if (mf.field_c == vo.field_l &&
            fa.b(10, 1)) {
            var9Lifetime1 = s.field_e.g(31365);
            s.field_e.field_j = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              hb.field_b = new String[var9Lifetime1 - 100];
              vo.field_l = sa.field_n;
            } else {
              if (248 == var9Lifetime1) {
                og.a(param6 ^ -92, jl.b(0));
                ol.field_q = pa.field_Y;
                ak.a((byte) -115);
                sk.field_j = false;
                stackIn_31_0 = var9Lifetime1;
                return stackIn_31_0;
              }
              if (var9Lifetime1 == 99) {
                fa.b(10, wm.f(1));
                dd.field_d = new Boolean(fq.a(s.field_e, (byte) -114));
                s.field_e.field_j = 0;
              } else {
                vo.field_l = pq.field_p;
                op.field_i = var9Lifetime1;
                hd.field_q = -1;
              }
            }
          }
          if (sa.field_n == vo.field_l) {
            var9Lifetime2 = 2;
            if (fa.b(param6 ^ -82, var9Lifetime2)) {
              var10Lifetime1 = s.field_e.d((byte) 69);
              s.field_e.field_j = 0;
              if (fa.b(10, var10Lifetime1)) {
                var11 = hb.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  hb.field_b[var12] = s.field_e.c(0);
                }
                ak.a((byte) -123);
                sk.field_j = false;
                stackIn_41_0 = var11 + 100;
                return stackIn_41_0;
              }
            }
          }
          if (pq.field_p == vo.field_l &&
            dd.a(param6 ^ -92)) {
            if (op.field_i == 255) {
              var9_ref_String = s.field_e.g((byte) -89);
              if (var9_ref_String != null) {
                jh.a(jl.b(0), -1, var9_ref_String);
              }
            } else {
              ol.field_q = s.field_e.f((byte) -71);
            }
            ak.a((byte) -118);
            sk.field_j = false;
            stackIn_50_0 = op.field_i;
            return stackIn_50_0;
          }
          if (param6 != -92) {
            field_F = 21;
          }
          if (ki.field_h == null) {
            if (sk.field_j) {
              if (he.b((byte) -22) > 30000L) {
                ol.field_q = aj.field_l;
              } else {
                ol.field_q = ga.field_w;
              }
              sk.field_j = false;
              stackIn_60_0 = 249;
              return stackIn_60_0;
            }
            var9Lifetime3 = jo.field_b;
            jo.field_b = ff.field_s;
            sk.field_j = true;
            ff.field_s = var9Lifetime3;
          }
          stackIn_62_0 = -1;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_65_0 = var7;
          stackIn_65_1 = new StringBuilder().append("mg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    mg(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_I = hp.a((byte) 44, g.field_a, 5);
    }

    final void f(byte param0) {
        int fieldTemp$0 = 0;
        br var2_ref_br;
        double var2;
        wb var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_G = this.field_G + 1;
        if (120 <= this.field_G) {
          this.field_G = 0;
        }
        fieldTemp$0 = this.field_I;
        this.field_I = this.field_I + 1;
        if (fieldTemp$0 > 5) {
          this.field_I = 0;
          var2_ref_br = fb.field_e.field_H.c(109);
          while (var2_ref_br instanceof id) {
            if (var2_ref_br instanceof wb) {
              var3 = (wb) (var2_ref_br);
              var4 = var3.g(-116) - this.g(-34) - 12;
              var5 = var3.h(122) - this.h(-70);
              if (var4 * var4 + var5 * var5 < 576 &&
                fb.field_e.field_I.a(69, this.field_C, 255)) {
                nm.b(-127, 9);
                iq.a(this.field_C, (byte) 99);
                this.a(true);
                return;
              }
            }
            var2_ref_br = var2_ref_br.field_d;
          }
        }
        hp.field_l = new int[120];
        hp.field_g = new int[120];
        hp.field_j = new int[8][16];
        if (param0 >= -79) {
          return;
        }
        var2 = 0.05235987755982988;
        for (var4Lifetime1 = 0; 120 > var4Lifetime1; var4Lifetime1++) {
          hp.field_l[var4Lifetime1] = (int)(24.0 * Math.cos((double)var4Lifetime1 * var2));
          hp.field_g[var4Lifetime1] = (int)(24.0 * Math.sin(var2 * (double)var4Lifetime1));
        }
        for (var4Lifetime2 = 0; hp.field_j[0].length > var4Lifetime2; var4Lifetime2++) {
          var5Lifetime1 = 16 * var4Lifetime2;
          hp.field_j[0][var4Lifetime2] = cr.b(tq.b(65410, var5Lifetime1 << 8), tq.b(var5Lifetime1, 255));
          hp.field_j[1][var4Lifetime2] = cr.b(var5Lifetime1 << 8, var5Lifetime1 << 16);
          hp.field_j[2][var4Lifetime2] = cr.b(tq.b(65493, var5Lifetime1 << 8), tq.b(255, var5Lifetime1 / 2));
          hp.field_j[3][var4Lifetime2] = var5Lifetime1 * 65793;
          hp.field_j[4][var4Lifetime2] = cr.b(tq.b(var5Lifetime1, 771752446) << 7, var5Lifetime1 << 16);
          hp.field_j[5][var4Lifetime2] = var5Lifetime1 << 16;
          hp.field_j[6][var4Lifetime2] = var5Lifetime1 << 16;
          hp.field_j[7][var4Lifetime2] = cr.b(var5Lifetime1, cr.b(tq.b(var5Lifetime1 << 6, 65326), tq.b(var5Lifetime1, 1477444604) << 14));
        }
        return;
    }

    final static void a(int param0, int param1, byte param2, int param3, rp param4, int param5, int param6) {
        ef var8 = null;
        try {
          int var7_int = 73 % ((param2 + 45) / 36);
          var8 = qp.field_w;
          nm.field_w.c(param6, param3, param5);
          wa.field_b[param0].c(param6 + 17, param3 + 21, param5);
          jq.a(cr.a(param0, -83), 33 + param3, (byte) 2, param4.field_t[param0], param5, -16 + param6);
          if (param1 != 255) {
            jq.a(cr.a(param1, -100), param3 + 21, (byte) 2, param4.field_t[param1], param5, param6 - 39);
            ((fm) ((Object) var8)).a(gh.field_f[param1], param6 + 29, 48 + param3, 16777215, 1, param5);
          }
          ((fm) ((Object) var8)).a(gh.field_f[param0], param6 + 29, 58 + param3, 16777215, 1, param5);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          rp var2 = (rp) null;
          mg.a(-13, 21, (byte) 127, 95, (rp) null, 24, -18);
        }
        sq.field_N = true;
        va.field_a = 0;
    }

    final void a(int param0, nm param1) {
        int var11 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = this.field_G % 30;
          if (var3_int > 15) {
            var3_int = -var3_int + 30;
          }
          if (var3_int > 8) {
            var3_int = 4;
          } else {
            if (var3_int <= 3) {
              var3_int = (var3_int <= 1) ? 1 : 2;
            } else {
              var3_int = 3;
            }
          }
          if (param0 != -10136) {
            return;
          }
          var4 = param1.c(this.g(74), -20126);
          var5 = param1.d(-var3_int + this.h(93), 117) - 24;
          if (var4 >= -48 &&
            var5 >= -48 &&
            var4 <= 640 &&
            var5 <= 480) {
            var6 = 12 + var4 - 1;
            var7 = 12 + var5 - 1;
            var9 = 10;
            var10 = 2;
            for (var11 = 0; var11 < 6; var11++) {
              var8 = (6 * var11 + this.field_G) % 120;
              oo.d(hp.field_l[var8] + var6, var7 + hp.field_g[var8], 6, 0, var11 * var9);
              oo.a(hp.field_l[var8] + var6 << 4, var7 + hp.field_g[var8] << 4, 96, var11 * var10, hp.field_j[this.field_C]);
              var8 = (60 + var8) % 120;
              oo.d(hp.field_l[var8] + var6, hp.field_g[var8] + var7, 6, 0, var11 * var9);
              oo.a(hp.field_l[var8] + var6 << 4, var7 + hp.field_g[var8] << 4, 96, var10 * var11, hp.field_j[this.field_C]);
            }
            wa.field_b[this.field_C].g(var4, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_F = 68;
        field_J = Math.atan2(1.0, 0.0);
    }
}
