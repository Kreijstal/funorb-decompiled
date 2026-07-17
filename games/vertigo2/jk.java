/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_c;
    static id field_b;
    static String field_a;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var2_int = nf.a(106, uh.field_oc, fn.field_z);
              if (1 == var2_int) {
                param1 = "<img=0>" + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 15709) {
                break L2;
              } else {
                var3 = null;
                String discarded$2 = jk.a(-43, (String) null);
                break L2;
              }
            }
            L3: {
              if (var2_int == 2) {
                param1 = "<img=1>" + param1;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_8_0 = (String) param1;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("jk.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1) {
        if (jo.field_h != null) {
          if (jo.field_h.length < param1) {
            jo.field_h = new int[param1];
            return;
          } else {
            return;
          }
        } else {
          jo.field_h = new int[param1];
          return;
        }
    }

    final static void a(int param0, byte param1, ub param2) {
        try {
            ob.field_Q.a((li) (Object) param2, false);
            if (param1 != 44) {
                Object var4 = null;
                jk.a(-25, (byte) -73, (ub) null);
            }
            he.a(param0, param2, param1 ^ -27055);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "jk.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your password again to make sure it's correct";
        field_a = "Only show lobby chat from my friends";
    }
}
