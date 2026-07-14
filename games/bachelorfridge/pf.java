/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends lu {
    private int field_l;
    private static long[] field_j;
    private ko field_m;
    static String field_i;
    static lm field_n;
    static String field_k;

    pf(int param0) {
        super(param0);
    }

    final void i(byte param0) {
        ((pf) this).field_g = (7 + ((pf) this).field_l) / 8;
        if (param0 != -86) {
            ((pf) this).i((byte) 113);
        }
    }

    final void c(int param0, byte param1) {
        ((pf) this).field_g = ((pf) this).field_g + 1;
        ((pf) this).field_h[((pf) this).field_g] = (byte)(param0 + ((pf) this).field_m.b(28602));
        if (param1 <= 96) {
            ((pf) this).m(-110);
        }
    }

    pf(byte[] param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        if (param1 != 8829) {
            return;
        }
        ((pf) this).field_m = new ko(param0);
    }

    final int d(int param0, byte param1) {
        int var7 = BachelorFridge.field_y;
        int var4 = 5 / ((-10 - param1) / 54);
        int var3 = ((pf) this).field_l >> -1901421341;
        int var5 = -(7 & ((pf) this).field_l) + 8;
        ((pf) this).field_l = ((pf) this).field_l + param0;
        int var6 = 0;
        while (var5 < param0) {
            var3++;
            var6 = var6 + ((((pf) this).field_h[var3] & wj.field_n[var5]) << param0 + -var5);
            param0 = param0 - var5;
            var5 = 8;
        }
        if (var5 != param0) {
            var6 = var6 + (((pf) this).field_h[var3] >> var5 - param0 & wj.field_n[param0]);
        } else {
            var6 = var6 + (wj.field_n[var5] & ((pf) this).field_h[var3]);
        }
        return var6;
    }

    final void m(int param0) {
        ((pf) this).field_l = ((pf) this).field_g * 8;
        if (param0 != 1) {
            field_n = null;
        }
    }

    final int k(int param0) {
        if (param0 != 694) {
          ((pf) this).i((byte) -2);
          ((pf) this).field_g = ((pf) this).field_g + 1;
          return ((pf) this).field_h[((pf) this).field_g] - ((pf) this).field_m.b(28602) & 255;
        } else {
          ((pf) this).field_g = ((pf) this).field_g + 1;
          return ((pf) this).field_h[((pf) this).field_g] - ((pf) this).field_m.b(28602) & 255;
        }
    }

    public static void l(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -6199) {
            return;
        }
        field_n = null;
        field_k = null;
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var5 = 0;
        L0: while (true) {
          if (param1 <= var5) {
            if (param3 != -31908) {
              ((pf) this).field_l = -58;
              return;
            } else {
              return;
            }
          } else {
            ((pf) this).field_g = ((pf) this).field_g + 1;
            param0[param2 + var5] = (byte)(((pf) this).field_h[((pf) this).field_g] + -((pf) this).field_m.b(28602));
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_j = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            field_i = "Options";
            field_k = "Who can join";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                field_j[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> -837539199;
                  var3++;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  var3++;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
