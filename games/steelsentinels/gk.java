/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends ea {
    int[] field_o;
    byte[] field_p;

    final wk a() {
        int var3 = 0;
        int var1 = ((gk) this).field_a * ((gk) this).field_i;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((gk) this).field_o[((gk) this).field_p[var3] & 255];
        }
        return new wk(((gk) this).field_g, ((gk) this).field_d, ((gk) this).field_j, ((gk) this).field_n, ((gk) this).field_a, ((gk) this).field_i, var2);
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                param3++;
                var13 = param1[param3];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  param4++;
                  param0[param4] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((gk) this).field_j;
          param1 = param1 + ((gk) this).field_n;
          var4 = param0 + param1 * pb.field_c;
          var5 = 0;
          var6 = ((gk) this).field_i;
          var7 = ((gk) this).field_a;
          var8 = pb.field_c - var7;
          var9 = 0;
          if (param1 >= pb.field_l) {
            break L0;
          } else {
            var10 = pb.field_l - param1;
            var6 = var6 - var10;
            param1 = pb.field_l;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * pb.field_c;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= pb.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - pb.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= pb.field_i) {
            break L2;
          } else {
            var10 = pb.field_i - param0;
            var7 = var7 - var10;
            param0 = pb.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= pb.field_b) {
            break L3;
          } else {
            var10 = param0 + var7 - pb.field_b;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            gk.a(pb.field_g, ((gk) this).field_p, ((gk) this).field_o, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var13 = param3;
        int var14 = param12 >> 16 & 255;
        int var15 = param12 >> 8 & 255;
        int var16 = param12 & 255;
        for (var17 = -param8; var17 < 0; var17++) {
            var18 = (param4 >> 16) * param11;
            for (var19 = -param7; var19 < 0; var19++) {
                var20 = param1[(param3 >> 16) + var18];
                if (var20 != 0) {
                    var20 = param2[var20 & 255];
                    var21 = var20 >> 16 & 255;
                    var22 = var20 >> 8 & 255;
                    var23 = var20 & 255;
                    param5++;
                    param0[param5] = (var21 * var14 >> 8 << 16) + (var22 * var15 >> 8 << 8) + (var23 * var16 >> 8);
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    final gk b() {
        int var3 = 0;
        int var4 = 0;
        gk var1 = new gk(((gk) this).field_a, ((gk) this).field_i, ((gk) this).field_o.length);
        var1.field_g = ((gk) this).field_g;
        var1.field_d = ((gk) this).field_d;
        var1.field_j = ((gk) this).field_g - ((gk) this).field_a - ((gk) this).field_j;
        var1.field_n = ((gk) this).field_n;
        int var2 = ((gk) this).field_o.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_o[var3] = ((gk) this).field_o[var3];
        }
        for (var3 = 0; var3 < ((gk) this).field_i; var3++) {
            for (var4 = 0; var4 < ((gk) this).field_a; var4++) {
                var1.field_p[var3 * ((gk) this).field_a + var4] = ((gk) this).field_p[var3 * ((gk) this).field_a + ((gk) this).field_a - 1 - var4];
            }
        }
        return var1;
    }

    final void b(int param0, int param1) {
        int var3 = 0;
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
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = ((gk) this).field_a >> 2;
          var4 = ((gk) this).field_i >> 2;
          param0 = param0 + ((gk) this).field_j / 4;
          param1 = param1 + ((gk) this).field_n / 4;
          if (param0 >= pb.field_i) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = pb.field_i - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= pb.field_b) {
            stackOut_5_0 = ((gk) this).field_a - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (pb.field_b - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= pb.field_l) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = pb.field_l - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= pb.field_d) {
            stackOut_11_0 = ((gk) this).field_i - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (pb.field_d - param1 << 2) - 4;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var5;
            L5: while (true) {
              if (var10 > var6) {
                var9 += 4;
                continue L4;
              } else {
                var11 = var9 * ((gk) this).field_a + var10;
                var12 = (param1 + (var9 >> 2)) * pb.field_c + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    pb.field_g[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
                    var10 += 4;
                    continue L5;
                  } else {
                    var17 = 0;
                    L7: while (true) {
                      if (var17 >= 4) {
                        var16++;
                        continue L6;
                      } else {
                        L8: {
                          var13 = ((gk) this).field_o[((gk) this).field_p[var11 + var16 * ((gk) this).field_a + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = pb.field_g[var12];
                            break L8;
                          }
                        }
                        var14 = var14 + (var13 & 16711935);
                        var15 = var15 + (var13 & 65280);
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
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
        L0: {
          var6 = ((gk) this).field_a;
          var7 = ((gk) this).field_i;
          var8 = 0;
          var9 = 0;
          var10 = ((gk) this).field_g;
          var11 = ((gk) this).field_d;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
          if (((gk) this).field_j <= 0) {
            break L0;
          } else {
            var14 = ((((gk) this).field_j << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (((gk) this).field_j << 16));
            break L0;
          }
        }
        L1: {
          if (((gk) this).field_n <= 0) {
            break L1;
          } else {
            var14 = ((((gk) this).field_n << 16) + var13 - 1) / var13;
            param1 = param1 + var14;
            var9 = var9 + (var14 * var13 - (((gk) this).field_n << 16));
            break L1;
          }
        }
        L2: {
          if (var6 >= var10) {
            break L2;
          } else {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            break L2;
          }
        }
        L3: {
          if (var7 >= var11) {
            break L3;
          } else {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            break L3;
          }
        }
        L4: {
          var14 = param0 + param1 * pb.field_c;
          var15 = pb.field_c - param2;
          if (param1 + param3 <= pb.field_d) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - pb.field_d);
            break L4;
          }
        }
        L5: {
          if (param1 >= pb.field_l) {
            break L5;
          } else {
            var16 = pb.field_l - param1;
            param3 = param3 - var16;
            var14 = var14 + var16 * pb.field_c;
            var9 = var9 + var13 * var16;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= pb.field_b) {
            break L6;
          } else {
            var16 = param0 + param2 - pb.field_b;
            param2 = param2 - var16;
            var15 = var15 + var16;
            break L6;
          }
        }
        L7: {
          if (param0 >= pb.field_i) {
            break L7;
          } else {
            var16 = pb.field_i - param0;
            param2 = param2 - var16;
            var14 = var14 + var16;
            var8 = var8 + var12 * var16;
            var15 = var15 + var16;
            break L7;
          }
        }
        gk.a(pb.field_g, ((gk) this).field_p, ((gk) this).field_o, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = ((gk) this).field_a >> 1;
          var4 = ((gk) this).field_i >> 1;
          param0 = param0 + ((gk) this).field_j / 2;
          param1 = param1 + ((gk) this).field_n / 2;
          if (param0 >= pb.field_i) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = pb.field_i - param0 << 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= pb.field_b) {
            stackOut_5_0 = ((gk) this).field_a - 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (pb.field_b - param0 << 1) - 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= pb.field_l) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = pb.field_l - param1 << 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= pb.field_d) {
            stackOut_11_0 = ((gk) this).field_i - 2;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (pb.field_d - param1 << 1) - 2;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var21 = new int[4];
        var20 = var21;
        var19 = var20;
        var18 = var19;
        var9 = var18;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          } else {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 2;
                continue L4;
              } else {
                var12 = var10 * ((gk) this).field_a + var11;
                var13 = (param1 + (var10 >> 1)) * pb.field_c + (param0 + (var11 >> 1));
                var9[0] = ((gk) this).field_o[((gk) this).field_p[var12] & 255];
                var9[1] = ((gk) this).field_o[((gk) this).field_p[var12 + 1] & 255];
                var9[2] = ((gk) this).field_o[((gk) this).field_p[var12 + ((gk) this).field_a] & 255];
                var9[3] = ((gk) this).field_o[((gk) this).field_p[var12 + 1] & 255];
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                L6: while (true) {
                  if (var17 >= 4) {
                    pb.field_g[var13] = var14 >> 2 << 16 | var15 >> 2 << 8 | var16 >> 2;
                    var11 += 2;
                    continue L5;
                  } else {
                    L7: {
                      if (var21[var17] != 0) {
                        break L7;
                      } else {
                        var9[var17] = pb.field_g[var13];
                        break L7;
                      }
                    }
                    var14 = var14 + (var21[var17] >> 16 & 255);
                    var15 = var15 + (var21[var17] >> 8 & 255);
                    var16 = var16 + (var21[var17] & 255);
                    var17++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param5 = param5 + param8;
                    param4 = param4 + param9;
                    var11++;
                    continue L0;
                  } else {
                    param4++;
                    param3 = param1[param4];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param0[param5] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L5;
                  }
                }
                param4++;
                param3 = param1[param4];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param0[param5] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
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
        L0: {
          var5 = ((gk) this).field_a;
          var6 = ((gk) this).field_i;
          var7 = 0;
          var8 = 0;
          var9 = ((gk) this).field_g;
          var10 = ((gk) this).field_d;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((gk) this).field_j <= 0) {
            break L0;
          } else {
            var13 = ((((gk) this).field_j << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((gk) this).field_j << 16));
            break L0;
          }
        }
        L1: {
          if (((gk) this).field_n <= 0) {
            break L1;
          } else {
            var13 = ((((gk) this).field_n << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((gk) this).field_n << 16));
            break L1;
          }
        }
        L2: {
          if (var5 >= var9) {
            break L2;
          } else {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            break L2;
          }
        }
        L3: {
          if (var6 >= var10) {
            break L3;
          } else {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            break L3;
          }
        }
        L4: {
          var13 = param0 + param1 * pb.field_c;
          var14 = pb.field_c - param2;
          if (param1 + param3 <= pb.field_d) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - pb.field_d);
            break L4;
          }
        }
        L5: {
          if (param1 >= pb.field_l) {
            break L5;
          } else {
            var15 = pb.field_l - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * pb.field_c;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= pb.field_b) {
            break L6;
          } else {
            var15 = param0 + param2 - pb.field_b;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= pb.field_i) {
            break L7;
          } else {
            var15 = pb.field_i - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        gk.a(pb.field_g, ((gk) this).field_p, ((gk) this).field_o, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((gk) this).field_j;
          param1 = param1 + ((gk) this).field_n;
          var3 = param0 + param1 * pb.field_c;
          var4 = 0;
          var5 = ((gk) this).field_i;
          var6 = ((gk) this).field_a;
          var7 = pb.field_c - var6;
          var8 = 0;
          if (param1 >= pb.field_l) {
            break L0;
          } else {
            var9 = pb.field_l - param1;
            var5 = var5 - var9;
            param1 = pb.field_l;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * pb.field_c;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= pb.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - pb.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= pb.field_i) {
            break L2;
          } else {
            var9 = pb.field_i - param0;
            var6 = var6 - var9;
            param0 = pb.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= pb.field_b) {
            break L3;
          } else {
            var9 = param0 + var6 - pb.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            gk.b(pb.field_g, ((gk) this).field_p, ((gk) this).field_o, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        double var7 = 0.0;
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
        double var24 = 0.0;
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
        if (param5 != 0) {
          L0: {
            param0 = param0 - (((gk) this).field_j << 4);
            param1 = param1 - (((gk) this).field_n << 4);
            var7 = (double)(param4 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
            var11 = -param0 * var10 + -param1 * var9;
            var12 = --param0 * var9 + -param1 * var10;
            var13 = ((((gk) this).field_a << 4) - param0) * var10 + -param1 * var9;
            var14 = -((((gk) this).field_a << 4) - param0) * var9 + -param1 * var10;
            var15 = -param0 * var10 + ((((gk) this).field_i << 4) - param1) * var9;
            var16 = --param0 * var9 + ((((gk) this).field_i << 4) - param1) * var10;
            var17 = ((((gk) this).field_a << 4) - param0) * var10 + ((((gk) this).field_i << 4) - param1) * var9;
            var18 = -((((gk) this).field_a << 4) - param0) * var9 + ((((gk) this).field_i << 4) - param1) * var10;
            if (var11 >= var13) {
              var19 = var13;
              var20 = var11;
              break L0;
            } else {
              var19 = var11;
              var20 = var13;
              break L0;
            }
          }
          L1: {
            if (var15 >= var19) {
              break L1;
            } else {
              var19 = var15;
              break L1;
            }
          }
          L2: {
            if (var17 >= var19) {
              break L2;
            } else {
              var19 = var17;
              break L2;
            }
          }
          L3: {
            if (var15 <= var20) {
              break L3;
            } else {
              var20 = var15;
              break L3;
            }
          }
          L4: {
            if (var17 <= var20) {
              break L4;
            } else {
              var20 = var17;
              break L4;
            }
          }
          L5: {
            if (var12 >= var14) {
              var21 = var14;
              var22 = var12;
              break L5;
            } else {
              var21 = var12;
              var22 = var14;
              break L5;
            }
          }
          L6: {
            if (var16 >= var21) {
              break L6;
            } else {
              var21 = var16;
              break L6;
            }
          }
          L7: {
            if (var18 >= var21) {
              break L7;
            } else {
              var21 = var18;
              break L7;
            }
          }
          L8: {
            if (var16 <= var22) {
              break L8;
            } else {
              var22 = var16;
              break L8;
            }
          }
          L9: {
            if (var18 <= var22) {
              break L9;
            } else {
              var22 = var18;
              break L9;
            }
          }
          L10: {
            var19 = var19 >> 12;
            var20 = var20 + 4095 >> 12;
            var21 = var21 >> 12;
            var22 = var22 + 4095 >> 12;
            var19 = var19 + param2;
            var20 = var20 + param2;
            var21 = var21 + param3;
            var22 = var22 + param3;
            var19 = var19 >> 4;
            var20 = var20 + 15 >> 4;
            var21 = var21 >> 4;
            var22 = var22 + 15 >> 4;
            if (var19 >= pb.field_i) {
              break L10;
            } else {
              var19 = pb.field_i;
              break L10;
            }
          }
          L11: {
            if (var20 <= pb.field_b) {
              break L11;
            } else {
              var20 = pb.field_b;
              break L11;
            }
          }
          L12: {
            if (var21 >= pb.field_l) {
              break L12;
            } else {
              var21 = pb.field_l;
              break L12;
            }
          }
          L13: {
            if (var22 <= pb.field_d) {
              break L13;
            } else {
              var22 = pb.field_d;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * pb.field_c + var19;
                var24 = 16777216.0 / (double)param5;
                var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
                var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
                var28 = (var19 << 4) + 8 - param2;
                var29 = (var21 << 4) + 8 - param3;
                var30 = (param0 << 8) - (var29 * var26 >> 4);
                var31 = (param1 << 8) + (var29 * var27 >> 4);
                if (var27 != 0) {
                  if (var27 >= 0) {
                    if (var26 != 0) {
                      if (var26 >= 0) {
                        var33 = var22;
                        L15: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L16: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              if (var35 >= 0) {
                                break L16;
                              } else {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L16;
                              }
                            }
                            L17: {
                              var32 = (1 + var35 - (((gk) this).field_a << 12) - var27) / var27;
                              if ((1 + var35 - (((gk) this).field_a << 12) - var27) / var27 <= var37) {
                                break L17;
                              } else {
                                var37 = var32;
                                break L17;
                              }
                            }
                            L18: {
                              if (var36 >= 0) {
                                break L18;
                              } else {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L18;
                              }
                            }
                            L19: {
                              var32 = (1 + var36 - (((gk) this).field_i << 12) - var26) / var26;
                              if ((1 + var36 - (((gk) this).field_i << 12) - var26) / var26 <= var37) {
                                break L19;
                              } else {
                                var37 = var32;
                                break L19;
                              }
                            }
                            L20: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + pb.field_c;
                                continue L15;
                              } else {
                                L21: {
                                  var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                  if (var38 == 0) {
                                    var34++;
                                    break L21;
                                  } else {
                                    var34++;
                                    pb.field_g[var34] = var38;
                                    break L21;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L20;
                              }
                            }
                          }
                        }
                      } else {
                        var33 = var22;
                        L22: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L23: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              if (var35 >= 0) {
                                break L23;
                              } else {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L23;
                              }
                            }
                            L24: {
                              var32 = (1 + var35 - (((gk) this).field_a << 12) - var27) / var27;
                              if ((1 + var35 - (((gk) this).field_a << 12) - var27) / var27 <= var37) {
                                break L24;
                              } else {
                                var37 = var32;
                                break L24;
                              }
                            }
                            L25: {
                              var32 = var36 - (((gk) this).field_i << 12);
                              if (var36 - (((gk) this).field_i << 12) < 0) {
                                break L25;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L25;
                              }
                            }
                            L26: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L26;
                              } else {
                                var37 = var32;
                                break L26;
                              }
                            }
                            L27: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + pb.field_c;
                                continue L22;
                              } else {
                                L28: {
                                  var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                  if (var38 == 0) {
                                    var34++;
                                    break L28;
                                  } else {
                                    var34++;
                                    pb.field_g[var34] = var38;
                                    break L28;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L27;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L29: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L30: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((gk) this).field_i << 12) < 0) {
                                L31: {
                                  if (var35 >= 0) {
                                    break L31;
                                  } else {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L31;
                                  }
                                }
                                L32: {
                                  var32 = (1 + var35 - (((gk) this).field_a << 12) - var27) / var27;
                                  if ((1 + var35 - (((gk) this).field_a << 12) - var27) / var27 <= var37) {
                                    break L32;
                                  } else {
                                    var37 = var32;
                                    break L32;
                                  }
                                }
                                L33: while (true) {
                                  if (var37 >= 0) {
                                    break L30;
                                  } else {
                                    L34: {
                                      var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                      if (var38 == 0) {
                                        var34++;
                                        break L34;
                                      } else {
                                        var34++;
                                        pb.field_g[var34] = var38;
                                        break L34;
                                      }
                                    }
                                    var35 = var35 + var27;
                                    var37++;
                                    continue L33;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            } else {
                              break L30;
                            }
                          }
                          var33++;
                          var31 = var31 + var27;
                          var23 = var23 + pb.field_c;
                          continue L29;
                        }
                      }
                    }
                  } else {
                    if (var26 != 0) {
                      if (var26 >= 0) {
                        var33 = var22;
                        L35: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L36: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((gk) this).field_a << 12);
                              if (var35 - (((gk) this).field_a << 12) < 0) {
                                break L36;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L36;
                              }
                            }
                            L37: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L37;
                              } else {
                                var37 = var32;
                                break L37;
                              }
                            }
                            L38: {
                              if (var36 >= 0) {
                                break L38;
                              } else {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L38;
                              }
                            }
                            L39: {
                              var32 = (1 + var36 - (((gk) this).field_i << 12) - var26) / var26;
                              if ((1 + var36 - (((gk) this).field_i << 12) - var26) / var26 <= var37) {
                                break L39;
                              } else {
                                var37 = var32;
                                break L39;
                              }
                            }
                            L40: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + pb.field_c;
                                continue L35;
                              } else {
                                L41: {
                                  var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                  if (var38 == 0) {
                                    var34++;
                                    break L41;
                                  } else {
                                    var34++;
                                    pb.field_g[var34] = var38;
                                    break L41;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L40;
                              }
                            }
                          }
                        }
                      } else {
                        var33 = var22;
                        L42: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L43: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((gk) this).field_a << 12);
                              if (var35 - (((gk) this).field_a << 12) < 0) {
                                break L43;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L43;
                              }
                            }
                            L44: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L44;
                              } else {
                                var37 = var32;
                                break L44;
                              }
                            }
                            L45: {
                              var32 = var36 - (((gk) this).field_i << 12);
                              if (var36 - (((gk) this).field_i << 12) < 0) {
                                break L45;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L45;
                              }
                            }
                            L46: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L46;
                              } else {
                                var37 = var32;
                                break L46;
                              }
                            }
                            L47: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + pb.field_c;
                                continue L42;
                              } else {
                                L48: {
                                  var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                  if (var38 == 0) {
                                    var34++;
                                    break L48;
                                  } else {
                                    var34++;
                                    pb.field_g[var34] = var38;
                                    break L48;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L47;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L49: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L50: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((gk) this).field_i << 12) < 0) {
                                L51: {
                                  var32 = var35 - (((gk) this).field_a << 12);
                                  if (var35 - (((gk) this).field_a << 12) < 0) {
                                    break L51;
                                  } else {
                                    var32 = (var27 - var32) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L51;
                                  }
                                }
                                L52: {
                                  var32 = (var35 - var27) / var27;
                                  if ((var35 - var27) / var27 <= var37) {
                                    break L52;
                                  } else {
                                    var37 = var32;
                                    break L52;
                                  }
                                }
                                L53: while (true) {
                                  if (var37 >= 0) {
                                    break L50;
                                  } else {
                                    L54: {
                                      var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                      if (var38 == 0) {
                                        var34++;
                                        break L54;
                                      } else {
                                        var34++;
                                        pb.field_g[var34] = var38;
                                        break L54;
                                      }
                                    }
                                    var35 = var35 + var27;
                                    var37++;
                                    continue L53;
                                  }
                                }
                              } else {
                                break L50;
                              }
                            } else {
                              break L50;
                            }
                          }
                          var33++;
                          var31 = var31 + var27;
                          var23 = var23 + pb.field_c;
                          continue L49;
                        }
                      }
                    }
                  }
                } else {
                  if (var26 != 0) {
                    if (var26 >= 0) {
                      var33 = var22;
                      L55: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L56: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((gk) this).field_a << 12) < 0) {
                                L57: {
                                  if (var36 >= 0) {
                                    break L57;
                                  } else {
                                    var32 = (var26 - 1 - var36) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L57;
                                  }
                                }
                                L58: {
                                  var32 = (1 + var36 - (((gk) this).field_i << 12) - var26) / var26;
                                  if ((1 + var36 - (((gk) this).field_i << 12) - var26) / var26 <= var37) {
                                    break L58;
                                  } else {
                                    var37 = var32;
                                    break L58;
                                  }
                                }
                                L59: while (true) {
                                  if (var37 >= 0) {
                                    break L56;
                                  } else {
                                    L60: {
                                      var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                      if (var38 == 0) {
                                        var34++;
                                        break L60;
                                      } else {
                                        var34++;
                                        pb.field_g[var34] = var38;
                                        break L60;
                                      }
                                    }
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L59;
                                  }
                                }
                              } else {
                                break L56;
                              }
                            } else {
                              break L56;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + pb.field_c;
                          continue L55;
                        }
                      }
                    } else {
                      var33 = var22;
                      L61: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L62: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((gk) this).field_a << 12) < 0) {
                                L63: {
                                  var32 = var36 - (((gk) this).field_i << 12);
                                  if (var36 - (((gk) this).field_i << 12) < 0) {
                                    break L63;
                                  } else {
                                    var32 = (var26 - var32) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var32 = (var36 - var26) / var26;
                                  if ((var36 - var26) / var26 <= var37) {
                                    break L64;
                                  } else {
                                    var37 = var32;
                                    break L64;
                                  }
                                }
                                L65: while (true) {
                                  if (var37 >= 0) {
                                    break L62;
                                  } else {
                                    L66: {
                                      var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                      if (var38 == 0) {
                                        var34++;
                                        break L66;
                                      } else {
                                        var34++;
                                        pb.field_g[var34] = var38;
                                        break L66;
                                      }
                                    }
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L65;
                                  }
                                }
                              } else {
                                var33++;
                                var30 = var30 - var26;
                                var23 = var23 + pb.field_c;
                                continue L61;
                              }
                            } else {
                              break L62;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + pb.field_c;
                          continue L61;
                        }
                      }
                    }
                  } else {
                    var33 = var22;
                    L67: while (true) {
                      if (var33 >= 0) {
                        return;
                      } else {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var35 >= 0) {
                          L68: {
                            if (var36 >= 0) {
                              if (var35 - (((gk) this).field_a << 12) < 0) {
                                if (var36 - (((gk) this).field_i << 12) < 0) {
                                  L69: while (true) {
                                    if (var37 >= 0) {
                                      break L68;
                                    } else {
                                      var38 = ((gk) this).field_o[((gk) this).field_p[(var36 >> 12) * ((gk) this).field_a + (var35 >> 12)]];
                                      if (var38 == 0) {
                                        var34++;
                                        var37++;
                                        continue L69;
                                      } else {
                                        var34++;
                                        pb.field_g[var34] = var38;
                                        var37++;
                                        continue L69;
                                      }
                                    }
                                  }
                                } else {
                                  break L68;
                                }
                              } else {
                                break L68;
                              }
                            } else {
                              break L68;
                            }
                          }
                          var33++;
                          var23 = var23 + pb.field_c;
                          continue L67;
                        } else {
                          var33++;
                          var23 = var23 + pb.field_c;
                          continue L67;
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    gk(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((gk) this).field_g = param0;
        ((gk) this).field_d = param1;
        ((gk) this).field_j = param2;
        ((gk) this).field_n = param3;
        ((gk) this).field_a = param4;
        ((gk) this).field_i = param5;
        ((gk) this).field_p = param6;
        ((gk) this).field_o = param7;
    }

    gk(int param0, int param1, int param2) {
        ((gk) this).field_a = param0;
        ((gk) this).field_g = param0;
        ((gk) this).field_i = param1;
        ((gk) this).field_d = param1;
        ((gk) this).field_n = 0;
        ((gk) this).field_j = 0;
        ((gk) this).field_p = new byte[param0 * param1];
        ((gk) this).field_o = new int[param2];
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                var16 = param1[(param3 >> 16) + var14];
                if (var16 != 0) {
                    param5++;
                    param0[param5] = param2[var16 & 255];
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }
}
