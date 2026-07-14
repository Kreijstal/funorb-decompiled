/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut {
    static int field_a;
    static pa field_c;
    static String field_b;

    public static void a(byte param0) {
        if (param0 <= 104) {
            field_c = (pa) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == -96) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) <= -1) {
              var9 = param2;
              var5 = var9;
              var6 = param4;
              var7 = param3;
              var9[var6] = var7 + (pg.a(var9[var6], 16711422) >> -646806271);
              param4++;
              param0--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This game has been updated! Please reload this page.";
    }
}
