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
        int var6 = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = client.field_A ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (-1 <= param3) {
              break L0;
            } else {
              if (-1 >= param0) {
                break L0;
              } else {
                L1: {
                  if (null == param2[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param2[3].field_K;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param2[5] != null) {
                    stackOut_11_0 = param2[5].field_K;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (param2[1] == null) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param2[1].field_C;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param2[7] == null) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param2[7].field_C;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                var9 = stackIn_18_0;
                var10 = param3 + param5;
                var11 = param4 + param0;
                var12 = param5 + var6;
                if (param1 == 50) {
                  L5: {
                    var13 = var10 - var7;
                    var14 = param4 + var8;
                    var15 = -var9 + var11;
                    var16 = var12;
                    var17 = var13;
                    if (var16 > var17) {
                      var17 = param5 + var6 * param3 / (var7 + var6);
                      var16 = param5 + var6 * param3 / (var7 + var6);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var18 = var14;
                    var19 = var15;
                    if (var18 <= var19) {
                      break L6;
                    } else {
                      var19 = var8 * param0 / (var8 - -var9) + param4;
                      var18 = var8 * param0 / (var8 - -var9) + param4;
                      break L6;
                    }
                  }
                  L7: {
                    hk.b(hl.field_e);
                    if (null == param2[0]) {
                      break L7;
                    } else {
                      hk.f(param5, param4, var16, var18);
                      param2[0].c(param5, param4);
                      hk.a(hl.field_e);
                      break L7;
                    }
                  }
                  L8: {
                    if (null != param2[2]) {
                      hk.f(var17, param4, var10, var18);
                      param2[2].c(var13, param4);
                      hk.a(hl.field_e);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (null == param2[6]) {
                      break L9;
                    } else {
                      hk.f(param5, var19, var16, var11);
                      param2[6].c(param5, var15);
                      hk.a(hl.field_e);
                      break L9;
                    }
                  }
                  L10: {
                    if (param2[8] != null) {
                      hk.f(var17, var19, var10, var11);
                      param2[8].c(var13, var15);
                      hk.a(hl.field_e);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (null == param2[1]) {
                      break L11;
                    } else {
                      if (-1 == (param2[1].field_K ^ -1)) {
                        break L11;
                      } else {
                        hk.f(var16, param4, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              param2[1].c(var20, param4);
                              var20 = var20 + param2[1].field_K;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          hk.a(hl.field_e);
                          break L11;
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
                          L16: {
                            if (var20 >= var13) {
                              break L16;
                            } else {
                              param2[7].c(var20, var15);
                              var20 = var20 + param2[7].field_K;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          hk.a(hl.field_e);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    if (param2[3] == null) {
                      break L17;
                    } else {
                      if (param2[3].field_C == 0) {
                        break L17;
                      } else {
                        hk.f(param5, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var15 <= var20) {
                              break L19;
                            } else {
                              param2[3].c(param5, var20);
                              var20 = var20 + param2[3].field_C;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          hk.a(hl.field_e);
                          break L17;
                        }
                      }
                    }
                  }
                  L20: {
                    if (null == param2[5]) {
                      break L20;
                    } else {
                      if (param2[5].field_C != 0) {
                        hk.f(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var20 >= var15) {
                              break L22;
                            } else {
                              param2[5].c(var13, var20);
                              var20 = var20 + param2[5].field_C;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          hk.a(hl.field_e);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (param2[4] == null) {
                      break L23;
                    } else {
                      if (0 == param2[4].field_K) {
                        break L23;
                      } else {
                        if (param2[4].field_C != 0) {
                          hk.f(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var20 >= var15) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var21 >= var13) {
                                      break L27;
                                    } else {
                                      param2[4].c(var21, var20);
                                      var21 = var21 + param2[4].field_K;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param2[4].field_C;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            hk.a(hl.field_e);
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  return;
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param6 == -22981) {
          L0: {
            if (param4 <= -81) {
              stackOut_4_0 = 54;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 18 * (param4 / 20);
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            var8 = 0;
            if (60 > param4) {
              var7 = var7 + vl.a(param6 ^ -1254, 80, 40 + 18 * param3);
              break L1;
            } else {
              if (-81 > param4) {
                var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                break L1;
              } else {
                if (-94 >= (param4 ^ -1)) {
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
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
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
        int var17_int = 0;
        vg var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = client.field_A ? 1 : 0;
        gb.field_Pb = new int[]{0, param0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = jb.field_g.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = gb.field_Pb[9] >> -1155241432;
              var4 = gb.field_Pb[10] >> -465257400;
              var5 = gb.field_Pb[11] >> 2107408328;
              var6 = gd.field_e << -1099401052;
              var7 = 0;
              var8 = sk.a(var6, -58) >> 1652838728;
              var9 = ue.a(var6, 112) >> 841566312;
              if (-1 == bh.field_g) {
                break L1;
              } else {
                if (0 == (pm.field_f ^ -1)) {
                  break L1;
                } else {
                  var7 = -320 + bh.field_g;
                  var8 = 240 - pm.field_f;
                  var9 = -128;
                  break L1;
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
            L2: while (true) {
              if (jb.field_g.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (var17_int >= jb.field_g.length) {
                    var23[var16] = -2147483648;
                    var17 = jb.field_g[var16];
                    kc.b(8192, var16);
                    var18 = 0;
                    L4: while (true) {
                      if (3 <= var18) {
                        on.a(true, gb.field_Pb, false, o.field_e, true, false, var17);
                        ug.a(var17, var8, var12, var7, false, var14, var9, var13);
                        var15++;
                        continue L2;
                      } else {
                        o.field_e[var18] = o.field_e[var18] + df.field_U[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_vg = jb.field_g[var3];
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
            continue L0;
          }
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        if (!param2) {
            field_c = null;
        }
        if (-4 == (param1 ^ -1)) {
            return rk.field_U;
        }
        if (6 == param1) {
            return field_e;
        }
        if (7 == param1) {
            return qn.field_pb;
        }
        if (!((param1 ^ -1) != -9)) {
            return pm.field_a;
        }
        if (!(param1 != 9)) {
            return el.field_I;
        }
        if (param1 == 10) {
            return kb.field_b;
        }
        if (param1 == -12) {
            return dc.field_i;
        }
        if (-15 != param1) {
            return null;
        }
        return cm.a((byte) 119, pd.field_c, new String[1]);
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if ((id.field_P ^ -1) <= -4) {
              break L1;
            } else {
              L2: {
                if ((te.field_p ^ -1) > -3) {
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
        if (param0 != -93) {
            vk.a(true, -94);
        }
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
