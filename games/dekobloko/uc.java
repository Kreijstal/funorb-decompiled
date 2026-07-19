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
        si.a(kf.field_O, param2, nk.field_b, hn.field_a, 180, (byte) -41, 320);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ve param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        qd[] var8_array = null;
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
        qd[][] stackIn_3_0 = null;
        qd[][] stackIn_4_0 = null;
        qd[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd[][] stackOut_2_0 = null;
        qd[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qd[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~param5 >= ~param2) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (bc.field_D.length <= var9) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      ve.field_ac = true;
                      break L1;
                    }
                  } else {
                    var21 = bc.field_D[var9];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      L4: {
                        if (~var12 <= ~var21.length) {
                          L5: {
                            if (var11 != 0) {
                              break L5;
                            } else {
                              if (~param2 != ~j.field_b) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L6: while (true) {
                            if (~var12 <= ~var21.length) {
                              break L4;
                            } else {
                              L7: {
                                var13 = var21[var12];
                                if (var13 == -1) {
                                  gd.field_b = true;
                                  break L7;
                                } else {
                                  if (~var13 <= ~param2) {
                                    break L7;
                                  } else {
                                    rd.field_c[var13] = true;
                                    break L7;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L6;
                            }
                          }
                        } else {
                          L8: {
                            var13 = var21[var12];
                            var14 = var10[1 + var12];
                            if (var13 == -1) {
                              if (~b.field_P[param0] != ~var14) {
                                break L4;
                              } else {
                                break L8;
                              }
                            } else {
                              L9: {
                                if (~param2 != ~var13) {
                                  break L9;
                                } else {
                                  if (param4 != var14) {
                                    break L9;
                                  } else {
                                    var11 = 1;
                                    break L8;
                                  }
                                }
                              }
                              if (param2 <= var13) {
                                break L4;
                              } else {
                                if (~(km.field_D[var13] & 255) != ~var14) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L3;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                L10: {
                  stackOut_2_0 = qa.field_v;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param2 != -1) {
                    stackOut_4_0 = (qd[][]) ((Object) stackIn_4_0);
                    stackOut_4_1 = param2 + 4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L10;
                  } else {
                    stackOut_3_0 = (qd[][]) ((Object) stackIn_3_0);
                    stackOut_3_1 = 1;
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
                  if (!param1) {
                    break L11;
                  } else {
                    if (param2 != -1) {
                      var10_int = 0;
                      L12: while (true) {
                        L13: {
                          if (var16.length + -1 <= var10_int) {
                            break L13;
                          } else {
                            if (0 == (v.field_a[(param3 + var10_int) / 8] & 1 << (7 & param3 + var10_int))) {
                              var10_int++;
                              continue L12;
                            } else {
                              var9 = 0;
                              break L13;
                            }
                          }
                        }
                        param3 = param3 + (255 & rb.field_k[param2]);
                        break L11;
                      }
                    } else {
                      var10_int = 0;
                      L14: while (true) {
                        if (b.field_P.length <= var10_int) {
                          break L11;
                        } else {
                          if ((kk.field_l[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                            var10_int++;
                            continue L14;
                          } else {
                            var9 = 0;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L15: while (true) {
                  L16: {
                    stackOut_19_0 = var11;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (param2 != -1) {
                      stackOut_21_0 = stackIn_21_0;
                      stackOut_21_1 = -1 + var17.length;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L16;
                    } else {
                      stackOut_20_0 = stackIn_20_0;
                      stackOut_20_1 = b.field_P.length;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L16;
                    }
                  }
                  if (stackIn_22_0 >= stackIn_22_1) {
                    L17: {
                      if (var10_int != 0) {
                        break L17;
                      } else {
                        var11 = 0;
                        L18: while (true) {
                          if (var11 >= -1 + var17.length) {
                            break L17;
                          } else {
                            L19: {
                              if (-1 == param2) {
                                param0 = var11;
                                break L19;
                              } else {
                                km.field_D[param2] = (byte)var11;
                                break L19;
                              }
                            }
                            uc.a(param0, param1, 1 + param2, param3, param4, param5, param6, false);
                            if (!ve.field_ac) {
                              var11++;
                              continue L18;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    L20: {
                      if (param2 != -1) {
                        km.field_D[param2] = (byte)var11;
                        break L20;
                      } else {
                        param0 = var11;
                        break L20;
                      }
                    }
                    L21: {
                      L22: {
                        if (param2 != -1) {
                          break L22;
                        } else {
                          if (b.field_P.length != 1) {
                            break L22;
                          } else {
                            var12 = 1;
                            break L21;
                          }
                        }
                      }
                      var13_ref_qd = var8_array[1 + var11];
                      if (param1) {
                        L23: {
                          L24: {
                            if (var13_ref_qd.field_ab) {
                              break L24;
                            } else {
                              L25: {
                                if (var9 == 0) {
                                  break L25;
                                } else {
                                  if (!var13_ref_qd.field_Hb) {
                                    break L25;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L23;
                            }
                          }
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L23;
                        }
                        var12 = stackIn_44_0;
                        break L21;
                      } else {
                        L26: {
                          if (param2 != -1) {
                            if (~var11 != ~(255 & cd.field_m.field_kc[param2])) {
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              break L26;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_37_0 = stackOut_35_0;
                              break L26;
                            }
                          } else {
                            if (~cd.field_m.field_mc != ~b.field_P[var11]) {
                              stackOut_33_0 = 0;
                              stackIn_37_0 = stackOut_33_0;
                              break L26;
                            } else {
                              stackOut_32_0 = 1;
                              stackIn_37_0 = stackOut_32_0;
                              break L26;
                            }
                          }
                        }
                        var12 = stackIn_37_0;
                        break L21;
                      }
                    }
                    L27: {
                      if (var12 != 0) {
                        uc.a(param0, param1, param2 - -1, param3, param4, param5, param6, false);
                        var10_int = 1;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    if (!ve.field_ac) {
                      var11++;
                      continue L15;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var8 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) (var8);
            stackOut_90_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param6 == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L28;
            } else {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L28;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ',' + false + ')');
        }
    }

    static {
        field_a = true;
        field_c = new af();
        field_f = "Accept";
        field_b = "Lobby";
    }
}
