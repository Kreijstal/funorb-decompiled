/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private int[] field_d;
    static je field_c;
    static long field_a;
    static boolean field_b;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param0 < -74) {
            break L0;
          } else {
            ((cr) this).field_d = null;
            break L0;
          }
        }
        var3 = -1 + (((cr) this).field_d.length >> 45318817);
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((cr) this).field_d[var4 + (var4 - -1)];
          if (-1 != var5) {
            if (param1 == ((cr) this).field_d[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    cr(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> -2099014975)) {
            var2 = var2 << 1;
        }
        ((cr) this).field_d = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((cr) this).field_d[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((cr) this).field_d[1 + var4 + var4]) {
                var4 = 1 + var4 & var2 - 1;
            }
            ((cr) this).field_d[var4 + var4] = param0[var3];
            ((cr) this).field_d[var4 + (var4 - -1)] = var3;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21592) {
            field_b = true;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
            field_b = true;
        }
        return param0 > param1 ? param0 : param2 >= param1 ? param1 : param2;
    }

    static {
    }
}
