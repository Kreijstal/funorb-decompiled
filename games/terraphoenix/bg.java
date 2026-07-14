/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends td {
    byte[] field_l;
    int[] field_m;

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -param6;
        L0: while (true) {
          if (var13 >= 0) {
            return;
          } else {
            var14 = -param5;
            L1: while (true) {
              if (var14 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var13++;
                continue L0;
              } else {
                param3++;
                var15 = param1[param3];
                if (var15 == 0) {
                  param4++;
                  var14++;
                  continue L1;
                } else {
                  L2: {
                    var15 = param2[var15 & 255];
                    var16 = var15 >> 16 & 255;
                    var17 = var15 >> 8 & 255;
                    var18 = var15 & 255;
                    if (var16 != var17) {
                      break L2;
                    } else {
                      if (var17 != var18) {
                        break L2;
                      } else {
                        param4++;
                        param0[param4] = (var16 * var10 >> 8 << 16) + (var17 * var11 >> 8 << 8) + (var18 * var12 >> 8);
                        var14++;
                        continue L1;
                      }
                    }
                  }
                  param4++;
                  param0[param4] = var15;
                  var14++;
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
          param0 = param0 + ((bg) this).field_g;
          param1 = param1 + ((bg) this).field_d;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((bg) this).field_c;
          var7 = ((bg) this).field_k;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
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
              bg.d(l.field_i, ((bg) this).field_l, ((bg) this).field_m, var5, var4, var7, var6, var8, var9, param2);
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

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((bg) this).field_g;
          param1 = param1 + ((bg) this).field_d;
          var3 = param0 + param1 * l.field_k;
          var4 = 0;
          var5 = ((bg) this).field_c;
          var6 = ((bg) this).field_k;
          var7 = l.field_k - var6;
          var8 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var9 = l.field_d - param1;
            var5 = var5 - var9;
            param1 = l.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= l.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var9 = l.field_b - param0;
            var6 = var6 - var9;
            param0 = l.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= l.field_f) {
            break L3;
          } else {
            var9 = param0 + var6 - l.field_f;
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
              bg.a(l.field_i, ((bg) this).field_l, ((bg) this).field_m, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((bg) this).field_g;
          param1 = param1 + ((bg) this).field_d;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((bg) this).field_c;
          var7 = ((bg) this).field_k;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
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
              bg.c(l.field_i, ((bg) this).field_l, ((bg) this).field_m, var5, var4, var7, var6, var8, var9, param2);
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
        L0: {
          param0 = param0 + ((bg) this).field_g;
          param1 = param1 + ((bg) this).field_d;
          var3 = param0 + param1 * l.field_k;
          var4 = 0;
          var5 = ((bg) this).field_c;
          var6 = ((bg) this).field_k;
          var7 = l.field_k - var6;
          var8 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var9 = l.field_d - param1;
            var5 = var5 - var9;
            param1 = l.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= l.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var9 = l.field_b - param0;
            var6 = var6 - var9;
            param0 = l.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= l.field_f) {
            break L3;
          } else {
            var9 = param0 + var6 - l.field_f;
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
              bg.a(l.field_i, ((bg) this).field_l, ((bg) this).field_m, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final bg a() {
        int var3 = 0;
        int var4 = 0;
        bg var1 = new bg(((bg) this).field_k, ((bg) this).field_c, ((bg) this).field_m.length);
        var1.field_f = ((bg) this).field_f;
        var1.field_i = ((bg) this).field_i;
        var1.field_g = ((bg) this).field_f - ((bg) this).field_k - ((bg) this).field_g;
        var1.field_d = ((bg) this).field_d;
        int var2 = ((bg) this).field_m.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_m[var3] = ((bg) this).field_m[var3];
        }
        for (var3 = 0; var3 < ((bg) this).field_c; var3++) {
            for (var4 = 0; var4 < ((bg) this).field_k; var4++) {
                var1.field_l[var3 * ((bg) this).field_k + var4] = ((bg) this).field_l[var3 * ((bg) this).field_k + ((bg) this).field_k - 1 - var4];
            }
        }
        return var1;
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
                    param4--;
                    param3 = param2[param1[param4] & 255];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param0[param5] = param3;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L3;
                  }
                }
                L4: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L4;
                  }
                }
                L5: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L5;
                  }
                }
                param4--;
                param3 = param2[param1[param4] & 255];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param0[param5] = param3;
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var5 = ((bg) this).field_k;
          var6 = ((bg) this).field_c;
          var7 = 0;
          var8 = 0;
          var9 = ((bg) this).field_f;
          var10 = ((bg) this).field_i;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((bg) this).field_g <= 0) {
            break L0;
          } else {
            var13 = ((((bg) this).field_g << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((bg) this).field_g << 16));
            break L0;
          }
        }
        L1: {
          if (((bg) this).field_d <= 0) {
            break L1;
          } else {
            var13 = ((((bg) this).field_d << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((bg) this).field_d << 16));
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
          var13 = param0 + param1 * l.field_k;
          var14 = l.field_k - param2;
          if (param1 + param3 <= l.field_c) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - l.field_c);
            break L4;
          }
        }
        L5: {
          if (param1 >= l.field_d) {
            break L5;
          } else {
            var15 = l.field_d - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * l.field_k;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= l.field_f) {
            break L6;
          } else {
            var15 = param0 + param2 - l.field_f;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= l.field_b) {
            break L7;
          } else {
            var15 = l.field_b - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        bg.a(l.field_i, ((bg) this).field_l, ((bg) this).field_m, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    private final static void d(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final ci b() {
        int var3 = 0;
        int var1 = ((bg) this).field_k * ((bg) this).field_c;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((bg) this).field_m[((bg) this).field_l[var3] & 255];
        }
        return new ci(((bg) this).field_f, ((bg) this).field_i, ((bg) this).field_g, ((bg) this).field_d, ((bg) this).field_k, ((bg) this).field_c, var2);
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
          param0 = param0 + (((bg) this).field_f - ((bg) this).field_k - ((bg) this).field_g);
          param1 = param1 + ((bg) this).field_d;
          var3 = param0 + param1 * l.field_k;
          var4 = ((bg) this).field_k - 1;
          var5 = ((bg) this).field_c;
          var6 = ((bg) this).field_k;
          var7 = l.field_k - var6;
          var8 = var6 + var6;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var9 = l.field_d - param1;
            var5 = var5 - var9;
            param1 = l.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= l.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var9 = l.field_b - param0;
            var6 = var6 - var9;
            param0 = l.field_b;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= l.field_f) {
            break L3;
          } else {
            var9 = param0 + var6 - l.field_f;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              bg.b(l.field_i, ((bg) this).field_l, ((bg) this).field_m, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    bg(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((bg) this).field_f = param0;
        ((bg) this).field_i = param1;
        ((bg) this).field_g = param2;
        ((bg) this).field_d = param3;
        ((bg) this).field_k = param4;
        ((bg) this).field_c = param5;
        ((bg) this).field_l = param6;
        ((bg) this).field_m = param7;
    }

    bg(int param0, int param1, int param2) {
        ((bg) this).field_k = param0;
        ((bg) this).field_f = param0;
        ((bg) this).field_c = param1;
        ((bg) this).field_i = param1;
        ((bg) this).field_d = 0;
        ((bg) this).field_g = 0;
        ((bg) this).field_l = new byte[param0 * param1];
        ((bg) this).field_m = new int[param2];
    }
}
