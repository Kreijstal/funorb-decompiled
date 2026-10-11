/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    private static float field_c;
    static int field_d;
    private int[][][] field_e;
    private static float[][] field_h;
    private int[][][] field_b;
    static int[][] field_f;
    int[] field_g;
    private int[] field_a;

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
          var3 = (float)this.field_a[0] + (float)(this.field_a[1] - this.field_a[0]) * param1;
          var3 = var3 * 0.0030517578125f;
          field_c = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          field_d = (int)(field_c * 65536.0f);
        }
        if (this.field_g[param0] == 0) {
          return 0;
        }
        var3Lifetime1 = this.a(param0, 0, param1);
        field_h[param0][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.b(param0, 0, param1));
        field_h[param0][1] = var3Lifetime1 * var3Lifetime1;
        for (var4 = 1; var4 < this.field_g[param0]; var4++) {
          var3Lifetime2 = this.a(param0, var4, param1);
          var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.b(param0, var4, param1));
          var6 = var3Lifetime2 * var3Lifetime2;
          field_h[param0][var4 * 2 + 1] = field_h[param0][var4 * 2 - 1] * var6;
          field_h[param0][var4 * 2] = field_h[param0][var4 * 2 - 1] * var5 + field_h[param0][var4 * 2 - 2] * var6;
          for (var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            dupTemp$0 = field_h[param0];
            dupTemp$0[var7] = dupTemp$0[var7] + (field_h[param0][var7 - 1] * var5 + field_h[param0][var7 - 2] * var6);
          }
          dupTemp$1 = field_h[param0];
          dupTemp$1[1] = dupTemp$1[1] + (field_h[param0][0] * var5 + var6);
          dupTemp$2 = field_h[param0];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (param0 == 0) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_g[0] * 2; var4Lifetime1++) {
            dupTemp$3 = field_h[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * field_c;
          }
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.field_g[param0] * 2; var4Lifetime2++) {
          field_f[param0][var4Lifetime2] = (int)(field_h[param0][var4Lifetime2] * 65536.0f);
        }
        return this.field_g[param0] * 2;
    }

    private final static float a(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    public static void a() {
        field_h = (float[][]) null;
        field_f = (int[][]) null;
    }

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)this.field_e[param0][0][param1] + param2 * (float)(this.field_e[param0][1][param1] - this.field_e[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)this.field_b[param0][0][param1] + param2 * (float)(this.field_b[param0][1][param1] - this.field_b[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return hc.a(var4);
    }

    final void a(ds param0, rpb param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var3 = param0.e((byte) -120);
        this.field_g[0] = var3 >> 4;
        this.field_g[1] = var3 & 15;
        if (var3 != 0) {
          this.field_a[0] = param0.e(1869);
          this.field_a[1] = param0.e(1869);
          var4 = param0.e((byte) -112);
          for (var5 = 0; var5 < 2; var5++) {
            for (var6 = 0; var6 < this.field_g[var5]; var6++) {
              this.field_b[var5][0][var6] = param0.e(1869);
              this.field_e[var5][0][var6] = param0.e(1869);
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var7 = 0;
            var6Lifetime1 = var7;
            while (var7 < this.field_g[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.field_b[var5Lifetime1][1][var7] = this.field_b[var5Lifetime1][0][var7];
                this.field_e[var5Lifetime1][1][var7] = this.field_e[var5Lifetime1][0][var7];
              } else {
                this.field_b[var5Lifetime1][1][var7] = param0.e(1869);
                this.field_e[var5Lifetime1][1][var7] = param0.e(1869);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.field_a[1] != this.field_a[0]) {
            param1.a(param0);
          }
        } else {
          var11 = this.field_a;
          this.field_a[1] = 0;
          var11[0] = 0;
        }
    }

    hc() {
        this.field_b = new int[2][2][4];
        this.field_a = new int[2];
        this.field_g = new int[2];
        this.field_e = new int[2][2][4];
    }

    static {
        field_f = new int[2][8];
        field_h = new float[2][8];
    }
}
