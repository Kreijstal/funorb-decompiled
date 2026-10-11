/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static bb field_a;
    static bb field_b;
    static int field_d;
    static int field_c;

    final static void a(boolean param0, byte param1, int param2) {
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_34_2 = null;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        String stackIn_41_2 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        boolean stackIn_90_2 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
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
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          sm.field_l = true;
          ha.field_h = param2;
          if (ha.field_h == 0) {
            var3_int = qn.a(l.field_t, wb.field_c, kc.field_p, -128, bg.field_j);
            var4 = var3_int + 3;
            fo.field_a = new int[var4];
            vm.field_e = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              fo.field_a[var5] = -1;
            }
            jj.field_h = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              vm.field_e[var5] = kc.field_p[var5];
            }
            vm.field_e[-3 + var4] = "";
            vm.field_e[var4 - 2] = ln.field_k;
            fo.field_a[-2 + var4] = 0;
            jj.field_h[0] = 4;
            vm.field_e[-1 + var4] = od.field_Hb;
            fo.field_a[-1 + var4] = 1;
            jj.field_h[1] = 5;
          } else if (ha.field_h == 1) {
            var3_int = qn.a(l.field_t, wb.field_c, kc.field_p, -102, bg.field_j);
            var4 = 2 + var3_int;
            fo.field_a = new int[var4];
            vm.field_e = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              fo.field_a[var5] = -1;
            }
            jj.field_h = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              vm.field_e[var5] = kc.field_p[var5];
            }
            vm.field_e[-2 + var4] = "";
            vm.field_e[-1 + var4] = od.field_Hb;
            fo.field_a[-1 + var4] = 0;
            jj.field_h[0] = 5;
          } else if (ha.field_h != 2) {
            if (3 == ha.field_h) {
              if (!mc.field_k.field_x) {
                var3_int = qn.a(mn.field_a, wb.field_c, kc.field_p, -120, bg.field_j);
              } else {
                var3_int = qn.a(el.field_c, wb.field_c, kc.field_p, -115, bg.field_j);
              }
              var4 = 2 + var3_int;
              fo.field_a = new int[var4];
              vm.field_e = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                fo.field_a[var5] = -1;
              }
              jj.field_h = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                vm.field_e[var5] = kc.field_p[var5];
              }
              vm.field_e[var4 - 2] = "";
              vm.field_e[var4 - 1] = od.field_Hb;
              fo.field_a[var4 - 1] = 0;
              jj.field_h[0] = 5;
            } else if (ha.field_h == 4) {
              var3_int = qn.a(l.field_o, wb.field_c, kc.field_p, -118, bg.field_j);
              var4 = 2 + var3_int;
              vm.field_e = new String[var4];
              fo.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                fo.field_a[var5] = -1;
              }
              jj.field_h = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                vm.field_e[var5] = kc.field_p[var5];
              }
              vm.field_e[-2 + var4] = "";
              vm.field_e[-1 + var4] = od.field_Hb;
              fo.field_a[var4 - 1] = 0;
              jj.field_h[0] = 5;
            } else {
              if (ha.field_h != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = qn.a(ha.field_k, wb.field_c, kc.field_p, -118, bg.field_j);
              var4 = var3_int + 3;
              fo.field_a = new int[var4];
              vm.field_e = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                fo.field_a[var5] = -1;
              }
              jj.field_h = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                vm.field_e[var5] = kc.field_p[var5];
              }
              vm.field_e[var4 - 3] = "";
              vm.field_e[var4 - 2] = bg.field_b;
              fo.field_a[var4 - 2] = 0;
              jj.field_h[0] = 3;
              vm.field_e[var4 - 1] = od.field_Hb;
              fo.field_a[-1 + var4] = 1;
              jj.field_h[1] = 5;
            }
          } else {
            var3_int = qn.a(sd.a(lm.field_n, 84, new String[]{"<br><%0><br>"}), wb.field_c, kc.field_p, -128, bg.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(kc.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            df.field_r = new String[var4];
            qb.a(kc.field_p, 0, df.field_r, 0, var4);
            uk.field_r = new String[-1 + (var3_int - var4)];
            qb.a(kc.field_p, var4 + 1, uk.field_r, 0, var3_int + (-var4 - 1));
            var3_int = qn.a(sd.a(oj.field_R, 44, new String[]{"<br><%0><br>"}), wb.field_c, kc.field_p, -106, bg.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(kc.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            jk.field_d = new String[var4];
            qb.a(kc.field_p, 0, jk.field_d, 0, var4);
            hb.field_jb = new String[-var4 + (var3_int - 1)];
            qb.a(kc.field_p, 1 + var4, hb.field_jb, 0, -1 + (-var4 + var3_int));
            if (df.field_r.length < jk.field_d.length) {
              stackIn_23_0 = jk.field_d.length;
            } else {
              stackIn_23_0 = df.field_r.length;
            }
            var5 = stackIn_23_0;
            if (uk.field_r.length >= hb.field_jb.length) {
              stackIn_26_0 = uk.field_r.length;
            } else {
              stackIn_26_0 = hb.field_jb.length;
            }
            var6 = stackIn_26_0;
            var7 = var5 + (7 + var6);
            fo.field_a = new int[var7];
            vm.field_e = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              fo.field_a[var8] = -1;
            }
            fo.field_a[1] = 0;
            vm.field_e[0] = vf.field_c;
            vm.field_e[1] = sn.field_q;
            jj.field_h = new int[2];
            vm.field_e[4] = bh.field_m;
            vm.field_e[5] = "";
            fo.field_a[3] = 1;
            vm.field_e[3] = vm.field_g;
            vm.field_e[2] = u.field_n;
            jj.field_h[1] = 2;
            jj.field_h[0] = 5;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_33_0 = vm.field_e;
              stackIn_33_1 = 6 + var8Lifetime2;
              if (-var5 + var8Lifetime2 + jk.field_d.length >= 0) {
                stackIn_34_2 = jk.field_d[-var5 + (jk.field_d.length + var8Lifetime2)];
              } else {
                stackIn_34_2 = "";
              }
              stackIn_33_0[stackIn_33_1] = stackIn_34_2;
            }
            vm.field_e[6 + var5] = null;
            fo.field_a[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_38_0 = vm.field_e;
              stackIn_38_1 = var8Lifetime3 + var5 + 7;
              stackIn_38_2 = ~hb.field_jb.length;
              stackIn_38_3 = ~var8Lifetime3;
              if (stackIn_38_2 >= stackIn_38_3) {
                stackIn_41_2 = "";
              } else {
                stackIn_41_2 = hb.field_jb[var8Lifetime3];
              }
              stackIn_38_0[stackIn_38_1] = stackIn_41_2;
            }
            pk.field_g = hm.a(64);
          }
          mj.field_c.field_h = jj.field_h.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < vm.field_e.length; var4Lifetime1++) {
            stackIn_89_0 = 3;
            stackIn_89_1 = vm.field_e[var4Lifetime1];
            stackIn_90_2 = !(fo.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = sb.a(stackIn_89_0, stackIn_89_1, stackIn_90_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ha.field_h == 2) {
            var10 = df.field_r;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = sb.a(3, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = uk.field_r;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = sb.a(3, var12, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          if (param1 >= -64) {
            return;
          }
          ib.field_g = -(var3_intLifetime1 >> 1) + var3_intLifetime1 + qe.field_u;
          wb.field_b = (ko.field_fb + bd.field_c << 1) * mj.field_c.field_h;
          ko.field_cb = -(var3_intLifetime1 >> 1) + qe.field_u;
          for (var4Lifetime2 = 0; var4Lifetime2 < vm.field_e.length; var4Lifetime2++) {
            stackIn_115_0 = wb.field_b;
            if (fo.field_a[var4Lifetime2] < 0) {
              stackIn_116_1 = hq.field_r;
            } else {
              stackIn_116_1 = gk.field_fb;
            }
            wb.field_b = stackIn_115_0 + stackIn_116_1;
          }
          de.field_h = bb.field_b - (wb.field_b >> 1);
          so.field_c = new int[vm.field_e.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = de.field_h;
          while (var4Lifetime3 < vm.field_e.length) {
            var6Lifetime1 = fo.field_a[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + hq.field_r;
            } else {
              var7Lifetime2 = sb.a(3, vm.field_e[var4Lifetime3], true);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + qe.field_u;
              var5Lifetime3 = var5Lifetime3 + ko.field_fb;
              so.field_c[var4Lifetime3] = new int[4];
              so.field_c[var4Lifetime3][0] = var8Lifetime1 - hc.field_J;
              so.field_c[var4Lifetime3][1] = var5Lifetime3;
              so.field_c[var4Lifetime3][2] = (hc.field_J << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (gk.field_fb + (bd.field_c << 1) + ko.field_fb);
              so.field_c[var4Lifetime3][3] = (bd.field_c << 1) + gk.field_fb;
            }
            var4Lifetime3++;
          }
          if (ha.field_h != 2) {
            mj.field_c.a(param0, mi.a(uf.field_d, bg.field_k, (byte) -97), 17068, 0);
          } else {
            mj.field_c.a(param0, -1, 17068, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "bq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param0 != -124) {
          bq.a((byte) -16);
        }
        if (tm.a((byte) 117)) {
          vd.a(param3, param1, param4, (byte) -86);
          if (null != eg.field_n &&
            eg.field_n.a(param4, param6, false, param5, param3)) {
            jp.a(71);
            param3 = false;
          }
          sm.a(param4, param3, 0);
          gb.a((byte) 120, param3, param2);
          param3 = false;
        }
        return param3;
    }

    public static void a(byte param0) {
        int var1 = 60 % ((param0 - 61) / 61);
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new bb();
    }
}
