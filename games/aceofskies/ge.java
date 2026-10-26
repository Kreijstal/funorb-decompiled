/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    private int[] field_c;
    private static float field_b;
    static int[][] field_h;
    private int[][][] field_f;
    int[] field_d;
    private static float[][] field_e;
    private int[][][] field_a;
    static int field_g;

    private final float a(int param0, int param1, float param2) {
        float var4 = (float)this.field_a[param0][0][param1] + param2 * (float)(this.field_a[param0][1][param1] - this.field_a[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return ge.a(var4);
    }

    public static void a() {
        field_e = (float[][]) null;
        field_h = (int[][]) null;
    }

    final int a(int param0, float param1) {
        if (param0 == 0) {
          float var3 = (float)this.field_c[0] + (float)(this.field_c[1] - this.field_c[0]) * param1;
          var3 = var3 * 0.0030517578125f;
          field_b = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          field_g = (int)(field_b * 65536.0f);
        }
        if (this.field_d[param0] == 0) {
          return 0;
        }
        float var3Lifetime1 = this.b(param0, 0, param1);
        field_e[param0][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.a(param0, 0, param1));
        field_e[param0][1] = var3Lifetime1 * var3Lifetime1;
        for (int var4 = 1; var4 < this.field_d[param0]; var4++) {
          float var3Lifetime2 = this.b(param0, var4, param1);
          float var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.a(param0, var4, param1));
          float var6 = var3Lifetime2 * var3Lifetime2;
          field_e[param0][var4 * 2 + 1] = field_e[param0][var4 * 2 - 1] * var6;
          field_e[param0][var4 * 2] = field_e[param0][var4 * 2 - 1] * var5 + field_e[param0][var4 * 2 - 2] * var6;
          for (int var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            float[] dupTemp$0 = field_e[param0];
            dupTemp$0[var7] = dupTemp$0[var7] + (field_e[param0][var7 - 1] * var5 + field_e[param0][var7 - 2] * var6);
          }
          float[] dupTemp$1 = field_e[param0];
          dupTemp$1[1] = dupTemp$1[1] + (field_e[param0][0] * var5 + var6);
          float[] dupTemp$2 = field_e[param0];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (param0 == 0) {
          for (int var4Lifetime1 = 0; var4Lifetime1 < this.field_d[0] * 2; var4Lifetime1++) {
            float[] dupTemp$3 = field_e[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * field_b;
          }
        }
        for (int var4Lifetime2 = 0; var4Lifetime2 < this.field_d[param0] * 2; var4Lifetime2++) {
          field_h[param0][var4Lifetime2] = (int)(field_e[param0][var4Lifetime2] * 65536.0f);
        }
        return this.field_d[param0] * 2;
    }

    private final static float a(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    private final float b(int param0, int param1, float param2) {
        float var4 = (float)this.field_f[param0][0][param1] + param2 * (float)(this.field_f[param0][1][param1] - this.field_f[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    final void a(PacketBuffer param0, wh param1) {
        int var3 = param0.readUnsignedByte(-103);
        this.field_d[0] = var3 >> 4;
        this.field_d[1] = var3 & 15;
        if (var3 != 0) {
          this.field_c[0] = param0.readUnsignedShort((byte) 0);
          this.field_c[1] = param0.readUnsignedShort((byte) 0);
          int var4 = param0.readUnsignedByte(-53);
          for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field_d[var5]; var6++) {
              this.field_a[var5][0][var6] = param0.readUnsignedShort((byte) 0);
              this.field_f[var5][0][var6] = param0.readUnsignedShort((byte) 0);
            }
          }
          for (int var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            int var7 = 0;
            int var6Lifetime1 = var7;
            while (var7 < this.field_d[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.field_a[var5Lifetime1][1][var7] = this.field_a[var5Lifetime1][0][var7];
                this.field_f[var5Lifetime1][1][var7] = this.field_f[var5Lifetime1][0][var7];
              } else {
                this.field_a[var5Lifetime1][1][var7] = param0.readUnsignedShort((byte) 0);
                this.field_f[var5Lifetime1][1][var7] = param0.readUnsignedShort((byte) 0);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.field_c[1] != this.field_c[0]) {
            param1.a(param0);
          }
        } else {
          int[] var11 = this.field_c;
          this.field_c[1] = 0;
          var11[0] = 0;
        }
    }

    ge() {
        this.field_c = new int[2];
        this.field_a = new int[2][2][4];
        this.field_d = new int[2];
        this.field_f = new int[2][2][4];
    }

    static {
        field_e = new float[2][8];
        field_h = new int[2][8];
    }
}
