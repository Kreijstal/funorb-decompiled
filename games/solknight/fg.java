/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static String field_c;
    static int field_b;
    private String field_d;
    static int field_a;
    static long field_f;
    static String field_e;

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -125) {
            stackIn_4_0 = this.field_d.equals(param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    fg(String param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, java.applet.Applet param1) {
        try {
          if (param0 < 73) {
            field_b = -54;
          }
          jd.a("jagex-last-login-method", 31536000L, param1, 1000, this.field_d);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, o[] param4, byte param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          if (param4 != null &&
            param2 > 0) {
            var6_int = param4[0].field_q;
            var7 = param4[2].field_q;
            var8 = param4[1].field_q;
            param4[0].b(param1, param0, param3);
            param4[2].b(-var7 + (param1 + param2), param0, param3);
            mi.b(ql.field_q);
            var9 = -50 / ((-22 - param5) / 56);
            mi.d(var6_int + param1, param0, -var7 + param1 + param2, param0 + param4[1].field_r);
            var10 = var6_int + param1;
            var11 = param2 + param1 - var7;
            for (param1 = var10; var11 > param1; param1 = param1 + var8) {
              param4[1].b(param1, param0, param3);
            }
            mi.a(ql.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("fg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 76 % ((param0 + 22) / 53);
        field_e = null;
        field_c = null;
    }

    static {
        field_c = "Try again";
        field_b = 0;
        field_e = "Please check if address is correct";
    }
}
