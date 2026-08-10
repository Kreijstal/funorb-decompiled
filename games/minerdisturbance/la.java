/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int[][][] field_d;
    int[] field_g;
    static int field_b;
    private int[][][] field_f;
    private static float[][] field_c;
    static int[][] field_e;
    private static float field_h;
    private int[] field_a;

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)this.field_f[param0][0][param1] + param2 * (float)(this.field_f[param0][1][param1] - this.field_f[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    public static void a() {
        field_c = (float[][]) null;
        field_e = (int[][]) null;
    }

    final int a(int param0, float param1) {
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        float[] dupTemp$2 = null;
        float[] dupTemp$3 = null;
        float var3 = 0.0f;
        int var4 = 0;
        if (param0 == 0) {
            var3 = (float)this.field_a[0] + (float)(this.field_a[1] - this.field_a[0]) * param1;
            var3 = var3 * 0.0030517578125f;
            field_h = (float)Math.pow(0.1, (double)(var3 / 20.0f));
            field_b = (int)(field_h * 65536.0f);
        }
        if (this.field_g[param0] == 0) {
            return 0;
        }
        var3 = this.b(param0, 0, param1);
        field_c[param0][0] = -2.0f * var3 * (float)Math.cos((double)this.a(param0, 0, param1));
        field_c[param0][1] = var3 * var3;
        for (var4 = 1; var4 < this.field_g[param0]; var4++) {
            var3 = this.b(param0, var4, param1);
            var5 = -2.0f * var3 * (float)Math.cos((double)this.a(param0, var4, param1));
            var6 = var3 * var3;
            field_c[param0][var4 * 2 + 1] = field_c[param0][var4 * 2 - 1] * var6;
            field_c[param0][var4 * 2] = field_c[param0][var4 * 2 - 1] * var5 + field_c[param0][var4 * 2 - 2] * var6;
            for (var7 = var4 * 2 - 1; var7 >= 2; var7--) {
                dupTemp$0 = field_c[param0];
                dupTemp$0[var7] = dupTemp$0[var7] + (field_c[param0][var7 - 1] * var5 + field_c[param0][var7 - 2] * var6);
            }
            dupTemp$1 = field_c[param0];
            dupTemp$1[1] = dupTemp$1[1] + (field_c[param0][0] * var5 + var6);
            dupTemp$2 = field_c[param0];
            dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (param0 == 0) {
            for (var4 = 0; var4 < this.field_g[0] * 2; var4++) {
                dupTemp$3 = field_c[0];
                dupTemp$3[var4] = dupTemp$3[var4] * field_h;
            }
        }
        for (var4 = 0; var4 < this.field_g[param0] * 2; var4++) {
            field_e[param0][var4] = (int)(field_c[param0][var4] * 65536.0f);
        }
        return this.field_g[param0] * 2;
    }

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)this.field_d[param0][0][param1] + param2 * (float)(this.field_d[param0][1][param1] - this.field_d[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return la.a(var4);
    }

    final void a(sb param0, cj param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        L0: {
          var3 = param0.d((byte) -54);
          this.field_g[0] = var3 >> 4;
          this.field_g[1] = var3 & 15;
          if (var3 == 0) {
            var11 = this.field_a;
            this.field_a[1] = 0;
            var11[0] = 0;
            break L0;
          } else {
            this.field_a[0] = param0.e(-78);
            this.field_a[1] = param0.e(-81);
            var4 = param0.d((byte) -54);
            var5 = 0;
            L1: while (true) {
              if (var5 >= 2) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 2) {
                    L3: {
                      L4: {
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (this.field_a[1] == this.field_a[0]) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      param1.a(param0);
                      break L3;
                    }
                    break L0;
                  } else {
                    var7 = 0;
                    var6 = var7;
                    L5: while (true) {
                      if (var7 >= this.field_g[var5]) {
                        var5++;
                        continue L2;
                      } else {
                        if ((var4 & 1 << var5 * 4 << var7) == 0) {
                          this.field_d[var5][1][var7] = this.field_d[var5][0][var7];
                          this.field_f[var5][1][var7] = this.field_f[var5][0][var7];
                          var7++;
                          continue L5;
                        } else {
                          this.field_d[var5][1][var7] = param0.e(-114);
                          this.field_f[var5][1][var7] = param0.e(-67);
                          var7++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L6: while (true) {
                  if (var6 >= this.field_g[var5]) {
                    var5++;
                    continue L1;
                  } else {
                    this.field_d[var5][0][var6] = param0.e(-99);
                    this.field_f[var5][0][var6] = param0.e(-39);
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static float a(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    la() {
        this.field_g = new int[2];
        this.field_d = new int[2][2][4];
        this.field_f = new int[2][2][4];
        this.field_a = new int[2];
    }

    static {
        field_c = new float[2][8];
        field_e = new int[2][8];
    }
}
