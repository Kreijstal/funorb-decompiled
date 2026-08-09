/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends k {
    byte[] field_i;
    int[] field_j;

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

    final void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_c;
        param1 = param1 + this.field_b;
        int var3 = param0 + param1 * sb.field_c;
        int var4 = 0;
        int var5 = this.field_g;
        int var6 = this.field_f;
        int var7 = sb.field_c - var6;
        int var8 = 0;
        if (param1 < sb.field_e) {
            var9 = sb.field_e - param1;
            var5 = var5 - var9;
            param1 = sb.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * sb.field_c;
        }
        if (param1 + var5 > sb.field_f) {
            var5 = var5 - (param1 + var5 - sb.field_f);
        }
        if (param0 < sb.field_d) {
            var9 = sb.field_d - param0;
            var6 = var6 - var9;
            param0 = sb.field_d;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > sb.field_b) {
            var9 = param0 + var6 - sb.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        ii.a(sb.field_h, this.field_i, this.field_j, var4, var3, var6, var5, var7, var8);
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_c;
        param1 = param1 + this.field_b;
        int var3 = param0 + param1 * sb.field_c;
        int var4 = 0;
        int var5 = this.field_g;
        int var6 = this.field_f;
        int var7 = sb.field_c - var6;
        int var8 = 0;
        if (param1 < sb.field_e) {
            var9 = sb.field_e - param1;
            var5 = var5 - var9;
            param1 = sb.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * sb.field_c;
        }
        if (param1 + var5 > sb.field_f) {
            var5 = var5 - (param1 + var5 - sb.field_f);
        }
        if (param0 < sb.field_d) {
            var9 = sb.field_d - param0;
            var6 = var6 - var9;
            param0 = sb.field_d;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > sb.field_b) {
            var9 = param0 + var6 - sb.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        ii.a(sb.field_h, this.field_i, this.field_j, 0, var4, var3, var6, var5, var7, var8);
    }

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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
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
        int var11 = 0;
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = var9; var11 < 0; var11++) {
                incrementValue$0 = param4;
                param4++;
                incrementValue$1 = param3;
                param3++;
                param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
                incrementValue$2 = param4;
                param4++;
                incrementValue$3 = param3;
                param3++;
                param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
                incrementValue$4 = param4;
                param4++;
                incrementValue$5 = param3;
                param3++;
                param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
                incrementValue$6 = param4;
                param4++;
                incrementValue$7 = param3;
                param3++;
                param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
            }
            for (var11 = param5; var11 < 0; var11++) {
                incrementValue$8 = param4;
                param4++;
                incrementValue$9 = param3;
                param3++;
                param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_c;
        param1 = param1 + this.field_b;
        int var4 = param0 + param1 * sb.field_c;
        int var5 = 0;
        int var6 = this.field_g;
        int var7 = this.field_f;
        int var8 = sb.field_c - var7;
        int var9 = 0;
        if (param1 < sb.field_e) {
            var10 = sb.field_e - param1;
            var6 = var6 - var10;
            param1 = sb.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * sb.field_c;
        }
        if (param1 + var6 > sb.field_f) {
            var6 = var6 - (param1 + var6 - sb.field_f);
        }
        if (param0 < sb.field_d) {
            var10 = sb.field_d - param0;
            var7 = var7 - var10;
            param0 = sb.field_d;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > sb.field_b) {
            var10 = param0 + var7 - sb.field_b;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        ii.b(sb.field_h, this.field_i, this.field_j, var5, var4, var7, var6, var8, var9, param2);
    }

    ii(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_d = param0;
        this.field_h = param1;
        this.field_c = param2;
        this.field_b = param3;
        this.field_f = param4;
        this.field_g = param5;
        this.field_i = param6;
        this.field_j = param7;
    }

    ii(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_d = param0;
        this.field_g = param1;
        this.field_h = param1;
        this.field_b = 0;
        this.field_c = 0;
        this.field_i = new byte[param0 * param1];
        this.field_j = new int[param2];
    }
}
