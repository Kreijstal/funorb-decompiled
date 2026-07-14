/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends rh {
    static long field_y;
    int field_z;
    byte[] field_B;
    static int field_A;
    ak field_C;
    static int field_w;
    static int field_x;

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final int f(int param0) {
        if (((cl) this).field_m) {
            return 0;
        }
        if (param0 != 0) {
            return 72;
        }
        return 100;
    }

    final byte[] e(int param0) {
        if (param0 == 256) {
          if (((cl) this).field_m) {
            throw new RuntimeException();
          } else {
            return ((cl) this).field_B;
          }
        } else {
          int discarded$6 = ((cl) this).f(95);
          if (((cl) this).field_m) {
            throw new RuntimeException();
          } else {
            return ((cl) this).field_B;
          }
        }
    }

    cl() {
    }

    static {
    }
}
