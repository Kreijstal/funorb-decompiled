/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pu {
    static String field_l;

    final static ma a(boolean param0, pf param1) {
        int var7 = 0;
        ma stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int var6 = 0;
        int var8 = 0;
        pf var9 = null;
        var8 = BachelorFridge.field_y;
        try {
          var2_int = param1.d(8, (byte) -80);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = fa.a((byte) -75, param1) ? 1 : 0;
          var4 = fa.a((byte) -75, param1) ? 1 : 0;
          var5 = new ma();
          if (param0) {
            var9 = (pf) null;
            sa.a(true, (pf) null);
          }
          var5.field_g = (short)param1.d(16, (byte) 121);
          var5.field_x = as.a(var5.field_x, 127, param1, 16);
          var5.field_O = as.a(var5.field_O, 99, param1, 16);
          var5.field_r = as.a(var5.field_r, 102, param1, 16);
          var5.field_K = (short)param1.d(16, (byte) -64);
          var5.field_C = as.a(var5.field_C, 82, param1, 16);
          var5.field_h = as.a(var5.field_h, 123, param1, 16);
          var5.field_t = as.a(var5.field_t, 88, param1, 16);
          if (var3 != 0) {
            var5.field_i = (short)param1.d(16, (byte) 51);
            var5.field_f = as.a(var5.field_f, 122, param1, 16);
            var5.field_N = as.a(var5.field_N, 75, param1, 16);
            var5.field_b = as.a(var5.field_b, 93, param1, 16);
            var5.field_F = as.a(var5.field_F, 96, param1, 16);
            var5.field_c = as.a(var5.field_c, 60, param1, 16);
            var5.field_e = as.a(var5.field_e, 83, param1, 16);
          }
          if (var4 != 0) {
            param1.d(16, (byte) -85);
            var5.field_y = as.a(var5.field_y, 90, param1, 16);
            var5.field_m = as.a(var5.field_m, 59, param1, 16);
            var5.field_l = as.a(var5.field_l, 97, param1, 16);
            var5.field_H = as.a(var5.field_H, 96, param1, 16);
            var5.field_v = as.a(var5.field_v, 75, param1, 16);
          }
          if (fa.a((byte) -75, param1)) {
            var5.field_w = as.a(var5.field_w, 81, param1, 16);
          }
          if (fa.a((byte) -75, param1)) {
            var5.field_d = hd.a(var5.field_d, param1, (byte) 103, 16);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_d.length; var7++) {
              if (var6 < (var5.field_d[var7] & 255)) {
                var6 = var5.field_d[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_n = (byte)(1 + var6);
            } else {
              var5.field_d = null;
            }
          }
          stackIn_23_0 = var5;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_l = null;
        if (param0 != 0) {
          pf var2 = (pf) null;
          sa.a(true, (pf) null);
        }
    }

    final static void c(int param0) {
        ud.a(nia.d(-31768), (byte) 95);
        if (param0 >= -82) {
          sa.b(116);
        }
    }

    final static void d(int param0) {
        int stackIn_12_0 = 0;
        ema stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        ema stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        RuntimeException decompiledCaughtException = null;
        pf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        ema var3_ref_ema = null;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        uha var4_ref_uha = null;
        int var5 = 0;
        ema var7 = null;
        int var8 = 0;
        ema var8_ref_ema = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uha var13 = null;
        uha var14 = null;
        uha var15 = null;
        String var16 = null;
        ema var17 = null;
        String var18 = null;
        String var19 = null;
        ema var20 = null;
        Object var21 = null;
        ema var22 = null;
        ema var23 = null;
        ema var24 = null;
        String var25 = null;
        String var26 = null;
        Object var27 = null;
        uha var27_ref = null;
        uha var28 = null;
        uha var29 = null;
        ema var3_ref_emaLifetime1;
        ema var3_ref_emaLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var21 = null;
        var27 = null;
        var3_ref = null;
        var11 = BachelorFridge.field_y;
        try {
          var1 = ig.field_m;
          if (param0 != -7) {
            sa.c(41);
          }
          var2 = ((lu) ((Object) var1)).b(16711935);
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            var2 != 3 &&
            var2 != 4) {
            if (var2 == 5) {
              var3_long = ((lu) ((Object) var1)).c(-124);
              var18 = ((lu) ((Object) var1)).g(113);
              var16 = ((lu) ((Object) var1)).g(65);
              var19 = ((lu) ((Object) var1)).g(-70);
              var17 = gf.a(var3_long, false);
              var8_ref_ema = var17;
              stackIn_12_0 = (var16.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var17 == null) {
                var8_ref_ema = new ema(var18, var19, var3_long);
                iga.field_c.a(var8_ref_ema, param0 + 98, var3_long);
              } else {
                if (var9 != 0) {
                  var17.a(var18, param0 + 7, var19);
                }
              }
              var8_ref_ema.field_Cb = f.b((byte) 73) - (long)((lu) ((Object) var1)).f(-59);
              var8_ref_ema.field_Jb = ((lu) ((Object) var1)).e((byte) 68);
              var10 = ((lu) ((Object) var1)).d(-1);
              stackIn_19_0 = var8_ref_ema;
              stackIn_20_1 = ((var10 & 1) != 0);
              stackIn_19_0.field_zb = stackIn_20_1;
              var8_ref_ema.field_Gb = var10 >> 1;
              var8_ref_ema.field_Kb = ((lu) ((Object) var1)).b(param0 ^ -16711930);
              var8_ref_ema.field_xb = ((lu) ((Object) var1)).b(16711935);
              gj.a((byte) 101, var8_ref_ema);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((lu) ((Object) var1)).c(param0 ^ 106);
              var5 = ((lu) ((Object) var1)).b(param0 ^ -16711930);
              var20 = gf.a(var3_longLifetime1, false);
              if (var20 == null) {
                return;
              }
              if (var20.field_Ob) {
                var20.field_Ob = false;
                hc.field_J = hc.field_J - 1;
              }
              if (var5 == 0) {
                var20.a(false);
              } else {
                var20.field_Mb = kla.field_x;
                var20.field_yb = var5;
              }
              var20.b(param0 ^ -7);
              return;
            }
            if (var2 == 7) {
              var3_ref_ema = (ema) (aa.field_l.b((byte) 90));
              while (var3_ref_ema != null) {
                var3_ref_ema.a(false);
                var3_ref_ema.b(0);
                var3_ref_ema = (ema) (aa.field_l.c(param0 + 7));
              }
              hc.field_J = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((lu) ((Object) var1)).e((byte) 97);
              var4_ref_uha = (uha) (ola.field_g.a((long)var3, (byte) -87));
              if (var4_ref_uha == null) {
                var4_ref_uha = new uha(ld.field_q);
                ola.field_g.a(var4_ref_uha, 91, (long)var3);
              }
              cja.a(var4_ref_uha, var1, 80, true);
              h.a(var4_ref_uha, 0);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((lu) ((Object) var1)).e((byte) 54);
              var4 = ((lu) ((Object) var1)).b(16711935);
              var29 = (uha) (ola.field_g.a((long)var3Lifetime4, (byte) -87));
              if (var29 != null) {
                if (var4 != 0) {
                  var29.field_Mb = kla.field_x;
                  var29.field_ec = var4;
                } else {
                  var29.a(false);
                }
                var29.b(0);
              }
              return;
            }
            if (var2 == 10) {
              var15 = (uha) (uma.field_M.b((byte) 90));
              while (var15 != null) {
                var15.a(false);
                var15.b(0);
                var15 = (uha) (uma.field_M.c(0));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((lu) ((Object) var1)).e((byte) 100);
                var4Lifetime1 = ((lu) ((Object) var1)).b(16711935);
                var27_ref = (uha) (ola.field_g.a((long)var3Lifetime5, (byte) -87));
                if (var27_ref == null) {
                  return;
                }
                var27_ref.field_gc = false;
                var13 = var27_ref;
                var13.field_Wb = false;
                if (var4Lifetime1 != 0) {
                  var27_ref.field_Mb = kla.field_x;
                  var27_ref.field_ec = var4Lifetime1;
                }
                h.a(var27_ref, 0);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((lu) ((Object) var1)).c(param0 - 112);
                    var25 = ((lu) ((Object) var1)).g(param0 ^ -55);
                    var26 = ((lu) ((Object) var1)).g(param0 - 26);
                    var7 = uka.a(var3_longLifetime2, 28791);
                    if (var7 == null) {
                      var7 = new ema(var25, var26, var3_longLifetime2);
                      wi.field_i.a(var7, param0 + 98, var3_longLifetime2);
                      pw.field_w.field_Rb = pw.field_w.field_Rb + 1;
                    }
                    var7.field_Jb = ((lu) ((Object) var1)).e((byte) 106);
                    var8 = ((lu) ((Object) var1)).d(param0 + 6);
                    var7.field_Gb = var8 >> 1;
                    stackIn_99_0 = var7;
                    stackIn_100_1 = (0 != (var8 & 1));
                    stackIn_99_0.field_zb = stackIn_100_1;
                    var7.field_Kb = ((lu) ((Object) var1)).b(16711935);
                    var7.field_xb = ((lu) ((Object) var1)).b(param0 + 16711942);
                    bia.field_g.a(var7, true);
                    return;
                  }
                  if (19 == var2) {
                    var3_longLifetime2 = ((lu) ((Object) var1)).c(-111);
                    var5Lifetime1 = ((lu) ((Object) var1)).b(16711935);
                    var24 = uka.a(var3_longLifetime2, param0 ^ -28786);
                    if (var24 != null) {
                      if (var5Lifetime1 != 0) {
                        var24.field_yb = var5Lifetime1;
                        var24.field_Mb = kla.field_x;
                      } else {
                        var24.a(false);
                      }
                      var24.b(0);
                      pw.field_w.field_Rb = pw.field_w.field_Rb - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    cja.a(pw.field_w, var1, 125, false);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((lu) ((Object) var1)).e((byte) 51);
                    if (var3Lifetime5 != 0) {
                      wda.field_a = (long)var3Lifetime5 + f.b((byte) 73);
                      return;
                    }
                    wda.field_a = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    wk.field_a = ((lu) ((Object) var1)).e((byte) 48);
                    ui.field_q = ((lu) ((Object) var1)).d(-1);
                    return;
                  }
                  if (var2 == 23) {
                    ge.field_F = ((lu) ((Object) var1)).c(param0 ^ 108);
                    return;
                  }
                  cv.a(1, "L1: " + nia.d((byte) -106), (Throwable) null);
                  vc.a((byte) -78);
                  return;
                }
                var3_longLifetime2 = ((lu) ((Object) var1)).c(param0 - 103);
                var5Lifetime1Lifetime1 = ((lu) ((Object) var1)).b(16711935);
                var23 = gf.a(var3_longLifetime2, false);
                if (var23 != null) {
                  if (15 == var2) {
                    var23.field_wb = false;
                  } else {
                    if (var23.field_Ob) {
                      hc.field_J = hc.field_J - 1;
                      var23.field_Ob = false;
                    }
                  }
                  if (0 != var5Lifetime1Lifetime1) {
                    var23.field_Mb = kla.field_x;
                    var23.field_yb = var5Lifetime1Lifetime1;
                  }
                  gj.a((byte) 63, var23);
                }
                return;
              }
              var3_longLifetime2Lifetime1 = ((lu) ((Object) var1)).c(param0 - 95);
              var22 = gf.a(var3_longLifetime2Lifetime1, false);
              if (var22 != null) {
                if (var2 != 14) {
                  if (!var22.field_Ob) {
                    var22.field_Ob = true;
                    hc.field_J = hc.field_J + 1;
                  }
                } else {
                  var22.field_wb = true;
                }
                gj.a((byte) 56, var22);
              }
              return;
            }
            var3Lifetime6 = ((lu) ((Object) var1)).e((byte) 72);
            var14 = (uha) (ola.field_g.a((long)var3Lifetime6, (byte) -87));
            var28 = var14;
            if (var14 == null) {
              return;
            }
            if (11 != var2) {
              var28.field_gc = true;
            } else {
              var14.field_Wb = true;
            }
            h.a(var28, 0);
            return;
          }
          var3_ref_emaLifetime1 = (ema) (bia.field_g.b((byte) 90));
          while (var3_ref_emaLifetime1 != null) {
            var3_ref_emaLifetime1.a(false);
            var3_ref_emaLifetime1.b(0);
            var3_ref_emaLifetime1 = (ema) (bia.field_g.c(0));
          }
          var3_ref_emaLifetime2 = (ema) (iga.field_c.b((byte) -73));
          while (var3_ref_emaLifetime2 != null) {
            if (var3_ref_emaLifetime2.field_wb ||
              var3_ref_emaLifetime2.field_Ob) {
              if (var3_ref_emaLifetime2.field_Ob) {
                var3_ref_emaLifetime2.field_Ob = false;
                hc.field_J = hc.field_J - 1;
              }
              var3_ref_emaLifetime2.field_wb = false;
              gj.a((byte) 38, var3_ref_emaLifetime2);
            }
            var3_ref_emaLifetime2 = (ema) (iga.field_c.a(param0 - 25170));
          }
          if (var2 == 1 &&
            null != pw.field_w) {
            ur.field_b = pw.field_w.field_Jb;
          }
          if (var2 == 4) {
            var3Lifetime1 = ((lu) ((Object) var1)).e((byte) 45);
            pw.field_w = new uha(ld.field_q);
            pw.field_w.a(true, (long)var3Lifetime1);
            cja.a(pw.field_w, var1, 54, false);
            wda.field_a = 0L;
          } else {
            pw.field_w = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            rv.field_n = null;
          } else {
            if (null == rv.field_n) {
              rv.field_n = new uha(ld.field_q);
            }
          }
          if (var2 != 3) {
            ce.field_y = false;
            return;
          }
          ce.field_y = true;
          for (var3Lifetime2 = 0; fia.field_r.length > var3Lifetime2; var3Lifetime2++) {
            fia.field_r[var3Lifetime2] = ((lu) ((Object) var1)).b(true);
          }
          tq.field_h = ((lu) ((Object) var1)).b(16711935);
          ena.field_n = ((lu) ((Object) var1)).b(16711935);
          for (var3Lifetime3 = 0; var3Lifetime3 < sca.field_c.length; var3Lifetime3++) {
            sca.field_c[var3Lifetime3] = ((lu) ((Object) var1)).b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "sa.B(" + param0 + ')');
        }
    }

    static {
        field_l = "This entry doesn't match";
    }
}
