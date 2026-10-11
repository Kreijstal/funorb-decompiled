/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends ek {
    private int field_O;
    private mb field_N;
    static int[] field_M;
    static String field_Q;
    int field_K;
    int field_L;
    static int[] field_P;

    public static void a(int param0) {
        field_Q = null;
        field_P = null;
        field_M = null;
        if (param0 > -53) {
          String var2 = (String) null;
          b.a(-83, (String) null);
        }
    }

    final int b(int param0, int param1) {
        if (param1 < 0 ||
          this.field_N.a(126) <= param1) {
          return -1;
        }
        if (param0 != -1) {
          field_P = (int[]) null;
        }
        return this.field_N.b(param1, 0);
    }

    final static int[] h(int param0) {
        int var1 = 110 / ((-90 - param0) / 32);
        return new int[8];
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ul.a(d.field_b, te.field_p, -28705);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          if (param0 >= 78) {
            stackIn_9_0 = (String) (param1);
            return stackIn_9_0;
          }
          stackIn_7_0 = (String) null;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("b.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = client.field_A ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param5 + param1 - this.field_L;
          var9 = this.field_t - this.field_L * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_O / var9;
          if (param3 != 1) {
            if (2 != param3) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_N.a(114); var12++) {
              var13 = this.field_N.b(var12, 0) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_N.c(-91, var11);
            }
          } else {
            this.field_N.a(var8_int, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("b.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int i(int param0) {
        if (param0 != -15317) {
          String var3 = (String) null;
          b.a(-69, (String) null);
        }
        return this.field_O;
    }

    final int b(boolean param0) {
        if (!param0) {
          return -57;
        }
        return this.field_N.a(-77);
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        field_M = new int[8192];
        field_Q = "Master Challenge";
    }
}
