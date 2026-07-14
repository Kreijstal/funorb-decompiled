/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static String field_b;
    static int field_a;

    final static boolean a(byte param0) {
        int var1 = 0;
        var1 = 116 / ((16 - param0) / 34);
        if (10 <= ff.field_e) {
          if (fc.field_a < 13) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        var2 = param1.charAt(0);
        var3 = param0;
        L0: while (true) {
          if (param1.length() > var3) {
            if (param1.charAt(var3) != var2) {
              return false;
            } else {
              var3++;
              continue L0;
            }
          } else {
            return true;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -96) {
            Object var2 = null;
            boolean discarded$0 = aa.a(-12, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
