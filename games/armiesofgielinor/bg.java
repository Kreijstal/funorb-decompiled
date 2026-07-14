/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private int field_c;
    private tc field_e;
    private int field_d;
    private tc field_f;
    private tc[] field_a;
    static String field_b;

    final int a(byte param0) {
        int var3 = 0;
        tc var4 = null;
        tc var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; var3 < ((bg) this).field_c; var3++) {
            var4 = ((bg) this).field_a[var3];
            var5 = var4.field_b;
            while (var4 != var5) {
                var2++;
                var5 = var5.field_b;
            }
        }
        if (param0 < 109) {
            return 109;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        fm.field_d[4] = param1;
        if (param0 != -1) {
            bg.a(87, 95);
        }
    }

    final tc b(int param0) {
        if (param0 != 1) {
            ((bg) this).c((byte) -43);
        }
        ((bg) this).field_d = 0;
        return ((bg) this).b((byte) 85);
    }

    final tc a(int param0, long param1) {
        tc var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        tc var4 = ((bg) this).field_a[(int)((long)(((bg) this).field_c + -1) & param1)];
        ((bg) this).field_e = var4.field_b;
        if (param0 > -8) {
            bg.a(-7);
        }
        while (var4 != ((bg) this).field_e) {
            if (!((param1 ^ -1L) != (((bg) this).field_e.field_i ^ -1L))) {
                var5 = ((bg) this).field_e;
                ((bg) this).field_e = ((bg) this).field_e.field_b;
                return var5;
            }
            ((bg) this).field_e = ((bg) this).field_e.field_b;
        }
        ((bg) this).field_e = null;
        return null;
    }

    final void c(byte param0) {
        int var2 = 0;
        tc var3_ref_tc = null;
        int var3 = 0;
        tc var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((bg) this).field_c) {
            var3 = -28 / ((param0 - -43) / 39);
            ((bg) this).field_f = null;
            ((bg) this).field_e = null;
            return;
          } else {
            var3_ref_tc = ((bg) this).field_a[var2];
            L1: while (true) {
              var4 = var3_ref_tc.field_b;
              if (var3_ref_tc != var4) {
                var4.d(-111);
                continue L1;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    bg(int param0) {
        int var2 = 0;
        tc var3 = null;
        ((bg) this).field_d = 0;
        ((bg) this).field_a = new tc[param0];
        ((bg) this).field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new tc();
            ((bg) this).field_a[var2] = new tc();
            var3.field_b = var3;
            var3.field_j = var3;
        }
    }

    final tc b(byte param0) {
        tc var2 = null;
        tc var4 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= 45) {
            int discarded$0 = ((bg) this).a((byte) 90);
        }
        if (0 < ((bg) this).field_d) {
            if (!(((bg) this).field_f == ((bg) this).field_a[((bg) this).field_d - 1])) {
                var2 = ((bg) this).field_f;
                ((bg) this).field_f = var2.field_b;
                return var2;
            }
        }
        do {
            if (((bg) this).field_c <= ((bg) this).field_d) {
                return null;
            }
            ((bg) this).field_d = ((bg) this).field_d + 1;
            var4 = ((bg) this).field_a[((bg) this).field_d].field_b;
            var2 = var4;
        } while (var4 == ((bg) this).field_a[((bg) this).field_d - 1]);
        ((bg) this).field_f = var2.field_b;
        return var2;
    }

    public static void a(int param0) {
        if (param0 >= -2) {
            bg.a(-78);
        }
        field_b = null;
    }

    final void a(tc param0, long param1, int param2) {
        if (!(null == param0.field_j)) {
            param0.d(-128);
        }
        if (param2 < 14) {
            ((bg) this).field_e = null;
        }
        tc var5 = ((bg) this).field_a[(int)((long)(-1 + ((bg) this).field_c) & param1)];
        param0.field_b = var5;
        param0.field_j = var5.field_j;
        param0.field_j.field_b = param0;
        param0.field_i = param1;
        param0.field_b.field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
    }
}
