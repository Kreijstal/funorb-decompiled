/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends aj {
    byte[] field_j;
    int[] field_k;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((pg) this).field_c;
          param1 = param1 + ((pg) this).field_b;
          var4 = param0 + param1 * si.field_e;
          var5 = 0;
          var6 = ((pg) this).field_f;
          var7 = ((pg) this).field_a;
          var8 = si.field_e - var7;
          var9 = 0;
          if (param1 >= si.field_j) {
            break L0;
          } else {
            var10 = si.field_j - param1;
            var6 = var6 - var10;
            param1 = si.field_j;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * si.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= si.field_a) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - si.field_a);
            break L1;
          }
        }
        L2: {
          if (param0 >= si.field_b) {
            break L2;
          } else {
            var10 = si.field_b - param0;
            var7 = var7 - var10;
            param0 = si.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= si.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - si.field_l;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              pg.b(si.field_i, ((pg) this).field_j, ((pg) this).field_k, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = var9; var11 < 0; var11++) {
                int incrementValue$0 = param4;
                param4++;
                int incrementValue$1 = param3;
                param3++;
                param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
                int incrementValue$2 = param4;
                param4++;
                int incrementValue$3 = param3;
                param3++;
                param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
                int incrementValue$4 = param4;
                param4++;
                int incrementValue$5 = param3;
                param3++;
                param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
                int incrementValue$6 = param4;
                param4++;
                int incrementValue$7 = param3;
                param3++;
                param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
            }
            for (var11 = param5; var11 < 0; var11++) {
                int incrementValue$8 = param4;
                param4++;
                int incrementValue$9 = param3;
                param3++;
                param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((pg) this).field_c;
          param1 = param1 + ((pg) this).field_b;
          var3 = param0 + param1 * si.field_e;
          var4 = 0;
          var5 = ((pg) this).field_f;
          var6 = ((pg) this).field_a;
          var7 = si.field_e - var6;
          var8 = 0;
          if (param1 >= si.field_j) {
            break L0;
          } else {
            var9 = si.field_j - param1;
            var5 = var5 - var9;
            param1 = si.field_j;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * si.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= si.field_a) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - si.field_a);
            break L1;
          }
        }
        L2: {
          if (param0 >= si.field_b) {
            break L2;
          } else {
            var9 = si.field_b - param0;
            var6 = var6 - var9;
            param0 = si.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= si.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - si.field_l;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              pg.a(si.field_i, ((pg) this).field_j, ((pg) this).field_k, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                    int incrementValue$10 = param4;
                    param4++;
                    param3 = param1[incrementValue$10];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$12 = param4;
                  param4++;
                  param3 = param1[incrementValue$12];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    int incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$14 = param4;
                  param4++;
                  param3 = param1[incrementValue$14];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    int incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$16 = param4;
                  param4++;
                  param3 = param1[incrementValue$16];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    int incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param2[param3 & 255];
                    break L5;
                  }
                }
                int incrementValue$18 = param4;
                param4++;
                param3 = param1[incrementValue$18];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$19 = param5;
                  param5++;
                  param0[incrementValue$19] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
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
          var3 = ((pg) this).field_a >> 2;
          var4 = ((pg) this).field_f >> 2;
          param0 = param0 + ((pg) this).field_c / 4;
          param1 = param1 + ((pg) this).field_b / 4;
          if (param0 >= si.field_b) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = si.field_b - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= si.field_l) {
            stackOut_5_0 = ((pg) this).field_a - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (si.field_l - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= si.field_j) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = si.field_j - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= si.field_a) {
            stackOut_11_0 = ((pg) this).field_f - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (si.field_a - param1 << 2) - 4;
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
                var11 = var9 * ((pg) this).field_a + var10;
                var12 = (param1 + (var9 >> 2)) * si.field_e + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    si.field_i[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
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
                          var13 = ((pg) this).field_k[((pg) this).field_j[var11 + var16 * ((pg) this).field_a + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = si.field_i[var12];
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
                    int incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2[var16 & 255];
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

    final void a(int param0, int param1, int param2, int param3) {
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
          var5 = ((pg) this).field_a;
          var6 = ((pg) this).field_f;
          var7 = 0;
          var8 = 0;
          var9 = ((pg) this).field_i;
          var10 = ((pg) this).field_h;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((pg) this).field_c <= 0) {
            break L0;
          } else {
            var13 = ((((pg) this).field_c << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((pg) this).field_c << 16));
            break L0;
          }
        }
        L1: {
          if (((pg) this).field_b <= 0) {
            break L1;
          } else {
            var13 = ((((pg) this).field_b << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((pg) this).field_b << 16));
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
          var13 = param0 + param1 * si.field_e;
          var14 = si.field_e - param2;
          if (param1 + param3 <= si.field_a) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - si.field_a);
            break L4;
          }
        }
        L5: {
          if (param1 >= si.field_j) {
            break L5;
          } else {
            var15 = si.field_j - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * si.field_e;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= si.field_l) {
            break L6;
          } else {
            var15 = param0 + param2 - si.field_l;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= si.field_b) {
            break L7;
          } else {
            var15 = si.field_b - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        pg.a(si.field_i, ((pg) this).field_j, ((pg) this).field_k, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                int incrementValue$66 = param3;
                param3++;
                var13 = param1[incrementValue$66];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    pg(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((pg) this).field_i = param0;
        ((pg) this).field_h = param1;
        ((pg) this).field_c = param2;
        ((pg) this).field_b = param3;
        ((pg) this).field_a = param4;
        ((pg) this).field_f = param5;
        ((pg) this).field_j = param6;
        ((pg) this).field_k = param7;
    }

    pg(int param0, int param1, int param2) {
        ((pg) this).field_a = param0;
        ((pg) this).field_i = param0;
        ((pg) this).field_f = param1;
        ((pg) this).field_h = param1;
        ((pg) this).field_b = 0;
        ((pg) this).field_c = 0;
        ((pg) this).field_j = new byte[param0 * param1];
        ((pg) this).field_k = new int[param2];
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
          param0 = param0 + ((pg) this).field_c;
          param1 = param1 + ((pg) this).field_b;
          var3 = param0 + param1 * si.field_e;
          var4 = 0;
          var5 = ((pg) this).field_f;
          var6 = ((pg) this).field_a;
          var7 = si.field_e - var6;
          var8 = 0;
          if (param1 >= si.field_j) {
            break L0;
          } else {
            var9 = si.field_j - param1;
            var5 = var5 - var9;
            param1 = si.field_j;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * si.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= si.field_a) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - si.field_a);
            break L1;
          }
        }
        L2: {
          if (param0 >= si.field_b) {
            break L2;
          } else {
            var9 = si.field_b - param0;
            var6 = var6 - var9;
            param0 = si.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= si.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - si.field_l;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              pg.a(si.field_i, ((pg) this).field_j, ((pg) this).field_k, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }
}
