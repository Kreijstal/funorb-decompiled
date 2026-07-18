/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    int field_l;
    static String field_g;
    int field_d;
    int field_i;
    int field_k;
    int field_e;
    static int field_a;
    static og field_f;
    int field_c;
    int field_h;
    static int[] field_j;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_b = null;
        if (param0 >= -101) {
            ea.a(-81, -90, false, -51, 67, -68);
        }
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        cn var15 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 != -1) {
          L0: {
            var6 = param0 / 50;
            var7 = var6 / 60;
            var8 = var6 % 60;
            var9 = 256;
            if (!param2) {
              break L0;
            } else {
              if (var8 > 10) {
                break L0;
              } else {
                if (var7 != 0) {
                  break L0;
                } else {
                  var9 = var9 + (5 * (param0 % 50) - 90);
                  if (var9 < 256) {
                    var9 = 256;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            var10 = Integer.toString(var8);
            if (2 > var10.length()) {
              var10 = bn.a('0', (byte) -83) + var10;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = -25 + param3;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var7 < 10) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 3;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L2;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 0;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L2;
            }
          }
          L3: {
            var11 = stackIn_14_0 - stackIn_14_1;
            var12 = -4 + (param1 - -20);
            var13 = 50;
            var14 = 20;
            if (var9 != 256) {
              L4: {
                var12 = 16;
                var14 = 20 * var9 >> 8;
                if (var7 >= 10) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_17_0 = 3;
                  stackIn_19_0 = stackOut_17_0;
                  break L4;
                }
              }
              var11 = -stackIn_19_0 + 25;
              var13 = var9 * 50 >> 8;
              break L3;
            } else {
              break L3;
            }
          }
          L5: {
            on.a(-var13 + param3, param1, var13, var14, 2, 0, param4);
            if (256 == var9) {
              break L5;
            } else {
              iw.a(-122, ph.field_b);
              on.b();
              break L5;
            }
          }
          L6: {
            var15 = un.field_d;
            if (nj.a(107) % 1000L >= 500L) {
              break L6;
            } else {
              ((hu) (Object) var15).d(":", var11, var12, 16777215, -1);
              break L6;
            }
          }
          L7: {
            ((hu) (Object) var15).c(Integer.toString(var7), var11 + -3, var12, 16777215, -1);
            ((hu) (Object) var15).a(var10, var11 + 3, var12, 16777215, -1);
            if (param5 < -39) {
              break L7;
            } else {
              field_f = null;
              break L7;
            }
          }
          L8: {
            if (var9 != 256) {
              ta.e(124);
              ph.field_b.e(param3 - var13, param1, var13, var14, 256);
              break L8;
            } else {
              break L8;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, ut[] param4, int param5) {
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
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var23 = Kickabout.field_G;
        try {
          L0: {
            if (param4 == null) {
              return;
            } else {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (param1 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      var7 = 94 % ((-41 - param3) / 61);
                      if (param4[3] != null) {
                        stackOut_10_0 = param4[3].field_o;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param4[5]) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param4[5].field_o;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_14_0;
                      if (null != param4[1]) {
                        stackOut_16_0 = param4[1].field_v;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_17_0;
                      if (param4[7] == null) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = param4[7].field_v;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_20_0;
                      var11 = param2 - -param5;
                      var12 = param1 + param0;
                      var13 = param2 - -var6_int;
                      var14 = var11 + -var8;
                      var15 = var9 + param0;
                      var16 = -var10 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var18 >= var17) {
                        break L6;
                      } else {
                        var18 = var6_int * param5 / (var6_int + var8) + param2;
                        var17 = var6_int * param5 / (var6_int + var8) + param2;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      on.a(ll.field_j);
                      if (var20 < var19) {
                        var20 = param0 + param1 * var9 / (var10 + var9);
                        var19 = param0 + param1 * var9 / (var10 + var9);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param4[0]) {
                        on.h(param2, param0, var17, var19);
                        param4[0].c(param2, param0);
                        on.b(ll.field_j);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param4[2] == null) {
                        break L9;
                      } else {
                        on.h(var18, param0, var11, var19);
                        param4[2].c(var14, param0);
                        on.b(ll.field_j);
                        break L9;
                      }
                    }
                    L10: {
                      if (param4[6] == null) {
                        break L10;
                      } else {
                        on.h(param2, var20, var17, var12);
                        param4[6].c(param2, var16);
                        on.b(ll.field_j);
                        break L10;
                      }
                    }
                    L11: {
                      if (param4[8] != null) {
                        on.h(var18, var20, var11, var12);
                        param4[8].c(var14, var16);
                        on.b(ll.field_j);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param4[1]) {
                        break L12;
                      } else {
                        if (param4[1].field_o == 0) {
                          break L12;
                        } else {
                          on.h(var17, param0, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var14 <= var21) {
                              on.b(ll.field_j);
                              break L12;
                            } else {
                              param4[1].c(var21, param0);
                              var21 = var21 + param4[1].field_o;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param4[7]) {
                        break L14;
                      } else {
                        if (param4[7].field_o == 0) {
                          break L14;
                        } else {
                          on.h(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var14 <= var21) {
                              on.b(ll.field_j);
                              break L14;
                            } else {
                              param4[7].c(var21, var16);
                              var21 = var21 + param4[7].field_o;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (param4[3] == null) {
                        break L16;
                      } else {
                        if (0 == param4[3].field_v) {
                          break L16;
                        } else {
                          on.h(param2, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var16 <= var21) {
                              on.b(ll.field_j);
                              break L16;
                            } else {
                              param4[3].c(param2, var21);
                              var21 = var21 + param4[3].field_v;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param4[5] == null) {
                        break L18;
                      } else {
                        if (param4[5].field_v != 0) {
                          on.h(var18, var19, var11, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var21 >= var16) {
                              on.b(ll.field_j);
                              break L18;
                            } else {
                              param4[5].c(var14, var21);
                              var21 = var21 + param4[5].field_v;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param4[4]) {
                        break L20;
                      } else {
                        if (param4[4].field_o == 0) {
                          break L20;
                        } else {
                          if (param4[4].field_v != 0) {
                            on.h(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var21 >= var16) {
                                on.b(ll.field_j);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param4[4].field_v;
                                    continue L21;
                                  } else {
                                    param4[4].c(var22, var21);
                                    var22 = var22 + param4[4].field_o;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("ea.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param5 + ')');
        }
    }

    final static void a() {
        if (!(null != su.field_c)) {
            su.field_c = (jb) (Object) new i(39);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Searching for an opponent";
        field_b = "Sound";
        field_j = new int[5];
        field_j[1] = 163840;
        field_j[2] = 163840;
        field_j[0] = 147456;
        field_j[3] = 180224;
        field_j[4] = 163840;
    }
}
