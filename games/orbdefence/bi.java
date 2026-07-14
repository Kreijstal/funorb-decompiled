/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static byte[] field_c;
    static String field_a;
    static String field_b;
    static String field_d;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 72 % ((-47 - param0) / 37);
        field_a = null;
        field_d = null;
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var3 = 0;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            if (param2 < 123) {
              field_c = null;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (param0.charAt(var5) == param1) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "SPLITTO";
        field_c = new byte[520];
        field_d = "Win";
        field_b = "Go Back";
    }
}
