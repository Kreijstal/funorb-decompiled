/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends sf {
    static el field_bb;
    String field_db;
    static int field_eb;
    int field_ab;
    String field_Z;
    static volatile boolean field_cb;

    final static void a(int param0, int param1, int param2, hj[] param3, int param4, int param5) {
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var22 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null != param3[3]) {
                        stackOut_10_0 = param3[3].field_s;
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
                      if (null != param3[5]) {
                        stackOut_13_0 = param3[5].field_s;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param3[1] != null) {
                        stackOut_16_0 = param3[1].field_t;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null != param3[7]) {
                        stackOut_19_0 = param3[7].field_t;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param4 + param2;
                      var11 = param5 + param0;
                      var12 = param4 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = var8 + param5;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = var6_int * param2 / (var7 + var6_int) + param4;
                        var16 = var6_int * param2 / (var7 + var6_int) + param4;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var18 = var14;
                    var19 = var15;
                    if (param1 == 6) {
                      L7: {
                        ul.a(sf.field_K);
                        if (var18 <= var19) {
                          break L7;
                        } else {
                          var19 = param0 * var8 / (var9 + var8) + param5;
                          var18 = param0 * var8 / (var9 + var8) + param5;
                          break L7;
                        }
                      }
                      L8: {
                        if (null == param3[0]) {
                          break L8;
                        } else {
                          ul.i(param4, param5, var16, var18);
                          param3[0].c(param4, param5);
                          ul.b(sf.field_K);
                          break L8;
                        }
                      }
                      L9: {
                        if (null == param3[2]) {
                          break L9;
                        } else {
                          ul.i(var17, param5, var10, var18);
                          param3[2].c(var13, param5);
                          ul.b(sf.field_K);
                          break L9;
                        }
                      }
                      L10: {
                        if (param3[6] == null) {
                          break L10;
                        } else {
                          ul.i(param4, var19, var16, var11);
                          param3[6].c(param4, var15);
                          ul.b(sf.field_K);
                          break L10;
                        }
                      }
                      L11: {
                        if (param3[8] == null) {
                          break L11;
                        } else {
                          ul.i(var17, var19, var10, var11);
                          param3[8].c(var13, var15);
                          ul.b(sf.field_K);
                          break L11;
                        }
                      }
                      L12: {
                        if (param3[1] == null) {
                          break L12;
                        } else {
                          if (0 != param3[1].field_s) {
                            ul.i(var16, param5, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var13 <= var20) {
                                ul.b(sf.field_K);
                                break L12;
                              } else {
                                param3[1].c(var20, param5);
                                var20 = var20 + param3[1].field_s;
                                if (var22 != 0) {
                                  break L12;
                                } else {
                                  continue L13;
                                }
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (param3[7] == null) {
                          break L14;
                        } else {
                          if (param3[7].field_s == 0) {
                            break L14;
                          } else {
                            ul.i(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                ul.b(sf.field_K);
                                break L14;
                              } else {
                                param3[7].c(var20, var15);
                                var20 = var20 + param3[7].field_s;
                                if (var22 != 0) {
                                  break L14;
                                } else {
                                  continue L15;
                                }
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param3[3]) {
                          break L16;
                        } else {
                          if (0 == param3[3].field_t) {
                            break L16;
                          } else {
                            ul.i(param4, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                ul.b(sf.field_K);
                                break L16;
                              } else {
                                param3[3].c(param4, var20);
                                var20 = var20 + param3[3].field_t;
                                if (var22 != 0) {
                                  break L16;
                                } else {
                                  continue L17;
                                }
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (null == param3[5]) {
                          break L18;
                        } else {
                          if (param3[5].field_t != 0) {
                            ul.i(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var15 <= var20) {
                                ul.b(sf.field_K);
                                break L18;
                              } else {
                                param3[5].c(var13, var20);
                                var20 = var20 + param3[5].field_t;
                                if (var22 != 0) {
                                  break L18;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (param3[4] == null) {
                          break L20;
                        } else {
                          if (0 == param3[4].field_s) {
                            break L20;
                          } else {
                            if (param3[4].field_t == 0) {
                              break L20;
                            } else {
                              ul.i(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var15 <= var20) {
                                  ul.b(sf.field_K);
                                  break L20;
                                } else {
                                  if (var22 != 0) {
                                    break L20;
                                  } else {
                                    var21 = var12;
                                    L22: while (true) {
                                      L23: {
                                        if (var13 <= var21) {
                                          var20 = var20 + param3[4].field_t;
                                          break L23;
                                        } else {
                                          param3[4].c(var21, var20);
                                          var21 = var21 + param3[4].field_s;
                                          if (var22 != 0) {
                                            break L23;
                                          } else {
                                            continue L22;
                                          }
                                        }
                                      }
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
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
            stackOut_84_0 = (RuntimeException) (var6);
            stackOut_84_1 = new StringBuilder().append("ti.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param3 == null) {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L24;
            } else {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L24;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 < 49) {
            hj[] var2 = (hj[]) null;
            ti.a(-39, -56, -76, (hj[]) null, -29, -35);
        }
        field_bb = null;
    }

    ti() {
        super(0L, (sf) null);
    }

    static {
        field_cb = true;
    }
}
