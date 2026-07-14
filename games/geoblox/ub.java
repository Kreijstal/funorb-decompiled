/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    int[] field_b;
    private static float field_d;
    private int[][][] field_c;
    private int[] field_e;
    private int[][][] field_h;
    static int field_a;
    private static float[][] field_f;
    static int[][] field_g;

    public static void a() {
        field_f = null;
        field_g = null;
    }

    final int a(int param0, float param1) {
        float var3 = 0.0f;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            var3 = (float)((ub) this).field_e[0] + (float)(((ub) this).field_e[1] - ((ub) this).field_e[0]) * param1;
            var3 = var3 * 0.0030517578125f;
            field_d = (float)Math.pow(0.1, (double)(var3 / 20.0f));
            field_a = (int)(field_d * 65536.0f);
            break L0;
          }
        }
        if (((ub) this).field_b[param0] != 0) {
          var3 = this.a(param0, 0, param1);
          field_f[param0][0] = -2.0f * var3 * (float)Math.cos((double)this.b(param0, 0, param1));
          field_f[param0][1] = var3 * var3;
          var4 = 1;
          L1: while (true) {
            if (var4 >= ((ub) this).field_b[param0]) {
              L2: {
                if (param0 != 0) {
                  break L2;
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= ((ub) this).field_b[0] * 2) {
                      break L2;
                    } else {
                      field_f[0][var4] = field_f[0][var4] * field_d;
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 >= ((ub) this).field_b[param0] * 2) {
                  return ((ub) this).field_b[param0] * 2;
                } else {
                  field_g[param0][var4] = (int)(field_f[param0][var4] * 65536.0f);
                  var4++;
                  continue L4;
                }
              }
            } else {
              var3 = this.a(param0, var4, param1);
              var5 = -2.0f * var3 * (float)Math.cos((double)this.b(param0, var4, param1));
              var6 = var3 * var3;
              field_f[param0][var4 * 2 + 1] = field_f[param0][var4 * 2 - 1] * var6;
              field_f[param0][var4 * 2] = field_f[param0][var4 * 2 - 1] * var5 + field_f[param0][var4 * 2 - 2] * var6;
              var7 = var4 * 2 - 1;
              L5: while (true) {
                if (var7 < 2) {
                  field_f[param0][1] = field_f[param0][1] + (field_f[param0][0] * var5 + var6);
                  field_f[param0][0] = field_f[param0][0] + var5;
                  var4++;
                  continue L1;
                } else {
                  field_f[param0][var7] = field_f[param0][var7] + (field_f[param0][var7 - 1] * var5 + field_f[param0][var7 - 2] * var6);
                  var7--;
                  continue L5;
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final static float a(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    final void a(qc param0, uc param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        L0: {
          var3 = param0.c((byte) 34);
          ((ub) this).field_b[0] = var3 >> 4;
          ((ub) this).field_b[1] = var3 & 15;
          if (var3 == 0) {
            var11 = ((ub) this).field_e;
            ((ub) this).field_e[1] = 0;
            var11[0] = 0;
            break L0;
          } else {
            ((ub) this).field_e[0] = param0.b(true);
            ((ub) this).field_e[1] = param0.b(true);
            var4 = param0.c((byte) 34);
            var5 = 0;
            L1: while (true) {
              if (var5 >= 2) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 2) {
                    L3: {
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (((ub) this).field_e[1] == ((ub) this).field_e[0]) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    param1.b(param0);
                    break L0;
                  } else {
                    var7 = 0;
                    var6 = var7;
                    L4: while (true) {
                      if (var7 >= ((ub) this).field_b[var5]) {
                        var5++;
                        continue L2;
                      } else {
                        if ((var4 & 1 << var5 * 4 << var7) == 0) {
                          ((ub) this).field_c[var5][1][var7] = ((ub) this).field_c[var5][0][var7];
                          ((ub) this).field_h[var5][1][var7] = ((ub) this).field_h[var5][0][var7];
                          var7++;
                          continue L4;
                        } else {
                          ((ub) this).field_c[var5][1][var7] = param0.b(true);
                          ((ub) this).field_h[var5][1][var7] = param0.b(true);
                          var7++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= ((ub) this).field_b[var5]) {
                    var5++;
                    continue L1;
                  } else {
                    ((ub) this).field_c[var5][0][var6] = param0.b(true);
                    ((ub) this).field_h[var5][0][var6] = param0.b(true);
                    var6++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)((ub) this).field_c[param0][0][param1] + param2 * (float)(((ub) this).field_c[param0][1][param1] - ((ub) this).field_c[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return ub.a(var4);
    }

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)((ub) this).field_h[param0][0][param1] + param2 * (float)(((ub) this).field_h[param0][1][param1] - ((ub) this).field_h[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    ub() {
        ((ub) this).field_b = new int[2];
        ((ub) this).field_h = new int[2][2][4];
        ((ub) this).field_c = new int[2][2][4];
        ((ub) this).field_e = new int[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[2][8];
        field_g = new int[2][8];
    }
}
