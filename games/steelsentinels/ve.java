/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ve {
    static pl field_b;
    static jg field_a;

    public static void b(byte param0) {
        field_a = null;
        int var1 = 9;
        field_b = null;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              L1: {
                if ((param0[param2 >> 5] & 1 << (31 & param2)) == 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ve.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte param0) {
        pa.field_d = new sf[17];
        pa.field_d[0] = new sf(0, 170, 170, 300, 0, (wk) null, true);
        pa.field_d[1] = new sf(1, 224, 110, 200, 0, (wk) null, false);
        pa.field_d[2] = new sf(2, 224, 86, 400, 0, (wk) null, true);
        pa.field_d[3] = new sf(3, 224, 60, 200, 0, (wk) null, false);
        pa.field_d[4] = new sf(4, 224, 60, 285, 0, (wk) null, false);
        pa.field_d[5] = new sf(5, 224, 60, 200, 0, (wk) null, false);
        pa.field_d[6] = new sf(6, 224, 60, 285, 0, (wk) null, false);
        pa.field_d[7] = new sf(7, 224, 120, 200, 0, (wk) null, false);
        pa.field_d[8] = new sf(8, 224, 86, 285, 0, (wk) null, false);
        pa.field_d[9] = new sf(9, 170, 86, 300, 0, (wk) null, true);
        pa.field_d[10] = new sf(10, 224, 60, 200, 0, (wk) null, false);
        pa.field_d[11] = new sf(11, 224, 60, 285, 0, (wk) null, false);
        pa.field_d[12] = new sf(12, 224, 100, 285, 0, b.field_q[2], false);
        pa.field_d[13] = new sf(13, 170, 174, 300, 0, (wk) null, true);
        pa.field_d[14] = new sf(14, 224, 60, 200, 0, (wk) null, false);
        pa.field_d[15] = new sf(15, 224, 60, 400, 0, b.field_q[2], false);
        pa.field_d[16] = new sf(16, 170, 170, 300, 0, (wk) null, true);
    }

    final static boolean a(byte param0, int param1) {
        try {
            if (param0 > -84) {
                Object var3 = null;
                ve.a(-78, (byte[]) null);
            }
            if (rf.field_d.field_p >= param1) {
                return true;
            }
            if (!(rb.field_h != null)) {
                return false;
            }
            int var2_int = rb.field_h.a(-119);
            if (var2_int > 0) {
                if (!(var2_int <= -rf.field_d.field_p + param1)) {
                    var2_int = -rf.field_d.field_p + param1;
                }
                rb.field_h.a(rf.field_d.field_p, var2_int, rf.field_d.field_t, -256);
                oe.field_b = mm.a(-100);
                rf.field_d.field_p = rf.field_d.field_p + var2_int;
                if (rf.field_d.field_p < param1) {
                    return false;
                }
                rf.field_d.field_p = 0;
                return true;
            }
            {
                if (0 <= var2_int) {
                    if (ki.l(150) <= 30000L) {
                        return false;
                    }
                }
                pm.m(-125);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gi var16 = null;
        gi var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            var16 = new gi(param1);
            var17 = var16;
            var17.field_p = param1.length + -2;
            rl.field_d = var17.c((byte) -60);
            ca.field_r = new int[rl.field_d];
            oa.field_M = new int[rl.field_d];
            le.field_L = new int[rl.field_d];
            pd.field_U = new boolean[rl.field_d];
            dl.field_L = new byte[rl.field_d][];
            rl.field_a = new int[rl.field_d];
            sn.field_g = new byte[rl.field_d][];
            var17.field_p = -(8 * rl.field_d) + -7 + param1.length;
            un.field_n = var17.c((byte) -60);
            eb.field_n = var17.c((byte) -60);
            var3 = (255 & var17.f((byte) -114)) - -1;
            var4 = 0;
            if (param0 == 16) {
              L1: while (true) {
                if (var4 >= rl.field_d) {
                  var4 = 0;
                  L2: while (true) {
                    if (rl.field_d <= var4) {
                      var4 = 0;
                      L3: while (true) {
                        if (rl.field_d <= var4) {
                          var4 = 0;
                          L4: while (true) {
                            if (var4 >= rl.field_d) {
                              var17.field_p = -(8 * rl.field_d) + (-7 + param1.length + -(3 * (var3 - 1)));
                              ba.field_d = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if (var3 <= var4) {
                                  var17.field_p = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (var4 >= rl.field_d) {
                                      break L0;
                                    } else {
                                      L7: {
                                        var5 = le.field_L[var4];
                                        var6 = ca.field_r[var4];
                                        var7 = var6 * var5;
                                        var24 = new byte[var7];
                                        var22 = var24;
                                        var20 = var22;
                                        var18 = var20;
                                        var8 = var18;
                                        dl.field_L[var4] = var24;
                                        var25 = new byte[var7];
                                        var23 = var25;
                                        var21 = var23;
                                        var19 = var21;
                                        var9 = var19;
                                        sn.field_g[var4] = var25;
                                        var10 = 0;
                                        var11 = var17.f((byte) -121);
                                        if ((1 & var11) != 0) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var12 >= var5) {
                                              if (0 == (var11 & 2)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L9: while (true) {
                                                  if (var5 <= var12) {
                                                    break L7;
                                                  } else {
                                                    var13 = 0;
                                                    L10: while (true) {
                                                      if (var6 <= var13) {
                                                        var12++;
                                                        continue L9;
                                                      } else {
                                                        L11: {
                                                          byte dupTemp$2 = var17.d((byte) -2);
                                                          var9[var13 * var5 + var12] = dupTemp$2;
                                                          var14 = dupTemp$2;
                                                          stackOut_44_0 = var10;
                                                          stackIn_46_0 = stackOut_44_0;
                                                          stackIn_45_0 = stackOut_44_0;
                                                          if (var14 == -1) {
                                                            stackOut_46_0 = stackIn_46_0;
                                                            stackOut_46_1 = 0;
                                                            stackIn_47_0 = stackOut_46_0;
                                                            stackIn_47_1 = stackOut_46_1;
                                                            break L11;
                                                          } else {
                                                            stackOut_45_0 = stackIn_45_0;
                                                            stackOut_45_1 = 1;
                                                            stackIn_47_0 = stackOut_45_0;
                                                            stackIn_47_1 = stackOut_45_1;
                                                            break L11;
                                                          }
                                                        }
                                                        var10 = stackIn_47_0 | stackIn_47_1;
                                                        var13++;
                                                        continue L10;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var13 = 0;
                                              L12: while (true) {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  var8[var12 - -(var13 * var5)] = var17.d((byte) -2);
                                                  var13++;
                                                  continue L12;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var12 = 0;
                                          L13: while (true) {
                                            if (var12 >= var7) {
                                              if ((2 & var11) != 0) {
                                                var12 = 0;
                                                L14: while (true) {
                                                  if (var7 <= var12) {
                                                    break L7;
                                                  } else {
                                                    L15: {
                                                      byte dupTemp$3 = var17.d((byte) -2);
                                                      var9[var12] = dupTemp$3;
                                                      var13 = dupTemp$3;
                                                      stackOut_29_0 = var10;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_30_0 = stackOut_29_0;
                                                      if (-1 == var13) {
                                                        stackOut_31_0 = stackIn_31_0;
                                                        stackOut_31_1 = 0;
                                                        stackIn_32_0 = stackOut_31_0;
                                                        stackIn_32_1 = stackOut_31_1;
                                                        break L15;
                                                      } else {
                                                        stackOut_30_0 = stackIn_30_0;
                                                        stackOut_30_1 = 1;
                                                        stackIn_32_0 = stackOut_30_0;
                                                        stackIn_32_1 = stackOut_30_1;
                                                        break L15;
                                                      }
                                                    }
                                                    var10 = stackIn_32_0 | stackIn_32_1;
                                                    var12++;
                                                    continue L14;
                                                  }
                                                }
                                              } else {
                                                break L7;
                                              }
                                            } else {
                                              var8[var12] = var17.d((byte) -2);
                                              var12++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      pd.field_U[var4] = var10 != 0;
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L16: {
                                    ba.field_d[var4] = var17.a(false);
                                    if (ba.field_d[var4] != 0) {
                                      break L16;
                                    } else {
                                      ba.field_d[var4] = 1;
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              ca.field_r[var4] = var17.c((byte) -60);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          le.field_L[var4] = var17.c((byte) -60);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      oa.field_M[var4] = var17.c((byte) -60);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  rl.field_a[var4] = var16.c((byte) -60);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("ve.C(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    final static pe a(int param0, kj param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pe var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pe stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            var3 = 110 / ((-37 - param0) / 57);
            var2_int = param1.g(-72, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var4 = he.a(-1766, param1) ? 1 : 0;
                var5 = he.a(-1766, param1) ? 1 : 0;
                var6 = new pe();
                var6.field_L = (short)param1.g(71, 16);
                var6.field_z = s.a(var6.field_z, 16, param1, false);
                var6.field_m = s.a(var6.field_m, 16, param1, false);
                var6.field_C = s.a(var6.field_C, 16, param1, false);
                var6.field_w = (short)param1.g(95, 16);
                var6.field_G = s.a(var6.field_G, 16, param1, false);
                var6.field_j = s.a(var6.field_j, 16, param1, false);
                var6.field_x = s.a(var6.field_x, 16, param1, false);
                if (var4 != 0) {
                  var6.field_u = (short)param1.g(-113, 16);
                  var6.field_g = s.a(var6.field_g, 16, param1, false);
                  var6.field_H = s.a(var6.field_H, 16, param1, false);
                  var6.field_F = s.a(var6.field_F, 16, param1, false);
                  var6.field_M = s.a(var6.field_M, 16, param1, false);
                  var6.field_V = s.a(var6.field_V, 16, param1, false);
                  var6.field_T = s.a(var6.field_T, 16, param1, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5 != 0) {
                  int discarded$1 = param1.g(-113, 16);
                  var6.field_y = s.a(var6.field_y, 16, param1, false);
                  var6.field_i = s.a(var6.field_i, 16, param1, false);
                  var6.field_E = s.a(var6.field_E, 16, param1, false);
                  var6.field_k = s.a(var6.field_k, 16, param1, false);
                  var6.field_Y = s.a(var6.field_Y, 16, param1, false);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!he.a(-1766, param1)) {
                  break L3;
                } else {
                  var6.field_e = s.a(var6.field_e, 16, param1, false);
                  break L3;
                }
              }
              L4: {
                if (he.a(-1766, param1)) {
                  var6.field_P = ec.a(16, param1, var6.field_P, -13035);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var6.field_P.length <= var8) {
                      if (var7 != 0) {
                        var6.field_K = (byte)(1 + var7);
                        break L4;
                      } else {
                        var6.field_P = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var6.field_P[var8] & 255) <= var7) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_22_0 = (pe) var6;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("ve.G(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (0 > param1) {
              break L1;
            } else {
              if (param1 < 65536) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 += 16;
          param1 = param1 >>> 16;
          break L0;
        }
        L2: {
          if (param1 >= 256) {
            param1 = param1 >>> 8;
            var2 += 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 >= 16) {
            var2 += 4;
            param1 = param1 >>> 4;
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 <= -75) {
          L4: {
            if (param1 >= 4) {
              param1 = param1 >>> 2;
              var2 += 2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param1 < 1) {
              break L5;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L5;
            }
          }
          return var2 + param1;
        } else {
          return 61;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
