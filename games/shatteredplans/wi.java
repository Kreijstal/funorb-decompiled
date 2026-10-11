/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static eh field_c;
    static String field_a;
    static String field_b;

    final static wa a(int param0, int param1, wa param2, int param3, int param4, int param5, int param6) {
        wa var7 = null;
        RuntimeException var7_ref = null;
        wa stackIn_2_0 = null;
        wa stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = qq.field_D;
          if (param6 != -3903) {
            stackIn_2_0 = (wa) null;
            return stackIn_2_0;
          }
          if (var7 != null) {
            qq.field_D = qq.field_D.field_c;
          } else {
            var7 = new wa();
            ms.field_a = ms.field_a + 1;
          }
          var7.a(param1, param5, param0, param3, param2, param4, (byte) -34);
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, v param2, int param3, v param4, int param5) {
        try {
          js.field_g = param5;
          js.field_e = param0;
          cr.field_e = param4;
          uo.field_g = param3;
          int var6_int = -121 % ((-57 - param1) / 48);
          jp.field_Cb = param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static int a(e param0, e param1, int param2) {
        RuntimeException var3 = null;
        v var4 = null;
        String var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (v) null;
            wi.a(-18, (byte) 102, (v) null, 64, (v) null, 60);
          }
          var5 = (String) null;
          stackIn_3_0 = si.a(0, 0, param0, param1, 120, (String) null, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wi.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 84) {
          wi.a((byte) -48);
        }
    }

    static {
        field_b = "Please log in as a subscribing member to access this feature.";
        field_a = "Show all lobby chat";
    }
}
