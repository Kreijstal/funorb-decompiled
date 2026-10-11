/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends am {
    private int field_z;
    static String field_B;
    static int field_w;
    private dd[] field_y;
    static int field_s;
    static String field_v;
    private int field_r;
    static dd[] field_t;
    static String field_x;
    static int[] field_A;
    private int field_u;

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (!param4.field_s) {
            stackIn_6_0 = (param4.d(-73)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param4 instanceof fe) {
            param0 = param0 & ((fe) (param4)).field_I;
          }
          var7 = -98 % ((2 - param2) / 41);
          if (!param0) {
            stackIn_13_0 = this.field_z;
          } else {
            if (var6_int == 0) {
              stackIn_13_0 = this.field_r;
            } else {
              stackIn_13_0 = this.field_u;
            }
          }
          var8 = stackIn_13_0;
          stackIn_16_0 = (!param0) ? 7105644 : 16777215;
          var9 = stackIn_16_0;
          qf.a((param4.field_y - this.field_y[0].field_y >> 1) + (param3 + param4.field_D), var8, param4.field_C + param1, (byte) 18, param4.field_l, this.field_y);
          this.field_a.a(param4.field_m, param1 + param4.field_C, -2 + (param3 + param4.field_D), param4.field_l, param4.field_y, var9, -1, 1, 1, this.field_a.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ng.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int c(int param0) {
        if (param0 != 12854) {
          return 100;
        }
        return j.field_b;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        try {
          if (param4 != -117) {
            field_t = (dd[]) null;
          }
          while (true) {
            param7--;
            if (0 > param7) {
              return;
            }
            var16 = param8;
            var10 = var16;
            var11 = param3;
            var12 = param6;
            var13 = param1;
            var14 = param0;
            var15 = 8355711 & var16[var11] >> 1;
            var10[var11] = rb.b(255, var14 >> 17) + rb.b(65280, var13 >> 9) - (-rb.b(var12 >> 1, 16711680) - var15);
            param0 = param0 + param5;
            param3++;
            param1 = param1 + param2;
            param6 = param6 + param9;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_7_0 = var10_ref;
          stackIn_7_1 = new StringBuilder().append("ng.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_B = null;
        if (param0 != -1) {
          return;
        }
        field_v = null;
        field_A = null;
        field_t = null;
        field_x = null;
    }

    public ng() {
        this(2188450, 2591221, 9543);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        int var5 = param0 >> 16;
        int var6 = param0 & 65535;
        if (param1 == 0) {
          return (var4 * var6 >> 16) + (var4 * var5 + param0 * var3);
        }
        field_x = (String) null;
        return (var4 * var6 >> 16) + (var4 * var5 + param0 * var3);
    }

    private ng(int param0, int param1, int param2) {
        this.field_y = jj.field_S;
        this.field_z = param2;
        this.field_a = bi.field_e;
        this.field_r = param0;
        this.field_u = param1;
    }

    static {
        field_v = "Invalid password.";
        field_s = -1;
        field_A = new int[5];
        field_x = "Email (Login):";
    }
}
