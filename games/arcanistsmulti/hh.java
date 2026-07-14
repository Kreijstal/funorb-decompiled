/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hh {
    static kc field_d;
    static java.applet.Applet field_e;
    static kc field_c;
    static int[] field_b;
    static String field_a;

    abstract void a(java.awt.Component param0, byte param1);

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != 1) {
          field_d = null;
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(int param0);

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{0, 0, -1, -1, -1, -1, -1, -1, 4, 4, 0, 0, 0, 4, 0, 4, -1, -1, 0, 4, -1, -1, 1, 1, 0, 4, -1, 2, 4, 2, 0, 1, -1, -1, 1, 1, 0, 0, 1, -1, 4, -1, -1, 4, -1, -1, -1, 1, 0, 2, 4, 2, 0, -1, -1, -1, -1, -1, -1, 1, 1, -1, 0, 4, -1, 1, 0, -1, -1, 1, 1, 1, -1, -1, 0, 1, -1, 1, -1, -1, 0, 1, 1, 1, 0, 4, 0, 4, 0, 4, -1, -1, -1, -1, 0, 1, 0, -1, -1, 2, -1, 1, 0, 4, 0, 1, 1, 1, 4, 1, -1, -1, -1, 0, -1, 4, 4, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 5, 0, 0, 0, 0, 0, -1, 0, 0};
        field_a = "winning, dealing damage, healing, controlling of minions, killing players, critical hits and many others!";
    }
}
