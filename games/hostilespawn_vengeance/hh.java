/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_e;
    static bd[] field_a;
    static bd field_b;
    static String field_c;
    static int field_d;

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String stackIn_82_2 = null;
        int stackIn_88_0 = 0;
        boolean stackIn_89_1 = false;
        int stackIn_112_0 = 0;
        int stackIn_113_1 = 0;
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
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          sf.field_U = true;
          be.field_e = param1;
          if (be.field_e == 0) {
            var3_int = fa.a(gf.field_c, cg.field_a, 113, lj.field_u, ne.field_p);
            var4 = var3_int + 3;
            jf.field_b = new int[var4];
            hf.field_d = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              jf.field_b[var5] = -1;
            }
            ue.field_k = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              hf.field_d[var5] = gf.field_c[var5];
            }
            hf.field_d[-3 + var4] = "";
            hf.field_d[var4 - 2] = lh.field_c;
            jf.field_b[var4 - 2] = 0;
            ue.field_k[0] = 4;
            hf.field_d[var4 - 1] = gi.field_n;
            jf.field_b[var4 - 1] = 1;
            ue.field_k[1] = 5;
          } else if (be.field_e == 1) {
            var3_int = fa.a(gf.field_c, cg.field_a, 105, lj.field_u, ne.field_p);
            var4 = var3_int + 2;
            hf.field_d = new String[var4];
            jf.field_b = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              jf.field_b[var5] = -1;
            }
            ue.field_k = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              hf.field_d[var5] = gf.field_c[var5];
            }
            hf.field_d[-2 + var4] = "";
            hf.field_d[var4 - 1] = gi.field_n;
            jf.field_b[-1 + var4] = 0;
            ue.field_k[0] = 5;
          } else if (2 != be.field_e) {
            if (be.field_e == 3) {
              if (gf.field_b.field_k) {
                var3_int = fa.a(gf.field_c, cg.field_a, 98, lj.field_u, kc.field_e);
              } else {
                var3_int = fa.a(gf.field_c, cg.field_a, 50, lj.field_u, he.field_z);
              }
              var4 = var3_int + 2;
              hf.field_d = new String[var4];
              jf.field_b = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                jf.field_b[var5] = -1;
              }
              ue.field_k = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                hf.field_d[var5] = gf.field_c[var5];
              }
              hf.field_d[-2 + var4] = "";
              hf.field_d[var4 - 1] = gi.field_n;
              jf.field_b[-1 + var4] = 0;
              ue.field_k[0] = 5;
            } else if (4 == be.field_e) {
              var3_int = fa.a(gf.field_c, cg.field_a, param0 ^ 119, lj.field_u, ha.field_y);
              var4 = 2 + var3_int;
              jf.field_b = new int[var4];
              hf.field_d = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                jf.field_b[var5] = -1;
              }
              ue.field_k = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                hf.field_d[var5] = gf.field_c[var5];
              }
              hf.field_d[var4 - 2] = "";
              hf.field_d[var4 - 1] = gi.field_n;
              jf.field_b[-1 + var4] = 0;
              ue.field_k[0] = 5;
            } else {
              if (5 != be.field_e) {
                throw new IllegalArgumentException();
              }
              var3_int = fa.a(gf.field_c, cg.field_a, 62, lj.field_u, ph.field_y);
              var4 = 3 + var3_int;
              hf.field_d = new String[var4];
              jf.field_b = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                jf.field_b[var5] = -1;
              }
              ue.field_k = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                hf.field_d[var5] = gf.field_c[var5];
              }
              hf.field_d[var4 - 3] = "";
              hf.field_d[var4 - 2] = field_c;
              jf.field_b[-2 + var4] = 0;
              ue.field_k[0] = 3;
              hf.field_d[-1 + var4] = gi.field_n;
              jf.field_b[var4 - 1] = 1;
              ue.field_k[1] = 5;
            }
          } else {
            var3_int = fa.a(gf.field_c, cg.field_a, 53, lj.field_u, vg.a(new String[]{"<br><%0><br>"}, param0 + 108, wa.field_l));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(gf.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ka.field_o = new String[var4];
            kf.a(gf.field_c, 0, ka.field_o, 0, var4);
            p.field_k = new String[-1 - var4 + var3_int];
            kf.a(gf.field_c, 1 + var4, p.field_k, 0, -var4 + (var3_int - 1));
            var3_int = fa.a(gf.field_c, cg.field_a, param0 ^ 102, lj.field_u, vg.a(new String[]{"<br><%0><br>"}, param0 ^ 70, jc.field_d));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(gf.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            gg.field_D = new String[var4];
            kf.a(gf.field_c, 0, gg.field_D, 0, var4);
            uh.field_j = new String[var3_int - var4 - 1];
            kf.a(gf.field_c, 1 + var4, uh.field_j, 0, -var4 + var3_int - 1);
            if (ka.field_o.length >= gg.field_D.length) {
              stackIn_65_0 = ka.field_o.length;
            } else {
              stackIn_65_0 = gg.field_D.length;
            }
            var5 = stackIn_65_0;
            if (p.field_k.length < uh.field_j.length) {
              stackIn_68_0 = uh.field_j.length;
            } else {
              stackIn_68_0 = p.field_k.length;
            }
            var6 = stackIn_68_0;
            var7 = var6 + (var5 + 7);
            jf.field_b = new int[var7];
            hf.field_d = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              jf.field_b[var8] = -1;
            }
            hf.field_d[1] = al.field_X;
            jf.field_b[1] = 0;
            ue.field_k = new int[2];
            hf.field_d[0] = sg.field_e;
            hf.field_d[2] = ve.field_d;
            ue.field_k[0] = 5;
            ue.field_k[1] = 2;
            hf.field_d[4] = an.field_f;
            jf.field_b[3] = 1;
            hf.field_d[5] = "";
            hf.field_d[3] = sc.field_i;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_75_0 = hf.field_d;
              stackIn_75_1 = 6 + var8Lifetime2;
              if (gg.field_D.length + (var8Lifetime2 - var5) < 0) {
                stackIn_76_2 = "";
              } else {
                stackIn_76_2 = gg.field_D[gg.field_D.length + (var8Lifetime2 - var5)];
              }
              stackIn_75_0[stackIn_75_1] = stackIn_76_2;
            }
            hf.field_d[6 + var5] = null;
            jf.field_b[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_81_0 = hf.field_d;
              stackIn_81_1 = var8Lifetime3 + 7 + var5;
              if (uh.field_j.length <= var8Lifetime3) {
                stackIn_82_2 = "";
              } else {
                stackIn_82_2 = uh.field_j[var8Lifetime3];
              }
              stackIn_81_0[stackIn_81_1] = stackIn_82_2;
            }
            fj.field_Rb = hn.a((byte) 80);
          }
          mc.field_F.field_b = ue.field_k.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < hf.field_d.length; var4Lifetime1++) {
            stackIn_88_0 = 110;
            stackIn_89_1 = !(jf.field_b[var4Lifetime1] < 0);
            var5Lifetime1 = wb.a(stackIn_88_0, stackIn_89_1, hf.field_d[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (be.field_e == 2) {
            var10 = ka.field_o;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = wb.a(86, false, var11);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = p.field_k;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = wb.a(115, false, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          pc.field_d = -(var3_intLifetime1 >> 1) + (wk.field_c + var3_intLifetime1);
          hg.field_f = -(var3_intLifetime1 >> 1) + wk.field_c;
          wc.field_m = (ab.field_b + cl.field_l << 1) * mc.field_F.field_b;
          for (var4Lifetime2 = 0; var4Lifetime2 < hf.field_d.length; var4Lifetime2++) {
            stackIn_112_0 = wc.field_m;
            if (jf.field_b[var4Lifetime2] < 0) {
              stackIn_113_1 = kb.field_d;
            } else {
              stackIn_113_1 = eh.field_d;
            }
            wc.field_m = stackIn_112_0 + stackIn_113_1;
          }
          if (param0 != 5) {
            hh.a(36);
          }
          s.field_g = -(wc.field_m >> 1) + qg.field_l;
          q.field_e = new int[hf.field_d.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = s.field_g;
          while (var4Lifetime3 < hf.field_d.length) {
            var6Lifetime1 = jf.field_b[var4Lifetime3];
            if (0 > var6Lifetime1) {
              var5Lifetime3 = var5Lifetime3 + kb.field_d;
            } else {
              var7Lifetime2 = wb.a(103, true, hf.field_d[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + cl.field_l;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + wk.field_c;
              q.field_e[var4Lifetime3] = new int[4];
              q.field_e[var4Lifetime3][0] = -jd.field_l + var8Lifetime1;
              q.field_e[var4Lifetime3][1] = var5Lifetime3;
              q.field_e[var4Lifetime3][2] = (jd.field_l << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (eh.field_d + (cl.field_l + (ab.field_b << 1)));
              q.field_e[var4Lifetime3][3] = (ab.field_b << 1) + eh.field_d;
            }
            var4Lifetime3++;
          }
          if (2 == be.field_e) {
            mc.field_F.a(param2, 0, -1, -1);
          } else {
            mc.field_F.a(param2, 0, sd.a(2, j.field_c, rb.field_m), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "hh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        try {
          hn.field_a = param6;
          jj.field_k = param2;
          fk.field_a = param4;
          if (param8 != -1) {
            hh.a(114);
          }
          mb.field_p = param1;
          ab.field_c = param7;
          nj.field_a = param0;
          ik.field_a = param3;
          mm.field_s = param5;
          ig.field_N = (ej) ((Object) new ih());
          vc.field_c = new dh(param2);
          sj.field_a = new sg(ig.field_N, vc.field_c);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(boolean param0, p param1, int[] param2) {
        int var8_int = 0;
        int stackIn_30_0 = 0;
        p stackIn_101_0 = null;
        boolean stackIn_102_1 = false;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        double var8 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        oj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var10Lifetime1;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var10Lifetime2;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_double = param1.field_c;
          var5 = 0.0;
          if (param1.field_e < 90) {
            var5 = (double)(90 - param1.field_e) / 150.0;
          }
          if (param0) {
            field_d = -42;
          }
          var7 = mm.field_m[0].field_j.b(-4);
          for (var8_int = 0; var8_int < 10; var8_int++) {
            L10: {
              param1.field_l.b(var5, param1.field_c, 127);
              param1.a(8573);
              var9 = param1.field_j.b(-4);
              if (var7 != var9 && (2 == param2[var9] ||
                param2[var9] == 4 ||
                param2[var9] == 3)) {
                param1.field_l.b(-var5, param1.field_c, 114);
                param1.a(8573);
                var10 = 0;
                var11_int = 0;
                if (64.0 <= param1.field_c &&
                  param1.field_c <= 192.0) {
                  var10Lifetime2 = var9 - ln.field_a.field_d;
                } else {
                  var10Lifetime2 = ln.field_a.field_d + var9;
                }
                if (param1.field_c >= 128.0) {
                  var11_intLifetime1 = -1 + var9;
                } else {
                  var11_intLifetime1 = var9 + 1;
                }
                var10Lifetime2 = param2[var10Lifetime2];
                var11_intLifetime1 = param2[var11_intLifetime1];
                if (param1.field_c > 32.0 &&
                  96.0 > param1.field_c) {
                  stackIn_30_0 = 1;
                } else {
                  if (160.0 < param1.field_c) {
                    stackIn_30_0 = (param1.field_c < 224.0) ? 1 : 0;
                  } else {
                    stackIn_30_0 = 0;
                  }
                }
                var12 = stackIn_30_0;
                if (var12 != 0 &&
                  var11_intLifetime1 != 2 &&
                  4 != var11_intLifetime1 &&
                  var11_intLifetime1 != 3) {
                  param1.field_c = -param1.field_c + 256.0;
                } else {
                  if (2 != var10Lifetime2 &&
                    var10Lifetime2 != 4 &&
                    3 != var10Lifetime2) {
                    param1.field_c = 128.0 - param1.field_c;
                    if (!(!(0.0 > param1.field_c))) {
                      param1.field_c = param1.field_c + 256.0;
                    }
                    break L10;
                  }
                  if (var12 == 0 &&
                    var11_intLifetime1 != 2 &&
                    var11_intLifetime1 != 4 &&
                    var11_intLifetime1 != 3) {
                    param1.field_c = -param1.field_c + 256.0;
                  }
                }
              }
            }
            if (param1.field_e < 90) {
              for (var10Lifetime1 = 0; el.field_j > var10Lifetime1; var10Lifetime1++) {
                boolean decompiledFrameRemainder0 = true;
                var11 = mm.field_m[var10Lifetime1];
                var12Lifetime1 = 0;
                if (var11 != null &&
                  var11.field_b) {
                  var13 = var11.field_j.b(-4);
                  if (var9 != var13 &&
                    var13 - 1 != var9 &&
                    var9 != -ln.field_a.field_d + var13 &&
                    var9 != var13 - 1 - ln.field_a.field_d) {
                    if (((var11.field_i == 8 ||
                      27 == var11.field_i)) && ((var9 == -2 + (var13 - ln.field_a.field_d) ||
                      var9 == var13 - 2 * ln.field_a.field_d - 1))) {
                      var12Lifetime1 = 1;
                    }
                  } else {
                    var12Lifetime1 = 1;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var11 != null &&
                    od.a(var11.field_i, 1) &&
                    0 != var11.field_h) {
                    var13Lifetime1 = var11.field_j.b(-4);
                    if (var13Lifetime1 == var9) {
                      var12Lifetime1 = 1;
                    } else {
                      if (rh.a(var11.field_i, true)) {
                        if ((var9 == -ln.field_a.field_d + var13Lifetime1)) {
                          var12Lifetime1 = 1;
                        }
                      } else {
                        if ((var13Lifetime1 + 1 == var9)) {
                          var12Lifetime1 = 1;
                        }
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (20 == var11.field_i) {
                      var13Lifetime2 = var11.field_j.b(-4);
                      if (var9 == var13Lifetime2 ||
                        -ln.field_a.field_d + var13Lifetime2 == var9 ||
                        var9 == ln.field_a.field_d + var13Lifetime2) {
                        var12Lifetime1 = 1;
                      }
                    }
                  }
                }
                if (var12Lifetime1 != 0) {
                  param1.field_e = 90;
                  break;
                }
              }
            }
          }
          if (!(256.0 <= param1.field_c)) {
            if (param1.field_c < 0.0) {
              param1.field_c = param1.field_c + 256.0;
            }
          } else {
            param1.field_c = param1.field_c - 256.0;
          }
          var8 = param1.field_c - var3_double;
          if (!(0.0 > var8)) {
            if (256.0 <= var8) {
              var8 = var8 - 256.0;
            }
          } else {
            var8 = var8 + 256.0;
          }
          param1.field_e = param1.field_e + 1;
          if (var8 > 64.0 &&
            var8 < 192.0) {
            stackIn_101_0 = (p) (param1);
            stackIn_102_1 = !(param1.field_f);
            stackIn_101_0.field_f = stackIn_102_1;
          }
          if (param1.field_e > 100) {
            hg.a((byte) 64, param1);
            if (param1.field_i == 27) {
              u.a(30, param1.field_j, true, 48, param1.field_l, 28);
            }
            jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
            jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 1;
            jn.field_F[ib.field_c].field_i = 12;
            ib.field_c = ib.field_c + 1;
            u.a(-1, param1.field_j, true, 32, param1.field_l, 35);
            param1.field_i = -1;
            if (uj.field_l == 1) {
              if (!ej.d((byte) 116)) {
                return;
              }
              eh.field_c.a(em.field_a[0], 50, uh.field_i);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_115_0 = var3;
          stackIn_115_1 = new StringBuilder().append("hh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          stackIn_118_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(',');
          if (param2 == null) {
            stackIn_119_2 = "null";
          } else {
            stackIn_119_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_115_0), ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_a = (bd[]) null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new bd[4];
        field_c = "Try again";
    }
}
