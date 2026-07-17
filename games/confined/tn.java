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
        if (param0 == 100) {
          if (null == ((tn) this).field_A) {
            return 0;
          } else {
            return ((tn) this).field_A.field_n * 100 / (-((tn) this).field_z + ((tn) this).field_A.field_m.length);
          }
        } else {
          byte[] discarded$7 = ((tn) this).e((byte) -16);
          if (null == ((tn) this).field_A) {
            return 0;
          } else {
            return ((tn) this).field_A.field_n * 100 / (-((tn) this).field_z + ((tn) this).field_A.field_m.length);
          }
        }
    }

    final byte[] e(byte param0) {
        if (param0 >= 82) {
          if (!((tn) this).field_v) {
            if (((tn) this).field_A.field_m.length - ((tn) this).field_z > ((tn) this).field_A.field_n) {
              throw new RuntimeException();
            } else {
              return ((tn) this).field_A.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          ((tn) this).field_A = null;
          if (!((tn) this).field_v) {
            if (((tn) this).field_A.field_m.length - ((tn) this).field_z > ((tn) this).field_A.field_n) {
              throw new RuntimeException();
            } else {
              return ((tn) this).field_A.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    public static void c() {
        field_C = null;
        field_D = null;
        field_y = null;
    }

    tn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "To Customer Support";
        field_C = "Return to game";
        field_D = "Hold <%0> to fire your lasers";
    }
}
