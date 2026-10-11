/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_a;
    static String field_b;
    static int field_c;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 != -18340) {
            field_c = 105;
          }
          var4_int = param0.length();
          param0.setLength(param2);
          for (var5 = var4_int; param2 > var5; var5++) {
            param0.setCharAt(var5, param3);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gi.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -1) {
          StringBuilder var2 = (StringBuilder) null;
          gi.a((StringBuilder) null, -34, -45, '￰');
        }
    }

    final static pe a(ml param0, int param1, int param2) {
        RuntimeException var3 = null;
        pe stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 100) {
            stackIn_4_0 = tm.a(jh.a(param0, 100, param2), param1 - 172);
            return stackIn_4_0;
          }
          stackIn_2_0 = (pe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gi.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        wh var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param0 instanceof byte[]) {
            var3 = (byte[]) (param0);
            if (!param1) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = va.a(var3, 0);
            return stackIn_6_0;
          }
          if (param0 instanceof wh) {
            var4 = (wh) (param0);
            stackIn_11_0 = var4.b(94);
            return stackIn_11_0;
          }
          if (param2 < -123) {
            throw new IllegalArgumentException();
          }
          stackIn_14_0 = (byte[]) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("gi.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = true;
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
