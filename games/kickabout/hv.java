/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static boolean[] field_a;
    static String field_b;
    static String field_d;
    static String[][] field_c;

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            var2 = bg.a((byte) 116, jc.a(param1, param0));
            if (!param0) {
              L1: {
                if (var2 == null) {
                  var2 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (String) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("hv.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, nu param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        nl var18 = null;
        nl var19 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var18 = param1.field_P[param2][0];
              var19 = var18;
              if (param2 != 1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_4_0;
              if (var4 != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1344;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              var6 = var19.f(-95);
              var7 = var19.a(param0);
              var8 = param1.field_V.a(true);
              var9 = param1.field_V.c(879306160);
              var10 = param1.field_V.e(-107);
              var11 = 448 + -var8;
              var12 = -var9 + var5;
              if (62500 <= var11 * var11 + var12 * var12) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var13 = stackIn_10_0;
                if (var19.field_u == 14) {
                  break L5;
                } else {
                  if (var19.field_u != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            }
            L6: {
              L7: {
                var14 = stackIn_15_0;
                if (3 == var19.field_u) {
                  var19.field_G = uv.a(true, var9 + -var7, -var6 + var8);
                  if (-1 != param1.field_V.field_m) {
                    L8: {
                      if (param1.field_V.field_m != param2) {
                        break L8;
                      } else {
                        if (param1.field_V.field_s != 0) {
                          break L8;
                        } else {
                          var19.a((byte) -31, 10);
                          break L6;
                        }
                      }
                    }
                    var15 = -448 + var6;
                    var16 = -var5 + var7;
                    if (62500 >= var15 * var15 + var16 * var16) {
                      break L7;
                    } else {
                      var19.field_L = 0;
                      break L6;
                    }
                  } else {
                    var19.a((byte) -31, 0);
                    break L6;
                  }
                } else {
                  if (var14 != 0) {
                    L9: {
                      if (param1.field_V.field_m != param2) {
                        break L9;
                      } else {
                        if (param1.field_V.field_s == 0) {
                          lk.a(param2, param1, -96, var19);
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var13 == 0) {
                        break L10;
                      } else {
                        if (-1 != param1.field_V.field_m) {
                          break L10;
                        } else {
                          if (var10 < 400000) {
                            var19.field_u = 0;
                            ue.a(4, var8, var19, var9);
                            break L6;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (!wt.a(param1.field_V, var19, (byte) -75, param2)) {
                      L11: {
                        gg.a(param2, 0, param1.field_V);
                        ue.a(4, pu.field_zb[0], var18, pu.field_zb[1]);
                        if (var19.field_u != 0) {
                          break L11;
                        } else {
                          if (0 == var19.field_G) {
                            var19.a((byte) -31, 14);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (var13 != 0) {
                          es.a(-120, var19, param2, param1.b((byte) -96), param1.field_V);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (var19.field_u != 14) {
                        break L7;
                      } else {
                        var19.a(uv.a(param0, -var19.a(true) + var9, var8 + -var19.f(-98)), 26214);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var3;
            stackOut_46_1 = new StringBuilder().append("hv.B(").append(param0).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L13;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L13;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(hu param0, int param1) {
        try {
            cq.field_e = param0;
            ae.field_D = h.a(17475);
            js.field_d = new tf();
            bk.field_c = new gv[6];
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "hv.D(" + (param0 != null ? "{...}" : "null") + 44 + -448 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new boolean[73];
        field_b = "Player's Stats at Max";
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_a[var0] = false;
        }
        field_a[23] = true;
        field_a[66] = true;
        field_a[28] = true;
        field_a[54] = true;
        field_d = "leave";
        field_c = new String[][]{new String[3], new String[3]};
    }
}
