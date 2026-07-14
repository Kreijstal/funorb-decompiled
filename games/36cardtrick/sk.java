/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_a;
    static int[][] field_b;
    static int field_d;
    static int field_e;
    static kc field_c;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param0 <= 17) {
          field_b = (int[][]) (int[][]) null;
          var3 = param2 >> -1364724737 & -1 + param1;
          return var3 + ((param2 >>> -1789106177) + param2) % param1;
        } else {
          var3 = param2 >> -1364724737 & -1 + param1;
          return var3 + ((param2 >>> -1789106177) + param2) % param1;
        }
    }

    final static boolean a(byte param0, qk param1) {
        if (param0 != 33) {
            return false;
        }
        return param1.a((byte) 20);
    }

    public static void a(int param0) {
        field_b = (int[][]) null;
        field_c = null;
        if (param0 != -12865) {
            field_c = (kc) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static rc a(int param0, byte param1) {
        rc var2 = null;
        if (param1 != 125) {
          return (rc) null;
        } else {
          var2 = new rc();
          ue.field_b.a((qb) (Object) var2, param1 + 27237);
          fl.b(1, param0);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = 0;
        field_a = "To server list";
    }
}
