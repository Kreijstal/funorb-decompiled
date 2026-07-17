/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class un {
    static en field_e;
    static String field_d;
    static byte[] field_c;
    static String[] field_b;
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 0;
    }

    final static void a(boolean param0, byte param1) {
        lg.field_w.a(0, 0, 452);
    }

    final static void a(int param0, byte param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        var5 = 91 / ((-26 - param1) / 59);
        if (!param4) {
          vd.a(param2, 0, -14561, 0, param0, param3);
          return;
        } else {
          vd.a(param2, 1, -14561, 1, param0, param3);
          return;
        }
    }

    abstract void a(byte[] param0, int param1);

    abstract byte[] b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = new byte[520];
        field_b = new String[]{null, "To start a raid, select a player from the table and <col=FF0000>left-click the 'Raid' button near the bottom of the screen</col>."};
        field_a = new String[6];
        field_e = null;
    }
}
