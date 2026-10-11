/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el implements io {
    static int field_d;
    private int field_l;
    static String field_h;
    private int field_e;
    private rb field_j;
    static int field_n;
    private int field_a;
    static String field_m;
    private int field_f;
    static int field_k;
    private int field_b;
    static int field_g;
    private int field_c;
    static String field_i;

    public static void a(int param0) {
        field_m = null;
        if (param0 == -1) {
          field_i = null;
          field_h = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        el.a((byte) 20, false, (byte[]) null);
        field_i = null;
        field_h = null;
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        kp var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        kp stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param2.length > 136) {
            var3 = new kp();
            ((rf) ((Object) var3)).a(4, param2);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param0 != 94) {
            stackIn_8_0 = (Object) null;
            return stackIn_8_0;
          }
          if (!param1) {
            stackIn_13_0 = (byte[]) (param2);
            return stackIn_13_0;
          }
          stackIn_11_0 = jl.a(param2, (byte) 45);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("el.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          var3_int = 1;
          while (param0 > 1) {
            if (0 != (1 & param0)) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param0 = param0 >> 1;
          }
          if (param1 != 28913) {
            stackIn_10_0 = 91;
            return stackIn_10_0;
          }
          if (param0 != 1) {
            return var3_int;
          }
          stackIn_14_0 = var3_int * param2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "el.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var10 = 0;
        ga stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        hf var12 = null;
        var11 = ZombieDawn.field_J;
        try {
          if (param3 instanceof hf) {
            stackIn_4_0 = (ga) (param3);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (hf) (stackIn_4_0);
          if (var12 != null) {
          }
          bi.b(param4 + param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, this.field_b);
          if (param0 != 16777215) {
            el.a(-79);
          }
          var7 = -(var12.field_K * 2) + param3.field_i;
          var8 = param3.field_k + (param4 + var12.field_K);
          var9 = var12.field_G + (param2 + param3.field_j);
          bi.e(var8, var9, var8 + var7, var9, this.field_l);
          for (var10 = var12.a(-85) - 1; var10 >= 0; var10--) {
            bi.g(var8 + var12.a((byte) 58, var10) * var7 / var12.b(false), var9, this.field_e, this.field_f);
          }
          if (null == this.field_j) {
            return;
          }
          this.field_j.a(var12.field_o, var8 + var7 / 2, this.field_j.field_C + (var9 + var12.field_G), this.field_a, this.field_c);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("el.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    el(rb param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_c = param2;
          this.field_e = param5;
          this.field_j = param0;
          this.field_l = param3;
          this.field_f = param6;
          this.field_a = param1;
          this.field_b = param4;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_h = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_m = "Loading graphics";
        field_i = "Retry";
    }
}
