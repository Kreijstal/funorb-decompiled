/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private int[] field_d;
    static boolean field_c;
    private or field_i;
    private int[][] field_h;
    static String field_e;
    private int[][] field_a;
    private or field_b;
    private int[][] field_g;
    static String[][] field_f;

    final static er b(int param0, String param1) {
        int var13_int = 0;
        int var17 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        er stackIn_66_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        er var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        er var13 = null;
        int var14 = 0;
        er var15 = null;
        int var16 = 0;
        int var18 = 0;
        cc var19 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          var19 = la.field_a;
          var3 = 64 + (var19.field_z + var19.field_M);
          var4 = 64 + var19.c(param1);
          var5 = var4;
          var6 = var3;
          var7 = new er(var5, var6);
          var7.d();
          bi.e(32, 32, var7.field_y - 64, var7.field_t - 64, 9361151, 1282259);
          var10 = 0;
          var11 = 128;
          var12 = var11 / 2;
          for (var13_int = 0; var7.field_F.length > var13_int; var13_int++) {
            var9 = var13_int / var7.field_y;
            var8 = var13_int % var7.field_y;
            stackIn_6_0 = (var8 % var11 <= var12) ? 0 : 1;
            var10Lifetime1 = stackIn_6_0;
            if (var9 % var11 > var12) {
              stackIn_11_0 = (var10Lifetime1 != 0) ? 0 : 1;
              var10Lifetime1 = stackIn_11_0;
            }
            if (var10Lifetime1 != 0) {
              bi.b(var8, var9, 657930);
            }
          }
          var13 = new er(var4, var3);
          var13.d();
          var19.b(param1, 32, var19.field_D + 32, 16711680, -1);
          var14 = -35 % ((param0 - 29) / 61);
          var13.d();
          var15 = new er(var5, var6);
          var15.d();
          for (var16 = 0; var16 < var13.field_F.length; var16++) {
            if (var13.field_F[var16] != 0 && (0 == var13.field_F[1 + var16] ||
              var13.field_F[var16 - 1] == 0 ||
              var13.field_F[var16 - var13.field_y] == 0 ||
              var13.field_F[var16 + var13.field_y] == 0)) {
              var8Lifetime1 = var16 % var13.field_y;
              var9Lifetime1 = var16 / var13.field_y;
              bi.f(var8Lifetime1, var9Lifetime1, 10, 131359);
            }
          }
          for (var16Lifetime1 = 0; var16Lifetime1 < var13.field_F.length; var16Lifetime1++) {
            if (var13.field_F[var16Lifetime1] != 0 && (0 == var13.field_F[var16Lifetime1 + 1] ||
              0 == var13.field_F[var16Lifetime1 - 1] ||
              0 == var13.field_F[-var13.field_y + var16Lifetime1] ||
              var13.field_F[var16Lifetime1 + var13.field_y] == 0)) {
              var9Lifetime2 = var16Lifetime1 / var13.field_y;
              var8Lifetime2 = var16Lifetime1 % var13.field_y;
              bi.f(var8Lifetime2, var9Lifetime2, 5, 3039099);
            }
          }
          var13.e(0, 0);
          var16Lifetime2 = 0;
          for (var17 = 0; var13.field_F.length > var17; var17++) {
            if (0 != var13.field_F[var17]) {
              var16Lifetime3 = 0;
              if (var13.field_F[-var13.field_y + var17] != 0 &&
                var13.field_F[var13.field_y + var17] != 0) {
                if (0 != var13.field_F[var17 - 2 * var13.field_y] &&
                  0 != var13.field_F[var17 + var13.field_y * 2]) {
                  if (var13.field_F[-(3 * var13.field_y) + var17] == 0 ||
                    var13.field_F[var17 + var13.field_y * 3] == 0) {
                    var16Lifetime3 = 3;
                  }
                } else {
                  var16Lifetime3 = 2;
                }
              } else {
                var16Lifetime3 = 1;
              }
              var15.field_F[var17] = var7.field_F[var17];
              if (var16Lifetime3 != 1) {
                if (2 != var16Lifetime3) {
                  if (var16Lifetime3 == 3) {
                    var9Lifetime3 = var17 / var13.field_y;
                    var8Lifetime3 = var17 % var13.field_y;
                    bi.b(var8Lifetime3, var9Lifetime3, 1118481);
                  }
                } else {
                  var8Lifetime3 = var17 % var13.field_y;
                  var9Lifetime3 = var17 / var13.field_y;
                  bi.b(var8Lifetime3, var9Lifetime3, 2236962);
                }
              } else {
                var8Lifetime3 = var17 % var13.field_y;
                var9Lifetime3 = var17 / var13.field_y;
                bi.b(var8Lifetime3, var9Lifetime3, 5592405);
              }
            }
          }
          ro.field_g.a(97);
          stackIn_66_0 = var15;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_69_0 = var2;
          stackIn_69_1 = new StringBuilder().append("an.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        cr stackIn_36_0 = null;
        String stackIn_37_1 = null;
        cr stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        String stackIn_40_2 = null;
        cr stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        boolean stackIn_74_2 = false;
        cr stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        boolean stackIn_79_2 = false;
        cr stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        boolean stackIn_84_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        cr var5 = null;
        cr var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        cr var15 = null;
        String var16 = null;
        cr var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          hq.b(ko.field_P, -128);
          if (sj.field_d != null) {
            fo.field_f.field_db = 0;
            var15 = fo.field_f;
            var17 = var15;
            var17.field_Fb = 0;
            var5 = hd.field_g;
            hd.field_g.field_db = 0;
            var5.field_Fb = 0;
            var6 = kk.field_f;
            kk.field_f.field_db = 0;
            var6.field_Fb = 0;
            ud.field_x.field_S = ej.field_d.toUpperCase();
            var7 = (lb.field_c.field_Fb + 2) / 2;
            kk.field_f.a(110, var7 - 2, 40, lb.field_c.field_db - 40, 0);
            hd.field_g.a(120, lb.field_c.field_Fb - var7, 40, -40 + lb.field_c.field_db, var7);
            if (rc.field_a.length == 1 &&
              2 == rc.field_a[0]) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (rc.field_a.length > var10) {
                  stackIn_11_0 = ((qc.field_w[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    rc.field_a[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            hd.field_g.field_lb = true;
            if (!qn.field_q) {
              stackIn_36_0 = hd.field_g;
              if (var8 == 0) {
                stackIn_37_1 = lj.field_o;
              } else {
                stackIn_37_1 = w.field_y;
              }
              stackIn_36_0.field_S = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = oi.field_a;
              stackIn_39_1 = new String[]{hd.field_g.field_S};
              if (var8 == 0) {
                stackIn_40_2 = h.field_A;
              } else {
                stackIn_40_2 = gh.field_c;
              }
              stackIn_39_0.field_S = Vertigo2.a(stackIn_39_1, stackIn_40_2, -122);
              ne.field_G.field_lb = true;
              kk.field_f.field_S = lj.field_A;
              gd.field_r = true;
              if (null != gr.field_W) {
                gd.field_r = false;
                ng.field_a = false;
                if (e.field_c == null) {
                  mn.field_t = new boolean[ol.field_A];
                  e.field_c = new byte[ol.field_A];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < ol.field_A) {
                  mn.field_t[var13] = false;
                  var13++;
                }
                uq.a(sj.field_d, ol.field_A, 20473, 0, -1, -1, -1, true);
                if (!(fn.field_z < 2) &&
                  cr.field_eb[12]) {
                  gd.field_r = true;
                }
              }
              if (!gd.field_r) {
                hd.field_g.field_lb = false;
                if (hd.field_g.field_G) {
                  var9 = null;
                  if (ng.field_a) {
                    var9 = "<col=A00000>" + rq.field_v + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; ol.field_A > var10Lifetime1; var10Lifetime1++) {
                    if (mn.field_t[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + md.field_C[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  ko.field_S = "<col=A00000>" + qe.field_X + "<br>" + ah.field_j + (String) (var9);
                }
              }
            } else {
              oi.field_a.field_S = pp.field_y;
              ne.field_G.field_lb = false;
              if (var8 == 0) {
                stackIn_25_0 = lr.field_J;
              } else {
                stackIn_25_0 = mo.field_g;
              }
              var16 = stackIn_25_0;
              var9 = var16;
              var10Lifetime1 = kk.field_f.field_z.c(var16) + kk.field_f.field_z.a('.') * 3;
              kk.field_f.field_O = 0;
              if ((48 & lo.field_d) == 16) {
                var9 = var16 + ".";
              }
              kk.field_f.field_R = (kk.field_f.field_Fb - var10Lifetime1) / 2;
              if (32 == (48 & lo.field_d)) {
                var9 = (String) (var9) + "..";
              }
              if ((lo.field_d & 48) == 48) {
                var9 = (String) (var9) + "...";
              }
              kk.field_f.field_S = (String) (var9);
              hd.field_g.field_S = mp.field_c.toUpperCase();
            }
          }
          if (param1 >= -43) {
            field_f = (String[][]) null;
          }
          stackIn_73_0 = hk.field_o;
          stackIn_73_1 = 0;
          stackIn_74_2 = (param2) && (!param0) && (!im.field_g);
          ((cr) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_74_2);
          stackIn_78_0 = lb.field_c;
          stackIn_78_1 = 0;
          stackIn_79_2 = (param2) && (!param0) && (!im.field_g);
          ((cr) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_79_2);
          stackIn_83_0 = wc.field_m;
          stackIn_83_1 = 0;
          stackIn_84_2 = (param2) && (!param0) && (im.field_g);
          ((cr) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_84_2);
          el.field_e.field_b.k(0);
          if (null != sj.field_d) {
            if (ne.field_G.field_tb != 0) {
              hc.a(-74, param3);
            }
            if (0 != hd.field_g.field_tb) {
              if (!qn.field_q) {
                mk.b(-128, param3);
              } else {
                ea.a(param3, true);
              }
            }
            mg.a(false, param3, true, sj.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var4), "an.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static cl[] a(int param0, jj param1) {
        int var5 = 0;
        cl[] stackIn_4_0 = null;
        cl[] stackIn_13_0 = null;
        cl[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        cl[] var4 = null;
        cl var6 = null;
        int var7 = 0;
        r var8 = null;
        wk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param1.a(param0 ^ -8193)) {
            stackIn_4_0 = new cl[]{};
            return stackIn_4_0;
          }
          if (param0 != 8315) {
            var8 = (r) null;
            an.a(48, (r) null, 29, (byte) -55);
          }
          var9 = param1.b(-108);
          while (var9.field_b == 0) {
            um.a(true, 10L);
          }
          if (2 == var9.field_b) {
            stackIn_13_0 = new cl[]{};
            return stackIn_13_0;
          }
          var11 = (int[]) (var9.field_d);
          var10 = var11;
          var3 = var10;
          var4 = new cl[var11.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new cl();
            var4[var5] = var6;
            var6.field_b = var3[var5 << 2];
            var6.field_a = var3[(var5 << 2) + 1];
            var6.field_g = var3[(var5 << 2) + 2];
            var6.field_e = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("an.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static er[] a(int param0, int param1) {
        er[] var3 = new er[9];
        er[] var2 = var3;
        var3[4] = ed.a(param1, 64, false);
        if (param0 > -63) {
          field_c = true;
        }
        return var2;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        String var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (hn.field_w == 11) {
            pc.b((byte) -111);
          }
          mg.a(param0 + 1244, nq.field_E, d.field_C, li.field_h);
          dh.a(0, (byte) -99, param1, 0);
          if (param0 != -1243) {
            var3 = (String) null;
            an.a(75, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("an.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(long param0, boolean param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          String var4 = null;
          if (param1) {
            var4 = (String) null;
            an.a((byte) -113, (String) null, -32);
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        int var11 = 0;
        int var12;
        fe var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        fe var13;
        var12 = Vertigo2.field_L ? 1 : 0;
        this.field_i.a((byte) 40, lc.field_g, 0.0, 0.0, 1.0);
        this.field_b.a((byte) 40, fq.field_j, (double)param0, 1.0, 0.0);
        this.field_i.a(this.field_b, 55);
        this.field_i.a(this.field_d, -9);
        if (hn.field_t) {
          qr.field_l.a(this.field_d, 28580);
        } else {
          ue.field_N.c(0, 0);
        }
        if (cn.field_r) {
          lk.a(this.field_d, (byte) -48);
          var13 = sf.field_b;
          var2 = var13;
          var3 = sf.field_b.field_y << 4;
          var4 = sf.field_b.field_t << 4;
          var5 = Vertigo2.field_C.field_y << 3;
          var6 = Vertigo2.field_C.field_t << 3;
          var7 = ji.field_p.field_y << 3;
          var8 = ji.field_p.field_t << 3;
          var9 = jf.field_M.field_y << 3;
          var10 = jf.field_M.field_t << 3;
          gb.a(this.field_h[0][1], jf.field_M, var10, this.field_h[0][0], this.field_d, this.field_h[0][2], var9, param0 - 128);
          for (var11 = 0; var11 < 1000; var11++) {
            gb.a(this.field_g[var11][1], var13, var4, this.field_g[var11][0], this.field_d, this.field_g[var11][2], var3, param0 - 96);
          }
          gb.a(this.field_a[0][1], Vertigo2.field_C, var6, this.field_a[0][0], this.field_d, this.field_a[0][2], var5, param0 ^ -116);
          gb.a(this.field_a[1][1], ji.field_p, var8, this.field_a[1][0], this.field_d, this.field_a[1][2], var7, -118);
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_37_0 = null;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (1 == param2) {
            stackIn_2_0 = Vertigo2.a(new String[]{param1}, pc.field_d, 6);
            return stackIn_2_0;
          }
          if (param2 == 2) {
            stackIn_6_0 = Vertigo2.a(new String[]{param1}, nd.field_j, 15);
            return stackIn_6_0;
          }
          if (param2 == 3) {
            stackIn_10_0 = Vertigo2.a(new String[]{param1}, hq.field_q, param0 + 107);
            return stackIn_10_0;
          }
          if (param2 == 4) {
            stackIn_14_0 = Vertigo2.a(new String[]{param1}, og.field_i, 47);
            return stackIn_14_0;
          }
          if (param2 == 5) {
            stackIn_17_0 = Vertigo2.a(new String[]{param1}, ea.field_a, param0 - 124);
            return stackIn_17_0;
          }
          if (param2 == 6) {
            stackIn_20_0 = Vertigo2.a(new String[]{param1}, va.field_r, 18);
            return stackIn_20_0;
          }
          if (param2 == 7) {
            stackIn_24_0 = Vertigo2.a(new String[]{param1}, de.field_b, 49);
            return stackIn_24_0;
          }
          if (param2 == 8) {
            stackIn_27_0 = Vertigo2.a(new String[]{param1}, nk.field_Ib, -126);
            return stackIn_27_0;
          }
          if (param2 == 11) {
            stackIn_30_0 = Vertigo2.a(new String[]{param1}, k.field_d, param0 ^ 111);
            return stackIn_30_0;
          }
          if (param2 == 12) {
            stackIn_34_0 = Vertigo2.a(new String[]{param1}, fn.field_A, 52);
            return stackIn_34_0;
          }
          if (param2 == 13) {
            stackIn_37_0 = Vertigo2.a(new String[]{param1}, ee.field_a, -23);
            return stackIn_37_0;
          }
          if (param0 == -1) {
            return null;
          }
          field_c = true;
          stackIn_41_0 = null;
          return (String) (stackIn_41_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("an.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != 1) {
            an.a((byte) 80, 40, -119, -127, -68);
          }
          go.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "an.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        if (param0 != 41) {
          field_e = (String) null;
        }
        param1 += 2;
        param3 -= 4;
        param4 += 2;
        int var5 = param4 * bi.field_e + param1;
        int var6 = bi.field_e - param2;
        wn.a(bi.field_l, var5, 0, 0, 0, 0, param2, param3, var6);
    }

    public static void a(boolean param0) {
        field_f = (String[][]) null;
        if (!param0) {
          an.a((byte) -39, 103, 98, 0, 70);
        }
        field_e = null;
    }

    an() {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        double var3Lifetime1;
        double var3Lifetime2;
        double var3Lifetime3;
        this.field_g = new int[1000][3];
        for (var1 = 0; var1 < 900; var1++) {
          var2 = 3920 + be.a(1920, (byte) 83);
          var3 = 3.141592653589793 * Math.random() * 2.0;
          this.field_g[var1][0] = (int)(320.0 + (double)var2 * Math.cos(var3));
          this.field_g[var1][2] = (int)(320.0 + Math.sin(var3) * (double)var2);
          this.field_g[var1][1] = -1800 + be.a(14400, (byte) 83);
        }
        for (var1Lifetime1 = 900; var1Lifetime1 < 1000; var1Lifetime1++) {
          var2Lifetime1 = be.a(5840, (byte) 83);
          var3Lifetime1 = 2.0 * (3.141592653589793 * Math.random());
          this.field_g[var1Lifetime1][0] = (int)(320.0 + (double)var2Lifetime1 * Math.cos(var3Lifetime1));
          this.field_g[var1Lifetime1][2] = (int)((double)var2Lifetime1 * Math.sin(var3Lifetime1) + 320.0);
          this.field_g[var1Lifetime1][1] = 12600;
        }
        this.field_a = new int[2][3];
        for (var1Lifetime2 = 0; var1Lifetime2 < 2; var1Lifetime2++) {
          var2Lifetime2 = be.a(2000, (byte) 83) + 1920;
          var3Lifetime2 = 2.0 * (3.141592653589793 * Math.random());
          this.field_a[var1Lifetime2][0] = (int)((double)var2Lifetime2 * Math.cos(var3Lifetime2) + 320.0);
          this.field_a[var1Lifetime2][2] = (int)((double)var2Lifetime2 * Math.sin(var3Lifetime2) + 320.0);
          this.field_a[var1Lifetime2][1] = be.a(7200, (byte) 83) + 1800;
        }
        this.field_h = new int[1][3];
        for (var1Lifetime3 = 0; var1Lifetime3 < 1; var1Lifetime3++) {
          var2Lifetime3 = 3920 + be.a(1920, (byte) 83);
          var3Lifetime3 = 2.0 * (Math.random() * 3.141592653589793);
          this.field_h[var1Lifetime3][0] = (int)(320.0 + Math.cos(var3Lifetime3) * (double)var2Lifetime3);
          this.field_h[var1Lifetime3][2] = (int)((double)var2Lifetime3 * Math.sin(var3Lifetime3) + 320.0);
          this.field_h[var1Lifetime3][1] = 1800 + be.a(7200, (byte) 83);
        }
        this.field_i = new or();
        this.field_b = new or();
        this.field_d = new int[12];
    }

    final void b(int param0) {
        lc.field_g = lc.field_g + 0.000625;
        if (param0 != 8) {
          return;
        }
        fq.field_j = fq.field_j + 0.00125;
    }

    final static u[] a(int param0, r param1, int param2, byte param3) {
        RuntimeException var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        u[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hq.a(124, param2, param0, param1)) {
            stackIn_2_0 = null;
            return (u[]) (stackIn_2_0);
          }
          if (param3 <= 72) {
            var5 = (String) null;
            an.b(-122, (String) null);
          }
          stackIn_6_0 = kr.a((byte) -116);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("an.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "There are some coins on this level - grab them for an extra 100 points each. Make sure to get them before you paint the last tile purple.";
    }
}
