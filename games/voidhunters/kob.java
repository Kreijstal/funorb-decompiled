/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kob extends ksa {
    byte[] field_f;
    static String field_e;
    boolean field_d;

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = 128 + (eu.a(kdb.field_o * 128 % 8192, 107) * 127 >> 16);
        var5 = var5 / 4;
        var6 = 16711680 | var5 << 8 | var5;
        if (!li.field_i) {
          uv.a(119, -2 + param4, 4 + (param2 - param3), param3 + -2, 16711680, param1 - param4 - -4);
          uv.a(118, param4 - 1, 2 + (-param3 + param2), param3 - 1, 16755370, param1 + (-param4 - -2));
          uv.a(108, param4, param2 - param3, param3, 16764108, -param4 + param1);
          return;
        } else {
          wk.a(4.0f, (float)param3, var6, 255, (float)ip.field_p.width, -1520350600, (float)param3, 0.0f);
          wk.a(4.0f, (float)param2, var6, 255, (float)ip.field_p.width, -1520350600, (float)param2, 0.0f);
          wk.a(4.0f, 0.0f, var6, 255, (float)param4, -1520350600, (float)ip.field_p.height, (float)param4);
          wk.a(4.0f, 0.0f, var6, 255, (float)param1, -1520350600, (float)ip.field_p.height, (float)param1);
          return;
        }
    }

    public static void a() {
        field_e = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param0 & 7) == 0)) {
            var2 = 8 + -(param0 & 7);
        }
        int var3 = param0 + var2;
        return var3;
    }

    kob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
