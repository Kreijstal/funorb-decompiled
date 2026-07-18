/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    static String[] field_a;

    final static void a(boolean param0, om param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        rk[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        rk var13 = null;
        int var14 = 0;
        int var15 = 0;
        rk[] var16 = null;
        int[] var17 = null;
        rk[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        rk[][] stackIn_32_0 = null;
        rk[][] stackIn_33_0 = null;
        rk[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk[][] stackOut_31_0 = null;
        rk[][] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        rk[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < param6) {
                L2: {
                  stackOut_31_0 = ab.field_A;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (param4 == -1) {
                    stackOut_33_0 = (rk[][]) (Object) stackIn_33_0;
                    stackOut_33_1 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L2;
                  } else {
                    stackOut_32_0 = (rk[][]) (Object) stackIn_32_0;
                    stackOut_32_1 = param4 + 4;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_34_0[stackIn_34_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (param0) {
                    if (param4 == -1) {
                      var10 = 0;
                      L4: while (true) {
                        if (w.field_n.length <= var10) {
                          break L3;
                        } else {
                          if ((rh.field_d[var10 / 8] & 1 << (var10 & 7)) != 0) {
                            var9 = 0;
                            break L3;
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L5: while (true) {
                        L6: {
                          if (-1 + var16.length <= var10) {
                            break L6;
                          } else {
                            if (0 != (lj.field_p[(var10 + param7) / 8] & 1 << (param7 + var10 & 7))) {
                              var9 = 0;
                              break L6;
                            } else {
                              var10++;
                              continue L5;
                            }
                          }
                        }
                        param7 = param7 + (255 & jg.field_c[param4]);
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    stackOut_51_0 = ~var11;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (-1 == param4) {
                      stackOut_53_0 = stackIn_53_0;
                      stackOut_53_1 = w.field_n.length;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      break L8;
                    } else {
                      stackOut_52_0 = stackIn_52_0;
                      stackOut_52_1 = var18.length - 1;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L8;
                    }
                  }
                  if (stackIn_54_0 <= ~stackIn_54_1) {
                    if (var10 != 0) {
                      break L1;
                    } else {
                      var11 = 0;
                      L9: while (true) {
                        if (-1 + var18.length <= var11) {
                          break L1;
                        } else {
                          L10: {
                            if (-1 != param4) {
                              qo.field_J[param4] = (byte)var11;
                              break L10;
                            } else {
                              param3 = var11;
                              break L10;
                            }
                          }
                          ar.a(param0, param1, param2, param3, 1 + param4, 0, param6, param7);
                          if (!dc.field_g) {
                            var11++;
                            continue L9;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (param4 != -1) {
                        qo.field_J[param4] = (byte)var11;
                        break L11;
                      } else {
                        param3 = var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (param4 != 0) {
                          break L13;
                        } else {
                          if (-2 == w.field_n.length) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8_array[1 - -var11];
                      if (param0) {
                        L14: {
                          if (!var13.field_Nb) {
                            if (var9 != 0) {
                              if (var13.field_eb) {
                                stackOut_76_0 = 1;
                                stackIn_78_0 = stackOut_76_0;
                                break L14;
                              } else {
                                stackOut_75_0 = 0;
                                stackIn_78_0 = stackOut_75_0;
                                break L14;
                              }
                            } else {
                              stackOut_73_0 = 0;
                              stackIn_78_0 = stackOut_73_0;
                              break L14;
                            }
                          } else {
                            stackOut_71_0 = 1;
                            stackIn_78_0 = stackOut_71_0;
                            break L14;
                          }
                        }
                        var12 = stackIn_78_0;
                        break L12;
                      } else {
                        L15: {
                          if (param4 != -1) {
                            if ((255 & o.field_e.field_Tb[param4]) != var11) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              break L15;
                            } else {
                              stackOut_67_0 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              break L15;
                            }
                          } else {
                            if (o.field_e.field_jc != w.field_n[var11]) {
                              stackOut_65_0 = 0;
                              stackIn_69_0 = stackOut_65_0;
                              break L15;
                            } else {
                              stackOut_64_0 = 1;
                              stackIn_69_0 = stackOut_64_0;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_69_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 != 0) {
                        ar.a(param0, param1, param2, param3, param4 - -1, 0, param6, param7);
                        var10 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (!dc.field_g) {
                      var11++;
                      continue L7;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (br.field_bc.length <= var9) {
                    if (var8_int != 0) {
                      dc.field_g = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var21 = br.field_bc[var9];
                    var20 = var21;
                    var19 = var20;
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var12 >= var21.length) {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (cq.field_p == param4) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L21: while (true) {
                            if (var21.length <= var12) {
                              break L19;
                            } else {
                              L22: {
                                var13_int = var21[var12];
                                if (var13_int != -1) {
                                  if (param4 > var13_int) {
                                    h.field_D[var13_int] = true;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                } else {
                                  lk.field_s = true;
                                  break L22;
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        } else {
                          L23: {
                            var13_int = var21[var12];
                            var14 = var10_ref_int__[1 + var12];
                            if (var13_int == -1) {
                              if (var14 == w.field_n[param3]) {
                                break L23;
                              } else {
                                break L19;
                              }
                            } else {
                              L24: {
                                if (var13_int != param4) {
                                  break L24;
                                } else {
                                  if (var14 != param2) {
                                    break L24;
                                  } else {
                                    var11 = 1;
                                    break L23;
                                  }
                                }
                              }
                              if (var13_int >= param4) {
                                break L19;
                              } else {
                                if (var14 == (qo.field_J[var13_int] & 255)) {
                                  break L23;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L18;
                        }
                      }
                      var9++;
                      continue L17;
                    }
                  }
                }
              }
            }
            L25: {
              if (param5 == 0) {
                break L25;
              } else {
                ar.a(33);
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var8;
            stackOut_98_1 = new StringBuilder().append("ar.C(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L26;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L26;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a() {
        return af.field_u;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            ar.a(true, (om) null, -103, -124, -112, 116, 82, 7);
        }
        field_a = null;
    }

    static {
    }
}
