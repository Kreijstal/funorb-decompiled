/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_a;
    static lh field_b;
    static ci field_c;
    static String field_d;

    final static int a(int param0) {
        if (param0 != 0) {
          StringBuilder var2 = (StringBuilder) null;
          rb.a('\177', (StringBuilder) null, 120, (byte) -15);
        }
        return in.field_i;
    }

    final static byte[] a(byte[] param0, byte param1, nk param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Chess.field_G;
        try {
          var4_int = param2.e(29, param3);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new byte[var4_int];
          }
          var5 = param2.e(111, 3);
          var6 = (byte)param2.e(-5, 8);
          if (param1 > -51) {
            field_b = (lh) null;
          }
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)(var6 + param2.e(-44, var5));
            }
          }
          stackIn_18_0 = (byte[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("rb.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -18067) {
          field_a = (String) null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          var4_int = param1.length();
          param1.setLength(param2);
          for (var5 = var4_int; param2 > var5; var5++) {
            param1.setCharAt(var5, param0);
          }
          var6 = -99 % ((param3 - 51) / 45);
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != 46) {
          field_b = (lh) null;
        }
        return aa.field_i;
    }

    static {
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_a = "This game has been updated! Please reload this page.";
    }
}
