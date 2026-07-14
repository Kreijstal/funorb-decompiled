/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int[] field_a;
    static m field_b;
    static String field_d;
    static fc field_c;

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        if (param1 != 26) {
            field_b = null;
        }
        int var2 = 255 & param0;
        if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (!(160 <= var2)) {
                var3 = ne.field_d[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 == -20075) {
          var3 = (((el) this).field_a.length >> -592355999) + -1;
          var4 = param1 & var3;
          L0: while (true) {
            var5 = ((el) this).field_a[1 + (var4 + var4)];
            if (0 == (var5 ^ -1)) {
              return -1;
            } else {
              if (param1 == ((el) this).field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            }
          }
        } else {
          return -42;
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (null == jc.field_b) {
                break L1;
              } else {
                if (!uf.field_m.b(param0 ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static db[] a(int param0, db param1) {
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = Lexicominos.field_L ? 1 : 0;
        db[] var9 = new db[32];
        db[] var2 = var9;
        var9[param0] = param1;
        for (var3 = 1; -33 < (var3 ^ -1); var3++) {
            var4 = var3 + -32;
            var5 = (double)var4 * 3.141592653589793 / 64.0;
            var7 = (int)(1.0 + Math.abs(Math.sin(var5)) * (double)param1.field_u + Math.abs(Math.cos(var5)) * (double)param1.field_p);
            var9[var3] = new db(var7, var7);
            var9[var3].b();
            param1.a(8 * param1.field_p, 8 * param1.field_u, var7 * 8, 8 * var7, var4 * 16384 / 32, 4096);
            var9[var3].h();
        }
        return var2;
    }

    el(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length + (param0.length >> 365017185) >= var2) {
            var2 = var2 << 1;
        }
        ((el) this).field_a = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((el) this).field_a[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((el) this).field_a[var4 + (var4 + 1)]) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((el) this).field_a[var4 - -var4] = param0[var3];
            ((el) this).field_a[1 + (var4 + var4)] = var3;
        }
    }

    final static String b(int param0) {
        if (bk.field_c == ca.field_i) {
            return wa.field_k;
        }
        if (param0 != 1) {
            field_d = null;
        }
        return rf.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new m("");
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
