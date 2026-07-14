/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends rw {
    byte[] field_x;
    static int[] field_A;
    int field_y;
    wl field_w;
    static int[] field_z;
    static int field_B;
    static int field_v;

    final byte[] d(boolean param0) {
        if (!param0) {
          if (((ql) this).field_u) {
            throw new RuntimeException();
          } else {
            return ((ql) this).field_x;
          }
        } else {
          byte[] discarded$6 = ((ql) this).d(false);
          if (((ql) this).field_u) {
            throw new RuntimeException();
          } else {
            return ((ql) this).field_x;
          }
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            return -28;
        }
        if (((ql) this).field_u) {
            return 0;
        }
        return 100;
    }

    public static void d(byte param0) {
        if (param0 < 32) {
            field_B = 49;
            field_z = null;
            field_A = null;
            return;
        }
        field_z = null;
        field_A = null;
    }

    ql() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[25];
        field_z = new int[25];
        la.a(field_z, 0, 25, 2147483647);
        la.a(field_A, 0, 25, -1);
    }
}
