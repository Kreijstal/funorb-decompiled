/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static java.math.BigInteger field_b;
    static boolean field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 == -5006) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            bh.field_a = ag.field_c;
            if (255 == param3) {
              L2: {
                stackIn_12_0 = 90;

                if (13 <= oh.field_d) {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 0;
                  break L2;
                } else {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 1;
                  break L2;
                }
              }
              ua.field_b = pa.b(stackIn_13_0, stackIn_13_1 != 0);
              break L0;
            } else {
              if (-101 < (param3 ^ -1)) {
                ua.field_b = pg.a(param3, param1, -1);
                return;
              } else {
                if (param3 <= 105) {
                  ua.field_b = di.a(0, param2);
                  return;
                } else {
                  ua.field_b = pg.a(param3, param1, -1);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -55 / ((53 - param0) / 58);
    }

    final static t[] a(int param0, int param1, la param2, int param3) {
        RuntimeException var4 = null;
        la var5 = null;
        t[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (nd.a(param1, param2, -1, param3)) {
              L1: {
                if (param0 == 105) {
                  break L1;
                } else {
                  var5 = (la) null;
                  gk.a(-107, 81, (la) null, 37);
                  break L1;
                }
              }
              stackIn_6_0 = tb.a(true);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("gk.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_b = new java.math.BigInteger("65537");
    }
}
