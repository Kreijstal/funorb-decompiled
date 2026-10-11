/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ed field_c;
    static nn field_a;
    static String field_b;

    final static boolean a(char param0, int param1) {
        if (param1 != 21654) {
          ik var3 = (ik) null;
          ml.a((ik) null, -66, (byte) -72);
          return d.a(param0, -11217);
        }
        return d.a(param0, -11217);
    }

    public static void a(int param0) {
        if (param0 >= -112) {
          return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static ce a(int param0, mf param1, ec param2, int param3, int param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        ce stackIn_5_0 = null;
        ce stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param1.a(param4, (byte) -97, param3);
          var5 = var6;
          if (var6 == null) {
            return null;
          }
          if (param0 == -15618) {
            stackIn_7_0 = new ce(new n(var6), param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ce) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("ml.B(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ik param0, int param1, byte param2) {
        try {
          vj.field_d.a(-12328, param0);
          ig.a(-75, param1, param0);
          if (param2 != 101) {
            ml.a(-42);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ml.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Password is valid";
    }
}
