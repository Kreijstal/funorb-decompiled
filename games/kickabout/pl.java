/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, qb param2, int param3, byte param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        vu[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vu var13_ref_vu = null;
        int var14 = 0;
        int var15 = 0;
        vu[] var16 = null;
        vu[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        vu[][] stackIn_3_0 = null;
        vu[][] stackIn_4_0 = null;
        vu[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        vu[][] stackOut_2_0 = null;
        vu[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vu[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param6 >= param1) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= la.field_k.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      tt.field_c = true;
                      break L1;
                    }
                  } else {
                    var21 = la.field_k[var9];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      if (var21.length <= var12) {
                        if (var11 != 0) {
                          var12 = 0;
                          L4: while (true) {
                            if (var12 >= var21.length) {
                              var8_int = 0;
                              var9++;
                              continue L2;
                            } else {
                              L5: {
                                var13 = var21[var12];
                                if (var13 == -1) {
                                  ee.field_e = true;
                                  break L5;
                                } else {
                                  if (var13 >= param6) {
                                    break L5;
                                  } else {
                                    m.field_f[var13] = true;
                                    break L5;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L4;
                            }
                          }
                        } else {
                          L6: {
                            if (param6 != ss.field_j) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      } else {
                        var13 = var21[var12];
                        var14 = var10[1 + var12];
                        if (-1 != var13) {
                          L7: {
                            if (var13 != param6) {
                              break L7;
                            } else {
                              if (param5 != var14) {
                                break L7;
                              } else {
                                var11 = 1;
                                var12 += 2;
                                continue L3;
                              }
                            }
                          }
                          L8: {
                            if (var13 >= param6) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var9++;
                          continue L2;
                        } else {
                          L9: {
                            if (rn.field_d[param3] != var14) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              } else {
                L10: {
                  stackOut_2_0 = rf.field_c;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param6 == -1) {
                    stackOut_4_0 = (vu[][]) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L10;
                  } else {
                    stackOut_3_0 = (vu[][]) (Object) stackIn_3_0;
                    stackOut_3_1 = 4 + param6;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L10;
                  }
                }
                L11: {
                  var16 = stackIn_5_0[stackIn_5_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (!param7) {
                    break L11;
                  } else {
                    if (param6 == -1) {
                      var10_int = 0;
                      L12: while (true) {
                        if (var10_int >= rn.field_d.length) {
                          break L11;
                        } else {
                          if ((er.field_h[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                            var10_int++;
                            continue L12;
                          } else {
                            var9 = 0;
                            break L11;
                          }
                        }
                      }
                    } else {
                      var10_int = 0;
                      L13: while (true) {
                        L14: {
                          if (-1 + var16.length <= var10_int) {
                            break L14;
                          } else {
                            if (0 == (rf.field_d[(var10_int + param0) / 8] & 1 << (7 & param0 - -var10_int))) {
                              var10_int++;
                              continue L13;
                            } else {
                              var9 = 0;
                              break L14;
                            }
                          }
                        }
                        param0 = param0 + (255 & rp.field_x[param6]);
                        break L11;
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L15: while (true) {
                  L16: {
                    if (param6 != -1) {
                      stackOut_21_0 = -1 + var17.length;
                      stackIn_22_0 = stackOut_21_0;
                      break L16;
                    } else {
                      stackOut_20_0 = rn.field_d.length;
                      stackIn_22_0 = stackOut_20_0;
                      break L16;
                    }
                  }
                  if (~stackIn_22_0 >= ~var11) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L17: while (true) {
                        if (-1 + var17.length <= var11) {
                          break L1;
                        } else {
                          L18: {
                            if (param6 != -1) {
                              hm.field_G[param6] = (byte)var11;
                              break L18;
                            } else {
                              param3 = var11;
                              break L18;
                            }
                          }
                          pl.a(param0, param1, param2, param3, (byte) -120, param5, param6 + 1, param7);
                          if (!tt.field_c) {
                            var11++;
                            continue L17;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L19: {
                      if (param6 == -1) {
                        param3 = var11;
                        break L19;
                      } else {
                        hm.field_G[param6] = (byte)var11;
                        break L19;
                      }
                    }
                    L20: {
                      L21: {
                        if (param6 != 0) {
                          break L21;
                        } else {
                          if (-2 == rn.field_d.length) {
                            var12 = 1;
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var13_ref_vu = var8_array[var11 + 1];
                      if (param7) {
                        L22: {
                          if (!var13_ref_vu.field_I) {
                            if (var9 != 0) {
                              if (var13_ref_vu.field_lb) {
                                stackOut_44_0 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                break L22;
                              } else {
                                stackOut_43_0 = 0;
                                stackIn_46_0 = stackOut_43_0;
                                break L22;
                              }
                            } else {
                              stackOut_41_0 = 0;
                              stackIn_46_0 = stackOut_41_0;
                              break L22;
                            }
                          } else {
                            stackOut_39_0 = 1;
                            stackIn_46_0 = stackOut_39_0;
                            break L22;
                          }
                        }
                        var12 = stackIn_46_0;
                        break L20;
                      } else {
                        L23: {
                          if (param6 != -1) {
                            if ((uv.field_i.field_Eb[param6] & 255) != var11) {
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              break L23;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_37_0 = stackOut_35_0;
                              break L23;
                            }
                          } else {
                            if (rn.field_d[var11] != uv.field_i.field_bc) {
                              stackOut_33_0 = 0;
                              stackIn_37_0 = stackOut_33_0;
                              break L23;
                            } else {
                              stackOut_32_0 = 1;
                              stackIn_37_0 = stackOut_32_0;
                              break L23;
                            }
                          }
                        }
                        var12 = stackIn_37_0;
                        break L20;
                      }
                    }
                    L24: {
                      if (var12 == 0) {
                        break L24;
                      } else {
                        pl.a(param0, param1, param2, param3, (byte) -125, param5, 1 + param6, param7);
                        var10_int = 1;
                        break L24;
                      }
                    }
                    if (tt.field_c) {
                      return;
                    } else {
                      var11++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L25: {
              if (param4 <= -118) {
                break L25;
              } else {
                field_c = null;
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) var8;
            stackOut_97_1 = new StringBuilder().append("pl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param2 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L26;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L26;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Names can only contain letters, numbers, spaces and underscores";
        field_a = "Age:";
        field_b = "Private";
    }
}
