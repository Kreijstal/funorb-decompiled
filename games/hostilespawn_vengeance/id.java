/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Serializable {
    int[] field_k;
    int[] field_h;
    int field_d;
    int field_a;
    private qg[] field_x;
    static jf field_s;
    int field_n;
    int[] field_y;
    boolean[] field_r;
    int[] field_j;
    int[] field_z;
    int[] field_v;
    int field_m;
    int[] field_u;
    boolean[] field_q;
    int[] field_c;
    static nc field_A;
    int[] field_i;
    int[] field_g;
    boolean[] field_e;
    static bd[] field_p;
    int[] field_f;
    int[] field_o;
    static ji field_t;
    static String field_l;
    boolean[] field_B;
    static bd field_w;
    static String field_b;

    private final void a(byte[] param0, int param1) {
        int var4 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0.length != 60000) {
            this.a((byte) 92, param0);
            return;
          }
          this.a(106, 100, 100);
          var3_int = 0;
          for (var4 = 0; this.field_n > var4; var4++) {
            incrementValue$0 = var3_int;
            var3_int++;
            this.field_y[var4] = param0[incrementValue$0];
            if (0 > this.field_y[var4]) {
              this.field_y[var4] = this.field_y[var4] + 256;
            }
            incrementValue$1 = var3_int;
            var3_int++;
            this.field_y[var4] = this.field_y[var4] + 64 * param0[incrementValue$1];
            incrementValue$2 = var3_int;
            var3_int++;
            this.field_c[var4] = param0[incrementValue$2] * 2;
            incrementValue$3 = var3_int;
            var3_int++;
            this.field_k[var4] = -5 + param0[incrementValue$3];
            incrementValue$4 = var3_int;
            var3_int++;
            this.field_f[var4] = param0[incrementValue$4];
            this.field_r[var4] = false;
            if (this.field_f[var4] == 3) {
              this.field_r[var4] = true;
              if (this.field_c[var4] == 0) {
                this.field_f[var4] = 1;
              } else {
                this.field_f[var4] = 0;
              }
            }
            incrementValue$5 = var3_int;
            var3_int++;
            stackIn_15_0 = this.field_B;
            stackIn_15_1 = var4;
            stackIn_16_2 = (param0[incrementValue$5] == 1);
            stackIn_15_0[stackIn_15_1] = stackIn_16_2;
            this.field_u[var4] = 0;
            this.field_i[var4] = 0;
            this.field_e[var4] = false;
          }
          var5 = -72 / ((param1 - 41) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("id.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (this.field_c[param2] > 1 &&
          5 != this.field_c[param2]) {
          return this.field_c[param2];
        }
        if (param0 > 0) {
          var4 = param2 - 1;
          if (0 <= var4 &&
            this.field_c[var4] > 1 &&
            this.field_c[var4] != 5) {
            return this.field_c[var4];
          }
          var4Lifetime1 = -this.field_d + param2;
          if (var4Lifetime1 >= 0 &&
            this.field_c[var4Lifetime1] > 1 &&
            5 != this.field_c[var4Lifetime1]) {
            return this.field_c[var4Lifetime1];
          }
          var4Lifetime1--;
          if (var4Lifetime1 >= 0 &&
            1 < this.field_c[var4Lifetime1] &&
            this.field_c[var4Lifetime1] != 5) {
            return this.field_c[var4Lifetime1];
          }
          if (param0 > 1) {
            var4Lifetime2 = param2 - 2;
            if (0 <= var4Lifetime2 &&
              this.field_c[var4Lifetime2] > 1 &&
              5 != this.field_c[var4Lifetime2]) {
              return this.field_c[var4Lifetime2];
            }
            var4Lifetime2 = var4Lifetime2 - this.field_d;
            if (var4Lifetime2 >= 0 &&
              this.field_c[var4Lifetime2] > 1 &&
              this.field_c[var4Lifetime2] != 5) {
              return this.field_c[var4Lifetime2];
            }
            var4Lifetime2 = var4Lifetime2 - this.field_d;
            if (var4Lifetime2 >= 0 &&
              this.field_c[var4Lifetime2] > 1 &&
              this.field_c[var4Lifetime2] != 5) {
              return this.field_c[var4Lifetime2];
            }
            var4Lifetime2++;
            if (var4Lifetime2 >= 0 &&
              this.field_c[var4Lifetime2] > 1 &&
              this.field_c[var4Lifetime2] != 5) {
              return this.field_c[var4Lifetime2];
            }
            var4Lifetime2++;
            if (var4Lifetime2 >= 0 &&
              this.field_c[var4Lifetime2] > 1 &&
              this.field_c[var4Lifetime2] != 5) {
              return this.field_c[var4Lifetime2];
            }
          }
        }
        if (param1 == 5857) {
          return 0;
        }
        return 75;
    }

    final void a(int param0, int param1) {
        int var11 = 0;
        int var12 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int var14;
        oc var15;
        var14 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -2) {
          field_b = (String) null;
        }
        var15 = mm.field_m[0].field_j;
        var4 = var15.b(-4);
        vf.a(param0 - 83, var4);
        var5 = var15.field_g - 20;
        var6 = 20 + var15.field_g;
        var7 = var15.field_e - 27;
        if (var5 <= 0) {
          var5 = 1;
        }
        if (var7 <= 0) {
          var7 = 1;
        }
        var8 = 27 + var15.field_e;
        if (var6 >= this.field_a - 1) {
          var6 = this.field_a - 2;
        }
        if (var8 >= -1 + this.field_d) {
          var8 = -2 + this.field_d;
        }
        var10 = this.field_d * var5;
        for (var11 = var5; var11 < var6; var11++) {
          var9 = var7 + var10;
          for (var12 = var7; var8 > var12; var12++) {
            if (this.field_u[var9] > 0) {
              if (this.field_u[var9] > 0) {
                this.field_u[var9] = this.field_u[var9] - param1;
              }
              var13 = this.field_u[var9] >> 1;
              if (this.field_u[-1 + var9] < var13) {
                this.field_u[var9 - 1] = var13;
              }
              if (this.field_u[var9 + 1] < var13) {
                this.field_u[1 + var9] = var13;
              }
              if (var13 > this.field_u[var9 - this.field_d]) {
                this.field_u[var9 - this.field_d] = var13;
              }
              if (var13 > this.field_u[var9 + this.field_d]) {
                this.field_u[this.field_d + var9] = var13;
              }
            }
            if (this.field_f[var9] != 0) {
              if (this.field_c[var9] != 2 &&
                this.field_c[var9] != 4) {
                this.field_c[var9] = 1;
                if (this.field_f[var9 - 1] >= 1 &&
                  this.field_f[var9 - this.field_d] >= 1 &&
                  this.field_f[var9 - 1 - this.field_d] >= 1) {
                  this.field_c[var9] = 0;
                }
              }
            } else {
              this.field_c[var9] = 2;
            }
            if (this.field_c[var9] == 0 && (this.field_c[var9 - 1] == 2 ||
              4 == this.field_c[var9 - 1] ||
              this.field_c[-this.field_d + var9] == 2 ||
              this.field_c[-this.field_d + var9] == 4)) {
              this.field_c[var9] = 1;
            }
            var9++;
          }
          var10 = var10 + this.field_d;
        }
    }

    public static void a(byte param0) {
        field_s = null;
        int var1 = -12 / ((param0 + 14) / 33);
        field_b = null;
        field_l = null;
        field_t = null;
        field_w = null;
        field_p = null;
        field_A = null;
    }

    private final void a(byte param0, byte[] param1) {
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vi var10 = null;
        int var8Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var10 = new vi(param1);
          var4 = var10.l(32270);
          if (param0 <= 81) {
            this.a(-10, 78);
          }
          var5 = var10.e(8);
          var6 = var10.e(8);
          this.a(62, var6, var5);
          if (var4 < 3) {
            var10.l(32270);
          }
          this.field_m = var10.l(32270);
          for (var7 = 0; var7 < this.field_n; var7++) {
            this.field_y[var7] = var10.e(8);
            this.field_c[var7] = var10.l(32270);
            if (var4 < 9) {
              this.field_k[var7] = var10.l(32270);
            } else {
              this.field_k[var7] = var10.e(8);
            }
            if (var4 >= 4) {
              this.field_j[var7] = var10.l(32270);
              this.field_z[var7] = var10.l(32270);
            }
            this.field_f[var7] = var10.l(32270);
            stackIn_16_0 = this.field_r;
            stackIn_16_1 = var7;
            stackIn_17_2 = (var10.l(32270) == 1);
            stackIn_16_0[stackIn_16_1] = stackIn_17_2;
            stackIn_19_0 = this.field_B;
            stackIn_19_1 = var7;
            stackIn_20_2 = (var10.l(32270) == 1);
            stackIn_19_0[stackIn_19_1] = stackIn_20_2;
            if (var4 < 1) {
              this.field_o[var7] = 0;
            } else {
              this.field_o[var7] = var10.b(true);
            }
            if (var4 >= 5) {
              this.field_g[var7] = var10.l(32270);
            }
            if (var4 >= 6) {
              this.field_h[var7] = var10.l(32270);
            }
            this.field_u[var7] = 0;
            this.field_i[var7] = 0;
            this.field_e[var7] = false;
          }
          if (var4 >= 7) {
            var7Lifetime1 = var10.l(32270) * 2;
            this.field_v = new int[var7Lifetime1];
            for (var8 = 0; var8 < var7Lifetime1; var8++) {
              this.field_v[var8] = var10.e(8);
            }
          }
          if (var4 >= 8) {
            var7Lifetime2 = var10.l(32270);
            this.field_x = new qg[var7Lifetime2];
            for (var8Lifetime1 = 0; var8Lifetime1 < var7Lifetime2; var8Lifetime1++) {
              this.field_x[var8Lifetime1] = new qg(var10);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("id.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        this.field_a = param1;
        this.field_d = param2;
        this.field_n = this.field_d * this.field_a;
        this.field_h = new int[this.field_n];
        this.field_u = new int[this.field_n];
        if (param0 <= 42) {
          this.field_z = (int[]) null;
        }
        this.field_e = new boolean[this.field_n];
        this.field_g = new int[this.field_n];
        this.field_f = new int[this.field_n];
        this.field_v = new int[]{};
        this.field_i = new int[this.field_n];
        this.field_c = new int[this.field_n];
        this.field_k = new int[this.field_n];
        this.field_r = new boolean[this.field_n];
        this.field_o = new int[this.field_n];
        this.field_y = new int[this.field_n];
        this.field_q = new boolean[this.field_n];
        this.field_B = new boolean[this.field_n];
        this.field_j = new int[this.field_n];
        this.field_z = new int[this.field_n];
        this.field_x = new qg[]{};
        for (var4 = 0; var4 < this.field_n; var4++) {
          this.field_y[var4] = 0;
          this.field_c[var4] = 2;
          this.field_k[var4] = 0;
          this.field_j[var4] = 0;
          this.field_z[var4] = 0;
          this.field_u[var4] = 0;
          this.field_i[var4] = 0;
          this.field_r[var4] = false;
          this.field_e[var4] = false;
          this.field_f[var4] = 0;
          this.field_B[var4] = false;
          this.field_o[var4] = 0;
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > ~this.field_c[param2]) {
          var4 = this.field_c[param2];
        }
        if (param0 > 0) {
          if (param2 > 0 &&
            this.field_c[-1 + param2] > 1) {
            var4 = this.field_c[-1 + param2];
          }
          if (param2 > this.field_d + 1 &&
            this.field_c[param2 - (1 + this.field_d)] > 1) {
            var4 = this.field_c[-this.field_d + (-1 + param2)];
          }
          if (this.field_d < param2 &&
            this.field_c[param2 - this.field_d] > 1) {
            var4 = this.field_c[-this.field_d + param2];
          }
        }
        return var4;
    }

    id(byte[] param0) {
        this.field_x = new qg[]{};
        try {
          this.a(param0, 127);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new jf();
        field_l = "Connection restored.";
        field_b = "Find the rocket launcher, then use it to destroy the turrets blocking the lift.";
    }
}
