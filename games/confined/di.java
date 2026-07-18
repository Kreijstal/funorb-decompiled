/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String[] field_g;
    static String field_e;
    static bi field_a;
    static String field_c;
    static String field_b;
    static od field_d;
    static String field_f;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, nf[] param1, byte param2, int param3, int param4, int param5) {
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 >= param4) {
                  break L1;
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param1[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param1[3].field_t;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param1[5]) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param1[5].field_t;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null != param1[1]) {
                        stackOut_15_0 = param1[1].field_x;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param1[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param1[7].field_x;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param3 - -param4;
                      var11 = param0 + param5;
                      var12 = var6_int + param3;
                      if (param2 < -23) {
                        break L6;
                      } else {
                        var23 = null;
                        di.a(-48, (nf[]) null, (byte) 113, -19, 53, -112);
                        break L6;
                      }
                    }
                    L7: {
                      var13 = var10 + -var7;
                      var14 = var8 + param5;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L7;
                      } else {
                        var17 = param3 + var6_int * param4 / (var6_int - -var7);
                        var16 = param3 + var6_int * param4 / (var6_int - -var7);
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      fn.b(fj.field_E);
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = var8 * param0 / (var9 + var8) + param5;
                        var18 = var8 * param0 / (var9 + var8) + param5;
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param1[0]) {
                        break L9;
                      } else {
                        fn.f(param3, param5, var16, var18);
                        param1[0].d(param3, param5);
                        fn.a(fj.field_E);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[2] == null) {
                        break L10;
                      } else {
                        fn.f(var17, param5, var10, var18);
                        param1[2].d(var13, param5);
                        fn.a(fj.field_E);
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[6] == null) {
                        break L11;
                      } else {
                        fn.f(param3, var19, var16, var11);
                        param1[6].d(param3, var15);
                        fn.a(fj.field_E);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[8]) {
                        break L12;
                      } else {
                        fn.f(var17, var19, var10, var11);
                        param1[8].d(var13, var15);
                        fn.a(fj.field_E);
                        break L12;
                      }
                    }
                    L13: {
                      if (param1[1] == null) {
                        break L13;
                      } else {
                        if (0 == param1[1].field_t) {
                          break L13;
                        } else {
                          fn.f(var16, param5, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var13 <= var20) {
                              fn.a(fj.field_E);
                              break L13;
                            } else {
                              param1[1].d(var20, param5);
                              var20 = var20 + param1[1].field_t;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param1[7]) {
                        break L15;
                      } else {
                        if (param1[7].field_t != 0) {
                          fn.f(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var20 >= var13) {
                              fn.a(fj.field_E);
                              break L15;
                            } else {
                              param1[7].d(var20, var15);
                              var20 = var20 + param1[7].field_t;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (null == param1[3]) {
                        break L17;
                      } else {
                        if (param1[3].field_x != 0) {
                          fn.f(param3, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var15 <= var20) {
                              fn.a(fj.field_E);
                              break L17;
                            } else {
                              param1[3].d(param3, var20);
                              var20 = var20 + param1[3].field_x;
                              continue L18;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (null == param1[5]) {
                        break L19;
                      } else {
                        if (0 == param1[5].field_x) {
                          break L19;
                        } else {
                          fn.f(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var20 >= var15) {
                              fn.a(fj.field_E);
                              break L19;
                            } else {
                              param1[5].d(var13, var20);
                              var20 = var20 + param1[5].field_x;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (param1[4] == null) {
                        break L21;
                      } else {
                        if (param1[4].field_t == 0) {
                          break L21;
                        } else {
                          if (0 != param1[4].field_x) {
                            fn.f(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                fn.a(fj.field_E);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param1[4].field_x;
                                    continue L22;
                                  } else {
                                    param1[4].d(var21, var20);
                                    var21 = var21 + param1[4].field_t;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("di.C(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L24;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L24;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(boolean param0) {
        if (!(null != qc.field_m)) {
            return "";
        }
        return qc.field_m;
    }

    final static void a(int param0, int param1, int param2) {
        if (!((1 << param2 & i.field_o) == 0)) {
            return;
        }
        i.field_o = i.field_o | 1 << param2;
        if (param0 != -30867) {
            field_a = null;
        }
        oj.field_B = oj.field_B | 1 << param2;
        qn.field_v.field_u.a((rk) (Object) new an(param2), (byte) -110);
        ra.field_c.a((rk) (Object) new sf(param2, param1, qn.field_v.field_B.field_yb + bd.field_h, we.field_g + qn.field_v.field_J.field_o, d.field_a + -qn.field_v.field_h, rc.field_i), (byte) 73);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_e = "<col=FFFFFF>Power-up attractor:</col> collect this and your ship will attempt to pull power-ups in automatically for 30 seconds, enabling you to concentrate more on dodging enemy fire and aiming your weapons.";
        field_b = "<col=FFFFFF>Mine:</col> the aliens start dropping these from Level 7 onwards. They are hard to see, but will explode and damage your shields if you hit them. Try not to!";
        field_c = "No";
        field_f = "Collision course";
    }
}
