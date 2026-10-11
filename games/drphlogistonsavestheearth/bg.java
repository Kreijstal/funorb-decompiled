/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends gi {
    int field_m;
    static he[] field_t;
    int field_i;
    static String field_q;
    int field_s;
    static String field_p;
    int field_o;
    static int field_r;
    static int field_k;
    int[] field_l;
    int field_h;
    int field_u;
    int field_j;
    long field_n;

    final static void a(boolean param0) {
        dd.a((byte) 123, nb.a(-100));
        if (param0) {
          field_t = (he[]) null;
        }
    }

    final static void d(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_52_3 = 0;
        boolean stackIn_58_0 = false;
        boolean stackIn_67_0 = false;
        RuntimeException decompiledCaughtException = null;
        nh var1 = null;
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
        nh var9 = null;
        int var10 = 0;
        nh var11 = null;
        nh var12 = null;
        String var14 = null;
        nh var16 = null;
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
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (null != ce.field_a &&
            ce.field_a.a(0) &&
            ce.field_a.a(param0 ^ -11140, "benefits") &&
            null != sb.field_g &&
            sb.field_g.a(0) &&
            sb.field_g.a(param0 ^ -11140, "benefits")) {
            ua.field_c = qk.a("benefits", ce.field_a, "headline", true);
            t.field_d = qk.a("benefits", ce.field_a, "blurbpane", true);
            r.field_b = qk.a("benefits", ce.field_a, "button", true);
            eg.field_d = qk.a("benefits", ce.field_a, "signup_text", true);
            nj.field_f = qk.a("benefits", ce.field_a, "menu_text", true);
            uh.field_r = qk.a("benefits", ce.field_a, "button_frame", true);
            sc.field_c = qk.a("benefits", ce.field_a, "arrow", true);
            md.field_a = (rf) ((Object) kc.a(sb.field_g, ce.field_a, "benefits", 125, "large_font"));
            sc.field_f = (rf) ((Object) kc.a(sb.field_g, ce.field_a, "benefits", 64, "small_font"));
            var28 = wj.field_l;
            var2 = wj.field_k;
            var3 = wj.field_c;
            wj.b(ha.field_d);
            var11 = new nh(sc.field_c.field_y + 4, 4 + sc.field_c.field_w);
            var11.c();
            sc.field_c.d(2, 2, rh.field_e);
            p.a(var11.field_y, 2, 0, var11.field_w, 1, 0, 0, var11);
            sc.field_c = var11;
            lb.field_x = sc.field_c.e();
            var12 = new nh(195, 221);
            var6 = var12.field_y / 2;
            var12.c();
            md.field_a.b(a.a(5044, ja.field_g, new String[]{dc.field_f}), var6, 40, 16777215, -1);
            sc.field_f.b(a.a(5044, ek.field_p, new String[]{dc.field_f}), var6, 60, 16777215, -1);
            md.field_a.b(a.a(param0 ^ -14537, gk.field_a, new String[]{fl.field_d}), var6, 110, 16777215, -1);
            sc.field_f.b(a.a(param0 ^ -14537, ta.field_g, new String[]{fl.field_d}), var6, 130, 16777215, -1);
            md.field_a.b(lc.field_k, var6, 180, 16777215, -1);
            sc.field_f.b(nb.field_c, var6, 200, 16777215, -1);
            p.a(var12.field_y, 3, 0, var12.field_w, 1, 0, 0, var12);
            t.field_d.c();
            var12.d(18 - t.field_d.field_D, -t.field_d.field_v + 241);
            for (var7 = 0; var7 < bc.field_b.length; var7++) {
              bh.field_c[var7].c();
              sc.field_f.a(bc.field_b[var7], 3, 3, -6 + bh.field_c[var7].field_y, bh.field_c[var7].field_w - 6, rh.field_e, -1, 1, 1, sc.field_f.field_x + sc.field_f.field_S);
              p.a(bh.field_c[var7].field_y, 3, 0, bh.field_c[var7].field_w, 1, 0, 0, bh.field_c[var7]);
            }
            bc.field_b = null;
            ul.field_c = eg.field_d.a();
            ul.field_c.c();
            fk.a(2 * wj.field_c / 3, wj.field_k, 0, 64, (byte) 104, 0);
            wj.a(var28, var2, var3);
            wj.a(ha.field_d);
            ch.field_A = (r.field_b.field_y - uh.field_r.field_y) / 2 + 434;
            ka.field_o = 231 + (-uh.field_r.field_y + r.field_b.field_y) / 2;
            ce.field_a = null;
            v.field_N = 390 + (r.field_b.field_w - uh.field_r.field_w) / 2;
            tb.field_c = 390 + (r.field_b.field_w - uh.field_r.field_w) / 2;
          }
          if (null == hf.field_D) {
            return;
          }
          if (hf.field_z != null &&
            md.field_a != null) {
            var29 = wj.field_l;
            var2Lifetime1 = wj.field_k;
            var3Lifetime1 = wj.field_c;
            wj.b(ha.field_d);
            var14 = a.a(5044, rg.field_d, new String[]{ka.field_p[gd.field_a]});
            var5 = md.field_a.b(var14, ca.field_db);
            var6Lifetime1 = md.field_a.a(var14, ca.field_db, md.field_a.field_S + md.field_a.field_x);
            var7Lifetime1 = (ca.field_db - var5) / 2 + fe.field_a;
            var5 += 6;
            var7Lifetime1 -= 3;
            var8 = ph.field_e + (-var6Lifetime1 + af.field_d) / 2;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              var5 = var5 + 2 * var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              hf.field_z.field_z = hf.field_z.field_z + var9_int * 2;
              fe.field_a = fe.field_a + var9_int;
              hd.field_B = hd.field_B - var9_int;
              hf.field_z.field_D = hf.field_z.field_D + var9_int;
            }
            var8 -= 3;
            var6Lifetime1 += 6;
            if (var7Lifetime1 + var5 > hf.field_z.field_z) {
              var9_intLifetime1 = var5 + (var7Lifetime1 - hf.field_z.field_z);
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              hf.field_z.field_D = hf.field_z.field_D + var9_intLifetime1;
              hf.field_z.field_z = hf.field_z.field_z + var9_intLifetime1 * 2;
              fe.field_a = fe.field_a + var9_intLifetime1;
              var5 = var5 + var9_intLifetime1 * 2;
              hd.field_B = hd.field_B - var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              ph.field_e = ph.field_e + var9_intLifetime2;
              ac.field_a = ac.field_a - var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
              hf.field_z.field_v = hf.field_z.field_v + var9_intLifetime2;
              hf.field_z.field_C = hf.field_z.field_C + 2 * var9_intLifetime2;
            }
            if (hf.field_z.field_C < var8 + var6Lifetime1) {
              var9_intLifetime3 = var6Lifetime1 + (var8 - hf.field_z.field_C);
              ac.field_a = ac.field_a - var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              ph.field_e = ph.field_e + var9_intLifetime3;
              hf.field_z.field_C = hf.field_z.field_C + var9_intLifetime3 * 2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              hf.field_z.field_v = hf.field_z.field_v + var9_intLifetime3;
            }
            hf.field_z.b();
            var9 = new nh(hf.field_z.field_z, hf.field_z.field_C);
            var9.c();
            md.field_a.a(var14, fe.field_a, ph.field_e, ca.field_db, af.field_d, 16777215, -1, 1, 1, md.field_a.field_x + md.field_a.field_S);
            p.a(var9.field_z, 3, 0, var9.field_C, 1, 0, 0, var9);
            hf.field_z.c();
            var9.d(0, 0);
            qa.field_L = new nh(640, 480);
            qa.field_L.c();
            hf.field_z.c(hd.field_B + (hf.field_z.field_z >> 1), (hf.field_z.field_C >> 1) + ac.field_a, ib.field_l, 4096);
            hf.field_z = null;
            qa.field_L.d();
            wj.a(var29, var2Lifetime1, var3Lifetime1);
            wj.a(ha.field_d);
          }
          if (param0 != -11133) {
            field_r = 6;
          }
          if (df.field_b != null &&
            null != sc.field_f) {
            var30 = wj.field_l;
            var2Lifetime2 = wj.field_k;
            var3Lifetime2 = wj.field_c;
            wj.b(ha.field_d);
            var16 = new nh(412, 43);
            var17 = a.a(5044, jl.field_i, new String[]{df.field_b});
            df.field_b = null;
            var16.c();
            sc.field_f.a(var17, 3, 3, -6 + var16.field_y, var16.field_w - 6, 16777215, -1, 0, 1, sc.field_f.field_S + sc.field_f.field_x);
            p.a(var16.field_y, 3, 0, var16.field_w, 1, 0, 0, var16);
            hf.field_D.c();
            var16.d(-hf.field_D.field_D + 199, -hf.field_D.field_v + 83);
            wj.a(var30, var2Lifetime2, var3Lifetime2);
            wj.a(ha.field_d);
          }
          if (null != sa.field_e &&
            null != sc.field_f) {
            var31 = wj.field_l;
            var2Lifetime3 = wj.field_k;
            var3Lifetime3 = wj.field_c;
            wj.b(ha.field_d);
            var4 = sc.field_f.b(ej.field_b, 640) + 6;
            var5Lifetime1 = 20 + var4 + sa.field_e.field_z;
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 - (-sa.field_e.field_z - 20);
            hf.field_D.c();
            sc.field_f.c(ej.field_b, -hf.field_D.field_D + var7Lifetime2, sc.field_f.field_S + (sc.field_f.field_x - hf.field_D.field_v + 155), 16777215, -1);
            p.a(var4, 3, 0, 50, 1, -hf.field_D.field_v + 155, var7Lifetime2 + (-hf.field_D.field_D - 4), hf.field_D);
            var8Lifetime1 = -((-sc.field_f.field_S - sc.field_f.field_x + (sa.field_e.field_C - 3)) / 2) - hf.field_D.field_v + 155;
            sa.field_e.d(var6Lifetime2 - hf.field_D.field_D, var8Lifetime1);
            wj.a(var31, var2Lifetime3, var3Lifetime3);
            wj.a(ha.field_d);
            sa.field_e = null;
          }
          wj.b(ha.field_d);
          wj.a(16, 16, 608, 112, 15, qf.field_d, em.field_d);
          wj.a(231, 144, 393, 232, 15, qf.field_d, em.field_d);
          if (null != ua.field_c) {
            ua.field_c.d(0, 0);
          }
          if (t.field_d != null) {
            t.field_d.d(0, 0);
          }
          hf.field_D.d(0, 0);
          if (null != qa.field_L) {
            qa.field_L.d(0, 0);
          }
          if (r.field_b != null &&
            null != uh.field_r) {
            r.field_b.d(231, 390);
            var1 = eg.field_d;
            if (lb.field_w.field_f == 0) {
              var1 = ul.field_c;
            }
            var1.d(0, 0);
            stackIn_51_0 = 40;
            stackIn_51_1 = 0;
            stackIn_51_2 = k.field_L;
            if (lb.field_w.field_f == 0) {
              stackIn_52_3 = 4;
            } else {
              stackIn_52_3 = 3;
            }
            var2Lifetime4 = stackIn_51_0 + (k.b(stackIn_51_1, stackIn_51_2 << stackIn_52_3) * 40 >> 16);
            if (var2Lifetime4 > 0) {
              r.field_b.a(230, 389, var2Lifetime4);
              r.field_b.a(232, 389, var2Lifetime4);
              r.field_b.a(232, 391, var2Lifetime4);
              r.field_b.a(230, 391, var2Lifetime4);
              var1.a(1, 1, var2Lifetime4);
              var1.a(-1, 1, var2Lifetime4);
              var1.a(1, -1, var2Lifetime4);
              var1.a(-1, -1, var2Lifetime4);
            }
            stackIn_58_0 = (lb.field_w.field_f == 0);
            qj.a(stackIn_58_0, tb.field_c, ka.field_o, true);
          }
          if (null != r.field_b &&
            uh.field_r != null) {
            r.field_b.d(434, 390);
            nj.field_f.d(0, 0);
            if (lb.field_w.field_f == 1) {
              fk.a(7 * r.field_b.field_w / 12, -4 + r.field_b.field_y, 392, 64, (byte) -73, 436);
            }
            stackIn_67_0 = (1 == lb.field_w.field_f);
            qj.a(stackIn_67_0, v.field_N, ch.field_A, true);
          }
          if (sc.field_c != null) {
            var1_int = -(sc.field_c.field_C / 2) + 357;
            sc.field_c.d(-sc.field_c.field_z + 269, var1_int);
            lb.field_x.d(586, var1_int);
            if (ob.field_g > var1_int &&
              var1_int + sc.field_c.field_w > ob.field_g) {
              var2Lifetime5 = 40 + (k.b(0, k.field_L << 4) * 40 >> 16);
              if (var2Lifetime5 <= 0) {
                wd.b(139);
                bh.field_c[ig.field_k].d(269, 340);
                return;
              }
              if (ck.field_c > -sc.field_c.field_y + 269 &&
                ck.field_c < 269) {
                sc.field_c.a(-1 + (269 - sc.field_c.field_z), -1 + var1_int, var2Lifetime5);
                sc.field_c.a(270 - sc.field_c.field_z, var1_int - 1, var2Lifetime5);
                sc.field_c.a(-1 + (269 - sc.field_c.field_z), var1_int + 1, var2Lifetime5);
                sc.field_c.a(-sc.field_c.field_z + 270, 1 + var1_int, var2Lifetime5);
              } else {
                if (ck.field_c > 586 &&
                  sc.field_c.field_y + 586 > ck.field_c) {
                  lb.field_x.a(585, -1 + var1_int, var2Lifetime5);
                  lb.field_x.a(587, var1_int - 1, var2Lifetime5);
                  lb.field_x.a(585, 1 + var1_int, var2Lifetime5);
                  lb.field_x.a(587, var1_int + 1, var2Lifetime5);
                }
              }
            }
          }
          wd.b(139);
          bh.field_c[ig.field_k].d(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "bg.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 != 102) {
          field_k = 75;
        }
        field_t = null;
        field_q = null;
    }

    final static vb a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param3 > -104) {
          return (vb) null;
        }
        vb var5 = (vb) (je.field_i.h(-11151));
        while (var5 != null) {
          if (~param1 == ~var5.field_i) {
            return var5;
          }
          var5 = (vb) (je.field_i.e(0));
        }
        var5 = new vb();
        var5.field_i = param1;
        var5.field_h = param0;
        var5.field_m = param4;
        je.field_i.a(var5, 255);
        mh.a(param2, (byte) -79, var5);
        return var5;
    }

    bg(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_o = param2;
          this.field_s = param3;
          this.field_j = param4;
          this.field_u = param0;
          this.field_l = param6;
          this.field_m = param1;
          fieldTemp$0 = vg.field_i;
          vg.field_i = vg.field_i + 1;
          this.field_i = 65535 & fieldTemp$0;
          this.field_h = param5;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "bg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Highscores";
    }
}
