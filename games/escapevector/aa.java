/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static String field_b;
    static int field_a;

    final static boolean a(byte param0) {
        int var1 = 116 / ((16 - param0) / 34);
        if (10 > ff.field_e) {
          return false;
        }
        if (fc.field_a >= 13) {
          return true;
        }
        return false;
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          var2_int = param1.charAt(0);
          for (var3 = param0; param1.length() > var3; var3++) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("aa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != -96) {
          String var2 = (String) null;
          aa.a(-12, (String) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
