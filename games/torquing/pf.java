/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends q implements lm {
    static String field_j;
    private int field_s;
    private int field_o;
    static String field_u;
    static String field_q;
    private int field_t;
    private int[] field_p;
    private int field_z;
    static int field_A;
    private int field_x;
    private int field_k;
    private int field_y;
    static volatile int field_r;
    private int field_w;
    private int field_m;
    private int field_l;
    private int field_v;
    private int field_n;

    public final long a(int param0, int param1) {
        long var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        if (param0 >= 0) {
          if (param0 > this.field_v) {
            param0 = this.field_v;
          }
        } else {
          param0 = 0;
        }
        var3 = 0L;
        param1++;
        var5 = 0;
        if (param0 + param1 > this.field_v) {
          var6 = param0 * (this.field_y - this.field_x) + this.field_v * (this.field_x + this.field_t);
          var7 = param0 * (this.field_o - this.field_z) + this.field_v * (this.field_z + this.field_l);
          var8 = param0 * (this.field_s - this.field_k) + this.field_v * (this.field_k + this.field_m);
          var9 = param0 + param1 - this.field_v;
          param1 = param1 - var9;
          var5 = var5 + var9;
          var3 = var3 << var9;
          if (this.b(var6, var7, var8, this.field_v) == this.field_w) {
            var3 = var3 | (long)((1 << var9) - 1);
          }
        }
        var6Lifetime1 = param0 * this.field_y + param1 * this.field_x + this.field_v * this.field_t;
        var7Lifetime1 = param0 * this.field_o + param1 * this.field_z + this.field_v * this.field_l;
        var8Lifetime1 = param0 * this.field_s + param1 * this.field_k + this.field_v * this.field_m;
        while (param0 + param1 > 0) {
          if (var5 < 64) {
            var3 = var3 << 1;
            param1--;
            var5++;
            var6Lifetime1 = var6Lifetime1 - this.field_x;
            var7Lifetime1 = var7Lifetime1 - this.field_z;
            var8Lifetime1 = var8Lifetime1 - this.field_k;
            if (this.b(var6Lifetime1, var7Lifetime1, var8Lifetime1, this.field_v) != this.field_w) {
              continue;
            }
            var3 = var3 + 1L;
            continue;
          }
          break;
        }
        if (var5 < 64) {
          var6Lifetime2 = param0 * (this.field_y - this.field_x) + this.field_v * this.field_t;
          var7Lifetime2 = param0 * (this.field_o - this.field_z) + this.field_v * this.field_l;
          var8Lifetime2 = param0 * (this.field_s - this.field_k) + this.field_v * this.field_m;
          var9Lifetime1 = 64 - var5;
          var3 = var3 << var9Lifetime1;
          if (this.b(var6Lifetime2, var7Lifetime2, var8Lifetime2, this.field_v) == this.field_w) {
            var3 = var3 | (long)((1 << var9Lifetime1) - 1);
          }
        }
        return var3;
    }

    public final int a(int param0, int param1, int param2) {
        return ~this.b(param0, param1, param2, 1) != ~this.field_w ? 0 : 2;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5;
        int var7;
        int var8;
        var5 = 0;
        for (var6 = 0; var6 < this.field_n; var6++) {
          var7 = 6 * var6;
          var8 = (param0 - this.field_p[var7] * param3) * this.field_p[var7 + 3] + (param1 - this.field_p[var7 + 1] * param3) * this.field_p[var7 + 4] + (param2 - this.field_p[var7 + 2] * param3) * this.field_p[var7 + 5];
          if (var8 >= 0) {
            var5 = var5 + (1 << var6);
          }
        }
        return var5;
    }

    public final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = fo.a(param11, (byte) -49, fo.a(param9, (byte) -20, param10));
        param10 = param10 / var13;
        param11 = param11 / var13;
        param9 = param9 / var13;
        int var14 = param9 * this.field_p[3] + this.field_p[4] * param10 + param11 * this.field_p[5];
        int var15 = param11 * param11 + param10 * param10 + param9 * param9;
        int var16 = this.field_p[5] * this.field_p[5] + (this.field_p[3] * this.field_p[3] + this.field_p[4] * this.field_p[4]);
        double var17 = (double)var14 * (double)var14 / ((double)var16 * (double)var15);
        int var19 = this.field_p[3] * ((param6 + param3 + param0) / 3 - this.field_p[0]) + this.field_p[4] * ((param7 + (param1 + param4)) / 3 - this.field_p[1]) + this.field_p[5] * (-this.field_p[2] + (param5 + param2 + param8) / 3);
        double var20 = (double)var19 / Math.sqrt((double)var16);
        if (var17 > 0.99 &&
          15.0 > Math.abs(var20)) {
          return false;
        }
        return (this.a(0, param2, param1, param0) | this.a(0, param5, param4, param3) | this.a(0, param8, param7, param6)) == this.field_w ? true : false;
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5;
        int var7;
        var7 = Torquing.field_u;
        var5 = 0;
        for (var6 = param0; var6 < this.field_n; var6++) {
          if (0 < qm.a(true, param2, param3, 6 * var6, this.field_p, param1)) {
            var5 = var5 + (1 << var6);
          }
        }
        return var5;
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 <= 0) {
          return;
        }
        field_u = null;
    }

    public final boolean equals(Object param0) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = super.equals(param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("pf.equals(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -5) {
          pf.a(16);
        }
        stackIn_6_0 = (vk.field_E != null) && (ef.field_a.a(109));
        return stackIn_6_0;
    }

    public final String toString() {
        return super.toString();
    }

    public final boolean a(lm param0) {
        return this == param0;
    }

    public final boolean a() {
        return true;
    }

    public final void a(int[] param0, int[] param1, int[] param2, int param3) {
        try {
          this.field_v = param3;
          this.field_z = param1[1] - param1[2];
          this.field_y = param0[0] - param0[2];
          this.field_m = param2[2];
          this.field_o = param1[0] - param1[2];
          this.field_x = param0[1] - param0[2];
          this.field_k = param2[1] - param2[2];
          this.field_l = param1[2];
          this.field_t = param0[2];
          this.field_s = -param2[2] + param2[0];
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    pf(int[] param0, int[] param1, int[] param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param0.length;
          this.field_n = param0.length + 1;
          this.field_w = (1 << this.field_n) - 1;
          this.field_p = new int[6 * this.field_n];
          this.field_p[0] = param0[0];
          this.field_p[1] = param1[0];
          this.field_p[2] = param2[0];
          var5 = var4_int - 1;
          this.field_p[3] = -((-param2[0] + param2[1]) * (-param1[0] + param1[var5])) + (param1[1] - param1[0]) * (param2[var5] - param2[0]);
          this.field_p[4] = -((-param0[0] + param0[1]) * (-param2[0] + param2[var5])) + (-param2[0] + param2[1]) * (param0[var5] - param0[0]);
          this.field_p[5] = -((param0[var5] - param0[0]) * (param1[1] - param1[0])) + (param1[var5] - param1[0]) * (-param0[0] + param0[1]);
          wo.a((byte) 49, 3, this.field_p);
          if (0 > qm.a(true, param1[0] + 12, 1 + param0[0], 0, this.field_p, -12 + param2[0])) {
            this.field_p[4] = this.field_p[4] * -1;
            this.field_p[5] = this.field_p[5] * -1;
            this.field_p[3] = this.field_p[3] * -1;
          }
          for (var6 = 1; var6 < this.field_n; var6++) {
            var7 = var6 * 6;
            var8 = (-1 + var6) % var4_int;
            this.field_p[var7] = param0[var8];
            this.field_p[1 + var7] = param1[var8];
            this.field_p[2 + var7] = param2[var8];
            var9 = var6 % var4_int;
            this.field_p[3 + var7] = -((param2[var9] - param2[var8]) * -12) + 12 * (-param1[var8] + param1[var9]);
            this.field_p[var7 + 4] = (-param2[var8] + param2[var9]) * -1 - 12 * (param0[var9] - param0[var8]);
            this.field_p[5 + var7] = (param0[var9] - param0[var8]) * -12 - (param1[var9] - param1[var8]) * -1;
            wo.a((byte) 49, 3 + var7, this.field_p);
            var10 = (1 + var6) % var4_int;
            if (qm.a(true, param1[var10], param0[var10], var7, this.field_p, param2[var10]) < 0) {
              this.field_p[var7 + 3] = this.field_p[var7 + 3] * -1;
              this.field_p[4 + var7] = this.field_p[4 + var7] * -1;
              this.field_p[var7 + 5] = this.field_p[var7 + 5] * -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("pf.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_j = "Type your email address again to make sure it's correct";
        field_q = "Quit to website";
        field_r = 0;
        field_u = "To Customer Support";
    }
}
