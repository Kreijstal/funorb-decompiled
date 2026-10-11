/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends java.awt.Canvas {
    static int[] field_c;
    private java.awt.Component field_b;
    static volatile int field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "th.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 23 % ((param0 - 3) / 56);
        field_c = null;
    }

    th(java.awt.Component param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, tg[] param3, int param4, int param5) {
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
        var12 = Bounce.field_N;
        try {
          var6_int = 120 / ((33 - param1) / 59);
          if (param3 != null &&
            param5 > 0) {
            var7 = param3[0].field_t;
            var8 = param3[2].field_t;
            var9 = param3[1].field_t;
            param3[0].b(param4, param2, param0);
            param3[2].b(-var8 + param5 + param4, param2, param0);
            na.b(hh.field_h);
            na.c(var7 + param4, param2, param4 + param5 - var8, param3[1].field_o + param2);
            var10 = param4 + var7;
            var11 = param5 + (param4 - var8);
            for (param4 = var10; var11 > param4; param4 = param4 + var9) {
              param3[1].b(param4, param2, param0);
            }
            na.a(hh.field_h);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("th.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "th.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = -1;
    }
}
