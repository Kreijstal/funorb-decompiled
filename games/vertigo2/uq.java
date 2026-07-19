/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    static fe field_a;
    static String field_b;
    static int field_d;
    int field_e;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -6872) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(uh param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        nk[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        nk var13 = null;
        int var14 = 0;
        int var15 = 0;
        nk[] var16 = null;
        int[] var17 = null;
        nk[] var18 = null;
        int[] var19 = null;
        nk[][] stackIn_31_0 = null;
        nk[][] stackIn_32_0 = null;
        nk[][] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nk[][] stackOut_30_0 = null;
        nk[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        nk[][] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < param1) {
                L2: {
                  stackOut_30_0 = mg.field_S;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (param4 == -1) {
                    stackOut_32_0 = (nk[][]) ((Object) stackIn_32_0);
                    stackOut_32_1 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L2;
                  } else {
                    stackOut_31_0 = (nk[][]) ((Object) stackIn_31_0);
                    stackOut_31_1 = 4 + param4;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_33_0[stackIn_33_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (param7) {
                    if (0 == (param4 ^ -1)) {
                      var10 = 0;
                      L4: while (true) {
                        if (var10 >= rc.field_a.length) {
                          break L3;
                        } else {
                          if ((qc.field_w[var10 / 8] & 1 << (var10 & 7)) != 0) {
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
                          if (var16.length - 1 <= var10) {
                            break L6;
                          } else {
                            if (0 == (dj.field_a[(var10 + param3) / 8] & 1 << (var10 + param3 & 7))) {
                              var10++;
                              continue L5;
                            } else {
                              var9 = 0;
                              break L6;
                            }
                          }
                        }
                        param3 = param3 + (255 & kr.field_c[param4]);
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
                    if (-1 != param4) {
                      stackOut_51_0 = -1 + var18.length;
                      stackIn_52_0 = stackOut_51_0;
                      break L8;
                    } else {
                      stackOut_50_0 = rc.field_a.length;
                      stackIn_52_0 = stackOut_50_0;
                      break L8;
                    }
                  }
                  if (stackIn_52_0 <= var11) {
                    if (var10 != 0) {
                      break L1;
                    } else {
                      var11 = 0;
                      L9: while (true) {
                        if (var11 >= -1 + var18.length) {
                          break L1;
                        } else {
                          L10: {
                            if (0 != (param4 ^ -1)) {
                              e.field_c[param4] = (byte)var11;
                              break L10;
                            } else {
                              param6 = var11;
                              break L10;
                            }
                          }
                          uq.a(param0, param1, 20473, param3, param4 - -1, param5, param6, param7);
                          if (gd.field_r) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var11++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (-1 != param4) {
                        e.field_c[param4] = (byte)var11;
                        break L11;
                      } else {
                        param6 = var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if ((param4 ^ -1) != 0) {
                          break L13;
                        } else {
                          if ((rc.field_a.length ^ -1) != -2) {
                            break L13;
                          } else {
                            var12 = 1;
                            break L12;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (param7) {
                        L14: {
                          if (!var13.field_V) {
                            if (var9 != 0) {
                              if (var13.field_lb) {
                                stackOut_74_0 = 1;
                                stackIn_76_0 = stackOut_74_0;
                                break L14;
                              } else {
                                stackOut_73_0 = 0;
                                stackIn_76_0 = stackOut_73_0;
                                break L14;
                              }
                            } else {
                              stackOut_71_0 = 0;
                              stackIn_76_0 = stackOut_71_0;
                              break L14;
                            }
                          } else {
                            stackOut_69_0 = 1;
                            stackIn_76_0 = stackOut_69_0;
                            break L14;
                          }
                        }
                        var12 = stackIn_76_0;
                        break L12;
                      } else {
                        L15: {
                          if (0 == (param4 ^ -1)) {
                            if (rc.field_a[var11] != gd.field_j.field_uc) {
                              stackOut_66_0 = 0;
                              stackIn_67_0 = stackOut_66_0;
                              break L15;
                            } else {
                              stackOut_65_0 = 1;
                              stackIn_67_0 = stackOut_65_0;
                              break L15;
                            }
                          } else {
                            if (var11 != (255 & gd.field_j.field_fc[param4])) {
                              stackOut_63_0 = 0;
                              stackIn_67_0 = stackOut_63_0;
                              break L15;
                            } else {
                              stackOut_62_0 = 1;
                              stackIn_67_0 = stackOut_62_0;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_67_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 != 0) {
                        uq.a(param0, param1, param2 ^ 0, param3, 1 + param4, param5, param6, param7);
                        var10 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (!gd.field_r) {
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
                  if (gr.field_W.length <= var9) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      gd.field_r = true;
                      break L1;
                    }
                  } else {
                    var19 = gr.field_W[var9];
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
                              if (ol.field_A == param4) {
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
                                if (0 != (var13_int ^ -1)) {
                                  if (var13_int >= param4) {
                                    break L22;
                                  } else {
                                    mn.field_t[var13_int] = true;
                                    break L22;
                                  }
                                } else {
                                  ng.field_a = true;
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
                            var14 = var10_ref_int__[var12 + 1];
                            if ((var13_int ^ -1) == 0) {
                              if (rc.field_a[param6] == var14) {
                                break L23;
                              } else {
                                break L19;
                              }
                            } else {
                              L24: {
                                if (var13_int != param4) {
                                  break L24;
                                } else {
                                  if (param5 == var14) {
                                    var11 = 1;
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              if (var13_int >= param4) {
                                break L19;
                              } else {
                                if ((e.field_c[var13_int] & 255) == var14) {
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
              if (param2 == 20473) {
                break L25;
              } else {
                field_a = (fe) null;
                break L25;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var8);
            stackOut_96_1 = new StringBuilder().append("uq.B(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L26;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L26;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
        field_d = 24;
        field_b = "<col=ee9d32>Items - Blocks 1/2</col>";
        field_c = "You need a rating of <%1> to play with the current options.";
    }
}
