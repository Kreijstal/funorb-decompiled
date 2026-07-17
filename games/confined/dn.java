/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static gj field_d;
    static nf[] field_c;
    static ef field_b;
    static String field_a;
    static String[] field_e;
    static ok field_f;

    public static void a() {
        field_b = null;
        int var1 = 1;
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, nf[] param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var23 = 0;
        Object var24 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var23 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (param6 <= 0) {
                    break L1;
                  } else {
                    if (param4 != 0) {
                      L2: {
                        if (null == param3[3]) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        } else {
                          stackOut_10_0 = param3[3].field_t;
                          stackIn_12_0 = stackOut_10_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_12_0;
                        if (param3[5] != null) {
                          stackOut_14_0 = param3[5].field_t;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = 0;
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_15_0;
                        if (null == param3[1]) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = param3[1].field_x;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_18_0;
                        if (null != param3[7]) {
                          stackOut_20_0 = param3[7].field_x;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_21_0;
                        var11 = param0 + param1;
                        var12 = param6 + param2;
                        var13 = var7_int + param1;
                        var14 = -var8 + var11;
                        var15 = param2 + var9;
                        if (param5 == -7992) {
                          break L6;
                        } else {
                          var24 = null;
                          dn.a(100, 4, -112, (nf[]) null, 66, 93, 126);
                          break L6;
                        }
                      }
                      L7: {
                        var16 = var12 - var10;
                        var17 = var13;
                        var18 = var14;
                        if (~var18 <= ~var17) {
                          break L7;
                        } else {
                          var18 = var7_int * param0 / (var7_int - -var8) + param1;
                          var17 = var7_int * param0 / (var7_int - -var8) + param1;
                          break L7;
                        }
                      }
                      L8: {
                        var19 = var15;
                        var20 = var16;
                        if (~var19 < ~var20) {
                          var20 = var9 * param6 / (var9 + var10) + param2;
                          var19 = var9 * param6 / (var9 + var10) + param2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        fn.b(fj.field_E);
                        if (null != param3[0]) {
                          fn.f(param1, param2, var17, var19);
                          param3[0].a(param1, param2, param4);
                          fn.a(fj.field_E);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param3[2] == null) {
                          break L10;
                        } else {
                          fn.f(var18, param2, var11, var19);
                          param3[2].a(var14, param2, param4);
                          fn.a(fj.field_E);
                          break L10;
                        }
                      }
                      L11: {
                        if (param3[6] != null) {
                          fn.f(param1, var20, var17, var12);
                          param3[6].a(param1, var16, param4);
                          fn.a(fj.field_E);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param3[8] != null) {
                          fn.f(var18, var20, var11, var12);
                          param3[8].a(var14, var16, param4);
                          fn.a(fj.field_E);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (null == param3[1]) {
                          break L13;
                        } else {
                          if (param3[1].field_t != 0) {
                            fn.f(var17, param2, var18, var19);
                            var21 = var13;
                            L14: while (true) {
                              if (~var14 >= ~var21) {
                                fn.a(fj.field_E);
                                break L13;
                              } else {
                                param3[1].a(var21, param2, param4);
                                var21 = var21 + param3[1].field_t;
                                continue L14;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        if (param3[7] == null) {
                          break L15;
                        } else {
                          if (0 != param3[7].field_t) {
                            fn.f(var17, var20, var18, var12);
                            var21 = var13;
                            L16: while (true) {
                              if (~var14 >= ~var21) {
                                fn.a(fj.field_E);
                                break L15;
                              } else {
                                param3[7].a(var21, var16, param4);
                                var21 = var21 + param3[7].field_t;
                                continue L16;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        if (param3[3] == null) {
                          break L17;
                        } else {
                          if (param3[3].field_x != 0) {
                            fn.f(param1, var19, var17, var20);
                            var21 = var15;
                            L18: while (true) {
                              if (~var16 >= ~var21) {
                                fn.a(fj.field_E);
                                break L17;
                              } else {
                                param3[3].a(param1, var21, param4);
                                var21 = var21 + param3[3].field_x;
                                continue L18;
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                      }
                      L19: {
                        if (param3[5] == null) {
                          break L19;
                        } else {
                          if (param3[5].field_x == 0) {
                            break L19;
                          } else {
                            fn.f(var18, var19, var11, var20);
                            var21 = var15;
                            L20: while (true) {
                              if (var21 >= var16) {
                                fn.a(fj.field_E);
                                break L19;
                              } else {
                                param3[5].a(var14, var21, param4);
                                var21 = var21 + param3[5].field_x;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (param3[4] == null) {
                          break L21;
                        } else {
                          if (0 == param3[4].field_t) {
                            break L21;
                          } else {
                            if (param3[4].field_x == 0) {
                              break L21;
                            } else {
                              fn.f(var17, var19, var18, var20);
                              var21 = var15;
                              L22: while (true) {
                                if (var16 <= var21) {
                                  fn.a(fj.field_E);
                                  break L21;
                                } else {
                                  var22 = var13;
                                  L23: while (true) {
                                    if (var22 >= var14) {
                                      var21 = var21 + param3[4].field_x;
                                      continue L22;
                                    } else {
                                      param3[4].a(var22, var21, param4);
                                      var22 = var22 + param3[4].field_t;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var7 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var7;
            stackOut_77_1 = new StringBuilder().append("dn.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L24;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L24;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"All scores", "My scores", "Best each"};
        field_a = "You already have five wing pods";
    }
}
