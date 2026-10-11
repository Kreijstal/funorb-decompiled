/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ac extends wp {
    static String field_F;
    private pk field_E;

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 61) {
            stackIn_4_0 = this.field_E.a(param0, (byte) 61);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ac.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(boolean param0) {
        if (param0) {
          ac.d(true);
          field_F = null;
          return;
        }
        field_F = null;
    }

    ac(pk param0) {
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ac.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
