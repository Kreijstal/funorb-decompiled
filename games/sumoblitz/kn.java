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
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (-1 <= (param4 ^ -1)) {
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
                      if (param2 == -34) {
                        break L7;
                      } else {
                        field_b = 71;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = var15;
                      lk.b(cd.field_f);
                      if (var19 < var18) {
                        var19 = param3 + param4 * var8 / (var8 + var9);
                        var18 = param3 + param4 * var8 / (var8 + var9);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param1[0] != null) {
                        lk.e(param0, param3, var16, var18);
                        param1[0].a(param0, param3);
                        lk.a(cd.field_f);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param1[2]) {
                        lk.e(var17, param3, var10, var18);
                        param1[2].a(var13, param3);
                        lk.a(cd.field_f);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[6] == null) {
                        break L11;
                      } else {
                        lk.e(param0, var19, var16, var11);
                        param1[6].a(param0, var15);
                        lk.a(cd.field_f);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[8]) {
                        break L12;
                      } else {
                        lk.e(var17, var19, var10, var11);
                        param1[8].a(var13, var15);
                        lk.a(cd.field_f);
                        break L12;
                      }
                    }
                    L13: {
                      if (param1[1] == null) {
                        break L13;
                      } else {
                        if (0 != param1[1].field_z) {
                          lk.e(var16, param3, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var13 <= var20) {
                              lk.a(cd.field_f);
                              break L13;
                            } else {
                              param1[1].a(var20, param3);
                              var20 = var20 + param1[1].field_z;
                              if (var22 != 0) {
                                break L13;
                              } else {
                                continue L14;
                              }
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param1[7] == null) {
                        break L15;
                      } else {
                        if (param1[7].field_z == 0) {
                          break L15;
                        } else {
                          lk.e(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var20 >= var13) {
                              lk.a(cd.field_f);
                              break L15;
                            } else {
                              param1[7].a(var20, var15);
                              var20 = var20 + param1[7].field_z;
                              if (var22 != 0) {
                                break L15;
                              } else {
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (null == param1[3]) {
                        break L17;
                      } else {
                        if (param1[3].field_w != 0) {
                          lk.e(param0, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var15 <= var20) {
                              lk.a(cd.field_f);
                              break L17;
                            } else {
                              param1[3].a(param0, var20);
                              var20 = var20 + param1[3].field_w;
                              if (var22 != 0) {
                                break L17;
                              } else {
                                continue L18;
                              }
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param1[5] == null) {
                        break L19;
                      } else {
                        if (param1[5].field_w != 0) {
                          lk.e(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              lk.a(cd.field_f);
                              break L19;
                            } else {
                              param1[5].a(var13, var20);
                              var20 = var20 + param1[5].field_w;
                              if (var22 != 0) {
                                break L19;
                              } else {
                                continue L20;
                              }
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (param1[4] == null) {
                        break L21;
                      } else {
                        if (param1[4].field_z == 0) {
                          break L21;
                        } else {
                          if (0 != param1[4].field_w) {
                            lk.e(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                lk.a(cd.field_f);
                                break L21;
                              } else {
                                if (var22 != 0) {
                                  break L21;
                                } else {
                                  var21 = var12;
                                  L23: while (true) {
                                    L24: {
                                      if (var13 <= var21) {
                                        var20 = var20 + param1[4].field_w;
                                        break L24;
                                      } else {
                                        param1[4].a(var21, var20);
                                        var21 = var21 + param1[4].field_z;
                                        if (var22 != 0) {
                                          break L24;
                                        } else {
                                          continue L23;
                                        }
                                      }
                                    }
                                    continue L22;
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
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var6 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) (var6);
            stackOut_87_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param1 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L25;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L25;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (var2 != 0) {
          if (param1 > -29) {
            return '^';
          } else {
            L0: {
              if (-129 < (var2 ^ -1)) {
                break L0;
              } else {
                if (-161 >= (var2 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var3 = uk.field_lb[var2 - 128];
                    if (0 == var3) {
                      var3 = 63;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var2 = var3;
                  break L0;
                }
              }
            }
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -1) {
            return;
        }
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
        if (param0 != 56) {
            kn.b(-32);
        }
    }

    final static void a(boolean param0, byte param1) {
        if (!oj.a(false)) {
          return;
        } else {
          L0: {
            if (param1 == -122) {
              break L0;
            } else {
              field_b = 120;
              break L0;
            }
          }
          L1: {
            if (param0) {
              lk.b(0, 0, lk.field_b, lk.field_c, 0, 192);
              break L1;
            } else {
              break L1;
            }
          }
          pu.field_e.a(0, 0, false);
          return;
        }
    }

    static {
        field_d = "Type your email address again to make sure it's correct";
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_e = "Unpacking graphics";
    }
}
