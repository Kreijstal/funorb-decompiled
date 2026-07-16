/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends hd {
    int[] field_o;
    byte[] field_p;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((rk) this).field_a;
          param1 = param1 + ((rk) this).field_m;
          var3 = param0 + param1 * wb.field_h;
          var4 = 0;
          var5 = ((rk) this).field_h;
          var6 = ((rk) this).field_k;
          var7 = wb.field_h - var6;
          var8 = 0;
          if (param1 >= wb.field_a) {
            break L0;
          } else {
            var9 = wb.field_a - param1;
            var5 = var5 - var9;
            param1 = wb.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wb.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wb.field_b) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wb.field_b);
            break L1;
          }
        }
        L2: {
          if (param0 >= wb.field_i) {
            break L2;
          } else {
            var9 = wb.field_i - param0;
            var6 = var6 - var9;
            param0 = wb.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wb.field_j) {
            break L3;
          } else {
            var9 = param0 + var6 - wb.field_j;
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
              rk.b(wb.field_d, ((rk) this).field_p, ((rk) this).field_o, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
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
          var5 = ((rk) this).field_k;
          var6 = ((rk) this).field_h;
          var7 = 0;
          var8 = 0;
          var9 = ((rk) this).field_j;
          var10 = ((rk) this).field_i;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((rk) this).field_a <= 0) {
            break L0;
          } else {
            var13 = ((((rk) this).field_a << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((rk) this).field_a << 16));
            break L0;
          }
        }
        L1: {
          if (((rk) this).field_m <= 0) {
            break L1;
          } else {
            var13 = ((((rk) this).field_m << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((rk) this).field_m << 16));
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
          var13 = param0 + param1 * wb.field_h;
          var14 = wb.field_h - param2;
          if (param1 + param3 <= wb.field_b) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - wb.field_b);
            break L4;
          }
        }
        L5: {
          if (param1 >= wb.field_a) {
            break L5;
          } else {
            var15 = wb.field_a - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * wb.field_h;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= wb.field_j) {
            break L6;
          } else {
            var15 = param0 + param2 - wb.field_j;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= wb.field_i) {
            break L7;
          } else {
            var15 = wb.field_i - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        rk.b(wb.field_d, ((rk) this).field_p, ((rk) this).field_o, var7, var8, var13, var14, param2, param3, var11, var12, var5);
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
          var3 = ((rk) this).field_k >> 2;
          var4 = ((rk) this).field_h >> 2;
          param0 = param0 + ((rk) this).field_a / 4;
          param1 = param1 + ((rk) this).field_m / 4;
          if (param0 >= wb.field_i) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = wb.field_i - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= wb.field_j) {
            stackOut_5_0 = ((rk) this).field_k - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (wb.field_j - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= wb.field_a) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = wb.field_a - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= wb.field_b) {
            stackOut_11_0 = ((rk) this).field_h - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (wb.field_b - param1 << 2) - 4;
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
                var11 = var9 * ((rk) this).field_k + var10;
                var12 = (param1 + (var9 >> 2)) * wb.field_h + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    wb.field_d[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
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
                          var13 = ((rk) this).field_o[((rk) this).field_p[var11 + var16 * ((rk) this).field_k + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = wb.field_d[var12];
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

    final void a() {
        int var3 = 0;
        int var4 = 0;
        if (((rk) this).field_k == ((rk) this).field_j) {
            if (((rk) this).field_h == ((rk) this).field_i) {
                return;
            }
        }
        byte[] var1 = new byte[((rk) this).field_j * ((rk) this).field_i];
        int var2 = 0;
        for (var3 = 0; var3 < ((rk) this).field_h; var3++) {
            for (var4 = 0; var4 < ((rk) this).field_k; var4++) {
                int incrementValue$0 = var2;
                var2++;
                var1[var4 + ((rk) this).field_a + (var3 + ((rk) this).field_m) * ((rk) this).field_j] = ((rk) this).field_p[incrementValue$0];
            }
        }
        ((rk) this).field_p = var1;
        ((rk) this).field_k = ((rk) this).field_j;
        ((rk) this).field_h = ((rk) this).field_i;
        ((rk) this).field_a = 0;
        ((rk) this).field_m = 0;
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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var12 = 256 - param10;
        var13 = (param11 & 16711935) * var12 & -16711936;
        var14 = (param11 & 65280) * var12 & 16711680;
        param11 = (var13 | var14) >>> 8;
        var15 = -param7;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = -param6;
            L1: while (true) {
              if (var16 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var15++;
                continue L0;
              } else {
                int incrementValue$66 = param4;
                param4++;
                param3 = param2[param1[incrementValue$66] & 255];
                if (param3 == 0) {
                  param5++;
                  var16++;
                  continue L1;
                } else {
                  var13 = (param3 & 16711935) * param10 & -16711936;
                  var14 = (param3 & 65280) * param10 & 16711680;
                  int incrementValue$67 = param5;
                  param5++;
                  param0[incrementValue$67] = ((var13 | var14) >>> 8) + param11;
                  var16++;
                  continue L1;
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

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((rk) this).field_a;
            param1 = param1 + ((rk) this).field_m;
            var5 = param0 + param1 * wb.field_h;
            var6 = 0;
            var7 = ((rk) this).field_h;
            var8 = ((rk) this).field_k;
            var9 = wb.field_h - var8;
            var10 = 0;
            if (param1 >= wb.field_a) {
              break L0;
            } else {
              var11 = wb.field_a - param1;
              var7 = var7 - var11;
              param1 = wb.field_a;
              var6 = var6 + var11 * var8;
              var5 = var5 + var11 * wb.field_h;
              break L0;
            }
          }
          L1: {
            if (param1 + var7 <= wb.field_b) {
              break L1;
            } else {
              var7 = var7 - (param1 + var7 - wb.field_b);
              break L1;
            }
          }
          L2: {
            if (param0 >= wb.field_i) {
              break L2;
            } else {
              var11 = wb.field_i - param0;
              var8 = var8 - var11;
              param0 = wb.field_i;
              var6 = var6 + var11;
              var5 = var5 + var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L2;
            }
          }
          L3: {
            if (param0 + var8 <= wb.field_j) {
              break L3;
            } else {
              var11 = param0 + var8 - wb.field_j;
              var8 = var8 - var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L3;
            }
          }
          L4: {
            if (var8 <= 0) {
              break L4;
            } else {
              if (var7 > 0) {
                rk.a(wb.field_d, ((rk) this).field_p, ((rk) this).field_o, 0, var6, var5, var8, var7, var9, var10, param2, param3);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          ((rk) this).a(param0, param1);
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          param2 = param2 - (param0 + ((rk) this).field_a);
          if (param2 < 0) {
            break L0;
          } else {
            if (param2 < ((rk) this).field_k) {
              L1: {
                param3 = param3 - (param1 + ((rk) this).field_m);
                if (param3 < 0) {
                  break L1;
                } else {
                  if (param3 < ((rk) this).field_h) {
                    L2: {
                      if (((rk) this).field_p[param3 * ((rk) this).field_k + param2] == 0) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    return stackIn_9_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              return false;
            } else {
              break L0;
            }
          }
        }
        return false;
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
          param0 = param0 + ((rk) this).field_a;
          param1 = param1 + ((rk) this).field_m;
          var3 = param0 + param1 * wb.field_h;
          var4 = 0;
          var5 = ((rk) this).field_h;
          var6 = ((rk) this).field_k;
          var7 = wb.field_h - var6;
          var8 = 0;
          if (param1 >= wb.field_a) {
            break L0;
          } else {
            var9 = wb.field_a - param1;
            var5 = var5 - var9;
            param1 = wb.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wb.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wb.field_b) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wb.field_b);
            break L1;
          }
        }
        L2: {
          if (param0 >= wb.field_i) {
            break L2;
          } else {
            var9 = wb.field_i - param0;
            var6 = var6 - var9;
            param0 = wb.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wb.field_j) {
            break L3;
          } else {
            var9 = param0 + var6 - wb.field_j;
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
              rk.a(wb.field_d, ((rk) this).field_p, ((rk) this).field_o, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
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

    rk(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((rk) this).field_j = param0;
        ((rk) this).field_i = param1;
        ((rk) this).field_a = param2;
        ((rk) this).field_m = param3;
        ((rk) this).field_k = param4;
        ((rk) this).field_h = param5;
        ((rk) this).field_p = param6;
        ((rk) this).field_o = param7;
    }

    rk(int param0, int param1, int param2) {
        ((rk) this).field_k = param0;
        ((rk) this).field_j = param0;
        ((rk) this).field_h = param1;
        ((rk) this).field_i = param1;
        ((rk) this).field_m = 0;
        ((rk) this).field_a = 0;
        ((rk) this).field_p = new byte[param0 * param1];
        ((rk) this).field_o = new int[param2];
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
          param0 = param0 + ((rk) this).field_a;
          param1 = param1 + ((rk) this).field_m;
          var4 = param0 + param1 * wb.field_h;
          var5 = 0;
          var6 = ((rk) this).field_h;
          var7 = ((rk) this).field_k;
          var8 = wb.field_h - var7;
          var9 = 0;
          if (param1 >= wb.field_a) {
            break L0;
          } else {
            var10 = wb.field_a - param1;
            var6 = var6 - var10;
            param1 = wb.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * wb.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= wb.field_b) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - wb.field_b);
            break L1;
          }
        }
        L2: {
          if (param0 >= wb.field_i) {
            break L2;
          } else {
            var10 = wb.field_i - param0;
            var7 = var7 - var10;
            param0 = wb.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= wb.field_j) {
            break L3;
          } else {
            var10 = param0 + var7 - wb.field_j;
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
              rk.a(wb.field_d, ((rk) this).field_p, ((rk) this).field_o, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }
}
