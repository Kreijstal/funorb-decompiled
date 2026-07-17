/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c {
    static String field_e;
    int field_f;
    int[] field_g;
    int field_b;
    static java.awt.Canvas field_h;
    static od field_d;
    static String field_c;
    java.awt.Image field_a;

    abstract void a(byte param0, java.awt.Component param1, int param2, int param3);

    abstract void a(int param0, boolean param1, java.awt.Graphics param2, int param3);

    final void a(boolean param0) {
        if (!param0) {
          field_h = null;
          gf.a(((c) this).field_g, ((c) this).field_b, ((c) this).field_f);
          return;
        } else {
          gf.a(((c) this).field_g, ((c) this).field_b, ((c) this).field_f);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param3 < 26) {
            return;
        }
        vd.a(param1, 0, -14561, 0, param0, param2);
    }

    public static void a(int param0) {
        field_h = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Dragons of Renown";
        field_c = "Raider snuck past guardian and disarmed it.";
        field_d = new od();
    }
}
