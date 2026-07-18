/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String[] field_d;
    static String field_a;
    static sa field_b;
    static int field_c;

    final static hj a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        hj stackIn_15_0 = null;
        hj stackIn_26_0 = null;
        hj stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_14_0 = null;
        hj stackOut_12_0 = null;
        hj stackOut_25_0 = null;
        hj stackOut_23_0 = null;
        hj stackOut_37_0 = null;
        hj stackOut_35_0 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 <= -24) {
                break L1;
              } else {
                ak.a(124);
                break L1;
              }
            }
            if (param2 == -1) {
              L2: {
                if (null == vm.field_vb) {
                  vm.field_vb = dl.a(wj.field_n, "basic", false, "unachieved");
                  hi.field_N = new hj(32, 32);
                  vb.a(-79, hi.field_N);
                  vm.field_vb.c(0, 0, 32, 32);
                  ug.b(-1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!param1) {
                  stackOut_14_0 = vm.field_vb;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_12_0 = hi.field_N;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              }
              return stackIn_15_0;
            } else {
              L4: {
                if (null != cd.field_a) {
                  break L4;
                } else {
                  if (!fb.field_i.b("achievements_128", 89)) {
                    L5: {
                      if (param1) {
                        stackOut_25_0 = hi.a(32, (byte) -106, 32);
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_23_0 = ra.field_hb;
                        stackIn_26_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    return stackIn_26_0;
                  } else {
                    cd.field_a = si.a(fb.field_i, 33, "achievements_128", "");
                    nl.field_h = new hj[cd.field_a.length];
                    ok.a(32381);
                    var3_int = 0;
                    L6: while (true) {
                      L7: {
                        if (~var3_int <= ~cd.field_a.length) {
                          break L7;
                        } else {
                          nl.field_h[var3_int] = new hj(32, 32);
                          nl.field_h[var3_int].f();
                          cd.field_a[var3_int].c(0, 0, 32, 32);
                          var3_int++;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      ug.b(-1);
                      break L4;
                    }
                  }
                }
              }
              L8: {
                if (param1) {
                  stackOut_37_0 = nl.field_h[param2];
                  stackIn_38_0 = stackOut_37_0;
                  break L8;
                } else {
                  stackOut_35_0 = cd.field_a[param2];
                  stackIn_38_0 = stackOut_35_0;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var3, "ak.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_38_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ak.B(" + param0 + ')');
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
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
        hj[] stackIn_61_0 = null;
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
        int stackOut_49_0 = 0;
        hj[] stackOut_60_0 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var9_int = param8 + (param5 + param2);
            var10 = new hj[]{new hj(var9_int, var9_int), new hj(param7, var9_int), new hj(var9_int, var9_int), new hj(var9_int, param7), new hj(64, 64), new hj(var9_int, param7), new hj(var9_int, var9_int), new hj(param7, var9_int), new hj(var9_int, var9_int)};
            var11_ref_hj__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var12 >= var11_ref_hj__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_hj__[var12];
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
                            if (~var14 <= ~var13.field_z.length) {
                              break L6;
                            } else {
                              var13.field_z[var14] = param0;
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
                              if (~var9_int >= ~var12) {
                                break L12;
                              } else {
                                var10[6].field_z[var9_int * (-var11 + var9_int + -1) - -var12] = param1;
                                var10[8].field_z[var12 + var9_int * (-1 + (-var11 + var9_int))] = param1;
                                var10[2].field_z[-var11 - (-var9_int + (1 - var12 * var9_int))] = param1;
                                var10[8].field_z[var9_int * var12 + (-1 + var9_int) + -var11] = param1;
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
                  stackOut_26_0 = param5;
                  stackOut_26_1 = var11;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 <= stackIn_27_1) {
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
                                if (var9_int <= var12) {
                                  break L18;
                                } else {
                                  var10[0].field_z[var11 * var9_int + var12] = param3;
                                  var10[0].field_z[var11 + var9_int * var12] = param3;
                                  stackOut_31_0 = -var11 + var9_int;
                                  stackOut_31_1 = var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 > stackIn_32_1) {
                                        var10[2].field_z[var11 * var9_int + var12] = param3;
                                        var10[6].field_z[var12 * var9_int - -var11] = param3;
                                        break L19;
                                      } else {
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
                      stackOut_37_0 = param6;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~var11 <= ~param7) {
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
                                    if (param5 <= var12) {
                                      break L25;
                                    } else {
                                      var10[7].field_z[var11 + (var9_int + (-var12 + -1)) * param7] = param1;
                                      var10[5].field_z[var9_int * var11 - (1 + -var9_int - -var12)] = param1;
                                      var10[1].field_z[var11 + var12 * param7] = param3;
                                      var10[3].field_z[var12 + var11 * var9_int] = param3;
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
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      var11 = stackIn_50_0;
                      L26: while (true) {
                        L27: {
                          if (~var11 <= ~(param7 >> -570040031)) {
                            break L27;
                          } else {
                            var12 = 0;
                            L28: while (true) {
                              L29: {
                                L30: {
                                  if (~var12 <= ~param8) {
                                    break L30;
                                  } else {
                                    var10[1].field_z[var11 + (var9_int - (var12 + 1)) * param7] = param4;
                                    var10[3].field_z[var11 * var9_int + var9_int - 1 + -var12] = param4;
                                    var10[7].field_z[param7 * var12 - -var11] = param4;
                                    var10[5].field_z[var12 + var11 * var9_int] = param4;
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
                        stackOut_60_0 = (hj[]) var10;
                        stackIn_61_0 = stackOut_60_0;
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
          throw kk.a((Throwable) (Object) var9, "ak.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_61_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = -1;
    }
}
