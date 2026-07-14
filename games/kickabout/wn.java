/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    boolean field_g;
    int field_e;
    String field_d;
    static ic field_b;
    boolean field_c;
    String[] field_f;
    static String field_i;
    static ut field_j;
    static String field_h;
    static ut[] field_a;

    final static boolean a(byte param0) {
        int var1 = 0;
        var1 = -55 / ((-40 - param0) / 36);
        if (be.e((byte) 127)) {
          if (!f.field_c) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_a = null;
        field_b = null;
        field_i = null;
        field_j = null;
    }

    final static int a(char param0, int param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = 0;
        var4 = param2.length();
        var5 = param1;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param0 == param2.charAt(var5)) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    wn(boolean param0) {
        ((wn) this).field_g = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ic();
        field_h = "Tournament Game";
    }
}
