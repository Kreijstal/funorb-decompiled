/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class g extends gb {
    int field_t;
    static int[] field_u;
    static int field_p;
    static oa field_x;
    int field_v;
    static int field_y;
    int field_q;
    int field_o;
    int field_r;
    static ti field_w;
    int field_s;

    final static int g(int param0) {
        RuntimeException var1 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                g.f(-106);
                break L1;
              }
            }
            L2: {
              if (re.field_k) {
                break L2;
              } else {
                if (fe.field_L < bc.field_o) {
                  break L2;
                } else {
                  if (~(bc.field_o + cl.field_a) < ~fe.field_L) {
                    stackOut_12_0 = field_y;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_14_0 = -1;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "g.A(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    final static void f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (32 < qd.field_d) {
                  break L2;
                } else {
                  da.a(0, (byte) -74);
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var1_int = qd.field_d % 32;
                if (var1_int == 0) {
                  var1_int = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              da.a(-var1_int + qd.field_d, (byte) -74);
              break L1;
            }
            var1_int = 67 / ((-19 - param0) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "g.C(" + param0 + ')');
        }
    }

    final static qj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        qj[] var10 = null;
        qj[] var11_ref_qj__ = null;
        int var11 = 0;
        int var12 = 0;
        qj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        qj[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        qj[] stackOut_63_0 = null;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var9_int = param6 - -param1 - -param2;
            var10 = new qj[]{new qj(var9_int, var9_int), new qj(param7, var9_int), new qj(var9_int, var9_int), new qj(var9_int, param7), new qj(64, 64), new qj(var9_int, param7), new qj(var9_int, var9_int), new qj(param7, var9_int), new qj(var9_int, var9_int)};
            var11_ref_qj__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var12 <= ~var11_ref_qj__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_qj__[var12];
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
                            if (var13.field_z.length <= var14) {
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
                stackOut_12_0 = param8;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                if (stackIn_13_0 <= -82) {
                  break L7;
                } else {
                  field_y = 69;
                  break L7;
                }
              }
              var11 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var11 >= param6) {
                      break L10;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_28_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_19_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var12 >= var9_int) {
                                break L13;
                              } else {
                                var10[6].field_z[(-1 + -var11 + var9_int) * var9_int - -var12] = param3;
                                var10[8].field_z[(-1 + var9_int + -var11) * var9_int + var12] = param3;
                                var10[2].field_z[var12 * var9_int - var11 - (1 + -var9_int)] = param3;
                                var10[8].field_z[var9_int + (-1 - var11 + var9_int * var12)] = param3;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                var11 = stackIn_28_0;
                L14: while (true) {
                  stackOut_29_0 = var11;
                  stackOut_29_1 = param6;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_30_0 >= stackIn_30_1) {
                          break L17;
                        } else {
                          stackOut_31_0 = 0;
                          stackIn_41_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_32_0;
                            L18: while (true) {
                              L19: {
                                if (~var9_int >= ~var12) {
                                  break L19;
                                } else {
                                  var10[0].field_z[var12 - -(var11 * var9_int)] = param4;
                                  var10[0].field_z[var12 * var9_int - -var11] = param4;
                                  stackOut_34_0 = var12;
                                  stackOut_34_1 = -var11 + var9_int;
                                  stackIn_30_0 = stackOut_34_0;
                                  stackIn_30_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_35_0 >= stackIn_35_1) {
                                        break L20;
                                      } else {
                                        var10[2].field_z[var12 - -(var11 * var9_int)] = param4;
                                        var10[6].field_z[var9_int * var12 - -var11] = param4;
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L16;
                    }
                    var11 = stackIn_41_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (~var11 <= ~param7) {
                            break L23;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_53_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_44_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (~param6 >= ~var12) {
                                      break L26;
                                    } else {
                                      var10[7].field_z[var11 + (-1 + -var12 + var9_int) * param7] = param3;
                                      var10[5].field_z[-1 - -var9_int - (var12 - var9_int * var11)] = param3;
                                      var10[1].field_z[var12 * param7 + var11] = param4;
                                      var10[3].field_z[var9_int * var11 + var12] = param4;
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
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L22;
                      }
                      var11 = stackIn_53_0;
                      L27: while (true) {
                        L28: {
                          if (var11 >= param7 >> -553222335) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (var12 >= param2) {
                                    break L31;
                                  } else {
                                    var10[1].field_z[(-var12 + var9_int - 1) * param7 - -var11] = param5;
                                    var10[3].field_z[var9_int * var11 - (1 + -var9_int) + -var12] = param5;
                                    var10[7].field_z[var11 + param7 * var12] = param5;
                                    var10[5].field_z[var9_int * var11 - -var12] = param5;
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
                        stackOut_63_0 = (qj[]) var10;
                        stackIn_64_0 = stackOut_63_0;
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
          throw sl.a((Throwable) (Object) var9, "g.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    public static void a(byte param0) {
        try {
            field_w = null;
            field_u = null;
            field_x = null;
            if (param0 != 12) {
                field_w = null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "g.B(" + param0 + ')');
        }
    }

    g() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_y = -1;
        field_w = null;
    }
}
