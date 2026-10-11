/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static fm field_g;
    static ak field_f;
    static long field_d;
    static int field_e;
    static String field_a;
    static eq field_c;
    private String field_b;

    final static void a(int param0, int param1) {
        int var3 = 0;
        m var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != -20304) {
            field_d = 56L;
          }
          var4 = (m) (on.field_nb.c(1504642273));
          while (var4 != null) {
            jc.a((byte) -31, param0, var4);
            var4 = (m) (on.field_nb.f(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "io.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        lc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pc var15 = null;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var15 = vi.field_o;
          var2 = var15.f(255);
          var3 = (lc) (rg.field_c.c(1504642273));
          while (var3 != null) {
            if (~var2 != ~var3.field_k) {
              var3 = (lc) (rg.field_c.f(1504642273));
              continue;
            }
            break;
          }
          if (var3 == null) {
            na.a(true);
            return;
          }
          var5 = 106 / ((-61 - param0) / 53);
          var4 = var15.f(255);
          if (var4 != 0) {
            lg.field_b[0] = kn.field_J;
            var6 = var3.field_s;
            for (var7_int = 1; var4 > var7_int; var7_int++) {
              lg.field_b[var7_int] = var15.h(5);
            }
            lo.a(2147483647, var6, var4);
            for (var7_intLifetime1 = 0; var4 > var7_intLifetime1; var7_intLifetime1++) {
              rd.a(-112, var15);
              if (var7_intLifetime1 != 0) {
                ui.a(aj.field_n, 0, of.field_g, of.field_b, var7_intLifetime1, bq.field_c);
              } else {
                var3.field_v = aj.field_n;
                var3.field_n = bq.field_c;
                var3.field_m = of.field_g;
                var3.field_p = of.field_b;
                ui.a(aj.field_n, 0, of.field_g, of.field_b, var7_intLifetime1, bq.field_c);
              }
            }
            bc.a(var6, (byte) 31);
            dupTemp$0 = new String[2][var6];
            var3.field_o = dupTemp$0;
            var7 = dupTemp$0;
            dupTemp$1 = new int[2][var6 * 4];
            var3.field_r = dupTemp$1;
            var8 = dupTemp$1;
            var9 = pg.field_e;
            var10 = 0;
            var11 = 0;
            while (var9 > var10) {
              var12 = gn.field_A[var10];
              var7[0][var11] = lg.field_b[var12];
              var8[0][var11 * 4] = ep.field_c[var12];
              var8[0][1 + var11 * 4] = uc.field_b[var12];
              var8[0][4 * var11 + 2] = vp.field_Fb[var12];
              var8[0][3 + var11 * 4] = gh.field_q[var12];
              if (sm.a(lg.field_b[var12], -1) &&
                gh.field_q[var12] + uc.field_b[var12] + vp.field_Fb[var12] == 0) {
                var7[0][var11] = null;
                var11--;
              }
              var11++;
              var10++;
            }
            var10Lifetime1 = 0;
            var14 = 0;
            var11Lifetime1 = var14;
            while (var10Lifetime1 < var9) {
              var12Lifetime1 = gn.field_A[var10Lifetime1 + var6];
              var7[1][var14] = lg.field_b[var12Lifetime1];
              var8[1][4 * var14] = ep.field_c[var12Lifetime1];
              var8[1][1 + 4 * var14] = uc.field_b[var12Lifetime1];
              var8[1][4 * var14 + 2] = vp.field_Fb[var12Lifetime1];
              var8[1][4 * var14 + 3] = gh.field_q[var12Lifetime1];
              if (sm.a(lg.field_b[var12Lifetime1], -1) &&
                uc.field_b[var12Lifetime1] + (vp.field_Fb[var12Lifetime1] + gh.field_q[var12Lifetime1]) == 0) {
                var7[1][var14] = null;
                var14--;
              }
              var10Lifetime1++;
              var14++;
            }
          }
          var3.field_u = true;
          var3.c(2779);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "io.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime3;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = Pixelate.field_H ? 1 : 0;
        if (ga.field_f < 0) {
          return;
        }
        var3 = param2 - 135;
        var4 = param0 - 35;
        var5 = 256;
        if (ga.field_f < 75) {
          var5 = (ga.field_f << 8) / 75;
        }
        if (param1 > -46) {
          field_g = (fm) null;
          if (ga.field_f > 200) {
            var5 = (250 - ga.field_f << 8) / 50;
          }
          h.a(-113, re.field_b);
          ja.a();
          t.d();
          ma.d((byte) 106);
          if (256 > var5) {
            t.a(0, 0, t.field_j, t.field_d, 0, -var5 + 256);
          }
          ia.a((byte) 92);
          if (ga.field_f >= 150) {
            th.field_b.a(var3 + 15, var4 + 10, var5);
          } else {
            re.field_b.d(var3, var4);
          }
          var6 = ga.field_f - 125;
          if (var6 > 0) {
            if (var6 >= 50) {
              var6 = ga.field_f - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
              }
              return;
            }
            if (var6 >= 20) {
              if (var6 >= 30) {
                var7Lifetime4 = (12800 - var6 * 256) / 20;
                bd.field_a.b(var3, var4, var7Lifetime4);
              } else {
                bd.field_a.b(var3, var4, 256);
              }
            } else {
              var7Lifetime4 = 256 * var6 / 20;
              bd.field_a.b(var3, var4, var7Lifetime4);
            }
          }
          var6Lifetime3 = ga.field_f - 140;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = var6Lifetime3 * 256 / 20;
            }
            in.field_s.a(15 + var3, 10 + var4, var7Lifetime3 * var5 >> 8);
          }
          return;
        }
        if (ga.field_f > 200) {
          var5 = (250 - ga.field_f << 8) / 50;
        }
        h.a(-113, re.field_b);
        ja.a();
        t.d();
        ma.d((byte) 106);
        if (256 > var5) {
          t.a(0, 0, t.field_j, t.field_d, 0, -var5 + 256);
          ia.a((byte) 92);
          if (ga.field_f >= 150) {
            th.field_b.a(var3 + 15, var4 + 10, var5);
          } else {
            re.field_b.d(var3, var4);
          }
          var6Lifetime1 = ga.field_f - 125;
          if (var6Lifetime1 > 0 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 >= 20) {
              if (var6Lifetime1 >= 30) {
                var7Lifetime1 = (12800 - var6Lifetime1 * 256) / 20;
                bd.field_a.b(var3, var4, var7Lifetime1);
              } else {
                bd.field_a.b(var3, var4, 256);
              }
            } else {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
              bd.field_a.b(var3, var4, var7Lifetime1);
            }
          }
        } else {
          ia.a((byte) 92);
          if (ga.field_f >= 150) {
            th.field_b.a(var3 + 15, var4 + 10, var5);
            var6Lifetime1 = ga.field_f - 125;
            if (var6Lifetime1 <= 0) {
              var6Lifetime1 = ga.field_f - 140;
              if (var6Lifetime1 > 0) {
                var7Lifetime1 = 256;
                if (var6Lifetime1 < 20) {
                  var7Lifetime1 = var6Lifetime1 * 256 / 20;
                }
                in.field_s.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
              }
            } else {
              if (var6Lifetime1 >= 50) {
                var6Lifetime1 = ga.field_f - 140;
                if (var6Lifetime1 > 0) {
                  var7Lifetime1 = 256;
                  if (var6Lifetime1 < 20) {
                    var7Lifetime1 = var6Lifetime1 * 256 / 20;
                  }
                  in.field_s.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
                }
              } else {
                if (var6Lifetime1 < 20) {
                  var7Lifetime1 = 256 * var6Lifetime1 / 20;
                  bd.field_a.b(var3, var4, var7Lifetime1);
                  var6Lifetime1 = ga.field_f - 140;
                  if (var6Lifetime1 > 0) {
                    var7Lifetime1 = 256;
                    if (var6Lifetime1 < 20) {
                      var7Lifetime1 = var6Lifetime1 * 256 / 20;
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
                  }
                } else {
                  if (var6Lifetime1 < 30) {
                    bd.field_a.b(var3, var4, 256);
                    var6Lifetime1 = ga.field_f - 140;
                    if (var6Lifetime1 > 0) {
                      var7Lifetime1 = 256;
                      if (var6Lifetime1 < 20) {
                        var7Lifetime1 = var6Lifetime1 * 256 / 20;
                      }
                      in.field_s.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
                    }
                  } else {
                    var7Lifetime1 = (12800 - var6Lifetime1 * 256) / 20;
                    bd.field_a.b(var3, var4, var7Lifetime1);
                    var6Lifetime1 = ga.field_f - 140;
                    if (var6Lifetime1 > 0) {
                      var7Lifetime1 = 256;
                      if (var6Lifetime1 < 20) {
                        var7Lifetime1 = var6Lifetime1 * 256 / 20;
                      }
                      in.field_s.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
                    }
                  }
                }
              }
            }
            return;
          }
          re.field_b.d(var3, var4);
          var6Lifetime1 = ga.field_f - 125;
          if (var6Lifetime1 > 0 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
              bd.field_a.b(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 < 30) {
                bd.field_a.b(var3, var4, 256);
              } else {
                var7Lifetime1 = (12800 - var6Lifetime1 * 256) / 20;
                bd.field_a.b(var3, var4, var7Lifetime1);
              }
            }
          }
        }
        var6Lifetime2 = ga.field_f - 140;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = var6Lifetime2 * 256 / 20;
          }
          in.field_s.a(15 + var3, 10 + var4, var7Lifetime2 * var5 >> 8);
        }
        return;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -87 / ((-14 - param1) / 39);
          stackIn_1_0 = this.field_b.equals(param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("io.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, int param1, rg param2, int param3, boolean param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        tc var8 = null;
        try {
          ud.field_L[0] = ai.field_d.nextInt();
          ud.field_L[1] = ai.field_d.nextInt();
          uk.field_v.field_m = 0;
          ud.field_L[3] = (int)gj.field_P;
          ud.field_L[2] = (int)(gj.field_P >> 32);
          uk.field_v.d(ud.field_L[0], -55);
          uk.field_v.d(ud.field_L[1], -71);
          uk.field_v.d(ud.field_L[2], -68);
          uk.field_v.d(ud.field_L[3], -48);
          wf.a(1, uk.field_v);
          uk.field_v.b(1276387944, param3);
          param2.a((byte) -12, uk.field_v);
          aa.field_f.field_m = 0;
          if (param0) {
            aa.field_f.e(160, 18);
          } else {
            aa.field_f.e(160, 16);
          }
          aa.field_f.field_m = aa.field_f.field_m + 2;
          var5_int = aa.field_f.field_m;
          aa.field_f.d(ra.field_c, -118);
          aa.field_f.a(false, hf.field_t);
          var6 = 0;
          if (uj.field_Lb) {
            var6 = var6 | 1;
          }
          if (vm.field_d) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (sc.field_a != null) {
            var6 = var6 | 16;
          }
          aa.field_f.e(160, var6);
          var7 = ln.a(ao.a(13867), (byte) -85);
          if (var7 == null) {
            var7 = "";
          }
          aa.field_f.b((byte) -41, var7);
          if (sc.field_a != null) {
            aa.field_f.a((byte) -66, sc.field_a);
          }
          if (param1 >= -40) {
            var8 = (tc) null;
            io.a((tc) null, (byte) 105);
          }
          wh.a(ag.field_m, aa.field_f, tp.field_t, uk.field_v, 12556);
          aa.field_f.c(7519, aa.field_f.field_m - var5_int);
          vg.b(-1, 10000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("io.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(tc param0, byte param1) {
        try {
          hk.field_d = param0;
          pe.field_c = hk.field_d.field_z + hk.field_d.field_w;
          int var2_int = -116 / ((70 - param1) / 48);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "io.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        try {
          if (param1 != -80419032) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            this.a((java.applet.Applet) null, 6);
          }
          nn.a(param0, -75, this.field_b, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "io.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        if (param0 <= 97) {
          field_g = (fm) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    io(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "io.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Use this alternative as your account name";
    }
}
