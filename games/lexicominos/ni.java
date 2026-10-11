/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_e;
    static sc field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -55) {
            field_a = (int[]) null;
          }
          stackIn_3_0 = dc.a(param1.length, param1, (byte) 16, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ni.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        String var1 = "";
        if (eb.field_b != null) {
          var1 = eb.field_b.e((byte) -74);
        }
        if (!param0) {
          if (var1.length() == 0) {
            var1 = a.a(-1);
          }
          if (var1.length() == 0) {
            var1 = ld.field_G;
          }
          return var1;
        }
        String var2 = (String) null;
        ni.a((byte) -127, (String) null, (String) null);
        if (var1.length() == 0) {
          var1 = a.a(-1);
        }
        if (var1.length() == 0) {
          var1 = ld.field_G;
        }
        return var1;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        byte[] var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ne.a('_', "", param2, (byte) -127);
          var3 = ci.a(param2, (byte) -79);
          if (param0 != 120) {
            var4 = (byte[]) null;
            ni.a((byte) -19, (byte[]) null);
          }
          stackIn_7_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ni.A(").append(param0).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 65) {
          field_a = (int[]) null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 65 % ((param0 + 77) / 47);
        il.field_c = param1;
    }

    static {
        field_b = new sc();
        field_d = "Loading music";
        field_c = "Achieved";
    }
}
