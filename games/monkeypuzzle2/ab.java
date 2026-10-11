/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ka {
    static int field_d;
    private java.nio.ByteBuffer field_c;
    static int field_e;

    final static void e(int param0) {
        if (param0 != -18753) {
          field_d = 4;
        }
    }

    final byte[] d(int param0) {
        byte[] var3 = new byte[this.field_c.capacity()];
        byte[] var2 = var3;
        this.field_c.position(0);
        this.field_c.get(var3);
        if (param0 == -13913) {
          return var3;
        }
        return (byte[]) null;
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        te[] var2;
        int var3;
        int var4;
        int var5;
        te[] var6;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = ee.j(44);
        var2 = var6;
        var3 = 0;
        var4 = 105 / ((-2 - param0) / 61);
        while (var6.length > var3) {
          if (param1 == var6[var3].field_c) {
            return var6[var3];
          }
          var3++;
        }
        return null;
    }

    final static void a(int param0, int param1, le[] param2, int param3, int param4, byte param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 != null &&
            param0 > 0) {
            var6_int = param2[0].field_m;
            var7 = param2[2].field_m;
            var8 = param2[1].field_m;
            param2[0].a(param4, param3, param1);
            param2[2].a(-var7 + (param0 + param4), param3, param1);
            ge.b(si.field_u);
            ge.c(var6_int + param4, param3, param4 + param0 - var7, param2[1].field_n + param3);
            var9 = param4 + var6_int;
            var10 = -var7 + param0 + param4;
            if (param5 <= 24) {
              field_d = -36;
            }
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param2[1].a(param4, param3, param1);
            }
            ge.a(si.field_u);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ab.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1) {
        try {
          this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_c.position(0);
          int var3_int = 117 / ((11 - param0) / 42);
          this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
