/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, qb param2, int param3, byte param4, int param5, int param6, boolean param7) {
        int var8 = 0;
        vu[] var8_ref_vu__ = null;
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
        vu[][] stackIn_2_0 = null;
        vu[][] stackIn_3_0 = null;
        vu[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        vu[][] stackOut_1_0 = null;
        vu[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vu[][] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var15 = Kickabout.field_G;
          if (param6 >= param1) {
            var8 = 1;
            var9 = 0;
            L1: while (true) {
              if (var9 >= la.field_k.length) {
                if (var8 == 0) {
                  break L0;
                } else {
                  tt.field_c = true;
                  break L0;
                }
              } else {
                var21 = la.field_k[var9];
                var20 = var21;
                var19 = var20;
                var18 = var19;
                var10 = var18;
                var11 = 0;
                var12 = 0;
                L2: while (true) {
                  if (var21.length <= var12) {
                    L3: {
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (param6 == ss.field_j) {
                          break L3;
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    }
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var21.length) {
                        var8 = 0;
                        var9++;
                        continue L1;
                      } else {
                        var13 = var21[var12];
                        if (0 == (var13 ^ -1)) {
                          ee.field_e = true;
                          var12 += 2;
                          continue L4;
                        } else {
                          if (var13 < param6) {
                            m.field_f[var13] = true;
                            var12 += 2;
                            continue L4;
                          } else {
                            var12 += 2;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      var13 = var21[var12];
                      var14 = var10[1 + var12];
                      if (-1 != var13) {
                        L6: {
                          if (var13 != param6) {
                            break L6;
                          } else {
                            if (param5 != var14) {
                              break L6;
                            } else {
                              var11 = 1;
                              var12 += 2;
                              continue L2;
                            }
                          }
                        }
                        if (var13 < param6) {
                          if (var14 == (hm.field_G[var13] & 255)) {
                            break L5;
                          } else {
                            var9++;
                            continue L1;
                          }
                        } else {
                          var9++;
                          continue L1;
                        }
                      } else {
                        if (rn.field_d[param3] == var14) {
                          break L5;
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    }
                    var12 += 2;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L7: {
              stackOut_1_0 = rf.field_c;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 == (param6 ^ -1)) {
                stackOut_3_0 = (vu[][]) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L7;
              } else {
                stackOut_2_0 = (vu[][]) (Object) stackIn_2_0;
                stackOut_2_1 = 4 + param6;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L7;
              }
            }
            L8: {
              var16 = stackIn_4_0[stackIn_4_1];
              var17 = var16;
              var8_ref_vu__ = var17;
              var9 = 1;
              if (!param7) {
                break L8;
              } else {
                if (param6 == -1) {
                  var10_int = 0;
                  L9: while (true) {
                    if (var10_int >= rn.field_d.length) {
                      break L8;
                    } else {
                      if ((er.field_h[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                        var10_int++;
                        continue L9;
                      } else {
                        var9 = 0;
                        break L8;
                      }
                    }
                  }
                } else {
                  var10_int = 0;
                  L10: while (true) {
                    L11: {
                      if (-1 + var16.length <= var10_int) {
                        break L11;
                      } else {
                        if (0 == (rf.field_d[(var10_int + param0) / 8] & 1 << (7 & param0 - -var10_int))) {
                          var10_int++;
                          continue L10;
                        } else {
                          var9 = 0;
                          break L11;
                        }
                      }
                    }
                    param0 = param0 + (255 & rp.field_x[param6]);
                    break L8;
                  }
                }
              }
            }
            var10_int = 0;
            var11 = 0;
            L12: while (true) {
              L13: {
                if (param6 != -1) {
                  var17 = var8_ref_vu__;
                  stackOut_20_0 = -1 + var17.length;
                  stackIn_21_0 = stackOut_20_0;
                  break L13;
                } else {
                  stackOut_19_0 = rn.field_d.length;
                  stackIn_21_0 = stackOut_19_0;
                  break L13;
                }
              }
              if ((stackIn_21_0 ^ -1) >= (var11 ^ -1)) {
                if (var10_int == 0) {
                  var11 = 0;
                  L14: while (true) {
                    if (-1 + var17.length <= var11) {
                      break L0;
                    } else {
                      L15: {
                        if ((param6 ^ -1) != 0) {
                          hm.field_G[param6] = (byte)var11;
                          break L15;
                        } else {
                          param3 = var11;
                          break L15;
                        }
                      }
                      pl.a(param0, param1, param2, param3, (byte) -120, param5, param6 + 1, param7);
                      if (!tt.field_c) {
                        var11++;
                        continue L14;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                L16: {
                  if ((param6 ^ -1) == 0) {
                    param3 = var11;
                    break L16;
                  } else {
                    hm.field_G[param6] = (byte)var11;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (param6 != 0) {
                      break L18;
                    } else {
                      if (-2 == rn.field_d.length) {
                        var12 = 1;
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var13_ref_vu = var8_ref_vu__[var11 + 1];
                  if (param7) {
                    if (!var13_ref_vu.field_I) {
                      if (var9 != 0) {
                        if (var13_ref_vu.field_lb) {
                          var12 = 1;
                          break L17;
                        } else {
                          var12 = 0;
                          break L17;
                        }
                      } else {
                        var12 = 0;
                        break L17;
                      }
                    } else {
                      var12 = 1;
                      break L17;
                    }
                  } else {
                    if (0 != (param6 ^ -1)) {
                      L19: {
                        if ((uv.field_i.field_Eb[param6] & 255) != var11) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L19;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L19;
                        }
                      }
                      var12 = stackIn_36_0;
                      break L17;
                    } else {
                      if (rn.field_d[var11] != uv.field_i.field_bc) {
                        var12 = 0;
                        break L17;
                      } else {
                        var12 = 1;
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (var12 == 0) {
                    break L20;
                  } else {
                    pl.a(param0, param1, param2, param3, (byte) -125, param5, 1 + param6, param7);
                    var10_int = 1;
                    break L20;
                  }
                }
                if (tt.field_c) {
                  return;
                } else {
                  var11++;
                  continue L12;
                }
              }
            }
          }
        }
        L21: {
          if (param4 <= -118) {
            break L21;
          } else {
            field_c = null;
            break L21;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 20177) {
            field_a = null;
        }
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
