/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static vn field_g;
    static boolean field_a;
    static String field_d;
    static String field_f;
    static v[] field_e;
    static vn[] field_c;
    static int field_b;

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        String stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        boolean stackIn_89_2 = false;
        String stackIn_109_0 = null;
        boolean stackIn_109_1 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ZombieDawn.field_J;
        try {
          pg.field_p = param0;
          ic.field_U = true;
          if (pg.field_p == 0) {
            var3_int = ja.a((byte) 16, jc.field_p, mf.field_a, di.field_O, ZombieDawn.field_K);
            var4 = 3 + var3_int;
            cj.field_h = new String[var4];
            hd.field_s = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              hd.field_s[var5] = -1;
            }
            qk.field_Kb = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              cj.field_h[var5] = jc.field_p[var5];
            }
            cj.field_h[-3 + var4] = "";
            cj.field_h[var4 - 2] = wd.field_w;
            hd.field_s[var4 - 2] = 0;
            qk.field_Kb[0] = 4;
            cj.field_h[-1 + var4] = re.field_c;
            hd.field_s[var4 - 1] = 1;
            qk.field_Kb[1] = 5;
          } else if (pg.field_p == 1) {
            var3_int = ja.a((byte) 16, jc.field_p, mf.field_a, di.field_O, ZombieDawn.field_K);
            var4 = 2 + var3_int;
            cj.field_h = new String[var4];
            hd.field_s = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              hd.field_s[var5] = -1;
            }
            qk.field_Kb = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              cj.field_h[var5] = jc.field_p[var5];
            }
            cj.field_h[var4 - 2] = "";
            cj.field_h[var4 - 1] = re.field_c;
            hd.field_s[-1 + var4] = 0;
            qk.field_Kb[0] = 5;
          } else if (pg.field_p != 2) {
            if (pg.field_p == 3) {
              if (vh.field_a.field_t) {
                var3_int = ja.a((byte) 16, jc.field_p, me.field_Cb, di.field_O, ZombieDawn.field_K);
              } else {
                var3_int = ja.a((byte) 16, jc.field_p, lo.field_n, di.field_O, ZombieDawn.field_K);
              }
              var4 = var3_int + 2;
              cj.field_h = new String[var4];
              hd.field_s = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                hd.field_s[var5] = -1;
              }
              qk.field_Kb = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                cj.field_h[var5] = jc.field_p[var5];
              }
              cj.field_h[-2 + var4] = "";
              cj.field_h[-1 + var4] = re.field_c;
              hd.field_s[-1 + var4] = 0;
              qk.field_Kb[0] = 5;
            } else if (pg.field_p == 4) {
              var3_int = ja.a((byte) 16, jc.field_p, d.field_a, di.field_O, ZombieDawn.field_K);
              var4 = var3_int + 2;
              cj.field_h = new String[var4];
              hd.field_s = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                hd.field_s[var5] = -1;
              }
              qk.field_Kb = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                cj.field_h[var5] = jc.field_p[var5];
              }
              cj.field_h[var4 - 2] = "";
              cj.field_h[var4 - 1] = re.field_c;
              hd.field_s[-1 + var4] = 0;
              qk.field_Kb[0] = 5;
            } else {
              if (pg.field_p != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ja.a((byte) 16, jc.field_p, hc.field_c, di.field_O, ZombieDawn.field_K);
              var4 = 3 + var3_int;
              hd.field_s = new int[var4];
              cj.field_h = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                hd.field_s[var5] = -1;
              }
              qk.field_Kb = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                cj.field_h[var5] = jc.field_p[var5];
              }
              cj.field_h[var4 - 3] = "";
              cj.field_h[-2 + var4] = ja.field_c;
              hd.field_s[-2 + var4] = 0;
              qk.field_Kb[0] = 3;
              cj.field_h[var4 - 1] = re.field_c;
              hd.field_s[-1 + var4] = 1;
              qk.field_Kb[1] = 5;
            }
          } else {
            var3_int = ja.a((byte) 16, jc.field_p, s.a(1938762664, pm.field_e, new String[]{"<br><%0><br>"}), di.field_O, ZombieDawn.field_K);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(jc.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            pn.field_R = new String[var4];
            gp.a(jc.field_p, 0, pn.field_R, 0, var4);
            hl.field_b = new String[-1 - var4 + var3_int];
            gp.a(jc.field_p, 1 + var4, hl.field_b, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = ja.a((byte) 16, jc.field_p, s.a(1938762664, ma.field_q, new String[]{"<br><%0><br>"}), di.field_O, ZombieDawn.field_K);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(jc.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            dl.field_h = new String[var4];
            gp.a(jc.field_p, 0, dl.field_h, 0, var4);
            bp.field_a = new String[-1 - var4 + var3_int];
            gp.a(jc.field_p, var4 + 1, bp.field_a, 0, var3_int - (var4 + 1));
            if (dl.field_h.length <= pn.field_R.length) {
              stackIn_57_0 = pn.field_R.length;
            } else {
              stackIn_57_0 = dl.field_h.length;
            }
            var5 = stackIn_57_0;
            if (hl.field_b.length < bp.field_a.length) {
              stackIn_60_0 = bp.field_a.length;
            } else {
              stackIn_60_0 = hl.field_b.length;
            }
            var6 = stackIn_60_0;
            var7 = var6 + var5 + 7;
            hd.field_s = new int[var7];
            cj.field_h = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              hd.field_s[var8] = -1;
            }
            hd.field_s[1] = 0;
            cj.field_h[1] = ap.field_s;
            qk.field_Kb = new int[2];
            cj.field_h[0] = bj.field_p;
            cj.field_h[2] = oo.field_S;
            qk.field_Kb[1] = 2;
            qk.field_Kb[0] = 5;
            cj.field_h[3] = ki.field_bb;
            cj.field_h[4] = ub.field_j;
            hd.field_s[3] = 1;
            cj.field_h[5] = "";
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_67_0 = cj.field_h;
              stackIn_67_1 = 6 + var8Lifetime2;
              if (var8Lifetime2 + dl.field_h.length - var5 < 0) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = dl.field_h[-var5 + var8Lifetime2 + dl.field_h.length];
              }
              stackIn_67_0[stackIn_67_1] = stackIn_68_2;
            }
            cj.field_h[var5 + 6] = null;
            hd.field_s[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_72_0 = cj.field_h;
              stackIn_72_1 = var8Lifetime3 + (var5 + 7);
              stackIn_72_2 = var8Lifetime3;
              stackIn_72_3 = bp.field_a.length;
              if (stackIn_72_2 < stackIn_72_3) {
                stackIn_75_2 = bp.field_a[var8Lifetime3];
              } else {
                stackIn_75_2 = "";
              }
              stackIn_72_0[stackIn_72_1] = stackIn_75_2;
            }
            ge.field_f = pd.a(-22826);
          }
          i.field_W.field_h = qk.field_Kb.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < cj.field_h.length; var4Lifetime1++) {
            stackIn_88_0 = cj.field_h[var4Lifetime1];
            stackIn_88_1 = true;
            stackIn_89_2 = !(hd.field_s[var4Lifetime1] < 0);
            var5Lifetime1 = tk.a(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (pg.field_p == 2) {
            var10 = pn.field_R;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = tk.a(var11, true, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = hl.field_b;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = tk.a(var12, true, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          p.field_d = i.field_W.field_h * (fe.field_H + cn.field_h << 1);
          if (param1 < 49) {
            stackIn_109_0 = (String) null;
            stackIn_109_1 = false;
            ti.a(stackIn_109_0, stackIn_109_1, true);
          }
          rg.field_E = -(var3_intLifetime1 >> 1) + mo.field_b + var3_intLifetime1;
          wh.field_c = mo.field_b - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; cj.field_h.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_114_0 = p.field_d;
            if (hd.field_s[var4Lifetime2] < 0) {
              stackIn_115_1 = vl.field_r;
            } else {
              stackIn_115_1 = qh.field_f;
            }
            p.field_d = stackIn_114_0 + stackIn_115_1;
          }
          wm.field_d = -(p.field_d >> 1) + ff.field_a;
          hm.field_F = new int[cj.field_h.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = wm.field_d;
          while (cj.field_h.length > var4Lifetime3) {
            var6Lifetime1 = hd.field_s[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = tk.a(cj.field_h[var4Lifetime3], true, true);
              var5Lifetime3 = var5Lifetime3 + fe.field_H;
              var8Lifetime1 = mo.field_b - (var7Lifetime2 >> 1);
              hm.field_F[var4Lifetime3] = new int[4];
              hm.field_F[var4Lifetime3][0] = var8Lifetime1 - lk.field_f;
              hm.field_F[var4Lifetime3][1] = var5Lifetime3;
              hm.field_F[var4Lifetime3][2] = (lk.field_f << 1) + var7Lifetime2;
              hm.field_F[var4Lifetime3][3] = qh.field_f + (cn.field_h << 1);
              var5Lifetime3 = var5Lifetime3 + ((cn.field_h << 1) + fe.field_H + qh.field_f);
            } else {
              var5Lifetime3 = var5Lifetime3 + vl.field_r;
            }
            var4Lifetime3++;
          }
          if (2 != pg.field_p) {
            i.field_W.a(param2, (byte) -70, r.b(6199969, ha.field_b, ei.field_K), 0);
          } else {
            i.field_W.a(param2, (byte) -75, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "ti.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_g = null;
        field_f = null;
        if (param0 != 4) {
          ti.a(126);
        }
        field_e = null;
    }

    final static void a(String param0, boolean param1, boolean param2) {
        try {
          pk.field_J = param1;
          ce.field_q = true;
          kk.field_i = new sg(e.field_S, rk.field_b, param0, nm.field_c, pk.field_J);
          if (param2) {
            String var4 = (String) null;
            ti.a((String) null, false, true);
          }
          e.field_S.a(kk.field_i, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ti.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new vn(540, 140);
        field_d = "SCREECH";
        field_f = "Play free version";
        field_a = false;
        field_b = 0;
    }
}
