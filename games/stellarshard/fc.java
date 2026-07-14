/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_d;
    static String field_c;
    static int field_e;
    static pf field_a;
    static String[] field_b;

    final static ek a(int param0, pf param1, int param2, boolean param3) {
        if (tl.a(param1, (byte) -5, param0, param2)) {
          if (!param3) {
            field_e = 29;
            return el.i(96);
          } else {
            return el.i(96);
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = -16 % ((0 - param0) / 44);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Invunerability";
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_e = 9;
    }
}
