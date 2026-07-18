/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr {
    int field_g;
    int field_b;
    boolean field_a;
    static String field_e;
    static int[][] field_h;
    private int field_d;
    int field_c;
    int field_i;
    static vg field_f;

    final static int a(boolean param0) {
        return cg.field_j;
    }

    final static String a() {
        if (!(du.field_d != oh.field_L)) {
            return qk.field_b;
        }
        return ah.field_d;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 <= 52) {
            jr.b(125);
            field_f = null;
            field_h = null;
            return;
        }
        field_f = null;
        field_h = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param2) {
          if (((jr) this).field_a) {
            if (0 >= param0) {
              int discarded$3 = 128;
              lw.field_ob.d(((jr) this).field_b + (param3 - 20), -20 + param1 + ((jr) this).field_g, fe.b(bo.field_g[((jr) this).field_c]));
              if (((jr) this).field_i == 81) {
                pl.field_x[4].g(-20 + (param3 + ((jr) this).field_b), param1 - -((jr) this).field_g + -20, 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              } else {
                pl.field_x[((jr) this).field_i].g(-20 + ((jr) this).field_b + param3, -20 + (param1 - -((jr) this).field_g), 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              }
            } else {
              if (!((jr) this).b(31, sm.field_d, param1, param3, ko.field_b)) {
                lw.field_ob.d(-20 + ((jr) this).field_b + param3, param1 + ((jr) this).field_g - 20, bo.field_g[((jr) this).field_c]);
                if (((jr) this).field_i != 81) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              } else {
                lw.field_ob.b(param3 - (-((jr) this).field_b - -20), -20 + (((jr) this).field_g + param1), bo.field_g[((jr) this).field_c]);
                if (((jr) this).field_i != 81) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              }
            }
          } else {
            if (param0 <= 0) {
              hr.field_d[((jr) this).field_c].g(param3 - (-((jr) this).field_b - -25), -25 + (((jr) this).field_g + param1), 128);
              fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
              return;
            } else {
              if (!((jr) this).b(112, sm.field_d, param1, param3, ko.field_b)) {
                hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 - 25, param1 + (((jr) this).field_g + -25));
                fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
                return;
              } else {
                hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 + -25, param1 + (((jr) this).field_g - 25));
                hr.field_d[0].f(param3 + (((jr) this).field_b + -25), -25 + ((jr) this).field_g + param1, 256);
                fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
                return;
              }
            }
          }
        } else {
          int discarded$4 = jr.a(false);
          if (((jr) this).field_a) {
            if (0 >= param0) {
              int discarded$5 = 128;
              lw.field_ob.d(((jr) this).field_b + (param3 - 20), -20 + param1 + ((jr) this).field_g, fe.b(bo.field_g[((jr) this).field_c]));
              if (((jr) this).field_i == 81) {
                pl.field_x[4].g(-20 + (param3 + ((jr) this).field_b), param1 - -((jr) this).field_g + -20, 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              } else {
                pl.field_x[((jr) this).field_i].g(-20 + ((jr) this).field_b + param3, -20 + (param1 - -((jr) this).field_g), 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              }
            } else {
              if (!((jr) this).b(31, sm.field_d, param1, param3, ko.field_b)) {
                L0: {
                  lw.field_ob.d(-20 + ((jr) this).field_b + param3, param1 + ((jr) this).field_g - 20, bo.field_g[((jr) this).field_c]);
                  if (((jr) this).field_i != 81) {
                    pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                    break L0;
                  } else {
                    pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                    break L0;
                  }
                }
                km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                return;
              } else {
                lw.field_ob.b(param3 - (-((jr) this).field_b - -20), -20 + (((jr) this).field_g + param1), bo.field_g[((jr) this).field_c]);
                if (((jr) this).field_i != 81) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              }
            }
          } else {
            L1: {
              if (param0 <= 0) {
                hr.field_d[((jr) this).field_c].g(param3 - (-((jr) this).field_b - -25), -25 + (((jr) this).field_g + param1), 128);
                break L1;
              } else {
                if (!((jr) this).b(112, sm.field_d, param1, param3, ko.field_b)) {
                  hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 - 25, param1 + (((jr) this).field_g + -25));
                  break L1;
                } else {
                  hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 + -25, param1 + (((jr) this).field_g - 25));
                  hr.field_d[0].f(param3 + (((jr) this).field_b + -25), -25 + ((jr) this).field_g + param1, 256);
                  break L1;
                }
              }
            }
            fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = param0 | param0 << 8;
            var5_int = param0 ^ param0 >> 1;
            var8 = 0;
            var9 = 0;
            L1: while (true) {
              if (var9 >= 4) {
                break L0;
              } else {
                var7 = (7 & param0) + param2 + (bm.field_y[var9][1] - 64);
                var6 = -54 + (param4 + (bm.field_y[var9][0] - -(var5_int & 15)));
                var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
                param0 = param0 >> 1;
                var5_int = var5_int >> 1;
                jq.field_G[var10].h(60 + var6, 50 + var7);
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "jr.A(" + param0 + ',' + 117 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    jr(boolean param0, int param1, int param2, int param3) {
        ((jr) this).field_d = param3;
        ((jr) this).field_a = param0 ? true : false;
        ((jr) this).field_c = param1;
        ((jr) this).field_i = param2;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = -param1 + param3 - -((jr) this).field_b;
        if (param0 < 10) {
            field_e = null;
            var7 = ((jr) this).field_g + param2 + -param4;
            if (((jr) this).field_d * ((jr) this).field_d > var7 * var7 + var6 * var6) {
                return true;
            }
            return false;
        }
        var7 = ((jr) this).field_g + param2 + -param4;
        if (((jr) this).field_d * ((jr) this).field_d > var7 * var7 + var6 * var6) {
            return true;
        }
        return false;
    }

    final static void a(int param0, je param1, int param2, byte[] param3, int param4, je param5, int param6, int param7, int param8, je param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            uf.field_a = 6;
            t.field_b = param3;
            oh.field_H = -1L;
            tq.field_b = param3.length;
            no.field_K = null;
            ua.field_s = false;
            ln.field_d = new byte[(uf.field_a + 7) / 8];
            vu.field_M = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (~t.field_b.length >= ~var11) {
                L2: {
                  var10_int = (7 + var10_int) / 8;
                  tg.field_d = new byte[var10_int];
                  if (param9.field_fb != null) {
                    break L2;
                  } else {
                    param9.field_fb = new at();
                    break L2;
                  }
                }
                L3: {
                  be.field_u = param9.field_fb;
                  be.field_u.b(80);
                  oi.field_d = new tp(param4);
                  vj.field_a = 0;
                  be.field_s = -1;
                  oo.field_a = 0;
                  al.field_g = -1;
                  if (null != param1.field_fb) {
                    break L3;
                  } else {
                    param1.field_fb = new at();
                    break L3;
                  }
                }
                L4: {
                  qc.field_g = param1.field_fb;
                  qc.field_g.b(120);
                  qm.field_J = new tp(1024);
                  if (null != param5.field_fb) {
                    break L4;
                  } else {
                    param5.field_fb = new at();
                    break L4;
                  }
                }
                wl.field_F = param5.field_fb;
                wl.field_F.b(122);
                eu.field_e = new tp(param0);
                qd.field_K = 150;
                ph.field_d = 0L;
                break L0;
              } else {
                var10_int = var10_int + (t.field_b[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var10;
            stackOut_12_1 = new StringBuilder().append("jr.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(150).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param4).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(1024).append(',').append(6).append(',').append(-84).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param9 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has used <%1>";
        field_h = new int[][]{new int[5], new int[5], new int[5], new int[5]};
        field_f = null;
    }
}
