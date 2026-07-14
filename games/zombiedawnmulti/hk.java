/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int[] field_f;
    int[] field_b;
    int[] field_d;
    static boolean field_a;
    static String field_g;
    int[] field_c;
    static int field_e;

    final void a(int param0, k param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 0;
        if (param0 != 7054) {
          ((hk) this).field_d = null;
          L0: while (true) {
            if (((hk) this).field_b.length > var3) {
              ((hk) this).field_b[var3] = param1.d((byte) 69);
              var3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (((hk) this).field_b.length > var3) {
              ((hk) this).field_b[var3] = param1.d((byte) 69);
              var3++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    hk() {
        ((hk) this).field_b = new int[5];
        ((hk) this).field_c = new int[3];
        ((hk) this).field_d = new int[5];
        ((hk) this).field_f = new int[5];
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 == 39) {
            return;
        }
        hk.a((byte) -21);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Service unavailable";
    }
}
