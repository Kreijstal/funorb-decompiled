/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends ud {
    static String field_N;
    static boolean[] field_Q;
    static int[] field_O;
    int field_T;
    static iq field_P;
    static String field_S;
    static String field_R;

    final static void h(int param0) {
        ma.field_h = null;
        v.field_b = null;
        rc.field_f = null;
        ih.field_d = null;
        pd.field_a = null;
        el.field_I = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, kh param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        uo[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uo var13_ref_uo = null;
        int var14 = 0;
        int var15 = 0;
        uo[] var16 = null;
        uo[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        uo[][] stackIn_3_0 = null;
        uo[][] stackIn_4_0 = null;
        uo[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        uo[][] stackOut_2_0 = null;
        uo[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        uo[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var15 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (~param5 <= ~param1) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (~var9 <= ~we.field_m.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      qk.field_b = true;
                      break L1;
                    }
                  } else {
                    var21 = we.field_m[var9];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      L4: {
                        if (var21.length <= var12) {
                          L5: {
                            if (var11 != 0) {
                              break L5;
                            } else {
                              if (~dr.field_c == ~param5) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var12 = 0;
                          L6: while (true) {
                            if (~var21.length >= ~var12) {
                              var8_int = 0;
                              break L4;
                            } else {
                              L7: {
                                var13 = var21[var12];
                                if (-1 != var13) {
                                  if (~var13 <= ~param5) {
                                    break L7;
                                  } else {
                                    gf.field_b[var13] = true;
                                    break L7;
                                  }
                                } else {
                                  ln.field_p = true;
                                  break L7;
                                }
                              }
                              var12 += 2;
                              continue L6;
                            }
                          }
                        } else {
                          L8: {
                            var13 = var21[var12];
                            var14 = var10[var12 + 1];
                            if (-1 != var13) {
                              L9: {
                                if (~var13 != ~param5) {
                                  break L9;
                                } else {
                                  if (var14 != param2) {
                                    break L9;
                                  } else {
                                    var11 = 1;
                                    break L8;
                                  }
                                }
                              }
                              if (~param5 >= ~var13) {
                                break L4;
                              } else {
                                if (~(255 & dk.field_j[var13]) != ~var14) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              if (~dg.field_T[param6] != ~var14) {
                                break L4;
                              } else {
                                break L8;
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
                  stackOut_2_0 = mc.field_f;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param5 == -1) {
                    stackOut_4_0 = (uo[][]) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L10;
                  } else {
                    stackOut_3_0 = (uo[][]) (Object) stackIn_3_0;
                    stackOut_3_1 = 4 - -param5;
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
                  if (param7) {
                    if (param5 == -1) {
                      var10_int = 0;
                      L12: while (true) {
                        if (var10_int >= dg.field_T.length) {
                          break L11;
                        } else {
                          if ((md.field_c[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                            var9 = 0;
                            break L11;
                          } else {
                            var10_int++;
                            continue L12;
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
                            if ((ka.field_s[(param0 - -var10_int) / 8] & 1 << (var10_int + param0 & 7)) != 0) {
                              var9 = 0;
                              break L14;
                            } else {
                              var10_int++;
                              continue L13;
                            }
                          }
                        }
                        param0 = param0 + (255 & qf.field_j[param5]);
                        break L11;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                var10_int = 0;
                var11 = 0;
                L15: while (true) {
                  L16: {
                    if (param5 == -1) {
                      stackOut_24_0 = dg.field_T.length;
                      stackIn_25_0 = stackOut_24_0;
                      break L16;
                    } else {
                      stackOut_23_0 = -1 + var17.length;
                      stackIn_25_0 = stackOut_23_0;
                      break L16;
                    }
                  }
                  if (~stackIn_25_0 >= ~var11) {
                    L17: {
                      if (var10_int != 0) {
                        break L17;
                      } else {
                        var11 = 0;
                        L18: while (true) {
                          if (var11 >= var17.length - 1) {
                            break L17;
                          } else {
                            L19: {
                              if (param5 != -1) {
                                dk.field_j[param5] = (byte)var11;
                                break L19;
                              } else {
                                param6 = var11;
                                break L19;
                              }
                            }
                            sh.a(param0, param1, param2, false, param4, 1 + param5, param6, param7);
                            if (qk.field_b) {
                              return;
                            } else {
                              var11++;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    L20: {
                      if (param5 == -1) {
                        param6 = var11;
                        break L20;
                      } else {
                        dk.field_j[param5] = (byte)var11;
                        break L20;
                      }
                    }
                    L21: {
                      L22: {
                        if (param5 != -1) {
                          break L22;
                        } else {
                          if (dg.field_T.length == 1) {
                            var12 = 1;
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var13_ref_uo = var8_array[var11 + 1];
                      if (param7) {
                        L23: {
                          L24: {
                            if (var13_ref_uo.field_Ib) {
                              break L24;
                            } else {
                              L25: {
                                if (var9 == 0) {
                                  break L25;
                                } else {
                                  if (!var13_ref_uo.field_pb) {
                                    break L25;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L23;
                            }
                          }
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L23;
                        }
                        var12 = stackIn_47_0;
                        break L21;
                      } else {
                        L26: {
                          if (param5 == -1) {
                            if (~em.field_L.field_Nb != ~dg.field_T[var11]) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L26;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L26;
                            }
                          } else {
                            if ((em.field_L.field_tc[param5] & 255) != var11) {
                              stackOut_36_0 = 0;
                              stackIn_40_0 = stackOut_36_0;
                              break L26;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_40_0 = stackOut_35_0;
                              break L26;
                            }
                          }
                        }
                        var12 = stackIn_40_0;
                        break L21;
                      }
                    }
                    L27: {
                      if (var12 != 0) {
                        var10_int = 1;
                        sh.a(param0, param1, param2, false, param4, param5 - -1, param6, param7);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    if (qk.field_b) {
                      return;
                    } else {
                      var11++;
                      continue L15;
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
            stackOut_98_0 = (RuntimeException) var8;
            stackOut_98_1 = new StringBuilder().append("sh.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(0).append(44);
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param4 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L28;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L28;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static boolean h() {
        int var1 = 2;
        return sm.field_C != null ? true : false;
    }

    public static void g() {
        field_R = null;
        field_P = null;
        field_O = null;
        field_N = null;
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (!(((sh) this).field_L != null)) {
            return;
        }
        int var5 = 53 % ((-42 - param1) / 53);
        if (((sh) this).field_T == 0) {
            return;
        }
        if (((sh) this).field_T == 256) {
            ((sh) this).field_L.a(param0, (byte) -128, param2 - -((sh) this).field_C, ((sh) this).field_D + param3);
            return;
        }
        dd var6 = new dd(((sh) this).field_L.field_l, ((sh) this).field_L.field_y);
        kj.a(110, var6);
        ((sh) this).field_L.a(param0, (byte) -126, 0, 0);
        oc.a(118);
        var6.a(param2 - -((sh) this).field_C, ((sh) this).field_D + param3, ((sh) this).field_T);
    }

    public sh() {
        super(0, 0, 0, 0, (fp) null, (cc) null);
        ((sh) this).field_T = 256;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param1 + param0) <= qh.field_f) {
            return param3 + param1;
        }
        if (~(-param0 + param1) <= param2) {
            return -param0 + param1;
        }
        return qh.field_f + -param0;
    }

    sh(ei param0) {
        super(param0.field_C, param0.field_D, param0.field_l, param0.field_y, (fp) null, (cc) null);
        try {
            param0.a(((sh) this).field_l, 0, ((sh) this).field_y, false, 0);
            ((sh) this).field_T = 256;
            ((sh) this).field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "sh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(di param0, byte param1, di param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            rl.field_c = param2;
            bm.field_k = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("sh.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(-32).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_0_0 = sg.a(-116, param2, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("sh.D(").append(60).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, int param9, boolean param10) {
        int discarded$0 = 16777215;
        int discarded$1 = -124;
        int discarded$2 = 0;
        int discarded$3 = 15;
        int discarded$4 = 13;
        int discarded$5 = 16777215;
        rn.a(14, param6, true, 11, param10, param8, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "You can spectate this game";
        field_O = new int[]{2, 20, 21, 49, 6, 5, 3, 9};
        field_S = "From only <%0>/month";
        field_R = "Wants to draw.";
    }
}
