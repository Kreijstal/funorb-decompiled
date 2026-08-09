/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends bb {
    byte[] field_j;
    int[] field_i;

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

    final void b() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        if (this.field_f == this.field_h && this.field_g == this.field_b) {
            return;
        }
        byte[] var1 = new byte[this.field_h * this.field_b];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_g; var3++) {
            for (var4 = 0; var4 < this.field_f; var4++) {
                incrementValue$0 = var2;
                var2++;
                var1[var4 + this.field_e + (var3 + this.field_d) * this.field_h] = this.field_j[incrementValue$0];
            }
        }
        this.field_j = var1;
        this.field_f = this.field_h;
        this.field_g = this.field_b;
        this.field_e = 0;
        this.field_d = 0;
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_e;
        param1 = param1 + this.field_d;
        int var3 = param0 + param1 * qh.field_l;
        int var4 = 0;
        int var5 = this.field_g;
        int var6 = this.field_f;
        int var7 = qh.field_l - var6;
        int var8 = 0;
        if (param1 < qh.field_c) {
            var9 = qh.field_c - param1;
            var5 = var5 - var9;
            param1 = qh.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qh.field_l;
        }
        if (param1 + var5 > qh.field_g) {
            var5 = var5 - (param1 + var5 - qh.field_g);
        }
        if (param0 < qh.field_b) {
            var9 = qh.field_b - param0;
            var6 = var6 - var9;
            param0 = qh.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > qh.field_j) {
            var9 = param0 + var6 - qh.field_j;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        qb.b(qh.field_d, this.field_j, this.field_i, 0, var4, var3, var6, var5, var7, var8);
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_e;
        param1 = param1 + this.field_d;
        int var4 = param0 + param1 * qh.field_l;
        int var5 = 0;
        int var6 = this.field_g;
        int var7 = this.field_f;
        int var8 = qh.field_l - var7;
        int var9 = 0;
        if (param1 < qh.field_c) {
            var10 = qh.field_c - param1;
            var6 = var6 - var10;
            param1 = qh.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qh.field_l;
        }
        if (param1 + var6 > qh.field_g) {
            var6 = var6 - (param1 + var6 - qh.field_g);
        }
        if (param0 < qh.field_b) {
            var10 = qh.field_b - param0;
            var7 = var7 - var10;
            param0 = qh.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qh.field_j) {
            var10 = param0 + var7 - qh.field_j;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        qb.a(qh.field_d, this.field_j, this.field_i, var5, var4, var7, var6, var8, var9, param2);
    }

    final void a() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_f * this.field_g];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_g; var3++) {
            for (var4 = this.field_f - 1; var4 >= 0; var4--) {
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = this.field_j[var4 + var3 * this.field_f];
            }
        }
        this.field_j = var1;
        this.field_e = this.field_h - this.field_f - this.field_e;
    }

    qb(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_h = param0;
        this.field_b = param1;
        this.field_e = param2;
        this.field_d = param3;
        this.field_f = param4;
        this.field_g = param5;
        this.field_j = param6;
        this.field_i = param7;
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

    qb(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_h = param0;
        this.field_g = param1;
        this.field_b = param1;
        this.field_d = 0;
        this.field_e = 0;
        this.field_j = new byte[param0 * param1];
        this.field_i = new int[param2];
    }
}
