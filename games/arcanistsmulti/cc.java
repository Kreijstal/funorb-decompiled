/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static vn field_e;
    private static jm field_f;
    static String field_b;
    static kc field_a;
    static boolean[] field_d;
    static String field_c;

    final static jm b(byte param0) {
        int var1 = 1;
        if (!(field_f != null)) {
            field_f = new jm(vc.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, vc.field_e.field_C, -1, 2147483647, true);
        }
        return field_f;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 <= -86) {
          if (param1 >= param0) {
            return tk.a(-4, (param0 << 16) / param1);
          } else {
            return -tk.a(-4, (param1 << 16) / param0) + 2048;
          }
        } else {
          return -113;
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 118) {
            boolean discarded$6 = cc.c((byte) 58);
            return eh.field_e != null ? true : false;
        }
        return eh.field_e != null ? true : false;
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        field_c = null;
        field_e = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Pressing '<col=ffffff><%0></col>' or '<col=ffffff><%2></col>' causes the currently selected unit to leap forwards. This allows you to jump over small gaps.<br>Pressing '<col=ffffff><%1></col>' or '<col=ffffff><%3></col>' causes the currently selected unit to perform a high jump upwards. This can be useful for scaling steep cliffs.<br>These keys also serve to make flying units fly up or down, as well as to make a unit dismount or an Arcanist exit from a tower.";
        field_e = new vn();
        field_d = new boolean[64];
        field_c = "Exploiting a bug";
    }
}
