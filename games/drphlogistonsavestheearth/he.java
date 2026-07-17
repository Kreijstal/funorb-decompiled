/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends pe {
    int[] field_l;
    byte[] field_m;

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

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                    param4--;
                    param3 = param2[param1[incrementValue$10] & 255];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param3;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$12 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$12] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    int incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param3;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$14 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$14] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    int incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param3;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$16 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$16] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    int incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param3;
                    break L5;
                  }
                }
                int incrementValue$18 = param4;
                param4--;
                param3 = param2[param1[incrementValue$18] & 255];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$19 = param5;
                  param5++;
                  param0[incrementValue$19] = param3;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = ((he) this).field_l.length - 1; var2 >= 0; var2--) {
            var3 = ((he) this).field_l[var2] >> 16 & 255;
            var3 = var3 * param0;
            var3 = var3 >> 8;
            if (var3 < 0) {
                var3 = 0;
            } else {
                if (var3 > 255) {
                    var3 = 255;
                }
            }
            var4 = ((he) this).field_l[var2] >> 8 & 255;
            var4 = var4 * param0;
            var4 = var4 >> 8;
            if (var4 < 0) {
                var4 = 0;
            } else {
                if (var4 > 255) {
                    var4 = 255;
                }
            }
            var5 = ((he) this).field_l[var2] & 255;
            var5 = var5 * param0;
            var5 = var5 >> 8;
            if (var5 < 0) {
                var5 = 0;
            } else {
                if (var5 > 255) {
                    var5 = 255;
                }
            }
            ((he) this).field_l[var2] = (var3 << 16) + (var4 << 8) + var5;
        }
    }

    final nh b() {
        int var3 = 0;
        int var1 = ((he) this).field_d * ((he) this).field_k;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((he) this).field_l[((he) this).field_m[var3] & 255];
        }
        return new nh(((he) this).field_h, ((he) this).field_c, ((he) this).field_a, ((he) this).field_f, ((he) this).field_d, ((he) this).field_k, var2);
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11) {
        param10 = -param11;
        L0: while (true) {
          if (param10 >= 0) {
            return;
          } else {
            L1: {
              param4 = param7;
              if (param2 <= 0) {
                break L1;
              } else {
                if (param1[param2 - 1] != -1) {
                  break L1;
                } else {
                  param4--;
                  param2++;
                  param3++;
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (param4 <= 0) {
                param3 = param3 + param8;
                param2 = param2 + param9;
                param10++;
                continue L0;
              } else {
                int incrementValue$211 = param2;
                param2++;
                param0 = param1[incrementValue$211];
                param4--;
                if (param0 == 0) {
                  param3++;
                  continue L2;
                } else {
                  if (param0 != -1) {
                    int incrementValue$212 = param3;
                    param3++;
                    param5[incrementValue$212] = param6[param0 & 255];
                    continue L2;
                  } else {
                    L3: {
                      int incrementValue$213 = param2;
                      param2++;
                      param0 = param1[incrementValue$213] & 255;
                      param4--;
                      param0 = param0 + param0;
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        param0 = param4;
                        break L3;
                      }
                    }
                    param2 = param2 + param0;
                    param4 = param4 - param0;
                    param3 = param3 + (param0 + 2);
                    continue L2;
                  }
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
          var3 = ((he) this).field_d >> 2;
          var4 = ((he) this).field_k >> 2;
          param0 = param0 + ((he) this).field_a / 4;
          param1 = param1 + ((he) this).field_f / 4;
          if (param0 >= wj.field_g) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = wj.field_g - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= wj.field_b) {
            stackOut_5_0 = ((he) this).field_d - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (wj.field_b - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= wj.field_e) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = wj.field_e - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= wj.field_j) {
            stackOut_11_0 = ((he) this).field_k - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (wj.field_j - param1 << 2) - 4;
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
                var11 = var9 * ((he) this).field_d + var10;
                var12 = (param1 + (var9 >> 2)) * wj.field_k + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    wj.field_l[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
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
                          var13 = ((he) this).field_l[((he) this).field_m[var11 + var16 * ((he) this).field_d + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = wj.field_l[var12];
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

    final void h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((he) this).field_l.length <= 255) {
          var1 = ((he) this).field_d * ((he) this).field_k - 1;
          var2 = ((he) this).field_k - 1;
          L0: while (true) {
            if (var2 < 0) {
              return;
            } else {
              var3 = 0;
              var4 = ((he) this).field_d - 1;
              L1: while (true) {
                if (var4 < 0) {
                  var2--;
                  continue L0;
                } else {
                  var5 = ((he) this).field_m[var1];
                  if (var5 != 0) {
                    var3 = 0;
                    var1--;
                    var4--;
                    continue L1;
                  } else {
                    L2: {
                      var3++;
                      if (var3 != 512) {
                        break L2;
                      } else {
                        var3 = 510;
                        break L2;
                      }
                    }
                    if ((var3 & 1) == 0) {
                      ((he) this).field_m[var1] = (byte) -1;
                      ((he) this).field_m[var1 + 1] = (byte)(var3 - 2 >> 1);
                      var1--;
                      var4--;
                      continue L1;
                    } else {
                      var1--;
                      var4--;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalStateException();
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
          param0 = param0 + ((he) this).field_a;
          param1 = param1 + ((he) this).field_f;
          var3 = param0 + param1 * wj.field_k;
          var4 = 0;
          var5 = ((he) this).field_k;
          var6 = ((he) this).field_d;
          var7 = wj.field_k - var6;
          var8 = 0;
          if (param1 >= wj.field_e) {
            break L0;
          } else {
            var9 = wj.field_e - param1;
            var5 = var5 - var9;
            param1 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wj.field_j) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wj.field_j);
            break L1;
          }
        }
        L2: {
          if (param0 >= wj.field_g) {
            break L2;
          } else {
            var9 = wj.field_g - param0;
            var6 = var6 - var9;
            param0 = wj.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wj.field_b) {
            break L3;
          } else {
            var9 = param0 + var6 - wj.field_b;
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
            he.b(wj.field_l, ((he) this).field_m, ((he) this).field_l, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final he a() {
        int var3 = 0;
        int var4 = 0;
        he var1 = new he(((he) this).field_d, ((he) this).field_k, ((he) this).field_l.length);
        var1.field_h = ((he) this).field_h;
        var1.field_c = ((he) this).field_c;
        var1.field_a = ((he) this).field_h - ((he) this).field_d - ((he) this).field_a;
        var1.field_f = ((he) this).field_f;
        int var2 = ((he) this).field_l.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_l[var3] = ((he) this).field_l[var3];
        }
        for (var3 = 0; var3 < ((he) this).field_k; var3++) {
            for (var4 = 0; var4 < ((he) this).field_d; var4++) {
                var1.field_m[var3 * ((he) this).field_d + var4] = ((he) this).field_m[var3 * ((he) this).field_d + ((he) this).field_d - 1 - var4];
            }
        }
        return var1;
    }

    final void d() {
        int var3 = 0;
        int var4 = 0;
        byte[] var1 = new byte[((he) this).field_d * ((he) this).field_k];
        int var2 = 0;
        for (var3 = ((he) this).field_d - 1; var3 >= 0; var3--) {
            for (var4 = 0; var4 < ((he) this).field_k; var4++) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((he) this).field_m[var3 + var4 * ((he) this).field_d];
            }
        }
        ((he) this).field_m = var1;
        var3 = ((he) this).field_a;
        ((he) this).field_a = ((he) this).field_f;
        ((he) this).field_f = ((he) this).field_h - ((he) this).field_d - var3;
        var3 = ((he) this).field_k;
        ((he) this).field_k = ((he) this).field_d;
        ((he) this).field_d = var3;
        var3 = ((he) this).field_c;
        ((he) this).field_c = ((he) this).field_h;
        ((he) this).field_h = var3;
    }

    final he e() {
        int var3 = 0;
        he var1 = new he(((he) this).field_d, ((he) this).field_k, ((he) this).field_l.length);
        var1.field_h = ((he) this).field_h;
        var1.field_c = ((he) this).field_c;
        var1.field_a = ((he) this).field_a;
        var1.field_f = ((he) this).field_f;
        int var2 = ((he) this).field_m.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_m[var3] = ((he) this).field_m[var3];
        }
        var2 = ((he) this).field_l.length;
        int var4 = 0;
        var3 = var4;
        while (var4 < var2) {
            var1.field_l[var4] = ((he) this).field_l[var4];
            var4++;
        }
        return var1;
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (((he) this).field_h - ((he) this).field_d - ((he) this).field_a);
          param1 = param1 + ((he) this).field_f;
          var3 = param0 + param1 * wj.field_k;
          var4 = ((he) this).field_d - 1;
          var5 = ((he) this).field_k;
          var6 = ((he) this).field_d;
          var7 = wj.field_k - var6;
          var8 = var6 + var6;
          if (param1 >= wj.field_e) {
            break L0;
          } else {
            var9 = wj.field_e - param1;
            var5 = var5 - var9;
            param1 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wj.field_j) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wj.field_j);
            break L1;
          }
        }
        L2: {
          if (param0 >= wj.field_g) {
            break L2;
          } else {
            var9 = wj.field_g - param0;
            var6 = var6 - var9;
            param0 = wj.field_g;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wj.field_b) {
            break L3;
          } else {
            var9 = param0 + var6 - wj.field_b;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            he.c(wj.field_l, ((he) this).field_m, ((he) this).field_l, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        param2 = param2 - (param0 + ((he) this).field_a);
        if (param2 < 0) {
          return false;
        } else {
          if (param2 < ((he) this).field_d) {
            L0: {
              param3 = param3 - (param1 + ((he) this).field_f);
              if (param3 < 0) {
                break L0;
              } else {
                if (param3 < ((he) this).field_k) {
                  L1: {
                    if (((he) this).field_m[param3 * ((he) this).field_d + param2] == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  return stackIn_11_0 != 0;
                } else {
                  break L0;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void i() {
        int var3 = 0;
        int var4 = 0;
        byte[] var1 = new byte[((he) this).field_d * ((he) this).field_k];
        int var2 = 0;
        for (var3 = 0; var3 < ((he) this).field_d; var3++) {
            for (var4 = ((he) this).field_k - 1; var4 >= 0; var4--) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((he) this).field_m[var3 + var4 * ((he) this).field_d];
            }
        }
        ((he) this).field_m = var1;
        var3 = ((he) this).field_f;
        ((he) this).field_f = ((he) this).field_a;
        ((he) this).field_a = ((he) this).field_c - ((he) this).field_k - var3;
        var3 = ((he) this).field_k;
        ((he) this).field_k = ((he) this).field_d;
        ((he) this).field_d = var3;
        var3 = ((he) this).field_c;
        ((he) this).field_c = ((he) this).field_h;
        ((he) this).field_h = var3;
    }

    final void f() {
        int var3 = 0;
        int var4 = 0;
        byte[] var1 = new byte[((he) this).field_d * ((he) this).field_k];
        int var2 = 0;
        for (var3 = ((he) this).field_k - 1; var3 >= 0; var3--) {
            for (var4 = 0; var4 < ((he) this).field_d; var4++) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((he) this).field_m[var4 + var3 * ((he) this).field_d];
            }
        }
        ((he) this).field_m = var1;
        ((he) this).field_f = ((he) this).field_c - ((he) this).field_k - ((he) this).field_f;
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((he) this).field_a;
            param1 = param1 + ((he) this).field_f;
            var5 = param0 + param1 * wj.field_k;
            var6 = 0;
            var7 = ((he) this).field_k;
            var8 = ((he) this).field_d;
            var9 = wj.field_k - var8;
            var10 = 0;
            if (param1 >= wj.field_e) {
              break L0;
            } else {
              var11 = wj.field_e - param1;
              var7 = var7 - var11;
              param1 = wj.field_e;
              var6 = var6 + var11 * var8;
              var5 = var5 + var11 * wj.field_k;
              break L0;
            }
          }
          L1: {
            if (param1 + var7 <= wj.field_j) {
              break L1;
            } else {
              var7 = var7 - (param1 + var7 - wj.field_j);
              break L1;
            }
          }
          L2: {
            if (param0 >= wj.field_g) {
              break L2;
            } else {
              var11 = wj.field_g - param0;
              var8 = var8 - var11;
              param0 = wj.field_g;
              var6 = var6 + var11;
              var5 = var5 + var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L2;
            }
          }
          L3: {
            if (param0 + var8 <= wj.field_b) {
              break L3;
            } else {
              var11 = param0 + var8 - wj.field_b;
              var8 = var8 - var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L3;
            }
          }
          if (var8 <= 0) {
            return;
          } else {
            if (var7 > 0) {
              he.b(wj.field_l, ((he) this).field_m, ((he) this).field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
              return;
            } else {
              return;
            }
          }
        } else {
          ((he) this).a(param0, param1);
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
          var5 = ((he) this).field_d;
          var6 = ((he) this).field_k;
          var7 = 0;
          var8 = 0;
          var9 = ((he) this).field_h;
          var10 = ((he) this).field_c;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((he) this).field_a <= 0) {
            break L0;
          } else {
            var13 = ((((he) this).field_a << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((he) this).field_a << 16));
            break L0;
          }
        }
        L1: {
          if (((he) this).field_f <= 0) {
            break L1;
          } else {
            var13 = ((((he) this).field_f << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((he) this).field_f << 16));
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
          var13 = param0 + param1 * wj.field_k;
          var14 = wj.field_k - param2;
          if (param1 + param3 <= wj.field_j) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - wj.field_j);
            break L4;
          }
        }
        L5: {
          if (param1 >= wj.field_e) {
            break L5;
          } else {
            var15 = wj.field_e - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * wj.field_k;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= wj.field_b) {
            break L6;
          } else {
            var15 = param0 + param2 - wj.field_b;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= wj.field_g) {
            break L7;
          } else {
            var15 = wj.field_g - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        he.a(wj.field_l, ((he) this).field_m, ((he) this).field_l, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    final void g() {
        int var3 = 0;
        int var4 = 0;
        byte[] var1 = new byte[((he) this).field_d * ((he) this).field_k];
        int var2 = 0;
        for (var3 = 0; var3 < ((he) this).field_k; var3++) {
            for (var4 = ((he) this).field_d - 1; var4 >= 0; var4--) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((he) this).field_m[var4 + var3 * ((he) this).field_d];
            }
        }
        ((he) this).field_m = var1;
        ((he) this).field_a = ((he) this).field_h - ((he) this).field_d - ((he) this).field_a;
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
          param0 = param0 + ((he) this).field_a;
          param1 = param1 + ((he) this).field_f;
          var4 = param0 + param1 * wj.field_k;
          var5 = 0;
          var6 = ((he) this).field_k;
          var7 = ((he) this).field_d;
          var8 = wj.field_k - var7;
          var9 = 0;
          if (param1 >= wj.field_e) {
            break L0;
          } else {
            var10 = wj.field_e - param1;
            var6 = var6 - var10;
            param1 = wj.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * wj.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= wj.field_j) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - wj.field_j);
            break L1;
          }
        }
        L2: {
          if (param0 >= wj.field_g) {
            break L2;
          } else {
            var10 = wj.field_g - param0;
            var7 = var7 - var10;
            param0 = wj.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= wj.field_b) {
            break L3;
          } else {
            var10 = param0 + var7 - wj.field_b;
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
            he.a(wj.field_l, ((he) this).field_m, ((he) this).field_l, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void c() {
        int var3 = 0;
        int var4 = 0;
        if (((he) this).field_d == ((he) this).field_h) {
            if (((he) this).field_k == ((he) this).field_c) {
                return;
            }
        }
        byte[] var1 = new byte[((he) this).field_h * ((he) this).field_c];
        int var2 = 0;
        for (var3 = 0; var3 < ((he) this).field_k; var3++) {
            for (var4 = 0; var4 < ((he) this).field_d; var4++) {
                int incrementValue$0 = var2;
                var2++;
                var1[var4 + ((he) this).field_a + (var3 + ((he) this).field_f) * ((he) this).field_h] = ((he) this).field_m[incrementValue$0];
            }
        }
        ((he) this).field_m = var1;
        ((he) this).field_d = ((he) this).field_h;
        ((he) this).field_k = ((he) this).field_c;
        ((he) this).field_a = 0;
        ((he) this).field_f = 0;
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

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((he) this).field_a;
          param1 = param1 + ((he) this).field_f;
          var3 = param0 + param1 * wj.field_k;
          var4 = 0;
          var5 = ((he) this).field_k;
          var6 = ((he) this).field_d;
          var7 = wj.field_k - var6;
          var8 = 0;
          if (param1 >= wj.field_e) {
            break L0;
          } else {
            var9 = wj.field_e - param1;
            var5 = var5 - var9;
            param1 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wj.field_j) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wj.field_j);
            break L1;
          }
        }
        L2: {
          if (param0 >= wj.field_g) {
            break L2;
          } else {
            var9 = wj.field_g - param0;
            var6 = var6 - var9;
            param0 = wj.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wj.field_b) {
            break L3;
          } else {
            var9 = param0 + var6 - wj.field_b;
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
            he.a(0, ((he) this).field_m, var4, var3, 0, wj.field_l, ((he) this).field_l, var6, var7, var8, 0, var5);
            return;
          } else {
            return;
          }
        }
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((he) this).field_a;
          param1 = param1 + ((he) this).field_f;
          var3 = param0 + param1 * wj.field_k;
          var4 = 0;
          var5 = ((he) this).field_k;
          var6 = ((he) this).field_d;
          var7 = wj.field_k - var6;
          var8 = 0;
          if (param1 >= wj.field_e) {
            break L0;
          } else {
            var9 = wj.field_e - param1;
            var5 = var5 - var9;
            param1 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= wj.field_j) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - wj.field_j);
            break L1;
          }
        }
        L2: {
          if (param0 >= wj.field_g) {
            break L2;
          } else {
            var9 = wj.field_g - param0;
            var6 = var6 - var9;
            param0 = wj.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= wj.field_b) {
            break L3;
          } else {
            var9 = param0 + var6 - wj.field_b;
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
            he.a(wj.field_l, ((he) this).field_m, ((he) this).field_l, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    he(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((he) this).field_h = param0;
        ((he) this).field_c = param1;
        ((he) this).field_a = param2;
        ((he) this).field_f = param3;
        ((he) this).field_d = param4;
        ((he) this).field_k = param5;
        ((he) this).field_m = param6;
        ((he) this).field_l = param7;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((he) this).field_d != ((he) this).field_h) {
            break L0;
          } else {
            if (((he) this).field_k != ((he) this).field_c) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var2 = param0;
          if (var2 <= ((he) this).field_a) {
            break L1;
          } else {
            var2 = ((he) this).field_a;
            break L1;
          }
        }
        L2: {
          var3 = param0;
          if (var3 + ((he) this).field_a + ((he) this).field_d <= ((he) this).field_h) {
            break L2;
          } else {
            var3 = ((he) this).field_h - ((he) this).field_a - ((he) this).field_d;
            break L2;
          }
        }
        L3: {
          var4 = param0;
          if (var4 <= ((he) this).field_f) {
            break L3;
          } else {
            var4 = ((he) this).field_f;
            break L3;
          }
        }
        L4: {
          var5 = param0;
          if (var5 + ((he) this).field_f + ((he) this).field_k <= ((he) this).field_c) {
            break L4;
          } else {
            var5 = ((he) this).field_c - ((he) this).field_f - ((he) this).field_k;
            break L4;
          }
        }
        var6 = ((he) this).field_d + var2 + var3;
        var7 = ((he) this).field_k + var4 + var5;
        var8 = new byte[var6 * var7];
        var9 = 0;
        L5: while (true) {
          if (var9 >= ((he) this).field_k) {
            ((he) this).field_m = var8;
            ((he) this).field_d = var6;
            ((he) this).field_k = var7;
            ((he) this).field_a = ((he) this).field_a - var2;
            ((he) this).field_f = ((he) this).field_f - var4;
            return;
          } else {
            var10 = 0;
            L6: while (true) {
              if (var10 >= ((he) this).field_d) {
                var9++;
                continue L5;
              } else {
                var8[(var9 + var4) * var6 + (var10 + var2)] = ((he) this).field_m[var9 * ((he) this).field_d + var10];
                var10++;
                continue L6;
              }
            }
          }
        }
    }

    he(int param0, int param1, int param2) {
        ((he) this).field_d = param0;
        ((he) this).field_h = param0;
        ((he) this).field_k = param1;
        ((he) this).field_c = param1;
        ((he) this).field_f = 0;
        ((he) this).field_a = 0;
        ((he) this).field_m = new byte[param0 * param1];
        ((he) this).field_l = new int[param2];
    }
}
