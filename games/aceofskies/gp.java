/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ag {
    int field_x;
    static String[] field_v;
    byte field_z;
    static wu[] field_y;
    static int field_w;
    rb field_u;

    final byte[] a(boolean param0) {
        if (param0) {
          if (!this.field_p) {
            if (this.field_u.field_g < -this.field_z + this.field_u.field_f.length) {
              throw new RuntimeException();
            } else {
              return this.field_u.field_f;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return (byte[]) null;
        }
    }

    public static void c(byte param0) {
        field_v = null;
        field_y = null;
        if (param0 <= 74) {
            gp.c((byte) -48);
        }
    }

    final int e(int param0) {
        if (null != this.field_u) {
          if (param0 != 21513) {
            return 115;
          } else {
            return 100 * this.field_u.field_g / (this.field_u.field_f.length + -this.field_z);
          }
        } else {
          return 0;
        }
    }

    gp() {
    }

    static {
        field_w = 480;
    }
}
