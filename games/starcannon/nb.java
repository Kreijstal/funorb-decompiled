/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static java.awt.Color field_d;
    static qe field_c;
    static float field_a;
    static qe field_b;
    static df field_f;
    static int field_g;
    static ka field_e;

    final static void a(ue param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ia var8 = null;
        int var9 = 0;
        ia var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            var8 = new ia(param0.a("logo.fo3d", (byte) -119, ""));
            var10 = var8;
            var3 = var10.j(7909);
            var10.c(true);
            uc.field_d = sb.a(var10, (byte) 107);
            ci.field_g = new lb[var3];
            ck.field_h = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                L2: {
                  var10.l(118);
                  if (param1 > 87) {
                    break L2;
                  } else {
                    nb.a(-75);
                    break L2;
                  }
                }
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = ci.field_g[var9];
                    var5.a(1, 6, 6, 6, (byte) -72);
                    var5.c((byte) -3);
                    var6 = new int[]{var5.field_p + var5.field_M >> -1357729343, var5.field_w + var5.field_F >> -903615967, var5.field_k - -var5.field_v >> 1228976385};
                    ck.field_h[var9] = var6;
                    var5.a(-var6[0], -var6[2], (byte) -30, -var6[1]);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                ci.field_g[var4] = vh.a(var8, 102);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("nb.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var10 = null;
        int[] var10_array = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var25 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (w.field_r == null) {
                  break L2;
                } else {
                  if (param9 > w.field_r.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ui.field_r = new int[param9];
              w.field_r = new int[param9];
              mc.field_j = new int[param9];
              break L1;
            }
            L3: {
              var31 = w.field_r;
              var27 = var31;
              var26 = var27;
              var34 = var26;
              var30 = var34;
              var10_array = var30;
              var32 = ui.field_r;
              var28 = var32;
              var11 = var28;
              var33 = mc.field_j;
              var29 = var33;
              var12 = var29;
              ug.a(var31, 0, param9);
              ug.a(var32, 0, param9);
              ug.a(var33, 0, param9);
              var13 = param5 / (1 + param7 * 2);
              var14 = param0 + -param7;
              if (-1 >= (var14 ^ -1)) {
                break L3;
              } else {
                var14 = 0;
                break L3;
              }
            }
            L4: {
              var15 = var14 * ki.field_j + param2;
              var16 = param7 + param0;
              var17 = 0;
              if (ki.field_f > var16) {
                break L4;
              } else {
                var17 = var16 + (-ki.field_f + 1);
                var16 = -1 + ki.field_f;
                break L4;
              }
            }
            var18 = 1 + (-var14 + var16);
            L5: while (true) {
              if (var14 > var16) {
                var15 = var15 + var17 * ki.field_j;
                var19 = 0;
                L6: while (true) {
                  if (param9 <= var19) {
                    L7: {
                      var14 = -param8 + 1;
                      param6 = param6 + param1;
                      var19 = 1 - (-param7 + param8 - -param0);
                      if (var19 > 0) {
                        var19 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var20 = param2 - -((param0 - param7) * ki.field_j);
                      if (var19 > var14) {
                        var20 = var20 + (var19 - var14) * ki.field_j;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: while (true) {
                      if (var14 >= var19) {
                        L10: {
                          var19 = -param7 + ki.field_f - (param0 + param8);
                          if (-1 <= (var19 ^ -1)) {
                            break L10;
                          } else {
                            var19 = 0;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var14 >= var19) {
                            L12: while (true) {
                              if (0 <= var14) {
                                break L0;
                              } else {
                                var21 = 0;
                                L13: while (true) {
                                  if (param9 <= var21) {
                                    var18--;
                                    var20 = var20 + param1;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (param9 <= var21) {
                                        param6 = param6 + param1;
                                        var14++;
                                        continue L12;
                                      } else {
                                        L15: {
                                          var22 = var34[var21] / var18;
                                          var23 = var32[var21] / var18;
                                          if (0 > var23) {
                                            var23 = 0;
                                            break L15;
                                          } else {
                                            if (255 < var23) {
                                              var23 = 255;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        L16: {
                                          var24 = var33[var21] / var18;
                                          if (-1 >= (var22 ^ -1)) {
                                            if (255 >= var22) {
                                              break L16;
                                            } else {
                                              var22 = 255;
                                              break L16;
                                            }
                                          } else {
                                            var22 = 0;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (-1 >= (var24 ^ -1)) {
                                            if (-256 > (var24 ^ -1)) {
                                              var24 = 255;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            var24 = 0;
                                            break L17;
                                          }
                                        }
                                        incrementValue$9 = param6;
                                        param6++;
                                        param3[incrementValue$9] = (var22 << 2005787952) + (var23 << -1307954744) + var24;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    incrementValue$10 = var20;
                                    var20++;
                                    param4 = param3[incrementValue$10];
                                    var10_array[var21] = var10_array[var21] - (w.a(param4, 16753086) >> 1342110864);
                                    var11[var21] = var11[var21] - (w.a(65505, param4) >> -903152664);
                                    var12[var21] = var12[var21] - w.a(255, param4);
                                    var21++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          } else {
                            var21 = 0;
                            L18: while (true) {
                              if (var21 >= param9) {
                                var20 = var20 + param1;
                                var21 = 0;
                                L19: while (true) {
                                  if (var21 >= param9) {
                                    var15 = var15 + param1;
                                    var21 = 0;
                                    L20: while (true) {
                                      if (param9 <= var21) {
                                        param6 = param6 + param1;
                                        var14++;
                                        continue L11;
                                      } else {
                                        L21: {
                                          var22 = var13 * var34[var21] >> 132119054;
                                          var23 = var32[var21] * var13 >> -44702610;
                                          var24 = var13 * var33[var21] >> -1391368786;
                                          if (255 >= var23) {
                                            break L21;
                                          } else {
                                            var23 = 255;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if ((var22 ^ -1) >= -256) {
                                            break L22;
                                          } else {
                                            var22 = 255;
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          if (var24 > 255) {
                                            var24 = 255;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                        incrementValue$11 = param6;
                                        param6++;
                                        param3[incrementValue$11] = var24 + ((var23 << 234897640) + (var22 << -1516029872));
                                        var21++;
                                        continue L20;
                                      }
                                    }
                                  } else {
                                    incrementValue$12 = var15;
                                    var15++;
                                    param4 = param3[incrementValue$12];
                                    var10_array[var21] = var10_array[var21] + w.a(255, param4 >> 1855365616);
                                    var11[var21] = var11[var21] + (w.a(65511, param4) >> 572996488);
                                    var12[var21] = var12[var21] + w.a(param4, 255);
                                    var21++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L24: {
                                  incrementValue$13 = var20;
                                  var20++;
                                  param4 = param3[incrementValue$13];
                                  var22 = -(255 & param4 >> 1289591568) + var34[var21];
                                  stackOut_40_0 = (int[]) (var10_array);
                                  stackOut_40_1 = var21;
                                  stackIn_42_0 = stackOut_40_0;
                                  stackIn_42_1 = stackOut_40_1;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  if (0 <= var22) {
                                    stackOut_42_0 = (int[]) ((Object) stackIn_42_0);
                                    stackOut_42_1 = stackIn_42_1;
                                    stackOut_42_2 = var22;
                                    stackIn_43_0 = stackOut_42_0;
                                    stackIn_43_1 = stackOut_42_1;
                                    stackIn_43_2 = stackOut_42_2;
                                    break L24;
                                  } else {
                                    stackOut_41_0 = (int[]) ((Object) stackIn_41_0);
                                    stackOut_41_1 = stackIn_41_1;
                                    stackOut_41_2 = 0;
                                    stackIn_43_0 = stackOut_41_0;
                                    stackIn_43_1 = stackOut_41_1;
                                    stackIn_43_2 = stackOut_41_2;
                                    break L24;
                                  }
                                }
                                L25: {
                                  stackIn_43_0[stackIn_43_1] = stackIn_43_2;
                                  var22 = var32[var21] + -((65344 & param4) >> 996696712);
                                  stackOut_43_0 = (int[]) (var11);
                                  stackOut_43_1 = var21;
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_45_1 = stackOut_43_1;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  if ((var22 ^ -1) > -1) {
                                    stackOut_45_0 = (int[]) ((Object) stackIn_45_0);
                                    stackOut_45_1 = stackIn_45_1;
                                    stackOut_45_2 = 0;
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    stackIn_46_2 = stackOut_45_2;
                                    break L25;
                                  } else {
                                    stackOut_44_0 = (int[]) ((Object) stackIn_44_0);
                                    stackOut_44_1 = stackIn_44_1;
                                    stackOut_44_2 = var22;
                                    stackIn_46_0 = stackOut_44_0;
                                    stackIn_46_1 = stackOut_44_1;
                                    stackIn_46_2 = stackOut_44_2;
                                    break L25;
                                  }
                                }
                                L26: {
                                  stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                  var22 = var33[var21] + -(param4 & 255);
                                  stackOut_46_0 = (int[]) (var12);
                                  stackOut_46_1 = var21;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if ((var22 ^ -1) > -1) {
                                    stackOut_48_0 = (int[]) ((Object) stackIn_48_0);
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = 0;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    break L26;
                                  } else {
                                    stackOut_47_0 = (int[]) ((Object) stackIn_47_0);
                                    stackOut_47_1 = stackIn_47_1;
                                    stackOut_47_2 = var22;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    stackIn_49_2 = stackOut_47_2;
                                    break L26;
                                  }
                                }
                                stackIn_49_0[stackIn_49_1] = stackIn_49_2;
                                var21++;
                                continue L18;
                              }
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (param0 + (var14 + param8) - -param7 < ki.field_i) {
                            var21 = 0;
                            L28: while (true) {
                              if (param9 <= var21) {
                                var15 = var15 + param1;
                                var18++;
                                break L27;
                              } else {
                                incrementValue$14 = var15;
                                var15++;
                                param4 = param3[incrementValue$14];
                                var10_array[var21] = var10_array[var21] + (w.a(16763401, param4) >> 564013904);
                                var11[var21] = var11[var21] + (w.a(param4, 65395) >> -2124644248);
                                var12[var21] = var12[var21] + w.a(255, param4);
                                var21++;
                                continue L28;
                              }
                            }
                          } else {
                            var15 = var15 + ki.field_j;
                            break L27;
                          }
                        }
                        var21 = 0;
                        L29: while (true) {
                          if (var21 >= param9) {
                            param6 = param6 + param1;
                            var14++;
                            continue L9;
                          } else {
                            var22 = var34[var21] / var18;
                            var23 = var32[var21] / var18;
                            var24 = var33[var21] / var18;
                            incrementValue$15 = param6;
                            param6++;
                            param3[incrementValue$15] = (var23 << -289271544) + ((var22 << -528731984) - -var24);
                            var21++;
                            continue L29;
                          }
                        }
                      }
                    }
                  } else {
                    incrementValue$16 = param6;
                    param6++;
                    param3[incrementValue$16] = var33[var19] / var18 + ((var34[var19] / var18 << 548402384) - -(var32[var19] / var18 << 2073753416));
                    var19++;
                    continue L6;
                  }
                }
              } else {
                var19 = 0;
                L30: while (true) {
                  if (param9 <= var19) {
                    var15 = var15 + param1;
                    var14++;
                    continue L5;
                  } else {
                    incrementValue$17 = var15;
                    var15++;
                    param4 = param3[incrementValue$17];
                    var10_array[var19] = var10_array[var19] + (w.a(param4, 16764195) >> -1493767440);
                    var11[var19] = var11[var19] + (w.a(65308, param4) >> -2064117784);
                    var12[var19] = var12[var19] + w.a(param4, 255);
                    var19++;
                    continue L30;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var10 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) (var10);
            stackOut_87_1 = new StringBuilder().append("nb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param3 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L31;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L31;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0 != 572996488) {
            return;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        hl[] var18 = null;
        L0: {
          var17 = StarCannon.field_A;
          if (param4 >= param11) {
            if (param4 < param5) {
              ak.a(param11, param3, param5, param13, param4, (byte) -44, ki.field_a, param15, param2, param6, param8, param1, param10, param9, param7, param14, param12);
              break L0;
            } else {
              if (param11 < param5) {
                ak.a(param11, param3, param4, param15, param5, (byte) 93, ki.field_a, param13, param2, param6, param7, param12, param9, param10, param8, param14, param1);
                break L0;
              } else {
                ak.a(param5, param10, param4, param15, param11, (byte) -116, ki.field_a, param2, param13, param7, param6, param14, param9, param3, param8, param12, param1);
                break L0;
              }
            }
          } else {
            if (param11 < param5) {
              ak.a(param4, param9, param5, param13, param11, (byte) -73, ki.field_a, param2, param15, param8, param6, param14, param10, param3, param7, param1, param12);
              break L0;
            } else {
              if (param4 < param5) {
                ak.a(param4, param9, param11, param2, param5, (byte) -120, ki.field_a, param13, param15, param8, param7, param12, param3, param10, param6, param1, param14);
                break L0;
              } else {
                ak.a(param5, param10, param11, param2, param4, (byte) 108, ki.field_a, param15, param13, param7, param8, param1, param3, param9, param6, param12, param14);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 > 5) {
            break L1;
          } else {
            var18 = (hl[]) null;
            nb.a(91, (byte) 22, 82, (hl[]) null, 63, -26, -49);
            break L1;
          }
        }
    }

    final static void a(int param0, byte param1, int param2, hl[] param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var23 = StarCannon.field_A;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (0 >= param6) {
                    break L1;
                  } else {
                    if (param5 == 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param3[3] == null) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = param3[3].field_x;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_11_0;
                        if (null != param3[5]) {
                          stackOut_13_0 = param3[5].field_x;
                          stackIn_14_0 = stackOut_13_0;
                          break L3;
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_14_0;
                        if (param3[1] == null) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = param3[1].field_q;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_17_0;
                        if (null != param3[7]) {
                          stackOut_19_0 = param3[7].field_q;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_20_0;
                        var11 = param2 + param4;
                        if (param1 == 122) {
                          break L6;
                        } else {
                          field_a = -0.9116721153259277f;
                          break L6;
                        }
                      }
                      L7: {
                        var12 = param0 + param6;
                        var13 = var7_int + param4;
                        var14 = -var8 + var11;
                        var15 = var9 + param0;
                        var16 = var12 + -var10;
                        var17 = var13;
                        var18 = var14;
                        if (var18 < var17) {
                          var18 = param4 - -(var7_int * param2 / (var8 + var7_int));
                          var17 = param4 - -(var7_int * param2 / (var8 + var7_int));
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        var19 = var15;
                        var20 = var16;
                        if (var20 < var19) {
                          var20 = param0 - -(var9 * param6 / (var10 + var9));
                          var19 = param0 - -(var9 * param6 / (var10 + var9));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        ki.a(pk.field_d);
                        if (null == param3[0]) {
                          break L9;
                        } else {
                          ki.c(param4, param0, var17, var19);
                          param3[0].e(param4, param0, param5);
                          ki.b(pk.field_d);
                          break L9;
                        }
                      }
                      L10: {
                        if (null == param3[2]) {
                          break L10;
                        } else {
                          ki.c(var18, param0, var11, var19);
                          param3[2].e(var14, param0, param5);
                          ki.b(pk.field_d);
                          break L10;
                        }
                      }
                      L11: {
                        if (null == param3[6]) {
                          break L11;
                        } else {
                          ki.c(param4, var20, var17, var12);
                          param3[6].e(param4, var16, param5);
                          ki.b(pk.field_d);
                          break L11;
                        }
                      }
                      L12: {
                        if (param3[8] != null) {
                          ki.c(var18, var20, var11, var12);
                          param3[8].e(var14, var16, param5);
                          ki.b(pk.field_d);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (null == param3[1]) {
                          break L13;
                        } else {
                          if (param3[1].field_x == 0) {
                            break L13;
                          } else {
                            ki.c(var17, param0, var18, var19);
                            var21 = var13;
                            L14: while (true) {
                              if (var14 <= var21) {
                                ki.b(pk.field_d);
                                break L13;
                              } else {
                                param3[1].e(var21, param0, param5);
                                var21 = var21 + param3[1].field_x;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                      L15: {
                        if (param3[7] == null) {
                          break L15;
                        } else {
                          if (param3[7].field_x == 0) {
                            break L15;
                          } else {
                            ki.c(var17, var20, var18, var12);
                            var21 = var13;
                            L16: while (true) {
                              if (var14 <= var21) {
                                ki.b(pk.field_d);
                                break L15;
                              } else {
                                param3[7].e(var21, var16, param5);
                                var21 = var21 + param3[7].field_x;
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                      L17: {
                        if (null == param3[3]) {
                          break L17;
                        } else {
                          if (param3[3].field_q == 0) {
                            break L17;
                          } else {
                            ki.c(param4, var19, var17, var20);
                            var21 = var15;
                            L18: while (true) {
                              if (var21 >= var16) {
                                ki.b(pk.field_d);
                                break L17;
                              } else {
                                param3[3].e(param4, var21, param5);
                                var21 = var21 + param3[3].field_q;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (param3[5] == null) {
                          break L19;
                        } else {
                          if (param3[5].field_q == 0) {
                            break L19;
                          } else {
                            ki.c(var18, var19, var11, var20);
                            var21 = var15;
                            L20: while (true) {
                              if (var21 >= var16) {
                                ki.b(pk.field_d);
                                break L19;
                              } else {
                                param3[5].e(var14, var21, param5);
                                var21 = var21 + param3[5].field_q;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (null == param3[4]) {
                          break L21;
                        } else {
                          if (param3[4].field_x == 0) {
                            break L21;
                          } else {
                            if (-1 == (param3[4].field_q ^ -1)) {
                              break L21;
                            } else {
                              ki.c(var17, var19, var18, var20);
                              var21 = var15;
                              L22: while (true) {
                                if (var16 <= var21) {
                                  ki.b(pk.field_d);
                                  break L21;
                                } else {
                                  var22 = var13;
                                  L23: while (true) {
                                    if (var22 >= var14) {
                                      var21 = var21 + param3[4].field_q;
                                      continue L22;
                                    } else {
                                      param3[4].e(var22, var21, param5);
                                      var22 = var22 + param3[4].field_x;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
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
            var7 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) (var7);
            stackOut_72_1 = new StringBuilder().append("nb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L24;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L24;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    static {
        field_d = new java.awt.Color(10040319);
    }
}
