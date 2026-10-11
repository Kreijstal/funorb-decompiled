/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends wm {
    static String field_p;
    static ji field_t;
    static String field_s;
    static String field_r;
    static boolean field_q;

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        if (param0 == 9369) {
          field_t = null;
          field_s = null;
          return;
        }
        ii.e(6);
        field_t = null;
        field_s = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11) {
            var4 = (String) null;
            this.b((String) null, (byte) -35);
          }
          if (this.b(param0, (byte) -40) != vm.field_u) {
            return li.field_a;
          }
          stackIn_5_0 = ng.field_e;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ii.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final tb b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        tb stackIn_6_0 = null;
        tb stackIn_9_0 = null;
        tb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != client.a(param0, -12828)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_6_0 = vm.field_u;
            return stackIn_6_0;
          }
          if (param1 == -40) {
            stackIn_11_0 = dc.field_b;
            return stackIn_11_0;
          }
          stackIn_9_0 = (tb) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ii.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    ii(rk param0) {
        super(param0);
    }

    static {
        field_p = "Eliminate Score: ";
        field_s = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_r = "<%0> is not on your ignore list.";
    }
}
