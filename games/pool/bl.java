/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    boolean field_c;
    int field_E;
    private int field_m;
    private int field_h;
    private int field_i;
    private int field_f;
    private int field_u;
    static int[] field_r;
    private int field_D;
    private int field_z;
    private int field_F;
    private int field_k;
    static int field_s;
    private int field_p;
    private int field_d;
    private int field_b;
    int field_y;
    private int field_G;
    private int field_n;
    private int field_q;
    static String field_j;
    private int field_C;
    private int field_a;
    private int field_o;
    private int field_l;
    static int field_g;
    static String field_v;
    private int field_I;
    static String field_e;
    private int field_w;
    private int field_A;
    static String field_t;
    private int field_B;
    private int field_J;
    static boolean field_x;

    final void a(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = Pool.field_O;
        try {
          var4 = this.field_i - param1[1];
          var3_int = this.field_b - param1[0];
          var5 = -param1[2] + this.field_u;
          this.field_B = var4 * param1[10] + (var3_int * param1[9] + param1[11] * var5) >> 16;
          if (this.field_B == 0) {
            this.field_B = -1;
          }
          if (this.field_B <= 0) {
            return;
          }
          this.field_o = 320 + (param1[5] * var5 + (param1[3] * var3_int + param1[4] * var4) >> 7) / this.field_B;
          this.field_l = (var5 * param1[8] + (param1[6] * var3_int + param1[7] * var4) >> 7) / this.field_B + 240;
          var4Lifetime1 = this.field_F - param1[1];
          var5Lifetime1 = this.field_k - param1[2];
          var3_intLifetime1 = this.field_J - param1[0];
          this.field_d = var4Lifetime1 * param1[10] + var3_intLifetime1 * param1[9] + param1[11] * var5Lifetime1 >> 16;
          if (0 == this.field_d) {
            this.field_d = -1;
          }
          if (this.field_d <= 0) {
            return;
          }
          this.field_C = 320 + (var3_intLifetime1 * param1[3] + (var4Lifetime1 * param1[4] + var5Lifetime1 * param1[5]) >> 7) / this.field_d;
          this.field_a = 240 + (var3_intLifetime1 * param1[6] + param1[7] * var4Lifetime1 + param1[8] * var5Lifetime1 >> 7) / this.field_d;
          var3_intLifetime2 = -param1[0] + this.field_z;
          var4Lifetime2 = this.field_D - param1[1];
          var5Lifetime2 = -param1[2] + this.field_h;
          this.field_f = param1[11] * var5Lifetime2 + (var4Lifetime2 * param1[10] + param1[9] * var3_intLifetime2) >> 16;
          if (param0 > -34) {
            return;
          }
          if (0 == this.field_f) {
            this.field_f = -1;
          }
          if (this.field_f <= 0) {
            return;
          }
          this.field_q = 240 + (param1[7] * var4Lifetime2 + param1[6] * var3_intLifetime2 + param1[8] * var5Lifetime2 >> 7) / this.field_f;
          this.field_n = (param1[5] * var5Lifetime2 + (param1[4] * var4Lifetime2 + param1[3] * var3_intLifetime2) >> 7) / this.field_f + 320;
          var5Lifetime3 = -param1[2] + this.field_A;
          var4Lifetime3 = this.field_m - param1[1];
          var3_intLifetime3 = -param1[0] + this.field_w;
          this.field_G = var4Lifetime3 * param1[10] + (param1[9] * var3_intLifetime3 + param1[11] * var5Lifetime3) >> 16;
          if (0 == this.field_G) {
            this.field_G = -1;
          }
          if (0 >= this.field_G) {
            return;
          }
          this.field_p = 240 + (param1[8] * var5Lifetime3 + (param1[7] * var4Lifetime3 + var3_intLifetime3 * param1[6]) >> 7) / this.field_G;
          this.field_I = 320 + (var5Lifetime3 * param1[5] + var3_intLifetime3 * param1[3] + param1[4] * var4Lifetime3 >> 7) / this.field_G;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        var8 = Pool.field_O;
        if (0 < this.field_B &&
          this.field_d > 0 &&
          0 < this.field_f &&
          this.field_G > 0) {
          boolean decompiledFrameRemainder0 = true;
          if ((!(this.field_o < qh.field_b) ||
            !(this.field_C < qh.field_b) ||
            !(this.field_n < qh.field_b) ||
            !(qh.field_b > this.field_I)) &&
            (decompiledFrameRemainder0 = !(this.field_o < qh.field_j)) &&
            (decompiledFrameRemainder0 = !(this.field_C < qh.field_j)) &&
            (decompiledFrameRemainder0 = !(this.field_n < qh.field_j))) {
            decompiledFrameRemainder0 = !(this.field_I < qh.field_j);
          }
          if (decompiledFrameRemainder0) {
            if (qh.field_c > this.field_l &&
              this.field_a < qh.field_c &&
              this.field_q < qh.field_c &&
              this.field_p < qh.field_c) {
              return;
            }
            if (!(qh.field_g > this.field_l) &&
              !(qh.field_g > this.field_a) &&
              !(qh.field_g > this.field_q) &&
              !(qh.field_g > this.field_p)) {
              return;
            }
          }
          if (this.field_E <= 0) {
            var2 = 3346790;
          } else {
            if (this.field_E >= 256) {
              var2 = 10044586;
            } else {
              var2 = (this.field_E * 17408 + 1114112 - this.field_E * 4352) / 256 & 65280 | 16711935 & (this.field_E * 10027178 + (-(this.field_E * 3342438) + 855664128)) / 256;
            }
          }
          if (this.field_y > 0 &&
            256 > this.field_y) {
            var3 = (this.field_I - this.field_o << 1) * this.field_y / 256;
            var4 = this.field_y * (this.field_p - this.field_l << 1) / 256;
            var5 = 3 * (this.field_I - this.field_o) / 2 * this.field_y / 256;
            var6 = this.field_y * ((-this.field_l + this.field_p) * 3 / 2) / 256;
            var7 = (-this.field_y + 256 << 8) / 256;
            qh.b(-var3 + this.field_o, this.field_l - var4, this.field_C - var3, this.field_a - var4, 10044586, var7);
            qh.b(var3 + this.field_n, this.field_q + var4, var3 + this.field_I, this.field_p + var4, 10044586, var7);
            qh.b(this.field_o - var3, -var4 + this.field_l, this.field_n - var3, this.field_q - var4, 10044586, var7);
            qh.b(var3 + this.field_C, var4 + this.field_a, var3 + this.field_I, var4 + this.field_p, 10044586, var7);
            qh.b(this.field_o - var5, this.field_l - var6, -var5 + this.field_C, -var6 + this.field_a, 10044586, var7);
            qh.b(this.field_n + var5, var6 + this.field_q, var5 + this.field_I, var6 + this.field_p, 10044586, var7);
            qh.b(this.field_o - var5, -var6 + this.field_l, this.field_n - var5, this.field_q - var6, 10044586, var7);
            qh.b(var5 + this.field_C, var6 + this.field_a, this.field_I + var5, this.field_p + var6, 10044586, var7);
          }
          qh.d(this.field_o, this.field_l, this.field_C, this.field_a, var2);
          qh.d(this.field_n, this.field_q, this.field_I, this.field_p, var2);
          qh.d(this.field_o, this.field_l, this.field_n, this.field_q, var2);
          qh.d(this.field_C, this.field_a, this.field_I, this.field_p, var2);
          if (param0 != 67) {
            var9 = (int[]) null;
            this.a(-121, (int[]) null);
          }
          return;
        }
    }

    public static void a(int param0) {
        field_v = null;
        if (param0 <= 116) {
          field_r = (int[]) null;
        }
        field_j = null;
        field_e = null;
        field_r = null;
        field_t = null;
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        this.field_m = param10;
        this.field_w = param9;
        this.field_u = param2;
        this.field_A = param11;
        this.field_F = param4;
        this.field_k = param5;
        this.field_D = param7;
        this.field_z = param6;
        this.field_i = param1;
        this.field_J = param3;
        this.field_h = param8;
        this.field_b = param0;
    }

    static {
        field_s = 0;
        field_j = "You and <%0> have resigned!";
        field_r = new int[]{2, 20, 21, 49, 5, 10, 11, 13};
        field_v = "Game options changed (<%0>)";
        field_g = 65536;
        field_t = "Please enter your date of birth to enable chat:";
        field_e = "Kick";
    }
}
