/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static np field_f;
    static String field_e;
    static int field_g;
    static String field_b;
    static String field_i;
    static int field_c;
    static String field_k;
    static String field_h;
    static ut[] field_a;
    static int field_d;
    static String field_j;

    public static void a(byte param0) {
        field_a = null;
        field_k = null;
        field_i = null;
        field_b = null;
        if (param0 != -13) {
          return;
        }
        field_j = null;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    final static void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var3Lifetime2Lifetime1;
        int var4Lifetime1Lifetime1;
        var5 = Kickabout.field_G;
        try {
          param0 = param0 >> 1;
          vo.field_cb.c(param0 + qj.field_e, bi.field_i);
          nn.field_C.c(param0 + qj.field_e, 18 + bi.field_i);
          var2_int = 2;
          if (wm.field_s > 1) {
            for (var3 = 1; var3 < wm.field_s; var3++) {
              nn.field_C.c(qj.field_e + param0, 18 + bi.field_i + var2_int);
              var2_int += 2;
            }
          }
          du.field_i.c(qj.field_e + param0, bi.field_i + (18 + var2_int));
          un.field_d.a(qn.field_c, 13 + qj.field_e + param0, var2_int / 2 + (20 + bi.field_i), 16777215, -1);
          var3Lifetime1 = 0;
          if (param1 != -12452) {
            field_c = -16;
          }
          var4 = 0;
          if (0 != dc.field_d) {
            var3Lifetime2 = 0;
            pt.a(param0 + (qj.field_e + vo.field_cb.field_q), -22914, qj.field_e + param0, -14 + (bi.field_i - (-vo.field_cb.field_w - 2 * wm.field_s)), bi.field_i + 8);
            var4Lifetime1 = cf.field_Db;
            while (var4Lifetime1 > 0) {
              field_a[var4Lifetime1 % 10].c(qj.field_e + 140 + (-(var3Lifetime2 * field_a[0].field_q) + param0), 9 + (bi.field_i - 2 * (-wm.field_s + 18)));
              var3Lifetime2++;
              var4Lifetime1 = var4Lifetime1 / 10;
            }
            var4Lifetime1Lifetime1 = Math.abs(dc.field_d);
            var3Lifetime2Lifetime1 = 0;
            while (var4Lifetime1Lifetime1 > 0) {
              if (dc.field_d < 0) {
                wk.field_d[var4Lifetime1Lifetime1 % 10].c(param0 - wk.field_d[0].field_q * var3Lifetime2Lifetime1 + (140 + qj.field_e), -36 - (-(2 * wm.field_s) - (24 + bi.field_i)));
              } else {
                gb.field_G[var4Lifetime1Lifetime1 % 10].c(param0 + qj.field_e + (140 - gb.field_G[0].field_q * var3Lifetime2Lifetime1), 24 + bi.field_i - (18 - wm.field_s) * 2);
              }
              var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 / 10;
              var3Lifetime2Lifetime1++;
            }
            if (dc.field_d < 0) {
              un.field_d.a(vl.field_b, qj.field_e + (140 - var3Lifetime2Lifetime1 * field_a[0].field_q + param0), bi.field_i - (-35 + 2 * (-wm.field_s + 18)), 16729156, -1);
            } else {
              un.field_d.a(ks.field_b, -(var3Lifetime2Lifetime1 * field_a[0].field_q) + (qj.field_e + 140 + param0), 35 + bi.field_i - 2 * (18 - wm.field_s), 4521796, -1);
            }
            un.field_d.a("-----------", 64 + qj.field_e, -(2 * (18 - wm.field_s)) + 44 + bi.field_i, 16777215, -1);
            ta.e(param1 ^ -12506);
          }
          var4Lifetime2 = ua.field_l;
          var3Lifetime3 = 0;
          if (var4Lifetime2 == 0) {
            field_a[0].c(param0 + (140 + (qj.field_e - field_a[0].field_q * var3Lifetime3)), bi.field_i + 7 + wm.field_s * 2);
          }
          while (var4Lifetime2 > 0) {
            field_a[var4Lifetime2 % 10].c(qj.field_e + 140 - (var3Lifetime3 * field_a[0].field_q - param0), bi.field_i + 7 + 2 * wm.field_s);
            var3Lifetime3++;
            var4Lifetime2 = var4Lifetime2 / 10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ig.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param1 != 4620) {
          field_h = (String) null;
        }
        return (int)(fw.field_G + (jr.field_Gb + (double)((-240 + param0 << 8) / hw.field_i)));
    }

    final static void a(boolean param0, byte param1, int param2, int param3) {
        if (param1 < 15) {
          return;
        }
        int var4 = sh.a(70, param2);
        int var5 = fm.a((byte) -27, param3);
        gm var6 = (gm) (et.field_d.field_P[param3][param2]);
        int var7 = !param0 ? 80 + qj.a(-6779, 480) : qj.a(-6779, 0) - 50;
        if (var6.field_w != var5 &&
          tc.a(4, (byte) 106, var6.field_M, var6, var7 << 16)) {
          var6.a(var4, false, 0, var5);
        }
    }

    final static void a(long param0, String param1, byte param2) {
        CharSequence var6 = null;
        try {
          ov.field_b = 2;
          at.field_Kb = param1;
          if (param2 <= 46) {
            String var5 = (String) null;
            ig.a(127L, (String) null, (byte) 87);
          }
          var6 = (CharSequence) ((Object) param1);
          qi.field_o = mo.a(0, var6);
          ik.field_A = param0;
          vg.field_Wb = true;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ig.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var14 = 0;
        String stackIn_17_0 = null;
        String[] stackIn_20_0 = null;
        String[] stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        uo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var5 = null;
        String var5_ref = null;
        int var6_int = 0;
        String[] var6 = null;
        String[] var7 = null;
        int var8 = 0;
        String[] var9_ref_String__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        String[] var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String[] var21 = null;
        String[] var5Lifetime1;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var3 = pb.field_C;
          var4 = 0;
          var16 = po.field_a;
          var5 = var16;
          for (var6_int = 0; var16.length > var6_int; var6_int++) {
            var17 = var16[var6_int];
            var8 = ((hu) ((Object) var3)).a(var17);
            if (var4 < var8) {
              var4 = var8;
            }
          }
          var5Lifetime1 = w.field_g;
          for (var6_intLifetime1 = 0; var5Lifetime1.length > var6_intLifetime1; var6_intLifetime1++) {
            var18 = var5Lifetime1[var6_intLifetime1];
            var8Lifetime1 = ((hu) ((Object) var3)).a(var18);
            if (var4 < var8Lifetime1) {
              var4 = var8Lifetime1;
            }
          }
          if (param0) {
            stackIn_17_0 = iw.field_k;
          } else {
            stackIn_17_0 = qd.field_f;
          }
          var19 = stackIn_17_0;
          var5_ref = var19;
          if (!param0) {
            stackIn_20_0 = fn.field_j;
          } else {
            stackIn_20_0 = cg.field_G;
          }
          var6 = stackIn_20_0;
          var20 = "[" + var19 + "]";
          if (param0) {
            stackIn_23_0 = po.field_a;
          } else {
            stackIn_23_0 = w.field_g;
          }
          var21 = stackIn_23_0;
          var7 = var21;
          var8Lifetime2 = 0;
          var9_ref_String__ = var6;
          for (var10 = 0; var10 < var9_ref_String__.length; var10++) {
            var11_ref_String = var9_ref_String__[var10];
            var12 = ((hu) ((Object) var3)).a(var11_ref_String);
            if (var12 > var8Lifetime2) {
              var8Lifetime2 = var12;
            }
          }
          var9 = 20 + (var4 + var8Lifetime2 + 65);
          var10Lifetime1 = rb.field_yb * (var6.length + 1) + 20;
          var11 = -6 + (-var10Lifetime1 + (473 - rn.field_c * vt.field_c.field_I) - 22);
          on.a(-var9 + 644, var11, var9, var10Lifetime1, 2, 0, param2);
          var12Lifetime1 = 619 - (var4 + 20);
          var13 = 6 + var11 + rb.field_yb;
          ((hu) ((Object) var3)).c(var20, 599, var13, param1, -1);
          var13 = var13 + (rb.field_yb + 6);
          for (var14 = 0; var6.length > var14; var14++) {
            ((hu) ((Object) var3)).a(':', var12Lifetime1, var13, 16777215);
            ((hu) ((Object) var3)).c(var6[var14], -20 + var12Lifetime1, var13, 16777215, -1);
            ((hu) ((Object) var3)).a(var21[var14], 20 + var12Lifetime1, var13, 16777215, -1);
            var13 = var13 + (2 + rb.field_yb);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "ig.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        if (param0 != 6) {
          return -2;
        }
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    static {
        field_b = "Show all lobby chat";
        field_i = "Report abuse";
        field_e = "<%0> (left)";
        field_h = "Elapsed time";
        field_j = "Waiting for players to choose the lineup...";
        field_k = "create new game";
    }
}
