/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, qb param2, int param3, byte param4, int param5, int param6, boolean param7) {
        vu[][] stackIn_4_0 = null;
        vu[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        vu[] var8 = null;
        RuntimeException var8_ref = null;
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
                    var19 = la.field_k[var9];
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      if (var19.length <= var12) {
                        L4: {
                          if (var11 != 0) {
                            break L4;
                          } else {
                            if (param6 == ss.field_j) {
                              break L4;
                            } else {
                              var9++;
                              continue L2;
                            }
                          }
                        }
                        var12 = 0;
                        L5: while (true) {
                          if (var12 >= var19.length) {
                            var8_int = 0;
                            var9++;
                            continue L2;
                          } else {
                            L6: {
                              var13 = var19[var12];
                              if (0 == (var13 ^ -1)) {
                                ee.field_e = true;
                                break L6;
                              } else {
                                if (var13 >= param6) {
                                  break L6;
                                } else {
                                  m.field_f[var13] = true;
                                  break L6;
                                }
                              }
                            }
                            var12 += 2;
                            continue L5;
                          }
                        }
                      } else {
                        L7: {
                          var13 = var19[var12];
                          var14 = var10[1 + var12];
                          if (-1 != var13) {
                            L8: {
                              if (var13 != param6) {
                                break L8;
                              } else {
                                if (param5 != var14) {
                                  break L8;
                                } else {
                                  var11 = 1;
                                  var12 += 2;
                                  continue L3;
                                }
                              }
                            }
                            if (var13 < param6) {
                              if (var14 != (hm.field_G[var13] & 255)) {
                                break L7;
                              } else {
                                var12 += 2;
                                continue L3;
                              }
                            } else {
                              var9++;
                              continue L2;
                            }
                          } else {
                            if (rn.field_d[param3] != var14) {
                              break L7;
                            } else {
                              var12 += 2;
                              continue L3;
                            }
                          }
                        }
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  stackIn_4_0 = rf.field_c;

                  if (0 == (param6 ^ -1)) {
                    stackIn_5_0 = (vu[][]) ((Object) stackIn_4_0);
                    stackIn_5_1 = 1;
                    break L9;
                  } else {
                    stackIn_5_0 = (vu[][]) ((Object) stackIn_4_0);
                    stackIn_5_1 = 4 + param6;
                    break L9;
                  }
                }
                L10: {
                  var16 = stackIn_5_0[stackIn_5_1];
                  var17 = var16;
                  var8 = var17;
                  var9 = 1;
                  if (!param7) {
                    break L10;
                  } else {
                    if (param6 == -1) {
                      var10_int = 0;
                      L11: while (true) {
                        if (var10_int >= rn.field_d.length) {
                          break L10;
                        } else {
                          if ((er.field_h[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                            var10_int++;
                            continue L11;
                          } else {
                            var9 = 0;
                            break L10;
                          }
                        }
                      }
                    } else {
                      var10_int = 0;
                      L12: while (true) {
                        L13: {
                          if (-1 + var16.length <= var10_int) {
                            break L13;
                          } else {
                            if (0 == (rf.field_d[(var10_int + param0) / 8] & 1 << (7 & param0 - -var10_int))) {
                              var10_int++;
                              continue L12;
                            } else {
                              var9 = 0;
                              break L13;
                            }
                          }
                        }
                        param0 = param0 + (255 & rp.field_x[param6]);
                        break L10;
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L14: while (true) {
                  L15: {
                    if (param6 != -1) {
                      stackIn_22_0 = -1 + var17.length;
                      break L15;
                    } else {
                      stackIn_22_0 = rn.field_d.length;
                      break L15;
                    }
                  }
                  if ((stackIn_22_0 ^ -1) >= (var11 ^ -1)) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L16: while (true) {
                        if (-1 + var17.length <= var11) {
                          break L1;
                        } else {
                          L17: {
                            if ((param6 ^ -1) != 0) {
                              hm.field_G[param6] = (byte)var11;
                              break L17;
                            } else {
                              param3 = var11;
                              break L17;
                            }
                          }
                          pl.a(param0, param1, param2, param3, (byte) -120, param5, param6 + 1, param7);
                          if (!tt.field_c) {
                            var11++;
                            continue L16;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L18: {
                      if ((param6 ^ -1) == 0) {
                        param3 = var11;
                        break L18;
                      } else {
                        hm.field_G[param6] = (byte)var11;
                        break L18;
                      }
                    }
                    L19: {
                      L20: {
                        if ((param6 ^ -1) != 0) {
                          break L20;
                        } else {
                          if (-2 == (rn.field_d.length ^ -1)) {
                            var12 = 1;
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      var13_ref_vu = var8[var11 + 1];
                      if (param7) {
                        L21: {
                          if (!var13_ref_vu.field_I) {
                            if (var9 != 0) {
                              if (var13_ref_vu.field_lb) {
                                stackIn_46_0 = 1;
                                break L21;
                              } else {
                                stackIn_46_0 = 0;
                                break L21;
                              }
                            } else {
                              stackIn_46_0 = 0;
                              break L21;
                            }
                          } else {
                            stackIn_46_0 = 1;
                            break L21;
                          }
                        }
                        var12 = stackIn_46_0;
                        break L19;
                      } else {
                        L22: {
                          if (0 != (param6 ^ -1)) {
                            if ((uv.field_i.field_Eb[param6] & 255) != var11) {
                              stackIn_37_0 = 0;
                              break L22;
                            } else {
                              stackIn_37_0 = 1;
                              break L22;
                            }
                          } else {
                            if (rn.field_d[var11] != uv.field_i.field_bc) {
                              stackIn_37_0 = 0;
                              break L22;
                            } else {
                              stackIn_37_0 = 1;
                              break L22;
                            }
                          }
                        }
                        var12 = stackIn_37_0;
                        break L19;
                      }
                    }
                    L23: {
                      if (var12 == 0) {
                        break L23;
                      } else {
                        pl.a(param0, param1, param2, param3, (byte) -125, param5, 1 + param6, param7);
                        var10_int = 1;
                        break L23;
                      }
                    }
                    if (tt.field_c) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var11++;
                      continue L14;
                    }
                  }
                }
              }
            }
            L24: {
              if (param4 <= -118) {
                break L24;
              } else {
                field_c = (String) null;
                break L24;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var8_ref = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var8_ref);

            stackIn_103_1 = new StringBuilder().append("pl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L25;
            } else {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L25;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 20177) {
            field_a = (String) null;
        }
    }

    static {
        field_c = "Names can only contain letters, numbers, spaces and underscores";
        field_a = "Age:";
        field_b = "Private";
    }
}
