/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static cc field_c;
    static de field_b;
    static int[] field_a;

    final static void b(byte param0) {
        if (g.j(7)) {
          if (ec.field_f < 2) {
            return;
          } else {
            qa.field_b.b(bg.a((byte) -124, (CharSequence[]) (Object) new String[2]), 20, 60, 16711680, -1);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new cc();
        field_a = new int[4];
        field_b = new de(4, 1, 1, 1);
    }
}
