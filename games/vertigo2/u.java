/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends fq {
    byte[] field_n;
    int[] field_m;

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
          param1 = param1 + this.field_c;
          var3 = param0 + param1 * bi.field_e;
          var4 = 0;
          var5 = this.field_e;
          var6 = this.field_l;
          var7 = bi.field_e - var6;
          var8 = 0;
          if (param1 >= bi.field_f) {
            break L0;
          } else {
            var9 = bi.field_f - param1;
            var5 = var5 - var9;
            param1 = bi.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * bi.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= bi.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - bi.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= bi.field_d) {
            break L2;
          } else {
            var9 = bi.field_d - param0;
            var6 = var6 - var9;
            param0 = bi.field_d;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= bi.field_i) {
            break L3;
          } else {
            var9 = param0 + var6 - bi.field_i;
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
              u.b(bi.field_l, this.field_n, this.field_m, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
          param1 = param1 + this.field_c;
          var4 = param0 + param1 * bi.field_e;
          var5 = 0;
          var6 = this.field_e;
          var7 = this.field_l;
          var8 = bi.field_e - var7;
          var9 = 0;
          if (param1 >= bi.field_f) {
            break L0;
          } else {
            var10 = bi.field_f - param1;
            var6 = var6 - var10;
            param1 = bi.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * bi.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= bi.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - bi.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= bi.field_d) {
            break L2;
          } else {
            var10 = bi.field_d - param0;
            var7 = var7 - var10;
            param0 = bi.field_d;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= bi.field_i) {
            break L3;
          } else {
            var10 = param0 + var7 - bi.field_i;
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
              u.a(bi.field_l, this.field_n, this.field_m, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    u(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_d = param0;
        this.field_h = param1;
        this.field_k = param2;
        this.field_c = param3;
        this.field_l = param4;
        this.field_e = param5;
        this.field_n = param6;
        this.field_m = param7;
    }

    u(int param0, int param1, int param2) {
        this.field_l = param0;
        this.field_d = param0;
        this.field_e = param1;
        this.field_h = param1;
        this.field_c = 0;
        this.field_k = 0;
        this.field_n = new byte[param0 * param1];
        this.field_m = new int[param2];
    }
}
