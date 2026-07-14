/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_a;
    ah[] field_b;

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((wc) this).field_b.length) {
            return var2;
          } else {
            if (((wc) this).field_b[var3] != null) {
              var2++;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(ki param0, int param1) {
        if (param1 < 25) {
            return false;
        }
        return param0.a(true);
    }

    wc(ah[] param0, int param1, boolean param2) {
        ((wc) this).field_a = param1;
        ((wc) this).field_b = param0;
    }

    static {
    }
}
