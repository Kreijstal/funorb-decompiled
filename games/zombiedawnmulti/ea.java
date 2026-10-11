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
        int var31 = 0;
        int var32 = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        double var5;
        double var7;
        double var9;
        double var11;
        int var13;
        int var14;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        double var23;
        double var25;
        int var27;
        int var28;
        int var29;
        int[] var30;
        double var33;
        double var35;
        int var37;
        int[] var38;
        int[] var39;
        var29 = 0;
        var39 = oo.field_i;
        var38 = var39;
        var30 = var38;
        for (var31 = 0; var31 < this.field_b; var31++) {
          for (var32 = 0; var32 < this.field_j; var32++) {
            if (var39[var29] != 0) {
              var7 = this.field_h[var32][var31];
              var5 = this.field_d[var32][var31];
              var16 = 0;
              var33 = var7 / 64.0;
              var35 = var5 / 4.0;
              for (var15 = param0; var15 > 0; var15--) {
                var27 = 2 << var15;
                var28 = var27 << 2;
                var11 = (double)var27 * var33;
                var9 = param1 + (double)var27 * var35;
                var14 = (int)var11;
                var13 = (int)var9;
                var23 = var9 - (double)var13;
                var25 = var11 - (double)var14;
                var37 = var28 * var13;
                var17 = this.field_e[var14 + var37 & 65535];
                var18 = this.field_e[var14 + var37 + var28 & 65535];
                var14++;
                if (var14 >= var28) {
                  var14 = var14 - var28;
                }
                var19 = this.field_e[var14 + var37 & 65535];
                var20 = this.field_e[var14 + var37 + var28 & 65535];
                var21 = ea.a(var17, var18, var23);
                var22 = ea.a(var19, var20, var23);
                var16 = var16 + (ea.a(var21, var22, var25) << 8) / var27;
              }
              var16 = (int)((double)var16 / ((var5 + 1.0) / 2.0));
              var16 = var16 >> 8;
              if (var16 >= 0) {
                if (var16 > 255) {
                  var16 = 255;
                }
              } else {
                var16 = 0;
              }
              incrementValue$0 = var29;
              var29++;
              var30[incrementValue$0] = param2[var16];
            } else {
              var29++;
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
        int var4 = 0;
        double[] dupTemp$0 = null;
        double[] dupTemp$1 = null;
        int var1;
        int var2;
        int var3;
        int var3Lifetime1;
        this.field_j = oo.field_b;
        this.field_b = oo.field_l;
        this.field_g = oo.field_b / 2;
        this.field_c = oo.field_l / 2;
        this.field_f = (int)Math.sqrt((double)(this.field_c * this.field_c + this.field_g * this.field_g));
        this.field_a = 3.141592653589793 / (double)(2 * this.field_f);
        this.field_i = 40.74366543152521;
        this.field_d = new double[oo.field_b][oo.field_l];
        this.field_h = new double[oo.field_b][oo.field_l];
        for (var3 = 0; var3 < oo.field_b; var3++) {
          var1 = var3 - this.field_g;
          for (var4 = 0; var4 < oo.field_l; var4++) {
            var2 = var4 - this.field_c;
            this.field_d[var3][var4] = Math.tan(this.field_a * ((double)this.field_f - Math.sqrt((double)(var1 * var1 + var2 * var2))));
            this.field_h[var3][var4] = 128.0 + this.field_i * Math.atan((double)var2 / ((double)var1 + 0.5));
            if (var1 < 0) {
              if (var2 <= 0) {
                dupTemp$0 = this.field_h[var3];
                dupTemp$0[var4] = dupTemp$0[var4] - 128.0;
              } else {
                dupTemp$1 = this.field_h[var3];
                dupTemp$1[var4] = dupTemp$1[var4] + 128.0;
              }
            }
          }
        }
        this.field_e = new int[65536];
        for (var3Lifetime1 = 0; var3Lifetime1 < 65536; var3Lifetime1++) {
          this.field_e[var3Lifetime1] = ea.a(var3Lifetime1);
        }
    }
}
