/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static he[] field_c;
    static int field_a;
    static String field_d;
    static he[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 != 13302) {
          pc.a(-19);
        }
    }

    final static void a(int param0, String param1, String param2) {
        try {
          qg.a(false, param1, param2, (byte) -11);
          if (param0 > -39) {
            field_b = (he[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "pc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 >= -114) {
            field_b = (he[]) null;
          }
          param1 = ph.a(param1, (byte) 123, '_', "");
          var3 = vj.a(param1, -113);
          stackIn_7_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_b = new he[3];
        field_d = null;
    }
}
