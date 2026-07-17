/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vk {
    static qm field_d;
    static int field_f;
    static String field_e;
    static byte[][] field_c;
    static ig field_a;
    static String[] field_b;

    final static void a(boolean param0, int param1) {
        dd.a(param0, false, (byte) 66);
        if (param1 != 841566312) {
            field_f = 7;
        }
    }

    final static void a(int param0, byte param1, ck[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param2[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param2[3].field_K;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param2[5] != null) {
                        stackOut_12_0 = param2[5].field_K;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param2[1] == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param2[1].field_C;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param2[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param2[7].field_C;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    var9 = stackIn_19_0;
                    var10 = param3 + param5;
                    var11 = param4 + param0;
                    var12 = param5 + var6_int;
                    if (param1 == 50) {
                      L6: {
                        var13 = var10 - var7;
                        var14 = param4 + var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
                          var17 = param5 + var6_int * param3 / (var7 + var6_int);
                          var16 = param5 + var6_int * param3 / (var7 + var6_int);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        if (~var18 >= ~var19) {
                          break L7;
                        } else {
                          var19 = var8 * param0 / (var8 - -var9) + param4;
                          var18 = var8 * param0 / (var8 - -var9) + param4;
                          break L7;
                        }
                      }
                      L8: {
                        hk.b(hl.field_e);
                        if (null == param2[0]) {
                          break L8;
                        } else {
                          hk.f(param5, param4, var16, var18);
                          param2[0].c(param5, param4);
                          hk.a(hl.field_e);
                          break L8;
                        }
                      }
                      L9: {
                        if (null != param2[2]) {
                          hk.f(var17, param4, var10, var18);
                          param2[2].c(var13, param4);
                          hk.a(hl.field_e);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null == param2[6]) {
                          break L10;
                        } else {
                          hk.f(param5, var19, var16, var11);
                          param2[6].c(param5, var15);
                          hk.a(hl.field_e);
                          break L10;
                        }
                      }
                      L11: {
                        if (param2[8] != null) {
                          hk.f(var17, var19, var10, var11);
                          param2[8].c(var13, var15);
                          hk.a(hl.field_e);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param2[1]) {
                          break L12;
                        } else {
                          if (param2[1].field_K == 0) {
                            break L12;
                          } else {
                            hk.f(var16, param4, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                hk.a(hl.field_e);
                                break L12;
                              } else {
                                param2[1].c(var20, param4);
                                var20 = var20 + param2[1].field_K;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (null == param2[7]) {
                          break L14;
                        } else {
                          if (param2[7].field_K != 0) {
                            hk.f(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var20 >= var13) {
                                hk.a(hl.field_e);
                                break L14;
                              } else {
                                param2[7].c(var20, var15);
                                var20 = var20 + param2[7].field_K;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (param2[3] == null) {
                          break L16;
                        } else {
                          if (param2[3].field_C == 0) {
                            break L16;
                          } else {
                            hk.f(param5, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var15 <= var20) {
                                hk.a(hl.field_e);
                                break L16;
                              } else {
                                param2[3].c(param5, var20);
                                var20 = var20 + param2[3].field_C;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (null == param2[5]) {
                          break L18;
                        } else {
                          if (param2[5].field_C != 0) {
                            hk.f(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (~var20 <= ~var15) {
                                hk.a(hl.field_e);
                                break L18;
                              } else {
                                param2[5].c(var13, var20);
                                var20 = var20 + param2[5].field_C;
                                continue L19;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        L21: {
                          if (param2[4] == null) {
                            break L21;
                          } else {
                            if (0 == param2[4].field_K) {
                              break L21;
                            } else {
                              if (param2[4].field_C != 0) {
                                hk.f(var16, var18, var17, var19);
                                var20 = var14;
                                L22: while (true) {
                                  if (var20 >= var15) {
                                    hk.a(hl.field_e);
                                    break L21;
                                  } else {
                                    var21 = var12;
                                    L23: while (true) {
                                      if (~var21 <= ~var13) {
                                        var20 = var20 + param2[4].field_C;
                                        continue L22;
                                      } else {
                                        param2[4].c(var21, var20);
                                        var21 = var21 + param2[4].field_K;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        break L20;
                      }
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("vk.A(").append(param0).append(44).append(param1).append(44);
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L24;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L24;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if (param4 >= 80) {
            stackOut_2_0 = 54;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 18 * (param4 / 20);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          var8 = 0;
          if (60 > param4) {
            var7 = var7 + vl.a(23841, 80, 40 + 18 * param3);
            break L1;
          } else {
            if (param4 < 80) {
              var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
              break L1;
            } else {
              if (param4 >= 93) {
                hk.a(-48 + param1, -2 + param5 + 54, 96, 40, 4, 65280, 100);
                break L1;
              } else {
                var8 = vl.a(23841, 80, 40 + 18 * ve.field_ic[-79 + param4]);
                break L1;
              }
            }
          }
        }
        fb.field_c[param2][0].c(-45 + param1, param5 - -72, 18, 18);
        fb.field_c[param2][0].c(param1 + -27, 72 + param5, 18, 18);
        fb.field_c[param2][0].c(-27 + param1, param5 - -54, 18, 18);
        fb.field_c[param2][0].c(36 + param1 - 45, param5 - -var7 + var8, 18, -var8 + 18);
        fb.field_c[param2][3].c(54 + (param1 + -45), var8 + param5 - -var7, 18, 18 - var8);
        fb.field_c[param2][3].c(36 + (param1 + -45), param5 - -72, 18, 18);
        fb.field_c[param2][3].c(param1 - -9, param5 - -72, 18, 18);
        fb.field_c[param2][3].c(72 + (-45 + param1), 72 + param5, 18, 18);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var4_ref_vg = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vg var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            gb.field_Pb = new int[]{0, param0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = jb.field_g.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = gb.field_Pb[9] >> 8;
                  var4 = gb.field_Pb[10] >> 8;
                  var5 = gb.field_Pb[11] >> 8;
                  var6 = gd.field_e << 4;
                  var7 = 0;
                  var8 = sk.a(var6, -58) >> 8;
                  var9 = ue.a(var6, 112) >> 8;
                  if (-1 == bh.field_g) {
                    break L2;
                  } else {
                    if (pm.field_f == -1) {
                      break L2;
                    } else {
                      var7 = -320 + bh.field_g;
                      var8 = 240 - pm.field_f;
                      var9 = -128;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = -var3 + var7;
                var13 = var8 - var4;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L3: while (true) {
                  if (jb.field_g.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= jb.field_g.length) {
                        var23[var16] = -2147483648;
                        var17 = jb.field_g[var16];
                        kc.b(8192, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (3 <= var18) {
                            on.a(true, gb.field_Pb, false, o.field_e, true, false, var17);
                            ug.a(var17, var8, var12, var7, false, var14, var9, var13);
                            var15++;
                            continue L3;
                          } else {
                            o.field_e[var18] = o.field_e[var18] + df.field_U[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_vg = jb.field_g[var3];
                var4_ref_vg.a(param0 + -14200);
                kc.b(8192, var3);
                var5 = var4_ref_vg.field_H + var4_ref_vg.field_f >> 1;
                var6 = var4_ref_vg.field_b - -var4_ref_vg.field_n >> 1;
                var7 = var4_ref_vg.field_i + var4_ref_vg.field_a >> 1;
                var8 = gb.field_Pb[9] >> 2;
                var9 = gb.field_Pb[10] >> 2;
                var10_int = gb.field_Pb[11] >> 2;
                var11 = var9 * o.field_e[4] + (o.field_e[3] * var8 - -(var10_int * o.field_e[5])) >> 14;
                var12 = var8 * o.field_e[6] + var9 * o.field_e[7] - -(o.field_e[8] * var10_int) >> 14;
                var13 = var10_int * o.field_e[11] + var9 * o.field_e[10] + var8 * o.field_e[9] >> 14;
                var2[var3] = var6 * var12 + var5 * var11 - -(var7 * var13) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "vk.C(" + param0 + 41);
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_25_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (param1 != 3) {
              if (6 != param1) {
                if (7 != param1) {
                  if (param1 == 8) {
                    stackOut_11_0 = pm.field_a;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    if (param1 == 9) {
                      stackOut_15_0 = el.field_I;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (param1 != 10) {
                        if (param1 != 11) {
                          if (param1 == 14) {
                            stackOut_25_0 = cm.a((byte) 119, pd.field_c, new String[1]);
                            stackIn_26_0 = stackOut_25_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_21_0 = dc.field_i;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      } else {
                        stackOut_18_0 = kb.field_b;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                } else {
                  stackOut_7_0 = qn.field_pb;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = (String) field_e;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = rk.field_U;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("vk.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_26_0;
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if (id.field_P >= 3) {
              break L1;
            } else {
              L2: {
                if (te.field_p < 2) {
                  break L2;
                } else {
                  if (!bj.field_d[12]) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (ph.n(-30146)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              var2 = stackIn_8_0;
              var3 = rg.field_f;
              wj.a(var2, -118, false, 1, param0, var3);
              break L0;
            }
          }
          pn.a(false, true, true);
          break L0;
        }
        L4: {
          if (param1 <= -29) {
            break L4;
          } else {
            vk.a(-124);
            break L4;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qm(9, 0, 4, 1);
        field_e = "This game is full.";
        field_c = new byte[250][];
        field_b = new String[]{"Move left:", "Move right:", "Rotate left:", "Rotate right:", "or", "Drop shape:", "Leaderboard:"};
    }
}
