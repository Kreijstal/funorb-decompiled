/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static tg field_a;

    final static boolean a(int param0, ii param1) {
        RuntimeException var2 = null;
        ii var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 24) {
            var3 = (ii) null;
            re.a(-18, (ii) null);
          }
          stackIn_5_0 = (1 == param1.f(7, 1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("re.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0, ke param1, int param2) {
        try {
          if (param0 != 109) {
            field_a = (tg) null;
          }
          uk.field_d.a(1, param1);
          qh.a(param1, param2, -22762);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "re.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
