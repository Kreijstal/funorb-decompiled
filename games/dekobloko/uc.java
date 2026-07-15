/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static hm field_e;
    static boolean field_a;
    static long field_g;
    static af field_c;
    static int field_d;
    static String field_f;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
            hk.b();
        } else {
            hk.a(0, 0, hk.field_j, hk.field_i, 0, 192);
        }
        if (param2 <= 39) {
            return;
        }
        cg.a(param0, 91);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
            field_b = null;
        }
        si.a(kf.field_O, param2, nk.field_b, hn.field_a, param0, (byte) -41, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ve param6, boolean param7) {
        int var8 = 0;
        qd[] var8_ref_qd__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qd var13_ref_qd = null;
        int var14 = 0;
        int var15 = 0;
        qd[] var16 = null;
        qd[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        qd[][] stackIn_2_0 = null;
        qd[][] stackIn_3_0 = null;
        qd[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        qd[][] stackOut_1_0 = null;
        qd[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qd[][] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          if ((param5 ^ -1) >= (param2 ^ -1)) {
            var8 = 1;
            var9 = 0;
            L1: while (true) {
              if (bc.field_D.length <= var9) {
                if (var8 == 0) {
                  break L0;
                } else {
                  ve.field_ac = true;
                  break L0;
                }
              } else {
                var21 = bc.field_D[var9];
                var20 = var21;
                var19 = var20;
                var18 = var19;
                var10 = var18;
                var11 = 0;
                var12 = 0;
                L2: while (true) {
                  L3: {
                    if ((var12 ^ -1) <= (var21.length ^ -1)) {
                      L4: {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if ((param2 ^ -1) != (j.field_b ^ -1)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8 = 0;
                      var12 = 0;
                      L5: while (true) {
                        if ((var12 ^ -1) <= (var21.length ^ -1)) {
                          break L3;
                        } else {
                          L6: {
                            var13 = var21[var12];
                            if ((var13 ^ -1) == 0) {
                              gd.field_b = true;
                              break L6;
                            } else {
                              if ((var13 ^ -1) <= (param2 ^ -1)) {
                                break L6;
                              } else {
                                rd.field_c[var13] = true;
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
                        var13 = var21[var12];
                        var14 = var10[1 + var12];
                        if ((var13 ^ -1) == 0) {
                          if ((b.field_P[param0] ^ -1) != (var14 ^ -1)) {
                            break L3;
                          } else {
                            break L7;
                          }
                        } else {
                          L8: {
                            if ((param2 ^ -1) != (var13 ^ -1)) {
                              break L8;
                            } else {
                              if (param4 != var14) {
                                break L8;
                              } else {
                                var11 = 1;
                                break L7;
                              }
                            }
                          }
                          if (param2 <= var13) {
                            break L3;
                          } else {
                            if ((km.field_D[var13] & 255 ^ -1) != (var14 ^ -1)) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var12 += 2;
                      continue L2;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            L9: {
              stackOut_1_0 = qa.field_v;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 != (param2 ^ -1)) {
                stackOut_3_0 = (qd[][]) (Object) stackIn_3_0;
                stackOut_3_1 = param2 + 4;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L9;
              } else {
                stackOut_2_0 = (qd[][]) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L9;
              }
            }
            L10: {
              var16 = stackIn_4_0[stackIn_4_1];
              var17 = var16;
              var8_ref_qd__ = var17;
              var9 = 1;
              if (!param1) {
                break L10;
              } else {
                if (param2 != -1) {
                  var16 = var17;
                  var10_int = 0;
                  L11: while (true) {
                    L12: {
                      if (var16.length + -1 <= var10_int) {
                        break L12;
                      } else {
                        if (0 == (v.field_a[(param3 + var10_int) / 8] & 1 << (7 & param3 + var10_int))) {
                          var10_int++;
                          continue L11;
                        } else {
                          var9 = 0;
                          break L12;
                        }
                      }
                    }
                    param3 = param3 + (255 & rb.field_k[param2]);
                    break L10;
                  }
                } else {
                  var10_int = 0;
                  L13: while (true) {
                    if (b.field_P.length <= var10_int) {
                      break L10;
                    } else {
                      if ((kk.field_l[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                        var10_int++;
                        continue L13;
                      } else {
                        var9 = 0;
                        break L10;
                      }
                    }
                  }
                }
              }
            }
            var10_int = 0;
            var11 = 0;
            L14: while (true) {
              L15: {
                stackOut_18_0 = var11;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if ((param2 ^ -1) != 0) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = -1 + var17.length;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L15;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = b.field_P.length;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L15;
                }
              }
              if (stackIn_21_0 >= stackIn_21_1) {
                L16: {
                  if (var10_int != 0) {
                    break L16;
                  } else {
                    var11 = 0;
                    L17: while (true) {
                      if (var11 >= -1 + var17.length) {
                        break L16;
                      } else {
                        L18: {
                          if (-1 == param2) {
                            param0 = var11;
                            break L18;
                          } else {
                            km.field_D[param2] = (byte)var11;
                            break L18;
                          }
                        }
                        uc.a(param0, param1, 1 + param2, param3, param4, param5, param6, false);
                        if (!ve.field_ac) {
                          var11++;
                          continue L17;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L19: {
                  if (0 != (param2 ^ -1)) {
                    km.field_D[param2] = (byte)var11;
                    break L19;
                  } else {
                    param0 = var11;
                    break L19;
                  }
                }
                L20: {
                  L21: {
                    if (0 != (param2 ^ -1)) {
                      break L21;
                    } else {
                      if (b.field_P.length != 1) {
                        break L21;
                      } else {
                        var12 = 1;
                        break L20;
                      }
                    }
                  }
                  var13_ref_qd = var8_ref_qd__[1 + var11];
                  if (param1) {
                    L22: {
                      L23: {
                        if (var13_ref_qd.field_ab) {
                          break L23;
                        } else {
                          L24: {
                            if (var9 == 0) {
                              break L24;
                            } else {
                              if (!var13_ref_qd.field_Hb) {
                                break L24;
                              } else {
                                break L23;
                              }
                            }
                          }
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L22;
                        }
                      }
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L22;
                    }
                    var12 = stackIn_43_0;
                    break L20;
                  } else {
                    L25: {
                      if ((param2 ^ -1) != 0) {
                        if ((var11 ^ -1) != (255 & cd.field_m.field_kc[param2] ^ -1)) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L25;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L25;
                        }
                      } else {
                        if ((cd.field_m.field_mc ^ -1) != (b.field_P[var11] ^ -1)) {
                          stackOut_32_0 = 0;
                          stackIn_36_0 = stackOut_32_0;
                          break L25;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_36_0 = stackOut_31_0;
                          break L25;
                        }
                      }
                    }
                    var12 = stackIn_36_0;
                    break L20;
                  }
                }
                L26: {
                  if (var12 != 0) {
                    uc.a(param0, param1, param2 - -1, param3, param4, param5, param6, false);
                    var10_int = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                if (!ve.field_ac) {
                  var11++;
                  continue L14;
                } else {
                  return;
                }
              }
            }
          }
        }
        L27: {
          if (!param7) {
            break L27;
          } else {
            field_b = null;
            break L27;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new af();
        field_f = "Accept";
        field_b = "Lobby";
    }
}
