/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends eb {
    private fc field_N;
    int field_K;
    private int field_L;
    int field_M;

    final int a(int param0) {
        if (param0 != 0) {
          this.field_L = -92;
        }
        return this.field_L;
    }

    final static void a(byte param0, e param1, int param2, int param3) {
        try {
          int var4_int = 26 % ((param0 + 37) / 38);
          if (param1 != null) {
            param1.a(0, param2 - 32, (byte) 127, 1, param3 - 64, kg.field_r[45]);
          }
          kg.field_r[76].c(-32 + param2, -64 + param3, 128);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param1 <= param0 &&
          param0 < this.field_N.c(-16952)) {
          return this.field_N.a((byte) -68, param0);
        }
        return -1;
    }

    final int g(int param0) {
        if (param0 != 1) {
          this.field_K = 39;
        }
        return this.field_N.c(-16952);
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Terraphoenix.field_V;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param1 - param3 - this.field_M;
          var9 = this.field_p - this.field_M * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_L * var8_int / var9;
          if (param4 != 1) {
            if (2 != param4) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_N.c(-16952); var12++) {
              var13 = this.field_N.a((byte) -68, var12) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (0 <= var11) {
              this.field_N.b(var11, 122);
            }
          } else {
            this.field_N.c(0, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("wi.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Terraphoenix.field_V;
        try {
          for (var1_int = 0; 10 > var1_int; var1_int++) {
            km.field_q[var1_int] = new pg(var1_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "wi.D(" + param0 + ')');
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
    }
}
