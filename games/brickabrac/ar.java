/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    static String[] field_a;

    final static void a(boolean param0, om param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        rk[][] stackIn_33_0 = null;
        rk[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rk[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        rk var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        rk[] var16 = null;
        int[] var17 = null;
        rk[] var18 = null;
        int[] var19 = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < param6) {
                L2: {
                  stackIn_33_0 = ab.field_A;

                  if ((param4 ^ -1) == 0) {
                    stackIn_34_0 = (rk[][]) ((Object) stackIn_33_0);
                    stackIn_34_1 = 1;
                    break L2;
                  } else {
                    stackIn_34_0 = (rk[][]) ((Object) stackIn_33_0);
                    stackIn_34_1 = param4 + 4;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_34_0[stackIn_34_1];
                  var18 = var16;
                  var8 = var18;
                  var9 = 1;
                  if (param0) {
                    if ((param4 ^ -1) == 0) {
                      var10 = 0;
                      L4: while (true) {
                        if (w.field_n.length <= var10) {
                          break L3;
                        } else {
                          if (-1 != (rh.field_d[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
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
                    stackIn_53_0 = var11 ^ -1;

                    if (-1 == param4) {
                      stackIn_54_0 = stackIn_53_0;
                      stackIn_54_1 = w.field_n.length;
                      break L8;
                    } else {
                      stackIn_54_0 = stackIn_53_0;
                      stackIn_54_1 = var18.length - 1;
                      break L8;
                    }
                  }
                  if (stackIn_54_0 <= (stackIn_54_1 ^ -1)) {
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
                            decompiledRegionSelector0 = 1;
                            break L0;
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
                        if ((param4 ^ -1) != 0) {
                          break L13;
                        } else {
                          if (-2 == (w.field_n.length ^ -1)) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8[1 - -var11];
                      if (param0) {
                        L14: {
                          if (!var13.field_Nb) {
                            if (var9 != 0) {
                              if (var13.field_eb) {
                                stackIn_78_0 = 1;
                                break L14;
                              } else {
                                stackIn_78_0 = 0;
                                break L14;
                              }
                            } else {
                              stackIn_78_0 = 0;
                              break L14;
                            }
                          } else {
                            stackIn_78_0 = 1;
                            break L14;
                          }
                        }
                        var12 = stackIn_78_0;
                        break L12;
                      } else {
                        L15: {
                          if (param4 != -1) {
                            if ((255 & o.field_e.field_Tb[param4]) != var11) {
                              stackIn_69_0 = 0;
                              break L15;
                            } else {
                              stackIn_69_0 = 1;
                              break L15;
                            }
                          } else {
                            if (o.field_e.field_jc != w.field_n[var11]) {
                              stackIn_69_0 = 0;
                              break L15;
                            } else {
                              stackIn_69_0 = 1;
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
                      decompiledRegionSelector0 = 0;
                      break L0;
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
                    var19 = br.field_bc[var9];
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var12 >= var19.length) {
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
                            if (var19.length <= var12) {
                              break L19;
                            } else {
                              L22: {
                                var13_int = var19[var12];
                                if ((var13_int ^ -1) != 0) {
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
                            var13_int = var19[var12];
                            var14 = var10_ref_int__[1 + var12];
                            if (0 == (var13_int ^ -1)) {
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
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8_ref = decompiledCaughtException;
            stackIn_100_0 = (RuntimeException) (var8_ref);

            stackIn_100_1 = new StringBuilder().append("ar.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L26;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L26;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static int a(byte param0) {
        if (param0 != 120) {
            return 9;
        }
        return af.field_u;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            om var2 = (om) null;
            ar.a(true, (om) null, -103, -124, -112, 116, 82, 7);
        }
        field_a = null;
    }

    static {
    }
}
