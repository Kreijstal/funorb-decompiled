/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_d;
    static String field_a;
    static nf[] field_c;
    static bm[] field_b;

    final static String a(char param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        int var4Lifetime1;
        if (param2 < -105) {
          for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = param0;
          }
          return new String(var6);
        }
        qd.a(12, -41, -37, -115, false, -55, -83);
        for (var4Lifetime1 = 0; param1 > var4Lifetime1; var4Lifetime1++) {
          var6[var4Lifetime1] = param0;
        }
        return new String(var6);
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 >= -98) {
          field_a = (String) null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (!param4) {
          qd.a('ﾏ', 69, (byte) -113);
          if (param0 < param5) {
            return false;
          }
          if (param0 >= param2 + param5) {
            return false;
          }
          if (param3 < param1) {
            return false;
          }
          if (param6 + param1 > param3) {
            return true;
          }
          return false;
        }
        if (param0 < param5) {
          return false;
        }
        if (param0 >= param2 + param5) {
          return false;
        }
        if (param3 < param1) {
          return false;
        }
        if (param6 + param1 > param3) {
          return true;
        }
        return false;
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = sc.a(param0, '_', "", 99);
          if (param2) {
            return true;
          }
          var3 = pn.a(-1, param1);
          stackIn_8_0 = (param0.indexOf(param1) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qd.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Suggested names: ";
    }
}
