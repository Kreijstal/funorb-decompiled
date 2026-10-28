/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends r {
    private int field_F;
    private String field_G;
    private int field_K;
    static om field_H;
    private int field_D;
    private boolean field_E;
    private BitmapFont field_L;
    static int[] field_M;
    static String field_I;

    final static byte[] a(String param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 10592) {
            ki.l(-55);
          }
          byte[] stackIn_3_0 = wk.field_e.a(param1 ^ -10596, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ki.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_M = null;
        field_H = null;
        if (param0 < 67) {
          field_M = (int[]) null;
          field_I = null;
          return;
        }
        field_I = null;
    }

    final String d(int param0) {
        boolean var2 = (this.field_C.field_u);
        this.field_C.field_u = this.field_u;
        String var3 = this.field_C.d(param0);
        this.field_C.field_u = (var2) ? true : false;
        return var3;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = this.field_k + param3;
        int var6 = this.field_j + param0;
        super.a(param0, (byte) 114, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var7 = this.field_E ? this.field_g - (this.field_D + this.field_K * 2) : 0;
        this.field_L.a(this.field_G, this.field_K + var5 + var7, var6 + this.field_K, -this.field_K + this.field_D, -(this.field_K * 2) + this.field_x, this.field_F, -1, this.field_E ? 0 : 2, 1, this.field_L.field_r);
        if (param1 >= 85) {
          return;
        }
        this.field_E = false;
    }

    ki(int param0, int param1, int param2, int param3, hm param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (db) null, (wn) null);
        int stackIn_10_0 = 0;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          this.field_C = param4;
          this.field_D = param6;
          this.field_F = param9;
          boolean stackIn_4_1 = (param5);
          this.field_E = stackIn_4_1;
          this.field_K = param7;
          this.field_L = param8;
          this.field_G = param10;
          int var12_int = -this.field_K + this.field_D;
          int var13 = this.field_L.b(param10, var12_int, this.field_L.field_r) + 2 * this.field_K;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(param2, param1, param0, true, var13);
          }
          if (this.field_E) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.field_K + this.field_D;
          }
          int var14 = stackIn_10_0;
          this.field_C.a(-(3 * this.field_K) + (-this.field_D + param2), this.field_K + (var13 - param3 >> 1), var14, true, param3 - 2 * this.field_K);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var12 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var12;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ki.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_H = new om(10, 2, 2, 0);
        field_M = new int[]{-1, -1, -1, 0};
        field_I = "Container not retrieved - restarting";
    }
}
