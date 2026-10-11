/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    String field_g;
    static String field_c;
    boolean field_e;
    String field_b;
    static boolean field_f;
    static hj[] field_h;
    static String field_a;
    static String field_d;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ua.a((byte) 60, (char)param2, param1, "");
          var3 = hc.a(param0, (byte) -92);
          stackIn_5_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("jc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static hj[] a(int param0, int param1, gn param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            jc.a((byte) 44);
          }
          if (qg.a(param3, param1, (byte) -27, param2)) {
            return ei.a(61);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        field_d = null;
        field_a = null;
        if (param0 != 5) {
          gn var2 = (gn) null;
          jc.a(95, -8, (gn) null, 100);
        }
    }

    static {
        field_c = "You have 1 unread message!";
        field_a = "Select Vehicle to Start";
        field_d = "All";
    }
}
