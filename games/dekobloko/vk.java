/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (-1 <= (param3 ^ -1)) {
                  break L1;
                } else {
                  if (-1 <= (param0 ^ -1)) {
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
                        if (var18 <= var19) {
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
                          if (-1 == (param2[1].field_K ^ -1)) {
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
                                if (var22 != 0) {
                                  break L12;
                                } else {
                                  continue L13;
                                }
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
                                if (var22 != 0) {
                                  break L14;
                                } else {
                                  continue L15;
                                }
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
                                if (var22 != 0) {
                                  break L16;
                                } else {
                                  continue L17;
                                }
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
                              if (var20 >= var15) {
                                hk.a(hl.field_e);
                                break L18;
                              } else {
                                param2[5].c(var13, var20);
                                var20 = var20 + param2[5].field_C;
                                if (var22 != 0) {
                                  break L18;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (param2[4] == null) {
                          break L20;
                        } else {
                          if (0 == param2[4].field_K) {
                            break L20;
                          } else {
                            if (param2[4].field_C != 0) {
                              hk.f(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  hk.a(hl.field_e);
                                  break L20;
                                } else {
                                  if (var22 != 0) {
                                    break L20;
                                  } else {
                                    var21 = var12;
                                    L22: while (true) {
                                      L23: {
                                        if (var21 >= var13) {
                                          var20 = var20 + param2[4].field_C;
                                          break L23;
                                        } else {
                                          param2[4].c(var21, var20);
                                          var21 = var21 + param2[4].field_K;
                                          if (var22 != 0) {
                                            break L23;
                                          } else {
                                            continue L22;
                                          }
                                        }
                                      }
                                      continue L21;
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
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var6);
            stackOut_86_1 = new StringBuilder().append("vk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param2 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L24;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L24;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param6 != -22981) {
          return;
        } else {
          L0: {
            if ((param4 ^ -1) <= -81) {
              stackOut_3_0 = 54;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 18 * (param4 / 20);
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            L2: {
              var7 = stackIn_4_0;
              var8 = 0;
              if (60 > param4) {
                break L2;
              } else {
                L3: {
                  if (-81 < (param4 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (-94 >= (param4 ^ -1)) {
                        break L4;
                      } else {
                        var8 = vl.a(23841, 80, 40 + 18 * ve.field_ic[-79 + param4]);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    hk.a(-48 + param1, -2 + param5 + 54, 96, 40, 4, 65280, 100);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                if (var9 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var7 = var7 + vl.a(param6 ^ -1254, 80, 40 + 18 * param3);
            break L1;
          }
          fb.field_c[param2][0].c(-45 + param1, param5 - -72, 18, 18);
          fb.field_c[param2][0].c(param1 + -27, 72 + param5, 18, 18);
          fb.field_c[param2][0].c(-27 + param1, param5 - -54, 18, 18);
          fb.field_c[param2][0].c(36 + param1 - 45, param5 - -var7 + var8, 18, -var8 + 18);
          fb.field_c[param2][3].c(54 + (param1 + -45), var8 + param5 - -var7, 18, 18 - var8);
          fb.field_c[param2][3].c(36 + (param1 + -45), param5 - -72, 18, 18);
          fb.field_c[param2][3].c(param1 - -9, param5 - -72, 18, 18);
          fb.field_c[param2][3].c(72 + (-45 + param1), 72 + param5, 18, 18);
          return;
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
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
        vg var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            gb.field_Pb = new int[]{0, param0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = jb.field_g.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var1_int <= var3) {
                  var3 = gb.field_Pb[9] >> -1155241432;
                  break L2;
                } else {
                  var4_ref_vg = jb.field_g[var3];
                  var17 = var4_ref_vg;
                  var17 = var4_ref_vg;
                  var4_ref_vg.a(param0 + -14200);
                  kc.b(8192, var3);
                  var5 = var4_ref_vg.field_H + var4_ref_vg.field_f >> -585987071;
                  var6 = var4_ref_vg.field_b - -var4_ref_vg.field_n >> -1997616223;
                  var7 = var4_ref_vg.field_i + var4_ref_vg.field_a >> -1541714015;
                  var8 = gb.field_Pb[9] >> 849399746;
                  var9 = gb.field_Pb[10] >> -765538462;
                  var10_int = gb.field_Pb[11] >> -1876878686;
                  var11 = var9 * o.field_e[4] + (o.field_e[3] * var8 - -(var10_int * o.field_e[5])) >> -385907858;
                  var12 = var8 * o.field_e[6] + var9 * o.field_e[7] - -(o.field_e[8] * var10_int) >> -169876850;
                  var13 = var10_int * o.field_e[11] + var9 * o.field_e[10] + var8 * o.field_e[9] >> 268344750;
                  var2[var3] = var6 * var12 + var5 * var11 - -(var7 * var13) >> -8557136;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = gb.field_Pb[10] >> -465257400;
                var5 = gb.field_Pb[11] >> 2107408328;
                var6 = gd.field_e << -1099401052;
                var7 = 0;
                var8 = sk.a(var6, -58) >> 1652838728;
                var9 = ue.a(var6, 112) >> 841566312;
                if (-1 == bh.field_g) {
                  break L3;
                } else {
                  if (0 == (pm.field_f ^ -1)) {
                    break L3;
                  } else {
                    var7 = -320 + bh.field_g;
                    var8 = 240 - pm.field_f;
                    var9 = -128;
                    break L3;
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
              L4: while (true) {
                stackOut_11_0 = jb.field_g.length;
                stackOut_11_1 = var15;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                L5: while (true) {
                  L6: {
                    if (stackIn_12_0 <= stackIn_12_1) {
                      break L6;
                    } else {
                      var16 = 0;
                      if (var19 != 0) {
                        break L6;
                      } else {
                        var17_int = 1;
                        L7: while (true) {
                          L8: {
                            if (var17_int >= jb.field_g.length) {
                              break L8;
                            } else {
                              stackOut_16_0 = var21[var16];
                              stackOut_16_1 = var21[var17_int];
                              stackIn_12_0 = stackOut_16_0;
                              stackIn_12_1 = stackOut_16_1;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              if (var19 != 0) {
                                continue L5;
                              } else {
                                L9: {
                                  if (stackIn_17_0 < stackIn_17_1) {
                                    var16 = var17_int;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var17_int++;
                                if (var19 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var21[var16] = -2147483648;
                          var17 = jb.field_g[var16];
                          kc.b(8192, var16);
                          var18 = 0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (3 <= var18) {
                                  break L12;
                                } else {
                                  o.field_e[var18] = o.field_e[var18] + df.field_U[var15][var18];
                                  var18++;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              on.a(true, gb.field_Pb, false, o.field_e, true, false, var17);
                              ug.a(var17, var8, var12, var7, false, var14, var9, var13);
                              var15++;
                              break L11;
                            }
                            if (var19 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_27_0 = null;
        String stackOut_23_0 = null;
        String stackOut_20_0 = null;
        String stackOut_9_0 = null;
        String stackOut_6_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_c = (byte[][]) null;
                break L1;
              }
            }
            if (-4 != (param1 ^ -1)) {
              if (6 != param1) {
                if (7 != param1) {
                  if ((param1 ^ -1) == -9) {
                    stackOut_13_0 = pm.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 == 9) {
                      stackOut_17_0 = el.field_I;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param1 != 10) {
                        if ((param1 ^ -1) != -12) {
                          if (-15 == (param1 ^ -1)) {
                            stackOut_27_0 = cm.a((byte) 119, pd.field_c, new String[]{param0});
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_23_0 = dc.field_i;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_20_0 = kb.field_b;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = qn.field_pb;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = (String) (field_e);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = rk.field_U;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("vk.B(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L2;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          L1: {
            L2: {
              if ((id.field_P ^ -1) <= -4) {
                break L2;
              } else {
                if ((te.field_p ^ -1) > -3) {
                  break L1;
                } else {
                  if (!bj.field_d[12]) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            pn.a(false, true, true);
            if (!client.field_A) {
              break L0;
            } else {
              break L1;
            }
          }
          L3: {
            if (ph.n(-30146)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            } else {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L3;
            }
          }
          var2 = stackIn_9_0;
          var3 = rg.field_f;
          wj.a(var2, -118, false, 1, param0, var3);
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
        field_c = (byte[][]) null;
        field_e = null;
        if (param0 != -93) {
            vk.a(true, -94);
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_d = new qm(9, 0, 4, 1);
        field_e = "This game is full.";
        field_c = new byte[250][];
        field_b = new String[]{"Move left:", "Move right:", "Rotate left:", "Rotate right:", "or", "Drop shape:", "Leaderboard:"};
    }
}
