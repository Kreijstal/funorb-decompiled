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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var14 = new int[4];
            var13 = var14;
            var12 = var13;
            var8_array = var12;
            gf.a(var14);
            if (param2 * 2 <= param3) {
              L1: {
                gf.f(param2 + param4, param5, param3 - 2 * param2, param1);
                gf.f(param2 + param4, param5 - -param7, -(2 * param2) + param3, param6);
                gf.i(param4, param5, param4 - -param2, param5 - -param2);
                gf.b(param2 + param4, param5 - -param2, param2, param1);
                gf.b(var14);
                gf.i(param4 + (param3 - param2), param5, param4 + param3, param5 + param2);
                gf.b(-param2 + param3 + (param4 + -1), param5 + param2, param2, param1);
                gf.b(var14);
                gf.i(param4, -param2 + (param7 + param5), param4 + param2, param5 - -param7);
                gf.b(param4 - -param2, -1 + (param7 + param5 + -param2), param2, param6);
                gf.b(var14);
                gf.i(-param2 + (param3 + param4), param5 - -param7 - param2, param4 - -param3, param5 - -param7);
                gf.b(-1 + param4 - (-param3 + param2), param7 + param5 - (param2 - -1), param2, param6);
                gf.b(var14);
                if (param0 == 20) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                if (-20 + param7 <= var9) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10 = ui.a(param1, param6, param0 ^ -72, 256 * var9 / (param7 - 20));
                  gf.a(param4, param2 + (param5 + var9), var10);
                  gf.a(-1 + (param3 + param4), var9 + (param5 + param2), var10);
                  var9++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var8), "ch.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -15073) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = vo.field_b;
            L2: while (true) {
              if (t.field_c.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = pr.field_d[var3_int];
                  if (0 <= var5) {
                    var6 = or.a(true, t.field_c[var3_int], true);
                    var4 = var4 + js.field_e;
                    var7 = -(var6 >> 1803979169) + ol.field_e;
                    if (ek.a((uo.field_g << -83196383) + vh.field_b, param2, var7 + -js.field_g, (byte) -100, var4, (js.field_g << 765712929) + var6, param1)) {
                      stackOut_9_0 = var5;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (vh.field_b + (js.field_e + (uo.field_g << 1433234241)));
                      break L3;
                    }
                  } else {
                    var4 = var4 + fe.field_A;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "ch.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_15_0;
        }
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_6_0 = null;
        bi stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (vd.a(param3, param0, param2, 2)) {
              if (param1 < -104) {
                stackOut_6_0 = ed.a(true);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (bi) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ch.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static qh a(byte param0) {
        ne.field_l = new qh(0, 60, 238, 300, ShatteredPlansClient.field_L.toUpperCase());
        fe var1 = new fe(-16 + ne.field_l.field_k - -ne.field_l.field_m, 2 + ne.field_l.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var1.field_h = ne.field_l;
        lh var2 = new lh(-20 + ne.field_l.field_m, ne.field_l.field_t - -20, -28 + ne.field_l.field_i, 3974311);
        int var3 = -24 / ((param0 - 57) / 47);
        ne.field_l.a(var1, 8);
        ne.field_l.a(var2, 8);
        lp var4 = new lp(ne.field_l.field_k + 9, 20 + ne.field_l.field_t, 209, ne.field_l.field_i + -28);
        ne.field_l.a(var4, 8);
        ne.field_l.field_z = var4;
        var2.field_x = (gj) ((Object) var4);
        em var5 = new em();
        ne.field_l.field_x = (jk) ((Object) var5);
        var5.field_e = var2;
        return ne.field_l;
    }

    final static bi[] a(int param0, byte param1, bc param2, int param3) {
        bi discarded$2 = null;
        RuntimeException var4 = null;
        bc var5 = null;
        Object stackIn_4_0 = null;
        bi[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bi[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 87) {
                break L1;
              } else {
                var5 = (bc) null;
                discarded$2 = ch.a((bc) null, 22, -122, 78);
                break L1;
              }
            }
            if (vd.a(param3, param2, param0, 2)) {
              stackOut_5_0 = rq.a(0);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bi[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            if (param0 > 86) {
              L1: while (true) {
                if (!cc.e((byte) 55)) {
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
                        if (-3 != (var2 ^ -1)) {
                          break L3;
                        } else {
                          oi.a(true);
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = var2;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 1;
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
            } else {
              stackOut_2_0 = 86;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ch.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_15_0;
        }
    }

    public static void b(byte param0) {
        int var1 = 1 % ((-34 - param0) / 52);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Percentage of fleets attacking each turn (average for game).";
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
