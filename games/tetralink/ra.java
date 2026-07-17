/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private static int[] field_d;
    static int field_l;
    static int field_e;
    static int[] field_k;
    private static int[] field_c;
    private static int[] field_a;
    static int field_g;
    static int field_i;
    static int[] field_b;
    static int field_j;
    static int field_f;
    static int[] field_h;

    private final static void c() {
        field_k = null;
        field_h = null;
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
            param2 = param0 + param3 - 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param2 += 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param0 = param0 + param5;
            param4++;
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param0 < field_j) {
            param2 = param2 - (field_j - param0);
            param0 = field_j;
        }
        if (param0 + param2 > field_l) {
            param2 = field_l - param0;
        }
        if (param1 < field_i) {
            param3 = param3 - (field_i - param1);
            param1 = field_i;
        }
        if (param1 + param3 > field_g) {
            param3 = field_g - param1;
        }
        int var4 = param0 + param1 * field_f;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            for (var5 = 0; var5 < param3; var5++) {
                for (var6 = 0; var6 < param2; var6++) {
                    var7 = field_b[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    int incrementValue$0 = var4;
                    var4++;
                    field_b[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (field_f - param2);
            }
            return;
        }
    }

    final static void a() {
        int var0 = 0;
        int var1 = field_f * field_e - 7;
        while (var0 < var1) {
            int incrementValue$0 = var0;
            var0++;
            field_b[incrementValue$0] = 0;
            int incrementValue$1 = var0;
            var0++;
            field_b[incrementValue$1] = 0;
            int incrementValue$2 = var0;
            var0++;
            field_b[incrementValue$2] = 0;
            int incrementValue$3 = var0;
            var0++;
            field_b[incrementValue$3] = 0;
            int incrementValue$4 = var0;
            var0++;
            field_b[incrementValue$4] = 0;
            int incrementValue$5 = var0;
            var0++;
            field_b[incrementValue$5] = 0;
            int incrementValue$6 = var0;
            var0++;
            field_b[incrementValue$6] = 0;
            int incrementValue$7 = var0;
            var0++;
            field_b[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            int incrementValue$8 = var0;
            var0++;
            field_b[incrementValue$8] = 0;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
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
        int[] var24 = null;
        int[] var25 = null;
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
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        L0: {
          L1: {
            if (field_d == null) {
              break L1;
            } else {
              if (field_d.length >= 540) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          field_d = new int[540];
          field_c = new int[540];
          field_a = new int[540];
          break L0;
        }
        L2: {
          var33 = field_d;
          var30 = var33;
          var27 = var30;
          var24 = var27;
          var9 = var24;
          var34 = field_c;
          var31 = var34;
          var28 = var31;
          var25 = var28;
          var10 = var25;
          var35 = field_a;
          var32 = var35;
          var29 = var32;
          var26 = var29;
          var11 = var26;
          rd.a(var33, 0, 540);
          rd.a(var34, 0, 540);
          rd.a(var35, 0, 540);
          var12 = 1820;
          var13 = -4;
          if (var13 >= 0) {
            break L2;
          } else {
            var13 = 0;
            break L2;
          }
        }
        L3: {
          var14 = var13 * field_f;
          var15 = 4;
          var16 = 0;
          if (var15 < field_e) {
            break L3;
          } else {
            var16 = var15 - field_e + 1;
            var15 = field_e - 1;
            break L3;
          }
        }
        var17 = var15 - var13 + 1;
        L4: while (true) {
          if (var13 > var15) {
            var14 = var14 + var16 * field_f;
            var18 = 0;
            L5: while (true) {
              if (var18 >= 540) {
                L6: {
                  param2 = param2 + param6;
                  var13 = -139;
                  var18 = -135;
                  if (0 >= var18) {
                    break L6;
                  } else {
                    var18 = 0;
                    break L6;
                  }
                }
                L7: {
                  var19 = -4 * field_f;
                  if (var13 >= var18) {
                    break L7;
                  } else {
                    var19 = var19 + (var18 - var13) * field_f;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var18) {
                    L9: {
                      var18 = field_e - 144;
                      if (0 >= var18) {
                        break L9;
                      } else {
                        var18 = 0;
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (var13 >= var18) {
                        L11: while (true) {
                          if (var13 >= 0) {
                            return;
                          } else {
                            var20 = 0;
                            L12: while (true) {
                              if (var20 >= 540) {
                                var19 = var19 + param6;
                                var17--;
                                var20 = 0;
                                L13: while (true) {
                                  if (var20 >= 540) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L11;
                                  } else {
                                    L14: {
                                      var21 = var33[var20] / var17;
                                      var22 = var34[var20] / var17;
                                      var23 = var35[var20] / var17;
                                      if (var21 >= 0) {
                                        if (var21 <= 255) {
                                          break L14;
                                        } else {
                                          var21 = 255;
                                          break L14;
                                        }
                                      } else {
                                        var21 = 0;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var22 >= 0) {
                                        if (var22 <= 255) {
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
                                      if (var23 >= 0) {
                                        if (var23 <= 255) {
                                          break L16;
                                        } else {
                                          var23 = 255;
                                          break L16;
                                        }
                                      } else {
                                        var23 = 0;
                                        break L16;
                                      }
                                    }
                                    int incrementValue$9 = param2;
                                    param2++;
                                    param0[incrementValue$9] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L13;
                                  }
                                }
                              } else {
                                int incrementValue$10 = var19;
                                var19++;
                                param1 = param0[incrementValue$10];
                                var9[var20] = var9[var20] - (param1 >> 16 & 255);
                                var10[var20] = var10[var20] - (param1 >> 8 & 255);
                                var11[var20] = var11[var20] - (param1 & 255);
                                var20++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        var20 = 0;
                        L17: while (true) {
                          if (var20 >= 540) {
                            var19 = var19 + param6;
                            var20 = 0;
                            L18: while (true) {
                              if (var20 >= 540) {
                                var14 = var14 + param6;
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= 540) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L10;
                                  } else {
                                    L20: {
                                      var21 = var33[var20] * var12 >> 14;
                                      var22 = var34[var20] * var12 >> 14;
                                      var23 = var35[var20] * var12 >> 14;
                                      if (var21 <= 255) {
                                        break L20;
                                      } else {
                                        var21 = 255;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var22 <= 255) {
                                        break L21;
                                      } else {
                                        var22 = 255;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var23 <= 255) {
                                        break L22;
                                      } else {
                                        var23 = 255;
                                        break L22;
                                      }
                                    }
                                    int incrementValue$11 = param2;
                                    param2++;
                                    param0[incrementValue$11] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              } else {
                                int incrementValue$12 = var14;
                                var14++;
                                param1 = param0[incrementValue$12];
                                var9[var20] = var9[var20] + (param1 >> 16 & 255);
                                var10[var20] = var10[var20] + (param1 >> 8 & 255);
                                var11[var20] = var11[var20] + (param1 & 255);
                                var20++;
                                continue L18;
                              }
                            }
                          } else {
                            L23: {
                              int incrementValue$13 = var19;
                              var19++;
                              param1 = param0[incrementValue$13];
                              var21 = var33[var20] - (param1 >> 16 & 255);
                              stackOut_36_0 = (int[]) var9;
                              stackOut_36_1 = var20;
                              stackIn_38_0 = stackOut_36_0;
                              stackIn_38_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var21 >= 0) {
                                stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                                stackOut_38_1 = stackIn_38_1;
                                stackOut_38_2 = var21;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                stackIn_39_2 = stackOut_38_2;
                                break L23;
                              } else {
                                stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = 0;
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_39_1 = stackOut_37_1;
                                stackIn_39_2 = stackOut_37_2;
                                break L23;
                              }
                            }
                            L24: {
                              stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                              var21 = var34[var20] - (param1 >> 8 & 255);
                              stackOut_39_0 = (int[]) var10;
                              stackOut_39_1 = var20;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (var21 >= 0) {
                                stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = var21;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                break L24;
                              } else {
                                stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = 0;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                break L24;
                              }
                            }
                            L25: {
                              stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                              var21 = var35[var20] - (param1 & 255);
                              stackOut_42_0 = (int[]) var11;
                              stackOut_42_1 = var20;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              if (var21 >= 0) {
                                stackOut_44_0 = (int[]) (Object) stackIn_44_0;
                                stackOut_44_1 = stackIn_44_1;
                                stackOut_44_2 = var21;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                break L25;
                              } else {
                                stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 0;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_45_2 = stackOut_43_2;
                                break L25;
                              }
                            }
                            stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                            var20++;
                            continue L17;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (var13 + 144 >= field_g) {
                        var14 = var14 + field_f;
                        break L26;
                      } else {
                        var20 = 0;
                        L27: while (true) {
                          if (var20 >= 540) {
                            var14 = var14 + param6;
                            var17++;
                            break L26;
                          } else {
                            int incrementValue$14 = var14;
                            var14++;
                            param1 = param0[incrementValue$14];
                            var9[var20] = var9[var20] + (param1 >> 16 & 255);
                            var10[var20] = var10[var20] + (param1 >> 8 & 255);
                            var11[var20] = var11[var20] + (param1 & 255);
                            var20++;
                            continue L27;
                          }
                        }
                      }
                    }
                    var20 = 0;
                    L28: while (true) {
                      if (var20 >= 540) {
                        param2 = param2 + param6;
                        var13++;
                        continue L8;
                      } else {
                        var21 = var33[var20] / var17;
                        var22 = var34[var20] / var17;
                        var23 = var35[var20] / var17;
                        int incrementValue$15 = param2;
                        param2++;
                        param0[incrementValue$15] = (var21 << 16) + (var22 << 8) + var23;
                        var20++;
                        continue L28;
                      }
                    }
                  }
                }
              } else {
                int incrementValue$16 = param2;
                param2++;
                param0[incrementValue$16] = (var33[var18] / var17 << 16) + (var34[var18] / var17 << 8) + var35[var18] / var17;
                var18++;
                continue L5;
              }
            }
          } else {
            var18 = 0;
            L29: while (true) {
              if (var18 >= 540) {
                var14 = var14 + param6;
                var13++;
                continue L4;
              } else {
                int incrementValue$17 = var14;
                var14++;
                param1 = param0[incrementValue$17];
                var9[var18] = var9[var18] + (param1 >> 16 & 255);
                var10[var18] = var10[var18] + (param1 >> 8 & 255);
                var11[var18] = var11[var18] + (param1 & 255);
                var18++;
                continue L29;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > field_f) {
            param2 = field_f;
        }
        if (param3 > field_e) {
            param3 = field_e;
        }
        field_j = param0;
        field_i = param1;
        field_l = param2;
        field_g = param3;
        ra.c();
    }

    private final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param0 >= field_j) {
            if (param0 >= field_l) {
                return;
            }
            if (param1 < field_i) {
                param2 = param2 - (field_i - param1);
                param1 = field_i;
            }
            if (param1 + param2 > field_g) {
                param2 = field_g - param1;
            }
            var5 = 256 - param4;
            var6 = 85 * param4;
            var7 = 85 * param4;
            var8 = 85 * param4;
            var12 = param0 + param1 * field_f;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_b[var12] >> 16 & 255) * var5;
                var10 = (field_b[var12] >> 8 & 255) * var5;
                var11 = (field_b[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                field_b[var12] = var14;
                var12 = var12 + field_f;
            }
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int var5 = 0;
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
        int var23 = 0;
        L0: {
          var5 = param2 * param2;
          var6 = param0 - param2 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + param2 + 15 >> 4;
          if (var6 >= field_j) {
            break L0;
          } else {
            var6 = field_j;
            break L0;
          }
        }
        L1: {
          if (var7 <= field_l) {
            break L1;
          } else {
            var7 = field_l;
            break L1;
          }
        }
        L2: {
          if (var8 >= field_i) {
            break L2;
          } else {
            var8 = field_i;
            break L2;
          }
        }
        L3: {
          if (var9 <= field_g) {
            break L3;
          } else {
            var9 = field_g;
            break L3;
          }
        }
        var10 = (var6 << 4) - param0;
        var10 = var10 * var10;
        var11 = (var6 + 1 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 2 << 4) - param0;
        var12 = var12 * var12;
        var13 = var11 - var10;
        var14 = var12 - var11;
        var15 = var14 - var13;
        var16 = (var8 << 4) - param1;
        var16 = var16 * var16;
        var17 = (var8 + 1 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var8 + 2 << 4) - param1;
        var18 = var18 * var18;
        var19 = var17 - var16;
        var20 = var18 - var17;
        var21 = var20 - var19;
        var22 = var6 + var8 * field_f;
        var23 = field_f + var6 - var7;
        ra.a(0, 0, 0, 0, 0, var15, var5, var22, field_b, param3, param4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
    }

    final static void g(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_i) {
            if (param1 >= field_g) {
                return;
            }
            if (param0 < field_j) {
                param2 = param2 - (field_j - param0);
                param0 = field_j;
            }
            if (param0 + param2 > field_l) {
                param2 = field_l - param0;
            }
            var4 = param0 + param1 * field_f;
            for (var5 = 0; var5 < param2; var5++) {
                field_b[var4 + var5] = param3;
            }
            return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param0 < field_j) {
            param2 = param2 - (field_j - param0);
            param0 = field_j;
        }
        if (param1 < field_i) {
            param3 = param3 - (field_i - param1);
            param1 = field_i;
        }
        if (param0 + param2 > field_l) {
            param2 = field_l - param0;
        }
        if (param1 + param3 > field_g) {
            param3 = field_g - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        int var6 = 256 - param5;
        int var7 = field_f - param2;
        int var8 = param0 + param1 * field_f;
        for (var9 = 0; var9 < param3; var9++) {
            for (var10 = -param2; var10 < 0; var10++) {
                var11 = field_b[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
                int incrementValue$0 = var8;
                var8++;
                field_b[incrementValue$0] = param4 + var11;
            }
            var8 = var8 + var7;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_j) {
            if (param0 >= field_l) {
                return;
            }
            if (param1 < field_i) {
                param2 = param2 - (field_i - param1);
                param1 = field_i;
            }
            if (param1 + param2 > field_g) {
                param2 = field_g - param1;
            }
            var4 = param0 + param1 * field_f;
            var5 = 0;
            while (var5 < param2) {
                field_b[var4] = param3;
                var5++;
                var4 = var4 + field_f;
            }
            return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        L0: {
          var8 = 1820;
          var9 = -535;
          if (0 >= var9) {
            break L0;
          } else {
            var9 = 0;
            break L0;
          }
        }
        L1: {
          var10 = field_f - 544;
          if (0 >= var10) {
            break L1;
          } else {
            var10 = 0;
            break L1;
          }
        }
        L2: {
          var11 = 0;
          var12 = 5;
          if (field_f >= var12) {
            break L2;
          } else {
            var11 = var12 - field_f;
            var12 = field_f;
            break L2;
          }
        }
        var13 = -140;
        L3: while (true) {
          if (var13 >= 0) {
            return;
          } else {
            L4: {
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = param2 - 4;
              var18 = var17 - 9;
              var19 = -4;
              if (var19 >= 0) {
                break L4;
              } else {
                var17 = var17 - var19;
                var18 = var18 - var19;
                var19 = 0;
                break L4;
              }
            }
            var20 = var12 - var19;
            L5: while (true) {
              if (var19 >= var12) {
                var18 = var18 + var11;
                int incrementValue$6 = param2;
                param2++;
                param0[incrementValue$6] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
                var19 = -539;
                L6: while (true) {
                  if (var19 >= var9) {
                    L7: while (true) {
                      if (var19 >= var10) {
                        L8: while (true) {
                          if (var19 >= 0) {
                            param2 = param2 + param6;
                            var13++;
                            continue L3;
                          } else {
                            L9: {
                              int incrementValue$7 = var18;
                              var18++;
                              param1 = param0[incrementValue$7];
                              var14 = var14 - (param1 >> 16 & 255);
                              var15 = var15 - (param1 >> 8 & 255);
                              var16 = var16 - (param1 & 255);
                              var20--;
                              var21 = var14 / var20;
                              var22 = var15 / var20;
                              var23 = var16 / var20;
                              if (var21 >= 0) {
                                if (var21 <= 255) {
                                  break L9;
                                } else {
                                  var21 = 255;
                                  break L9;
                                }
                              } else {
                                var21 = 0;
                                break L9;
                              }
                            }
                            L10: {
                              if (var22 >= 0) {
                                if (var22 <= 255) {
                                  break L10;
                                } else {
                                  var22 = 255;
                                  break L10;
                                }
                              } else {
                                var22 = 0;
                                break L10;
                              }
                            }
                            L11: {
                              if (var23 >= 0) {
                                if (var23 <= 255) {
                                  break L11;
                                } else {
                                  var23 = 255;
                                  break L11;
                                }
                              } else {
                                var23 = 0;
                                break L11;
                              }
                            }
                            int incrementValue$8 = param2;
                            param2++;
                            param0[incrementValue$8] = (var21 << 16) + (var22 << 8) + var23;
                            var19++;
                            continue L8;
                          }
                        }
                      } else {
                        L12: {
                          int incrementValue$9 = var18;
                          var18++;
                          param1 = param0[incrementValue$9];
                          var14 = var14 - (param1 >> 16 & 255);
                          if (var14 >= 0) {
                            break L12;
                          } else {
                            var14 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var15 = var15 - (param1 >> 8 & 255);
                          if (var15 >= 0) {
                            break L13;
                          } else {
                            var15 = 0;
                            break L13;
                          }
                        }
                        L14: {
                          var16 = var16 - (param1 & 255);
                          if (var16 >= 0) {
                            break L14;
                          } else {
                            var16 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          param1 = param0[var17];
                          var17++;
                          var14 = var14 + (param1 >> 16 & 255);
                          var15 = var15 + (param1 >> 8 & 255);
                          var16 = var16 + (param1 & 255);
                          var21 = var14 * var8 >> 14;
                          var22 = var15 * var8 >> 14;
                          var23 = var16 * var8 >> 14;
                          if (var21 <= 255) {
                            break L15;
                          } else {
                            var21 = 255;
                            break L15;
                          }
                        }
                        L16: {
                          if (var22 <= 255) {
                            break L16;
                          } else {
                            var22 = 255;
                            break L16;
                          }
                        }
                        L17: {
                          if (var23 <= 255) {
                            break L17;
                          } else {
                            var23 = 255;
                            break L17;
                          }
                        }
                        int incrementValue$10 = param2;
                        param2++;
                        param0[incrementValue$10] = (var21 << 16) + (var22 << 8) + var23;
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    L18: {
                      var18++;
                      if (540 + var19 + 4 >= field_l) {
                        break L18;
                      } else {
                        param1 = param0[var17];
                        var17++;
                        var14 = var14 + (param1 >> 16 & 255);
                        var15 = var15 + (param1 >> 8 & 255);
                        var16 = var16 + (param1 & 255);
                        var20++;
                        break L18;
                      }
                    }
                    var21 = var14 / var20;
                    var22 = var15 / var20;
                    var23 = var16 / var20;
                    int incrementValue$11 = param2;
                    param2++;
                    param0[incrementValue$11] = (var21 << 16) + (var22 << 8) + var23;
                    var19++;
                    continue L6;
                  }
                }
              } else {
                param1 = param0[var17];
                var14 = var14 + (param1 >> 16 & 255);
                var15 = var15 + (param1 >> 8 & 255);
                var16 = var16 + (param1 & 255);
                var17++;
                var18++;
                var19++;
                continue L5;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        ra.g(param0, param1, param2, param4);
        ra.g(param0, param1 + param3 - 1, param2, param4);
        ra.c(param0, param1, param3, param4);
        ra.c(param0 + param2 - 1, param1, param3, param4);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (param4 != 0) {
          L0: {
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = -param4;
              break L0;
            }
          }
          L1: {
            var6 = param0 + param4;
            var7 = param1 + param4;
            var8 = param0 + param2 - param4 - 1;
            var9 = param1 + param3 - param4 - 1;
            if (field_l <= field_j) {
              break L1;
            } else {
              if (field_g > field_i) {
                if (param0 + param2 <= field_j) {
                  break L1;
                } else {
                  L2: {
                    if (param0 >= field_l) {
                      break L2;
                    } else {
                      if (param1 + param3 < field_i) {
                        break L2;
                      } else {
                        if (param1 < field_g) {
                          L3: {
                            L4: {
                              var10 = var6 + (var7 - param4) * field_f;
                              var11 = var8 + (var7 - param4) * field_f;
                              var12 = var6 + var7 * field_f;
                              var13 = var8 + var7 * field_f;
                              var14 = var6 + var9 * field_f;
                              var15 = var8 + var9 * field_f;
                              var16 = var6 + (var9 + param4) * field_f;
                              var17 = var8 + (var9 + param4) * field_f;
                              var18 = param4;
                              var19 = 0;
                              var20 = param4 * param4;
                              var21 = var20 - var18;
                              if (param0 < field_j) {
                                break L4;
                              } else {
                                if (param0 + param2 >= field_l) {
                                  break L4;
                                } else {
                                  if (param1 < field_i) {
                                    break L4;
                                  } else {
                                    if (param1 + param3 < field_g) {
                                      var22 = var12;
                                      L5: while (true) {
                                        if (var22 > var14) {
                                          var22 = var13;
                                          L6: while (true) {
                                            if (var22 > var15) {
                                              var22 = var10;
                                              L7: while (true) {
                                                if (var22 > var11) {
                                                  var22 = var16;
                                                  L8: while (true) {
                                                    if (var22 > var17) {
                                                      L9: while (true) {
                                                        L10: {
                                                          int incrementValue$2 = var19;
                                                          var19++;
                                                          var21 = var21 + (incrementValue$2 + var19);
                                                          var12 = var12 - field_f;
                                                          var13 = var13 - field_f;
                                                          var14 = var14 + field_f;
                                                          var15 = var15 + field_f;
                                                          if (var21 <= var20) {
                                                            break L10;
                                                          } else {
                                                            var18--;
                                                            var21 = var21 - (var18 + var18);
                                                            var10 = var10 + field_f;
                                                            var11 = var11 + field_f;
                                                            var16 = var16 - field_f;
                                                            var17 = var17 - field_f;
                                                            break L10;
                                                          }
                                                        }
                                                        if (var18 >= var19) {
                                                          field_b[var10 - var19] = 8421631;
                                                          field_b[var11 + var19] = 8421631;
                                                          field_b[var12 - var18] = 8421631;
                                                          field_b[var13 + var18] = 8421631;
                                                          field_b[var14 - var18] = 8421631;
                                                          field_b[var15 + var18] = 8421631;
                                                          field_b[var16 - var19] = 8421631;
                                                          field_b[var17 + var19] = 8421631;
                                                          continue L9;
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      field_b[var22] = 8421631;
                                                      var22++;
                                                      continue L8;
                                                    }
                                                  }
                                                } else {
                                                  field_b[var22] = 8421631;
                                                  var22++;
                                                  continue L7;
                                                }
                                              }
                                            } else {
                                              field_b[var22 + var18] = 8421631;
                                              var22 = var22 + field_f;
                                              continue L6;
                                            }
                                          }
                                        } else {
                                          field_b[var22 - var18] = 8421631;
                                          var22 = var22 + field_f;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            ra.c(param0, param1 + var18, param3 - var18 - var18, 8421631);
                            ra.c(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, 8421631);
                            ra.g(param0 + var18, param1, param2 - var18 - var18, 8421631);
                            ra.g(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, 8421631);
                            L11: while (true) {
                              L12: {
                                int incrementValue$3 = var19;
                                var19++;
                                var21 = var21 + (incrementValue$3 + var19);
                                var12 = var12 - field_f;
                                var13 = var13 - field_f;
                                var14 = var14 + field_f;
                                var15 = var15 + field_f;
                                if (var21 <= var20) {
                                  break L12;
                                } else {
                                  var18--;
                                  var21 = var21 - (var18 + var18);
                                  var10 = var10 + field_f;
                                  var11 = var11 + field_f;
                                  var16 = var16 - field_f;
                                  var17 = var17 - field_f;
                                  break L12;
                                }
                              }
                              if (var18 >= var19) {
                                L13: {
                                  if (var7 - var18 < field_i) {
                                    break L13;
                                  } else {
                                    if (var7 - var18 >= field_g) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (var6 - var19 < field_j) {
                                          break L14;
                                        } else {
                                          if (var6 - var19 >= field_l) {
                                            break L14;
                                          } else {
                                            field_b[var10 - var19] = 8421631;
                                            break L14;
                                          }
                                        }
                                      }
                                      if (var8 + var19 < field_j) {
                                        break L13;
                                      } else {
                                        if (var8 + var19 >= field_l) {
                                          break L13;
                                        } else {
                                          field_b[var11 + var19] = 8421631;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  if (var7 - var19 < field_i) {
                                    break L15;
                                  } else {
                                    if (var7 - var19 >= field_g) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (var6 - var18 < field_j) {
                                          break L16;
                                        } else {
                                          if (var6 - var18 >= field_l) {
                                            break L16;
                                          } else {
                                            field_b[var12 - var18] = 8421631;
                                            break L16;
                                          }
                                        }
                                      }
                                      if (var8 + var18 < field_j) {
                                        break L15;
                                      } else {
                                        if (var8 + var18 >= field_l) {
                                          break L15;
                                        } else {
                                          field_b[var13 + var18] = 8421631;
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                L17: {
                                  if (var9 + var19 < field_i) {
                                    break L17;
                                  } else {
                                    if (var9 + var19 >= field_g) {
                                      break L17;
                                    } else {
                                      L18: {
                                        if (var6 - var18 < field_j) {
                                          break L18;
                                        } else {
                                          if (var6 - var18 >= field_l) {
                                            break L18;
                                          } else {
                                            field_b[var14 - var18] = 8421631;
                                            break L18;
                                          }
                                        }
                                      }
                                      if (var8 + var18 < field_j) {
                                        break L17;
                                      } else {
                                        if (var8 + var18 >= field_l) {
                                          break L17;
                                        } else {
                                          field_b[var15 + var18] = 8421631;
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var9 + var18 < field_i) {
                                  continue L11;
                                } else {
                                  if (var9 + var18 >= field_g) {
                                    continue L11;
                                  } else {
                                    L19: {
                                      if (var6 - var19 < field_j) {
                                        break L19;
                                      } else {
                                        if (var6 - var19 >= field_l) {
                                          break L19;
                                        } else {
                                          field_b[var16 - var19] = 8421631;
                                          break L19;
                                        }
                                      }
                                    }
                                    if (var8 + var19 < field_j) {
                                      continue L11;
                                    } else {
                                      if (var8 + var19 >= field_l) {
                                        continue L11;
                                      } else {
                                        field_b[var17 + var19] = 8421631;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          ra.b(param0, param1, param2, param3, 8421631);
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3) {
        if (param0 < field_j) {
            param2 = param2 - (field_j - param0);
            param0 = field_j;
        }
        if (param1 < field_i) {
            param3 = param3 - (field_i - param1);
            param1 = field_i;
        }
        if (param0 + param2 > field_l) {
            param2 = field_l - param0;
        }
        if (param1 + param3 > field_g) {
            param3 = field_g - param1;
        }
        int var4 = field_f - param2;
        int var5 = param0 + param1 * field_f;
        ra.a(var5, field_b, 0, param2, -param3, var4);
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (field_j < param0) {
            field_j = param0;
        }
        if (field_i < param1) {
            field_i = param1;
        }
        if (field_l > param2) {
            field_l = param2;
        }
        if (field_g > param3) {
            field_g = param3;
        }
        ra.c();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            ra.e(param0 + var6, param1 + param3 + var6, param2, 5592405, var5);
            ra.f(param0 + param2 + var6, param1 + var6, param3 + 1, 5592405, var5);
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        if (param0 < field_j) {
            param2 = param2 - (field_j - param0);
            param0 = field_j;
        }
        if (param1 < field_i) {
            param3 = param3 - (field_i - param1);
            param1 = field_i;
        }
        if (param0 + param2 > field_l) {
            param2 = field_l - param0;
        }
        if (param1 + param3 > field_g) {
            param3 = field_g - param1;
        }
        int var5 = field_f - param2;
        int var6 = param0 + param1 * field_f;
        for (var7 = -param3; var7 < 0; var7++) {
            for (var8 = -param2; var8 < 0; var8++) {
                int incrementValue$0 = var6;
                var6++;
                field_b[incrementValue$0] = param4;
            }
            var6 = var6 + var5;
        }
    }

    final static void a(int[] param0) {
        param0[0] = field_j;
        param0[1] = field_i;
        param0[2] = field_l;
        param0[3] = field_g;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var6 = 0;
          var7 = 65536 / param3;
          if (param0 >= field_j) {
            break L0;
          } else {
            param2 = param2 - (field_j - param0);
            param0 = field_j;
            break L0;
          }
        }
        L1: {
          if (param1 >= field_i) {
            break L1;
          } else {
            var6 = var6 + (field_i - param1) * var7;
            param3 = param3 - (field_i - param1);
            param1 = field_i;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= field_l) {
            break L2;
          } else {
            param2 = field_l - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= field_g) {
            break L3;
          } else {
            param3 = field_g - param1;
            break L3;
          }
        }
        var8 = field_f - param2;
        var9 = param0 + param1 * field_f;
        var10 = -param3;
        L4: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = 65536 - var6 >> 8;
            var12 = var6 >> 8;
            var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
            var14 = -param2;
            L5: while (true) {
              if (var14 >= 0) {
                var9 = var9 + var8;
                var6 = var6 + var7;
                var10++;
                continue L4;
              } else {
                int incrementValue$1 = var9;
                var9++;
                field_b[incrementValue$1] = var13;
                var14++;
                continue L5;
              }
            }
          }
        }
    }

    public static void b() {
        field_b = null;
        field_k = null;
        field_h = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void b(int[] param0) {
        field_j = param0[0];
        field_i = param0[1];
        field_l = param0[2];
        field_g = param0[3];
        ra.c();
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 < field_j) {
          return;
        } else {
          L0: {
            if (param1 < field_i) {
              break L0;
            } else {
              if (param0 >= field_l) {
                break L0;
              } else {
                if (param1 < field_g) {
                  field_b[param0 + param1 * field_f] = param2;
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int discarded$0 = 140;
        ra.a(field_b, 0, 0 * field_f, 4, 0, 540, field_f - 540);
        ra.a(field_b, 0, 0 * field_f, 4, 0, 140, field_f - 540, 0, 540);
    }

    final static void f(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
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
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            var4 = param1 - param2;
            if (var4 >= field_i) {
              break L1;
            } else {
              var4 = field_i;
              break L1;
            }
          }
          L2: {
            var5 = param1 + param2 + 1;
            if (var5 <= field_g) {
              break L2;
            } else {
              var5 = field_g;
              break L2;
            }
          }
          L3: {
            var6 = var4;
            var7 = param2 * param2;
            var8 = 0;
            var9 = param1 - var6;
            var10 = var9 * var9;
            var11 = var10 - var9;
            if (param1 <= var5) {
              break L3;
            } else {
              param1 = var5;
              break L3;
            }
          }
          L4: while (true) {
            if (var6 >= param1) {
              var8 = param2;
              var9 = var6 - param1;
              var11 = var9 * var9 + var7;
              var10 = var11 - var8;
              var11 = var11 - var9;
              L5: while (true) {
                if (var6 >= var5) {
                  return;
                } else {
                  L6: while (true) {
                    L7: {
                      if (var11 <= var7) {
                        break L7;
                      } else {
                        if (var10 <= var7) {
                          break L7;
                        } else {
                          int incrementValue$6 = var8;
                          var8--;
                          var11 = var11 - (incrementValue$6 + var8);
                          var10 = var10 - (var8 + var8);
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      var12 = param0 - var8;
                      if (var12 >= field_j) {
                        break L8;
                      } else {
                        var12 = field_j;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = param0 + var8;
                      if (var13 <= field_l - 1) {
                        break L9;
                      } else {
                        var13 = field_l - 1;
                        break L9;
                      }
                    }
                    var14 = var12 + var6 * field_f;
                    var15 = var12;
                    L10: while (true) {
                      if (var15 > var13) {
                        var6++;
                        var11 = var11 + (var9 + var9);
                        int incrementValue$7 = var9;
                        var9++;
                        var10 = var10 + (incrementValue$7 + var9);
                        continue L5;
                      } else {
                        int incrementValue$8 = var14;
                        var14++;
                        field_b[incrementValue$8] = param3;
                        var15++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            } else {
              L11: while (true) {
                L12: {
                  if (var11 <= var7) {
                    break L12;
                  } else {
                    if (var10 > var7) {
                      L13: {
                        var12 = param0 - var8 + 1;
                        if (var12 >= field_j) {
                          break L13;
                        } else {
                          var12 = field_j;
                          break L13;
                        }
                      }
                      L14: {
                        var13 = param0 + var8;
                        if (var13 <= field_l) {
                          break L14;
                        } else {
                          var13 = field_l;
                          break L14;
                        }
                      }
                      var14 = var12 + var6 * field_f;
                      var15 = var12;
                      L15: while (true) {
                        if (var15 >= var13) {
                          var6++;
                          int incrementValue$9 = var9;
                          var9--;
                          var10 = var10 - (incrementValue$9 + var9);
                          var11 = var11 - (var9 + var9);
                          continue L4;
                        } else {
                          int incrementValue$10 = var14;
                          var14++;
                          field_b[incrementValue$10] = param3;
                          var15++;
                          continue L15;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                var10 = var10 + (var8 + var8);
                int incrementValue$11 = var8;
                var8++;
                var11 = var11 + (incrementValue$11 + var8);
                continue L11;
              }
            }
          }
        } else {
          ra.a(param0, param1, param3);
          return;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int[] param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17) {
        int var18 = 0;
        while (param17 < 0) {
            param3 = param14;
            param4 = param12;
            for (var18 = param13; var18 < 0; var18++) {
                if (param3 < param6) {
                    param0 = param10[(param6 - param3) * param9 / param6];
                    param1 = param8[param7];
                    param2 = param0 + param1;
                    param0 = (param0 & 16711935) + (param1 & 16711935);
                    param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                    param8[param7] = param2 - param1 | param1 - (param1 >>> 8);
                }
                param7++;
                param3 = param3 + param4;
                param4 = param4 + param5;
            }
            param7 = param7 + param11;
            param14 = param14 + param15;
            param15 = param15 + param16;
            param17++;
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param1 >= field_i) {
            if (param1 >= field_g) {
                return;
            }
            if (param0 < field_j) {
                param2 = param2 - (field_j - param0);
                param0 = field_j;
            }
            if (param0 + param2 > field_l) {
                param2 = field_l - param0;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_f;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_b[var12] >> 16 & 255) * var5;
                var10 = (field_b[var12] >> 8 & 255) * var5;
                var11 = (field_b[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                int incrementValue$0 = var12;
                var12++;
                field_b[incrementValue$0] = var14;
            }
            return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            if (param2 <= param3) {
              L1: {
                param0 = param0 << 16;
                param0 = param0 + 32768;
                param2 = param2 << 16;
                var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                param3 = param3 + param1;
                if (param1 >= field_i) {
                  break L1;
                } else {
                  param0 = param0 + var5 * (field_i - param1);
                  param1 = field_i;
                  break L1;
                }
              }
              L2: {
                if (param3 < field_g) {
                  break L2;
                } else {
                  param3 = field_g - 1;
                  break L2;
                }
              }
              L3: while (true) {
                if (param1 > param3) {
                  return;
                } else {
                  L4: {
                    var6 = param0 >> 16;
                    if (var6 < field_j) {
                      break L4;
                    } else {
                      if (var6 >= field_l) {
                        break L4;
                      } else {
                        field_b[var6 + param1 * field_f] = param4;
                        break L4;
                      }
                    }
                  }
                  param0 = param0 + var5;
                  param1++;
                  continue L3;
                }
              }
            } else {
              L5: {
                param1 = param1 << 16;
                param1 = param1 + 32768;
                param3 = param3 << 16;
                var5 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                param2 = param2 + param0;
                if (param0 >= field_j) {
                  break L5;
                } else {
                  param1 = param1 + var5 * (field_j - param0);
                  param0 = field_j;
                  break L5;
                }
              }
              L6: {
                if (param2 < field_l) {
                  break L6;
                } else {
                  param2 = field_l - 1;
                  break L6;
                }
              }
              L7: while (true) {
                if (param0 > param2) {
                  return;
                } else {
                  L8: {
                    var6 = param1 >> 16;
                    if (var6 < field_i) {
                      break L8;
                    } else {
                      if (var6 >= field_g) {
                        break L8;
                      } else {
                        field_b[param0 + var6 * field_f] = param4;
                        break L8;
                      }
                    }
                  }
                  param1 = param1 + var5;
                  param0++;
                  continue L7;
                }
              }
            }
          } else {
            L9: {
              if (param3 < 0) {
                ra.c(param0, param1 + param3, -param3 + 1, param4);
                break L9;
              } else {
                ra.c(param0, param1, param3 + 1, param4);
                break L9;
              }
            }
            return;
          }
        } else {
          L10: {
            if (param2 < 0) {
              ra.g(param0 + param2, param1, -param2 + 1, param4);
              break L10;
            } else {
              ra.g(param0, param1, param2 + 1, param4);
              break L10;
            }
          }
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        field_b = param0;
        field_f = param1;
        field_e = param2;
        ra.a(0, 0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_l = 0;
        field_j = 0;
        field_g = 0;
    }
}
