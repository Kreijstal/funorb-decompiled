/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static ik field_b;
    static int field_c;
    static bg field_e;
    static String field_d;
    static int field_a;

    public static void a(byte param0) {
        int var1 = -38 % ((-45 - param0) / 59);
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static String a(int param0, boolean param1, char param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = MinerDisturbance.field_ab;
        var6 = new char[param0];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (param0 <= var4) {
            if (param1) {
              kb.a((byte) 81);
              return new String(var3);
            } else {
              return new String(var3);
            }
          } else {
            var6[var4] = '*';
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new bg(1, 2, 2, 0);
        field_d = "Click here to collapse or expand the map.";
    }
}
