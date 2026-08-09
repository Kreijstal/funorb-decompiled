/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class caa extends ija {
    byte[] field_j;
    int[] field_i;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_d;
        int var3 = param0 + param1 * dma.field_g;
        int var4 = 0;
        int var5 = this.field_e;
        int var6 = this.field_h;
        int var7 = dma.field_g - var6;
        int var8 = 0;
        if (param1 < dma.field_c) {
            var9 = dma.field_c - param1;
            var5 = var5 - var9;
            param1 = dma.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * dma.field_g;
        }
        if (param1 + var5 > dma.field_f) {
            var5 = var5 - (param1 + var5 - dma.field_f);
        }
        if (param0 < dma.field_d) {
            var9 = dma.field_d - param0;
            var6 = var6 - var9;
            param0 = dma.field_d;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > dma.field_a) {
            var9 = param0 + var6 - dma.field_a;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        caa.a(dma.field_i, this.field_j, this.field_i, 0, var4, var3, var6, var5, var7, var8);
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
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_d;
        int var4 = param0 + param1 * dma.field_g;
        int var5 = 0;
        int var6 = this.field_e;
        int var7 = this.field_h;
        int var8 = dma.field_g - var7;
        int var9 = 0;
        if (param1 < dma.field_c) {
            var10 = dma.field_c - param1;
            var6 = var6 - var10;
            param1 = dma.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * dma.field_g;
        }
        if (param1 + var6 > dma.field_f) {
            var6 = var6 - (param1 + var6 - dma.field_f);
        }
        if (param0 < dma.field_d) {
            var10 = dma.field_d - param0;
            var7 = var7 - var10;
            param0 = dma.field_d;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > dma.field_a) {
            var10 = param0 + var7 - dma.field_a;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        caa.b(dma.field_i, this.field_j, this.field_i, var5, var4, var7, var6, var8, var9, param2);
    }

    caa(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_a = param0;
        this.field_g = param1;
        this.field_f = param2;
        this.field_d = param3;
        this.field_h = param4;
        this.field_e = param5;
        this.field_j = param6;
        this.field_i = param7;
    }

    caa(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_a = param0;
        this.field_e = param1;
        this.field_g = param1;
        this.field_d = 0;
        this.field_f = 0;
        this.field_j = new byte[param0 * param1];
        this.field_i = new int[param2];
    }
}
