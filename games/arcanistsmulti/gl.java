/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    static String field_d;
    static aj field_b;
    static String field_a;
    static kc field_c;
    static String field_f;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, byte param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param2--;
              if (0 > param2) {
                L2: {
                  if (param9 >= 116) {
                    break L2;
                  } else {
                    var17 = null;
                    gl.a(-42, -39, 14, -51, (int[]) null, 44, -111, -12, -52, (byte) 102);
                    break L2;
                  }
                }
                break L0;
              } else {
                var18 = param4;
                var10_array = var18;
                var11 = param1;
                var12 = param6;
                var13 = param5;
                var14 = param0;
                var15 = (16711422 & var18[var11]) >> 1;
                var10_array[var11] = dg.a(255, var14 >> 17) - (-(dg.a(var13, 33423780) >> 9) + -dg.a(16711680, var12 >> 1)) + var15;
                param6 = param6 + param7;
                param1++;
                param0 = param0 + param8;
                param5 = param5 + param3;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("gl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 15) {
            gl.a((byte) -4);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, qb[] param4, int param5) {
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
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 == null) {
              return;
            } else {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param0 > 0) {
                    L2: {
                      if (null == param4[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param4[3].field_n;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param2 == -27327) {
                        break L3;
                      } else {
                        gl.a(true, -7);
                        break L3;
                      }
                    }
                    L4: {
                      if (null != param4[5]) {
                        stackOut_14_0 = param4[5].field_n;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_15_0;
                      if (null != param4[1]) {
                        stackOut_17_0 = param4[1].field_w;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_18_0;
                      if (null != param4[7]) {
                        stackOut_20_0 = param4[7].field_w;
                        stackIn_21_0 = stackOut_20_0;
                        break L6;
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_21_0 = stackOut_19_0;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_21_0;
                      var10 = param1 + param3;
                      var11 = param0 + param5;
                      var12 = param1 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = var8 + param5;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L7;
                      } else {
                        var17 = param1 - -(param3 * var6_int / (var7 + var6_int));
                        var16 = param1 - -(param3 * var6_int / (var7 + var6_int));
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      de.a(ee.field_d);
                      if (var19 < var18) {
                        var19 = param5 - -(var8 * param0 / (var9 + var8));
                        var18 = param5 - -(var8 * param0 / (var9 + var8));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param4[0]) {
                        de.a(param1, param5, var16, var18);
                        param4[0].c(param1, param5);
                        de.b(ee.field_d);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (null == param4[2]) {
                        break L10;
                      } else {
                        de.a(var17, param5, var10, var18);
                        param4[2].c(var13, param5);
                        de.b(ee.field_d);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param4[6]) {
                        de.a(param1, var19, var16, var11);
                        param4[6].c(param1, var15);
                        de.b(ee.field_d);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param4[8] == null) {
                        break L12;
                      } else {
                        de.a(var17, var19, var10, var11);
                        param4[8].c(var13, var15);
                        de.b(ee.field_d);
                        break L12;
                      }
                    }
                    L13: {
                      if (param4[1] == null) {
                        break L13;
                      } else {
                        if (param4[1].field_n == 0) {
                          break L13;
                        } else {
                          de.a(var16, param5, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              de.b(ee.field_d);
                              break L13;
                            } else {
                              param4[1].c(var20, param5);
                              var20 = var20 + param4[1].field_n;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param4[7]) {
                        break L15;
                      } else {
                        if (param4[7].field_n == 0) {
                          break L15;
                        } else {
                          de.a(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              de.b(ee.field_d);
                              break L15;
                            } else {
                              param4[7].c(var20, var15);
                              var20 = var20 + param4[7].field_n;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (null == param4[3]) {
                        break L17;
                      } else {
                        if (param4[3].field_w != 0) {
                          de.a(param1, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var20 >= var15) {
                              de.b(ee.field_d);
                              break L17;
                            } else {
                              param4[3].c(param1, var20);
                              var20 = var20 + param4[3].field_w;
                              continue L18;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param4[5] == null) {
                        break L19;
                      } else {
                        if (param4[5].field_w == 0) {
                          break L19;
                        } else {
                          de.a(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var20 >= var15) {
                              de.b(ee.field_d);
                              break L19;
                            } else {
                              param4[5].c(var13, var20);
                              var20 = var20 + param4[5].field_w;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (null == param4[4]) {
                        break L21;
                      } else {
                        if (0 == param4[4].field_n) {
                          break L21;
                        } else {
                          if (param4[4].field_w == 0) {
                            break L21;
                          } else {
                            de.a(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                de.b(ee.field_d);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param4[4].field_w;
                                    continue L22;
                                  } else {
                                    param4[4].c(var21, var20);
                                    var21 = var21 + param4[4].field_n;
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("gl.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L24;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L24;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          L1: {
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (wi.field_f != null) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          so.field_j = false;
          break L0;
        }
        L2: {
          if (param0) {
            if (ce.field_h <= 0) {
              if (sm.field_a <= 0) {
                if (0 < oo.field_y) {
                  oo.field_y = oo.field_y - 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                sm.field_a = sm.field_a - 1;
                break L2;
              }
            } else {
              ce.field_h = ce.field_h - 1;
              break L2;
            }
          } else {
            if (wi.field_f == null) {
              if (om.field_x == null) {
                so.field_j = false;
                if (sm.field_a > 0) {
                  sm.field_a = sm.field_a - 1;
                  break L2;
                } else {
                  if (oo.field_y > 0) {
                    oo.field_y = oo.field_y - 1;
                    break L2;
                  } else {
                    if (ce.field_h >= ea.field_F) {
                      break L2;
                    } else {
                      L3: {
                        if (ce.field_h != 0) {
                          break L3;
                        } else {
                          ik.a((byte) -85);
                          break L3;
                        }
                      }
                      ce.field_h = ce.field_h + 1;
                      break L2;
                    }
                  }
                }
              } else {
                if (ce.field_h > 0) {
                  ce.field_h = ce.field_h - 1;
                  break L2;
                } else {
                  if (oo.field_y <= 0) {
                    if (~ea.field_F >= ~sm.field_a) {
                      break L2;
                    } else {
                      L4: {
                        if (0 != sm.field_a) {
                          break L4;
                        } else {
                          ik.a(true, -115);
                          break L4;
                        }
                      }
                      sm.field_a = sm.field_a + 1;
                      break L2;
                    }
                  } else {
                    oo.field_y = oo.field_y - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (ce.field_h <= 0) {
                if (sm.field_a > 0) {
                  sm.field_a = sm.field_a - 1;
                  break L2;
                } else {
                  if (~oo.field_y <= ~ea.field_F) {
                    break L2;
                  } else {
                    L5: {
                      if (oo.field_y == 0) {
                        ik.a(false, 95);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    oo.field_y = oo.field_y + 1;
                    break L2;
                  }
                }
              } else {
                ce.field_h = ce.field_h - 1;
                break L2;
              }
            }
          }
        }
        L6: {
          if (param1 == 0) {
            break L6;
          } else {
            var4 = null;
            gl.a(126, -38, -58, 81, (qb[]) null, 13);
            break L6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid date";
        field_b = new aj(9, 0, 4, 1);
        field_a = "Team Play:";
        field_f = "Please check if address is correct";
    }
}
