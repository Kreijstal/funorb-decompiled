/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends java.awt.Canvas {
    static int[] field_c;
    private java.awt.Component field_b;
    static volatile int field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((th) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "th.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        int var1 = 0;
        field_c = null;
    }

    th(java.awt.Component param0) {
        try {
            ((th) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, tg[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var6_int = -120;
              if (param3 == null) {
                break L1;
              } else {
                if (param5 > 0) {
                  var7 = param3[0].field_t;
                  var8 = param3[2].field_t;
                  var9 = param3[1].field_t;
                  param3[0].b(param4, param2, param0);
                  param3[2].b(-var8 + param5 + param4, param2, param0);
                  na.b(hh.field_h);
                  na.c(var7 + param4, param2, param4 + param5 - var8, param3[1].field_o + param2);
                  var10 = param4 + var7;
                  var11 = param5 + (param4 + -var8);
                  param4 = var10;
                  L2: while (true) {
                    if (var11 <= param4) {
                      na.a(hh.field_h);
                      break L0;
                    } else {
                      param3[1].b(param4, param2, param0);
                      param4 = param4 + var9;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("th.A(").append(param0).append(',').append(99).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((th) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "th.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
