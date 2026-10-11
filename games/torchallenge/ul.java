/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends da {
    static ka field_k;
    static int field_j;
    static int field_l;
    static int field_n;
    static int field_m;
    int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, vg param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        ti stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ti var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        vg var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = TorChallenge.field_F ? 1 : 0;
        try {
          var45 = param5;
          if (null != var45.field_z &&
            1 < var45.field_s) {
            var61 = var45.field_z;
            mh.a(0, var61, m.field_i, 0, false);
          } else {
            db.j(2);
          }
          var55 = new int[param5.field_c];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param5.field_c];
          var63 = sj.field_S;
          var64 = kl.field_b;
          var62 = kd.field_o;
          for (var13 = 0; param5.field_c > var13; var13++) {
            var14 = var62[var13] * param6 + (param0 * var63[var13] + var64[var13] * param1) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_15_0 = 256;
              } else {
                stackIn_15_0 = 128 + var14;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = var62[var13] * param3 + param4 * var63[var13] + var64[var13] * param2 >> 8;
            stackIn_17_0 = ch.field_b;
            if (0 > var15) {
              stackIn_18_1 = -var15;
            } else {
              stackIn_18_1 = var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < ni.field_f) {
            var14Lifetime1 = k.field_e[var44];
            var15Lifetime1 = param5.field_i[var14Lifetime1];
            var16 = param5.field_w[var14Lifetime1];
            var17 = param5.field_F[var14Lifetime1];
            if (param5.field_f[var14Lifetime1] < sj.field_S.length) {
              stackIn_24_0 = param5.field_f[var14Lifetime1];
            } else {
              stackIn_24_0 = -1;
            }
            var18 = stackIn_24_0;
            if (param5.field_k[var14Lifetime1] >= sj.field_S.length) {
              stackIn_27_0 = -1;
            } else {
              stackIn_27_0 = param5.field_k[var14Lifetime1];
            }
            var19 = stackIn_27_0;
            if (sj.field_S.length <= param5.field_G[var14Lifetime1]) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param5.field_G[var14Lifetime1];
            }
            var20 = stackIn_30_0;
            if (null != ll.field_h &&
              null != param5.field_M &&
              param5.field_M.length > var14Lifetime1 &&
              -1 != param5.field_M[var14Lifetime1] &&
              param5.field_M[var14Lifetime1] < ll.field_h.length) {
              stackIn_38_0 = ll.field_h[param5.field_M[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = tj.field_a[var15Lifetime1];
            var23 = si.field_K[var15Lifetime1];
            var24 = tj.field_a[var16];
            var25 = si.field_K[var16];
            var26 = tj.field_a[var17];
            var27 = si.field_K[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_48_0 = 8355711;
              } else {
                stackIn_48_0 = var21.field_b;
              }
              var30 = stackIn_48_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = (-16711691 & var28 * var31) >>> 8 | (var28 * var32 & 16711883) >>> 8;
              var33 = var33 + 65793 * var29;
              aa.a(var24, var22, var26, 8355711 & var33 >> 1, var27, 0, var23, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_b;
              }
              var34 = stackIn_44_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = var28 * var35 >>> 8 & 587137279 | (var28 * var36 & 16711859) >>> 8;
              var38 = -771817217 & var35 * var29 >>> 8 | (16711855 & var36 * var29) >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = -1375666432 & var30 * var36 >>> 8 | (var30 * var35 & -16711780) >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = var39 + var33 * 65793;
              vi.a(var38 >> 16, var37 >> 16, var26, var24, (var39 & 65303) >> 8, var38 & 255, var23, var25, var39 >> 16, 255 & var37 >> 8, var37 & 255, var27, 255 & var39, param7 ^ -16711780, var22, (65338 & var38) >> 8);
            }
            var44++;
          }
          if (param7 != -16711780) {
            field_m = 89;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != -31397) {
          field_n = -111;
        }
    }

    final static void a(int param0, ji param1, int param2) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        pa var7 = dk.field_s;
        pa var8 = var7;
        var8.d(25, param2);
        var8.field_q = var8.field_q + 1;
        int var4 = var8.field_q;
        var8.d(1, (byte) 122);
        var8.a(param1.field_l, (byte) 106);
        var8.a(param1.field_o, (byte) 106);
        var8.a(param1.field_t, (byte) 106);
        var8.a(param1.field_s, false);
        var8.a(param1.field_i, false);
        var8.a(param1.field_v, false);
        var8.a(param1.field_j, false);
        if (param0 != -18261) {
          return;
        }
        try {
          var8.d(param1.field_w.length, (byte) 122);
          for (var5 = 0; param1.field_w.length > var5; var5++) {
            var7.a(param1.field_w[var5], false);
          }
          var8.b(var4, 14430);
          var8.a(var8.field_q - var4, -120);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ul.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        kl.field_e = of.b(param0 ^ 1259);
        t.field_b = new si();
        if (param0 != -1247) {
          return;
        }
        ee.a(true, 1, true);
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
          return false;
        }
        return wf.field_i.a(-11982);
    }

    final static void a(lj param0, int param1, lj param2) {
        try {
          sf.field_a = param2;
          fd.field_c = param0;
          if (param1 != -1656370552) {
            vg var4 = (vg) null;
            ul.a(-64, -22, 5, -39, 95, (vg) null, -87, -81);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ul(int param0) {
        this.field_i = param0;
    }

    static {
        field_k = new ka(270, 70);
        field_j = -1;
        field_n = -1;
        field_m = 0;
        field_l = 64;
    }
}
