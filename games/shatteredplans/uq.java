/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq extends oh {
    static int field_k;
    static qr field_j;
    static String field_n;
    static String field_l;
    static int field_i;
    static rl field_m;
    static String field_h;

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        field_j = null;
        if (param0 >= 26) {
          field_h = null;
          field_m = null;
          return;
        }
        field_i = 77;
        field_h = null;
        field_m = null;
    }

    private uq() throws Throwable {
        throw new Error();
    }

    final static boolean a(bc param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = param0.a(-1);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("uq.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static dc a(int param0, int param1, int param2, String[] param3, vr param4) {
        dc var5 = null;
        RuntimeException var5_ref = null;
        dc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -27579) {
            field_n = (String) null;
          }
          var5 = new dc(param1, param4, param0, param3);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("uq.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(gf.field_k < param2 + param0 + param3)) {
          return param3 + param0;
        }
        if (param1 > -param2 + param3) {
          return gf.field_k - param2;
        }
        return -param2 + param3;
    }

    static {
        field_l = "Status Report";
        field_n = "Close";
        field_h = "Perpetual Motion";
    }
}
