/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends cm {
    int[] field_l;
    byte[] field_k;

    final boolean b(int param0, int param1, int param2, int param3) {
        param2 = param2 - (param0 + this.field_g);
        if (param2 < 0 || param2 >= this.field_c) {
            return false;
        }
        param3 = param3 - (param1 + this.field_h);
        if (param3 < 0 || param3 >= this.field_a) {
            return false;
        }
        return this.field_k[param3 * this.field_c + param2] != 0 ? true : false;
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

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_h;
        int var3 = param0 + param1 * gb.field_d;
        int var4 = 0;
        int var5 = this.field_a;
        int var6 = this.field_c;
        int var7 = gb.field_d - var6;
        int var8 = 0;
        if (param1 < gb.field_b) {
            var9 = gb.field_b - param1;
            var5 = var5 - var9;
            param1 = gb.field_b;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gb.field_d;
        }
        if (param1 + var5 > gb.field_i) {
            var5 = var5 - (param1 + var5 - gb.field_i);
        }
        if (param0 < gb.field_l) {
            var9 = gb.field_l - param0;
            var6 = var6 - var9;
            param0 = gb.field_l;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > gb.field_h) {
            var9 = param0 + var6 - gb.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        bi.b(gb.field_a, this.field_k, this.field_l, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_h;
        int var4 = param0 + param1 * gb.field_d;
        int var5 = 0;
        int var6 = this.field_a;
        int var7 = this.field_c;
        int var8 = gb.field_d - var7;
        int var9 = 0;
        if (param1 < gb.field_b) {
            var10 = gb.field_b - param1;
            var6 = var6 - var10;
            param1 = gb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gb.field_d;
        }
        if (param1 + var6 > gb.field_i) {
            var6 = var6 - (param1 + var6 - gb.field_i);
        }
        if (param0 < gb.field_l) {
            var10 = gb.field_l - param0;
            var7 = var7 - var10;
            param0 = gb.field_l;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > gb.field_h) {
            var10 = param0 + var7 - gb.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        bi.a(gb.field_a, this.field_k, this.field_l, var5, var4, var7, var6, var8, var9, param2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var5 = this.field_c;
        int var6 = this.field_a;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_e;
        int var10 = this.field_d;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        if (this.field_g > 0) {
            var13 = ((this.field_g << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.field_g << 16));
        }
        if (this.field_h > 0) {
            var13 = ((this.field_h << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (this.field_h << 16));
        }
        if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13 = param0 + param1 * gb.field_d;
        int var14 = gb.field_d - param2;
        if (param1 + param3 > gb.field_i) {
            param3 = param3 - (param1 + param3 - gb.field_i);
        }
        if (param1 < gb.field_b) {
            var15 = gb.field_b - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * gb.field_d;
            var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > gb.field_h) {
            var15 = param0 + param2 - gb.field_h;
            param2 = param2 - var15;
            var14 = var14 + var15;
        }
        if (param0 < gb.field_l) {
            var15 = gb.field_l - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
        }
        bi.a(gb.field_a, this.field_k, this.field_l, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    bi(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_e = param0;
        this.field_d = param1;
        this.field_g = param2;
        this.field_h = param3;
        this.field_c = param4;
        this.field_a = param5;
        this.field_k = param6;
        this.field_l = param7;
    }

    bi(int param0, int param1, int param2) {
        this.field_c = param0;
        this.field_e = param0;
        this.field_a = param1;
        this.field_d = param1;
        this.field_h = 0;
        this.field_g = 0;
        this.field_k = new byte[param0 * param1];
        this.field_l = new int[param2];
    }
}
