/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends rl {
    int field_B;
    kg field_A;
    static String field_y;
    byte field_z;
    static String field_D;
    static String field_C;

    final int f(byte param0) {
        byte[] discarded$7 = null;
        if (param0 == 100) {
          if (null == this.field_A) {
            return 0;
          } else {
            return this.field_A.field_n * 100 / (-this.field_z + this.field_A.field_m.length);
          }
        } else {
          discarded$7 = this.e((byte) -16);
          if (null == this.field_A) {
            return 0;
          } else {
            return this.field_A.field_n * 100 / (-this.field_z + this.field_A.field_m.length);
          }
        }
    }

    final byte[] e(byte param0) {
        if (param0 >= 82) {
          if (!this.field_v) {
            if (this.field_A.field_m.length - this.field_z > this.field_A.field_n) {
              throw new RuntimeException();
            } else {
              return this.field_A.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          this.field_A = (kg) null;
          if (!this.field_v) {
            if (this.field_A.field_m.length - this.field_z > this.field_A.field_n) {
              throw new RuntimeException();
            } else {
              return this.field_A.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        field_D = null;
        field_y = null;
        if (param0) {
            field_D = (String) null;
        }
    }

    tn() {
    }

    static {
        field_y = "To Customer Support";
        field_C = "Return to game";
        field_D = "Hold <%0> to fire your lasers";
    }
}
