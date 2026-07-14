/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static sd field_c;
    private int[] field_a;
    static java.awt.Canvas field_e;
    static String field_d;
    static le[] field_b;

    final static void a(int param0, int param1) {
        int var2 = -59 % ((param1 - 43) / 50);
        nf.a(param0, (byte) 115, 0, 0);
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        gi var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if ((param3 ^ -1) >= -1) {
            var4 = param1;
            break L0;
          } else {
            var8 = new byte[param2];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                var8[var5_int] = param1[param3 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 < -40) {
            break L2;
          } else {
            ie.a(73, -111);
            break L2;
          }
        }
        var5 = new gi();
        var5.a((byte) 0);
        var5.a((long)(param2 * 8), -102, var4);
        var6 = new byte[64];
        var5.a(0, (byte) -70, var6);
        return var6;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var3 = -1 + (((ie) this).field_a.length >> 2137966913);
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((ie) this).field_a[1 + (var4 - -var4)];
          if (-1 == var5) {
            return -1;
          } else {
            if (param1 != ((ie) this).field_a[var4 + var4]) {
              var4 = var4 + 1 & var3;
              continue L1;
            } else {
              return var5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0 >= -82) {
            return;
        }
        field_c = null;
    }

    ie(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length - -(param0.length >> 342763329) >= var2) {
            var2 = var2 << 1;
        }
        ((ie) this).field_a = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((ie) this).field_a[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = -1 + var2 & param0[var3];
            while ((((ie) this).field_a[1 + (var4 + var4)] ^ -1) != 0) {
                var4 = -1 + var2 & var4 - -1;
            }
            ((ie) this).field_a[var4 + var4] = param0[var3];
            ((ie) this).field_a[1 + (var4 + var4)] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sd();
        field_d = "ON";
    }
}
