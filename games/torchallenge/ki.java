/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static nc field_d;
    static hb field_b;
    static int[] field_e;
    static boolean[] field_a;
    static String field_c;

    final static void a(eh param0, int param1, int param2) {
        try {
          nh.field_cb.a(param0, -66);
          sa.a((byte) 18, param1, param0);
          if (param2 != 160) {
            field_b = (hb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ki.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
          return;
        }
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0) {
        if (!vc.a(0)) {
          return;
        }
        gj.a(-1, 4, false);
        if (param0 != 116) {
          ki.a(76);
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        eh var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -18) {
            var4 = (eh) null;
            ki.a((eh) null, -37, 108);
          }
          if (param1) {
            stackIn_6_0 = ec.field_c.a(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = pf.field_c.a(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ki.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_e = new int[]{64, 96, 96, 64, 96, 96, 64, 96, 64, 160};
        field_d = null;
        field_a = new boolean[64];
        field_b = new hb("");
        field_c = "This entry doesn't match";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        eh var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -18) {
            var4 = (eh) null;
            ki.a((eh) null, -37, 108);
          }
          if (param1) {
            stackIn_6_0 = ec.field_c.a(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = pf.field_c.a(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ki.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }
}
