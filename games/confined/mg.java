/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String field_c;
    static volatile int field_e;
    static int field_g;
    static pm[] field_b;
    static String field_f;
    static String field_h;
    static bc field_a;
    static String field_d;

    final static int a(CharSequence param0, byte param1) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var2 = param0.length();
        int var3 = 0;
        int var4 = -64 % ((-22 - param1) / 51);
        for (var5 = 0; var2 > var5; var5++) {
            var3 = f.a(param0.charAt(var5), -8483) + ((var3 << 1572386693) - var3);
        }
        return var3;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 > -65) {
          field_g = 27;
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Lasers";
        field_b = new pm[5];
        field_e = 0;
        field_h = "Carefully tuned to send blasts#into every corner of the tunnel,#this weapon will hit everything.";
        field_f = "This password contains your email address, and would be easy to guess";
        field_d = "Music: ";
    }
}
