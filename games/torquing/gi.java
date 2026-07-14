/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static int[] field_a;
    static String field_b;
    static int field_d;
    static int field_c;

    final static void a(rm param0, byte param1, int param2) {
        int discarded$5 = param0.a(param2);
        if (param1 != 13) {
            field_d = 93;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != 78) {
          var2 = null;
          gi.a((rm) null, (byte) -88, -91);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Spikes";
        field_a = new int[8192];
    }
}
