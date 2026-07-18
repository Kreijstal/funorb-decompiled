/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static vg field_b;
    static String field_c;
    static String field_a;

    final static dk[] a(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        dk[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        dk[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 7) {
              stackOut_3_0 = new dk[]{lh.field_s, lc.field_j, vc.field_b};
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dk[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "lf.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        oh[] var10 = null;
        oh[] var11_ref_oh__ = null;
        int var11 = 0;
        int var12 = 0;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        oh[] stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        byte stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        oh[] stackOut_62_0 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            var9_int = param4 + param5 - -param0;
            var10 = new oh[]{new oh(var9_int, var9_int), new oh(param6, var9_int), new oh(var9_int, var9_int), new oh(var9_int, param6), new oh(64, 64), new oh(var9_int, param6), new oh(var9_int, var9_int), new oh(param6, var9_int), new oh(var9_int, var9_int)};
            var11_ref_oh__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var12 >= var11_ref_oh__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_oh__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var13.field_C.length >= ~var14) {
                              break L6;
                            } else {
                              var13.field_C[var14] = param1;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var11 = stackIn_13_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (param5 <= var11) {
                      break L9;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var15 != 0) {
                        break L8;
                      } else {
                        var12 = stackIn_16_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var12 >= var9_int) {
                                break L12;
                              } else {
                                var10[6].field_C[var12 + (var9_int - (var11 + 1)) * var9_int] = param3;
                                var10[8].field_C[var12 + (var9_int - var11 - 1) * var9_int] = param3;
                                var10[2].field_C[var9_int * var12 - (-var9_int + 1) + -var11] = param3;
                                var10[8].field_C[-1 + (var9_int + -var11) + var12 * var9_int] = param3;
                                var12++;
                                if (var15 != 0) {
                                  break L11;
                                } else {
                                  if (var15 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L11;
                          }
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L8;
                }
                var11 = stackIn_25_0;
                L13: while (true) {
                  stackOut_26_0 = var11;
                  stackOut_26_1 = param5;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 >= stackIn_27_1) {
                          break L16;
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            var12 = stackIn_29_0;
                            L17: while (true) {
                              L18: {
                                if (var12 >= var9_int) {
                                  break L18;
                                } else {
                                  var10[0].field_C[var12 + var9_int * var11] = param8;
                                  var10[0].field_C[var9_int * var12 - -var11] = param8;
                                  stackOut_31_0 = ~var12;
                                  stackOut_31_1 = ~(var9_int + -var11);
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 <= stackIn_32_1) {
                                        break L19;
                                      } else {
                                        var10[2].field_C[var12 - -(var9_int * var11)] = param8;
                                        var10[6].field_C[var11 + var9_int * var12] = param8;
                                        break L19;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      var11 = 0;
                      stackOut_37_0 = param7;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    L20: {
                      if (stackIn_38_0 == -112) {
                        break L20;
                      } else {
                        oh[] discarded$1 = lf.a(48, 126, 35, -60, 39, 14, -11, (byte) 26, 113);
                        break L20;
                      }
                    }
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (param6 <= var11) {
                            break L23;
                          } else {
                            stackOut_42_0 = 0;
                            stackIn_52_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_43_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (var12 >= param5) {
                                      break L26;
                                    } else {
                                      var10[7].field_C[var11 + (-1 + -var12 + var9_int) * param6] = param3;
                                      var10[5].field_C[var9_int * var11 - (var12 + 1 + -var9_int)] = param3;
                                      var10[1].field_C[var11 + param6 * var12] = param8;
                                      var10[3].field_C[var12 + var9_int * var11] = param8;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        break L22;
                      }
                      var11 = stackIn_52_0;
                      L27: while (true) {
                        L28: {
                          if (~(param6 >> 161197633) >= ~var11) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (var12 >= param0) {
                                    break L31;
                                  } else {
                                    var10[1].field_C[(-1 + var9_int + -var12) * param6 - -var11] = param2;
                                    var10[3].field_C[var11 * var9_int - -var9_int + -1 - var12] = param2;
                                    var10[7].field_C[param6 * var12 + var11] = param2;
                                    var10[5].field_C[var12 + var9_int * var11] = param2;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_62_0 = (oh[]) var10;
                        stackIn_63_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var9, "lf.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "lf.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Options Menu";
        field_a = "You have withdrawn your request to join.";
    }
}
