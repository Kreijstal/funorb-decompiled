/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej implements lm {
    private double field_f;
    private static double[] field_n;
    private double field_A;
    private static double[] field_g;
    private int field_u;
    private int field_q;
    private double field_y;
    private int field_p;
    private double field_e;
    private int field_w;
    private int field_i;
    private int field_x;
    private double field_a;
    private double field_k;
    private double field_t;
    private double field_v;
    private int field_m;
    private double field_d;
    private int field_s;
    private int field_b;
    private int field_j;
    private int field_o;
    private int field_r;
    private int field_z;
    private double field_c;
    private int field_h;
    private double field_l;

    public final int a(int param0, int param1, int param2) {
        double var4 = 0.0;
        field_g[0] = (double)param0 - this.field_e;
        field_g[1] = (double)param1 - this.field_v;
        field_g[2] = (double)param2 - this.field_f;
        if (ap.a(field_g, 0, field_n, 0) > 0.0) {
          ap.a(field_g, 0, field_n, 0, field_g, 3);
          var4 = ap.a(field_g, 3, field_g, 3);
          if (var4 < this.field_A) {
            return 2;
          }
        }
        return 0;
    }

    public final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int stackIn_10_0 = 0;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        int var23;
        double var24;
        double var26;
        double var28;
        double var30;
        double var32;
        double var34;
        double var36;
        double var38;
        double var40;
        double var42;
        double var44;
        double var46;
        field_g[6] = (double)param9;
        field_g[7] = (double)param10;
        field_g[8] = (double)param11;
        var13 = ap.a(field_g, 6, field_n, 0);
        field_g[0] = (double)param3 - this.field_e;
        field_g[1] = (double)param4 - this.field_v;
        field_g[2] = (double)param5 - this.field_f;
        var15 = ap.a(field_g, 6, field_g, 0) / var13;
        if (!Double.isInfinite(var15) &&
          !Double.isNaN(var15)) {
          var17 = Math.abs(field_g[6]);
          var19 = Math.abs(field_g[7]);
          var21 = Math.abs(field_g[8]);
          if (!(var17 > var19)) {
            stackIn_10_0 = (!(var19 > var21)) ? 2 : 1;
          } else {
            stackIn_10_0 = (!(var17 > var21)) ? 2 : 0;
          }
          var23 = stackIn_10_0;
          if (var23 != 0) {
            if (var23 != 1) {
              var24 = (double)(param0 - param3);
              var26 = (double)(param6 - param3);
              var28 = this.field_e + var15 * field_n[0] - (double)param3;
              var30 = (double)(param1 - param4);
              var32 = (double)(param7 - param4);
              var34 = this.field_v + var15 * field_n[1] - (double)param4;
              var36 = var21;
            } else {
              var24 = (double)(param2 - param5);
              var26 = (double)(param8 - param5);
              var28 = this.field_f + var15 * field_n[2] - (double)param5;
              var30 = (double)(param0 - param3);
              var32 = (double)(param6 - param3);
              var34 = this.field_e + var15 * field_n[0] - (double)param3;
              var36 = var19;
            }
          } else {
            var24 = (double)(param1 - param4);
            var26 = (double)(param7 - param4);
            var28 = this.field_v + var15 * field_n[1] - (double)param4;
            var30 = (double)(param2 - param5);
            var32 = (double)(param8 - param5);
            var34 = this.field_f + var15 * field_n[2] - (double)param5;
            var36 = var17;
          }
          var38 = var34 * var26 - var28 * var32;
          var40 = var28 * var30 - var34 * var24;
          if (var38 >= 0.0 &&
            var40 >= 0.0 &&
            var38 + var40 <= var36) {
            return true;
          }
          this.a(param0, param1, param2, param3, param4, param5, param6, param7, param8);
          if (!(this.field_y < this.field_A) &&
            !(this.field_c + this.field_l + this.field_y < this.field_A) &&
            !(this.field_t + this.field_k + this.field_y < this.field_A)) {
            if (this.field_l < 0.0 &&
              -this.field_l < 2.0 * this.field_c &&
              4.0 * this.field_c * this.field_y - this.field_l * this.field_l < this.field_A * 4.0 * this.field_c) {
              return true;
            }
            if (this.field_k < 0.0 &&
              -this.field_k < 2.0 * this.field_t &&
              4.0 * this.field_t * this.field_y - this.field_k * this.field_k < this.field_A * 4.0 * this.field_t) {
              return true;
            }
            var42 = this.field_t + this.field_c - this.field_d;
            var44 = this.field_d + this.field_k - 2.0 * this.field_c - this.field_l;
            var46 = this.field_c + this.field_l + this.field_y;
            if (var44 < 0.0 &&
              -var44 < 2.0 * var42 &&
              4.0 * var42 * var46 - var44 * var44 < (double)(this.field_o * 4) * var42) {
              return true;
            }
            return false;
          }
          return true;
        }
        return false;
    }

    public static void b() {
        field_g = null;
        field_n = null;
    }

    public final boolean equals(Object param0) {
        return super.equals(param0);
    }

    public final boolean a(lm param0) {
        ej var2;
        boolean stackIn_7_0 = false;
        boolean decompiledFrameRemainder0 = true;
        if (param0 instanceof ej) {
          var2 = (ej) (param0);
          if (this.field_e == var2.field_e &&
            this.field_v == var2.field_v &&
            this.field_f == var2.field_f &&
            this.field_a == var2.field_a) {
            stackIn_7_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    public final boolean a() {
        return false;
    }

    public final long a(int param0, int param1) {
        int var5 = 0;
        long var3;
        this.field_r = param0 * this.field_p + param1 * this.field_h + this.field_x;
        this.field_j = param0 * ((param0 * this.field_s + param1 * this.field_m) / this.field_z + this.field_b) / this.field_z + param1 * (param1 * this.field_i / this.field_z + this.field_q) / this.field_z + this.field_u;
        this.field_w = param0 * this.field_m + this.field_i;
        if (this.field_r > 0 &&
          this.field_j < this.field_o) {
          var3 = 1L;
        } else {
          var3 = 0L;
        }
        for (var5 = 0; var5 < 63; var5++) {
          var3 = var3 << 1;
          param1--;
          this.field_r = this.field_r - this.field_h;
          this.field_j = this.field_j - ((2 * param1 * this.field_i + this.field_w) / this.field_z + this.field_q) / this.field_z;
          if (this.field_r > 0 &&
            this.field_j < this.field_o) {
            var3 = var3 + 1L;
          }
        }
        return var3;
    }

    public final void a(int[] param0, int[] param1, int[] param2, int param3) {
        int var8 = 0;
        int[] var12 = new int[12];
        int[] var11 = var12;
        int[] var5 = var11;
        int[] var6 = new int[]{1, 12, -12};
        var5[0] = param0[0] - param0[2];
        var5[1] = param1[0] - param1[2];
        var5[2] = param2[0] - param2[2];
        this.field_p = ap.a(var12, 0, var6, 0);
        ap.a(var12, 0, var6, 0, var12, 3);
        var5[0] = param0[1] - param0[2];
        var5[1] = param1[1] - param1[2];
        var5[2] = param2[1] - param2[2];
        this.field_h = ap.a(var12, 0, var6, 0);
        ap.a(var12, 0, var6, 0, var12, 6);
        var5[0] = param0[2] - (int)(1.0 + this.field_e);
        var5[1] = param1[2] - (int)(-1.0 + this.field_v);
        var5[2] = param2[2] - (int)(1.0 + this.field_f);
        int var7 = ke.a(ap.a(var12, 0, var12, 0), (byte) -97);
        if (var7 % 2 == 0) {
          var8 = 1 << var7 / 2;
        } else {
          var8 = 1518500249 >> 30 - var7 / 2;
        }
        int var9 = 67108864 / (var8 * 17);
        if (var9 > 303104) {
          var9 = 303104;
        }
        var5[0] = var9 * param0[2] - (int)(0.5 + (double)var9 * this.field_e);
        var5[1] = var9 * param1[2] - (int)(-0.5 + (double)var9 * this.field_v);
        var5[2] = var9 * param2[2] - (int)(0.5 + (double)var9 * this.field_f);
        this.field_x = ap.a(var12, 0, var6, 0) / var9 * param3;
        ap.a(var12, 0, var6, 0, var12, 9);
        var5[9] = var5[9] / var9;
        var5[10] = var5[10] / var9;
        var5[11] = var5[11] / var9;
        int var10 = 289;
        this.field_s = ap.a(var12, 3, var12, 3) / var10;
        this.field_i = ap.a(var12, 6, var12, 6) / var10;
        this.field_u = ap.a(var12, 9, var12, 9) / var10;
        this.field_m = 2 * ap.a(var12, 3, var12, 6) / var10;
        this.field_b = 2 * ap.a(var12, 3, var12, 9) / var10;
        this.field_q = 2 * ap.a(var12, 6, var12, 9) / var10;
        this.field_z = param3;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        field_g[0] = (double)(param0 - param6);
        field_g[1] = (double)(param1 - param7);
        field_g[2] = (double)(param2 - param8);
        ap.a(field_g, 0, field_n, 0, field_g, 3);
        field_g[0] = (double)(param3 - param6);
        field_g[1] = (double)(param4 - param7);
        field_g[2] = (double)(param5 - param8);
        ap.a(field_g, 0, field_n, 0, field_g, 6);
        field_g[0] = (double)param6 - this.field_e;
        field_g[1] = (double)param7 - this.field_v;
        field_g[2] = (double)param8 - this.field_f;
        ap.a(field_g, 0, field_n, 0, field_g, 9);
        this.field_t = ap.a(field_g, 3, field_g, 3);
        this.field_c = ap.a(field_g, 6, field_g, 6);
        this.field_y = ap.a(field_g, 9, field_g, 9);
        this.field_d = 2.0 * ap.a(field_g, 3, field_g, 6);
        this.field_k = 2.0 * ap.a(field_g, 3, field_g, 9);
        this.field_l = 2.0 * ap.a(field_g, 6, field_g, 9);
    }

    ej(double param0, double param1, double param2, double param3) {
        this.field_e = param0;
        this.field_v = param1;
        this.field_f = param2;
        this.field_a = param3;
        this.field_A = param3 * param3;
        this.field_o = (int)(0.5 + this.field_A);
    }

    static {
        field_g = new double[12];
        field_n = new double[]{0.058823529411764705, 0.7058823529411765, -0.7058823529411765};
    }
}
