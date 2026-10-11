/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static ll field_d;
    static String field_b;
    static String field_c;
    static fd field_a;
    static String field_f;
    static go field_e;

    final static k a(int param0, gn param1, gn param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        k stackIn_5_0 = null;
        k stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qg.a(param3, param0, (byte) -27, param1)) {
            stackIn_2_0 = null;
            return (k) (stackIn_2_0);
          }
          if (param4 == 0) {
            stackIn_7_0 = fe.a(param2.a(param3, true, param0), 1092937296);
            return stackIn_7_0;
          }
          stackIn_5_0 = (k) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("um.A(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          if ((param1 <= param0 ||
            param1 >= 128) &&
            (160 > param1 ||
            param1 > 255)) {
            if (param1 == 0) {
              return false;
            }
            var6 = ja.field_Qb;
            var2 = var6;
            var3 = 0;
            while (true) {
              if (var6.length <= var3) {
                return false;
              }
              var4 = var6[var3];
              if (var4 != param1) {
                var3++;
                continue;
              }
              break;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "um.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 > 1) {
          field_f = null;
          return;
        }
        um.a(119);
        field_f = null;
    }

    static {
        field_c = "Go Back";
        field_d = new ll();
        field_a = new fd();
        field_f = "Loading sound effects";
    }
}
