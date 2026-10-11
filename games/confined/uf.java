/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_b;
    static int[][] field_f;
    private int[] field_h;
    private int[][][] field_a;
    private int[][][] field_d;
    private static float[][] field_c;
    int[] field_g;
    private static float field_e;

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)this.field_d[param0][0][param1] + param2 * (float)(this.field_d[param0][1][param1] - this.field_d[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    final void a(kg param0, nk param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var3 = param0.c(32);
        this.field_g[0] = var3 >> 4;
        this.field_g[1] = var3 & 15;
        if (var3 != 0) {
          this.field_h[0] = param0.a((byte) 25);
          this.field_h[1] = param0.a((byte) 25);
          var4 = param0.c(32);
          for (var5 = 0; var5 < 2; var5++) {
            for (var6 = 0; var6 < this.field_g[var5]; var6++) {
              this.field_a[var5][0][var6] = param0.a((byte) 25);
              this.field_d[var5][0][var6] = param0.a((byte) 25);
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var7 = 0;
            var6Lifetime1 = var7;
            while (var7 < this.field_g[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.field_a[var5Lifetime1][1][var7] = this.field_a[var5Lifetime1][0][var7];
                this.field_d[var5Lifetime1][1][var7] = this.field_d[var5Lifetime1][0][var7];
              } else {
                this.field_a[var5Lifetime1][1][var7] = param0.a((byte) 25);
                this.field_d[var5Lifetime1][1][var7] = param0.a((byte) 25);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.field_h[1] != this.field_h[0]) {
            param1.a(param0);
          }
        } else {
          var11 = this.field_h;
          this.field_h[1] = 0;
          var11[0] = 0;
        }
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
        float var3Lifetime1;
        float var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param0 == 0) {
          var3 = (float)this.field_h[0] + (float)(this.field_h[1] - this.field_h[0]) * param1;
          var3 = var3 * 0.0030517578125f;
          field_e = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          field_b = (int)(field_e * 65536.0f);
        }
        if (this.field_g[param0] == 0) {
          return 0;
        }
        var3Lifetime1 = this.b(param0, 0, param1);
        field_c[param0][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.a(param0, 0, param1));
        field_c[param0][1] = var3Lifetime1 * var3Lifetime1;
        for (var4 = 1; var4 < this.field_g[param0]; var4++) {
          var3Lifetime2 = this.b(param0, var4, param1);
          var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.a(param0, var4, param1));
          var6 = var3Lifetime2 * var3Lifetime2;
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
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_g[0] * 2; var4Lifetime1++) {
            dupTemp$3 = field_c[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * field_e;
          }
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.field_g[param0] * 2; var4Lifetime2++) {
          field_f[param0][var4Lifetime2] = (int)(field_c[param0][var4Lifetime2] * 65536.0f);
        }
        return this.field_g[param0] * 2;
    }

    private final static float a(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)this.field_a[param0][0][param1] + param2 * (float)(this.field_a[param0][1][param1] - this.field_a[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return uf.a(var4);
    }

    public static void a() {
        field_c = (float[][]) null;
        field_f = (int[][]) null;
    }

    uf() {
        this.field_a = new int[2][2][4];
        this.field_h = new int[2];
        this.field_d = new int[2][2][4];
        this.field_g = new int[2];
    }

    static {
        field_f = new int[2][8];
        field_c = new float[2][8];
    }
}
