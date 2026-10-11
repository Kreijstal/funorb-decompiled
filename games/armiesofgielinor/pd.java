/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int[] field_a;
    static int[] field_g;
    static String field_b;
    static je field_c;
    static int field_e;
    static js field_d;
    static String field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 >= 37) {
          field_g = null;
          return;
        }
        field_c = (je) null;
        field_g = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 + param3 + param2 <= qn.field_g) {
          return param3 + param2;
        }
        if (param2 - param0 >= param1) {
          return -param0 + param2;
        }
        return -param0 + qn.field_g;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() >= eb.field_b) {
            if (param0.length() > db.field_g) {
              return true;
            }
            if (param1 != 0) {
              field_g = (int[]) null;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("pd.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, vh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -123 % ((-11 - param3) / 50);
          if (0 == param0 &&
            param1 == 0) {
            param2.b(true, 0);
            return;
          }
          var5 = param0 & 255;
          var6 = param1 & 255;
          param2.b(true, var6 | var5 << 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("pd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_g = new int[4];
        field_f = "Close";
    }
}
