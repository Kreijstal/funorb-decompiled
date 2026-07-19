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
        if (param0 != -1) {
            field_S = (String) null;
        }
        v.field_b = (byte[][]) null;
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
        uo[][] stackIn_3_0 = null;
        uo[][] stackIn_4_0 = null;
        uo[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uo[][] stackOut_2_0 = null;
        uo[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        uo[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        var15 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param5 >= param1) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= we.field_m.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      qk.field_b = true;
                      break L1;
                    }
                  } else {
                    var19 = we.field_m[var9];
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      L4: {
                        if (var19.length <= var12) {
                          L5: {
                            if (var11 != 0) {
                              break L5;
                            } else {
                              if (dr.field_c == param5) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var12 = 0;
                          L6: while (true) {
                            if (var19.length <= var12) {
                              var8_int = 0;
                              break L4;
                            } else {
                              L7: {
                                var13 = var19[var12];
                                if (-1 != var13) {
                                  if (var13 >= param5) {
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
                          var13 = var19[var12];
                          var14 = var10[var12 + 1];
                          if (-1 != var13) {
                            L8: {
                              if (var13 != param5) {
                                break L8;
                              } else {
                                if (var14 != param2) {
                                  break L8;
                                } else {
                                  var11 = 1;
                                  var12 += 2;
                                  continue L3;
                                }
                              }
                            }
                            if (param5 > var13) {
                              if ((255 & dk.field_j[var13]) != var14) {
                                var12 += 2;
                                continue L3;
                              } else {
                                var12 += 2;
                                continue L3;
                              }
                            } else {
                              var9++;
                              continue L2;
                            }
                          } else {
                            if (dg.field_T[param6] != var14) {
                              break L4;
                            } else {
                              var12 += 2;
                              continue L3;
                            }
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                L9: {
                  stackOut_2_0 = mc.field_f;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (0 == (param5 ^ -1)) {
                    stackOut_4_0 = (uo[][]) ((Object) stackIn_4_0);
                    stackOut_4_1 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L9;
                  } else {
                    stackOut_3_0 = (uo[][]) ((Object) stackIn_3_0);
                    stackOut_3_1 = 4 - -param5;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L9;
                  }
                }
                L10: {
                  var16 = stackIn_5_0[stackIn_5_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (param7) {
                    if (param5 == -1) {
                      var10_int = 0;
                      L11: while (true) {
                        if (var10_int >= dg.field_T.length) {
                          break L10;
                        } else {
                          if ((md.field_c[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                            var9 = 0;
                            break L10;
                          } else {
                            var10_int++;
                            continue L11;
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
                            if ((ka.field_s[(param0 - -var10_int) / 8] & 1 << (var10_int + param0 & 7)) != 0) {
                              var9 = 0;
                              break L13;
                            } else {
                              var10_int++;
                              continue L12;
                            }
                          }
                        }
                        param0 = param0 + (255 & qf.field_j[param5]);
                        break L10;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                var10_int = 0;
                var11 = 0;
                L14: while (true) {
                  L15: {
                    if (0 == (param5 ^ -1)) {
                      stackOut_24_0 = dg.field_T.length;
                      stackIn_25_0 = stackOut_24_0;
                      break L15;
                    } else {
                      stackOut_23_0 = -1 + var17.length;
                      stackIn_25_0 = stackOut_23_0;
                      break L15;
                    }
                  }
                  if ((stackIn_25_0 ^ -1) >= (var11 ^ -1)) {
                    if (var10_int != 0) {
                      break L1;
                    } else {
                      var11 = 0;
                      L16: while (true) {
                        if (var11 >= var17.length - 1) {
                          break L1;
                        } else {
                          L17: {
                            if (param5 != -1) {
                              dk.field_j[param5] = (byte)var11;
                              break L17;
                            } else {
                              param6 = var11;
                              break L17;
                            }
                          }
                          sh.a(param0, param1, param2, false, param4, 1 + param5, param6, param7);
                          if (qk.field_b) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var11++;
                            continue L16;
                          }
                        }
                      }
                    }
                  } else {
                    L18: {
                      if ((param5 ^ -1) == 0) {
                        param6 = var11;
                        break L18;
                      } else {
                        dk.field_j[param5] = (byte)var11;
                        break L18;
                      }
                    }
                    L19: {
                      L20: {
                        if (0 != (param5 ^ -1)) {
                          break L20;
                        } else {
                          if (dg.field_T.length == 1) {
                            var12 = 1;
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      var13_ref_uo = var8_array[var11 + 1];
                      if (param7) {
                        L21: {
                          if (!var13_ref_uo.field_Ib) {
                            if (var9 != 0) {
                              if (var13_ref_uo.field_pb) {
                                stackOut_47_0 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                break L21;
                              } else {
                                stackOut_46_0 = 0;
                                stackIn_49_0 = stackOut_46_0;
                                break L21;
                              }
                            } else {
                              stackOut_44_0 = 0;
                              stackIn_49_0 = stackOut_44_0;
                              break L21;
                            }
                          } else {
                            stackOut_42_0 = 1;
                            stackIn_49_0 = stackOut_42_0;
                            break L21;
                          }
                        }
                        var12 = stackIn_49_0;
                        break L19;
                      } else {
                        L22: {
                          if (param5 == -1) {
                            if (em.field_L.field_Nb != dg.field_T[var11]) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L22;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L22;
                            }
                          } else {
                            if ((em.field_L.field_tc[param5] & 255) != var11) {
                              stackOut_36_0 = 0;
                              stackIn_40_0 = stackOut_36_0;
                              break L22;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_40_0 = stackOut_35_0;
                              break L22;
                            }
                          }
                        }
                        var12 = stackIn_40_0;
                        break L19;
                      }
                    }
                    L23: {
                      if (var12 != 0) {
                        var10_int = 1;
                        sh.a(param0, param1, param2, false, param4, param5 - -1, param6, param7);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    if (qk.field_b) {
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
              if (!param3) {
                break L24;
              } else {
                field_Q = (boolean[]) null;
                break L24;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var8 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) (var8);
            stackOut_109_1 = new StringBuilder().append("sh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param4 == null) {
              stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L25;
            } else {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L25;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_112_0), stackIn_112_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static boolean h(byte param0) {
        int var1 = 26 % ((-52 - param0) / 32);
        return sm.field_C != null ? true : false;
    }

    public static void g(byte param0) {
        byte[] discarded$0 = null;
        field_R = null;
        field_P = null;
        field_O = null;
        field_N = null;
        if (param0 != 118) {
            byte[] var2 = (byte[]) null;
            discarded$0 = sh.a((byte) 52, (byte[]) null, -94);
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (!(this.field_L != null)) {
            return;
        }
        int var5 = 53 % ((-42 - param1) / 53);
        if (-1 == (this.field_T ^ -1)) {
            return;
        }
        if (this.field_T == 256) {
            this.field_L.a(param0, (byte) -128, param2 - -this.field_C, this.field_D + param3);
            return;
        }
        dd var6 = new dd(this.field_L.field_l, this.field_L.field_y);
        kj.a(110, var6);
        this.field_L.a(param0, (byte) -126, 0, 0);
        oc.a(118);
        var6.a(param2 - -this.field_C, this.field_D + param3, this.field_T);
    }

    public sh() {
        super(0, 0, 0, 0, (fp) null, (cc) null);
        this.field_T = 256;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param1 + param0) <= qh.field_f) {
            return param3 + param1;
        }
        if ((-param0 + param1 ^ -1) <= param2) {
            return -param0 + param1;
        }
        return qh.field_f + -param0;
    }

    sh(ei param0) {
        super(param0.field_C, param0.field_D, param0.field_l, param0.field_y, (fp) null, (cc) null);
        try {
            param0.a(this.field_l, 0, this.field_y, false, 0);
            this.field_T = 256;
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(di param0, byte param1, di param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              rl.field_c = param2;
              bm.field_k = param0;
              if (param1 == -32) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sh.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 25) {
                break L1;
              } else {
                discarded$2 = sh.a(-81, 49, -78, -118);
                break L1;
              }
            }
            stackOut_2_0 = sg.a(-116, param2, param1, (byte) 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("sh.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
            kh var13 = (kh) null;
            sh.a(-82, 16, -99, true, (kh) null, -40, 16, false);
        }
        rn.a(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }

    static {
        field_N = "You can spectate this game";
        field_O = new int[]{2, 20, 21, 49, 6, 5, 3, 9};
        field_S = "From only <%0>/month";
        field_R = "Wants to draw.";
    }
}
