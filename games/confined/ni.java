/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static vc field_a;
    private int[] field_b;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (((ni) this).field_b.length >> -722797439) - 1;
          if (param0 == 76) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((ni) this).field_b[var4 + (var4 - -1)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (param1 == ((ni) this).field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            ni.a(false);
        }
    }

    ni(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -405690943) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((ni) this).field_b = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((ni) this).field_b[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = var2 + -1 & param0[var3];
            while (-1 != ((ni) this).field_b[1 + var4 - -var4]) {
                var4 = var2 - 1 & 1 + var4;
            }
            ((ni) this).field_b[var4 + var4] = param0[var3];
            ((ni) this).field_b[var4 + var4 + 1] = var3;
        }
    }

    static {
    }
}
