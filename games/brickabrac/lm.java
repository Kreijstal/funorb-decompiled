/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_d;
    static String field_a;
    static ta field_c;
    static jp[] field_e;
    static int field_b;
    private int[] field_f;

    final static boolean a(int param0, int param1) {
        if (param1 != 0) {
            field_e = null;
        }
        return (param0 ^ -1) <= -3 ? true : false;
    }

    final static oh a(int param0, String[] param1) {
        oh var2 = new oh(false);
        var2.field_e = param1;
        if (param0 != -2079) {
            return null;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        if (!param0) {
            lm.a(true);
        }
    }

    final static void a(int param0) {
        t.field_g = false;
        cg.field_l = false;
        bd.a(param0, true);
        ka.field_l = ej.field_P;
        ik.field_g = ej.field_P;
    }

    final static boolean a(byte param0) {
        if (param0 != -10) {
            boolean discarded$0 = lm.a((byte) 35);
        }
        return null != pe.field_o ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param1 < -68) {
            break L0;
          } else {
            lm.a(47);
            break L0;
          }
        }
        var3 = -1 + (((lm) this).field_f.length >> 1860609889);
        var4 = var3 & param0;
        L1: while (true) {
          var5 = ((lm) this).field_f[var4 + var4 - -1];
          if (-1 == var5) {
            return -1;
          } else {
            if (param0 != ((lm) this).field_f[var4 + var4]) {
              var4 = var3 & var4 + 1;
              continue L1;
            } else {
              return var5;
            }
          }
        }
    }

    lm(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -1922880351) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((lm) this).field_f = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((lm) this).field_f[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (0 != (((lm) this).field_f[var4 + (var4 - -1)] ^ -1)) {
                var4 = var4 - -1 & var2 + -1;
            }
            ((lm) this).field_f[var4 + var4] = param0[var3];
            ((lm) this).field_f[var4 + (var4 - -1)] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has entered a game.";
        field_b = 4;
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
