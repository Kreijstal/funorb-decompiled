/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends bca {
    static ht field_r;
    static int[] field_q;

    ju(int param0, nq param1) {
        super(param0, param1);
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 != -67) {
            return;
        }
        field_r = null;
    }

    final void a(op param0, int param1) {
        int var3 = 4 / ((param1 - 12) / 35);
        ((ju) this).a(param0, (byte) -2);
    }

    ju(lu param0) {
        super(param0);
        ((ju) this).field_k = param0.e((byte) 53);
        ((ju) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((ju) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final int[][] d(byte param0) {
        int[][] var2 = null;
        Object var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        if (param0 != 27) {
          var3 = null;
          at discarded$1 = ((ju) this).a(-99, (gj) null);
          var7 = new int[17][17];
          var5 = var7;
          var4 = var5;
          var2 = var4;
          var7[7][9] = 1;
          var7[7][8] = 1;
          var7[7][7] = 1;
          var7[8][7] = 1;
          var7[8][9] = 1;
          var7[9][7] = 1;
          var7[9][9] = 1;
          var7[9][8] = 1;
          return var2;
        } else {
          var8 = new int[17][17];
          var6 = var8;
          var4 = var6;
          var2 = var4;
          var8[7][9] = 1;
          var8[7][8] = 1;
          var8[7][7] = 1;
          var8[8][7] = 1;
          var8[8][9] = 1;
          var8[9][7] = 1;
          var8[9][9] = 1;
          var8[9][8] = 1;
          return var2;
        }
    }

    final static boolean c(int param0, int param1) {
        if (param1 != -23) {
          if (-22 == param1) {
            return false;
          } else {
            if (param1 != 28) {
              if (39 != param1) {
                if (-37 != (param1 ^ -1)) {
                  if (param0 != 23745) {
                    ju.e((byte) -97);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
          boolean discarded$2 = ju.c(17, -17);
          return (at) (Object) new kla(param1, (ju) this);
        } else {
          return (at) (Object) new kla(param1, (ju) this);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[]{6500, 5000, 3500, 2750, 2000};
    }
}
