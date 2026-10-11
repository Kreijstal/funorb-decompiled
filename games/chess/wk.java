/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static byte[] field_e;
    static String field_a;
    static String field_h;
    static km field_g;
    static ci field_f;
    static ci field_c;
    static int field_b;
    static int[] field_d;

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_h = null;
        if (param0 != -26815) {
          wk.a((byte) 122);
        }
    }

    final static km a(um param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        km stackIn_2_0 = null;
        km stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param3, 0);
          var5 = param0.a(param2, 7, var4_int);
          if (param1 == 1) {
            stackIn_4_0 = li.a(var5, (byte) -2, param0, var4_int);
            return stackIn_4_0;
          }
          stackIn_2_0 = (km) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= 116) {
          return null != jj.field_f ? true : false;
        }
        field_d = (int[]) null;
        return null != jj.field_f ? true : false;
    }

    static {
        field_a = "Type your password again to make sure it's correct";
        field_b = 1;
        field_h = "<%0> would need a rating of <%1> to play with the current options.";
        field_d = new int[8192];
    }
}
