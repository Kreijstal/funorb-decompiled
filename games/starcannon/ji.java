/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = param0 + param4;
              var6 = param3 + param1;
              if (ki.field_l < param4) {
                stackOut_3_0 = param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ki.field_l;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (ki.field_e < param3) {
                stackOut_6_0 = param3;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ki.field_e;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < ki.field_g) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ki.field_g;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < ki.field_i) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = ki.field_i;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (param4 < ki.field_l) {
                break L5;
              } else {
                if (param4 < ki.field_g) {
                  var11 = param4 + var8 * ki.field_j;
                  var12 = var10 + (1 - var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      ki.field_a[var11] = 16777215;
                      var11 = var11 + 2 * ki.field_j;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (param3 < ki.field_e) {
                break L7;
              } else {
                if (var6 < ki.field_i) {
                  var11 = var7 + param3 * ki.field_j;
                  var12 = var9 + 1 + -var7 >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      ki.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (ki.field_l > var5_int) {
                break L9;
              } else {
                if (ki.field_g <= var5_int) {
                  break L9;
                } else {
                  var11 = ((-param4 + var5_int & 1) + var8) * ki.field_j - -var5_int;
                  var12 = -var8 + 1 - -var10 >> 1;
                  L10: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L9;
                    } else {
                      ki.field_a[var11] = 16777215;
                      var11 = var11 + ki.field_j * 2;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (param3 < ki.field_e) {
                break L11;
              } else {
                if (var6 >= ki.field_i) {
                  break L11;
                } else {
                  var11 = (-param3 + var6 & 1) + (var7 + ki.field_j * var6);
                  var12 = -var7 + (1 - -var9) >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      ki.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var5, "ji.C(" + param0 + ',' + param1 + ',' + -140110815 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static id[] a(boolean param0, ue param1, int param2, int param3) {
        RuntimeException var4 = null;
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
        try {
          if (qb.a((byte) 126, param3, param2, param1)) {
            return tj.h(126);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ji.B(").append(true).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            if (param1 >= param5) {
              return;
            } else {
              if (param2 > 1 + param1) {
                L1: {
                  if (param2 <= 5 + param1) {
                    break L1;
                  } else {
                    if (param0 != param6) {
                      var7_int = (param6 >> 1) + (param0 >> 1) - -(1 & (param6 & param0));
                      var8 = param1;
                      var9 = param0;
                      var10 = 100 / ((-53 - param3) / 63);
                      var11 = param6;
                      var12 = param1;
                      L2: while (true) {
                        if (var12 >= param2) {
                          ji.a(param0, param1, var8, (byte) -124, param4, param5, var9);
                          ji.a(var11, var8, param2, (byte) -128, param4, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var13 = jk.field_c[var12];
                            if (!param4) {
                              stackOut_22_0 = fg.field_b[var13];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = tk.field_f[var13];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var14 = stackIn_23_0;
                            if (var7_int < var14) {
                              L5: {
                                jk.field_c[var12] = jk.field_c[var8];
                                if (var9 > var14) {
                                  var9 = var14;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$1 = var8;
                              var8++;
                              jk.field_c[incrementValue$1] = var13;
                              break L4;
                            } else {
                              if (var11 < var14) {
                                var11 = var14;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var12++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L6: while (true) {
                  if (param1 >= var7_int) {
                    return;
                  } else {
                    var8 = param1;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = jk.field_c[var8];
                          var10 = jk.field_c[1 + var8];
                          if (mj.a(var9, param4, -24153, var10)) {
                            jk.field_c[var8] = var10;
                            jk.field_c[var8 - -1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var7, "ji.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
