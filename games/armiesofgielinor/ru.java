/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ru extends si {
    int[] field_j;
    byte[] field_k;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
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
                param4++;
                param3 = param2[param1[param4] & 255];
                if (param3 == 0) {
                  param5++;
                  var16++;
                  continue L1;
                } else {
                  var13 = (param3 & 16711935) * param10 & -16711936;
                  var14 = (param3 & 65280) * param10 & 16711680;
                  param5++;
                  param0[param5] = ((var13 | var14) >>> 8) + param11;
                  var16++;
                  continue L1;
                }
              }
            }
          }
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
          param0 = param0 + ((ru) this).field_i;
          param1 = param1 + ((ru) this).field_d;
          var3 = param0 + param1 * qn.field_l;
          var4 = 0;
          var5 = ((ru) this).field_h;
          var6 = ((ru) this).field_e;
          var7 = qn.field_l - var6;
          var8 = 0;
          if (param1 >= qn.field_a) {
            break L0;
          } else {
            var9 = qn.field_a - param1;
            var5 = var5 - var9;
            param1 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= qn.field_f) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= qn.field_j) {
            break L2;
          } else {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= qn.field_e) {
            break L3;
          } else {
            var9 = param0 + var6 - qn.field_e;
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
              ru.a(qn.field_d, ((ru) this).field_k, ((ru) this).field_j, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final wk a() {
        int var3 = 0;
        int var1 = ((ru) this).field_e * ((ru) this).field_h;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((ru) this).field_j[((ru) this).field_k[var3] & 255];
        }
        return new wk(((ru) this).field_g, ((ru) this).field_f, ((ru) this).field_i, ((ru) this).field_d, ((ru) this).field_e, ((ru) this).field_h, var2);
    }

    final void d(int param0, int param1) {
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
          var3 = ((ru) this).field_e >> 1;
          var4 = ((ru) this).field_h >> 1;
          param0 = param0 + ((ru) this).field_i / 2;
          param1 = param1 + ((ru) this).field_d / 2;
          if (param0 >= qn.field_j) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qn.field_j - param0 << 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= qn.field_e) {
            stackOut_5_0 = ((ru) this).field_e - 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (qn.field_e - param0 << 1) - 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= qn.field_a) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = qn.field_a - param1 << 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= qn.field_f) {
            stackOut_11_0 = ((ru) this).field_h - 2;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (qn.field_f - param1 << 1) - 2;
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
                var12 = var10 * ((ru) this).field_e + var11;
                var13 = (param1 + (var10 >> 1)) * qn.field_l + (param0 + (var11 >> 1));
                var9[0] = ((ru) this).field_j[((ru) this).field_k[var12] & 255];
                var9[1] = ((ru) this).field_j[((ru) this).field_k[var12 + 1] & 255];
                var9[2] = ((ru) this).field_j[((ru) this).field_k[var12 + ((ru) this).field_e] & 255];
                var9[3] = ((ru) this).field_j[((ru) this).field_k[var12 + 1] & 255];
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                L6: while (true) {
                  if (var17 >= 4) {
                    qn.field_d[var13] = var14 >> 2 << 16 | var15 >> 2 << 8 | var16 >> 2;
                    var11 += 2;
                    continue L5;
                  } else {
                    L7: {
                      if (var21[var17] != 0) {
                        break L7;
                      } else {
                        var9[var17] = qn.field_d[var13];
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

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((ru) this).field_i;
            param1 = param1 + ((ru) this).field_d;
            var5 = param0 + param1 * qn.field_l;
            var6 = 0;
            var7 = ((ru) this).field_h;
            var8 = ((ru) this).field_e;
            var9 = qn.field_l - var8;
            var10 = 0;
            if (param1 >= qn.field_a) {
              break L0;
            } else {
              var11 = qn.field_a - param1;
              var7 = var7 - var11;
              param1 = qn.field_a;
              var6 = var6 + var11 * var8;
              var5 = var5 + var11 * qn.field_l;
              break L0;
            }
          }
          L1: {
            if (param1 + var7 <= qn.field_f) {
              break L1;
            } else {
              var7 = var7 - (param1 + var7 - qn.field_f);
              break L1;
            }
          }
          L2: {
            if (param0 >= qn.field_j) {
              break L2;
            } else {
              var11 = qn.field_j - param0;
              var8 = var8 - var11;
              param0 = qn.field_j;
              var6 = var6 + var11;
              var5 = var5 + var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L2;
            }
          }
          L3: {
            if (param0 + var8 <= qn.field_e) {
              break L3;
            } else {
              var11 = param0 + var8 - qn.field_e;
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
                ru.b(qn.field_d, ((ru) this).field_k, ((ru) this).field_j, 0, var6, var5, var8, var7, var9, var10, param2, param3);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          ((ru) this).a(param0, param1);
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = var9; var11 < 0; var11++) {
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
            }
            for (var11 = param5; var11 < 0; var11++) {
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
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
          param0 = param0 + ((ru) this).field_i;
          param1 = param1 + ((ru) this).field_d;
          var3 = param0 + param1 * qn.field_l;
          var4 = 0;
          var5 = ((ru) this).field_h;
          var6 = ((ru) this).field_e;
          var7 = qn.field_l - var6;
          var8 = 0;
          if (param1 >= qn.field_a) {
            break L0;
          } else {
            var9 = qn.field_a - param1;
            var5 = var5 - var9;
            param1 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= qn.field_f) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= qn.field_j) {
            break L2;
          } else {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= qn.field_e) {
            break L3;
          } else {
            var9 = param0 + var6 - qn.field_e;
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
              ru.b(qn.field_d, ((ru) this).field_k, ((ru) this).field_j, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
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

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ru) this).field_i;
          param1 = param1 + ((ru) this).field_d;
          var4 = param0 + param1 * qn.field_l;
          var5 = 0;
          var6 = ((ru) this).field_h;
          var7 = ((ru) this).field_e;
          var8 = qn.field_l - var7;
          var9 = 0;
          if (param1 >= qn.field_a) {
            break L0;
          } else {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= qn.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= qn.field_j) {
            break L2;
          } else {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= qn.field_e) {
            break L3;
          } else {
            var10 = param0 + var7 - qn.field_e;
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
              ru.a(qn.field_d, ((ru) this).field_k, ((ru) this).field_j, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
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
          var3 = ((ru) this).field_e >> 2;
          var4 = ((ru) this).field_h >> 2;
          param0 = param0 + ((ru) this).field_i / 4;
          param1 = param1 + ((ru) this).field_d / 4;
          if (param0 >= qn.field_j) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qn.field_j - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= qn.field_e) {
            stackOut_5_0 = ((ru) this).field_e - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (qn.field_e - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= qn.field_a) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = qn.field_a - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= qn.field_f) {
            stackOut_11_0 = ((ru) this).field_h - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (qn.field_f - param1 << 2) - 4;
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
                var11 = var9 * ((ru) this).field_e + var10;
                var12 = (param1 + (var9 >> 2)) * qn.field_l + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    qn.field_d[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
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
                          var13 = ((ru) this).field_j[((ru) this).field_k[var11 + var16 * ((ru) this).field_e + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = qn.field_d[var12];
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

    ru(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((ru) this).field_g = param0;
        ((ru) this).field_f = param1;
        ((ru) this).field_i = param2;
        ((ru) this).field_d = param3;
        ((ru) this).field_e = param4;
        ((ru) this).field_h = param5;
        ((ru) this).field_k = param6;
        ((ru) this).field_j = param7;
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          param2 = param2 - (param0 + ((ru) this).field_i);
          if (param2 < 0) {
            break L0;
          } else {
            if (param2 < ((ru) this).field_e) {
              L1: {
                param3 = param3 - (param1 + ((ru) this).field_d);
                if (param3 < 0) {
                  break L1;
                } else {
                  if (param3 < ((ru) this).field_h) {
                    L2: {
                      if (((ru) this).field_k[param3 * ((ru) this).field_e + param2] == 0) {
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
          var5 = ((ru) this).field_e;
          var6 = ((ru) this).field_h;
          var7 = 0;
          var8 = 0;
          var9 = ((ru) this).field_g;
          var10 = ((ru) this).field_f;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((ru) this).field_i <= 0) {
            break L0;
          } else {
            var13 = ((((ru) this).field_i << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((ru) this).field_i << 16));
            break L0;
          }
        }
        L1: {
          if (((ru) this).field_d <= 0) {
            break L1;
          } else {
            var13 = ((((ru) this).field_d << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((ru) this).field_d << 16));
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
          var13 = param0 + param1 * qn.field_l;
          var14 = qn.field_l - param2;
          if (param1 + param3 <= qn.field_f) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - qn.field_f);
            break L4;
          }
        }
        L5: {
          if (param1 >= qn.field_a) {
            break L5;
          } else {
            var15 = qn.field_a - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * qn.field_l;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= qn.field_e) {
            break L6;
          } else {
            var15 = param0 + param2 - qn.field_e;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= qn.field_j) {
            break L7;
          } else {
            var15 = qn.field_j - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        ru.a(qn.field_d, ((ru) this).field_k, ((ru) this).field_j, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    ru(int param0, int param1, int param2) {
        ((ru) this).field_e = param0;
        ((ru) this).field_g = param0;
        ((ru) this).field_h = param1;
        ((ru) this).field_f = param1;
        ((ru) this).field_d = 0;
        ((ru) this).field_i = 0;
        ((ru) this).field_k = new byte[param0 * param1];
        ((ru) this).field_j = new int[param2];
    }
}
