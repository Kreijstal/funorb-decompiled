/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_f;
    static int field_b;
    static String field_e;
    static mg field_d;
    static km field_c;
    static int field_a;

    public static void a(byte param0) {
        if (param0 != 51) {
          field_b = -120;
          field_e = null;
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        var4 = -1;
        var5 = param1;
        L0: while (true) {
          if (param0 <= var5) {
            var4 = var4 ^ -1;
            if (param3 != -26459) {
              var7 = null;
              pe discarded$2 = ed.a(-79, (ml) null, 7, 111);
              return var4;
            } else {
              return var4;
            }
          } else {
            var4 = fi.field_j[(var4 ^ param2[var5]) & 255] ^ var4 >>> -629134904;
            var5++;
            continue L0;
          }
        }
    }

    final static pe a(int param0, ml param1, int param2, int param3) {
        if (param2 != -629134904) {
            return null;
        }
        return tm.a(jh.a(param1, 100, param3, param0), 105);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You need to play 1 more rated game to unlock this option.";
        field_a = 50;
        field_e = "Year";
    }
}
