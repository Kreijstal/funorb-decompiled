/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ab {
    static lc field_z;
    static String field_A;
    int field_B;
    static String field_y;
    static int[] field_w;
    gd field_x;
    byte[] field_v;

    public static void i(int param0) {
        if (param0 != -7588) {
          tc.i(32);
          field_z = null;
          field_y = null;
          field_w = null;
          field_A = null;
          return;
        } else {
          field_z = null;
          field_y = null;
          field_w = null;
          field_A = null;
          return;
        }
    }

    final int f(int param0) {
        if (param0 >= 51) {
          if (((tc) this).field_s) {
            return 0;
          } else {
            return 100;
          }
        } else {
          field_A = null;
          if (((tc) this).field_s) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final byte[] a(boolean param0) {
        if (!(!((tc) this).field_s)) {
            throw new RuntimeException();
        }
        if (param0) {
            return null;
        }
        return ((tc) this).field_v;
    }

    tc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_y = "Return to game";
        field_w = new int[8192];
    }
}
