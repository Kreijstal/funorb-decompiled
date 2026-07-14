/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends hg {
    static ed field_l;
    static int field_g;
    static int field_k;
    int field_h;
    int field_j;
    int field_i;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 57) {
          L0: {
            int discarded$2 = am.a((byte) 123, -70);
            var2 = 0;
            if ((param1 & 7) != 0) {
              var2 = -(param1 & 7) + 8;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = var2 + param1;
          return var3;
        } else {
          L1: {
            var2 = 0;
            if ((param1 & 7) != 0) {
              var2 = -(param1 & 7) + 8;
              break L1;
            } else {
              break L1;
            }
          }
          var3 = var2 + param1;
          return var3;
        }
    }

    am(int param0, int param1, int param2) {
        ((am) this).field_j = param2;
        ((am) this).field_h = param1;
        ((am) this).field_i = param0;
    }

    public static void a(byte param0) {
        if (param0 > -67) {
            am.a((byte) -101);
            field_l = null;
            return;
        }
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_l = new ed(540, 140);
    }
}
