/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int[] field_d;
    static om[] field_a;
    static String[][] field_b;
    static String field_c;

    public static void a(int param0) {
        CharSequence var2;
        field_b = (String[][]) null;
        field_d = null;
        field_c = null;
        if (param0 < 23) {
          var2 = (CharSequence) null;
          mc.a(-23, (CharSequence) null, 81);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 12) {
                break L1;
              } else {
                mc.a(77, false);
                break L1;
              }
            }
            stackIn_3_0 = gl.a(true, param2, (byte) -107, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            field_a = (om[]) null;
            fj.field_o.a(param1, 123);
            return;
        }
        fj.field_o.a(param1, 123);
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_d = new int[256];
            field_a = null;
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_c = "This password is part of your Player Name, and would be easy to guess";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    field_d[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (var0 & 1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> 550483681;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
