/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch implements wr {
    static bi field_c;
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new int[4];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8_array = var12;
            gf.a(var16);
            if (param2 * 2 <= param3) {
              gf.f(param2 + param4, param5, param3 - 2 * param2, param1);
              gf.f(param2 + param4, param5 - -param7, -(2 * param2) + param3, param6);
              gf.i(param4, param5, param4 - -param2, param5 - -param2);
              gf.b(param2 + param4, param5 - -param2, param2, param1);
              gf.b(var16);
              gf.i(param4 + (param3 - param2), param5, param4 + param3, param5 + param2);
              gf.b(-param2 + param3 + (param4 + -1), param5 + param2, param2, param1);
              gf.b(var16);
              gf.i(param4, -param2 + (param7 + param5), param4 + param2, param5 - -param7);
              gf.b(param4 - -param2, -1 + (param7 + param5 + -param2), param2, param6);
              gf.b(var16);
              gf.i(-param2 + (param3 + param4), param5 - -param7 - param2, param4 - -param3, param5 - -param7);
              gf.b(-1 + param4 - (-param3 + param2), param7 + param5 - (param2 - -1), param2, param6);
              gf.b(var16);
              var9 = 0;
              L1: while (true) {
                if (-20 + param7 <= var9) {
                  break L0;
                } else {
                  var10 = ui.a(param1, param6, -84, 256 * var9 / (param7 - 20));
                  gf.a(param4, param2 + (param5 + var9), var10);
                  gf.a(-1 + (param3 + param4), var9 + (param5 + param2), var10);
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var8, "ch.E(" + 20 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = vo.field_b;
            L1: while (true) {
              if (t.field_c.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  var5 = pr.field_d[var3_int];
                  if (0 <= var5) {
                    int discarded$16 = 1;
                    var6 = or.a(true, t.field_c[var3_int]);
                    var4 = var4 + js.field_e;
                    var7 = -(var6 >> 1) + ol.field_e;
                    if (ek.a((uo.field_g << 1) + vh.field_b, param2, var7 + -js.field_g, (byte) -100, var4, (js.field_g << 1) + var6, param1)) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (vh.field_b + (js.field_e + (uo.field_g << 1)));
                      var3_int++;
                      break L2;
                    }
                  } else {
                    var4 = var4 + fe.field_A;
                    var3_int++;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "ch.G(" + -15073 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (vd.a(param3, param0, param2, 2)) {
            int discarded$2 = 1;
            return ed.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ch.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -114 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static qh a() {
        ne.field_l = new qh(0, 60, 238, 300, ShatteredPlansClient.field_L.toUpperCase());
        fe var1 = new fe(-16 + ne.field_l.field_k - -ne.field_l.field_m, 2 + ne.field_l.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var1.field_h = (Object) (Object) ne.field_l;
        lh var2 = new lh(-20 + ne.field_l.field_m, ne.field_l.field_t - -20, -28 + ne.field_l.field_i, 3974311);
        int var3 = -24;
        ne.field_l.a((vd) (Object) var1, 8);
        ne.field_l.a((vd) (Object) var2, 8);
        lp var4 = new lp(ne.field_l.field_k + 9, 20 + ne.field_l.field_t, 209, ne.field_l.field_i + -28);
        ne.field_l.a((vd) (Object) var4, 8);
        ne.field_l.field_z = var4;
        var2.field_x = (gj) (Object) var4;
        em var5 = new em();
        ne.field_l.field_x = (jk) (Object) var5;
        var5.field_e = var2;
        return ne.field_l;
    }

    final static bi[] a(int param0, byte param1, bc param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bi[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (vd.a(param3, param2, param0, 2)) {
              int discarded$2 = 0;
              stackOut_3_0 = rq.a();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bi[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(87).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              int discarded$6 = 55;
              if (!cc.e()) {
                L2: {
                  ns.field_nb.a(-1, ch.a(-15073, td.field_P, nh.field_p), ch.a(-15073, bb.field_b, pd.field_k));
                  if (ns.field_nb.a((byte) 36)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (0 > ns.field_nb.field_c) {
                      break L3;
                    } else {
                      var2 = fs.field_y[ns.field_nb.field_c];
                      if (var2 != 2) {
                        break L3;
                      } else {
                        int discarded$7 = 1;
                        oi.a();
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = var2;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                ns.field_nb.b(0);
                if (!ns.field_nb.a((byte) -82)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ch.D(" + 106 + ')');
        }
        return stackIn_14_0;
    }

    public static void b() {
        int var1 = 1;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Percentage of fleets attacking each turn (average for game).";
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
