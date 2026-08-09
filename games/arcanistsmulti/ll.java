/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends s {
    int[] field_l;
    byte[] field_m;

    final void c(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        L0: {
          var3 = this.field_h >> 1;
          var4 = this.field_c >> 1;
          param0 = param0 + this.field_j / 2;
          param1 = param1 + this.field_f / 2;
          if (param0 >= de.field_i) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = de.field_i - param0 << 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= de.field_h) {
            stackIn_6_0 = this.field_h - 2;
            break L1;
          } else {
            stackIn_6_0 = (de.field_h - param0 << 1) - 2;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= de.field_c) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = de.field_c - param1 << 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= de.field_k) {
            stackIn_12_0 = this.field_c - 2;
            break L3;
          } else {
            stackIn_12_0 = (de.field_k - param1 << 1) - 2;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var19 = new int[4];
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
                var12 = var10 * this.field_h + var11;
                var13 = (param1 + (var10 >> 1)) * de.field_e + (param0 + (var11 >> 1));
                var9[0] = this.field_l[this.field_m[var12] & 255];
                var9[1] = this.field_l[this.field_m[var12 + 1] & 255];
                var9[2] = this.field_l[this.field_m[var12 + this.field_h] & 255];
                var9[3] = this.field_l[this.field_m[var12 + 1] & 255];
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                L6: while (true) {
                  if (var17 >= 4) {
                    de.field_l[var13] = var14 >> 2 << 16 | var15 >> 2 << 8 | var16 >> 2;
                    var11 += 2;
                    continue L5;
                  } else {
                    L7: {
                      if (var19[var17] != 0) {
                        break L7;
                      } else {
                        var9[var17] = de.field_l[var13];
                        break L7;
                      }
                    }
                    var14 = var14 + (var19[var17] >> 16 & 255);
                    var15 = var15 + (var19[var17] >> 8 & 255);
                    var16 = var16 + (var19[var17] & 255);
                    var17++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var10;
        int var11;
        int var12;
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
                    incrementValue$0 = param4;
                    param4--;
                    param3 = param2[param1[incrementValue$0] & 255];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$1 = param5;
                      param5++;
                      param0[incrementValue$1] = param3;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$2 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$2] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$3 = param5;
                    param5++;
                    param0[incrementValue$3] = param3;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$4 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$5 = param5;
                    param5++;
                    param0[incrementValue$5] = param3;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$6 = param4;
                  param4--;
                  param3 = param2[param1[incrementValue$6] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$7 = param5;
                    param5++;
                    param0[incrementValue$7] = param3;
                    break L5;
                  }
                }
                incrementValue$8 = param4;
                param4--;
                param3 = param2[param1[incrementValue$8] & 255];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$9 = param5;
                  param5++;
                  param0[incrementValue$9] = param3;
                  var12++;
                  continue L1;
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

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var10;
        int var11;
        int var12;
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
                    incrementValue$0 = param4;
                    param4++;
                    param3 = param1[incrementValue$0];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$1 = param5;
                      param5++;
                      param0[incrementValue$1] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$2 = param4;
                  param4++;
                  param3 = param1[incrementValue$2];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$3 = param5;
                    param5++;
                    param0[incrementValue$3] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$4 = param4;
                  param4++;
                  param3 = param1[incrementValue$4];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$5 = param5;
                    param5++;
                    param0[incrementValue$5] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$6 = param4;
                  param4++;
                  param3 = param1[incrementValue$6];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$7 = param5;
                    param5++;
                    param0[incrementValue$7] = param2[param3 & 255];
                    break L5;
                  }
                }
                incrementValue$8 = param4;
                param4++;
                param3 = param1[incrementValue$8];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$9 = param5;
                  param5++;
                  param0[incrementValue$9] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var5 = this.field_h;
        int var6 = this.field_c;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_g;
        int var10 = this.field_k;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        if (this.field_j > 0) {
            var13 = ((this.field_j << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.field_j << 16));
        }
        if (this.field_f > 0) {
            var13 = ((this.field_f << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (this.field_f << 16));
        }
        if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13 = param0 + param1 * de.field_e;
        int var14 = de.field_e - param2;
        if (param1 + param3 > de.field_k) {
            param3 = param3 - (param1 + param3 - de.field_k);
        }
        if (param1 < de.field_c) {
            var15 = de.field_c - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * de.field_e;
            var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > de.field_h) {
            var15 = param0 + param2 - de.field_h;
            param2 = param2 - var15;
            var14 = var14 + var15;
        }
        if (param0 < de.field_i) {
            var15 = de.field_i - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
        }
        ll.a(de.field_l, this.field_m, this.field_l, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    final ll a() {
        int var4 = 0;
        int var3 = 0;
        ll var1 = new ll(this.field_h, this.field_c, this.field_l.length);
        var1.field_g = this.field_g;
        var1.field_k = this.field_k;
        var1.field_j = this.field_g - this.field_h - this.field_j;
        var1.field_f = this.field_f;
        int var2 = this.field_l.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_l[var3] = this.field_l[var3];
        }
        for (var3 = 0; var3 < this.field_c; var3++) {
            for (var4 = 0; var4 < this.field_h; var4++) {
                var1.field_m[var3 * this.field_h + var4] = this.field_m[var3 * this.field_h + this.field_h - 1 - var4];
            }
        }
        return var1;
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_f;
        int var4 = param0 + param1 * de.field_e;
        int var5 = 0;
        int var6 = this.field_c;
        int var7 = this.field_h;
        int var8 = de.field_e - var7;
        int var9 = 0;
        if (param1 < de.field_c) {
            var10 = de.field_c - param1;
            var6 = var6 - var10;
            param1 = de.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * de.field_e;
        }
        if (param1 + var6 > de.field_k) {
            var6 = var6 - (param1 + var6 - de.field_k);
        }
        if (param0 < de.field_i) {
            var10 = de.field_i - param0;
            var7 = var7 - var10;
            param0 = de.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > de.field_h) {
            var10 = param0 + var7 - de.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        ll.d(de.field_l, this.field_m, this.field_l, var5, var4, var7, var6, var8, var9, param2);
    }

    final void c() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_h * this.field_c];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_c; var3++) {
            for (var4 = this.field_h - 1; var4 >= 0; var4--) {
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = this.field_m[var4 + var3 * this.field_h];
            }
        }
        this.field_m = var1;
        this.field_j = this.field_g - this.field_h - this.field_j;
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
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
                incrementValue$11 = param4;
                param4++;
                param3 = param2[param1[incrementValue$11] & 255];
                if (param3 == 0) {
                  param5++;
                  var16++;
                  continue L1;
                } else {
                  var13 = (param3 & 16711935) * param10 & -16711936;
                  var14 = (param3 & 65280) * param10 & 16711680;
                  incrementValue$12 = param5;
                  param5++;
                  param0[incrementValue$12] = ((var13 | var14) >>> 8) + param11;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void d(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
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
                incrementValue$11 = param3;
                param3++;
                var13 = param1[incrementValue$11];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        L0: {
          var3 = this.field_h >> 2;
          var4 = this.field_c >> 2;
          param0 = param0 + this.field_j / 4;
          param1 = param1 + this.field_f / 4;
          if (param0 >= de.field_i) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = de.field_i - param0 << 2;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= de.field_h) {
            stackIn_6_0 = this.field_h - 4;
            break L1;
          } else {
            stackIn_6_0 = (de.field_h - param0 << 2) - 4;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= de.field_c) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = de.field_c - param1 << 2;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= de.field_k) {
            stackIn_12_0 = this.field_c - 4;
            break L3;
          } else {
            stackIn_12_0 = (de.field_k - param1 << 2) - 4;
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
                var11 = var9 * this.field_h + var10;
                var12 = (param1 + (var9 >> 2)) * de.field_e + (param0 + (var10 >> 2));
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    de.field_l[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
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
                          var13 = this.field_l[this.field_m[var11 + var16 * this.field_h + var17] & 255];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = de.field_l[var12];
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

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_f;
        int var4 = param0 + param1 * de.field_e;
        int var5 = 0;
        int var6 = this.field_c;
        int var7 = this.field_h;
        int var8 = de.field_e - var7;
        int var9 = 0;
        if (param1 < de.field_c) {
            var10 = de.field_c - param1;
            var6 = var6 - var10;
            param1 = de.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * de.field_e;
        }
        if (param1 + var6 > de.field_k) {
            var6 = var6 - (param1 + var6 - de.field_k);
        }
        if (param0 < de.field_i) {
            var10 = de.field_i - param0;
            var7 = var7 - var10;
            param0 = de.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > de.field_h) {
            var10 = param0 + var7 - de.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        ll.c(de.field_l, this.field_m, this.field_l, var5, var4, var7, var6, var8, var9, param2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        if (param2 == 256) {
            this.a(param0, param1);
            return;
        }
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_f;
        int var5 = param0 + param1 * de.field_e;
        int var6 = 0;
        int var7 = this.field_c;
        int var8 = this.field_h;
        int var9 = de.field_e - var8;
        int var10 = 0;
        if (param1 < de.field_c) {
            var11 = de.field_c - param1;
            var7 = var7 - var11;
            param1 = de.field_c;
            var6 = var6 + var11 * var8;
            var5 = var5 + var11 * de.field_e;
        }
        if (param1 + var7 > de.field_k) {
            var7 = var7 - (param1 + var7 - de.field_k);
        }
        if (param0 < de.field_i) {
            var11 = de.field_i - param0;
            var8 = var8 - var11;
            param0 = de.field_i;
            var6 = var6 + var11;
            var5 = var5 + var11;
            var10 = var10 + var11;
            var9 = var9 + var11;
        }
        if (param0 + var8 > de.field_h) {
            var11 = param0 + var8 - de.field_h;
            var8 = var8 - var11;
            var10 = var10 + var11;
            var9 = var9 + var11;
        }
        if (var8 <= 0 || var7 <= 0) {
            return;
        }
        ll.b(de.field_l, this.field_m, this.field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
    }

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
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
                incrementValue$13 = param3;
                param3++;
                var15 = param1[incrementValue$13];
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
                        incrementValue$14 = param4;
                        param4++;
                        param0[incrementValue$14] = (var16 * var10 >> 8 << 16) + (var17 * var11 >> 8 << 8) + (var18 * var12 >> 8);
                        var14++;
                        continue L1;
                      }
                    }
                  }
                  incrementValue$15 = param4;
                  param4++;
                  param0[incrementValue$15] = var15;
                  var14++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final qb b() {
        int var3 = 0;
        int var1 = this.field_h * this.field_c;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = this.field_l[this.field_m[var3] & 255];
        }
        return new qb(this.field_g, this.field_k, this.field_j, this.field_f, this.field_h, this.field_c, var2);
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * de.field_e;
        int var4 = 0;
        int var5 = this.field_c;
        int var6 = this.field_h;
        int var7 = de.field_e - var6;
        int var8 = 0;
        if (param1 < de.field_c) {
            var9 = de.field_c - param1;
            var5 = var5 - var9;
            param1 = de.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * de.field_e;
        }
        if (param1 + var5 > de.field_k) {
            var5 = var5 - (param1 + var5 - de.field_k);
        }
        if (param0 < de.field_i) {
            var9 = de.field_i - param0;
            var6 = var6 - var9;
            param0 = de.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > de.field_h) {
            var9 = param0 + var6 - de.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        ll.b(de.field_l, this.field_m, this.field_l, 0, var4, var3, var6, var5, var7, var8);
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + (this.field_g - this.field_h - this.field_j);
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * de.field_e;
        int var4 = this.field_h - 1;
        int var5 = this.field_c;
        int var6 = this.field_h;
        int var7 = de.field_e - var6;
        int var8 = var6 + var6;
        if (param1 < de.field_c) {
            var9 = de.field_c - param1;
            var5 = var5 - var9;
            param1 = de.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * de.field_e;
        }
        if (param1 + var5 > de.field_k) {
            var5 = var5 - (param1 + var5 - de.field_k);
        }
        if (param0 < de.field_i) {
            var9 = de.field_i - param0;
            var6 = var6 - var9;
            param0 = de.field_i;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > de.field_h) {
            var9 = param0 + var6 - de.field_h;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        ll.a(de.field_l, this.field_m, this.field_l, 0, var4, var3, var6, var5, var7, var8);
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_g = param0;
        this.field_k = param1;
        this.field_j = param2;
        this.field_f = param3;
        this.field_h = param4;
        this.field_c = param5;
        this.field_m = param6;
        this.field_l = param7;
    }

    ll(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_g = param0;
        this.field_c = param1;
        this.field_k = param1;
        this.field_f = 0;
        this.field_j = 0;
        this.field_m = new byte[param0 * param1];
        this.field_l = new int[param2];
    }
}
