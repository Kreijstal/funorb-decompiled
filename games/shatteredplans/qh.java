/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends vd {
    static String field_D;
    jk field_x;
    boolean field_A;
    lp field_z;
    static String field_u;
    private String field_y;
    static String field_B;
    static String field_w;
    static String field_C;
    static boolean field_v;

    final static bi a(bi param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        bi stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (0 > param3) {
                param2 = param2 + param3;
                var6_int = var6_int - param3;
                param3 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = 0;
              if (param1 < 0) {
                param5 = param5 + param1;
                var7 = var7 - param1;
                param1 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 - -param2 > 640) {
                param2 = -param3 + 640;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 - -param5 > 480) {
                param5 = -param1 + 480;
                break L4;
              } else {
                break L4;
              }
            }
            if (param2 >= 0) {
              if (param5 >= 0) {
                L5: {
                  L6: {
                    if (param0 == null) {
                      break L6;
                    } else {
                      if (~param0.field_z > ~param2) {
                        break L6;
                      } else {
                        if (~param5 < ~param0.field_w) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  param0 = new bi(param2, param5);
                  break L5;
                }
                var8 = gf.field_b - param2;
                var9 = param0.field_z + -param2;
                var10 = -1 + param1 * gf.field_b + param3;
                var11 = -1;
                var12 = -param5;
                L7: while (true) {
                  if (0 <= var12) {
                    param0.field_x = var7;
                    param0.field_t = var6_int;
                    stackOut_29_0 = (bi) param0;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    var13 = -param2;
                    L8: while (true) {
                      if (0 <= var13) {
                        var10 = var10 + var8;
                        var11 = var11 + var9;
                        var12++;
                        continue L7;
                      } else {
                        var11++;
                        var10++;
                        param0.field_B[var11] = gf.field_h[var10];
                        var13++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("qh.O(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + -1 + 44 + param5 + 41);
        }
        return stackIn_30_0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vd var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 51 / ((67 - param0) / 47);
        if (!((qh) this).field_s) {
          return;
        } else {
          L0: {
            var3 = 2052949;
            var4 = 1125164;
            var5 = 3974311;
            if (!((qh) this).field_A) {
              break L0;
            } else {
              L1: {
                var6 = cl.field_n % 64;
                if (var6 <= 24) {
                  break L1;
                } else {
                  if (var6 > 40) {
                    break L1;
                  } else {
                    var6 = 24;
                    break L1;
                  }
                }
              }
              L2: {
                if (40 >= var6) {
                  break L2;
                } else {
                  var6 = 64 - var6;
                  break L2;
                }
              }
              var6 = var6 * 10;
              var3 = ui.a(2052949, 12993090, -108, var6);
              var4 = ui.a(var4, 12993090, -122, var6);
              var5 = ui.a(var5, 12993090, -128, var6);
              break L0;
            }
          }
          gf.a(((qh) this).field_k, ((qh) this).field_t, ((qh) this).field_m, ((qh) this).field_i, 10, 0, 200);
          am.a(-10 + ((qh) this).field_m, var5, -79, 15, ((qh) this).field_k, ((qh) this).field_t);
          gf.f(10 + ((qh) this).field_k, ((qh) this).field_t, ((qh) this).field_m + -20, var3);
          gf.f(10 + ((qh) this).field_k, ((qh) this).field_i + ((qh) this).field_t, -20 + ((qh) this).field_m, 0);
          gf.d(((qh) this).field_k, ((qh) this).field_t, ((qh) this).field_k - -10, ((qh) this).field_t + 10);
          gf.b(((qh) this).field_k + 10, ((qh) this).field_t - -10, 10, var3);
          gf.d(-10 + (((qh) this).field_k - -((qh) this).field_m), ((qh) this).field_t, ((qh) this).field_m + ((qh) this).field_k, 10 + ((qh) this).field_t);
          gf.b(-1 + ((qh) this).field_m + (((qh) this).field_k - 10), ((qh) this).field_t - -10, 10, var3);
          gf.d(((qh) this).field_k, -10 + ((qh) this).field_t + ((qh) this).field_i, ((qh) this).field_k + 10, ((qh) this).field_t + ((qh) this).field_i);
          gf.b(10 + ((qh) this).field_k, -1 + (-10 + (((qh) this).field_t - -((qh) this).field_i)), 10, 0);
          gf.d(((qh) this).field_m + ((qh) this).field_k + -10, ((qh) this).field_t + ((qh) this).field_i - 10, ((qh) this).field_m + ((qh) this).field_k, ((qh) this).field_t + ((qh) this).field_i);
          gf.b(((qh) this).field_k - -((qh) this).field_m - 11, ((qh) this).field_i + (((qh) this).field_t - 11), 10, 0);
          gf.a();
          var6 = 0;
          L3: while (true) {
            if (~var6 <= ~(((qh) this).field_i + -20)) {
              gf.a(3 + ((qh) this).field_k, 15 + ((qh) this).field_t, ((qh) this).field_m - 6, -3 + (((qh) this).field_i - 15), 10, 0);
              gf.f(3 + (10 + ((qh) this).field_k), 15 + ((qh) this).field_t, -20 + ((qh) this).field_m + -6, var3);
              gf.f(10 + (((qh) this).field_k + 3), -3 + ((qh) this).field_t - (-((qh) this).field_i - -1), -6 + (((qh) this).field_m - 20), var4);
              gf.d(((qh) this).field_k + 3, ((qh) this).field_t + 15, 3 + (((qh) this).field_k + 10), ((qh) this).field_t + 25);
              gf.b(13 + ((qh) this).field_k, 25 + ((qh) this).field_t, 10, var3);
              gf.d(-3 + ((qh) this).field_m + (((qh) this).field_k - 10), 15 + ((qh) this).field_t, -3 + ((qh) this).field_k + ((qh) this).field_m, ((qh) this).field_t + 25);
              gf.b(((qh) this).field_m + (((qh) this).field_k - 14), ((qh) this).field_t - -25, 10, var3);
              gf.d(3 + ((qh) this).field_k, ((qh) this).field_i + ((qh) this).field_t - 13, ((qh) this).field_k + 13, -3 + (((qh) this).field_t + ((qh) this).field_i));
              gf.b(3 + ((qh) this).field_k - -10, -4 + (-10 + ((qh) this).field_t - -((qh) this).field_i), 10, var4);
              gf.d(((qh) this).field_m + ((qh) this).field_k - 13, -13 + (((qh) this).field_i + ((qh) this).field_t), -3 + ((qh) this).field_m + ((qh) this).field_k, ((qh) this).field_t - (-((qh) this).field_i + 3));
              gf.b(-10 + ((qh) this).field_m + (((qh) this).field_k - 4), -3 + ((qh) this).field_t + ((qh) this).field_i - 11, 10, var4);
              gf.a();
              var6 = 0;
              L4: while (true) {
                if (~(2 * (-38 + ((qh) this).field_i) / 3) >= ~var6) {
                  var6 = (((qh) this).field_i * 2 - 76) / 3;
                  var7 = 0;
                  L5: while (true) {
                    if (-var6 + ((qh) this).field_i + -38 <= var7) {
                      jl.field_W.c(4 + ((qh) this).field_k, ((qh) this).field_t - -3, 256);
                      var7 = jl.field_W.field_z + 1 + (((qh) this).field_k - -3);
                      var8 = -mr.field_g.field_z + -3 + (((qh) this).field_m + ((qh) this).field_k);
                      mr.field_g.c(var8, 3 + ((qh) this).field_t, 64);
                      var10 = var7;
                      L6: while (true) {
                        if (var10 >= var8) {
                          rs.field_Cb.c(((qh) this).field_y, ((qh) this).field_k + ((qh) this).field_m / 2, ((qh) this).field_t + 12, 16777215, -1);
                          var12 = (vd) (Object) ((qh) this).field_l.f(3725);
                          L7: while (true) {
                            if (var12 == null) {
                              return;
                            } else {
                              var12.a(-14);
                              var12 = (vd) (Object) ((qh) this).field_l.b(-124);
                              continue L7;
                            }
                          }
                        } else {
                          var9 = 64 + 192 * (-var10 + var8) / (var8 + -var7);
                          me.field_h.c(var10, ((qh) this).field_t - -3, var9);
                          var10++;
                          continue L6;
                        }
                      }
                    } else {
                      var8 = ui.a(0, var4, -117, 256 * var7 / (-38 + ((qh) this).field_i + -var6));
                      gf.a(((qh) this).field_k - -3, var6 + var7 + (15 + ((qh) this).field_t - -10), var8);
                      gf.a(-1 + (((qh) this).field_k - -((qh) this).field_m + -3), 25 + ((qh) this).field_t - (-var7 - var6), var8);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = ui.a(var3, 0, -82, 256 * var6 / ((-76 + 2 * ((qh) this).field_i) / 3));
                  gf.a(((qh) this).field_k + 3, ((qh) this).field_t + 25 + var6, var7);
                  gf.a(-1 + ((qh) this).field_k - (-((qh) this).field_m - -3), var6 + (((qh) this).field_t + 25), var7);
                  var6++;
                  continue L4;
                }
              }
            } else {
              var7 = ui.a(var3, 0, -109, var6 * 256 / (-20 + ((qh) this).field_i));
              gf.a(((qh) this).field_k, var6 + ((qh) this).field_t + 10, var7);
              gf.a(((qh) this).field_m + (((qh) this).field_k + -1), ((qh) this).field_t + 10 - -var6, var7);
              var6++;
              continue L3;
            }
          }
        }
    }

    final vd b(byte param0, int param1, int param2) {
        if (!((qh) this).field_s) {
            return null;
        }
        vd var4 = as.a(((qh) this).field_l, param1, (byte) -112, param2);
        if (param0 < 51) {
            return null;
        }
        if (var4 == null) {
            return super.b((byte) 123, param1, param2);
        }
        return var4;
    }

    public static void d() {
        field_u = null;
        field_C = null;
        field_D = null;
        field_B = null;
        field_w = null;
    }

    final static boolean f() {
        return null != bj.field_K ? true : br.field_i;
    }

    final static void g() {
        if (!(pg.field_J <= 0)) {
            pg.field_J = pg.field_J - 1;
        }
        if (pc.field_m != so.field_q.field_d) {
            fl.field_f = fl.field_f + (-pc.field_m + so.field_q.field_d);
            pc.field_m = so.field_q.field_d;
        }
        if (!(pg.field_J <= 0)) {
            bq.a(125);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (!(39 <= param1)) {
            param1 = 39;
        }
        if (param2 < 27) {
            param2 = 27;
        }
        if (!(param2 >= 40 + rs.field_Cb.c(((qh) this).field_y + "X"))) {
            param2 = rs.field_Cb.c(((qh) this).field_y + "X") - -40;
        }
        if (!param0) {
            ((qh) this).a(1);
        }
        ((qh) this).field_m = param2;
        ((qh) this).field_i = param1;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = param0 + lh.field_w;
        int var5 = ir.field_D + param1;
        if (param2 != -498) {
            ((qh) this).a(-47);
        }
        int var6 = -((qh) this).field_k + var4;
        if (((qh) this).field_k - -var6 < -((qh) this).field_m / 2) {
            var6 = -((qh) this).field_k + -((qh) this).field_m / 2;
        }
        int var7 = var5 + -((qh) this).field_t;
        if (-(((qh) this).field_m / 2) + 640 < var6 + ((qh) this).field_k) {
            var6 = -(((qh) this).field_m / 2) + (640 - ((qh) this).field_k);
        }
        if (!(((qh) this).field_t + var7 >= 0)) {
            var7 = -((qh) this).field_t;
        }
        if (!(var7 + ((qh) this).field_t <= 465)) {
            var7 = 465 - ((qh) this).field_t;
        }
        ((qh) this).d(var7, var6, 0);
    }

    qh(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        try {
            ((qh) this).field_y = param4;
            ((qh) this).a(true, param3, param2);
            ((qh) this).field_l = new pf();
            ((qh) this).field_p = true;
            ((qh) this).field_s = false;
            ((qh) this).field_A = false;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qh.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "This game option is not available in rated games.";
        field_u = "Quick Chat Help";
        field_w = "Real-life threats";
        field_v = true;
        field_C = "Unable to delete name - system busy";
    }
}
