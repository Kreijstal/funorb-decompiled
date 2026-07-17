/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private int field_c;
    private double[][] field_d;
    private int field_j;
    private double field_i;
    private int field_f;
    private double field_a;
    private int field_g;
    private double[][] field_h;
    private int[] field_e;
    private int field_b;

    final void a(int param0, double param1, int[] param2) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        double var23 = 0.0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int[] var30 = null;
        int var31 = 0;
        int var32 = 0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        var29 = 0;
        var41 = oo.field_i;
        var40 = var41;
        var39 = var40;
        var38 = var39;
        var30 = var38;
        var31 = 0;
        L0: while (true) {
          if (var31 >= ((ea) this).field_b) {
            return;
          } else {
            var32 = 0;
            L1: while (true) {
              if (var32 >= ((ea) this).field_j) {
                var31++;
                continue L0;
              } else {
                if (var41[var29] != 0) {
                  var7 = ((ea) this).field_h[var32][var31];
                  var5 = ((ea) this).field_d[var32][var31];
                  var16 = 0;
                  var33 = var7 / 64.0;
                  var35 = var5 / 4.0;
                  var15 = param0;
                  L2: while (true) {
                    if (var15 <= 0) {
                      L3: {
                        var16 = (int)((double)var16 / ((var5 + 1.0) / 2.0));
                        var16 = var16 >> 8;
                        if (var16 >= 0) {
                          if (var16 <= 255) {
                            break L3;
                          } else {
                            var16 = 255;
                            break L3;
                          }
                        } else {
                          var16 = 0;
                          break L3;
                        }
                      }
                      int incrementValue$1 = var29;
                      var29++;
                      var30[incrementValue$1] = param2[var16];
                      var32++;
                      continue L1;
                    } else {
                      L4: {
                        var27 = 2 << var15;
                        var28 = var27 << 2;
                        var11 = (double)var27 * var33;
                        var9 = param1 + (double)var27 * var35;
                        var14 = (int)var11;
                        var13 = (int)var9;
                        var23 = var9 - (double)var13;
                        var25 = var11 - (double)var14;
                        var37 = var28 * var13;
                        var17 = ((ea) this).field_e[var14 + var37 & 65535];
                        var18 = ((ea) this).field_e[var14 + var37 + var28 & 65535];
                        var14++;
                        if (var14 < var28) {
                          break L4;
                        } else {
                          var14 = var14 - var28;
                          break L4;
                        }
                      }
                      var19 = ((ea) this).field_e[var14 + var37 & 65535];
                      var20 = ((ea) this).field_e[var14 + var37 + var28 & 65535];
                      var21 = ea.a(var17, var18, var23);
                      var22 = ea.a(var19, var20, var23);
                      var16 = var16 + (ea.a(var21, var22, var25) << 8) / var27;
                      var15--;
                      continue L2;
                    }
                  }
                } else {
                  var29++;
                  var32++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static int a(int param0) {
        param0 = param0 << 13 ^ param0;
        param0 = param0 * (param0 * param0 * 15731 + 789221) + 1376312589;
        param0 = param0 & 2147483647;
        return (int)(128.0 + 256.0 * (1.0 - (double)param0 / 1073741824.0));
    }

    private final static int a(int param0, int param1, double param2) {
        return (int)((double)param0 * (1.0 - param2) + (double)param1 * param2);
    }

    public ea() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ((ea) this).field_j = oo.field_b;
        ((ea) this).field_b = oo.field_l;
        ((ea) this).field_g = oo.field_b / 2;
        ((ea) this).field_c = oo.field_l / 2;
        ((ea) this).field_f = (int)Math.sqrt((double)(((ea) this).field_c * ((ea) this).field_c + ((ea) this).field_g * ((ea) this).field_g));
        ((ea) this).field_a = 3.141592653589793 / (double)(2 * ((ea) this).field_f);
        ((ea) this).field_i = 40.74366543152521;
        ((ea) this).field_d = new double[oo.field_b][oo.field_l];
        ((ea) this).field_h = new double[oo.field_b][oo.field_l];
        var3 = 0;
        L0: while (true) {
          if (var3 >= oo.field_b) {
            ((ea) this).field_e = new int[65536];
            var3 = 0;
            L1: while (true) {
              if (var3 >= 65536) {
                return;
              } else {
                ((ea) this).field_e[var3] = ea.a(var3);
                var3++;
                continue L1;
              }
            }
          } else {
            var1 = var3 - ((ea) this).field_g;
            var4 = 0;
            L2: while (true) {
              if (var4 >= oo.field_l) {
                var3++;
                continue L0;
              } else {
                var2 = var4 - ((ea) this).field_c;
                ((ea) this).field_d[var3][var4] = Math.tan(((ea) this).field_a * ((double)((ea) this).field_f - Math.sqrt((double)(var1 * var1 + var2 * var2))));
                ((ea) this).field_h[var3][var4] = 128.0 + ((ea) this).field_i * Math.atan((double)var2 / ((double)var1 + 0.5));
                if (var1 < 0) {
                  if (var2 <= 0) {
                    ((ea) this).field_h[var3][var4] = ((ea) this).field_h[var3][var4] - 128.0;
                    var4++;
                    continue L2;
                  } else {
                    ((ea) this).field_h[var3][var4] = ((ea) this).field_h[var3][var4] + 128.0;
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }
}
