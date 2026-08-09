/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static o[] field_d;
    static ae field_f;
    static o[][][] field_e;
    static te field_c;
    static float field_b;
    static o[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_e = (o[][][]) null;
        field_f = null;
        if (param0 != 0) {
            field_d = (o[]) null;
        }
        field_c = null;
    }

    final static int a(char param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            if (param2 == 75) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  stackIn_11_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param1.charAt(var5) == param0) {
                      var3_int++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -33;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ok.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void a(String param0, float param1, int param2) {
        try {
            dg.field_a = param0;
            if (param2 != 0) {
                field_a = (o[]) null;
            }
            field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ok.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new o[3];
        field_f = new ae();
    }
}
