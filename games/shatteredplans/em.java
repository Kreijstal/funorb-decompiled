/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em implements jk {
    qk[] field_i;
    static String field_b;
    static int field_j;
    static int[] field_c;
    static String field_a;
    static int field_k;
    static int field_h;
    static String field_g;
    lh field_e;
    jh[] field_d;
    lp[] field_f;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 113) {
                break L1;
              } else {
                field_j = 43;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if (-2 <= (param2 ^ -1)) {
                if (param2 != 1) {
                  stackIn_13_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = var3_int * param0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((param2 & 1 ^ -1) != -1) {
                    var3_int = var3_int * param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param2 = param2 >> 1;
                param0 = param0 * param0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "em.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 3) {
            em.a(-116);
        }
    }

    final static void a(va param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              fj.field_t = param0;
              if (2 == fj.field_t.field_c) {
                break L1;
              } else {
                if (1 != fj.field_t.field_c) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 1) {
                break L2;
              } else {
                field_g = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("em.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, bi[] param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param4 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param1) {
                  break L1;
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] == null) {
                        stackIn_11_0 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = param4[3].field_o;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param4[5]) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = param4[5].field_o;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param4[1] != null) {
                        stackIn_17_0 = param4[1].field_p;
                        break L4;
                      } else {
                        stackIn_17_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (param4[param2] != null) {
                        stackIn_20_0 = param4[7].field_p;
                        break L5;
                      } else {
                        stackIn_20_0 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param5 + param1;
                      var11 = param0 + param3;
                      var12 = param5 + var6_int;
                      var13 = -var7 + var10;
                      var14 = param3 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param5 + param1 * var6_int / (var7 + var6_int);
                        var16 = param5 + param1 * var6_int / (var7 + var6_int);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var18 > var19) {
                        var19 = param3 + var8 * param0 / (var8 - -var9);
                        var18 = param3 + var8 * param0 / (var8 - -var9);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      gf.a(ph.field_b);
                      if (null != param4[0]) {
                        gf.i(param5, param3, var16, var18);
                        param4[0].f(param5, param3);
                        gf.b(ph.field_b);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param4[2] == null) {
                        break L9;
                      } else {
                        gf.i(var17, param3, var10, var18);
                        param4[2].f(var13, param3);
                        gf.b(ph.field_b);
                        break L9;
                      }
                    }
                    L10: {
                      if (param4[6] != null) {
                        gf.i(param5, var19, var16, var11);
                        param4[6].f(param5, var15);
                        gf.b(ph.field_b);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param4[8]) {
                        break L11;
                      } else {
                        gf.i(var17, var19, var10, var11);
                        param4[8].f(var13, var15);
                        gf.b(ph.field_b);
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
                          gf.i(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var13 <= var20) {
                              gf.b(ph.field_b);
                              break L12;
                            } else {
                              param4[1].f(var20, param3);
                              var20 = var20 + param4[1].field_o;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param4[7] == null) {
                        break L14;
                      } else {
                        if (-1 == (param4[7].field_o ^ -1)) {
                          break L14;
                        } else {
                          gf.i(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              gf.b(ph.field_b);
                              break L14;
                            } else {
                              param4[7].f(var20, var15);
                              var20 = var20 + param4[7].field_o;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param4[3]) {
                        break L16;
                      } else {
                        if (param4[3].field_p == 0) {
                          break L16;
                        } else {
                          gf.i(param5, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              gf.b(ph.field_b);
                              break L16;
                            } else {
                              param4[3].f(param5, var20);
                              var20 = var20 + param4[3].field_p;
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
                        if (param4[5].field_p == 0) {
                          break L18;
                        } else {
                          gf.i(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              gf.b(ph.field_b);
                              break L18;
                            } else {
                              param4[5].f(var13, var20);
                              var20 = var20 + param4[5].field_p;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      L21: {
                        if (null == param4[4]) {
                          break L21;
                        } else {
                          if (-1 == (param4[4].field_o ^ -1)) {
                            break L21;
                          } else {
                            if (0 != param4[4].field_p) {
                              gf.i(var16, var18, var17, var19);
                              var20 = var14;
                              L22: while (true) {
                                if (var15 <= var20) {
                                  gf.b(ph.field_b);
                                  break L21;
                                } else {
                                  var21 = var12;
                                  L23: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param4[4].field_p;
                                      continue L22;
                                    } else {
                                      param4[4].f(var21, var20);
                                      var21 = var21 + param4[4].field_o;
                                      continue L23;
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
                      break L20;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var6);

            stackIn_74_1 = new StringBuilder().append("em.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L24;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L24;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param5 + ')');
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

    static {
        field_c = new int[4];
        field_b = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = 0;
        field_g = "Quit to website";
    }
}
