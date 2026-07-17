/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
    }

    final static sm a(byte param0) {
        sm var1 = new sm(fm.field_E, rh.field_d, fj.field_o[0], na.field_G[0], vo.field_b[0], ij.field_o[0], pn.field_b[0], cq.field_y);
        go.b(0);
        return var1;
    }

    final static void a(int param0, byte param1) {
        if (param1 >= 9) {
          if (param0 != 50) {
            throw new IllegalArgumentException();
          } else {
            return;
          }
        } else {
          field_a = null;
          if (param0 != 50) {
            throw new IllegalArgumentException();
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
