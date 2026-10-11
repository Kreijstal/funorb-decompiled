/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static gq field_b;
    static String field_c;
    static String field_d;
    static ut field_a;

    final static void a(int param0, sp param1) {
        if (param0 != 6022) {
          return;
        }
        try {
          np.field_Jb.a(new ce(param1), 3);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 7 % ((param0 - 2) / 37);
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -41) {
          field_c = (String) null;
          if (param1 == 32) {
            return true;
          }
          if (param1 != 40) {
            return param1 == 41 ? true : false;
          }
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 40) {
          return true;
        }
        if (param1 != 41) {
          return false;
        }
        return true;
    }

    final static vn a(int param0, int param1, int param2, up param3, int param4, boolean param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param3.field_q;
          if (param0 <= 90) {
            stackIn_2_0 = (vn) null;
            return stackIn_2_0;
          }
          var7 = param3.field_j;
          var8 = (4045 & var7) >> 8;
          var9 = (246 & var7) >> 4;
          var10 = (15 & var7) >> 0;
          var11 = fp.a(param4, param2, var8, var6_int, var9, var10, param1, false, false, param5);
          stackIn_4_0 = var11;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("pi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_c = "Loading park";
        field_d = "The league system is currently unavailable .";
    }
}
