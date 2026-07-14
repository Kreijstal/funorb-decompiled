/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static boolean field_d;
    static int field_e;
    static boolean field_b;
    static String field_a;
    static String field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        L0: while (true) {
          param1--;
          if ((param1 ^ -1) > -1) {
            if (param4 != -1) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            var9 = param0;
            var5 = var9;
            var6 = param3;
            var7 = param2;
            var9[var6] = var7 + (ik.a(var9[var6], 16711422) >> 780224673);
            param3++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -1) {
          field_d = false;
          mf.field_f.a(0, 0, param1 + 1);
          return;
        } else {
          mf.field_f.a(0, 0, param1 + 1);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 62) {
            field_e = 120;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Quit to website";
        field_c = "Password: ";
    }
}
