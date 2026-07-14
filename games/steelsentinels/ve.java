/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ve {
    static pl field_b;
    static jg field_a;

    public static void b(byte param0) {
        field_a = null;
        int var1 = -9 / ((param0 - 36) / 56);
        field_b = null;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 1) {
          return false;
        } else {
          L0: {
            if (-1 == (param0[param2 >> 509118245] & 1 << (31 & param2) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0) {
        pa.field_d = new sf[17];
        pa.field_d[0] = new sf(0, 170, 170, 300, 0, (wk) null, true);
        if (param0 != 122) {
          return;
        } else {
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
          return;
        }
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
            try {
                if (false) throw (IOException) null;
                if (0 <= var2_int) {
                    if (-30001L <= (ki.l(150) ^ -1L)) {
                        return false;
                    }
                }
                pm.m(-125);
            } catch (IOException iOException) {
                pm.m(-40);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte[] param1) {
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
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = SteelSentinels.field_G;
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
          L0: while (true) {
            L1: {
              if (var4 >= rl.field_d) {
                break L1;
              } else {
                rl.field_a[var4] = var16.c((byte) -60);
                var4++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (rl.field_d <= var4) {
                  break L3;
                } else {
                  oa.field_M[var4] = var16.c((byte) -60);
                  var4++;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                L5: {
                  if (rl.field_d <= var4) {
                    break L5;
                  } else {
                    le.field_L[var4] = var16.c((byte) -60);
                    var4++;
                    if (0 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var4 = 0;
                L6: while (true) {
                  L7: {
                    if (var4 >= rl.field_d) {
                      break L7;
                    } else {
                      ca.field_r[var4] = var16.c((byte) -60);
                      var4++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var17.field_p = -(8 * rl.field_d) + (-7 + param1.length + -(3 * (var3 - 1)));
                  ba.field_d = new int[var3];
                  var4 = 1;
                  L8: while (true) {
                    L9: {
                      if (var3 <= var4) {
                        break L9;
                      } else {
                        L10: {
                          ba.field_d[var4] = var16.a(false);
                          if (ba.field_d[var4] != 0) {
                            break L10;
                          } else {
                            ba.field_d[var4] = 1;
                            break L10;
                          }
                        }
                        var4++;
                        if (0 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var17.field_p = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (var4 >= rl.field_d) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
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
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var12 >= var7) {
                                      break L16;
                                    } else {
                                      var8[var12] = var16.d((byte) -2);
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if (-1 != (2 & var11 ^ -1)) {
                                    var12 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var7 <= var12) {
                                          break L18;
                                        } else {
                                          L19: {
                                            var9[var12] = var16.d((byte) -2);
                                            var13 = var16.d((byte) -2);
                                            stackOut_33_0 = var10;
                                            stackIn_35_0 = stackOut_33_0;
                                            stackIn_34_0 = stackOut_33_0;
                                            if (-1 == var13) {
                                              stackOut_35_0 = stackIn_35_0;
                                              stackOut_35_1 = 0;
                                              stackIn_36_0 = stackOut_35_0;
                                              stackIn_36_1 = stackOut_35_1;
                                              break L19;
                                            } else {
                                              stackOut_34_0 = stackIn_34_0;
                                              stackOut_34_1 = 1;
                                              stackIn_36_0 = stackOut_34_0;
                                              stackIn_36_1 = stackOut_34_1;
                                              break L19;
                                            }
                                          }
                                          var10 = stackIn_36_0 | stackIn_36_1;
                                          var12++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var12 = 0;
                            L20: while (true) {
                              L21: {
                                if (var12 >= var5) {
                                  break L21;
                                } else {
                                  var13 = 0;
                                  L22: while (true) {
                                    L23: {
                                      if (var6 <= var13) {
                                        break L23;
                                      } else {
                                        var8[var12 - -(var13 * var5)] = var16.d((byte) -2);
                                        var13++;
                                        if (0 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              stackOut_45_0 = 0;
                              stackOut_45_1 = var11 & 2;
                              stackIn_47_0 = stackOut_45_0;
                              stackIn_47_1 = stackOut_45_1;
                              if (stackIn_47_0 == stackIn_47_1) {
                                break L13;
                              } else {
                                var12 = 0;
                                L24: while (true) {
                                  if (var5 <= var12) {
                                    break L13;
                                  } else {
                                    var13 = 0;
                                    L25: while (true) {
                                      L26: {
                                        if (var6 <= var13) {
                                          break L26;
                                        } else {
                                          L27: {
                                            var9[var13 * var5 + var12] = var16.d((byte) -2);
                                            var14 = var16.d((byte) -2);
                                            stackOut_52_0 = var10;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_53_0 = stackOut_52_0;
                                            if (0 == (var14 ^ -1)) {
                                              stackOut_54_0 = stackIn_54_0;
                                              stackOut_54_1 = 0;
                                              stackIn_55_0 = stackOut_54_0;
                                              stackIn_55_1 = stackOut_54_1;
                                              break L27;
                                            } else {
                                              stackOut_53_0 = stackIn_53_0;
                                              stackOut_53_1 = 1;
                                              stackIn_55_0 = stackOut_53_0;
                                              stackIn_55_1 = stackOut_53_1;
                                              break L27;
                                            }
                                          }
                                          var10 = stackIn_55_0 | stackIn_55_1;
                                          var13++;
                                          if (0 == 0) {
                                            continue L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L24;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          pd.field_U[var4] = var10 != 0;
                          var4++;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static pe a(int param0, kj param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pe var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.field_G;
        var3 = 110 / ((-37 - param0) / 57);
        var2 = param1.g(-72, 8);
        if ((var2 ^ -1) < -1) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
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
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var5 != 0) {
              int discarded$1 = param1.g(-113, 16);
              var6.field_y = s.a(var6.field_y, 16, param1, false);
              var6.field_i = s.a(var6.field_i, 16, param1, false);
              var6.field_E = s.a(var6.field_E, 16, param1, false);
              var6.field_k = s.a(var6.field_k, 16, param1, false);
              var6.field_Y = s.a(var6.field_Y, 16, param1, false);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!he.a(-1766, param1)) {
              break L2;
            } else {
              var6.field_e = s.a(var6.field_e, 16, param1, false);
              break L2;
            }
          }
          L3: {
            if (he.a(-1766, param1)) {
              var6.field_P = ec.a(16, param1, var6.field_P, -13035);
              var7 = 0;
              var8 = 0;
              L4: while (true) {
                if (var6.field_P.length <= var8) {
                  if (var7 != 0) {
                    var6.field_K = (byte)(1 + var7);
                    break L3;
                  } else {
                    var6.field_P = null;
                    break L3;
                  }
                } else {
                  if ((var6.field_P[var8] & 255) > var7) {
                    var7 = var6.field_P[var8] & 255;
                    var8++;
                    continue L4;
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return var6;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (0 > param1) {
              break L1;
            } else {
              if ((param1 ^ -1) > -65537) {
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
          if (param1 <= -257) {
            param1 = param1 >>> 8;
            var2 += 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-17 <= param1) {
            var2 += 4;
            param1 = param1 >>> 4;
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 > -75) {
          return 61;
        } else {
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
            if (-2 < (param1 ^ -1)) {
              break L5;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L5;
            }
          }
          return var2 + param1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
