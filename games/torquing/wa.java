/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ih {
    static double field_e;
    static String field_c;
    static boolean field_f;
    static df field_d;

    public static void a(int param0) {
        try {
            field_d = null;
            field_c = null;
            if (param0 > -40) {
                t[] discarded$0 = wa.a((byte) 71, -60, -21, -91, 93, 31, -101, 24, -104);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "wa.A(" + param0 + ')');
        }
    }

    final static cp a(boolean param0, fj param1) {
        RuntimeException var2 = null;
        cp stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        cp stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                cp discarded$2 = wa.a(true, (fj) null);
                break L1;
              }
            }
            stackOut_3_0 = new cp(param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.e((byte) 62), param1.i((byte) -101));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("wa.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                cp discarded$2 = wa.a(false, (fj) null);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (~param3 <= ~param4) {
                    break L4;
                  } else {
                    var5_int = param3;
                    L5: while (true) {
                      L6: {
                        if (var5_int >= param4) {
                          break L6;
                        } else {
                          qd.field_a[var5_int][param1] = param0;
                          var5_int++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var5_int = param4;
                L7: while (true) {
                  if (param3 <= var5_int) {
                    break L3;
                  } else {
                    qd.field_a[var5_int][param1] = param0;
                    var5_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L7;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var5, "wa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 34) {
              L1: {
                L2: {
                  L3: {
                    if (param0 < 48) {
                      break L3;
                    } else {
                      if (param0 <= 57) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > param0) {
                      break L4;
                    } else {
                      if (90 >= param0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param0 < 97) {
                      break L5;
                    } else {
                      if (param0 > 122) {
                        break L5;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                }
                stackOut_19_0 = 1;
                stackIn_22_0 = stackOut_19_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "wa.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final static t[] a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        t[] var10 = null;
        t[] var11_ref_t__ = null;
        int var11 = 0;
        int var12 = 0;
        t var13 = null;
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
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_52_0 = null;
        t[] stackIn_63_0 = null;
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
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        byte stackOut_49_0 = 0;
        t[] stackOut_62_0 = null;
        Object stackOut_51_0 = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            var9_int = param2 - (-param3 + -param1);
            var10 = new t[]{new t(var9_int, var9_int), new t(param5, var9_int), new t(var9_int, var9_int), new t(var9_int, param5), new t(64, 64), new t(var9_int, param5), new t(var9_int, var9_int), new t(param5, var9_int), new t(var9_int, var9_int)};
            var11_ref_t__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var11_ref_t__.length >= ~var12) {
                    break L3;
                  } else {
                    var13 = var11_ref_t__[var12];
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
                            if (~var13.field_y.length >= ~var14) {
                              break L6;
                            } else {
                              var13.field_y[var14] = param7;
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
                    if (~param2 >= ~var11) {
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
                                var10[6].field_y[var9_int * (-1 + var9_int + -var11) + var12] = param4;
                                var10[8].field_y[var12 + var9_int * (-var11 + (var9_int - 1))] = param4;
                                var10[2].field_y[-var11 - (1 + (-var9_int - var12 * var9_int))] = param4;
                                var10[8].field_y[-var11 - 1 - -var9_int + var12 * var9_int] = param4;
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
                  stackOut_26_0 = ~param2;
                  stackOut_26_1 = ~var11;
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
                                if (~var9_int >= ~var12) {
                                  break L18;
                                } else {
                                  var10[0].field_y[var12 + var11 * var9_int] = param6;
                                  var10[0].field_y[var12 * var9_int + var11] = param6;
                                  stackOut_31_0 = var9_int + -var11;
                                  stackOut_31_1 = var12;
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
                                        var10[2].field_y[var11 * var9_int + var12] = param6;
                                        var10[6].field_y[var11 + var12 * var9_int] = param6;
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
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (param5 <= var11) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var12 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (~var12 <= ~param2) {
                                      break L25;
                                    } else {
                                      var10[7].field_y[var11 + (-var12 + (var9_int - 1)) * param5] = param4;
                                      var10[5].field_y[var9_int * var11 + (-1 + var9_int) - var12] = param4;
                                      var10[1].field_y[var11 + param5 * var12] = param6;
                                      var10[3].field_y[var12 + var9_int * var11] = param6;
                                      var12++;
                                      if (var15 != 0) {
                                        break L24;
                                      } else {
                                        if (var15 == 0) {
                                          continue L23;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L24;
                                }
                                if (var15 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        stackOut_49_0 = param0;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      if (stackIn_50_0 == -63) {
                        L26: while (true) {
                          L27: {
                            if (param5 >> 2080308673 <= var11) {
                              break L27;
                            } else {
                              var12 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (~param1 >= ~var12) {
                                      break L30;
                                    } else {
                                      var10[1].field_y[var11 + param5 * (-var12 + var9_int - 1)] = param8;
                                      var10[3].field_y[var9_int * var11 + var9_int - 1 + -var12] = param8;
                                      var10[7].field_y[var12 * param5 + var11] = param8;
                                      var10[5].field_y[var9_int * var11 - -var12] = param8;
                                      var12++;
                                      if (var15 != 0) {
                                        break L29;
                                      } else {
                                        if (var15 == 0) {
                                          continue L28;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L29;
                                }
                                if (var15 == 0) {
                                  continue L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          stackOut_62_0 = (t[]) var10;
                          stackIn_63_0 = stackOut_62_0;
                          break L0;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (t[]) (Object) stackIn_52_0;
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
          throw rb.a((Throwable) (Object) var9, "wa.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = Math.atan2(1.0, 0.0);
        field_c = "WORLD:";
        field_f = false;
    }
}
