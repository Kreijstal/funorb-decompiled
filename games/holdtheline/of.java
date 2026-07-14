/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    final static boolean a(int param0) {
        if (param0 != -969) {
            return true;
        }
        if (pj.b((byte) 87)) {
            return false;
        }
        if (0 >= fc.field_a) {
            return false;
        }
        return true;
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var3 = param0;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param1.charAt(var5) != param2) {
              var5++;
              var5++;
              var5++;
              continue L0;
            } else {
              var3++;
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
