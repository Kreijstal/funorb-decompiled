/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static hj field_b;
    static String field_c;
    static qd field_a;
    static int[] field_d;

    final static void a(int param0) {
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        boolean stackIn_56_2 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        boolean stackIn_65_2 = false;
        RuntimeException decompiledCaughtException = null;
        hj var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        hj var12 = null;
        String var14 = null;
        hj var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null != me.field_g &&
            me.field_g.b(-1) &&
            me.field_g.b((byte) 70, "benefits") &&
            null != sf.field_q &&
            sf.field_q.b(param0 - 242) &&
            sf.field_q.b((byte) -100, "benefits")) {
            vg.field_i = fk.a(me.field_g, "headline", -114, "benefits");
            nl.field_e = fk.a(me.field_g, "blurbpane", -63, "benefits");
            rl.field_a = fk.a(me.field_g, "button", -53, "benefits");
            rh.field_b = fk.a(me.field_g, "signup_text", param0 - 143, "benefits");
            hd.field_e = fk.a(me.field_g, "menu_text", -109, "benefits");
            bl.field_n = fk.a(me.field_g, "button_frame", -76, "benefits");
            field_b = fk.a(me.field_g, "arrow", param0 - 201, "benefits");
            lj.field_m = (kc) ((Object) b.a("large_font", "benefits", -121, sf.field_q, me.field_g));
            rc.field_a = (kc) ((Object) b.a("small_font", "benefits", -114, sf.field_q, me.field_g));
            var28 = ul.field_b;
            var2 = ul.field_f;
            var3 = ul.field_l;
            ul.a(rh.field_e);
            var11 = new hj(4 + field_b.field_o, 4 + field_b.field_k);
            var11.d();
            field_b.d(2, 2, pl.field_d);
            ve.a(2, var11.field_k, var11, var11.field_o, 1, 0, (byte) 91, 0);
            field_b = var11;
            oh.field_a = field_b.b();
            var12 = new hj(195, 221);
            var6 = var12.field_o / 2;
            var12.d();
            lj.field_m.c(t.a(-415993727, new String[]{lf.field_c}, qj.field_a), var6, 40, 16777215, -1);
            rc.field_a.c(t.a(param0 ^ -415993744, new String[]{lf.field_c}, ud.field_p), var6, 60, 16777215, -1);
            lj.field_m.c(t.a(-415993727, new String[]{pl.field_a}, ea.field_g), var6, 110, 16777215, -1);
            rc.field_a.c(t.a(-415993727, new String[]{pl.field_a}, qb.field_b), var6, 130, 16777215, -1);
            lj.field_m.c(tg.field_d, var6, 180, 16777215, -1);
            rc.field_a.c(mm.field_E, var6, 200, 16777215, -1);
            ve.a(3, var12.field_k, var12, var12.field_o, 1, 0, (byte) 98, 0);
            nl.field_e.d();
            var12.c(18 - nl.field_e.field_p, -nl.field_e.field_u + 241);
            for (var7 = 0; tb.field_c.length > var7; var7++) {
              il.field_e[var7].d();
              rc.field_a.a(tb.field_c[var7], 3, 3, il.field_e[var7].field_o - 6, il.field_e[var7].field_k - 6, pl.field_d, -1, 1, 1, rc.field_a.field_B + rc.field_a.field_H);
              ve.a(3, il.field_e[var7].field_k, il.field_e[var7], il.field_e[var7].field_o, 1, 0, (byte) 61, 0);
            }
            tb.field_c = null;
            ke.field_c = rh.field_b.f();
            ke.field_c.d();
            ld.a(ul.field_f, 103, 64, 0, 0, 2 * ul.field_l / 3);
            ul.a(var28, var2, var3);
            ul.b(rh.field_e);
            gb.field_d = (-bl.field_n.field_o + rl.field_a.field_o) / 2 + 231;
            ua.field_c = (rl.field_a.field_k - bl.field_n.field_k) / 2 + 390;
            ce.field_a = (rl.field_a.field_o - bl.field_n.field_o) / 2 + 434;
            me.field_g = null;
            ug.field_q = 390 + (-bl.field_n.field_k + rl.field_a.field_k) / 2;
          }
          if (null == hc.field_l) {
            return;
          }
          if (pf.field_b != null &&
            lj.field_m != null) {
            var29 = ul.field_b;
            var2Lifetime1 = ul.field_f;
            var3Lifetime1 = ul.field_l;
            ul.a(rh.field_e);
            var14 = t.a(-415993727, new String[]{li.field_b[ml.field_j]}, se.field_n);
            var5 = lj.field_m.c(var14, vg.field_l);
            var6Lifetime1 = lj.field_m.a(var14, vg.field_l, lj.field_m.field_H + lj.field_m.field_B);
            var7Lifetime1 = (vg.field_l - var5) / 2 + ok.field_f;
            var5 += 6;
            var7Lifetime1 -= 3;
            var8 = (qf.field_m - var6Lifetime1) / 2 + pa.field_d;
            var6Lifetime1 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              pf.field_b.field_p = pf.field_b.field_p + var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              qb.field_c = qb.field_c - var9_int;
              var5 = var5 + var9_int * 2;
              ok.field_f = ok.field_f + var9_int;
              pf.field_b.field_s = pf.field_b.field_s + var9_int * 2;
            }
            var8 -= 3;
            if (pf.field_b.field_s < var5 + var7Lifetime1) {
              var9_intLifetime1 = var5 + (var7Lifetime1 - pf.field_b.field_s);
              var5 = var5 + var9_intLifetime1 * 2;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              qb.field_c = qb.field_c - var9_intLifetime1;
              pf.field_b.field_p = pf.field_b.field_p + var9_intLifetime1;
              pf.field_b.field_s = pf.field_b.field_s + 2 * var9_intLifetime1;
              ok.field_f = ok.field_f + var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              pf.field_b.field_u = pf.field_b.field_u + var9_intLifetime2;
              ld.field_a = ld.field_a - var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              pa.field_d = pa.field_d + var9_intLifetime2;
              pf.field_b.field_t = pf.field_b.field_t + var9_intLifetime2 * 2;
            }
            if (pf.field_b.field_t < var6Lifetime1 + var8) {
              var9_intLifetime3 = var6Lifetime1 + var8 - pf.field_b.field_t;
              ld.field_a = ld.field_a - var9_intLifetime3;
              pf.field_b.field_u = pf.field_b.field_u + var9_intLifetime3;
              pf.field_b.field_t = pf.field_b.field_t + var9_intLifetime3 * 2;
              pa.field_d = pa.field_d + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
            }
            pf.field_b.e();
            var9 = new hj(pf.field_b.field_s, pf.field_b.field_t);
            var9.d();
            lj.field_m.a(var14, ok.field_f, pa.field_d, vg.field_l, qf.field_m, 16777215, -1, 1, 1, lj.field_m.field_H + lj.field_m.field_B);
            ve.a(3, var9.field_t, var9, var9.field_s, 1, 0, (byte) 88, 0);
            pf.field_b.d();
            var9.c(0, 0);
            qe.field_b = new hj(640, 480);
            qe.field_b.d();
            pf.field_b.a(qb.field_c + (pf.field_b.field_s >> 1), (pf.field_b.field_t >> 1) + ld.field_a, ba.field_c, 4096);
            pf.field_b = null;
            qe.field_b.a();
            ul.a(var29, var2Lifetime1, var3Lifetime1);
            ul.b(rh.field_e);
          }
          if (pj.field_k != null &&
            rc.field_a != null) {
            var30 = ul.field_b;
            var2Lifetime2 = ul.field_f;
            var3Lifetime2 = ul.field_l;
            ul.a(rh.field_e);
            var16 = new hj(412, 43);
            var17 = t.a(-415993727, new String[]{pj.field_k}, oc.field_U);
            pj.field_k = null;
            var16.d();
            rc.field_a.a(var17, 3, 3, var16.field_o - 6, -6 + var16.field_k, 16777215, -1, 0, 1, rc.field_a.field_B + rc.field_a.field_H);
            ve.a(3, var16.field_k, var16, var16.field_o, 1, 0, (byte) 55, 0);
            hc.field_l.d();
            var16.c(199 - hc.field_l.field_p, 83 - hc.field_l.field_u);
            ul.a(var30, var2Lifetime2, var3Lifetime2);
            ul.b(rh.field_e);
          }
          if (lc.field_w != null &&
            null != rc.field_a) {
            var31 = ul.field_b;
            var2Lifetime3 = ul.field_f;
            var3Lifetime3 = ul.field_l;
            ul.a(rh.field_e);
            var4 = rc.field_a.c(aa.field_b, 640) + 6;
            var5Lifetime1 = 20 + (var4 + lc.field_w.field_s);
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = lc.field_w.field_s + (var6Lifetime2 + 20);
            hc.field_l.d();
            rc.field_a.b(aa.field_b, var7Lifetime2 - hc.field_l.field_p, rc.field_a.field_B + 155 - (hc.field_l.field_u - rc.field_a.field_H), 16777215, -1);
            ve.a(3, 50, hc.field_l, var4, 1, -hc.field_l.field_p + (var7Lifetime2 - 4), (byte) 64, 155 - hc.field_l.field_u);
            var8Lifetime1 = -hc.field_l.field_u + (155 - (-rc.field_a.field_B - rc.field_a.field_H - 3 + lc.field_w.field_t) / 2);
            lc.field_w.c(-hc.field_l.field_p + var6Lifetime2, var8Lifetime1);
            ul.a(var31, var2Lifetime3, var3Lifetime3);
            ul.b(rh.field_e);
            lc.field_w = null;
          }
          ul.a(rh.field_e);
          ul.a(16, 16, 608, 112, 15, uh.field_a, hd.field_t);
          ul.a(231, 144, 393, 232, 15, uh.field_a, hd.field_t);
          if (vg.field_i != null) {
            vg.field_i.c(0, 0);
          }
          if (nl.field_e != null) {
            nl.field_e.c(0, 0);
          }
          hc.field_l.c(0, 0);
          if (null != qe.field_b) {
            qe.field_b.c(0, 0);
          }
          if (param0 != 241) {
            field_b = (hj) null;
          }
          if (rl.field_a != null &&
            bl.field_n != null) {
            rl.field_a.c(231, 390);
            var1 = rh.field_b;
            if (wj.field_k.field_h == 0) {
              var1 = ke.field_c;
            }
            var1.c(0, 0);
            stackIn_49_0 = 40;
            stackIn_49_1 = le.field_c;
            if (0 != wj.field_k.field_h) {
              stackIn_50_2 = 3;
            } else {
              stackIn_50_2 = 4;
            }
            var2Lifetime4 = stackIn_49_0 + (fm.a(stackIn_49_1 << stackIn_50_2, 2047) * 40 >> 16);
            if (var2Lifetime4 > 0) {
              rl.field_a.e(230, 389, var2Lifetime4);
              rl.field_a.e(232, 389, var2Lifetime4);
              rl.field_a.e(232, 391, var2Lifetime4);
              rl.field_a.e(230, 391, var2Lifetime4);
              var1.e(1, 1, var2Lifetime4);
              var1.e(-1, 1, var2Lifetime4);
              var1.e(1, -1, var2Lifetime4);
              var1.e(-1, -1, var2Lifetime4);
            }
            stackIn_55_0 = 8;
            stackIn_55_1 = ua.field_c;
            stackIn_56_2 = (wj.field_k.field_h == 0);
            fh.$cfr$intArgs$a$a1440e9a5aa4(stackIn_55_0, stackIn_55_1, stackIn_56_2, gb.field_d);
          }
          if (null != rl.field_a &&
            bl.field_n != null) {
            rl.field_a.c(434, 390);
            hd.field_e.c(0, 0);
            if (wj.field_k.field_h == 1) {
              ld.a(-4 + rl.field_a.field_o, param0 - 155, 64, 392, 436, 7 * rl.field_a.field_k / 12);
            }
            stackIn_64_0 = 8;
            stackIn_64_1 = ug.field_q;
            stackIn_65_2 = (wj.field_k.field_h == 1);
            fh.$cfr$intArgs$a$a1440e9a5aa4(stackIn_64_0, stackIn_64_1, stackIn_65_2, ce.field_a);
          }
          if (null != field_b) {
            var1_int = 357 - field_b.field_t / 2;
            field_b.c(269 - field_b.field_s, var1_int);
            oh.field_a.c(586, var1_int);
            if (vl.field_d > var1_int &&
              vl.field_d < field_b.field_k + var1_int) {
              var2Lifetime5 = (40 * fm.a(le.field_c << 4, 2047) >> 16) + 40;
              if (var2Lifetime5 > 0) {
                if (269 - field_b.field_o < ua.field_a &&
                  269 > ua.field_a) {
                  field_b.e(269 - (field_b.field_s + 1), var1_int - 1, var2Lifetime5);
                  field_b.e(-field_b.field_s + 270, var1_int - 1, var2Lifetime5);
                  field_b.e(-field_b.field_s + 269 - 1, 1 + var1_int, var2Lifetime5);
                  field_b.e(269 - (field_b.field_s - 1), var1_int + 1, var2Lifetime5);
                } else {
                  if (ua.field_a > 586) {
                    if (ua.field_a >= field_b.field_o + 586) {
                      ei.a(-463);
                      il.field_e[kb.field_m].c(269, 340);
                      return;
                    }
                    oh.field_a.e(585, var1_int - 1, var2Lifetime5);
                    oh.field_a.e(587, var1_int - 1, var2Lifetime5);
                    oh.field_a.e(585, 1 + var1_int, var2Lifetime5);
                    oh.field_a.e(587, 1 + var1_int, var2Lifetime5);
                  }
                }
              }
            }
          }
          ei.a(-463);
          il.field_e[kb.field_m].c(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "fm.C(" + param0 + ')');
        }
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        fc stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param0.length > 136) {
            var3 = new fc();
            ((ll) ((Object) var3)).a(110, param0);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 != 3) {
            field_d = (int[]) null;
          }
          if (param2) {
            stackIn_13_0 = n.a(param0, (byte) 118);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("fm.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(og param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        og var4 = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null == param0.field_k) {
            return;
          }
          var2_int = -3 % ((param1 - 27) / 44);
          if (param0.field_c != 0 ||
            0 != param0.field_f) {
            for (var3 = 0; var3 < gl.field_b; var3++) {
              var4 = jk.field_d[var3];
              if (var4.field_d == 2 &&
                param0.field_c == var4.field_c &&
                param0.field_f == var4.field_f) {
                return;
              }
            }
          }
          if (param0.field_i != null) {
          }
          ia.a(param0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("fm.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final static int a(int param0, int param1) {
        if (param1 != 2047) {
          field_d = (int[]) null;
        }
        return wi.field_f[param0 & 2047];
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -64) {
          field_c = (String) null;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param4 < 85) {
          fm.a(-62, -45);
        }
        stackIn_8_0 = (param5 >= param2) && (param2 + param3 > param5) && (param0 <= param1) && (param1 < param6 + param0);
        return stackIn_8_0;
    }

    static {
        field_a = new qd();
        field_d = new int[8192];
    }
}
