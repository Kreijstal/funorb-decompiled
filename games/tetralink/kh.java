/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends oi {
    int[] field_p;
    byte[] field_o;

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (this.field_j - this.field_b - this.field_k);
          param1 = param1 + this.field_h;
          var3 = param0 + param1 * ra.field_f;
          var4 = this.field_b - 1;
          var5 = this.field_d;
          var6 = this.field_b;
          var7 = ra.field_f - var6;
          var8 = var6 + var6;
          if (param1 >= ra.field_i) {
            break L0;
          } else {
            var9 = ra.field_i - param1;
            var5 = var5 - var9;
            param1 = ra.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ra.field_f;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ra.field_g) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ra.field_g);
            break L1;
          }
        }
        L2: {
          if (param0 >= ra.field_j) {
            break L2;
          } else {
            var9 = ra.field_j - param0;
            var6 = var6 - var9;
            param0 = ra.field_j;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ra.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - ra.field_l;
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
              kh.a(ra.field_b, this.field_o, this.field_p, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
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
                incrementValue$66 = param3;
                param3++;
                var13 = param1[incrementValue$66];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  incrementValue$67 = param4;
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

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
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
                    incrementValue$10 = param4;
                    param4++;
                    param3 = param1[incrementValue$10];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param4;
                  param4++;
                  param3 = param1[incrementValue$12];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param4;
                  param4++;
                  param3 = param1[incrementValue$14];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param4;
                  param4++;
                  param3 = param1[incrementValue$16];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param2[param3 & 255];
                    break L5;
                  }
                }
                incrementValue$18 = param4;
                param4++;
                param3 = param1[incrementValue$18];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$19 = param5;
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

    final void a() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        if (this.field_b == this.field_j) {
            if (this.field_d == this.field_f) {
                return;
            }
        }
        byte[] var1 = new byte[this.field_j * this.field_f];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_d; var3++) {
            for (var4 = 0; var4 < this.field_b; var4++) {
                incrementValue$0 = var2;
                var2++;
                var1[var4 + this.field_k + (var3 + this.field_h) * this.field_j] = this.field_o[incrementValue$0];
            }
        }
        this.field_o = var1;
        this.field_b = this.field_j;
        this.field_d = this.field_f;
        this.field_k = 0;
        this.field_h = 0;
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
          param0 = param0 + this.field_k;
          param1 = param1 + this.field_h;
          var3 = param0 + param1 * ra.field_f;
          var4 = 0;
          var5 = this.field_d;
          var6 = this.field_b;
          var7 = ra.field_f - var6;
          var8 = 0;
          if (param1 >= ra.field_i) {
            break L0;
          } else {
            var9 = ra.field_i - param1;
            var5 = var5 - var9;
            param1 = ra.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ra.field_f;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ra.field_g) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ra.field_g);
            break L1;
          }
        }
        L2: {
          if (param0 >= ra.field_j) {
            break L2;
          } else {
            var9 = ra.field_j - param0;
            var6 = var6 - var9;
            param0 = ra.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ra.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - ra.field_l;
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
              kh.c(ra.field_b, this.field_o, this.field_p, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
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
          param0 = param0 + this.field_k;
          param1 = param1 + this.field_h;
          var4 = param0 + param1 * ra.field_f;
          var5 = 0;
          var6 = this.field_d;
          var7 = this.field_b;
          var8 = ra.field_f - var7;
          var9 = 0;
          if (param1 >= ra.field_i) {
            break L0;
          } else {
            var10 = ra.field_i - param1;
            var6 = var6 - var10;
            param1 = ra.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * ra.field_f;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= ra.field_g) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - ra.field_g);
            break L1;
          }
        }
        L2: {
          if (param0 >= ra.field_j) {
            break L2;
          } else {
            var10 = ra.field_j - param0;
            var7 = var7 - var10;
            param0 = ra.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= ra.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - ra.field_l;
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
              kh.b(ra.field_b, this.field_o, this.field_p, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
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
                    incrementValue$10 = param4;
                    param4--;
                    param3 = param2[param1[incrementValue$10] & 255];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param3;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$12] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param3;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$14] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param3;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$16] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param3;
                    break L5;
                  }
                }
                incrementValue$18 = param4;
                param4--;
                param3 = param2[param1[incrementValue$18] & 255];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$19 = param5;
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

    kh(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_j = param0;
        this.field_f = param1;
        this.field_k = param2;
        this.field_h = param3;
        this.field_b = param4;
        this.field_d = param5;
        this.field_o = param6;
        this.field_p = param7;
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
          var5 = this.field_b;
          var6 = this.field_d;
          var7 = 0;
          var8 = 0;
          var9 = this.field_j;
          var10 = this.field_f;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (this.field_k <= 0) {
            break L0;
          } else {
            var13 = ((this.field_k << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.field_k << 16));
            break L0;
          }
        }
        L1: {
          if (this.field_h <= 0) {
            break L1;
          } else {
            var13 = ((this.field_h << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (this.field_h << 16));
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
          var13 = param0 + param1 * ra.field_f;
          var14 = ra.field_f - param2;
          if (param1 + param3 <= ra.field_g) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - ra.field_g);
            break L4;
          }
        }
        L5: {
          if (param1 >= ra.field_i) {
            break L5;
          } else {
            var15 = ra.field_i - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * ra.field_f;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= ra.field_l) {
            break L6;
          } else {
            var15 = param0 + param2 - ra.field_l;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= ra.field_j) {
            break L7;
          } else {
            var15 = ra.field_j - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        kh.a(ra.field_b, this.field_o, this.field_p, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    kh(int param0, int param1, int param2) {
        this.field_b = param0;
        this.field_j = param0;
        this.field_d = param1;
        this.field_f = param1;
        this.field_h = 0;
        this.field_k = 0;
        this.field_o = new byte[param0 * param1];
        this.field_p = new int[param2];
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                var16 = param1[(param3 >> 16) + var14];
                if (var16 != 0) {
                    incrementValue$1 = param5;
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
}
