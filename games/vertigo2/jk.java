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
        String var3 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = nf.a(106, uh.field_oc, fn.field_z);
          if (1 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (param0 != 15709) {
            var3 = (String) null;
            jk.a(-43, (String) null);
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_9_0 = (String) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("jk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (jo.field_h == null) {
          jo.field_h = new int[param1];
        } else {
          if (jo.field_h.length < param1) {
            jo.field_h = new int[param1];
          }
        }
        if (param0 == 2) {
          return;
        }
        field_b = (id) null;
    }

    final static void a(int param0, byte param1, ub param2) {
        try {
          ob.field_Q.a(param2, false);
          if (param1 != 44) {
            ub var4 = (ub) null;
            jk.a(-25, (byte) -73, (ub) null);
          }
          he.a(param0, param2, param1 ^ -27055);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "jk.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 2) {
          field_c = (String) null;
        }
    }

    static {
        field_c = "Type your password again to make sure it's correct";
        field_a = "Only show lobby chat from my friends";
    }
}
