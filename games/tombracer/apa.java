/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class apa {
    static long field_a;
    static String field_b;
    private iu[] field_d;
    static ada field_c;

    public static void a(byte param0) {
        field_c = null;
        int var1 = 71 / ((param0 - -26) / 32);
        field_b = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        String var7;
        if (param0 != 57) {
          var7 = (String) null;
          apa.a((byte) -51, true, (String) null);
          rsa.a(param4, this.field_d, param2, -119, param1, param3);
          return;
        } else {
          rsa.a(param4, this.field_d, param2, -119, param1, param3);
          return;
        }
    }

    private apa() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -50) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (param1) {
              stackIn_6_0 = bta.field_d.b(param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = kl.field_b.b(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("apa.A(").append(param0).append(',').append(param1).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_b = "Walk into a key to pocket it, then walk into a lock to open it. You can hold only one key or other object at once. ";
    }
}
