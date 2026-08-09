/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ima {
    int[] field_d;
    int[] field_a;
    int[] field_c;
    float[][] field_b;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 8) {
              L1: {
                var2_int = bma.d(ld.field_e, -1368, rja.field_e);
                if (1 == var2_int) {
                  param0 = "<img=0>" + param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-3 != (var2_int ^ -1)) {
                  break L2;
                } else {
                  param0 = "<img=1>" + param0;
                  break L2;
                }
              }
              stackIn_9_0 = (String) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ima.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(float param0, String param1, int param2) {
        try {
            if (param2 > -39) {
                String var4 = (String) null;
                ima.a(0.6509141325950623f, (String) null, 54);
            }
            cka.field_jc = param0;
            ura.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ima.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ima(int[] param0, int[] param1, int[] param2, float[][] param3) {
        try {
            this.field_b = param3;
            this.field_d = param2;
            this.field_c = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ima.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
