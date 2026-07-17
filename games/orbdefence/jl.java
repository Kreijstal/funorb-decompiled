/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl {
    static int field_d;
    static long[] field_b;
    private static int[] field_c;
    static String field_a;
    static String field_f;
    static String field_e;

    final static ba[] a(byte param0) {
        return new ba[]{rc.field_m, fb.field_i, ia.field_a, cj.field_a, aj.field_a, tl.field_c, hd.field_q, gl.field_j, id.field_a, jd.field_d, ol.field_f, ue.field_G, nd.field_e, bd.field_q};
    }

    abstract int b(int param0, int param1);

    abstract hd a(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
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
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var25 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == field_c) {
                  break L2;
                } else {
                  if (~field_c.length > ~param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ef.field_j = new int[param1];
              field_c = new int[param1];
              tl.field_b = new int[param1];
              break L1;
            }
            L3: {
              var39 = field_c;
              var35 = var39;
              var31 = var35;
              var27 = var31;
              var26 = var27;
              var42 = var26;
              var38 = var42;
              var34 = var38;
              var30 = var34;
              var10_array = var30;
              var40 = tl.field_b;
              var36 = var40;
              var32 = var36;
              var28 = var32;
              var11 = var28;
              var41 = ef.field_j;
              var37 = var41;
              var33 = var37;
              var29 = var33;
              var12 = var29;
              mk.a(var39, 0, param1);
              mk.a(var40, 0, param1);
              mk.a(var41, 0, param1);
              var13 = 16384 / (1 + 2 * param2);
              var14 = param0 - param2;
              if (var14 >= 0) {
                break L3;
              } else {
                var14 = 0;
                break L3;
              }
            }
            L4: {
              var15 = ul.field_f * var14;
              var16 = param0 - -param2;
              var17 = 0;
              if (~ul.field_l >= ~var16) {
                var17 = 1 + (var16 - ul.field_l);
                var16 = ul.field_l + -1;
                break L4;
              } else {
                break L4;
              }
            }
            var18 = 1 + var16 + -var14;
            L5: while (true) {
              if (var16 < var14) {
                var15 = var15 + ul.field_f * var17;
                var19 = 0;
                L6: while (true) {
                  if (~var19 <= ~param1) {
                    L7: {
                      var14 = -param5 + 1;
                      param3 = param3 + param6;
                      var19 = -param5 + (param2 + 1) - param0;
                      if (var19 > 0) {
                        var19 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var20 = ul.field_f * (-param2 + param0);
                      if (var19 > var14) {
                        var20 = var20 + (-var14 + var19) * ul.field_f;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: while (true) {
                      if (var14 >= var19) {
                        L10: {
                          var19 = -param2 + -param0 + ul.field_l + -param5;
                          if (~var19 < param4) {
                            var19 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var19 <= var14) {
                            L12: while (true) {
                              if (0 <= var14) {
                                break L0;
                              } else {
                                var21 = 0;
                                L13: while (true) {
                                  if (var21 >= param1) {
                                    var20 = var20 + param6;
                                    var18--;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (~param1 >= ~var21) {
                                        param3 = param3 + param6;
                                        var14++;
                                        continue L12;
                                      } else {
                                        L15: {
                                          var22 = var42[var21] / var18;
                                          var23 = var40[var21] / var18;
                                          if (var22 >= 0) {
                                            if (255 >= var22) {
                                              break L15;
                                            } else {
                                              var22 = 255;
                                              break L15;
                                            }
                                          } else {
                                            var22 = 0;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var23 < 0) {
                                            var23 = 0;
                                            break L16;
                                          } else {
                                            if (var23 > 255) {
                                              var23 = 255;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        L17: {
                                          var24 = var41[var21] / var18;
                                          if (0 > var24) {
                                            var24 = 0;
                                            break L17;
                                          } else {
                                            if (255 >= var24) {
                                              break L17;
                                            } else {
                                              var24 = 255;
                                              break L17;
                                            }
                                          }
                                        }
                                        int incrementValue$9 = param3;
                                        param3++;
                                        param8[incrementValue$9] = var24 + ((var23 << 8) + (var22 << 16));
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    int incrementValue$10 = var20;
                                    var20++;
                                    param7 = param8[incrementValue$10];
                                    var10_array[var21] = var10_array[var21] - (vi.a(param7, 16757155) >> 16);
                                    var11[var21] = var11[var21] - (vi.a(65471, param7) >> 8);
                                    var12[var21] = var12[var21] - vi.a(param7, 255);
                                    var21++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          } else {
                            var21 = 0;
                            L18: while (true) {
                              if (param1 <= var21) {
                                var21 = 0;
                                L19: while (true) {
                                  if (~param1 >= ~var21) {
                                    var20 = var20 + param6;
                                    var21 = 0;
                                    L20: while (true) {
                                      if (~var21 <= ~param1) {
                                        var15 = var15 + param6;
                                        param3 = param3 + param6;
                                        var14++;
                                        continue L11;
                                      } else {
                                        L21: {
                                          var22 = var42[var21] * var13 >> 14;
                                          var23 = var40[var21] * var13 >> 14;
                                          var24 = var41[var21] * var13 >> 14;
                                          if (var22 > 255) {
                                            var22 = 255;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (255 >= var23) {
                                            break L22;
                                          } else {
                                            var23 = 255;
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          if (var24 <= 255) {
                                            break L23;
                                          } else {
                                            var24 = 255;
                                            break L23;
                                          }
                                        }
                                        int incrementValue$11 = param3;
                                        param3++;
                                        param8[incrementValue$11] = (var22 << 16) + ((var23 << 8) + var24);
                                        var21++;
                                        continue L20;
                                      }
                                    }
                                  } else {
                                    int incrementValue$12 = var15;
                                    var15++;
                                    param7 = param8[incrementValue$12];
                                    var10_array[var21] = var10_array[var21] + (vi.a(16758132, param7) >> 16);
                                    var11[var21] = var11[var21] + vi.a(255, param7 >> 8);
                                    var12[var21] = var12[var21] + vi.a(param7, 255);
                                    var21++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L24: {
                                  int incrementValue$13 = var20;
                                  var20++;
                                  param7 = param8[incrementValue$13];
                                  var22 = var42[var21] - ((16769585 & param7) >> 16);
                                  stackOut_42_0 = (int[]) var10_array;
                                  stackOut_42_1 = var21;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  if (var22 >= 0) {
                                    stackOut_44_0 = (int[]) (Object) stackIn_44_0;
                                    stackOut_44_1 = stackIn_44_1;
                                    stackOut_44_2 = var22;
                                    stackIn_45_0 = stackOut_44_0;
                                    stackIn_45_1 = stackOut_44_1;
                                    stackIn_45_2 = stackOut_44_2;
                                    break L24;
                                  } else {
                                    stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                    stackOut_43_1 = stackIn_43_1;
                                    stackOut_43_2 = 0;
                                    stackIn_45_0 = stackOut_43_0;
                                    stackIn_45_1 = stackOut_43_1;
                                    stackIn_45_2 = stackOut_43_2;
                                    break L24;
                                  }
                                }
                                L25: {
                                  stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                                  var22 = var40[var21] - ((param7 & 65309) >> 8);
                                  stackOut_45_0 = (int[]) var11;
                                  stackOut_45_1 = var21;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  if (var22 < 0) {
                                    stackOut_47_0 = (int[]) (Object) stackIn_47_0;
                                    stackOut_47_1 = stackIn_47_1;
                                    stackOut_47_2 = 0;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    stackIn_48_2 = stackOut_47_2;
                                    break L25;
                                  } else {
                                    stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                                    stackOut_46_1 = stackIn_46_1;
                                    stackOut_46_2 = var22;
                                    stackIn_48_0 = stackOut_46_0;
                                    stackIn_48_1 = stackOut_46_1;
                                    stackIn_48_2 = stackOut_46_2;
                                    break L25;
                                  }
                                }
                                L26: {
                                  stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                  var22 = var41[var21] - (param7 & 255);
                                  stackOut_48_0 = (int[]) var12;
                                  stackOut_48_1 = var21;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_50_1 = stackOut_48_1;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  if (var22 < 0) {
                                    stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = 0;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    stackIn_51_2 = stackOut_50_2;
                                    break L26;
                                  } else {
                                    stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                    stackOut_49_1 = stackIn_49_1;
                                    stackOut_49_2 = var22;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    stackIn_51_2 = stackOut_49_2;
                                    break L26;
                                  }
                                }
                                stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                var21++;
                                continue L18;
                              }
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (param0 + (var14 + param5 + param2) >= ul.field_a) {
                            var15 = var15 + ul.field_f;
                            break L27;
                          } else {
                            var21 = 0;
                            L28: while (true) {
                              if (var21 >= param1) {
                                var15 = var15 + param6;
                                var18++;
                                break L27;
                              } else {
                                int incrementValue$14 = var15;
                                var15++;
                                param7 = param8[incrementValue$14];
                                var10_array[var21] = var10_array[var21] + (vi.a(16738842, param7) >> 16);
                                var11[var21] = var11[var21] + (vi.a(param7, 65525) >> 8);
                                var12[var21] = var12[var21] + vi.a(255, param7);
                                var21++;
                                continue L28;
                              }
                            }
                          }
                        }
                        var21 = 0;
                        L29: while (true) {
                          if (~var21 <= ~param1) {
                            param3 = param3 + param6;
                            var14++;
                            continue L9;
                          } else {
                            var22 = var42[var21] / var18;
                            var23 = var40[var21] / var18;
                            var24 = var41[var21] / var18;
                            int incrementValue$15 = param3;
                            param3++;
                            param8[incrementValue$15] = var24 + ((var22 << 16) - -(var23 << 8));
                            var21++;
                            continue L29;
                          }
                        }
                      }
                    }
                  } else {
                    int incrementValue$16 = param3;
                    param3++;
                    param8[incrementValue$16] = var41[var19] / var18 + (var40[var19] / var18 << 8) + (var42[var19] / var18 << 16);
                    var19++;
                    continue L6;
                  }
                }
              } else {
                var19 = 0;
                L30: while (true) {
                  if (param1 <= var19) {
                    var15 = var15 + param6;
                    var14++;
                    continue L5;
                  } else {
                    int incrementValue$17 = var15;
                    var15++;
                    param7 = param8[incrementValue$17];
                    var10_array[var19] = var10_array[var19] + (vi.a(16771310, param7) >> 16);
                    var11[var19] = var11[var19] + (vi.a(65293, param7) >> 8);
                    var12[var19] = var12[var19] + vi.a(255, param7);
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
            stackOut_88_0 = (RuntimeException) var10;
            stackOut_88_1 = new StringBuilder().append("jl.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param8 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L31;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L31;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + 44 + 0 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_a = "Menu";
        field_f = "GHOSTO";
    }
}
