/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    private byte[] field_a;
    static int field_d;
    static String field_h;
    static String field_i;
    static String field_f;
    private int[] field_c;
    private int[] field_b;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, dd[] param6) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        try {
          if (param6 == null) {
            return;
          }
          if (0 < param4 &&
            param5 > 0 &&
            0 != param2) {
            if (null != param6[3]) {
              stackIn_11_0 = param6[3].field_w;
            } else {
              stackIn_11_0 = 0;
            }
            var7_int = stackIn_11_0;
            if (param6[5] == null) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param6[5].field_w;
            }
            var8 = stackIn_14_0;
            if (null != param6[1]) {
              stackIn_17_0 = param6[1].field_y;
            } else {
              stackIn_17_0 = 0;
            }
            var9 = stackIn_17_0;
            if (param6[7] != null) {
              stackIn_20_0 = param6[7].field_y;
            } else {
              stackIn_20_0 = 0;
            }
            var10 = stackIn_20_0;
            var11 = param3 + param4;
            var12 = param5 + param1;
            var13 = param3 + var7_int;
            var14 = -var8 + var11;
            var15 = param1 + var9;
            var16 = var12 - var10;
            var17 = var13;
            var18 = var14;
            if (param0 < 71) {
              return;
            }
            if (var18 < var17) {
              var18 = param3 + param4 * var7_int / (var8 + var7_int);
              var17 = param3 + param4 * var7_int / (var8 + var7_int);
            }
            var19 = var15;
            var20 = var16;
            qh.a(mb.field_b);
            if (var19 > var20) {
              var20 = var9 * param5 / (var9 + var10) + param1;
              var19 = var9 * param5 / (var9 + var10) + param1;
            }
            if (null != param6[0]) {
              qh.d(param3, param1, var17, var19);
              param6[0].a(param3, param1, param2);
              qh.b(mb.field_b);
            }
            if (null != param6[2]) {
              qh.d(var18, param1, var11, var19);
              param6[2].a(var14, param1, param2);
              qh.b(mb.field_b);
            }
            if (param6[6] != null) {
              qh.d(param3, var20, var17, var12);
              param6[6].a(param3, var16, param2);
              qh.b(mb.field_b);
            }
            if (param6[8] != null) {
              qh.d(var18, var20, var11, var12);
              param6[8].a(var14, var16, param2);
              qh.b(mb.field_b);
            }
            if (param6[1] != null &&
              param6[1].field_w != 0) {
              qh.d(var17, param1, var18, var19);
              for (var21 = var13; var21 < var14; var21 = var21 + param6[1].field_w) {
                param6[1].a(var21, param1, param2);
              }
              qh.b(mb.field_b);
            }
            if (param6[7] != null &&
              0 != param6[7].field_w) {
              qh.d(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param6[7].field_w) {
                param6[7].a(var21Lifetime1, var16, param2);
              }
              qh.b(mb.field_b);
            }
            if (param6[3] != null &&
              0 != param6[3].field_y) {
              qh.d(param3, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param6[3].field_y) {
                param6[3].a(param3, var21Lifetime2, param2);
              }
              qh.b(mb.field_b);
            }
            if (param6[5] != null &&
              param6[5].field_y != 0) {
              qh.d(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var16 > var21Lifetime3; var21Lifetime3 = var21Lifetime3 + param6[5].field_y) {
                param6[5].a(var14, var21Lifetime3, param2);
              }
              qh.b(mb.field_b);
            }
            if (param6[4] != null &&
              0 != param6[4].field_w) {
              if (0 == param6[4].field_y) {
                return;
              }
              qh.d(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param6[4].field_y) {
                for (var22 = var13; var22 < var14; var22 = var22 + param6[4].field_w) {
                  param6[4].a(var22, var21Lifetime4, param2);
                }
              }
              qh.b(mb.field_b);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_81_0 = var7;
          stackIn_81_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          de.a(-100);
          var1_int = 4 + sa.field_h.field_w + sa.field_h.field_C;
          qh.c(0, -var1_int + 376, 32 + aq.field_a.length * 32, var1_int + 112, 8421504, 127);
          var2 = 0;
          var3 = 56 / ((-35 - param0) / 33);
          while (var2 < aq.field_a.length) {
            aq.field_a[var2].c(3);
            var2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "rk.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
        int var27_int = 0;
        of stackIn_45_0 = null;
        boolean stackIn_45_1 = false;
        boolean stackIn_46_2 = false;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        vh stackIn_100_0;
        int stackIn_100_1;
        int stackIn_100_2;
        int stackIn_100_3;
        int stackIn_101_4 = 0;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        String stackIn_221_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ko var10 = null;
        int var11_int = 0;
        Object var11 = null;
        im var12 = null;
        int var13 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        of var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = Pool.field_O;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != em.field_L && (null != dl.field_j ||
            null != ci.field_d ||
            w.field_j != null ||
            null != op.field_a)) {
            for (var9 = 0; dr.field_c > var9; var9++) {
              var10_int = 255 & em.field_L.field_tc[var9];
              if (null != dl.field_j &&
                dl.field_j[var9] != null &&
                dl.field_j[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != ci.field_d &&
                null != ci.field_d[var9]) {
                var11_int = ci.field_d[var9][var10_int];
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
                if (0 != var11_int &&
                  !rg.field_s) {
                  var5_int = 1;
                }
              }
              if (op.field_a != null &&
                op.field_a[var9] != null) {
                var8 = var8 | op.field_a[var9][var10_int];
              }
              if (null != w.field_j &&
                null != w.field_j[var9]) {
                var11_intLifetime1 = w.field_j[var9][var10_int];
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !rg.field_s) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_45_0 = (of) (param2);
          stackIn_45_1 = param0;
          stackIn_46_2 = (pf.field_c == param2);
          stackIn_49_0 = (!((of) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_46_2, 2, (byte) 86, 2 * (ad.field_x + 2), (2 + ad.field_x) * (4 * param1))) ? 0 : 1;
          var9Lifetime1 = stackIn_49_0;
          var10 = param2.field_Rb.field_T;
          var11 = null;
          if (param4 != -83) {
            var32 = (of) null;
            rk.a(true, -46, (of) null, -111, (byte) 66);
          }
          var12 = (im) (var10.c((byte) 115));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_T) {
              var12.field_ac = new vh(0L, ge.field_s);
              var12.a(-106, var12.field_ac);
              var12.field_Tb = new vh(0L, tm.field_d);
              if (tq.field_p) {
                var12.a(param4 + 165, var12.field_Tb);
              }
              var12.field_Tb.field_Fb = 2;
              var12.field_kc = new vh(0L, uo.field_Lb);
              var12.a(3, var12.field_kc);
              var12.d((byte) -125);
              var12.field_lc = new vh(0L, p.field_i);
              var12.a(13, var12.field_lc);
              var12.field_Zb = new vh(0L, lh.field_g);
              var13 = 1;
              var12.a(37, var12.field_Zb);
            }
            var12.field_ac.field_nb = null;
            var14 = var12.field_ac;
            var12.field_ac.field_Db = 0;
            var14.field_gb = 0;
            var12.field_Tb.field_nb = null;
            var12.field_Tb.field_Db = 0;
            var15 = var12.field_Tb;
            var12.field_lc.field_nb = null;
            var15.field_gb = 0;
            var16 = var12.field_lc;
            var12.field_lc.field_Db = 0;
            var12.field_Zb.field_nb = null;
            var16.field_gb = 0;
            var17 = var12.field_Zb;
            var12.field_Zb.field_Db = 0;
            var17.field_gb = 0;
            var12.field_kc.field_nb = null;
            var18 = var12.field_kc;
            var12.field_kc.field_Db = 0;
            var18.field_gb = 0;
            var12.field_gb = param2.field_Rb.field_gb;
            var19 = 0;
            var33 = var12.field_jc;
            var21 = 72;
            if (ci.field_c == param2) {
              var21 += 42;
            }
            var34 = lr.a(var12.field_ac.field_I, var33, var21);
            var20 = var34;
            stackIn_62_0 = (var34.equals(var12.field_jc)) ? 0 : 1;
            var22 = stackIn_62_0;
            if (var12.field_bc >= 4) {
              var20 = "<img=" + (gf.field_a - 4 + var12.field_bc) + ">" + var34;
            } else {
              if (var12.field_bc > 0) {
                var20 = "<img=" + (var12.field_bc - 1) + ">" + var34;
              }
            }
            var12.field_ac.field_nb = var20;
            if (!var12.c(true)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Pb ||
                (!(var12.field_Rb >= var6) ||
                !(var12.field_Xb >= var7) ||
                !((var8 & ~var12.field_Nb) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_lc.field_N = var23_int;
              var12.field_Tb.field_N = var23_int;
              var12.field_ac.field_N = var23_int;
              var12.field_ac.field_Bb = var24_int;
              var12.field_ac.field_P = var24_int;
              var12.field_ac.field_K = var24_int;
              var12.field_Tb.field_Bb = var24_int;
              var12.field_Tb.field_P = var24_int;
              var12.field_Tb.field_K = var24_int;
              var12.field_lc.field_Bb = var24_int;
              var12.field_lc.field_P = var24_int;
              var12.field_lc.field_K = var24_int;
              if (wo.field_f != param2) {
                if (var12.field_mc) {
                  var12.field_ac.field_nb = nr.a(new String[]{var20}, -1, ma.field_f);
                  var12.field_Zb.field_nb = be.field_K;
                } else {
                  if (var12.field_Yb) {
                    var12.field_ac.field_nb = nr.a(new String[]{var20}, -1, dj.field_j);
                    var12.field_lc.field_nb = ie.field_b;
                    var12.field_Zb.field_nb = qa.field_u;
                  } else {
                    var12.field_lc.field_nb = kn.field_k;
                  }
                }
              } else {
                if (!em.field_L.field_ec) {
                  var12.field_Zb.field_nb = bl.field_e;
                }
              }
              var25_int = 0;
              if (null != em.field_L &&
                cj.e((byte) 85) &&
                var12.field_Sb != ve.field_m) {
                if (null != var12.field_lc.field_nb) {
                  var26 = var12.field_lc.b(true) + kj.field_j * 2;
                  var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Zb.field_nb) {
                  if (param2 == wo.field_f) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Zb.b(true) + kj.field_j * 2;
                  }
                  var12.field_Zb.b(var19, 2147483647, var25_int, var26Lifetime2, ad.field_x);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_100_0 = var12.field_ac;
              stackIn_100_1 = var19;
              stackIn_100_2 = 2147483647;
              stackIn_100_3 = var25_int;
              if (!tq.field_p) {
                stackIn_101_4 = 0;
              } else {
                stackIn_101_4 = 42;
              }
              ((vh) (Object) stackIn_100_0).b(stackIn_100_1, stackIn_100_2, stackIn_100_3, -stackIn_101_4 + (var12.field_gb - var25_int), ad.field_x);
              var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
              var12.field_Tb.b(var19, param4 - 2147483566, -40 + var12.field_gb, 40, ad.field_x);
              if (var12.field_ac.field_W &&
                var22 != 0) {
                kk.field_B = var12.field_jc;
                if (null != lo.field_c &&
                  null != lo.field_c[var12.field_bc]) {
                  kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                }
              } else {
                if (var12.field_ac.field_W &&
                  null != lo.field_c &&
                  lo.field_c[var12.field_bc] != null) {
                  kk.field_B = lo.field_c[var12.field_bc];
                }
              }
              var19 = var19 + ad.field_x;
            }
            var23 = vk.a(var20, var12.field_hc, (byte) -126);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
              var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
              var12.field_kc.field_nb = var23;
              var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_intLifetime1);
              var19 = var19 + ad.field_x * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_Cb = var19 - var12.field_Db;
            }
            if (var13 != 0) {
              param2.field_Rb.a((vh) (var11), 2, var12, -119);
            }
            if (var12.field_R != 0 &&
              !var12.c(true)) {
              if (0 != var12.field_lc.field_R) {
                k.a(param3, (byte) -127, var12.field_Sb);
              } else {
                if (0 == var12.field_Zb.field_R) {
                  ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                } else {
                  jk.a(var12.field_Sb, param3, 0);
                }
              }
            }
            if (var12.field_db) {
              if (var12.c(true)) {
                var11 = var12;
                var12 = (im) (var10.f((byte) -5));
                continue;
              }
              var24Lifetime2 = null;
              if (var12.field_Sb == ve.field_m) {
                if (var5_int != 0 &&
                  !var12.field_Pb) {
                  var24Lifetime2 = nr.field_db;
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var7 > var12.field_Xb) {
                    var25_int = var7 - var12.field_Xb;
                    if (var25_int == 1) {
                      var24Lifetime2 = rf.field_f;
                    }
                    var24Lifetime2 = nr.a(new String[]{null, Integer.toString(var25_int)}, -1, vm.field_n);
                  } else {
                    if (var12.field_Rb < var6) {
                      var24Lifetime2 = nr.a(new String[]{null, Integer.toString(var6)}, -1, ld.field_i);
                    } else {
                      if ((var8 & ~var12.field_Nb) != 0) {
                        var25_int = s.a(~var12.field_Nb & var8, (byte) 111);
                        var24Lifetime2 = dl.field_a;
                        if (var25_int > 0 &&
                          null != fg.field_f &&
                          fg.field_f.length >= var25_int &&
                          fg.field_f[var25_int - 1] != null) {
                          var24Lifetime2 = fg.field_f[var25_int - 1][1];
                        }
                      }
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Pb) {
                  var24Lifetime2 = nr.a(new String[]{var20}, -1, dq.field_c);
                } else {
                  if (var7 <= var12.field_Xb) {
                    if (var6 <= var12.field_Rb) {
                      if ((var8 & ~var12.field_Nb) != 0) {
                        var25_int = s.a(~var12.field_Nb & var8, (byte) 100);
                        var24Lifetime2 = nr.a(new String[]{var20}, -1, en.field_a);
                        if (var25_int > 0 &&
                          fg.field_f != null &&
                          var25_int <= fg.field_f.length &&
                          null != fg.field_f[-1 + var25_int]) {
                          var24Lifetime2 = nr.a(new String[]{var20}, -1, fg.field_f[var25_int - 1][2]);
                        }
                      }
                    } else {
                      var24Lifetime2 = nr.a(new String[]{var20, Integer.toString(var6)}, -1, jq.field_a);
                    }
                  } else {
                    var25_int = -var12.field_Xb + var7;
                    if (1 == var25_int) {
                      var24Lifetime2 = nr.a(new String[]{var20}, -1, jd.field_i);
                    }
                    var24Lifetime2 = nr.a(new String[]{var20, Integer.toString(var25_int)}, -1, sm.field_A);
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var35 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var35;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var35;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; dr.field_c > var27_int; var27_int++) {
                  var28 = 255 & em.field_L.field_tc[var27_int];
                  var29 = 0;
                  if (dl.field_j != null &&
                    dl.field_j[var27_int] != null &&
                    dl.field_j[var27_int][var28] &&
                    !var12.field_Pb) {
                    var29 = 1;
                  }
                  if (ci.field_d != null &&
                    ci.field_d[var27_int] != null) {
                    var30_int = ci.field_d[var27_int][var28];
                    if (var30_int != 0 &&
                      !rg.field_s &&
                      !var12.field_Pb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Rb) {
                      var29 = 1;
                    }
                  }
                  if (null != w.field_j &&
                    w.field_j[var27_int] != null) {
                    var30_intLifetime1 = w.field_j[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !rg.field_s &&
                      !var12.field_Pb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Xb) {
                      var29 = 1;
                    }
                  }
                  if (op.field_a != null &&
                    op.field_a[var27_int] != null &&
                    (op.field_a[var27_int][var28] & ~var12.field_Nb) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ck.field_R[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param2 == wo.field_f &&
                  cj.e((byte) 85)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var35 + "<br>" + nr.a(new String[]{(String) (var25)}, -1, ii.field_c);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + hm.field_g + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var35 + "<br>" + nr.a(new String[]{(String) (var25)}, -1, sf.field_x);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + tp.field_d + (String) (var25);
                  }
                }
                if (param2 == wo.field_f &&
                  !cj.e((byte) 85)) {
                  var27 = em.field_L.field_Ob;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + nr.a(new String[]{var27}, param4 ^ 82, ke.field_b);
                }
                kk.field_B = (String) (var24Lifetime2);
              }
            }
            var11 = var12;
            var12 = (im) (var10.f((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_220_0 = var5;
          stackIn_220_1 = new StringBuilder().append("rk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_221_2 = "null";
          } else {
            stackIn_221_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_220_0), ((StringBuilder) (Object) stackIn_220_1).append(stackIn_221_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = Pool.field_O;
        try {
          if (param5 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param5 = param5 + param1;
          var7_int = 0;
          var8 = param2;
          L2: while (true) {
            var9 = param4[var8];
            if (0 > var9) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param1;
              param1++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param5 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (64 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param1;
              param1++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param1;
              param1++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param1 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param1 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((8 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param5 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param5 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param1;
              param1++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param5 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param1;
              param1++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param5 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          if (param0 != 36) {
            field_h = (String) null;
          }
          stackIn_65_0 = -param2 + 1 + var8;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(')').toString());
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int dupTemp$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        try {
          var7_int = 0;
          param1 = param1 + param0;
          var8 = param3 << 3;
          while (true) {
            if (param1 <= param0) {
              if (!param5) {
                rk.b(false);
              }
              stackIn_15_0 = -param3 + (7 + var8 >> 3);
              return stackIn_15_0;
            }
            var9 = param4[param0] & 255;
            var10 = this.field_b[var9];
            var11 = this.field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = (var11 + var13 - 1 >> 3) + var12;
            var13 += 24;
            dupTemp$0 = md.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param2[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var13 -= 8;
              var12++;
              var7_int = var10 >>> var13;
              param2[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param2[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param2[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            var8 = var8 + var11;
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("rk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        fr var4_ref_fr = null;
        int var4 = 0;
        fr var5 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          if (tl.field_J != ta.field_a) {
            return false;
          }
          var2_long = rl.a((byte) -103);
          if (param0 != ii.field_d &&
            wq.field_b < 0) {
            var4_ref_fr = (fr) (vn.field_g.c((byte) -112));
            if (var4_ref_fr != null &&
              var4_ref_fr.field_p < var2_long) {
              var4_ref_fr.a((byte) -117);
              of.field_Pb = var4_ref_fr.field_l.length;
              kn.field_e.field_v = 0;
              for (var5_int = 0; var5_int < of.field_Pb; var5_int++) {
                kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
              }
              hb.field_e = vd.field_g;
              vd.field_g = ia.field_l;
              ia.field_l = uq.field_c;
              uq.field_c = var4_ref_fr.field_r;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
        stackIn_17_0 = wq.field_b;
        try {
          while (true) {
            if (stackIn_17_0 < 0) {
              kn.field_e.field_v = 0;
              if (!lq.b((byte) 107, 1)) {
                return false;
              }
              wq.field_b = kn.field_e.q(param0 + 107);
              kn.field_e.field_v = 0;
              of.field_Pb = param1[wq.field_b];
            }
            if (!wf.a((byte) 39)) {
              return false;
            }
            if (ii.field_d == 0) {
              hb.field_e = vd.field_g;
              vd.field_g = ia.field_l;
              ia.field_l = uq.field_c;
              uq.field_c = wq.field_b;
              wq.field_b = -1;
              return true;
            }
            var4 = ii.field_d;
            if (hn.field_a != 0.0) {
              var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new fr(var2_long + (long)var4, wq.field_b, new byte[of.field_Pb]);
            for (var6 = 0; var6 < of.field_Pb; var6++) {
              var5.field_l[var6] = kn.field_e.field_t[var6];
            }
            vn.field_g.b((byte) -64, var5);
            wq.field_b = -1;
            stackIn_17_0 = wq.field_b;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static int b(boolean param0) {
        if (!param0) {
          dd[] var2 = (dd[]) null;
          rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
        }
        return di.field_e + (ol.field_e << 2) + (ec.field_i << 4);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_g = null;
        field_h = null;
        if (param0) {
          field_e = (String) null;
        }
        field_i = null;
        field_f = null;
    }

    rk(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_a = param0;
          this.field_b = new int[var2_int];
          this.field_c = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param0[var5];
            if (0 != var6) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_b[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var7 | var8;
                var10 = var6 - 1;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (var11 != var8) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var12 & var11) != 0) {
                    var3[var10] = var3[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = md.a(var12, var11);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = 1 + var6; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (var8 == var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var8 & var12Lifetime1) == 0) {
                  var10Lifetime2++;
                } else {
                  if (this.field_c[var10Lifetime2] == 0) {
                    this.field_c[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_c[var10Lifetime2];
                }
                if (this.field_c.length <= var10Lifetime2) {
                  var13 = new int[this.field_c.length * 2];
                  for (var14 = 0; var14 < this.field_c.length; var14++) {
                    var13[var14] = this.field_c[var14];
                  }
                  this.field_c = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              this.field_c[var10Lifetime2] = ~var5;
              if (var10Lifetime2 >= var4) {
                var4 = var10Lifetime2 + 1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("rk.<init>(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_e = "You<%0> are all out of lives!";
        field_h = "Waiting for sound effects";
        field_i = "This entry doesn't match";
        field_f = "Report abuse";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
