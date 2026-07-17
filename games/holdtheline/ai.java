/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static tf field_a;
    static go field_b;
    static hj field_c;

    final static boolean a(int param0) {
        if (param0 > -59) {
            field_c = null;
            return true;
        }
        return true;
    }

    final static void a(gn param0, int[] param1, int param2) {
        try {
            int var3_int = 0;
            int var4 = 0;
            int var6 = HoldTheLine.field_D;
            try {
                if (param2 > -73) {
                    boolean discarded$0 = ai.a(-18);
                }
                for (var3_int = 0; var3_int < 6; var3_int++) {
                    for (var4 = 0; pc.field_l[var3_int] > var4; var4++) {
                        if (tk.field_c[var3_int][var4].field_r) {
                            {
                                tk.field_c[var3_int][var4] = lm.a(param0.a(tk.field_c[var3_int][var4].field_h, 0, param1, ""), (byte) 123);
                            }
                        }
                    }
                }
                vf.field_v = true;
            } catch (RuntimeException runtimeException) {
                throw kk.a((Throwable) (Object) runtimeException, "ai.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, ui param1) {
        try {
            pk.field_H.b((tj) (Object) param1.field_j);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ai.D(" + -123 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, qk param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        uj var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        qk var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        uj stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        uj stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var40 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_r == null) {
                  break L2;
                } else {
                  if (var45.field_l <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_r;
                    ta.a(0, 0, pk.field_I, (byte) -83, var62);
                    break L1;
                  }
                }
              }
              int discarded$1 = 126;
              hm.a();
              break L1;
            }
            var66 = new int[param4.field_o];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param4.field_o];
            var64 = kf.field_T;
            var65 = gb.field_q;
            var63 = u.field_S;
            var13 = 0;
            L3: while (true) {
              if (~param4.field_o >= ~var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (~rb.field_t >= ~var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = al.field_b[var44];
                      var15 = param4.field_w[var14];
                      var16 = param4.field_Q[var14];
                      var17 = param4.field_P[var14];
                      if (~param4.field_e[var14] <= ~kf.field_T.length) {
                        stackOut_23_0 = -1;
                        stackIn_24_0 = stackOut_23_0;
                        break L5;
                      } else {
                        stackOut_22_0 = param4.field_e[var14];
                        stackIn_24_0 = stackOut_22_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_24_0;
                      if (kf.field_T.length <= param4.field_K[var14]) {
                        stackOut_26_0 = -1;
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = param4.field_K[var14];
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (~kf.field_T.length >= ~param4.field_x[var14]) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = param4.field_x[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (kl.field_s == null) {
                          break L9;
                        } else {
                          if (param4.field_t == null) {
                            break L9;
                          } else {
                            if (~var14 <= ~param4.field_t.length) {
                              break L9;
                            } else {
                              if (param4.field_t[var14] == -1) {
                                break L9;
                              } else {
                                if (param4.field_t[var14] >= kl.field_s.length) {
                                  break L9;
                                } else {
                                  stackOut_35_0 = kl.field_s[param4.field_t[var14]];
                                  stackIn_37_0 = stackOut_35_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = (uj) (Object) stackOut_36_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_37_0;
                        var22 = gd.field_d[var15];
                        var23 = om.field_p[var15];
                        var24 = gd.field_d[var16];
                        var25 = om.field_p[var16];
                        var26 = gd.field_d[var17];
                        var27 = om.field_p[var17];
                        if (~var19 != ~var18) {
                          break L11;
                        } else {
                          if (~var19 != ~var20) {
                            break L11;
                          } else {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_41_0 = 8355711;
                                stackIn_42_0 = stackOut_41_0;
                                break L12;
                              } else {
                                stackOut_40_0 = var21_ref.field_g;
                                stackIn_42_0 = stackOut_40_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_42_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (-16711711 & var31 * var28) >>> 8 | var28 * var32 >>> 8 & 1241579264;
                            var33 = var33 + 65793 * var29;
                            wl.a(var23, 8355711 & var33 >> 1, (byte) 102, var22, var26, var27, var24, var25);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_45_0 = var21_ref.field_g;
                          stackIn_46_0 = stackOut_45_0;
                          break L13;
                        } else {
                          stackOut_44_0 = 8355711;
                          stackIn_46_0 = stackOut_44_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_46_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (var35 * var28 & -16711770) >>> 8 | var36 * var28 >>> 8 & -1727987968;
                      var38 = var35 * var29 >>> 8 & 2080309503 | -1660879104 & var36 * var29 >>> 8;
                      var38 = var38 + 65793 * var32;
                      var39 = var30 * var36 >>> 8 & 738262784 | (-16711779 & var35 * var30) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = var39 + var33 * 65793;
                      ll.a(var23, (var38 & 65313) >> 8, var22, var39 >> 16, var24, 255 & var39, 255 & var38, 255 & var37 >> 8, -27987, 255 & var37, var27, var26, (var39 & 65402) >> 8, var37 >> 16, var38 >> 16, var25);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param2 * var63[var13] + (param6 * var64[var13] - -(param1 * var65[var13])) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_13_0 = 128 - -var14;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = 256;
                      stackIn_15_0 = stackOut_12_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = param7 * var63[var13] + (var64[var13] * param5 + param3 * var65[var13]) >> 8;
                  stackOut_15_0 = qf.field_i;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 >= 0) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (-var15 + 256) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var8;
            stackOut_49_1 = new StringBuilder().append("ai.A(").append(-4006).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
    }
}
