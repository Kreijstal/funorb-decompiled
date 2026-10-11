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
        int var1 = 71 / ((param0 + 26) / 32);
        field_b = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 == 57) {
          rsa.a(param4, this.field_d, param2, -119, param1, param3);
          return;
        }
        String var7 = (String) null;
        apa.$cfr$intArgs$a$62abead39cee(-51, true, (String) null);
        rsa.a(param4, this.field_d, param2, -119, param1, param3);
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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -50) {
            field_b = (String) null;
          }
          if (param1) {
            stackIn_6_0 = bta.field_d.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = kl.field_b.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("apa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_b = "Walk into a key to pocket it, then walk into a lock to open it. You can hold only one key or other object at once. ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -50) {
            field_b = (String) null;
          }
          if (param1) {
            stackIn_6_0 = bta.field_d.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = kl.field_b.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("apa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }
}
