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
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_g = null;
              field_b = null;
              if (param0 < -101) {
                break L1;
              } else {
                ea.a(-81, -90, false, -51, 67, -68);
                break L1;
              }
            }
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ea.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        cn var15 = null;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        try {
          L0: {
            if (param0 != -1) {
              L1: {
                var6_int = param0 / 50;
                var7 = var6_int / 60;
                var8 = var6_int % 60;
                var9 = 256;
                if (!param2) {
                  break L1;
                } else {
                  if (var8 > 10) {
                    break L1;
                  } else {
                    if (var7 != 0) {
                      break L1;
                    } else {
                      var9 = var9 + (5 * (param0 % 50) + -250 + 160);
                      if (var9 < 256) {
                        var9 = 256;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                var10 = Integer.toString(var8);
                if (2 > var10.length()) {
                  var10 = bn.a('0', (byte) -83) + var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                stackOut_17_0 = -25 + param3;
                stackIn_20_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var7 < 10) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 3;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L3;
                } else {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  break L3;
                }
              }
              L4: {
                var11 = stackIn_21_0 - stackIn_21_1;
                var12 = -4 + (param1 - -20);
                var13 = 50;
                var14 = 20;
                if (var9 != 256) {
                  L5: {
                    var12 = 16;
                    var14 = 20 * var9 >> -1475416888;
                    if (var7 >= 10) {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_25_0 = 3;
                      stackIn_28_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  var11 = -stackIn_28_0 + 25;
                  var13 = var9 * 50 >> -1744431544;
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                on.a(-var13 + param3, param1, var13, var14, 2, 0, param4);
                if (256 == var9) {
                  break L6;
                } else {
                  iw.a(-122, ph.field_b);
                  on.b();
                  break L6;
                }
              }
              L7: {
                var15 = un.field_d;
                if (nj.a(107) % 1000L >= 500L) {
                  break L7;
                } else {
                  ((hu) (Object) var15).d(":", var11, var12, 16777215, -1);
                  break L7;
                }
              }
              L8: {
                ((hu) (Object) var15).c(Integer.toString(var7), var11 + -3, var12, 16777215, -1);
                ((hu) (Object) var15).a(var10, var11 + 3, var12, 16777215, -1);
                if (param5 < -39) {
                  break L8;
                } else {
                  field_f = null;
                  break L8;
                }
              }
              L9: {
                if (var9 != 256) {
                  ta.e(124);
                  ph.field_b.e(param3 - var13, param1, var13, var14, 256);
                  break L9;
                } else {
                  break L9;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var6, "ea.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
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
                        stackOut_14_0 = param4[3].field_o;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_15_0 = stackOut_12_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_15_0;
                      if (null == param4[5]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_16_0 = param4[5].field_o;
                        stackIn_19_0 = stackOut_16_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_19_0;
                      if (null != param4[1]) {
                        stackOut_22_0 = param4[1].field_v;
                        stackIn_23_0 = stackOut_22_0;
                        break L4;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_23_0 = stackOut_20_0;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_23_0;
                      if (param4[7] == null) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L5;
                      } else {
                        stackOut_24_0 = param4[7].field_v;
                        stackIn_27_0 = stackOut_24_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_27_0;
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
                      if (~var20 > ~var19) {
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
                            L14: {
                              if (~var14 >= ~var21) {
                                break L14;
                              } else {
                                param4[1].c(var21, param0);
                                var21 = var21 + param4[1].field_o;
                                if (var23 != 0) {
                                  break L12;
                                } else {
                                  if (var23 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            on.b(ll.field_j);
                            break L12;
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param4[7]) {
                        break L15;
                      } else {
                        if (param4[7].field_o == 0) {
                          break L15;
                        } else {
                          on.h(var17, var20, var18, var12);
                          var21 = var13;
                          L16: while (true) {
                            L17: {
                              if (var14 <= var21) {
                                break L17;
                              } else {
                                param4[7].c(var21, var16);
                                var21 = var21 + param4[7].field_o;
                                if (var23 != 0) {
                                  break L15;
                                } else {
                                  if (var23 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            on.b(ll.field_j);
                            break L15;
                          }
                        }
                      }
                    }
                    L18: {
                      if (param4[3] == null) {
                        break L18;
                      } else {
                        if (0 == param4[3].field_v) {
                          break L18;
                        } else {
                          on.h(param2, var19, var17, var20);
                          var21 = var15;
                          L19: while (true) {
                            L20: {
                              if (var16 <= var21) {
                                break L20;
                              } else {
                                param4[3].c(param2, var21);
                                var21 = var21 + param4[3].field_v;
                                if (var23 != 0) {
                                  break L18;
                                } else {
                                  if (var23 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            on.b(ll.field_j);
                            break L18;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param4[5] == null) {
                        break L21;
                      } else {
                        if (param4[5].field_v != 0) {
                          on.h(var18, var19, var11, var20);
                          var21 = var15;
                          L22: while (true) {
                            L23: {
                              if (var21 >= var16) {
                                break L23;
                              } else {
                                param4[5].c(var14, var21);
                                var21 = var21 + param4[5].field_v;
                                if (var23 != 0) {
                                  break L21;
                                } else {
                                  if (var23 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            on.b(ll.field_j);
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                    }
                    L24: {
                      if (null == param4[4]) {
                        break L24;
                      } else {
                        if (param4[4].field_o == 0) {
                          break L24;
                        } else {
                          if (param4[4].field_v != 0) {
                            on.h(var17, var19, var18, var20);
                            var21 = var15;
                            L25: while (true) {
                              L26: {
                                if (var21 >= var16) {
                                  break L26;
                                } else {
                                  if (var23 != 0) {
                                    break L24;
                                  } else {
                                    var22 = var13;
                                    L27: while (true) {
                                      L28: {
                                        L29: {
                                          if (var14 <= var22) {
                                            break L29;
                                          } else {
                                            param4[4].c(var22, var21);
                                            var22 = var22 + param4[4].field_o;
                                            if (var23 != 0) {
                                              break L28;
                                            } else {
                                              if (var23 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                        var21 = var21 + param4[4].field_v;
                                        break L28;
                                      }
                                      if (var23 == 0) {
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                              on.b(ll.field_j);
                              break L24;
                            }
                          } else {
                            break L24;
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
          L30: {
            var6 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var6;
            stackOut_115_1 = new StringBuilder().append("ea.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param4 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L30;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L30;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_119_0, stackIn_119_2 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 12) {
              L1: {
                if (null == su.field_c) {
                  su.field_c = (jb) (Object) new i(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ea.C(" + param0 + ',' + param1 + ')');
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
