/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ng field_c;
    static String field_d;
    static String field_a;
    static lb field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -43) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (wc.field_a <= 32) {
          ah.a((byte) -102, 0);
          if (SolKnight.field_L) {
            L0: {
              var1 = wc.field_a % 32;
              if (var1 == 0) {
                var1 = 32;
                break L0;
              } else {
                break L0;
              }
            }
            ah.a((byte) -68, -var1 + wc.field_a);
            var1 = 57 % ((param0 - -18) / 58);
            return;
          } else {
            var1 = 57 % ((param0 - -18) / 58);
            return;
          }
        } else {
          L1: {
            var1 = wc.field_a % 32;
            if (var1 == 0) {
              var1 = 32;
              break L1;
            } else {
              break L1;
            }
          }
          ah.a((byte) -68, -var1 + wc.field_a);
          var1 = 57 % ((param0 - -18) / 58);
          return;
        }
    }

    static {
        field_d = "That name is not available";
        field_a = "Connection restored.";
        field_c = new ng();
    }
}
