/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static aj field_b;
    static String field_a;

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        IntrusiveNode var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.next != null) {
            param2.unlink(false);
          }
          param2.next = param1.next;
          param2.previous = param1;
          param2.next.previous = param2;
          param2.previous.next = param2;
          if (param0 > 36) {
            return;
          }
          var4 = (IntrusiveNode) null;
          so.$cfr$intArgs$a$d4f67f19bfc6(-107, (IntrusiveNode) null, (IntrusiveNode) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("so.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 95) {
          so.a((byte) -62);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "<%0> increased by <%1>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$d4f67f19bfc6(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        IntrusiveNode var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.next != null) {
            param2.unlink(false);
          }
          param2.next = param1.next;
          param2.previous = param1;
          param2.next.previous = param2;
          param2.previous.next = param2;
          if (param0 > 36) {
            return;
          }
          var4 = (IntrusiveNode) null;
          so.$cfr$intArgs$a$d4f67f19bfc6(-107, (IntrusiveNode) null, (IntrusiveNode) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("so.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
