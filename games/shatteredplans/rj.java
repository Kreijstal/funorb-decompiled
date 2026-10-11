/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends ka {
    static int field_q;
    static String field_r;
    static qr field_p;

    public static void i(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != 388178881) {
          field_r = (String) null;
        }
    }

    final static int c(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          param1 = param1 >>> 16;
          var2 += 16;
        } else {
          if (65536 <= param1) {
            param1 = param1 >>> 16;
            var2 += 16;
          }
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (16 <= param1) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        if (param0 >= 1) {
          return param1 + var2;
        }
        rj.i(28);
        return param1 + var2;
    }

    final static void a(int param0, bc param1, bc param2) {
        try {
          if (param0 > -25) {
            rj.c(122, 49);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 5);
    }

    final int a(int param0, byte param1) {
        if (param1 >= -25) {
          return -96;
        }
        return param0 >> 1;
    }

    final int b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_y) {
            stackIn_2_0 = super.b(param0, 100);
            return stackIn_2_0;
          }
          var3_int = param0.field_x;
          if (param1 < 41) {
            this.a(-5, (byte) 83);
          }
          if (param0.field_u) {
            var3_int = var3_int * 2;
          }
          var3_int = var3_int + this.a(-5, param0);
          if (var3_int < 1) {
            var3_int = 1;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rj.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] b(int param0) {
        int var2 = 24 / ((param0 + 48) / 61);
        return new int[]{16, 18};
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.a(-5, param0);
          if (param1 != 2) {
            this.a(50, (byte) 72);
          }
          stackIn_5_0 = (var3_int == 0) ? 1 : var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rj.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
