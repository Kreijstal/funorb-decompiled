/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends eu {
    static int[] field_c;
    static String field_d;
    static String field_e;
    static ne[] field_f;
    static int field_b;

    final static void a(int param0, wb[] param1, byte param2, int param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (param4 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param1[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param1[3].field_z;
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
                        stackOut_11_0 = param1[5].field_z;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null == param1[1]) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param1[1].field_w;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param1[7] != null) {
                        stackOut_18_0 = param1[7].field_w;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param0 + param5;
                      var11 = param3 + param4;
                      var12 = param0 - -var6_int;
                      var13 = var10 - var7;
                      var14 = param3 + var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = param0 - -(param5 * var6_int / (var7 + var6_int));
                        var16 = param0 - -(param5 * var6_int / (var7 + var6_int));
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      lk.b(cd.field_f);
                      if (var19 < var18) {
                        var19 = param3 + param4 * var8 / (var8 + var9);
                        var18 = param3 + param4 * var8 / (var8 + var9);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param1[0] != null) {
                        lk.e(param0, param3, var16, var18);
                        param1[0].a(param0, param3);
                        lk.a(cd.field_f);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param1[2]) {
                        lk.e(var17, param3, var10, var18);
                        param1[2].a(var13, param3);
                        lk.a(cd.field_f);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] == null) {
                        break L10;
                      } else {
                        lk.e(param0, var19, var16, var11);
                        param1[6].a(param0, var15);
                        lk.a(cd.field_f);
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param1[8]) {
                        break L11;
                      } else {
                        lk.e(var17, var19, var10, var11);
                        param1[8].a(var13, var15);
                        lk.a(cd.field_f);
                        break L11;
                      }
                    }
                    L12: {
                      if (param1[1] == null) {
                        break L12;
                      } else {
                        if (0 != param1[1].field_z) {
                          lk.e(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var13 <= var20) {
                              lk.a(cd.field_f);
                              break L12;
                            } else {
                              param1[1].a(var20, param3);
                              var20 = var20 + param1[1].field_z;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param1[7] == null) {
                        break L14;
                      } else {
                        if (param1[7].field_z == 0) {
                          break L14;
                        } else {
                          lk.e(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              lk.a(cd.field_f);
                              break L14;
                            } else {
                              param1[7].a(var20, var15);
                              var20 = var20 + param1[7].field_z;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param1[3]) {
                        break L16;
                      } else {
                        if (param1[3].field_w != 0) {
                          lk.e(param0, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              lk.a(cd.field_f);
                              break L16;
                            } else {
                              param1[3].a(param0, var20);
                              var20 = var20 + param1[3].field_w;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param1[5] == null) {
                        break L18;
                      } else {
                        if (param1[5].field_w != 0) {
                          lk.e(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              lk.a(cd.field_f);
                              break L18;
                            } else {
                              param1[5].a(var13, var20);
                              var20 = var20 + param1[5].field_w;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param1[4] == null) {
                        break L20;
                      } else {
                        if (param1[4].field_z == 0) {
                          break L20;
                        } else {
                          if (0 != param1[4].field_w) {
                            lk.e(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                lk.a(cd.field_f);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param1[4].field_w;
                                    continue L21;
                                  } else {
                                    param1[4].a(var21, var20);
                                    var21 = var21 + param1[4].field_z;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
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
          L23: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + -34 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (var2 < 160) {
                var3 = uk.field_lb[var2 - 128];
                if (!(0 != var3)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    public static void b() {
        field_f = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    kn() {
        this.a(56);
    }

    final static void a(boolean param0, int param1) {
        jv.a(true, (byte) -71, param0);
        int var2 = 48 % ((-25 - param1) / 41);
    }

    private final void a(int param0) {
    }

    final static void a(boolean param0, byte param1) {
        if (!oj.a(false)) {
            return;
        }
        pu.field_e.a(0, 0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your email address again to make sure it's correct";
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_e = "Unpacking graphics";
    }
}
