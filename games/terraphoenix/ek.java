/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static int[][] field_h;
    private int[][][] field_f;
    static int field_g;
    private static float field_e;
    private int[] field_c;
    int[] field_a;
    private int[][][] field_b;
    private static float[][] field_d;

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)this.field_f[param0][0][param1] + param2 * (float)(this.field_f[param0][1][param1] - this.field_f[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    public static void a() {
        field_d = (float[][]) null;
        field_h = (int[][]) null;
    }

    final void a(dh param0, fj param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        L0: {
          var3 = param0.a(-16384);
          this.field_a[0] = var3 >> 4;
          this.field_a[1] = var3 & 15;
          if (var3 == 0) {
            var11 = this.field_c;
            this.field_c[1] = 0;
            var11[0] = 0;
            break L0;
          } else {
            this.field_c[0] = param0.i(-25578);
            this.field_c[1] = param0.i(-25578);
            var4 = param0.a(-16384);
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
                        if (this.field_c[1] == this.field_c[0]) {
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
                      if (var7 >= this.field_a[var5]) {
                        var5++;
                        continue L2;
                      } else {
                        if ((var4 & 1 << var5 * 4 << var7) == 0) {
                          this.field_b[var5][1][var7] = this.field_b[var5][0][var7];
                          this.field_f[var5][1][var7] = this.field_f[var5][0][var7];
                          var7++;
                          continue L4;
                        } else {
                          this.field_b[var5][1][var7] = param0.i(-25578);
                          this.field_f[var5][1][var7] = param0.i(-25578);
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
                  if (var6 >= this.field_a[var5]) {
                    var5++;
                    continue L1;
                  } else {
                    this.field_b[var5][0][var6] = param0.i(-25578);
                    this.field_f[var5][0][var6] = param0.i(-25578);
                    var6++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)this.field_b[param0][0][param1] + param2 * (float)(this.field_b[param0][1][param1] - this.field_b[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return ek.a(var4);
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
            var3 = (float)this.field_c[0] + (float)(this.field_c[1] - this.field_c[0]) * param1;
            var3 = var3 * 0.0030517578125f;
            field_e = (float)Math.pow(0.1, (double)(var3 / 20.0f));
            field_g = (int)(field_e * 65536.0f);
            break L0;
          }
        }
        if (this.field_a[param0] != 0) {
          var3 = this.b(param0, 0, param1);
          field_d[param0][0] = -2.0f * var3 * (float)Math.cos((double)this.a(param0, 0, param1));
          field_d[param0][1] = var3 * var3;
          var4 = 1;
          L1: while (true) {
            if (var4 >= this.field_a[param0]) {
              L2: {
                if (param0 != 0) {
                  break L2;
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= this.field_a[0] * 2) {
                      break L2;
                    } else {
                      field_d[0][var4] = field_d[0][var4] * field_e;
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 >= this.field_a[param0] * 2) {
                  return this.field_a[param0] * 2;
                } else {
                  field_h[param0][var4] = (int)(field_d[param0][var4] * 65536.0f);
                  var4++;
                  continue L4;
                }
              }
            } else {
              var3 = this.b(param0, var4, param1);
              var5 = -2.0f * var3 * (float)Math.cos((double)this.a(param0, var4, param1));
              var6 = var3 * var3;
              field_d[param0][var4 * 2 + 1] = field_d[param0][var4 * 2 - 1] * var6;
              field_d[param0][var4 * 2] = field_d[param0][var4 * 2 - 1] * var5 + field_d[param0][var4 * 2 - 2] * var6;
              var7 = var4 * 2 - 1;
              L5: while (true) {
                if (var7 < 2) {
                  field_d[param0][1] = field_d[param0][1] + (field_d[param0][0] * var5 + var6);
                  field_d[param0][0] = field_d[param0][0] + var5;
                  var4++;
                  continue L1;
                } else {
                  field_d[param0][var7] = field_d[param0][var7] + (field_d[param0][var7 - 1] * var5 + field_d[param0][var7 - 2] * var6);
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

    ek() {
        this.field_f = new int[2][2][4];
        this.field_c = new int[2];
        this.field_a = new int[2];
        this.field_b = new int[2][2][4];
    }

    static {
        field_d = new float[2][8];
        field_h = new int[2][8];
    }
}
