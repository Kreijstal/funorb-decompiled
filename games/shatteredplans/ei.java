/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static int[] field_g;
    static String field_b;
    static int[] field_d;
    static int field_e;
    static String[][] field_f;
    static java.applet.Applet field_c;
    static bi field_a;

    final static void a(int param0, fb param1) {
        fb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param1.b((byte) -86);
            var2 = (fb) (Object) kj.field_a.d(0);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param1, -1)) {
                    break L2;
                  } else {
                    var2 = (fb) (Object) kj.field_a.a((byte) -71);
                    continue L1;
                  }
                }
              }
              L3: {
                if (var2 != null) {
                  wp.a((byte) -123, (oh) (Object) param1, (oh) (Object) var2);
                  break L3;
                } else {
                  kj.field_a.a((byte) -113, (oh) (Object) param1);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("ei.C(").append(0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static void a(byte param0, nf param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 >= 35) {
              L1: while (true) {
                if (var2_int >= 3) {
                  var2_int = 0;
                  L2: while (true) {
                    if (var2_int >= da.field_g) {
                      int dupTemp$4 = param1.a((byte) 113);
                      im.field_b[dupTemp$4] = im.field_b[dupTemp$4] + 1;
                      var2_int = 0;
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= da.field_g) {
                          da.field_g = var2_int;
                          int fieldTemp$5 = da.field_g;
                          da.field_g = da.field_g + 1;
                          wm.field_d[fieldTemp$5] = param1;
                          break L0;
                        } else {
                          L4: {
                            L5: {
                              if (wm.field_d[var3].field_n != param1.field_n) {
                                break L5;
                              } else {
                                var4 = wm.field_d[var3].a((byte) 115);
                                if (kp.field_i < im.field_b[var4]) {
                                  im.field_b[var4] = im.field_b[var4] - 1;
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            int incrementValue$6 = var2_int;
                            var2_int++;
                            wm.field_d[incrementValue$6] = wm.field_d[var3];
                            break L4;
                          }
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      L6: {
                        if (wm.field_d[var2_int].field_n != param1.field_n) {
                          break L6;
                        } else {
                          int dupTemp$7 = wm.field_d[var2_int].a((byte) 115);
                          im.field_b[dupTemp$7] = im.field_b[dupTemp$7] + 1;
                          break L6;
                        }
                      }
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  im.field_b[var2_int] = 0;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte[] param2) {
        sl var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var10 = js.field_f;
            var10.h(param0, 255);
            var10.field_j = var10.field_j + 1;
            var7 = var10.field_j;
            var10.c(4, (byte) -106);
            var10.c(param1, (byte) -122);
            var8 = 0;
            var8 += 128;
            var10.c(var8, (byte) -56);
            var10.a(0, param2.length, param2, 22186);
            var10.b(-var7 + var10.field_j, (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ei.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + true + ',' + false + ',' + 0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 20) {
                break L1;
              } else {
                if (param1 <= 20) {
                  break L1;
                } else {
                  var17 = new int[4];
                  var16 = var17;
                  var15 = var16;
                  var14 = var15;
                  var13 = var14;
                  var7_array = var13;
                  gf.a(var17);
                  gf.a(param5, param4, param2, param1, 10, 0, 200);
                  am.a(-10 + param2, param6, param3 ^ 12362, -10 + param1, param5, param4);
                  gf.f(param5 + 10, param4, param2 + -20, 2052949);
                  gf.f(10 + param5, param4 - -param1, param2 + -20, 0);
                  gf.i(param5, param4, param5 - -10, 10 + param4);
                  gf.b(param5 - -10, 10 + param4, 10, 2052949);
                  gf.b(var17);
                  gf.i(-10 + param2 + param5, param4, param5 - -param2, param4 + 10);
                  gf.b(-11 + (param5 + param2), 10 + param4, 10, 2052949);
                  gf.b(var17);
                  if (param3 == -12394) {
                    gf.i(param5, param4 + (param1 - 10), 10 + param5, param4 + param1);
                    gf.b(param5 - -10, -10 + param1 + param4 - 1, 10, 0);
                    gf.b(var17);
                    gf.i(param5 - -param2 + -10, -10 + param1 + param4, param5 - -param2, param1 + param4);
                    gf.b(param2 + param5 - 11, param1 + param4 + -11, 10, 0);
                    gf.b(var17);
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= param1 + -20) {
                        L3: {
                          if (param0) {
                            jl.field_W.c(param5 - -4, param4 - -3, 256);
                            var8 = param5 + 4 - -jl.field_W.field_z;
                            var9 = param5 + param2 + -3 - mr.field_g.field_z;
                            mr.field_g.c(var9, 3 + param4, 64);
                            var11 = var8;
                            L4: while (true) {
                              if (var11 >= var9) {
                                break L3;
                              } else {
                                var10 = 192 * (var9 + -var11) / (-var8 + var9) + 64;
                                me.field_h.c(var11, 3 + param4, var10);
                                var11++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        break L0;
                      } else {
                        var9 = ui.a(2052949, 0, -110, var8 * 256 / (param1 + -20));
                        gf.a(param5, 10 + param4 + var8, var9);
                        gf.a(param2 + (param5 + -1), var8 + (10 + param4), var9);
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (ma.field_p < 2) {
          return 0;
        } else {
          L0: {
            if (0 == ai.field_e) {
              if (rq.field_g.b((byte) 122)) {
                if (!rq.field_g.a("commonui", 60)) {
                  return 40;
                } else {
                  if (!tq.field_f.b((byte) -109)) {
                    return 50;
                  } else {
                    if (!tq.field_f.a("commonui", -112)) {
                      return 60;
                    } else {
                      if (l.field_g.b((byte) -85)) {
                        if (!l.field_g.a(-1)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                }
              } else {
                return 20;
              }
            } else {
              L1: {
                if (es.field_j == null) {
                  break L1;
                } else {
                  if (es.field_j.b((byte) -122)) {
                    if (es.field_j.b("", (byte) -122)) {
                      if (es.field_j.a("", -70)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (rq.field_g.b((byte) 125)) {
                if (rq.field_g.a("commonui", 127)) {
                  if (!tq.field_f.b((byte) -90)) {
                    return 71;
                  } else {
                    if (!tq.field_f.a("commonui", -105)) {
                      return 80;
                    } else {
                      if (!l.field_g.b((byte) -95)) {
                        return 82;
                      } else {
                        if (l.field_g.a(-1)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    }
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have been removed from <%0>'s game.";
        field_g = new int[]{100, 100, 200, 200, 300, 100, 300, 200, 200, 200, 300, 300, 100, 300, 500, 500, 500, 500, 300, 500, 300, 500, 100, 100, 500};
    }
}
